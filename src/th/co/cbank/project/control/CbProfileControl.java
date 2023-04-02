package th.co.cbank.project.control;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import th.co.cbank.util.MessageAlert;
import th.co.cbank.util.NumberFormat;
import th.co.cbank.util.ThaiUtil;

public class CbProfileControl {

    private final Logger logger = Logger.getLogger(CbProfileControl.class);

    public boolean saveLoanAllow(String custCode, double tCreditAmt, String empCode) {
        try {
            // save transaction
            String sqlTran = "insert into add_credit_limit"
                    + "(system_create,emp_code,cust_code,credit_amount) "
                    + "values(now(), '" + empCode + "', '" + custCode + "', " + tCreditAmt + " );";
            if (MySQLConnect.exeUpdate(sqlTran) > 0) {
                String sql = "update cb_profile set "
                        + "Loan_Credit_Amt = '" + tCreditAmt + "',"
                        + "Loan_Credit_Balance = '" + tCreditAmt + "' "
                        + "where p_CustCode='" + custCode + "';";
                return MySQLConnect.exeUpdate(sql) > 0;
            }
            return false;
        } catch (Exception e) {
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            logger.error(e.getMessage());
            return false;
        }
    }

    public List<Object[]> getApproveLimitMoreZero(String custCode) {
        List<Object[]> list = new ArrayList();
        try {
            String sql = "select p_custCode, p_custName,p_custsurname,ApproveLimit "
                    + "from cb_profile "
                    + "where ApproveLimit>0 "
                    + "and p_custCode<>'" + custCode + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            while (rs.next()) {
                list.add(new Object[]{
                    rs.getString("p_custCode"),
                    ThaiUtil.ASCII2Unicode(rs.getString("p_custName")),
                    ThaiUtil.ASCII2Unicode(rs.getString("p_custSurname")),
                    rs.getInt("ApproveLimit")
                });
            }
            rs.close();
        } catch (Exception e) {
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            logger.error(e.getMessage());
        }

        return list;
    }

    public List<Object[]> searchCustomerApproveLimitMoreZero(String custCode, String searchText) {
        List<Object[]> list = new ArrayList();
        try {
            String sql = "select p_custCode, p_custName,p_custsurname,ApproveLimit "
                    + "from cb_profile "
                    + "where ApproveLimit>0 "
                    + "and p_custCode<>'" + custCode + "' "
                    + "and p_custName like '%" + ThaiUtil.Unicode2ASCII(searchText) + "%'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            while (rs.next()) {
                list.add(new Object[]{
                    rs.getString("p_custCode"),
                    ThaiUtil.ASCII2Unicode(rs.getString("p_custName")),
                    ThaiUtil.ASCII2Unicode(rs.getString("p_custSurname")),
                    rs.getInt("ApproveLimit")
                });
            }

            rs.close();
        } catch (Exception e) {
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            logger.error(e.getMessage());
        }

        return list;
    }

    public List<Object[]> getProfileListOrderByCustCode() {
        List<Object[]> list = new ArrayList();
        try {
            String sql = "select p_custcode,p_custname,p_custsurname,save_balance,hoon_qty,loan_balance "
                    + "from cb_profile order by p_custcode";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            int count = 1;
            while (rs.next()) {
                list.add(new Object[]{
                    count,
                    rs.getString("p_custcode"),
                    ThaiUtil.ASCII2Unicode(rs.getString("p_custname") + " " + rs.getString("p_custsurname")),
                    NumberFormat.showDouble2(rs.getString("save_balance")),
                    NumberFormat.showDouble2(rs.getString("hoon_qty")),
                    NumberFormat.showDouble2(rs.getString("loan_balance"))
                });
                count++;
            }

            rs.close();
        } catch (Exception e) {
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            logger.error(e.getMessage());
        }

        return list;
    }

    public boolean updateCancelStatus(String custCode) {
        try {
            String sql = "update cb_profile set "
                    + "status='Cancel' "
                    + "where p_custCode='" + custCode + "'";
            return MySQLConnect.exeUpdate(sql) > 0;
        } catch (Exception e) {
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            logger.error(e.getMessage());
        }
        return false;
    }
}
