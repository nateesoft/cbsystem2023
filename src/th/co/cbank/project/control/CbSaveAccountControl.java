package th.co.cbank.project.control;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.apache.log4j.Logger;
import th.co.cbank.project.constants.AppConstants;
import th.co.cbank.util.DateFormat;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.model.BalanceBean;
import th.co.cbank.project.model.CalendarBean;
import th.co.cbank.project.model.CbSaveAccountBean;
import th.co.cbank.project.model.SettingBean;
import th.co.cbank.project.model.mapping.PayInterestAmtMapping;
import th.co.cbank.util.MessageAlert;
import th.co.cbank.util.NumberFormat;
import th.co.cbank.util.StringUtil;

public class CbSaveAccountControl extends BaseControl {

    private final Logger logger = Logger.getLogger(CbSaveAccountControl.class);

    private List<CbSaveAccountBean> mappingBean(ResultSet rs) throws Exception {
        List<CbSaveAccountBean> listBean = new ArrayList<>();
        while (rs.next()) {
            CbSaveAccountBean bean = new CbSaveAccountBean();
            bean.setB_CUST_CODE(rs.getString("B_CUST_CODE"));
            bean.setB_CUST_NAME(ThaiUtil.ASCII2Unicode(rs.getString("B_CUST_NAME")));
            bean.setB_CUST_LASTNAME(ThaiUtil.ASCII2Unicode(rs.getString("B_CUST_LASTNAME")));
            bean.setB_BALANCE(rs.getDouble("B_BALANCE"));
            bean.setB_INTEREST(rs.getDouble("B_INTEREST"));
            bean.setB_START(rs.getDate("B_START"));
            bean.setMEMBER_TYPE(rs.getString("MEMBER_TYPE"));
            bean.setB_UPDATE(rs.getDate("B_UPDATE"));
            bean.setAccount_code(rs.getString("Account_code"));
            bean.setAccount_status(rs.getString("Account_status"));
            bean.setBook_no(rs.getString("Book_no"));
            bean.setBook_evidence1(ThaiUtil.ASCII2Unicode(rs.getString("Book_evidence1")));
            bean.setBook_evidence2(ThaiUtil.ASCII2Unicode(rs.getString("Book_evidence2")));
            bean.setBook_evidence3(ThaiUtil.ASCII2Unicode(rs.getString("Book_evidence3")));
            bean.setBook_evidence4(ThaiUtil.ASCII2Unicode(rs.getString("Book_evidence4")));
            bean.setRemark(ThaiUtil.ASCII2Unicode(rs.getString("remark")));
            bean.setHoon_balance(rs.getInt("hoon_balance"));
            bean.setAccount_type(rs.getString("account_type"));
            bean.setB_FEE(rs.getDouble("B_FEE"));
            bean.setB_TIME(rs.getString("B_TIME"));
            bean.setBranch_Code(rs.getString("Branch_Code"));
            bean.setEmp_Code(rs.getString("Emp_Code"));

            listBean.add(bean);
        }
        rs.close();

        return listBean;
    }

    public List<CbSaveAccountBean> listCbSaveAccount() {
        try {
            String sql = "select * from cb_save_account";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            List<CbSaveAccountBean> listBean = mappingBean(rs);
            return listBean;
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return new ArrayList();
        }
    }

    public List<CbSaveAccountBean> listCbSaveAccountStatus(String accountStatus) {
        try {
            String sql = "select * from cb_save_account "
                    + "where account_status='" + accountStatus + "' order by account_code";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            List<CbSaveAccountBean> listBean = mappingBean(rs);
            return listBean;
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return new ArrayList();
        }
    }

    public List<CbSaveAccountBean> searchByCustNameCustCodeAccSts(String accountStatus, String custName, String custCode) {
        try {
            String sql = "select * from cb_save_account s where account_status='" + accountStatus + "' "
                    + "and B_CUST_NAME like '%" + ThaiUtil.Unicode2ASCII(custName) + "%' "
                    + "or account_code like '%" + ThaiUtil.Unicode2ASCII(custCode) + "%' "
                    + "order by account_code";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            List<CbSaveAccountBean> listBean = mappingBean(rs);
            return listBean;
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return new ArrayList();
        }
    }

    public List<CbSaveAccountBean> listSaveAccount(String orderBy) {
        try {
            String sql = "select * from cb_save_account where 1=1 ";
            if (StringUtil.isNotNullString(orderBy)) {
                sql += orderBy;
            }
            ResultSet rs = MySQLConnect.getResultSet(sql);
            List<CbSaveAccountBean> listBean = mappingBean(rs);
            return listBean;
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return new ArrayList();
        }

    }

    public List<CbSaveAccountBean> searchSaveAccount(String custName) {
        try {
            String sql = "select * from cb_save_account "
                    + "where B_CUST_NAME like '%" + ThaiUtil.Unicode2ASCII(custName) + "%'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            List<CbSaveAccountBean> listBean = mappingBean(rs);
            return listBean;
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return new ArrayList();
        }

    }

    public List<CbSaveAccountBean> listCbSaveAccountActive() {
        List<CbSaveAccountBean> listBean = new ArrayList<>();
        try {
            String sql = "select t_custcode, t_acccode "
                    + "from cb_transaction_save "
                    + "where update_interest<curdate() "
                    + "and t_status "
                    + "in('" + AppConstants.CB_STATUS_SAVE + "','" + AppConstants.CB_STATUS_WITHDRAW + "','" + AppConstants.CB_STATUS_CLOSE_SAVE + "') "
                    + "and t_custcode<>'null' "
                    + "and t_acccode<>'' "
                    + "group by t_custcode, t_acccode "
                    + "order by t_custcode, t_acccode";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            while (rs.next()) {
                CbSaveAccountBean bean = new CbSaveAccountBean();
                bean.setB_CUST_CODE(rs.getString("t_custcode"));
                bean.setAccount_code(rs.getString("t_acccode"));

                listBean.add(bean);
            }
            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return listBean;
    }

    public List<CbSaveAccountBean> listCbSaveAccount(String custCode) {
        List<CbSaveAccountBean> listBean = new ArrayList<>();
        try {
            String sql = "select s.*, "
                    + "(select typeName from cb_save_config c where c.typeCode=s.account_type) typeName, "
                    + "(select exp_desc from cb_status sts where sts.exp_id=s.account_status) statusName "
                    + "from cb_save_account s "
                    + "where b_cust_code='" + custCode + "' and account_status='1' "
                    + "order by b_start,b_time";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            while (rs.next()) {
                CbSaveAccountBean bean = new CbSaveAccountBean();
                bean.setB_CUST_CODE(rs.getString("B_CUST_CODE"));
                bean.setB_CUST_NAME(rs.getString("B_CUST_NAME"));
                bean.setB_CUST_LASTNAME(rs.getString("B_CUST_LASTNAME"));
                bean.setB_BALANCE(rs.getDouble("B_BALANCE"));
                bean.setB_INTEREST(rs.getDouble("B_INTEREST"));
                bean.setB_START(rs.getDate("B_START"));
                bean.setMEMBER_TYPE(rs.getString("MEMBER_TYPE"));
                bean.setB_UPDATE(rs.getDate("B_UPDATE"));
                bean.setAccount_code(rs.getString("Account_code"));
                bean.setAccount_status(rs.getString("Account_status"));
                bean.setBook_no(rs.getString("Book_no"));
                bean.setBook_evidence1(rs.getString("Book_evidence1"));
                bean.setBook_evidence2(rs.getString("Book_evidence2"));
                bean.setBook_evidence3(rs.getString("Book_evidence3"));
                bean.setBook_evidence4(rs.getString("Book_evidence4"));
                bean.setRemark(rs.getString("remark"));
                bean.setHoon_balance(rs.getInt("hoon_balance"));
                bean.setAccount_type(rs.getString("account_type"));
                bean.setAccount_name(ThaiUtil.ASCII2Unicode(rs.getString("typeName")));
                bean.setB_FEE(rs.getDouble("B_FEE"));
                bean.setB_TIME(rs.getString("B_TIME"));
                bean.setBranch_Code(rs.getString("Branch_Code"));
                bean.setEmp_Code(rs.getString("Emp_Code"));
                bean.setStatusName(ThaiUtil.ASCII2Unicode(rs.getString("statusName")));

                listBean.add(bean);
            }
            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return listBean;
    }

    public CbSaveAccountBean findOneByAccountCode(String account_code) {
        try {
            String sql = "select * from cb_save_account where Account_code='" + account_code + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            List<CbSaveAccountBean> listBean = mappingBean(rs);
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

    public CbSaveAccountBean findOneByConditionWhere(String where) {
        try {
            String sql = "select * from cb_save_account where 1=1 ";
            if (StringUtil.isNotNullString(where)) {
                sql += where;
            }
            ResultSet rs = MySQLConnect.getResultSet(sql);
            List<CbSaveAccountBean> listBean = mappingBean(rs);
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

    public boolean saveSaveAccount(CbSaveAccountBean bean) {
        boolean isSave;
        try {
            String sql = "insert into cb_save_account "
                    + "(B_CUST_CODE,B_CUST_NAME,B_CUST_LASTNAME,B_BALANCE,B_INTEREST,B_START,"
                    + "MEMBER_TYPE,B_UPDATE,account_code,account_status,book_no,book_evidence1,book_evidence2,"
                    + "book_evidence3,book_evidence4,remark,"
                    + "hoon_balance,account_type,b_time,b_fee,Branch_Code,Emp_Code)  "
                    + "values('" + bean.getB_CUST_CODE() + "','" + ThaiUtil.Unicode2ASCII(bean.getB_CUST_NAME()) + "',"
                    + "'" + ThaiUtil.Unicode2ASCII(bean.getB_CUST_LASTNAME()) + "','" + bean.getB_BALANCE() + "',"
                    + "'" + bean.getB_INTEREST() + "',curdate(),'" + bean.getMEMBER_TYPE() + "',curdate(),"
                    + "'" + bean.getAccount_code() + "',"
                    + "'" + bean.getAccount_status() + "','" + bean.getBook_no() + "',"
                    + "'" + ThaiUtil.Unicode2ASCII(bean.getBook_evidence1()) + "','" + ThaiUtil.Unicode2ASCII(bean.getBook_evidence2()) + "',"
                    + "'" + ThaiUtil.Unicode2ASCII(bean.getBook_evidence3()) + "','" + ThaiUtil.Unicode2ASCII(bean.getBook_evidence4()) + "',"
                    + "'" + ThaiUtil.Unicode2ASCII(bean.getRemark()) + "',"
                    + "'" + bean.getHoon_balance() + "','" + bean.getAccount_type() + "',"
                    + "curtime(), '" + bean.getB_FEE() + "','" + bean.getBranch_Code() + "','" + bean.getEmp_Code() + "')";
            String sqlChk = "select * from cb_save_account "
                    + "where Account_code='" + bean.getAccount_code() + "' ";
            ResultSet rs = MySQLConnect.getResultSet(sqlChk);
            if (rs.next()) {
                updateSaveAccount(bean);
            } else {
                update(sql);
                String sql2 = "update cb_profile set "
                        + "Status='" + ThaiUtil.Unicode2ASCII("เปิดบัญชีแล้ว") + "',"
                        + "Save_Balance=Save_Balance+" + bean.getB_BALANCE() + " "
                        + "where P_CustCode='" + bean.getB_CUST_CODE() + "';";
                update(sql2);
            }

            new CbSaveConfigControl().updateMaxInt("" + bean.getAccount_type());

            sql = "update cb_save_config set "
                    + "SaveRunning=SaveRunning+1 "
                    + "where TypeCode='" + bean.getAccount_type() + "'";
            update(sql);

            rs.close();
            isSave = true;
        } catch (Exception e) {
            isSave = false;
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return isSave;
    }

    public boolean updateSaveAccount(CbSaveAccountBean bean) {
        boolean isSave = false;
        try {
            String sql = "update cb_save_account set "
                    + "B_CUST_CODE='" + bean.getB_CUST_CODE() + "', "
                    + "B_CUST_NAME='" + ThaiUtil.Unicode2ASCII(bean.getB_CUST_NAME()) + "', "
                    + "B_CUST_LASTNAME='" + ThaiUtil.Unicode2ASCII(bean.getB_CUST_LASTNAME()) + "', "
                    + "B_BALANCE='" + bean.getB_BALANCE() + "', "
                    + "B_INTEREST='" + bean.getB_INTEREST() + "' "
                    + "MEMBER_TYPE='" + bean.getMEMBER_TYPE() + "', "
                    + "B_UPDATE=curdate(), "
                    + "account_code='" + bean.getAccount_code() + "', "
                    + "account_status='" + bean.getAccount_status() + "', "
                    + "book_no='" + bean.getBook_no() + "', "
                    + "book_evidence1='" + ThaiUtil.Unicode2ASCII(bean.getBook_evidence1()) + "', "
                    + "book_evidence2='" + ThaiUtil.Unicode2ASCII(bean.getBook_evidence2()) + "',"
                    + "book_evidence3='" + ThaiUtil.Unicode2ASCII(bean.getBook_evidence1()) + "', "
                    + "book_evidence4='" + ThaiUtil.Unicode2ASCII(bean.getBook_evidence2()) + "',"
                    + "remark='" + ThaiUtil.Unicode2ASCII(bean.getRemark()) + "',"
                    + "hoon_balance='" + bean.getHoon_balance() + "',"
                    + "account_type='" + bean.getAccount_type() + "',"
                    + "B_TIME=curtime(),"
                    + "B_FEE='" + bean.getB_FEE() + "',"
                    + "Emp_Code='" + bean.getEmp_Code() + "',"
                    + "Branch_Code='" + bean.getBranch_Code() + "' "
                    + "where Account_code='" + bean.getAccount_code() + "'";
            update(sql);

            String sql2 = "update cb_profile set "
                    + "Save_Balance=Save_Balance+" + bean.getB_BALANCE() + " "
                    + "where P_CustCode='" + bean.getB_CUST_CODE() + "';";
            update(sql2);
            isSave = true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return isSave;
    }

    public void updateInterestAPI(String custCode, String accoutCode) {
        /*
         สำหรับบัญชีออมทรัพย์  วิธีก็เหมือนฝากประจำ ต่างที่เงินคงเหลือเราเปลี่ยนแปลงได้
         วันที่ฝาก        จำนวนเงิน  เงินคงเหลือ  ดอกเบี้ยที่ได้  สูตรคำนวณ
         01-jun-2013   10,000      10,000        0.82          ( 10,000 x 0.75 /100 x 4 /365 )  * 4 วัน  5-jun ลบ 1-jun
         05-jun-2013    -2,000        8,000       1.64          ( 8,000 x 0.75 /100 x 10 / 365 )  *10 วัน  15-jun ลบ 05-jun
         15-jun-2013   +1,000        9,000

         0.75 = อัตราดอกเบี้ยออมทรัพย์
         ก็คิดแบบนี้ไปเรื่อย ๆ จนสิ้นเดือน มิ.ย. หรือ ธ.ค. ธนาคาร ก็จะเอาดอกเบี้ยที่ได้มารวมกัน แล้วจ่ายให้เรา
         ตอนสิ้นงวด 6 เดือน ดอกเบี้ยจะได้มากหรือน้อยขึ้นอยู่กับเงินคงเหลือทุกสิ้นวัน
         */

 /*
         สมมุติ ฝากประจำ 4 เดือน  จำนวนเงิน  10,000 บาท อัตราดอกเบี้ย 4%
         ฝากวันที่  16 มิถุนายน ก็จะครบกำหนด 16 ตุลาคม
         นับวันแบบนี้  มิถุนายน มี 30 วัน - วันที่ฝาก 16  ( 30 - 16 = 4 วัน )
         มิ.ย.  4 วัน + ก.ค. 31 วัน + ส.ค. +31 วัน + ก.ย. 30 วัน + 16 ต.ค. จะได้ 122 วัน
         สูตรคิดดอกเบีย  เงินต้น x อัตราดอกเบี้ย % x จำนวนวัน / 365
         ( เหตุที่หารด้วย 365 เพราะธนาคารจ่ายดอกเบี้ย ร้อยละต่อปี )

         10,000 x  4 / 100 x 122 / 365  =  133.69 บาท

         แปลได้ว่า  เงิน 10,000 บาท ฝากประจำ 4 เดือน ดอกเบี้ย 4% เมื่อครบ 4 เดือนแล้วจะได้รับ
         ดอกเบี้ย  133.69 บาท
         */
        try {
            String sql = "select t_docno,t_date,t_time,t_acccode,t_custcode,lineno,t_balance,"
                    + "TypeINT,PayType,sum(t_amount) t_amount,"
                    + "CbPayType1,CbPayType2,CbPayType3,CbPayType4,CbPayType5,CbPayType6,CbPayType7 "
                    + "from cb_save_config c, cb_save_account s, cb_transaction_save t "
                    + "where c.typecode=s.account_type "
                    + "and s.account_code=t.t_acccode "
                    + "and t_status in('" + AppConstants.CB_STATUS_SAVE + "','" + AppConstants.CB_STATUS_WITHDRAW + "','" + AppConstants.CB_STATUS_CLOSE_SAVE + "') ";
            if (custCode.equals("") && accoutCode.equals("")) {
                sql += " and update_interest<curdate() ";
            } else {
                sql += " and t_custcode='" + custCode + "' "
                        + "and t_acccode='" + accoutCode + "' ";
                sql += " and update_interest<curdate() ";
            }
            sql += " group by t_date, t_custcode, t_acccode "
                    + "order by t_date,t_time ";

            /* check date */
            ResultSet rs2 = MySQLConnect.getResultSet(sql);
            String dateIn = "";
            while (rs2.next()) {
                dateIn += rs2.getString("t_date") + ",";
            }

            String[] dataIns = dateIn.split(",");

            rs2.close();
            /* end check date */

            double totalAmount = 0.00;
            int dayIn = 0;

            String tempCust = "";
            int custCount = 0;

            ResultSet rs = MySQLConnect.getResultSet(sql);
            while (rs.next()) {
                String t_acccode = rs.getString("t_acccode");
                String t_custcode = rs.getString("t_custcode");
                String lineNo = rs.getString("lineNo");
                String t_docno = rs.getString("t_docno");

                custCount++;
                if (tempCust.equals("")) {
                    tempCust = rs.getString("t_custcode");
                } else if (rs.getString("t_custcode").equals(tempCust)) {
                    tempCust = "";
                    continue;
                }

                dayIn++;
                Date dateStart = rs.getDate("t_date");
                Date dateEnd = null;
                if (dayIn < dataIns.length) {
                    dateEnd = DateFormat.getEnglish_yyyyMMdd(dataIns[dayIn].replace("-", "/"));
                }
                int count = (int) InterestControl.getLengthToCurrent(dateStart);

                Calendar c = Calendar.getInstance();
                c.setTime(dateStart);
                int current = 0;
                double totalBalance = rs.getDouble("t_balance");
                totalAmount += rs.getDouble("t_amount");
                double totalInt = 0;
                countDay:
                for (int i = 0; i < count; i++) {
                    c.add(Calendar.DATE, 1);
                    current++;
                    totalInt = InterestControl.defaultINT(totalBalance, rs.getDouble("TypeINT"), current);
                    String PAY_TYPE = rs.getString("payType");
                    if (PAY_TYPE.equals("1")) {
                        SimpleDateFormat sss = new SimpleDateFormat("dd", Locale.ENGLISH);
                        int dd = NumberFormat.toInt(sss.format(c.getTime()));
                        if (InterestControl.isEndOfMonth(dd)) {
                            totalAmount = getTotalAmountFromSummary(tempCust, totalInt, t_acccode);

                            totalInt = 0;
                            current = 0;
                            try {
                                String sqlUpd = "update cb_save_account set "
                                        + "b_interest='0',"
                                        + "b_balance='" + totalBalance + "',"
                                        + "b_update=curdate(),"
                                        + "b_time=curtime() "
                                        + "where b_cust_code='" + t_custcode + "' "
                                        + "and account_code='" + t_acccode + "' ";
                                update(sqlUpd);
                                break;
                            } catch (Exception e) {
                                logger.error(e.getMessage());
                                MessageAlert.infoPopup(this.getClass(), e.getMessage());
                            }
                        }
                    } else if (PAY_TYPE.equals("2")) {
                        SimpleDateFormat DD = new SimpleDateFormat("dd", Locale.ENGLISH);
                        SimpleDateFormat MM = new SimpleDateFormat("MM", Locale.ENGLISH);
                        int dd = NumberFormat.toInt(DD.format(c.getTime()));
                        int mm = NumberFormat.toInt(MM.format(c.getTime()));
                        if (dd == rs.getInt("cbPayType1") && mm == rs.getInt("cbPayType2")) {
                            totalAmount = getTotalAmountFromSummary(tempCust, totalInt, t_acccode);

                            totalInt = 0;
                            current = 0;
                            try {
                                String sqlUpd = "update cb_save_account set "
                                        + "b_interest='0',"
                                        + "b_balance='" + totalBalance + "',"
                                        + "b_update=curdate(),"
                                        + "b_time=curtime() "
                                        + "where b_cust_code='" + t_custcode + "' "
                                        + "and account_code='" + t_acccode + "' ";
                                update(sqlUpd);
                                break;
                            } catch (Exception e) {
                                logger.error(e.getMessage());
                                MessageAlert.infoPopup(this.getClass(), e.getMessage());
                            }
                        }
                    } else if (PAY_TYPE.equals("3")) {
                        SimpleDateFormat DD = new SimpleDateFormat("dd", Locale.ENGLISH);
                        SimpleDateFormat MM = new SimpleDateFormat("MM", Locale.ENGLISH);
                        int dd = NumberFormat.toInt(DD.format(c.getTime()));
                        int mm = NumberFormat.toInt(MM.format(c.getTime()));

                        int dd_db1 = rs.getInt("cbPayType3");
                        int mm_db1 = rs.getInt("cbPayType4");
                        int dd_db2 = rs.getInt("cbPayType5");
                        int mm_db2 = rs.getInt("cbPayType6");

                        if (dd == dd_db1 && mm == mm_db1) {
                            //เพิ่ม/แก้ไข ใหม่
                            updateInterestSaveAccount(t_custcode, t_acccode, totalInt);

                            //update ดอกเบี้ยให้ความเคลื่อนไหวด้วย
                            updateInterestDialy(t_custcode, t_acccode, totalInt, lineNo, t_docno);

                            totalInt = 0;
                            current = 0;
                        }
                        if (dd == dd_db2 && mm == mm_db2) {
                            //เพิ่ม/แก้ไข ใหม่
                            updateInterestSaveAccount(t_custcode, t_acccode, totalInt);

                            //update ดอกเบี้ยให้ความเคลื่อนไหวด้วย
                            updateInterestDialy(t_custcode, t_acccode, totalInt, lineNo, t_docno);

                            totalInt = 0;
                            current = 0;
                        }
                    } else if (PAY_TYPE.equals("4")) {
                        int monthAmt = rs.getInt("cbPayType7");
                        SimpleDateFormat simp = new SimpleDateFormat("MM/dd", Locale.ENGLISH);
                        String[] sp1 = simp.format(rs.getDate("t_date")).split("/");
                        int dayDeposit = NumberFormat.toInt(sp1[1]);//วันที่ฝาก yyyy-MM-dd
                        int monthDeposit = NumberFormat.toInt(sp1[0]);

                        String[] sp2 = simp.format(c.getTime()).split("/");
                        int dayCurrent = NumberFormat.toInt(sp2[1]);
                        int monthCurrent = NumberFormat.toInt(sp2[0]);
                        boolean isUpdate = false;
                        if (dayDeposit == dayCurrent && monthDeposit < monthCurrent) {//ตรงกับวันที่นั้น
                            if (monthCurrent % monthAmt == 0) {//ตรงกับเดือนที่กำหนด
                                totalAmount = getTotalAmountFromSummary(tempCust, totalInt, t_acccode);
                                totalInt = 0;
                                current = 0;
                                try {
                                    String sqlUpd = "update cb_save_account set "
                                            + "b_interest='0',"
                                            + "b_balance='" + totalBalance + "',"
                                            + "b_update=curdate(),"
                                            + "b_time=curtime() "
                                            + "where b_cust_code='" + t_custcode + "' "
                                            + "and account_code='" + t_acccode + "' ";
                                    update(sqlUpd);
                                    isUpdate = true;
                                    break;
                                } catch (Exception e) {
                                    logger.error(e.getMessage());
                                    MessageAlert.infoPopup(this.getClass(), e.getMessage());
                                }
                            }
                        }
                    } else if (PAY_TYPE.equals("5")) {
                        //ยังไม่มีการคำนวณดอกเบี้ย
                        totalInt = 0;
                    }
                }//end for loop

                //update interest
                try {
                    String sqlUpd = "update cb_transaction_save set "
                            + "update_interest = curdate(),"
                            + "PrintChk='N' "
                            + "where t_custcode='" + t_custcode + "' "
                            + "and t_acccode='" + t_acccode + "'";
                    update(sqlUpd);
                } catch (Exception e) {
                    logger.error(e.getMessage());
                    MessageAlert.infoPopup(this.getClass(), e.getMessage());
                }
            }
            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    private double getTotalAmountFromSummary(String tempCust, double totalInt, String t_acccode) {
        double totalAmount = 0;
        try {
            String sql1 = "select t_custcode, sum(t_amount) t_amount,sum(t_interest) t_interest "
                    + "from cb_transaction_save "
                    + "where t_custcode='" + tempCust + "' "
                    + "and t_status in('" + AppConstants.CB_STATUS_SAVE + "','" + AppConstants.CB_STATUS_WITHDRAW + "','" + AppConstants.CB_STATUS_CLOSE_SAVE + "') "
                    + "and t_acccode='" + t_acccode + "' "
                    + "group by t_custcode";
            try (ResultSet rs1 = MySQLConnect.getResultSet(sql1)) {
                if (rs1.next()) {
                    totalAmount = rs1.getDouble("t_amount");
                    totalAmount += totalInt;
                }
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return totalAmount;
    }

    public void checkTransaction() {
        try {
            String sql = "select t_date,t_time,t_acccode,t_custcode,t_amount, t_interest,t_balance "
                    + "from cb_transaction_save "
                    + "where t_status in('" + AppConstants.CB_STATUS_SAVE + "','" + AppConstants.CB_STATUS_WITHDRAW + "','" + AppConstants.CB_STATUS_CLOSE_SAVE + "') "
                    + "order by t_custcode, t_date, t_time;";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            double totalAmount = 0;
            String tempCust = "";
            String custCode;
            int count = 0;
            while (rs.next()) {
                count++;
                custCode = rs.getString("t_custcode");
                double t_balance = rs.getDouble("t_balance");
                double t_amount = rs.getDouble("t_amount");

                if (tempCust.equals("")) {
                    tempCust = custCode;
                    totalAmount += t_amount;
                } else if (tempCust.equals(custCode)) {
                    totalAmount += t_amount;
                } else {
                    tempCust = custCode;
                    totalAmount = t_amount;
                }

                if (t_balance != totalAmount) {
                    String sqlUpd = "update cb_transaction_save "
                            + "set t_balance='" + totalAmount + "' "
                            + "where t_custcode='" + rs.getString("t_custcode") + "' "
                            + "and t_acccode='" + rs.getString("t_acccode") + "' "
                            + "and t_time='" + rs.getString("t_time") + "' "
                            + "and t_status in('" + AppConstants.CB_STATUS_SAVE + "','" + AppConstants.CB_STATUS_WITHDRAW + "','" + AppConstants.CB_STATUS_CLOSE_SAVE + "') ";
                    update(sqlUpd);
                }
            }

            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    public void updateProfile(String custCode) {
        try {
            String sql = "select b_cust_code, b_cust_name, b_cust_lastname, b_balance "
                    + "from cb_save_account "
                    + "where b_cust_code='" + custCode + "'";
            try (ResultSet rs = MySQLConnect.getResultSet(sql)) {
                while (rs.next()) {
                    String b_cust_code = rs.getString("b_cust_code");
                    double b_balance = rs.getDouble("b_balance");
                    String sqlUpd = "update cb_profile "
                            + "set save_balance='" + b_balance + "' "
                            + "where p_custcode='" + b_cust_code + "'";
                    update(sqlUpd);
                }
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    public void updateBefore1() {
        //อัพเดตเลขที่บัตรประชาชน            
        try {
            String sql = "select b_cust_code, account_code "
                    + "from cb_save_account "
                    + "order by b_cust_code;";
            try (ResultSet rs = MySQLConnect.getResultSet(sql)) {
                while (rs.next()) {
                    String sql2 = "update cb_transaction_save "
                            + "set t_custcode='" + rs.getString("b_cust_code") + "' "
                            + "where t_acccode='" + rs.getString("account_code") + "'";
                    update(sql2);
                }
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        //อัพเดตยอดเงินแต่ละบัญชี
        try {
            String sql = "select t_custcode, t_acccode, sum(t_amount) t_amount "
                    + "from cb_transaction_save "
                    + "where t_status in('" + AppConstants.CB_STATUS_SAVE + "','" + AppConstants.CB_STATUS_WITHDRAW + "','" + AppConstants.CB_STATUS_CLOSE_SAVE + "') "
                    + "group by t_acccode, t_custcode";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            while (rs.next()) {
                String custCode = rs.getString("t_custcode");
                String accCode = rs.getString("t_acccode");
                String sql2 = "update cb_save_account "
                        + "set b_balance='" + rs.getDouble("t_amount") + "',"
                        + "b_interest='0.00' "
                        + "where b_cust_code='" + custCode + "' "
                        + "and account_code='" + accCode + "'";
                update(sql2);
            }

            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        //update ความเคลื่อนไหว
        try {
            String sql = "select t_custcode, t_acccode, t_amount, LineNo, t_index,t_balance "
                    + "from cb_transaction_save "
                    + "where t_status in('" + AppConstants.CB_STATUS_SAVE + "','" + AppConstants.CB_STATUS_WITHDRAW + "','" + AppConstants.CB_STATUS_CLOSE_SAVE + "') "
                    + "order by t_custcode, t_acccode, t_date, t_time;";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            double totalAmt = 0.00;
            String accCode;
            String accTmp = "";
            while (rs.next()) {
                accCode = rs.getString("t_acccode");
                if (accTmp.equals("")) {
                    accTmp = accCode;
                }
                if (accTmp.equals(accCode)) {
                    totalAmt += rs.getDouble("t_amount");
                } else {
                    accTmp = accCode;
                    totalAmt = rs.getDouble("t_amount");
                }
                String sqlUpd = "update cb_transaction_save set "
                        + "t_balance='" + totalAmt + "',"
                        + "t_interest='0.00' "
                        + "where t_custcode='" + rs.getString("t_custcode") + "' "
                        + "and t_acccode='" + rs.getString("t_acccode") + "' "
                        + "and LineNo='" + rs.getString("LineNo") + "' "
                        + "and t_index='" + rs.getString("t_index") + "'";
                update(sqlUpd);
            }

            //MessageAlert.infoPopup(this.getClass(), "ปรับข้อมูลให้ถูกต้องเรียบร้อยแล้ว");
            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        //update ข้อมูลรวมเงินฝากทุกบัญชี
        try {
            String sql = "select b_cust_code, sum(b_balance) b_balance "
                    + "from cb_save_account "
                    + "group by b_cust_code;";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            while (rs.next()) {
                String sql1 = "update cb_profile "
                        + "set save_balance='" + rs.getDouble("b_balance") + "' "
                        + "where p_custcode='" + rs.getString("b_cust_code") + "'";
                update(sql1);
            }
            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    private void updateInterestDialy(String t_custcode, String t_acccode, double totalInt, String lineNo, String t_docno) {
        try {
            String sqlUpd = "update cb_transaction_save set "
                    + "t_interest='" + totalInt + "' "
                    + "where t_custcode='" + t_custcode + "' "
                    + "and t_acccode='" + t_acccode + "' "
                    + "and lineNo='" + lineNo + "' "
                    + "and t_docno='" + t_docno + "'";
            update(sqlUpd);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    //ทบดอกเบี้ย
    private void updateInterestSaveAccount(String t_custcode, String t_acccode, double totalInt) {
        try {
            String sqlUpd = "update cb_save_account set "
                    + "b_interest='0.00',"
                    + "b_balance=b_balance+" + totalInt + ","
                    + "b_update=curdate(),"
                    + "b_time=curtime() "
                    + "where b_cust_code='" + t_custcode + "' "
                    + "and account_code='" + t_acccode + "' ";
            update(sqlUpd);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    public boolean isExist(String b_cust_code) {
        try {
            String sql = "select * from cb_save_account where b_cust_code='" + b_cust_code + "'";
            try (ResultSet rs = MySQLConnect.getResultSet(sql)) {
                if (rs.next()) {
                    return true;
                }
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return false;
    }

    public void updateBalance(BalanceBean bean) {
        try {
            String sql = "update cb_save_account set "
                    + "B_CUST_CODE='" + bean.getB_CUST_CODE() + "', "
                    + "B_CUST_NAME='" + ThaiUtil.Unicode2ASCII(bean.getB_CUST_NAME()) + "', "
                    + "B_CUST_LASTNAME='" + ThaiUtil.Unicode2ASCII(bean.getB_CUST_LASTNAME()) + "', "
                    + "B_BALANCE=B_BALANCE+" + bean.getB_BALANCE() + " "
                    + "where B_CUST_CODE='" + bean.getB_CUST_CODE() + "'";
            update(sql);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    public BalanceBean findBalanceBeanByCustCode(String Cust_Code) {
        BalanceBean bean = new BalanceBean();
        String sql = "select * from cb_save_account "
                + "where B_Cust_Code='" + Cust_Code + "' ";
        try (ResultSet rs = MySQLConnect.getResultSet(sql)) {
            if (rs.next()) {
                bean.setB_CUST_CODE(rs.getString("B_CUST_CODE"));
                bean.setB_CUST_NAME(ThaiUtil.ASCII2Unicode(rs.getString("B_CUST_NAME")));
                bean.setB_CUST_LASTNAME(ThaiUtil.ASCII2Unicode(rs.getString("B_CUST_LASTNAME")));
                bean.setB_BALANCE(rs.getDouble("B_BALANCE"));
                bean.setB_INTEREST(rs.getDouble("B_INTEREST"));
                bean.setB_START(rs.getDate("B_START"));
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return bean;
    }

    public int getLengDate(String CustCode, String dateEnd) {
        SimpleDateFormat simp = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        String dateString = "";

        String sqlStartDate = "select B_Start from cb_save_account where B_Cust_Code='" + CustCode + "'";
        try (ResultSet rs = MySQLConnect.getResultSet(sqlStartDate)) {
            if (rs.next()) {
                dateString = rs.getString(1);
            }
        } catch (Exception e) {
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        if (dateString.equals("") || dateEnd.equals("")) {
            // ไม่สามารถคำนวณดอกเบี้ยให้ได้ !!!
            System.exit(0);
        }

        SimpleDateFormat sToday = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        dateEnd = sToday.format(new Date());

        CalendarBean c1 = findCalendarBeanByDate(dateString);
        CalendarBean c2 = findCalendarBeanByDate(dateEnd);

        Calendar cStart = Calendar.getInstance();
        Calendar cEnd = Calendar.getInstance();

        cStart.set(c1.getYear(), c1.getMonth(), c1.getDay());
        cEnd.set(c2.getYear(), c2.getMonth(), c2.getDay());

        int dayRunning = 0;
        for (int i = 0; i < 366; i++) {
            String date1 = simp.format(cStart.getTime());
            String date2 = simp.format(cEnd.getTime());
            if (date1.equals(date2)) {
                return dayRunning;
            } else {
                cStart.add(Calendar.DATE, 1);
                dayRunning++;
            }
        }

        return dayRunning;
    }

    public CalendarBean findCalendarBeanByDate(String date) {
        String[] arr = date.split("-");
        String year = arr[0];
        String month = arr[1];
        String day = arr[2];

        int y = NumberFormat.toInt(year);
        int m = NumberFormat.toInt(month) - 1;
        int d = NumberFormat.toInt(day);

        CalendarBean bean = new CalendarBean();
        bean.setYear(y);
        bean.setMonth(m);
        bean.setDay(d);

        return bean;
    }

    public Calendar getCalendar(String date) {
        String[] arr = date.split("-");
        String year = arr[0];
        String month = arr[1];
        String day = arr[2];

        int y = NumberFormat.toInt(year);
        int m = NumberFormat.toInt(month) - 1;
        int d = NumberFormat.toInt(day);

        Calendar c = Calendar.getInstance(Locale.ENGLISH);
        c.set(y, m, d);

        return c;
    }

    public static int getYYYYcountDay() {
        Calendar c = Calendar.getInstance();
        SimpleDateFormat s = new SimpleDateFormat("yyyy", Locale.ENGLISH);
        SimpleDateFormat d = new SimpleDateFormat("dd", Locale.ENGLISH);
        int Y = NumberFormat.toInt(s.format(new Date()));
        c.set(Y, 2, 1);

        c.add(Calendar.DATE, -1);

        int T = NumberFormat.toInt(d.format(c.getTime()));

        int YYYY;
        if (T == 28) {
            YYYY = 365;
        } else {
            YYYY = 366;
        }

        return YYYY;
    }

    public int getYearAtDay(String dateAt) {
        SimpleDateFormat ddMm = new SimpleDateFormat("dd/MM", Locale.ENGLISH);
        SimpleDateFormat yyyy = new SimpleDateFormat("yyyy", Locale.ENGLISH);

        Calendar cStart = Calendar.getInstance(Locale.ENGLISH);
        cStart.set(NumberFormat.toInt(yyyy.format(new Date())), 0, 1);
        int dayRunning = 1;
        for (int i = 0; i < 366; i++) {
            String date1 = ddMm.format(cStart.getTime());
            if (date1.equals(dateAt)) {
                return dayRunning;
            } else {
                cStart.add(Calendar.DATE, 1);
                dayRunning++;
            }
        }

        return dayRunning;
    }

    public int lengDate(String dIn1, String dIn2) {
        SimpleDateFormat simp = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);

        CalendarBean c1 = findCalendarBeanByDate(dIn1);
        CalendarBean c2;
        if (dIn2.equals("now")) {
            c2 = findCalendarBeanByDate(s.format(new Date()));
        } else {
            c2 = findCalendarBeanByDate(dIn2);
        }

        Calendar cStart = Calendar.getInstance(Locale.ENGLISH);
        cStart.set(c1.getYear(), c1.getMonth(), c1.getDay());

        Calendar cEnd = Calendar.getInstance(Locale.ENGLISH);
        cEnd.set(c2.getYear(), c2.getMonth(), c2.getDay());

        int dayRunning = 0;
        for (int i = 0; i < 366; i++) {
            String date1 = simp.format(cStart.getTime());
            String date2 = simp.format(cEnd.getTime());
            if (date1.equals(date2)) {
                return dayRunning;
            } else {
                cStart.add(Calendar.DATE, 1);
                dayRunning++;
            }
        }

        return dayRunning;
    }

    public double getInterest(double Vat, double IC, double balance, int length) {
        double YYYY = getYYYYcountDay();
        double totalInterest = balance * length * IC / (YYYY * 100);
        double totalVat = totalInterest * Vat / 100;
        totalInterest -= totalVat;

        return totalInterest;
    }

    public void updateBalance() {
        int month3 = getYearAtDay("25/03");
        int month6 = getYearAtDay("25/06");
        int month9 = getYearAtDay("25/09");
        int month12 = getYearAtDay("25/12");
        SimpleDateFormat checkDate = new SimpleDateFormat("dd/MM", Locale.ENGLISH);
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);

        try {
            //type1 = DM
            String sql = "select B_CUST_CODE,B_START "
                    + "from cb_save_account "
                    + "where b_start<curdate() "
                    + "and b_update<>curdate() "
                    + "and b_type='T1'";
            ResultSet rs = MySQLConnect.getResultSet(sql);

            SettingFingerControl sc = new SettingFingerControl();
            SettingBean sb = sc.findOne();
            double Vat = 0.00;
            double IC = 0.00;
            if (sb != null) {
                IC = sb.getINTEREST();
                Vat = sb.getVAT();
            } else {
                MessageAlert.infoPopup(this.getClass(), "ท่านยังไม่ได้กำหนดค่าเริ่มต้นระบบ ข้อมูลดอกเบี้ยจะยังไม่ถูกคำนวณ "
                        + "\nกรุณาตรวจสอบตาราง cb_setting");
                return;
            }

            while (rs.next()) {
                String bCustCode = rs.getString("B_CUST_CODE");
                String bStart = rs.getString("B_START");

                CalendarBean c1 = findCalendarBeanByDate(bStart);
                CalendarBean c2 = findCalendarBeanByDate(s.format(new Date()));
                Calendar cStart = Calendar.getInstance(Locale.ENGLISH);
                cStart.set(c1.getYear(), c1.getMonth(), c1.getDay());
                Calendar cEnd = Calendar.getInstance(Locale.ENGLISH);
                cEnd.set(c2.getYear(), c2.getMonth(), c2.getDay());

                double totalInt = 0.00;
                double interest = 0.00;
                double totalBalance = 0.00;
                String docNoTemp = "";
                for (int dayRun = 0; dayRun < 366; dayRun++) {
                    String date1 = s.format(cStart.getTime());
                    String date2 = s.format(cEnd.getTime());

                    String sql2 = "select doc_no, balance, deposit_money "
                            + "from cb_save_transaction "
                            + "where cust_code='" + bCustCode + "' "
                            + "and b_type='T1' "
                            + "and type_code in('DM','WD') "
                            + "and deposit_date='" + date1 + "' "
                            + "order by deposit_date, deposit_time;";
                    ResultSet rs2 = MySQLConnect.getResultSet(sql2);

                    //***************************//
                    double balance = 0.00;
                    double deposit_money = 0.00;

                    while (rs2.next()) {
                        docNoTemp = rs2.getString("doc_no");
                        balance += rs2.getDouble("balance");
                        deposit_money += rs2.getDouble("deposit_money");
                    }

                    totalBalance += deposit_money;
                    if (deposit_money > 0) {
                        interest = getInterest(Vat, IC, deposit_money, 1);
                        String sqlUpd = "update cb_save_transaction "
                                + "set interest='" + interest + "' "
                                + "where doc_no='" + docNoTemp + "' "
                                + "and cust_code='" + bCustCode + "';";
                        update(sqlUpd);
                    }
                    rs2.close();
                    //***************************//

                    if (date1.equals(date2)) {
                        break;
                    } else {
                        totalInt += interest;
                        cStart.add(Calendar.DATE, 1);
                    }

                    int dayCurrentInt = getYearAtDay(checkDate.format(cStart.getTime()));
                    if (dayCurrentInt == month3) {
                        totalBalance += totalInt;
                        totalInt = 0;
                    } else if (dayCurrentInt == month6) {
                        totalBalance += totalInt;
                        totalInt = 0;
                    } else if (dayCurrentInt == month9) {
                        totalBalance += totalInt;
                        totalInt = 0;
                    } else if (dayCurrentInt == month12) {
                        totalBalance += totalInt;
                        totalInt = 0;
                    }
                }

                //update interest
                String sqlUpd = "update cb_save_account "
                        + "set b_interest='" + totalInt + "',"
                        + "b_update=curdate(),"
                        + "b_balance='" + totalBalance + "' "
                        + "where b_cust_code='" + bCustCode + "' "
                        + "and b_type='T1'";
                if (update(sqlUpd) > 0) {
                    String sqlUpd2 = "update cb_save_transaction "
                            + "set interest='" + totalInt + "' "
                            + "where doc_no='" + docNoTemp + "' "
                            + "and cust_code='" + bCustCode + "';";
                    update(sqlUpd2);
                }
            }

            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    public List<PayInterestAmtMapping> getPayInterest(String date) {
        List<PayInterestAmtMapping> listData = new ArrayList();
        String sql = "select sum(t_amount) int_amount, t.*,"
                + "(select concat(concat(b_cust_name, ' '),b_cust_lastname) from cb_save_account p where p.account_code=t.t_acccode limit 0,1) accountName,"
                + "(select b_balance from cb_save_account s where s.account_code=t.t_acccode limit 0,1) b_balance "
                + "from cb_transaction_save t "
                + "where t_booktype='INT' "
                + "and t_date = '" + date + "' "
                + "group by t_acccode "
                + "order by t_custcode, t_acccode, t_date, t_time;";
        try (ResultSet rs = MySQLConnect.getResultSet(sql)) {
            int count = 1;
            while (rs.next()) {
                PayInterestAmtMapping bean = new PayInterestAmtMapping();
                bean.setIndex(count);
                bean.setAccountNo(rs.getString("t_acccode"));
                bean.setAccountName(ThaiUtil.ASCII2Unicode(rs.getString("accountName")));
                bean.setBalanceAmt(rs.getDouble("b_balance"));
                bean.setIntAmt(rs.getDouble("int_amount"));
                bean.setCustCode(rs.getString("t_custcode"));

                listData.add(bean);
                count++;
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return listData;
    }

    public int getMaxBookNo() {
        int maxBookNo = 0;
        String sql0 = "select max(book_no) m_book_no from cb_save_account;";
        try (ResultSet rs = MySQLConnect.getResultSet(sql0)) {
            if (rs.next()) {
                maxBookNo = rs.getInt("m_book_no");
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return maxBookNo;
    }

    public boolean deleteAccountAndBookNo(String accountNo, int bookNo) {
        try {
            String sql = "delete from cb_save_account "
                    + "where account_code='" + accountNo + "' "
                    + "and book_no='" + bookNo + "'";
            MySQLConnect.exeUpdate(sql);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return false;
        }
        return true;
    }

    public List<Object[]> getAccountWhereCustCode(String custCode) {
        List<Object[]> list = new ArrayList();
        String sql = "select b_cust_code,account_code, b_balance,b_fee "
                + "from cb_save_account where b_cust_code='" + custCode + "'";
        try (ResultSet rs1 = MySQLConnect.getResultSet(sql)) {
            while (rs1.next()) {
                list.add(new Object[]{
                    rs1.getString("b_cust_code"),
                    rs1.getString("account_code"),
                    NumberFormat.showDouble2(rs1.getString("b_balance")),
                    NumberFormat.showDouble2(rs1.getString("b_fee"))
                });
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return list;
    }

    public void updateSummaryBalanceFromTransaction(String custCode, String accCode) {
        try {
            String sql1 = "select ifnull(("
                    + "select sum(t_amount) sum_in from cb_transaction_save t1 	"
                    + "where t_custcode=s.b_cust_code and t_acccode=s.account_code "
                    + "and t_status in('" + AppConstants.CB_STATUS_SAVE + "','" + AppConstants.CB_STATUS_ADD_INT + "') "
                    + "order by t_date, t_time"
                    + "),0)+ifnull(("
                    + "select sum(t_amount) sum_out from cb_transaction_save t2 "
                    + "where t_custcode=s.b_cust_code and t_acccode=s.account_code "
                    + "and t_status in('" + AppConstants.CB_STATUS_WITHDRAW + "', '" + AppConstants.CB_STATUS_CLOSE_SAVE + "') order by t_date, t_time"
                    + "),0) total_balance "
                    + "from cb_save_account s where s.b_cust_code='" + custCode + "' and s.account_code='" + accCode + "';";
            double totalBalance;
            try (ResultSet rs = MySQLConnect.getResultSet(sql1)) {
                totalBalance = 0;
                if (rs.next()) {
                    totalBalance = rs.getDouble("total_balance");
                }
            }

            if (totalBalance < 0) {
                totalBalance = 0;
            }

            // update cb_save_account
            String sql2 = "update cb_save_account set b_balance=" + totalBalance + " "
                    + "where b_cust_code='" + custCode + "' and account_code='" + accCode + "';";
            MySQLConnect.exeUpdate(sql2);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    public int updateSummaryBalanceFromTransaction() {
        try {
            String sql = "update cb_save_account ss set "
                    + "b_balance=("
                    + "(select sum(t_amount) sum_in from cb_transaction_save "
                    + "where t_status in('" + AppConstants.CB_STATUS_SAVE + "','" + AppConstants.CB_STATUS_ADD_INT + "') and t_custcode=ss.b_cust_code and t_acccode=ss.account_code)+"
                    + "(select sum(t_amount) sum_out from cb_transaction_save "
                    + "where t_status in('" + AppConstants.CB_STATUS_WITHDRAW + "', '" + AppConstants.CB_STATUS_CLOSE_SAVE + "') and t_custcode=ss.b_cust_code and t_acccode=ss.account_code)"
                    + ") where ss.account_code <> ''";
            logger.info(sql);
            return MySQLConnect.exeUpdate(sql);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
        return 0;
    }

    public void updateSaveAccountAndProfile(double netBalance, double textInt, String custCode, String accCode) {
        try {
            String sql = "update cb_save_account "
                    + "set b_balance='" + netBalance + "',"
                    + "b_interest='" + textInt + "' "
                    + "where b_cust_code='" + custCode + "' and account_code='" + accCode + "'";
            MySQLConnect.exeUpdate(sql);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    public void updateSaveAccountInProfile(String accCode, String custCode) {
        try {
            String sql1 = "update cb_profile p set p.save_balance=("
                    + "select sum(s.b_balance) from cb_save_account s "
                    + "where s.b_cust_code=p.p_custcode "
                    + "and s.account_code='" + accCode + "'"
                    + ") where p.p_custcode='" + custCode + "';";
            MySQLConnect.exeUpdate(sql1);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    public void updateAccountStatusAndRemark(String CB_STATUS_CLOSE_SAVE, String remark, String account_code) {
        try {
            String sql = "update cb_save_account set "
                    + "B_Balance = '0.00',"
                    + "B_Update=curdate(),"
                    + "account_status='" + CB_STATUS_CLOSE_SAVE + "',"
                    + "remark='" + ThaiUtil.Unicode2ASCII(remark) + "' "
                    + "where account_code='" + account_code + "'";
            MySQLConnect.exeUpdate(sql);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    public void updateBalanceByAccountCode(String dMoney, String account_code) {
        try {
            String sql = "update cb_save_account set B_Balance = B_Balance+" + dMoney + " "
                    + "where account_code='" + account_code + "'";
            MySQLConnect.exeUpdate(sql);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }
}
