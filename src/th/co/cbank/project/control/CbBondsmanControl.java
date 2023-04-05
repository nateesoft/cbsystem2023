package th.co.cbank.project.control;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.model.CbBondsmanBean;
import th.co.cbank.util.MessageAlert;

public class CbBondsmanControl extends BaseControl {

    private final Logger logger = Logger.getLogger(CbBondsmanControl.class);

    public List<CbBondsmanBean> mappingBean(ResultSet rs) throws Exception {
        List<CbBondsmanBean> listBean = new ArrayList<>();
        while (rs.next()) {
            CbBondsmanBean bean = new CbBondsmanBean();
            bean.setLoan_docno(rs.getString("Loan_docno"));
            bean.setIdcard(rs.getString("Idcard"));
            bean.setName(ThaiUtil.ASCII2Unicode(rs.getString("Name")));
            bean.setSurname(ThaiUtil.ASCII2Unicode(rs.getString("Surname")));

            listBean.add(bean);
        }

        rs.close();
        return listBean;
    }

    public List<CbBondsmanBean> listCbBondsman() {
        try {
            String sql = "select * from cb_bondsman";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return new ArrayList();
        }
    }

    public List<CbBondsmanBean> listCbBondsman(String loan_docno) {
        try {
            String sql = "select * from cb_bondsman where loan_docno='" + loan_docno + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return new ArrayList();
        }
    }

    public CbBondsmanBean getCbBondsman(String loan_docno) {
        try {
            String sql = "select * from cb_bondsman where loan_docno='" + loan_docno + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            List<CbBondsmanBean> listBean = mappingBean(rs);
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

    public void deleteCbBondsman(String loan_docno, String idcard) {
        try {
            String sql = "delete from cb_bondsman where loan_docno='" + loan_docno + "' "
                    + "and idcard='" + idcard + "'";
            update(sql);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    public boolean saveCbBondsman(CbBondsmanBean bean) {
        boolean isSave = false;
        try {
            String sql = "insert into cb_bondsman(loan_docno,idcard,name,surname)  "
                    + "values('" + bean.getLoan_docno() + "','" + bean.getIdcard() + "',"
                    + "'" + ThaiUtil.Unicode2ASCII(bean.getName()) + "',"
                    + "'" + ThaiUtil.Unicode2ASCII(bean.getSurname()) + "')";
            String sqlChk = "select * from cb_bondsman where loan_docno='" + bean.getLoan_docno() + "' "
                    + "and idcard='" + bean.getIdcard() + "'";
            ResultSet rs = MySQLConnect.getResultSet(sqlChk);
            if (rs.next()) {
                isSave = updateCbBondsman(bean);
            } else {
                update(sql);
                //ลบจำนวนที่สามารถค้ำประกันได้ออกไป
                String sql2 = "update cb_profile set ApproveLimit=ApproveLimit-1 "
                        + "where p_custCode='" + bean.getIdcard() + "';";
                update(sql2);
                isSave = true;
            }

            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return isSave;
    }

    public boolean updateCbBondsman(CbBondsmanBean bean) {
        try {
            String sql = "update cb_bondsman set name='" + ThaiUtil.Unicode2ASCII(bean.getName()) + "', "
                    + "surname='" + ThaiUtil.Unicode2ASCII(bean.getSurname()) + "' "
                    + "where loan_docno='" + bean.getLoan_docno() + "' and idcard='" + bean.getIdcard() + "'";
            update(sql);
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return false;
    }
}
