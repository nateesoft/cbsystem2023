package th.co.cbank.project.control;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.model.CbMemberTypeBean;
import th.co.cbank.util.MessageAlert;

public class CbMemberTypeControl extends BaseControl {

    private final Logger logger = Logger.getLogger(CbMemberTypeControl.class);

    public List<CbMemberTypeBean> mappingBean(ResultSet rs) throws Exception {
        List<CbMemberTypeBean> listBean = new ArrayList<>();
        while (rs.next()) {
            CbMemberTypeBean bean = new CbMemberTypeBean();
            bean.setTypeCode(rs.getString("type_code"));
            bean.setTypeName(ThaiUtil.ASCII2Unicode(rs.getString("type_name")));
            bean.setMemberCount(rs.getInt("member_count"));
            listBean.add(bean);
        }
        rs.close();

        return listBean;
    }

    public List<CbMemberTypeBean> listMemberType() {
        try {
            String sql = "select * from cb_member_type";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return new ArrayList();
        }
    }

    public CbMemberTypeBean listMemberType(String pj_id) {
        try {
            String sql = "select * from cb_member_type where type_code='" + pj_id + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            List<CbMemberTypeBean> listBean = mappingBean(rs);
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

    public boolean saveMemberType(CbMemberTypeBean bean) {
        try {
            String sql = "insert into cb_member_type (type_code,type_name,member_count)  "
                    + "values('" + bean.getTypeCode() + "','" + ThaiUtil.Unicode2ASCII(bean.getTypeName()) + "','" + bean.getMemberCount() + "')";
            String sqlChk = "select * from cb_member_type where type_code='" + bean.getTypeCode() + "'";
            ResultSet rs = MySQLConnect.getResultSet(sqlChk);
            if (rs.next()) {
                return updateMemberType(bean);
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

    public boolean updateMemberType(CbMemberTypeBean bean) {
        try {
            String sql = "update cb_member_type set "
                    + "type_name='" + ThaiUtil.Unicode2ASCII(bean.getTypeName()) + "',"
                    + "member_count='" + bean.getMemberCount() + "' "
                    + "where type_code='" + bean.getTypeCode() + "'";
            update(sql);
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return false;
        }
    }

}
