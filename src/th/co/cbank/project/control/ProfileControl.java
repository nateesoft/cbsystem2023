package th.co.cbank.project.control;

import th.co.cbank.project.model.ProfileBean;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.log4j.Logger;
import th.co.cbank.util.DateFormat;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.model.ProfileMapping;
import th.co.cbank.util.DateUtil;
import th.co.cbank.util.MessageAlert;
import th.co.cbank.util.NumberFormat;

public class ProfileControl extends BaseControl {

    private final Logger logger = Logger.getLogger(ProfileControl.class);
    private int DEPTID = 0;

    public ProfileControl() {
    }

    public int getDeptID() {
        return DEPTID;
    }

    public String[] getDataGroup() {
        String data = "";
        try {
            String sql = "select * from cb_group";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            while (rs.next()) {
                data += rs.getString("Group_Code") + ",";
            }

            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return data.split(",");
    }

    public boolean dataExist(String code) {
        boolean isExist = false;
        try {
            String sql = "select p_custcode from cb_profile where p_custcode='" + code + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                isExist = true;
            }

            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());

        }

        return isExist;
    }

    public List<ProfileBean> mappingBean(ResultSet rs) throws Exception {
        List<ProfileBean> listBean = new ArrayList<>();
        while (rs.next()) {
            ProfileBean bean = new ProfileBean();
            bean.setP_index(rs.getInt("P_index"));
            bean.setP_custCode(rs.getString("P_custCode"));
            bean.setP_custType(rs.getString("P_custType"));
            bean.setP_custName(ThaiUtil.ASCII2Unicode(rs.getString("P_custName")));
            bean.setP_custSurname(ThaiUtil.ASCII2Unicode(rs.getString("P_custSurname")));
            bean.setP_custAge(rs.getInt("P_custAge"));
            bean.setP_custSex(rs.getString("P_custSex"));
            bean.setP_custOccupation(ThaiUtil.ASCII2Unicode(rs.getString("P_custOccupation")));
            bean.setP_custNation(ThaiUtil.ASCII2Unicode(rs.getString("P_custNation")));
            bean.setP_cust_status(rs.getString("P_cust_status"));
            bean.setP_cust_religion(rs.getString("P_cust_religion"));
            bean.setP_spouse_name(ThaiUtil.ASCII2Unicode(rs.getString("P_spouse_name")));
            bean.setP_spouse_surname(ThaiUtil.ASCII2Unicode(rs.getString("P_spouse_surname")));
            bean.setP_spouse_sex(rs.getString("P_spouse_sex"));
            bean.setP_cust_pic_url(rs.getString("P_cust_pic_url"));
            bean.setP_fee(rs.getDouble("P_fee"));
            bean.setHoon_Qty(rs.getInt("Hoon_Qty"));
            bean.setMember_Point(rs.getInt("Member_Point"));
            bean.setAR_Balance(rs.getDouble("AR_Balance"));
            bean.setSave_Balance(rs.getDouble("Save_Balance"));
            bean.setLoan_Balance(rs.getDouble("Loan_Balance"));
            bean.setLoan_Credit_Amt(rs.getDouble("Loan_Credit_Amt"));
            bean.setLoan_Credit_Balance(rs.getDouble("Loan_Credit_Balance"));
            bean.setDowInCar_Target_Rai(rs.getInt("Dow_Incar_Rai"));
            bean.setDowInCar_Target_Tree(rs.getInt("Dow_Incar_Tree"));
            bean.setStatus(ThaiUtil.ASCII2Unicode(rs.getString("status")));
            bean.setP_down_fee(rs.getDouble("P_Down_Fee"));
            bean.setP_prefix(ThaiUtil.ASCII2Unicode(rs.getString("p_prefix")));
            bean.setP_member_type(rs.getString("p_member_type"));
            bean.setApproveLimit(rs.getInt("ApproveLimit"));
            try {
                bean.setCard_Expire(DateUtil.toDate(rs.getDate("Card_Expire")));
            } catch (SQLException e) {

            }
            try {
                bean.setP_custBirthDay(rs.getDate("P_custBirthDay"));
            } catch (SQLException e) {

            }
            try {
                bean.setP_member_start(rs.getDate("P_member_start"));
            } catch (SQLException e) {

            }
            try {
                bean.setP_member_end(rs.getDate("P_member_end"));
            } catch (SQLException e) {

            }
            try {
                bean.setDowInCar_Target_Date(rs.getDate("Dow_Incar_Date"));
            } catch (SQLException e) {

            }

            listBean.add(bean);
        }
        rs.close();
        return listBean;
    }

    public List<ProfileMapping> mappingBean2(ResultSet rs) throws Exception {
        List<ProfileMapping> listBean = new ArrayList<>();
        while (rs.next()) {
            ProfileMapping pm = new ProfileMapping();

            ProfileBean bean = new ProfileBean();
            bean.setP_index(rs.getInt("P_index"));
            bean.setP_custCode(rs.getString("P_custCode"));
            bean.setP_custType(rs.getString("P_custType"));
            bean.setP_custName(ThaiUtil.ASCII2Unicode(rs.getString("P_custName")));
            bean.setP_custSurname(ThaiUtil.ASCII2Unicode(rs.getString("P_custSurname")));
            bean.setP_custAge(rs.getInt("P_custAge"));
            bean.setP_custSex(rs.getString("P_custSex"));
            bean.setP_custOccupation(ThaiUtil.ASCII2Unicode(rs.getString("P_custOccupation")));
            bean.setP_custNation(ThaiUtil.ASCII2Unicode(rs.getString("P_custNation")));
            bean.setP_cust_status(rs.getString("P_cust_status"));
            bean.setP_cust_religion(rs.getString("P_cust_religion"));
            bean.setP_spouse_name(ThaiUtil.ASCII2Unicode(rs.getString("P_spouse_name")));
            bean.setP_spouse_surname(ThaiUtil.ASCII2Unicode(rs.getString("P_spouse_surname")));
            bean.setP_spouse_sex(rs.getString("P_spouse_sex"));
            bean.setP_cust_pic_url(rs.getString("P_cust_pic_url"));
            bean.setP_fee(rs.getDouble("P_fee"));
            bean.setHoon_Qty(rs.getInt("Hoon_Qty"));
            bean.setMember_Point(rs.getInt("Member_Point"));
            bean.setAR_Balance(rs.getDouble("AR_Balance"));
            bean.setSave_Balance(rs.getDouble("Save_Balance"));
            bean.setLoan_Balance(rs.getDouble("Loan_Balance"));
            bean.setLoan_Credit_Amt(rs.getDouble("Loan_Credit_Amt"));
            bean.setLoan_Credit_Balance(rs.getDouble("Loan_Credit_Balance"));
            bean.setDowInCar_Target_Rai(rs.getInt("Dow_Incar_Rai"));
            bean.setDowInCar_Target_Tree(rs.getInt("Dow_Incar_Tree"));
            bean.setStatus(ThaiUtil.ASCII2Unicode(rs.getString("status")));
            bean.setP_down_fee(rs.getDouble("P_Down_Fee"));
            bean.setP_prefix(ThaiUtil.ASCII2Unicode(rs.getString("p_prefix")));
            bean.setP_member_type(rs.getString("p_member_type"));
            bean.setApproveLimit(rs.getInt("ApproveLimit"));
            try {
                bean.setCard_Expire(DateUtil.toDate(rs.getDate("Card_Expire")));
            } catch (SQLException e) {

            }
            try {
                bean.setP_custBirthDay(rs.getDate("P_custBirthDay"));
            } catch (SQLException e) {

            }
            try {
                bean.setP_member_start(rs.getDate("P_member_start"));
            } catch (SQLException e) {

            }
            try {
                bean.setP_member_end(rs.getDate("P_member_end"));
            } catch (SQLException e) {

            }
            try {
                bean.setDowInCar_Target_Date(rs.getDate("Dow_Incar_Date"));
            } catch (SQLException e) {

            }

            pm.setProfileBean(bean);
            if (rs.getString("listAcc") != null) {
                pm.setListAcc(rs.getString("listAcc").replace(",", "|"));
            } else {
                pm.setListAcc("");
            }

            if (rs.getString("listLoan") != null) {
                pm.setListLoan(rs.getString("listLoan").replace(",", "|"));
            } else {
                pm.setListLoan("");
            }

            listBean.add(pm);
        }
        rs.close();
        return listBean;
    }

    public List<ProfileBean> listCbProfile() {
        try {
            String sql = "select * from cb_profile";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return new ArrayList();
        }
    }

    public List<ProfileMapping> searchProfile(String txtDate, int selectIndex) {
        Date d1 = DateFormat.getLocal_ddMMyyyy(txtDate);
        String sql = "select p.*, group_concat(account_code) listAcc, group_concat(loan_docno) listLoan "
                + "from cb_profile p left join cb_save_account s on p.p_custcode=s.b_cust_code "
                + "left join cb_loan_account l on p.p_custcode=l.cust_code "
                + "where 1=1 "
                + "and p_member_start <= '" + DateFormat.getMySQL_Date(d1) + "' ";
        if (selectIndex != 0) {
            sql += " and p_member_type='" + selectIndex + "' ";
        }

        sql += " group by p.p_custCode order by p.p_index ";
        
        List<ProfileMapping> listBean = new ArrayList<>();
        try {
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean2(rs);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return listBean;
    }
    
    public List<ProfileMapping> searchProfile2(String txtDate, int selectIndex) {
        Date d1 = DateFormat.getLocal_ddMMyyyy(txtDate);
        String sql = "select p.*, group_concat(account_code) listAcc, group_concat(loan_docno) listLoan "
                + "from cb_profile p left join cb_save_account s on p.p_custcode=s.b_cust_code "
                + "left join cb_loan_account l on p.p_custcode=l.cust_code "
                + "where 1=1 "
                + "and p_member_start >= '" + DateFormat.getMySQL_Date(d1) + "' ";
        if (selectIndex != 0) {
            sql += " and p_member_type='" + selectIndex + "' ";
        }

        sql += " group by p.p_custCode order by p.p_index ";
        
        List<ProfileMapping> listBean = new ArrayList<>();
        try {
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean2(rs);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return listBean;
    }

    public ProfileBean findOneByCustCode(String P_custCode) {
        try {
            String sql = "select * from cb_profile where P_custCode='" + P_custCode + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            List<ProfileBean> listProfile = mappingBean(rs);
            if (listProfile.isEmpty()) {
                return null;
            }

            return listProfile.get(0);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return null;
        }
    }

    public List<ProfileBean> getProfileByApproveLimitMoreThanZero(String P_custCode) {
        try {
            String sql = "select p_custCode, p_custName,p_custsurname,ApproveLimit "
                    + "from cb_profile "
                    + "where ApproveLimit>0 "
                    + "and p_custCode<>'" + P_custCode + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return new ArrayList<>();
        }
    }

    public List<ProfileBean> getProfileByApproveAndCustName(String P_custCode, String custName) {
        try {
            String sql = "select p_custCode, p_custName,p_custsurname,ApproveLimit "
                    + "from cb_profile "
                    + "where ApproveLimit>0 "
                    + "and p_custCode<>'" + P_custCode + "' "
                    + "and p_custName like '%" + ThaiUtil.Unicode2ASCII(custName) + "%'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return new ArrayList<>();
        }
    }

    public ProfileBean findOneByIndex(String pIndex) {
        try {
            String sql = "select * from cb_profile where p_index='" + pIndex + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            List<ProfileBean> listProfile = mappingBean(rs);
            if (listProfile.isEmpty()) {
                return null;
            }

            return listProfile.get(0);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return null;
        }
    }

    public boolean saveProfile(ProfileBean bean) {
        try {
            String sql = "insert into cb_profile "
                    + "(p_index,p_custCode,p_custType,p_custName,p_custSurname,p_custBirthDay,p_custAge,p_custSex,"
                    + "p_custOccupation,p_custNation,p_cust_status,p_cust_religion,p_member_start,p_member_end,"
                    + "p_spouse_name,p_spouse_surname,p_spouse_sex,p_cust_pic_url,p_fee,Status,Hoon_Qty,Member_Point,"
                    + "AR_Balance,Save_Balance,Loan_Balance,Loan_Credit_Amt,Loan_Credit_Balance,"
                    + "Dow_Incar_Rai, Dow_Incar_Date, Dow_Incar_Tree, P_Down_Fee, P_Prefix,p_member_type,"
                    + "ApproveLimit, Card_Expire) "
                    + "values('" + bean.getP_index() + "','" + bean.getP_custCode() + "','" + bean.getP_custType() + "',"
                    + "'" + ThaiUtil.Unicode2ASCII(bean.getP_custName()) + "','" + ThaiUtil.Unicode2ASCII(bean.getP_custSurname()) + "',"
                    + "'" + DateFormat.getMySQL_Date(bean.getP_custBirthDay()) + "',"
                    + "'" + bean.getP_custAge() + "','" + bean.getP_custSex() + "','" + ThaiUtil.Unicode2ASCII(bean.getP_custOccupation()) + "',"
                    + "'" + ThaiUtil.Unicode2ASCII(bean.getP_custNation()) + "','" + bean.getP_cust_status() + "','" + ThaiUtil.Unicode2ASCII(bean.getP_cust_religion()) + "',"
                    + "'" + DateFormat.getMySQL_Date(bean.getP_member_start()) + "',"
                    + "'" + DateFormat.getMySQL_Date(bean.getP_member_end()) + "',"
                    + "'" + ThaiUtil.Unicode2ASCII(bean.getP_spouse_name()) + "',"
                    + "'" + ThaiUtil.Unicode2ASCII(bean.getP_spouse_surname()) + "','" + ThaiUtil.Unicode2ASCII(bean.getP_spouse_sex()) + "','" + bean.getP_cust_pic_url() + "',"
                    + "'" + bean.getP_fee() + "','" + ThaiUtil.Unicode2ASCII(bean.getStatus()) + "','" + bean.getHoon_Qty() + "',"
                    + "'" + bean.getMember_Point() + "','" + bean.getAR_Balance() + "','" + bean.getSave_Balance() + "',"
                    + "'" + bean.getLoan_Balance() + "','" + bean.getLoan_Credit_Amt() + "','" + bean.getLoan_Credit_Balance() + "',"
                    + "'" + bean.getDowInCar_Target_Rai() + "',"
                    + "'" + DateFormat.getMySQL_Date(bean.getDowInCar_Target_Date()) + "',"
                    + "'" + bean.getDowInCar_Target_Tree() + "', '" + bean.getP_down_fee() + "',"
                    + "'" + ThaiUtil.Unicode2ASCII(bean.getP_prefix()) + "','" + bean.getP_member_type() + "','" + bean.getApproveLimit() + "',"
                    + "'" + DateFormat.getMySQL_Date(bean.getCard_Expire()) + "')";
            String sqlChk = "select * from cb_profile where p_custCode='" + bean.getP_custCode() + "' ";
            ResultSet rs = MySQLConnect.getResultSet(sqlChk);
            if (rs.next()) {
                updateProfile(bean);
            } else {
                update(sql);
            }

            rs.close();
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return false;
    }

    public void updateProfile(ProfileBean bean) {
        try {
            String sql = "update cb_profile set "
                    + "p_index='" + bean.getP_index() + "', "
                    + "p_custCode='" + bean.getP_custCode() + "', "
                    + "p_custType='" + bean.getP_custType() + "', "
                    + "p_custName='" + ThaiUtil.Unicode2ASCII(bean.getP_custName()) + "', "
                    + "p_custSurname='" + ThaiUtil.Unicode2ASCII(bean.getP_custSurname()) + "', "
                    + "p_custBirthDay='" + DateFormat.getMySQL_Date(bean.getP_custBirthDay()) + "', "
                    + "p_custAge='" + bean.getP_custAge() + "', "
                    + "p_custSex='" + bean.getP_custSex() + "', "
                    + "p_custOccupation='" + ThaiUtil.Unicode2ASCII(bean.getP_custOccupation()) + "', "
                    + "p_custNation='" + ThaiUtil.Unicode2ASCII(bean.getP_custNation()) + "', "
                    + "p_cust_status='" + bean.getP_cust_status() + "', "
                    + "p_cust_religion='" + bean.getP_cust_religion() + "', "
                    + "p_member_end='" + DateFormat.getMySQL_Date(bean.getP_member_end()) + "', "
                    + "p_spouse_name='" + ThaiUtil.Unicode2ASCII(bean.getP_spouse_name()) + "', "
                    + "p_spouse_surname='" + ThaiUtil.Unicode2ASCII(bean.getP_spouse_surname()) + "', "
                    + "p_spouse_sex='" + ThaiUtil.Unicode2ASCII(bean.getP_spouse_sex()) + "', "
                    + "p_cust_pic_url='" + bean.getP_cust_pic_url() + "', "
                    + "Status='" + ThaiUtil.Unicode2ASCII(bean.getStatus()) + "', "
                    + "Dow_Incar_Rai='" + bean.getDowInCar_Target_Rai() + "',"
                    + "Dow_Incar_Date='" + DateFormat.getMySQL_Date(bean.getDowInCar_Target_Date()) + "',"
                    + "Dow_Incar_Tree='" + bean.getDowInCar_Target_Tree() + "',"
                    + "P_Down_Fee='" + bean.getP_down_fee() + "',"
                    + "P_Prefix='" + ThaiUtil.Unicode2ASCII(bean.getP_prefix()) + "',"
                    + "Card_Expire='" + DateFormat.getMySQL_Date(bean.getCard_Expire()) + "',"
                    + "p_member_type='" + bean.getP_member_type() + "' "
                    + "where p_custCode='" + bean.getP_custCode() + "'";
            update(sql);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    public List<ProfileBean> search(String keyword) {
        keyword = ThaiUtil.Unicode2ASCII(keyword);
        try {
            String sql = "select * from cb_profile "
                    + "where p_custcode like '%" + keyword + "%' "
                    + "or p_custname like '%" + keyword + "%' "
                    + "or p_custsurname like '%" + keyword + "%' "
                    + "order by P_index";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return new ArrayList<>();
        }
    }

    public void deleteProfile(String custCode) {
        try {
            boolean allow = true;
            String sql = "select * from cb_save_account "
                    + "where b_cust_code='" + custCode + "';";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                allow = false;
            }
            sql = "select * from cb_transaction_save where t_custcode='" + custCode + "'";
            rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                allow = false;
            }
            sql = "select * from cb_transaction_loan where t_custcode='" + custCode + "'";
            rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                allow = false;
            }
            sql = "select * from cb_hoon_balance where hooncode='" + custCode + "'";
            rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                allow = false;
            }
            sql = "select * from cb_loan_account where cust_code='" + custCode + "'";
            rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                allow = false;
            }
            if (allow) {
                update("delete from cb_profile where p_custCode='" + custCode + "'");
                //MessageAlert.infoPopup(this.getClass(), "ลบข้อมูลผู้ใช้งานท่านนี้เรียบร้อยแล้ว");
            } else {
                MessageAlert.infoPopup(this.getClass(), "รหัสผู้ใช้งานนี้ถูกนำไปใช้งานแล้วไม่สามารถลบข้อมูลได้ !");
            }

            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());

        }
    }

    public String getMaxIndex() {
        try {
            int max = 1;
            String sql = "select max(p_index)+1 next from cb_profile;";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                max = rs.getInt("next");
            }
            if (max == 0) {
                max = 1;
            }
            rs.close();

            return "" + max;
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return "1";
    }

    public String getPMax() {
        String pMax = "";
        try {
            String sql = "select max(p_index) pMax from cb_profile";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                pMax = rs.getString("pMax");
            }
            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return pMax;
    }

    public ProfileBean getInitialBean() {
        ProfileBean bean = new ProfileBean();
        bean.setP_index(NumberFormat.toInt(getMaxIndex()));
        bean.setP_custSex("M");
        bean.setP_custType("1");
        bean.setP_custAge(1);
        bean.setP_cust_status("0");
        bean.setStatus(ThaiUtil.Unicode2ASCII("ยังไม่เปิดบัญชี"));
        bean.setP_spouse_sex("M");
        bean.setP_member_type("1");
        bean.setP_custBirthDay(new Date());
        bean.setP_custOccupation("");
        bean.setP_custNation("");
        bean.setP_cust_religion("");
        bean.setP_member_end(DateFormat.getEnglish_ddMMyyyy("26/05/2065"));
        bean.setP_spouse_name("");
        bean.setP_spouse_surname("");
        bean.setP_cust_pic_url("");
        bean.setLoan_Credit_Amt(150000);
        bean.setLoan_Credit_Balance(150000);
        bean.setP_prefix(ThaiUtil.Unicode2ASCII("คุณ"));
        bean.setCard_Expire(DateFormat.getEnglish_ddMMyyyy("01/01/2020"));

        return bean;
    }

    public double getTotalHoonQty() {
        double hoonQty = 0;
        try {
            String sql = "select sum(hoon_qty) hoonQty from cb_profile where 1=1";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                hoonQty = rs.getDouble("hoonQty");
            }
            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return hoonQty;
    }

    public List<ProfileBean> listProfileHoon() {
        try {
            String sql = "select * from cb_profile where 1=1 order by p_index";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return new ArrayList<>();
        }
    }

    public boolean updateLoanBalance(double loan_amount, double loan_amount0, String cust_code) {
        try {
            String sql = "update cb_profile set "
                    + "Loan_Credit_Balance=Loan_Credit_Balance-" + loan_amount + ","
                    + "Loan_Balance=Loan_Balance+" + loan_amount0 + " "
                    + "where p_CustCode='" + cust_code + "'";
            return MySQLConnect.exeUpdate(sql) > 0;
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return false;
        }
    }

    public int updateLoanCreditBalance(String custCode, double LOAN_CREDIT_AMT) {
        try {
            String sql = "update cb_profile set "
                    + "loan_credit_amt='" + LOAN_CREDIT_AMT + "', "
                    + "loan_credit_balance=(loan_credit_amt-loan_balance) "
                    + "where p_custcode='" + custCode + "'";
            return MySQLConnect.exeUpdate(sql);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return -1;
        }
    }

    public void updateSaveBalance(double cMoney, String p_custCode) {
        try {
            String sql = "update cb_profile set Save_Balance=Save_Balance-" + cMoney + " "
                    + "where P_CustCode='" + p_custCode + "'";
            MySQLConnect.exeUpdate(sql);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }
}
