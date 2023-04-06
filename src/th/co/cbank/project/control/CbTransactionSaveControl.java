package th.co.cbank.project.control;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.log4j.Logger;
import th.co.cbank.project.constants.AppConstants;
import th.co.cbank.util.DateFormat;
import th.co.cbank.project.model.CbTransactionSaveBean;
import th.co.cbank.util.MessageAlert;
import th.co.cbank.util.NumberFormat;
import th.co.cbank.util.StringUtil;
import th.co.cbank.util.ThaiUtil;

public class CbTransactionSaveControl extends BaseControl {

    private final Logger logger = Logger.getLogger(CbTransactionSaveControl.class);

    public List<CbTransactionSaveBean> mappingListBean(ResultSet rs) throws Exception {
        List<CbTransactionSaveBean> listBean = new ArrayList<>();
        while (rs.next()) {
            CbTransactionSaveBean bean = mappingBean(rs);
            if (bean != null) {
                listBean.add(bean);
            }
        }
        rs.close();
        return listBean;
    }

    public CbTransactionSaveBean mappingBean(ResultSet rs) throws Exception {
        CbTransactionSaveBean bean = new CbTransactionSaveBean();
        bean.setT_date(rs.getDate("T_date"));
        bean.setT_time(rs.getString("T_time"));
        bean.setT_acccode(rs.getString("T_acccode"));
        bean.setT_custcode(rs.getString("T_custcode"));
        bean.setT_description(ThaiUtil.ASCII2Unicode(rs.getString("T_description")));
        bean.setT_amount(rs.getDouble("T_amount"));
        bean.setT_empcode(rs.getString("T_empcode"));
        bean.setT_docno(rs.getString("t_docno"));
        bean.setRemark(ThaiUtil.ASCII2Unicode(rs.getString("remark")));
        bean.setT_booktype(rs.getString("T_booktype"));
        bean.setT_hoon(rs.getInt("t_hoon"));
        bean.setLineNo(rs.getInt("LineNo"));
        bean.setPrintChk(rs.getString("PrintChk"));
        bean.setT_balance(rs.getDouble("t_balance"));
        bean.setT_index(rs.getInt("t_index"));
        bean.setMoney_in(rs.getDouble("money_in"));
        bean.setMoney_out(rs.getDouble("money_out"));
        bean.setUpdate_interest(rs.getDate("update_interest"));
        bean.setT_hoon_amt(rs.getDouble("t_hoon_amt"));
        bean.setT_hoon_cash(rs.getDouble("t_hoon_cash"));
        bean.setT_hoon_ton(rs.getDouble("t_hoon_ton"));
        bean.setT_hoon_rate(rs.getDouble("t_hoon_rate"));
        bean.setBranchCode(rs.getString("branch_code"));
        bean.setT_interest(rs.getDouble("t_interest"));
        bean.setT_fee(rs.getDouble("t_fee"));
        bean.setT_status(rs.getString("t_status"));
        return bean;
    }

    public List<CbTransactionSaveBean> listCbTransactionSave() {
        try {
            String sql = "select * from cb_transaction_save";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingListBean(rs);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return new ArrayList();
        }
    }

    public List<CbTransactionSaveBean> listTransactionSave(String accountCode) {
        try {
            String sql = "select * from cb_transaction_save where 1=1 "
                    + "and t_acccode='" + accountCode + "' "
                    + "and t_status in('" + AppConstants.CB_STATUS_SAVE + "','" + AppConstants.CB_STATUS_WITHDRAW + "',"
                    + "'" + AppConstants.CB_STATUS_CLOSE_SAVE + "', '" + AppConstants.CB_STATUS_ADD_INT + "') "
                    + "order by t_date desc,t_time desc ";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingListBean(rs);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return new ArrayList();
        }
    }

    public List<CbTransactionSaveBean> listCbTransactionSave(String date1, String date2) {
        try {
            String sql = "select * from cb_transaction_save "
                    + "where T_date between '" + date1 + "' and '" + date2 + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingListBean(rs);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return new ArrayList();
        }
    }

    public List<CbTransactionSaveBean> getTransactionSave(String t_custcode, String t_acccode) {
        try {
            String sql = "select * from cb_transaction_save "
                    + "where t_custcode='" + t_custcode + "' "
                    + "and t_acccode='" + t_acccode + "' "
                    + "and t_status in('" + AppConstants.CB_STATUS_SAVE + "',"
                    + "'" + AppConstants.CB_STATUS_WITHDRAW + "',"
                    + "'" + AppConstants.CB_STATUS_CLOSE_SAVE + "') "
                    + "order by t_date, t_time";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingListBean(rs);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return new ArrayList();
        }
    }

    public List<CbTransactionSaveBean> getTransaction(String t_custcode, String t_acccode, Date t_date) {
        try {
            String sql = "select * from cb_transaction_save "
                    + "where t_custcode='" + t_custcode + "' "
                    + "and t_acccode='" + t_acccode + "' and t_date='" + DateFormat.getMySQL_Date(t_date) + "' "
                    + "and t_status in('" + AppConstants.CB_STATUS_SAVE + "',"
                    + "'" + AppConstants.CB_STATUS_WITHDRAW + "',"
                    + "'" + AppConstants.CB_STATUS_CLOSE_SAVE + "') "
                    + "order by t_date, t_time";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingListBean(rs);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return new ArrayList();
        }
    }

    public List<CbTransactionSaveBean> getTransactionByBookType(String acccode, String booktype1, String booktype2) {
        try {
            String sql = "select * from cb_transaction_save "
                    + "where t_acccode='" + acccode + "' "
                    + "and printchk='N' and LineNo>0 and t_booktype not in"
                    + "('" + booktype1 + "','" + booktype2 + "') order by t_index;";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingListBean(rs);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return new ArrayList();
        }
    }

    public List<CbTransactionSaveBean> listCbTransactionSaveAll(String accCode) {
        try {
            String sql = "select * from cb_transaction_save "
                    + "where t_acccode='" + accCode + "' "
                    + "and LineNo>0 and PrintChk='N' "
                    + "and t_status in('" + AppConstants.CB_STATUS_SAVE + "','" + AppConstants.CB_STATUS_WITHDRAW + "','" + AppConstants.CB_STATUS_CLOSE_SAVE + "') order by t_index";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingListBean(rs);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return new ArrayList();
        }
    }

    public List<CbTransactionSaveBean> listCbTransactionSaveAllAddStatus11(String accCode) {
        try {
            String sql = "select * from cb_transaction_save "
                    + "where t_acccode='" + accCode + "' "
                    + "and PrintChk='N' "
                    + "and t_status in('" + AppConstants.CB_STATUS_SAVE + "','" + AppConstants.CB_STATUS_WITHDRAW + "',"
                    + "'" + AppConstants.CB_STATUS_CLOSE_SAVE + "', '" + AppConstants.CB_STATUS_ADD_INT + "') "
                    + "order by t_date, t_time, LineNo";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingListBean(rs);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return new ArrayList();
        }
    }

    public CbTransactionSaveBean findOneByCustCode(String T_custcode) {
        try {
            String sql = "select * from cb_transaction_save where T_custcode='" + T_custcode + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            List<CbTransactionSaveBean> listBean = mappingListBean(rs);
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

    public CbTransactionSaveBean findOneByDocNo(String T_DocNO) {
        try {
            String sql = "select * from cb_transaction_save where t_docno='" + T_DocNO + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            List<CbTransactionSaveBean> listBean = mappingListBean(rs);
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

    public boolean saveCbTransactionSave(CbTransactionSaveBean bean) {
        if (bean.getT_date() == null) {
            bean.setT_date(new Date());
        }
        try {
            String sql = "insert into cb_transaction_save "
                    + "(t_date,t_time,t_acccode,t_custcode,t_description,t_amount,t_empcode,t_docno,remark,"
                    + "t_booktype,t_hoon,LineNo,PrintChk,t_balance,t_index,money_in,money_out,update_interest,"
                    + "t_hoon_amt,t_hoon_ton,t_hoon_cash,t_hoon_rate,branch_code,t_interest,t_fee,t_status)  "
                    + "values('" + DateFormat.getMySQL_Date(bean.getT_date()) + "',curtime(),"
                    + "'" + bean.getT_acccode() + "','" + bean.getT_custcode() + "',"
                    + "'" + ThaiUtil.Unicode2ASCII(bean.getT_description()) + "','" + bean.getT_amount() + "',"
                    + "'" + bean.getT_empcode() + "','" + bean.getT_docno() + "',"
                    + "'" + ThaiUtil.Unicode2ASCII(bean.getRemark()) + "','" + bean.getT_booktype() + "',"
                    + "'" + bean.getT_hoon() + "','" + bean.getLineNo() + "',"
                    + "'" + bean.getPrintChk() + "','" + bean.getT_balance() + "','" + bean.getT_index() + "',"
                    + "'" + bean.getMoney_in() + "','" + bean.getMoney_out() + "',curdate(),"
                    + "'" + bean.getT_hoon_amt() + "','" + bean.getT_hoon_ton() + "','" + bean.getT_hoon_cash() + "',"
                    + "'" + bean.getT_hoon_rate() + "','" + bean.getBranchCode() + "','" + bean.getT_interest() + "',"
                    + "'" + bean.getT_fee() + "','" + bean.getT_status() + "')";
            String sqlChk = "select t_date from cb_transaction_save "
                    + "where t_docno='" + bean.getT_docno() + "' "
                    + "and t_custcode='" + bean.getT_custcode() + "' "
                    + "and t_acccode='" + bean.getT_acccode() + "' "
                    + "and t_date='" + DateFormat.getMySQL_Date(bean.getT_date()) + "' "
                    + "and t_booktype='INT'";
            ResultSet rs = MySQLConnect.getResultSet(sqlChk);
            if (rs.next()) {
                String sqlDel = "delete from cb_transaction_save "
                        + "where t_docno='" + bean.getT_docno() + "' "
                        + "and t_custcode='" + bean.getT_custcode() + "' "
                        + "and t_acccode='" + bean.getT_acccode() + "' "
                        + "and t_date='" + DateFormat.getMySQL_Date(bean.getT_date()) + "' "
                        + "and t_booktype='INT'";
                update(sqlDel);
            }
            rs.close();

            update(sql);
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return false;
        }
    }

    public int getLineByAccount(String AccCode) {
        int LineMax = 1;
        try {
            String sql = "select max(t_index)+1 as MaxLineNO "
                    + "from cb_transaction_save where t_acccode='" + AccCode + "' ";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                LineMax = rs.getInt("MaxLineNO");
                if (LineMax > 24) {
                    LineMax = LineMax % 24;
                }
            }

            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        if (LineMax == 0) {
            LineMax = 1;
        }

        return LineMax;
    }

    public int getMaxIndex(String AccCode) {
        int LineMax = 1;
        try {
            String sql = "select max(t_index)+1 as MaxLineNO "
                    + "from cb_transaction_save where t_acccode='" + AccCode + "' ";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                LineMax = rs.getInt("MaxLineNO");
            }

            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        if (LineMax == 0) {
            LineMax = 1;
        }

        return LineMax;
    }

    public void updateLinePrint(String t_acccode, int lineNo, String t_date, int t_index) {
        try {
            String sql = "update cb_transaction_save set "
                    + "PrintChk='Y' where t_acccode='" + t_acccode + "' "
                    + "and lineNo='" + lineNo + "' "
                    + "and t_date='" + t_date + "' "
                    + "and t_index=" + t_index + "";
            int result = update(sql);
            System.out.println(result);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    public void updateLoanLinePrint(String t_acccode, int lineNo, String t_date) {
        try {
            String sql = "update cb_transaction_loan set PrintChk='Y' "
                    + "where t_acccode='" + t_acccode + "' "
                    + "and lineNo='" + lineNo + "' and t_date='" + t_date + "'";
            update(sql);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    public void deleteData(String custCode, String accCode) {
        try {
            String sql1 = "delete from cb_transaction_save "
                    + "where t_custcode='" + custCode + "' "
                    + "and t_acccode='" + accCode + "' and t_booktype='INT'";
            update(sql1);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    public List<Object[]> getTransactionListWhereCustCode(String custCode) {
        List<Object[]> list = new ArrayList();
        try {
            String sql = "select t_date, t_time, t_custcode, t_acccode, t_balance, "
                    + "t_amount,money_in,money_out,t_fee,t_description, t_status "
                    + "from cb_transaction_save where t_custcode='" + custCode + "' "
                    + "order by t_date, t_time";
            ResultSet rs1 = MySQLConnect.getResultSet(sql);
            while (rs1.next()) {
                list.add(new Object[]{
                    rs1.getString("t_acccode"),
                    rs1.getString("t_date") + " " + rs1.getString("t_time"),
                    ThaiUtil.ASCII2Unicode(rs1.getString("t_description")),
                    rs1.getString("t_status").equals("4") ? NumberFormat.showDouble2(rs1.getString("t_amount")) : 0,
                    NumberFormat.showDouble2(rs1.getString("money_in")),
                    NumberFormat.showDouble2(rs1.getString("money_out")),
                    NumberFormat.showDouble2(rs1.getString("t_fee")),
                    NumberFormat.showDouble2(rs1.getString("t_balance"))
                });
            }
            rs1.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return list;
    }

    public List<CbTransactionSaveBean> listSavingBookTransactionByAcccode(String accCode, String custCode) {
        try {
            String sql = "select * from cb_transaction_save "
                    + "where t_acccode='" + accCode + "' and t_custcode='" + custCode + "' "
                    + "and t_status in('2','3','8', '11') order by t_date, t_time, LineNo";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingListBean(rs);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return new ArrayList();
        }
    }

    public boolean updateStateTable(CbTransactionSaveBean bean, int lineNoOld, String t_date) {
        try {
            String sql = "UPDATE cb_transaction_save "
                    + "SET PrintChk= 'N', LineNo='" + bean.getLineNo() + "',"
                    + "t_index='" + bean.getT_index() + "' "
                    + "WHERE t_acccode='" + bean.getT_acccode() + "' "
                    + "AND LineNo='" + lineNoOld + "' AND t_docno='" + bean.getT_docno() + "' "
                    + "AND t_booktype='" + bean.getT_booktype() + "' AND t_date='" + t_date + "'";
            return MySQLConnect.exeUpdate(sql) > 0;
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
        return false;
    }

    public boolean updateStateTable2(CbTransactionSaveBean bean, int lineNoOld, String t_date) {
        try {
            String sql = "UPDATE cb_transaction_save "
                    + "SET LineNo='" + bean.getLineNo() + "', t_index='" + bean.getT_index() + "' "
                    + "WHERE t_acccode='" + bean.getT_acccode() + "' "
                    + "AND LineNo='" + lineNoOld + "' AND t_docno='" + bean.getT_docno() + "' "
                    + "AND t_booktype='" + bean.getT_booktype() + "' AND t_date='" + t_date + "'";
            MySQLConnect.exeUpdate(sql);
            return MySQLConnect.exeUpdate(sql) > 0;
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
        return false;
    }

    public List<CbTransactionSaveBean> listAllByAccountCode(String txtAccCode, String loanDocPrefix) {
        try {
            String sql = "select * from cb_transaction_save "
                    + "where t_acccode='" + txtAccCode + "' and LineNo>0 "
                    + "and printchk='N' and t_booktype<>'" + loanDocPrefix + "' "
                    + "order by t_index";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingListBean(rs);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return new ArrayList();
        }
    }

    public void updateWhereBookTypeNotIn(String txtAccCode, String loanDocPrefix, String paymentDocPrefix) {
        try {
            String sql = "update cb_transaction_save "
                    + "set PrintChk='Y' where t_acccode='" + txtAccCode + "' "
                    + "and printChk='N' and t_booktype not in"
                    + "('" + loanDocPrefix + "','" + paymentDocPrefix + "') ";
            MySQLConnect.exeUpdate(sql);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    public void updateWhereBookTypeNotInAndLineNo(String acccode, String lineNo, String booktype) {
        try {
            String sql = "update cb_transaction_save "
                    + "set PrintChk='Y' where t_acccode='" + acccode + "' "
                    + "and lineNo='" + lineNo + "' "
                    + "and printChk='N' and t_booktype<>'" + booktype + "' ";
            MySQLConnect.exeUpdate(sql);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    public void updateWhereCustCodeAccode(double balance, String custCode, String accCode, String t_docno, String t_time) {
        try {
            String sql = "update cb_transaction_save set "
                    + "t_balance='" + balance + "' where t_custcode='" + custCode + "' "
                    + "and t_acccode='" + accCode + "' and t_docno='" + t_docno + "' "
                    + "and t_time='" + t_time + "' and t_status in('2','3','8')";
            MySQLConnect.exeUpdate(sql);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    public List<CbTransactionSaveBean> getTdateList(String custCode, String accCode) {
        List<CbTransactionSaveBean> listBean = new ArrayList<>();
        String sql = "select t_date from cb_transaction_save where t_status in('2','3','8') "
                + "and t_custcode='" + custCode + "' and t_acccode='" + accCode + "' "
                + "group by t_date order by t_date, t_time";
        try (ResultSet rs = MySQLConnect.getResultSet(sql)) {
            while (rs.next()) {
                CbTransactionSaveBean bean = new CbTransactionSaveBean();
                bean.setT_date(rs.getDate("t_date"));

                listBean.add(bean);
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
        return listBean;
    }

    public List<CbTransactionSaveBean> getListByAccoundCode(String accCode, String custCode) {
        List<CbTransactionSaveBean> listBean = new ArrayList<>();
        try {
            String sql = "select * from cb_transaction_save "
                    + "where t_acccode='" + accCode + "' and t_custcode='" + custCode + "' "
                    + "and t_status in('" + AppConstants.CB_STATUS_SAVE + "','" + AppConstants.CB_STATUS_WITHDRAW + "',"
                    + "'" + AppConstants.CB_STATUS_CLOSE_SAVE + "', '" + AppConstants.CB_STATUS_ADD_INT + "') order by t_date, t_time";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            while (rs.next()) {
                CbTransactionSaveBean bean = mappingBean(rs);
                listBean.add(bean);
            }
            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return listBean;
    }

    public void updateWhereAccountAndStatus(int line_no, int t_index, String accCode, String t_date, String t_time) {
        try {
            MySQLConnect.exeUpdate("update cb_transaction_save "
                    + "set LineNo=" + line_no + ", t_index='" + t_index + "' where t_acccode='" + accCode + "' "
                    + "and t_date='" + t_date + "' and t_time='" + t_time + "' "
                    + "and t_status in('" + AppConstants.CB_STATUS_SAVE + "','" + AppConstants.CB_STATUS_WITHDRAW + "',"
                    + "'" + AppConstants.CB_STATUS_CLOSE_SAVE + "', '" + AppConstants.CB_STATUS_ADD_INT + "') order by t_date, t_time");
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }
}
