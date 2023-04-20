package th.co.cbank.project.control;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import th.co.cbank.project.model.CbGroupBean;
import th.co.cbank.util.MessageAlert;
import th.co.cbank.util.ThaiUtil;

public class CbGroupControl extends BaseControl {

    private final Logger logger = Logger.getLogger(CbGroupControl.class);

    public List<CbGroupBean> mappingBean(ResultSet rs) throws Exception {
        List<CbGroupBean> listBean = new ArrayList<>();
        while (rs.next()) {
            CbGroupBean bean = new CbGroupBean();
            bean.setGroupcode(rs.getString("groupcode"));
            bean.setGroupname(ThaiUtil.ASCII2Unicode(rs.getString("groupname")));
            bean.setPermission(rs.getString("permission"));

            listBean.add(bean);
        }
        rs.close();
        return listBean;
    }

    public List<CbGroupBean> listCbGroup() {
        try {
            String sql = "select * from cb_group";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return new ArrayList();
        }
    }

    public List<CbGroupBean> listCbGroup(String groupcode) {
        try {
            String sql = "select * from cb_group where groupcode='" + groupcode + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return new ArrayList();
        }
    }

    public CbGroupBean findOneByGroupCode(String groupcode) {
        try {
            String sql = "select * from cb_group where groupcode='" + groupcode + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            List<CbGroupBean> listBean = mappingBean(rs);
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

    public void saveCbGroup(CbGroupBean bean) {
        try {
            String sql = "insert into cb_group (groupcode, groupname, permission)  "
                    + "values("
                    + "'" + bean.getGroupcode() + "',"
                    + "'" + ThaiUtil.Unicode2ASCII(bean.getGroupname()) + "', "
                    + "'" + bean.getPermission() + "')";
            update(sql);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    public boolean updateCbGroup(CbGroupBean bean) {
        try {
            String sql = "update cb_group set "
                    + "groupname='" + ThaiUtil.Unicode2ASCII(bean.getGroupname()) + "', "
                    + "permission='" + bean.getPermission() + "' "
                    + "where groupcode='" + bean.getGroupcode() + "'";
            update(sql);
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return false;
        }
    }
}
