package th.co.cbank.project.control;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.model.DocumentGarunteeBean;
import th.co.cbank.util.MessageAlert;

public class DocumentGarunteeControl extends BaseControl {

    private final Logger logger = Logger.getLogger(DocumentGarunteeControl.class);

    public List<DocumentGarunteeBean> mappingBean(ResultSet rs) throws Exception {
        List<DocumentGarunteeBean> listBean = new ArrayList<>();
        while (rs.next()) {
            DocumentGarunteeBean bean = new DocumentGarunteeBean();
            bean.setDOC_NO(rs.getString("DOC_NO"));
            bean.setDOC_DESC(ThaiUtil.ASCII2Unicode(rs.getString("DOC_DESC")));
            bean.setIMAGE1(rs.getString("IMAGE1"));
            bean.setIMGAE2(rs.getString("IMGAE2"));
            bean.setIMAGE3(rs.getString("IMAGE3"));

            listBean.add(bean);
        }
        rs.close();
        return listBean;
    }

    public List<DocumentGarunteeBean> listDocumentGaruntee() {
        try {
            String sql = "select * from document_garuntee";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return new ArrayList();
        }
    }

    public List<DocumentGarunteeBean> listDocumentGaruntee(String docNo) {
        try {
            String sql = "select * from document_garuntee where DOC_NO='" + docNo + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return new ArrayList();
        }
    }

    public DocumentGarunteeBean getDocumentGaruntee(String docNo) {
        try {
            String sql = "select * from document_garuntee where DOC_NO='" + docNo + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            List<DocumentGarunteeBean> listBean = mappingBean(rs);
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

    public boolean saveDocumentGaruntee(DocumentGarunteeBean documentGarunteeBean) {
        boolean result = false;
        try {
            String sql = "insert into document_garuntee(DOC_NO,DOC_DESC,IMAGE1,IMGAE2,IMAGE3)  "
                    + "values('" + documentGarunteeBean.getDOC_NO() + "',"
                    + "'" + ThaiUtil.Unicode2ASCII(documentGarunteeBean.getDOC_DESC()) + "','" + documentGarunteeBean.getIMAGE1() + "',"
                    + "'" + documentGarunteeBean.getIMGAE2() + "','" + documentGarunteeBean.getIMAGE3() + "')";
            String sqlChk = "select * from document_garuntee "
                    + "where DOC_NO='" + documentGarunteeBean.getDOC_NO() + "'";
            ResultSet rs = MySQLConnect.getResultSet(sqlChk);
            if (rs.next()) {
                result = updateDocumentGaruntee(documentGarunteeBean);
            } else {
                update(sql);
                result = true;
            }

            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return result;
    }

    public boolean updateDocumentGaruntee(DocumentGarunteeBean documentGarunteeBean) {
        try {
            String sql = "update document_garuntee set "
                    + "DOC_DESC='" + documentGarunteeBean.getDOC_DESC() + "', "
                    + "IMAGE1='" + documentGarunteeBean.getIMAGE1() + "', "
                    + "IMGAE2='" + documentGarunteeBean.getIMGAE2() + "', "
                    + "IMAGE3='" + documentGarunteeBean.getIMAGE3() + "' "
                    + "where DOC_NO='" + documentGarunteeBean.getDOC_NO() + "'";
            update(sql);
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return false;
    }

    public void deleteData(String loanDocCode) {
        try {
            String sql = "delete from document_garuntee where doc_no='" + loanDocCode + "'";
            update(sql);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }
}
