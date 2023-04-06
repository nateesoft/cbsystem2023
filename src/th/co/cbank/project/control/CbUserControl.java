package th.co.cbank.project.control;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import th.co.cbank.project.model.CbGroupBean;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.model.CbUserBean;
import th.co.cbank.util.MessageAlert;

public class CbUserControl extends BaseControl {

    private final Logger logger = Logger.getLogger(CbUserControl.class);

    public CbUserBean mappingBean(ResultSet rs) throws SQLException {
        CbUserBean bean = new CbUserBean();
        bean.setUsername(rs.getString("Username"));
        bean.setPassword(rs.getString("Password"));
        bean.setName(ThaiUtil.ASCII2Unicode(rs.getString("Name")));
        bean.setLastname(ThaiUtil.ASCII2Unicode(rs.getString("Lastname")));
        bean.setUsergroup(rs.getString("Usergroup"));
        bean.setIDCard(rs.getString("IDCard"));
        bean.setAddr_no(rs.getString("Addr_no"));
        bean.setAddr_moo(rs.getString("Addr_moo"));
        bean.setAddr_road(ThaiUtil.ASCII2Unicode(rs.getString("Addr_road")));
        bean.setAddr_soi(ThaiUtil.ASCII2Unicode(rs.getString("Addr_soi")));
        bean.setAddr_tambon(ThaiUtil.ASCII2Unicode(rs.getString("Addr_tambon")));
        bean.setAddr_amphur(ThaiUtil.ASCII2Unicode(rs.getString("Addr_amphur")));
        bean.setAddr_province(ThaiUtil.ASCII2Unicode(rs.getString("Addr_province")));
        bean.setAddr_post(rs.getString("Addr_post"));
        bean.setAddr_tel(rs.getString("Addr_tel"));
        bean.setAddr_tel_home(rs.getString("Addr_tel_home"));

        return bean;
    }

    public List<CbUserBean> mappingListBean(ResultSet rs) throws Exception {
        List<CbUserBean> listBean = new ArrayList<>();
        while (rs.next()) {
            CbUserBean bean = mappingBean(rs);
            if (bean != null) {
                listBean.add(bean);
            }
        }
        rs.close();
        return listBean;
    }

    public List<CbUserBean> listUser() {
        try {
            String sql = "select * from cb_user";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingListBean(rs);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return new ArrayList();
        }
    }

    public CbUserBean getUser(String username) {
        CbUserBean bean = null;
        String sql = "select * from cb_user where username='" + username + "'";
        try (ResultSet rs = MySQLConnect.getResultSet(sql)) {
            if(rs.next()){
                bean = mappingBean(rs);
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return bean;
    }

    public void saveUser(CbUserBean bean) {
        try {
            String sql = "insert into cb_user "
                    + "(username,password,name,lastname,usergroup,IDCard,"
                    + "addr_no,addr_moo,addr_road,addr_soi,addr_tambon,addr_amphur,addr_province,addr_post,"
                    + "addr_tel,addr_tel_home)  "
                    + "values('" + bean.getUsername() + "',md5('" + bean.getPassword() + "'),"
                    + "'" + ThaiUtil.Unicode2ASCII(bean.getName()) + "','" + ThaiUtil.Unicode2ASCII(bean.getLastname()) + "','" + bean.getUsergroup() + "',"
                    + "'" + bean.getIDCard() + "','" + bean.getAddr_no() + "','" + bean.getAddr_moo() + "',"
                    + "'" + ThaiUtil.Unicode2ASCII(bean.getAddr_road()) + "','" + ThaiUtil.Unicode2ASCII(bean.getAddr_soi()) + "',"
                    + "'" + ThaiUtil.Unicode2ASCII(bean.getAddr_tambon()) + "','" + ThaiUtil.Unicode2ASCII(bean.getAddr_amphur()) + "',"
                    + "'" + ThaiUtil.Unicode2ASCII(bean.getAddr_province()) + "','" + bean.getAddr_post() + "',"
                    + "'" + bean.getAddr_tel() + "','" + bean.getAddr_tel_home() + "')";
            String sqlChk = "select * from cb_user where username='" + bean.getUsername() + "'";
            ResultSet rs = MySQLConnect.getResultSet(sqlChk);
            if (rs.next()) {
                updateUser(bean);
            } else {
                update(sql);
            }

            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    public void updateUser(CbUserBean bean) {
        try {
            String sql = "update cb_user set "
                    + "username='" + bean.getUsername() + "', "
                    + "password=md5('" + bean.getPassword() + "'), "
                    + "name='" + ThaiUtil.Unicode2ASCII(bean.getName()) + "', "
                    + "lastname='" + ThaiUtil.Unicode2ASCII(bean.getLastname()) + "', "
                    + "usergroup='" + bean.getUsergroup() + "', "
                    + "IDCard='" + bean.getIDCard() + "', "
                    + "addr_no='" + bean.getAddr_no() + "', "
                    + "addr_moo='" + bean.getAddr_moo() + "', "
                    + "addr_road='" + ThaiUtil.Unicode2ASCII(bean.getAddr_road()) + "', "
                    + "addr_soi='" + ThaiUtil.Unicode2ASCII(bean.getAddr_soi()) + "', "
                    + "addr_tambon='" + ThaiUtil.Unicode2ASCII(bean.getAddr_tambon()) + "', "
                    + "addr_amphur='" + ThaiUtil.Unicode2ASCII(bean.getAddr_amphur()) + "', "
                    + "addr_province='" + ThaiUtil.Unicode2ASCII(bean.getAddr_province()) + "', "
                    + "addr_post='" + bean.getAddr_post() + "', "
                    + "addr_tel='" + bean.getAddr_tel() + "', "
                    + "addr_tel_home='" + bean.getAddr_tel_home() + "' "
                    + "where username='" + bean.getUsername() + "'";
            update(sql);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    public boolean validUserConfirm(String userCode, String password) {
        boolean isValid = false;
        try {
            String sql = "select * from cb_user where username='" + userCode + "' "
                    + "and password=md5('" + password + "') ";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                isValid = true;
            }
            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
        return isValid;
    }

    public CbUserBean findOneByUserPass(String user, String pass) {
        String sql = "select * from cb_user where username='" + user + "' "
                + "and password=md5('" + pass + "') ";
        try (ResultSet rs = MySQLConnect.getResultSet(sql)) {
            if(rs.next()){
                return mappingBean(rs);
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
        return null;
    }

    public CbGroupBean findGroupPermissionByUser(String user) {
        CbGroupBean bean = new CbGroupBean();
        String sql = "select permission from cb_group g inner join cb_user u "
                + "on g.groupcode=u.usergroup "
                + "where username = '" + user + "';";
        try (ResultSet rs = MySQLConnect.getResultSet(sql)) {
            if (rs.next()) {
                bean.setPermission(rs.getString("permission"));
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
        return bean;
    }

}
