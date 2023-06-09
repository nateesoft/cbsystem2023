package th.co.cbank.project.control;

import th.co.cbank.project.model.GroupBean;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import th.co.cbank.util.MessageAlert;
import th.co.cbank.util.ThaiUtil;

public class SettingControl extends BaseControl {

    private final Logger logger = Logger.getLogger(SettingControl.class);

    public List<GroupBean> listCbGroup() {
        List<GroupBean> listBean = new ArrayList<>();
        try {
            String sql = "select * from cb_group";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            while (rs.next()) {
                GroupBean bean = new GroupBean();
                bean.setGroupCode(rs.getString("Groupcode"));
                bean.setGroupName(ThaiUtil.ASCII2Unicode(rs.getString("Groupname")));
                bean.setPermission(rs.getString("Permission"));

                listBean.add(bean);
            }
            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return listBean;
    }

    public GroupBean findOneByGroupCode(String groupCode) {
        GroupBean bean = new GroupBean();
        try {
            String sql = "select * from cb_group where groupcode='" + groupCode + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                bean.setGroupCode(rs.getString("Groupcode"));
                bean.setGroupName(ThaiUtil.ASCII2Unicode(rs.getString("Groupname")));
                bean.setPermission(rs.getString("Permission"));
            }
            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return bean;
    }

    public void saveCbGroup(GroupBean bean) {
        try {
            String sql = "insert into cb_group (groupcode,groupname,permission)  "
                    + "values('" + bean.getGroupCode() + "','" + ThaiUtil.Unicode2ASCII(bean.getGroupName()) + "','" + bean.getPermission() + "')";
            String sqlChk = "select * from cb_group where groupcode='" + bean.getGroupCode() + "' ";
            ResultSet rs = MySQLConnect.getResultSet(sqlChk);
            if (rs.next()) {
                updateCbGroup(bean);
            } else {
                update(sql);
            }

            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    public void updateCbGroup(GroupBean bean) {
        try {
            String sql = "update cb_group set "
                    + "groupname='" + ThaiUtil.Unicode2ASCII(bean.getGroupName()) + "', "
                    + "permission='" + bean.getPermission() + "' "
                    + "where groupcode='" + bean.getGroupCode() + "'";
            update(sql);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

}
