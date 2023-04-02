package th.co.cbank.project.control;

import th.co.cbank.project.model.ConfigBean;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.apache.log4j.Logger;
import th.co.cbank.util.DateFormat;
import th.co.cbank.util.MessageAlert;
import th.co.cbank.util.ThaiUtil;

public class ConfigControl extends BaseControl {

    private final Logger logger = Logger.getLogger(ConfigControl.class);
    private SimpleDateFormat simp = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);

    public List<ConfigBean> mappingBean(ResultSet rs) throws Exception {
        List<ConfigBean> listBean = new ArrayList<>();
        while (rs.next()) {
            ConfigBean bean = new ConfigBean();
            bean.setSaveDocType(rs.getString("SaveDocType"));
            bean.setSaveDocPrefix(rs.getString("SaveDocPrefix"));
            bean.setSaveDocRunning(rs.getInt("SaveDocRunning"));
            bean.setHoonDocType(rs.getString("HoonDocType"));
            bean.setHoonDocPrefix(rs.getString("HoonDocPrefix"));
            bean.setHoonDocRunning(rs.getInt("HoonDocRunning"));
            bean.setLoanDocType(rs.getString("LoanDocType"));
            bean.setLoanDocPrefix(rs.getString("LoanDocPrefix"));
            bean.setLoanDocRunning(rs.getInt("LoanDocRunning"));
            bean.setPrinterPassBook(rs.getString("PrinterPassBook"));
            bean.setPrintSlipType(rs.getString("PrintSlipType"));
            bean.setPrintSlipDriverName(rs.getString("PrintSlipDriverName"));
            bean.setPrintSlipPort(rs.getString("PrintSlipPort"));
            bean.setAccountDocType(rs.getString("AccountDocType"));
            bean.setAccountPrefix(rs.getString("AccountPrefix"));
            bean.setAccountRunning(rs.getInt("AccountRunning"));
            bean.setProgramStartDate(rs.getDate("ProgramStart"));
            bean.setNoteNo(rs.getInt("NoteNo"));
            bean.setBranchPrefix(rs.getString("BranchPrefix"));
            bean.setWithdrawDocPrefix(rs.getString("WithdrawDocPrefix"));
            bean.setWithdrawDocRunning(rs.getInt("WithdrawDocRunning"));
            bean.setIntDocPrefix(rs.getString("IntDocPrefix"));
            bean.setIntDocRunning(rs.getInt("IntDocRunning"));
            bean.setHoonSaleDocPrefix(rs.getString("HoonSaleDocPrefix"));
            bean.setHoonSaleDocRunning(rs.getInt("HoonSaleDocRunning"));
            bean.setCompoundDocPrefix(rs.getString("CompoundDocPrefix"));
            bean.setCompoundDocRunning(rs.getInt("CompoundDocRunning"));
            bean.setPaymentDocPrefix(rs.getString("PaymentDocPrefix"));
            bean.setPaymentDocRunning(rs.getInt("PaymentDocRunning"));
            bean.setFeePrefix(rs.getString("FeePrefix"));
            bean.setFeeRunning(rs.getInt("FeeRunning"));
            bean.setFeeAmt(rs.getDouble("FeeAmt"));
            bean.setHoonTransferDocPrefix(rs.getString("HoonTransferDocPrefix"));
            bean.setHoonTransferDocRunning(rs.getInt("HoonTransferDocRunning"));
            bean.setBookSpec(rs.getInt("BookSpec"));

            listBean.add(bean);
        }
        rs.close();
        return listBean;
    }

    public List<ConfigBean> listConfig() {
        try {
            String sql = "select * from cb_config";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return new ArrayList();
        }
    }

    public ConfigBean getConfigBean() {
        try {
            String sql = "select * from cb_config";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            List<ConfigBean> listBean = mappingBean(rs);
            if (listBean.isEmpty()) {
                return new ConfigBean();
            }
            return listBean.get(0);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return new ConfigBean();
        }
    }

    public boolean saveConfig(ConfigBean bean) {
        try {
            String sql = "insert into cb_config "
                    + "(SaveDocType,SaveDocPrefix,SaveDocRunning,HoonDocType,HoonDocPrefix,HoonDocRunning,"
                    + "LoanDocType,LoanDocPrefix,LoanDocRunning,PrinterPassBook,PrintSlipType,PrintSlipDriverName,"
                    + "PrintSlipPort,AccountPrefix,AccountRunning,AccountDocType,ProgramStart,NoteNo,BranchPrefix,"
                    + "WithdrawDocPrefix,WithdrawDocRunning,IntDocPrefix,IntDocRunning,"
                    + "HoonSaleDocPrefix,HoonSaleDocRunning,CompoundDocPrefix,CompoundDocRunning,"
                    + "PaymentDocPrefix, PaymentDocRunning, FeePrefix, FeeRunning, FeeAmt, "
                    + "HoonTransferDocPrefix, HoonTransferDocRunning, BookSpec) "
                    + "values('" + bean.getSaveDocType() + "','" + bean.getSaveDocPrefix() + "',"
                    + "'" + bean.getSaveDocRunning() + "','" + bean.getHoonDocType() + "',"
                    + "'" + bean.getHoonDocPrefix() + "','" + bean.getHoonDocRunning() + "',"
                    + "'" + bean.getLoanDocType() + "','" + bean.getLoanDocPrefix() + "',"
                    + "'" + bean.getLoanDocRunning() + "','" + ThaiUtil.Unicode2ASCII(bean.getPrinterPassBook()) + "',"
                    + "'" + bean.getPrintSlipType() + "','" + ThaiUtil.Unicode2ASCII(bean.getPrintSlipDriverName()) + "',"
                    + "'" + bean.getPrintSlipPort() + "','" + bean.getAccountPrefix() + "',"
                    + "'" + bean.getAccountRunning() + "','" + bean.getAccountDocType() + "',"
                    + "'" + DateFormat.getMySQL_Date(bean.getProgramStartDate()) + "','" + bean.getNoteNo() + "','" + bean.getBranchPrefix() + "',"
                    + "'" + bean.getWithdrawDocPrefix() + "','" + bean.getWithdrawDocRunning() + "',"
                    + "'" + bean.getIntDocPrefix() + "','" + bean.getIntDocRunning() + "',"
                    + "'" + bean.getHoonSaleDocPrefix() + "','" + bean.getHoonSaleDocRunning() + "',"
                    + "'" + bean.getCompoundDocPrefix() + "','" + bean.getCompoundDocRunning() + "',"
                    + "'" + bean.getPaymentDocPrefix() + "','" + bean.getPaymentDocRunning() + "',"
                    + "'" + bean.getFeePrefix() + "','" + bean.getFeeRunning() + "','" + bean.getFeeAmt() + "',"
                    + "'" + bean.getHoonTransferDocPrefix() + "','" + bean.getHoonTransferDocRunning() + "',"
                    + "'" + bean.getBookSpec() + "')";
            String sqlChk = "select * from cb_config";
            ResultSet rs = MySQLConnect.getResultSet(sqlChk);
            if (rs.next()) {
                return updateConfig(bean);
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

    public boolean updateConfig(ConfigBean bean) {
        try {
            String sql = "update cb_config set "
                    + "SaveDocType='" + bean.getSaveDocType() + "', "
                    + "SaveDocPrefix='" + bean.getSaveDocPrefix() + "', "
                    + "SaveDocRunning='" + bean.getSaveDocRunning() + "', "
                    + "HoonDocType='" + bean.getHoonDocType() + "', "
                    + "HoonDocPrefix='" + bean.getHoonDocPrefix() + "', "
                    + "HoonDocRunning='" + bean.getHoonDocRunning() + "', "
                    + "LoanDocType='" + bean.getLoanDocType() + "', "
                    + "LoanDocPrefix='" + bean.getLoanDocPrefix() + "', "
                    + "LoanDocRunning='" + bean.getLoanDocRunning() + "', "
                    + "PrinterPassBook='" + bean.getPrinterPassBook() + "', "
                    + "PrintSlipType='" + bean.getPrintSlipType() + "', "
                    + "PrintSlipDriverName='" + bean.getPrintSlipDriverName() + "', "
                    + "PrintSlipPort='" + bean.getPrintSlipPort() + "', "
                    + "AccountPrefix='" + bean.getAccountPrefix() + "', "
                    + "AccountRunning='" + bean.getAccountRunning() + "', "
                    + "AccountDocType='" + bean.getAccountDocType() + "', "
                    + "ProgramStart='" + DateFormat.getMySQL_Date(bean.getProgramStartDate()) + "', "
                    + "NoteNo='" + bean.getNoteNo() + "', "
                    + "BranchPrefix='" + bean.getBranchPrefix() + "', "
                    + "WithdrawDocPrefix='" + bean.getWithdrawDocPrefix() + "', "
                    + "WithdrawDocRunning='" + bean.getWithdrawDocRunning() + "', "
                    + "IntDocPrefix='" + bean.getIntDocPrefix() + "', "
                    + "IntDocRunning='" + bean.getIntDocRunning() + "', "
                    + "HoonSaleDocPrefix='" + bean.getHoonSaleDocPrefix() + "', "
                    + "HoonSaleDocRunning='" + bean.getHoonSaleDocRunning() + "', "
                    + "CompoundDocPrefix='" + bean.getCompoundDocPrefix() + "', "
                    + "CompoundDocRunning='" + bean.getCompoundDocRunning() + "',"
                    + "PaymentDocPrefix='" + bean.getPaymentDocPrefix() + "',"
                    + "PaymentDocRunning='" + bean.getPaymentDocRunning() + "',"
                    + "FeePrefix='" + bean.getFeePrefix() + "',"
                    + "FeeRunning='" + bean.getFeeRunning() + "',"
                    + "FeeAmt='" + bean.getFeeAmt() + "',"
                    + "HoonTransferDocPrefix='" + bean.getHoonTransferDocPrefix() + "',"
                    + "BookSpec='" + bean.getBookSpec() + "',"
                    + "HoonTransferDocRunning='" + bean.getHoonTransferDocRunning() + "' ";
            update(sql);
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
        return false;
    }

    public boolean updateLoanDocRunning() {
        try {
            MySQLConnect.exeUpdate("update cb_config set LoanDocRunning=LoanDocRunning+1");
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
        return false;
    }

    public boolean updateFeeRunning() {
        try {
            String sql = "update cb_config set FeeRunning=FeeRunning+1";
            return MySQLConnect.exeUpdate(sql) > 0;
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
        return false;
    }

    public void resetLoanConfig(String loanCode) {
        try {
            MySQLConnect.exeUpdate("update cb_config set loanDocRunning='1'");
            MySQLConnect.exeUpdate("update cb_loan_config set loanRunning='1',bookNo='1' where loanCode='" + loanCode + "'");
            MySQLConnect.exeUpdate("delete from cb_loan_account");
            MySQLConnect.exeUpdate("delete from cb_loan_table_payment");
            MySQLConnect.exeUpdate("delete from cb_transaction_loan");
            MySQLConnect.exeUpdate("update cb_profile set loan_balance=0, loan_credit_amt=0, loan_credit_balance=0");
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    public void resetDB() {
        try {
            String sql = "update cb_profile set "
                    + "Hoon_Qty='0',"
                    + "Member_Point='0',"
                    + "AR_Balance='0.00',"
                    + "Save_Balance='0.00',"
                    + "Loan_Balance='0.00',"
                    + "Loan_Credit_Balance=Loan_Credit_Amt,"
                    + "status='" + ThaiUtil.Unicode2ASCII("ยังไม่เปิดบัญชี") + "',"
                    + "dow_incar_rai='0', dow_incar_tree='0',p_down_fee='0',p_prefix='¤Ø³' ";
            MySQLConnect.exeUpdate(sql);
            MySQLConnect.exeUpdate("update cb_save_config set SaveRunning='1',NoRunning='1'");
            MySQLConnect.exeUpdate("truncate cb_save_account");
            MySQLConnect.exeUpdate("truncate cb_transaction_save");
            MySQLConnect.exeUpdate("truncate cb_transaction_loan");
            MySQLConnect.exeUpdate("truncate cb_loan_account");
            MySQLConnect.exeUpdate("truncate cb_loan_table");
            MySQLConnect.exeUpdate("truncate cb_loan_transaction");
            MySQLConnect.exeUpdate("update cb_loan_config set LoanRunning='1',BookNo='1'");
            MySQLConnect.exeUpdate("delete from cb_bondsman");
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    public void updateWithdrawDocRunning() {
        try {
            MySQLConnect.exeUpdate("update cb_config set WithdrawDocRunning=WithdrawDocRunning+1");
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

}
