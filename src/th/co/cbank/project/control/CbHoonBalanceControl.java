package th.co.cbank.project.control;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import th.co.cbank.project.model.CbHoonBalanceBean;
import th.co.cbank.project.model.CbHoonSummaryBean;
import th.co.cbank.util.MessageAlert;
import th.co.cbank.util.ThaiUtil;

public class CbHoonBalanceControl extends BaseControl {

    private final Logger logger = Logger.getLogger(CbHoonBalanceControl.class);

    public double getTotalHoonVolumn() {
        try {
            String sql = "select sum(hoonvolumn) total from cb_hoon_balance;";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                return rs.getDouble("total");
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return 0;
    }

    public void saveToClear() {
        try {
            MySQLConnect.exeUpdate("alter table cb_hoon_balance add column Year_At varchar(4);");
            String sql1 = "create table if not exists cb_hoon_summary_history select * from cb_hoon_balance limit 0,0;";
            String sql2 = "alter table cb_hoon_summary_history add column Year_At varchar(4);";
            MySQLConnect.exeUpdate(sql1);
            MySQLConnect.exeUpdate(sql2);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    public void saveHoonSummary(CbHoonSummaryBean bean) {
        try {
            String sqlIns = "insert into cb_hoon_summary"
                    + "(year_at,action_time,user_action,profit_total,"
                    + "reduce_value_second,reduce_benefit,reduce_v_baht,"
                    + "reduce_b_baht,balance_total,dividend_buy,dividend_money,"
                    + "dividend_by,dividend_baht,dividend_value_baht) "
                    + "values('" + bean.getYear_at() + "',now(),"
                    + "'" + bean.getUser_action() + "','" + bean.getProfit_total() + "',"
                    + "'" + bean.getReduce_value_second() + "','" + bean.getReduce_benefit() + "',"
                    + "'" + bean.getReduce_v_baht() + "','" + bean.getReduce_b_baht() + "',"
                    + "'" + bean.getBalance_total() + "','" + bean.getDividend_buy() + "',"
                    + "'" + bean.getDividend_money() + "','" + bean.getDividend_by() + "',"
                    + "'" + bean.getDividend_baht() + "','" + bean.getDividend_value_baht() + "')";
            MySQLConnect.exeUpdate(sqlIns);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    public boolean checkExitYearAt(String year_at) {
        boolean isExist = false;
        String chk = "select year_at from cb_hoon_summary where year_at='" + year_at + "'";
        try (ResultSet rs = MySQLConnect.getResultSet(chk)) {
            if (rs.next()) {
                isExist = true;
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
        return isExist;
    }

    public List<CbHoonBalanceBean> getHoonBalance() {
        List<CbHoonBalanceBean> listBean = new ArrayList<>();
        try {
            String sql = "select * from cb_hoon_balance order by HoonCode";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            while (rs.next()) {
                CbHoonBalanceBean bean = new CbHoonBalanceBean();
                bean.setHoonCode(rs.getString("Hoon_Code"));
                bean.setHoonLastUpdate(rs.getTimestamp("HoonLastUpdate"));
                bean.setHoonVolumn(rs.getInt("HoonVolumn"));
                bean.setName(ThaiUtil.ASCII2Unicode(rs.getString("name")));
                bean.setLastName(ThaiUtil.ASCII2Unicode(rs.getString("lastName")));
                bean.setDevidend(rs.getDouble("Devidend"));
                bean.setARAmount(rs.getDouble("ARAmount"));
                bean.setPoint(rs.getInt("point"));
                bean.setDeposit1(rs.getDouble("Deposit1"));
                bean.setDeposit2(rs.getDouble("Deposit2"));
                bean.setPriceFirst(rs.getDouble("PriceFirst"));
                bean.setDateFirst(rs.getDate("datefirst"));
                bean.setCardNo(rs.getString("CardNo"));
                bean.setYear_At(rs.getString("Year_At"));

                listBean.add(bean);
            }
            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
        return listBean;
    }

    public void updateHoonSummary(CbHoonSummaryBean bean) {
        try {
            String sqlUpd = "update cb_hoon_summary set "
                    + "action_time=now(), "
                    + "user_action='" + bean.getUser_action() + "', "
                    + "profit_total='" + bean.getProfit_total() + "', "
                    + "reduce_value_second='" + bean.getReduce_value_second() + "', "
                    + "reduce_benefit='" + bean.getReduce_benefit() + "', "
                    + "reduce_v_baht='" + bean.getReduce_v_baht() + "', "
                    + "reduce_b_baht='" + bean.getReduce_b_baht() + "', "
                    + "balance_total='" + bean.getBalance_total() + "', "
                    + "dividend_buy='" + bean.getDividend_buy() + "', "
                    + "dividend_money='" + bean.getDividend_money() + "', "
                    + "dividend_by='" + bean.getDividend_by() + "', "
                    + "dividend_baht='" + bean.getDividend_baht() + "', "
                    + "dividend_value_baht='" + bean.getDividend_value_baht() + "' "
                    + "where year_at='" + bean.getYear_at() + "'";
            MySQLConnect.exeUpdate(sqlUpd);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    public void updateDevidendPointWhereHoonCode(double dividend, double mTotalPoint, double totalARAmount, String year_at, String HoonCode) {
        try {
            String sqlD = "update cb_hoon_balance set "
                    + "devidend='" + dividend + "',"
                    + "Point='" + mTotalPoint + "',"
                    + "ARAmount='" + totalARAmount + "',"
                    + "year_at='" + year_at + "' "
                    + "where HoonCode='" + HoonCode + "'";
            MySQLConnect.exeUpdate(sqlD);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    public void deleteHoonSummaryHistory(String HoonCode, String year_at) {
        try {
            MySQLConnect.exeUpdate("delete from cb_hoon_summary_history "
                    + "where HoonCode='" + HoonCode + "' "
                    + "and year_at='" + year_at + "'");
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    public void backupHoonSummaryHistory(String HoonCode) {
        try {
            String sqlIns = "insert into cb_hoon_summary_history "
                    + "select * from cb_hoon_balance "
                    + "where HoonCode='" + HoonCode + "' ";
            MySQLConnect.exeUpdate(sqlIns);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    public void updateYearAtWhereHoonCode(String year_at, String HoonCode) {
        try {
            MySQLConnect.exeUpdate("update cb_hoon_summary_history "
                    + "set year_at='" + year_at + "' "
                    + "where HoonCode='" + HoonCode + "' "
                    + "and year_at is null");
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    public void updateArAmountWhereHoonCode(double totalBalanceAmount, String HoonCode) {
        try {
            String sql = "update cb_hoon_balance "
                    + "set ARAmount='" + totalBalanceAmount + "' "
                    + "where hoonCode='" + HoonCode + "'";
            MySQLConnect.exeUpdate(sql);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }
}
