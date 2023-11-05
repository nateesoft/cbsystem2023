package th.co.cbank.project.control;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.model.CbLoanConfigBean;
import th.co.cbank.util.MessageAlert;

public class CbLoanConfigControl extends BaseControl {

    private final Logger logger = Logger.getLogger(CbLoanConfigControl.class);

    public int getMaxInt(String LoanCode) {
        int maxNo = 1;
        try {
            String sql = "select max(BookNo) MAX_NO from cb_loan_config where LoanCode='" + LoanCode + "';";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                maxNo = rs.getInt("MAX_NO");
                if (maxNo == 0) {
                    String sqlUpd = "update cb_loan_config set BookNo='1' where LoanCode='" + LoanCode + "'";
                    update(sqlUpd);
                }
            }

            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        if (maxNo == 0) {
            maxNo = 1;
        }

        return maxNo;
    }

    public List<CbLoanConfigBean> mappingBean(ResultSet rs) throws Exception {
        List<CbLoanConfigBean> listBean = new ArrayList<>();
        while (rs.next()) {
            CbLoanConfigBean bean = new CbLoanConfigBean();
            bean.setLoanCode(rs.getString("LoanCode"));
            bean.setLoanName(ThaiUtil.ASCII2Unicode(rs.getString("LoanName")));
            bean.setLoanINT(rs.getDouble("LoanINT"));
            bean.setLoanFee(rs.getDouble("LoanFee"));
            bean.setLoanPenaltyINT(rs.getDouble("LoanPenaltyINT"));
            bean.setLoanPenaltyDay(rs.getInt("LoanPenaltyDay"));
            bean.setLoanMinAmount(rs.getDouble("LoanMinAmount"));
            bean.setIntFixed(rs.getString("IntFixed"));
            bean.setIntBadDebt(rs.getDouble("IntBadDebt"));
            bean.setIntTurnover(rs.getDouble("IntTurnover"));
            bean.setIntNormal(rs.getDouble("IntNormal"));
            bean.setChkPIntCapital(rs.getString("ChkPIntCapital"));
            bean.setChkPIntTable(rs.getString("ChkPIntTable"));
            bean.setLoanPerMonth(rs.getInt("LoanPerMonth"));
            bean.setLoanRunning(rs.getInt("LoanRunning"));
            bean.setBookNo(rs.getInt("BookNo"));
            bean.setCheckMinPayment(rs.getString("checkMinPayment"));
            bean.setMinPaymentPercent(rs.getInt("MinPayPercent"));
            bean.setMinPaymentBaht(rs.getDouble("MinPerBaht"));
            bean.setCreate_date(rs.getString("create_date"));
            bean.setUpdate_date(rs.getString("update_date"));

            listBean.add(bean);
        }
        rs.close();

        return listBean;
    }

    public List<CbLoanConfigBean> listLoanConfig() {
        List<CbLoanConfigBean> listBean = new ArrayList<>();
        try {
            String sql = "select * from cb_loan_config";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return listBean;
    }
    
    public List<CbLoanConfigBean> listLoanConfigHistory() {
        List<CbLoanConfigBean> listBean = new ArrayList<>();
        try {
            String sql = "select * from cb_loan_config_history";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return listBean;
    }

    public CbLoanConfigBean findOneByLoanTypeCode(String loanCode) {
        try {
            String sql = "select * from cb_loan_config where LoanCode='" + loanCode + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            List<CbLoanConfigBean> listBean = mappingBean(rs);
            if (listBean.isEmpty()) {
                return null;
            }
            return listBean.get(0);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return null;
        }
    }

    public boolean saveLoanConfig(CbLoanConfigBean bean) {
        boolean isSave = false;
        try {
            String sql = "insert into cb_loan_config "
                    + "(LoanCode,LoanName,LoanINT,LoanFee,LoanPenaltyINT,LoanPenaltyDay,"
                    + "LoanMinAmount,IntFixed,IntBadDebt,IntTurnover,IntNormal,chkPIntCapital,"
                    + "chkPIntTable,LoanPerMonth,LoanRunning, BookNo,"
                    + "MinPayPercent, MinPerBaht, checkMinPayment,create_date,update_date)  "
                    + "values('" + bean.getLoanCode() + "','" + ThaiUtil.Unicode2ASCII(bean.getLoanName()) + "',"
                    + "'" + bean.getLoanINT() + "','" + bean.getLoanFee() + "',"
                    + "'" + bean.getLoanPenaltyINT() + "','" + bean.getLoanPenaltyDay() + "',"
                    + "'" + bean.getLoanMinAmount() + "','" + bean.getIntFixed() + "',"
                    + "'" + bean.getIntBadDebt() + "','" + bean.getIntTurnover() + "',"
                    + "'" + bean.getIntNormal() + "','" + bean.getChkPIntCapital() + "',"
                    + "'" + bean.getChkPIntTable() + "','" + bean.getLoanPerMonth() + "',"
                    + "'" + bean.getLoanRunning() + "', '" + bean.getBookNo() + "',"
                    + "'" + bean.getMinPaymentPercent() + "','" + bean.getMinPaymentBaht() + "',"
                    + "'" + bean.getCheckMinPayment() + "',now(),now())";
            String sqlChk = "select * from cb_loan_config where LoanCode='" + bean.getLoanCode() + "' ";
            ResultSet rs = MySQLConnect.getResultSet(sqlChk);
            if (rs.next()) {
                isSave = updateLoanConfig(bean);
            } else {
                update(sql);
                isSave = true;
            }
            
            // save history
            String sqlHistory = "insert into cb_loan_config_history "
                    + "select * from cb_loan_config where LoanCode='" + bean.getLoanCode() + "'";
            MySQLConnect.exeUpdate(sqlHistory);

            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return isSave;
    }

    public boolean updateLoanConfig(CbLoanConfigBean bean) {
        boolean isSave;
        try {
            String sql = "update cb_loan_config set "
                    + "LoanCode='" + bean.getLoanCode() + "', "
                    + "LoanName='" + ThaiUtil.Unicode2ASCII(bean.getLoanName()) + "', "
                    + "LoanINT='" + bean.getLoanINT() + "', "
                    + "LoanFee='" + bean.getLoanFee() + "', "
                    + "LoanPenaltyINT='" + bean.getLoanPenaltyINT() + "', "
                    + "LoanPenaltyDay='" + bean.getLoanPenaltyDay() + "', "
                    + "LoanMinAmount='" + bean.getLoanMinAmount() + "', "
                    + "IntFixed='" + bean.getIntFixed() + "', "
                    + "IntBadDebt='" + bean.getIntBadDebt() + "', "
                    + "IntTurnover='" + bean.getIntTurnover() + "', "
                    + "IntNormal='" + bean.getIntNormal() + "', "
                    + "chkPIntCapital='" + bean.getChkPIntCapital() + "', "
                    + "chkPIntTable='" + bean.getChkPIntTable() + "',"
                    + "LoanPerMonth='" + bean.getLoanPerMonth() + "',"
                    + "LoanRunning='" + bean.getLoanRunning() + "',"
                    + "checkMinPayment='" + bean.getCheckMinPayment() + "',"
                    + "MinPayPercent='" + bean.getMinPaymentPercent() + "',"
                    + "MinPerBaht='" + bean.getMinPaymentBaht() + "',"
                    + "BookNo='" + bean.getBookNo() + "' "
                    + "where LoanCode='" + bean.getLoanCode() + "'";
            update(sql);
            isSave = true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            isSave = false;
        }

        return isSave;
    }

    public boolean deleteLoanMaster(String LoanCode) {
        try {
            String sql = "delete from cb_loan_config where LoanCode='" + LoanCode + "';";
            update(sql);
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return false;
        }

    }

    public boolean updateRunningBookNo(String loan_type) {
        try {
            String sql = "update cb_loan_config set LoanRunning=LoanRunning+1,"
                    + "BookNo=BookNo+1 where LoanCode='" + loan_type + "'";
            return MySQLConnect.exeUpdate(sql) > 0;
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return false;
        }

    }
}
