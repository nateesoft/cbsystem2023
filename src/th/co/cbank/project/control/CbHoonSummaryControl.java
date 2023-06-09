package th.co.cbank.project.control;

import th.co.cbank.project.model.CbHoonSummaryBean;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import th.co.cbank.util.MessageAlert;

public class CbHoonSummaryControl extends BaseControl {

    private final Logger logger = Logger.getLogger(CbHoonSummaryControl.class);

    public List<CbHoonSummaryBean> mappingBean(ResultSet rs) throws Exception {
        List<CbHoonSummaryBean> listBean = new ArrayList<>();
        while (rs.next()) {
            CbHoonSummaryBean sBean = new CbHoonSummaryBean();
            sBean.setYear_at(rs.getString("year_at"));
            sBean.setAction_time(rs.getDate("action_time"));
            sBean.setUser_action(rs.getString("user_action"));
            sBean.setProfit_total(rs.getDouble("profit_total"));
            sBean.setReduce_value_second(rs.getInt("reduce_value_second"));
            sBean.setReduce_benefit(rs.getInt("reduce_benefit"));
            sBean.setReduce_v_baht(rs.getDouble("reduce_v_baht"));
            sBean.setReduce_b_baht(rs.getDouble("reduce_b_baht"));
            sBean.setBalance_total(rs.getDouble("balance_total"));
            sBean.setDividend_buy(rs.getDouble("dividend_buy"));
            sBean.setDividend_money(rs.getDouble("dividend_money"));
            sBean.setDividend_by(rs.getDouble("dividend_by"));
            sBean.setDividend_baht(rs.getDouble("dividend_baht"));
            sBean.setDividend_value_baht(rs.getDouble("dividend_value_baht"));

            listBean.add(sBean);
        }

        return listBean;
    }

    public CbHoonSummaryBean findOneByYear(String year) {
        try {
            String sql = "select * from cb_hoon_summary where year_at='" + year + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            List<CbHoonSummaryBean> listBean = mappingBean(rs);
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

    public List<CbHoonSummaryBean> getAllData() {
        try {
            String sql = "select * from cb_hoon_summary order by year_at";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return new ArrayList();
        }
    }

}
