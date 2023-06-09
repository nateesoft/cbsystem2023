package th.co.cbank.project.control;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import th.co.cbank.util.DateFormat;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.model.CbExpTransactionBean;
import th.co.cbank.util.MessageAlert;

public class CbExpTransactionControl extends BaseControl {

    private final Logger logger = Logger.getLogger(CbExpTransactionControl.class);

    public List<CbExpTransactionBean> mappingBean(ResultSet rs) throws Exception {
        List<CbExpTransactionBean> listBean = new ArrayList<>();
        while (rs.next()) {
            CbExpTransactionBean bean = new CbExpTransactionBean();
            bean.setEXP_DOC(rs.getString("EXP_DOC"));
            bean.setEXP_DATE(rs.getDate("EXP_DATE"));
            bean.setBRANCH_CODE(rs.getString("BRANCH_CODE"));
            bean.setEMP_CODE(rs.getString("EMP_CODE"));
            bean.setEXP_TYPE(ThaiUtil.ASCII2Unicode(rs.getString("EXP_TYPE")));
            bean.setEMP_AMOUNT(rs.getDouble("EMP_AMOUNT"));

            listBean.add(bean);
        }
        rs.close();

        return listBean;
    }

    public List<CbExpTransactionBean> listCbExpTransaction() {
        try {
            String sql = "select * from cb_exp_transaction order by EXP_DATE";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return new ArrayList();
        }
    }

    public List<CbExpTransactionBean> listCbExpTransaction(String EXP_DOC) {
        try {
            String sql = "select * from cb_exp_transaction where EXP_DOC='" + EXP_DOC + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return new ArrayList();
        }
    }

    public CbExpTransactionBean findOneByExpDoc(String expDoc) {
        try {
            String sql = "select * from cb_exp_transaction where EXP_DOC='" + expDoc + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            List<CbExpTransactionBean> listBean = mappingBean(rs);
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

    public void saveCbExpTransaction(CbExpTransactionBean bean) {
        try {
            String sql = "insert into cb_exp_transaction(EXP_DOC,EXP_DATE,BRANCH_CODE,EMP_CODE,EXP_TYPE,EMP_AMOUNT)  "
                    + "values('" + bean.getEXP_DOC() + "','" + DateFormat.getMySQL_Date(bean.getEXP_DATE()) + "',"
                    + "'" + bean.getBRANCH_CODE() + "','" + bean.getEMP_CODE() + "',"
                    + "'" + ThaiUtil.Unicode2ASCII(bean.getEXP_TYPE()) + "','" + bean.getEMP_AMOUNT() + "')";
            String sqlChk = "select * from cb_exp_transaction where EXP_DOC='" + bean.getEXP_DOC() + "'";
            ResultSet rs = MySQLConnect.getResultSet(sqlChk);
            if (rs.next()) {
                updateCbExpTransaction(bean);
            } else {
                update(sql);
            }

            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    public void updateCbExpTransaction(CbExpTransactionBean bean) {
        try {
            String sql = "update cb_exp_transaction set "
                    + "EXP_DOC='" + bean.getEXP_DOC() + "', "
                    + "EXP_DATE='" + DateFormat.getMySQL_Date(bean.getEXP_DATE()) + "', "
                    + "BRANCH_CODE='" + bean.getBRANCH_CODE() + "', "
                    + "EMP_CODE='" + bean.getEMP_CODE() + "', "
                    + "EXP_TYPE='" + ThaiUtil.Unicode2ASCII(bean.getEXP_TYPE()) + "', "
                    + "EMP_AMOUNT='" + bean.getEMP_AMOUNT() + "' "
                    + "where EXP_DOC='" + bean.getEXP_DOC() + "'";
            update(sql);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }
}
