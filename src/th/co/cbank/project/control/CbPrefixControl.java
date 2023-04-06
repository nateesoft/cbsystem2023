package th.co.cbank.project.control;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.model.CbPrefixBean;
import th.co.cbank.util.MessageAlert;

public class CbPrefixControl extends BaseControl {

    private final Logger logger = Logger.getLogger(CbPrefixControl.class);

    public List<CbPrefixBean> listPrefix() {
        List<CbPrefixBean> listBean = new ArrayList<>();
        try {
            String sql = "select * from cb_prefix";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            while (rs.next()) {
                CbPrefixBean bean = new CbPrefixBean();
                bean.setCode(rs.getString("code"));
                bean.setName(ThaiUtil.ASCII2Unicode(rs.getString("name")));
                listBean.add(bean);
            }
            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return listBean;
    }

    public CbPrefixBean findOneByCode(String code) {
        CbPrefixBean bean = new CbPrefixBean();
        try {
            String sql = "select * from cb_prefix "
                    + "where code='" + code + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                bean.setCode(rs.getString("code"));
                bean.setName(ThaiUtil.ASCII2Unicode(rs.getString("name")));
            }
            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return bean;
    }

    public boolean savePrefix(CbPrefixBean bean) {
        try {
            String sql = "insert into cb_prefix (code,name)  "
                    + "values('" + bean.getCode() + "','" + ThaiUtil.Unicode2ASCII(bean.getName()) + "')";
            String sqlChk = "select * from cb_prefix where code='" + bean.getCode() + "'";
            ResultSet rs = MySQLConnect.getResultSet(sqlChk);
            if (rs.next()) {
                return updatePrefix(bean);
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

    public boolean updatePrefix(CbPrefixBean bean) {
        try {
            String sql = "update cb_prefix set "
                    + "code='" + bean.getCode() + "', "
                    + "name='" + ThaiUtil.Unicode2ASCII(bean.getName()) + "' "
                    + "where code='" + bean.getCode() + "'";
            update(sql);
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return false;
        }
    }

}
