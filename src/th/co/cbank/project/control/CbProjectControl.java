package th.co.cbank.project.control;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.model.CbProjectBean;
import th.co.cbank.util.MessageAlert;

public class CbProjectControl extends BaseControl {

    private final Logger logger = Logger.getLogger(CbProjectControl.class);

    public List<CbProjectBean> listProject() {
        List<CbProjectBean> listBean = new ArrayList<>();
        try {
            String sql = "select * from cb_project";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            while (rs.next()) {
                CbProjectBean bean = new CbProjectBean();
                bean.setProductCode(rs.getString("pj_id"));
                bean.setProductName(ThaiUtil.ASCII2Unicode(rs.getString("pj_desc")));

                listBean.add(bean);
            }
            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return listBean;
    }

    public CbProjectBean findOneByPjId(String pj_id) {
        CbProjectBean bean = new CbProjectBean();
        try {
            String sql = "select * from cb_project where pj_id='" + pj_id + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                bean.setProductCode(rs.getString("pj_id"));
                bean.setProductName(ThaiUtil.ASCII2Unicode(rs.getString("pj_desc")));
            }
            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return bean;
    }

    public boolean saveProject(CbProjectBean bean) {
        try {
            String sql = "insert into cb_project (pj_id,pj_desc)  "
                    + "values('" + bean.getProductCode() + "','" + ThaiUtil.Unicode2ASCII(bean.getProductName()) + "')";
            String sqlChk = "select * from cb_project where pj_id='" + bean.getProductCode() + "'";
            ResultSet rs = MySQLConnect.getResultSet(sqlChk);
            if (rs.next()) {
                return updateProject(bean);
            } else {
                update(sql);
            }

            rs.close();
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return false;
        }
    }

    public boolean updateProject(CbProjectBean bean) {
        try {
            String sql = "update cb_project set "
                    + "pj_id='" + bean.getProductCode() + "', "
                    + "pj_desc='" + ThaiUtil.Unicode2ASCII(bean.getProductName()) + "' "
                    + "where pj_id='" + bean.getProductCode() + "'";
            update(sql);
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return false;
        }
    }

}
