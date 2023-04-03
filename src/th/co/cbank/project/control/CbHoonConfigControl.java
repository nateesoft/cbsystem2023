package th.co.cbank.project.control;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.model.CbHoonConfigBean;
import th.co.cbank.util.MessageAlert;

public class CbHoonConfigControl extends BaseControl {

    private final Logger logger = Logger.getLogger(CbHoonConfigControl.class);

    public List<CbHoonConfigBean> mappingBean(ResultSet rs) throws Exception {
        List<CbHoonConfigBean> listBean = new ArrayList<>();
        while (rs.next()) {
            CbHoonConfigBean bean = new CbHoonConfigBean();
            bean.setHoonCode(rs.getString("HoonCode"));
            bean.setHoonName(ThaiUtil.ASCII2Unicode(rs.getString("HoonName")));
            bean.setHoonRate(rs.getDouble("HoonRate"));
            bean.setHoonVolumnMax(rs.getInt("HoonVolumnMax"));
            bean.setHoonDeviden(rs.getDouble("HoonDeviden"));
            bean.setHoonBuyMin(rs.getInt("HoonBuyMin"));

            listBean.add(bean);
        }
        rs.close();
        return listBean;
    }

    public List<CbHoonConfigBean> listCbHoonConfig() {
        try {
            String sql = "select * from cb_hoon_config";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return new ArrayList();
        }
    }

    public CbHoonConfigBean listCbHoonConfig(String id) {
        try {
            ResultSet rs = MySQLConnect.getResultSet("select * from cb_hoon_config where HoonCode='" + id + "'");
            List<CbHoonConfigBean> listBean = mappingBean(rs);
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

    public boolean saveCbHoonConfig(CbHoonConfigBean bean) {
        boolean isSave = false;
        try {
            String sql = "insert into cb_hoon_config "
                    + "(hoonCode,hoonName,hoonRate,hoonVolumnMax,hoonDeviden,hoonBuyMin)  "
                    + "values('" + bean.getHoonCode() + "',"
                    + "'" + ThaiUtil.Unicode2ASCII(bean.getHoonName()) + "',"
                    + "'" + bean.getHoonRate() + "',"
                    + "'" + bean.getHoonVolumnMax() + "',"
                    + "'" + bean.getHoonDeviden() + "',"
                    + "'" + bean.getHoonBuyMin() + "')";
            String sqlChk = "select * from cb_hoon_config "
                    + "where HoonCode='" + bean.getHoonCode() + "' ";
            ResultSet rs = MySQLConnect.getResultSet(sqlChk);
            if (rs.next()) {
                isSave = updateCbHoonConfig(bean);
            } else {
                update(sql);
                isSave = true;
            }

            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return isSave;
    }

    public boolean updateCbHoonConfig(CbHoonConfigBean bean) {
        try {
            String sql = "update cb_hoon_config set "
                    + "hoonCode='" + bean.getHoonCode() + "', "
                    + "hoonName='" + ThaiUtil.Unicode2ASCII(bean.getHoonName()) + "', "
                    + "hoonRate='" + bean.getHoonRate() + "', "
                    + "hoonVolumnMax='" + bean.getHoonVolumnMax() + "', "
                    + "hoonDeviden='" + bean.getHoonDeviden() + "', "
                    + "hoonBuyMin='" + bean.getHoonBuyMin() + "' "
                    + "where HoonCode='" + bean.getHoonCode() + "'";
            update(sql);
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return false;
        }
    }

    public boolean deleteMaster(String hoonCode) {
        try {
            String sql = "delete from cb_hoon_config where hoonCode='" + hoonCode + "'";
            update(sql);
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return false;
        }
    }

}
