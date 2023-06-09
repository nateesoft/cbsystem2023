package th.co.cbank.project.control;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.model.CbStatusBean;
import th.co.cbank.util.MessageAlert;

public class CbStatusControl extends BaseControl {

    private final Logger logger = Logger.getLogger(CbStatusControl.class);

    public List<CbStatusBean> listExpense() {
        List<CbStatusBean> listBean = new ArrayList<>();
        String sql = "select * from cb_status";
        try (ResultSet rs = MySQLConnect.getResultSet(sql)) {
            while (rs.next()) {
                CbStatusBean bean = new CbStatusBean();

                bean.setExp_id(rs.getString("Exp_id"));
                bean.setExp_desc(ThaiUtil.ASCII2Unicode(rs.getString("Exp_desc")));

                listBean.add(bean);
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return listBean;
    }

    public CbStatusBean findOneByExpId(String exp_id) {
        CbStatusBean bean = new CbStatusBean();
        String sql = "select * from cb_status where exp_id='" + exp_id + "'";
        try (ResultSet rs = MySQLConnect.getResultSet(sql)) {
            if (rs.next()) {
                bean.setExp_id(rs.getString("Exp_id"));
                bean.setExp_desc(ThaiUtil.ASCII2Unicode(rs.getString("Exp_desc")));
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return bean;
    }

    public boolean saveExpense(CbStatusBean bean) {
        try {
            String sql = "insert into cb_status (exp_id,exp_desc)  "
                    + "values('" + bean.getExp_id() + "','" + ThaiUtil.Unicode2ASCII(bean.getExp_desc()) + "')";
            String sqlChk = "select * from cb_status where exp_id='" + bean.getExp_id() + "'";
            try (ResultSet rs = MySQLConnect.getResultSet(sqlChk)) {
                if (rs.next()) {
                    return updateExpense(bean);
                } else {
                    update(sql);
                }
            }
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return false;
        }
    }

    public boolean updateExpense(CbStatusBean bean) {
        try {
            String sql = "update cb_status set "
                    + "exp_id='" + bean.getExp_id() + "', "
                    + "exp_desc='" + ThaiUtil.Unicode2ASCII(bean.getExp_desc()) + "' "
                    + "where exp_id='" + bean.getExp_id() + "'";
            update(sql);
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return false;
        }
    }

}
