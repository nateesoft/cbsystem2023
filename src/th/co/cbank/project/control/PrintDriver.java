package th.co.cbank.project.control;

import th.co.cbank.project.model.ConfigBean;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import org.apache.log4j.Logger;
import th.co.cbank.project.constants.AppConstants;
import th.co.cbank.util.NumberFormat;
import th.co.cbank.project.model.BranchBean;
import th.co.cbank.project.model.CbFeeTransactionBean;
import th.co.cbank.project.model.CbTransactionLoanBean;
import th.co.cbank.project.model.CbFeeBean;
import th.co.cbank.project.model.CbLoanAccountBean;
import th.co.cbank.project.model.CbLoanConfigBean;
import th.co.cbank.project.model.CbUserBean;
import th.co.cbank.project.model.ProfileBean;
import th.co.cbank.util.MessageAlert;

public final class PrintDriver extends BaseControl {

    private final Logger logger = Logger.getLogger(PrintDriver.class);
    private final CbLoanAccountControl cbLoanAccountControl = new CbLoanAccountControl();
    private final CbLoanConfigControl cbLoanConfigControl = new CbLoanConfigControl();
    private final CbFeeTransactionControl feeTransactionControl = new CbFeeTransactionControl();
    private final BranchControl branchControl = new BranchControl();
    private final ProfileControl profileControl = new ProfileControl();
    private final CbUserControl userControl = new CbUserControl();
    private final CbFeeControl cbFeeControl = new CbFeeControl();
    private final ConfigControl configControl = new ConfigControl();

    private final SimpleDateFormat sDate = new SimpleDateFormat("dd/MM/yyyy");
    private final SimpleDateFormat sTime = new SimpleDateFormat("HH:mm:ss");

    public void p(String printMsg) {
        System.out.println(printMsg);
    }

    private String getRunning(int run) {
        if (run < 10) {
            return "000000" + run;
        } else if (run < 100) {
            return "00000" + run;
        } else if (run < 1000) {
            return "0000" + run;
        } else if (run < 10000) {
            return "000" + run;
        } else if (run < 100000) {
            return "00" + run;
        } else if (run < 1000000) {
            return "0" + run;
        } else {
            return "" + run;
        }
    }

    public void printPaymentLoan(CbTransactionLoanBean cbTransactionLoanBean) {
        CbLoanAccountBean cbLoanAccountBean = cbLoanAccountControl.findOneByLoanDocNo(cbTransactionLoanBean.getT_acccode());
        CbLoanConfigBean cbLoanConfigBean = cbLoanConfigControl.findOneByLoanTypeCode(cbLoanAccountBean.getLoan_type());
        BranchBean branchBean = branchControl.getData();
        ProfileBean profileBean = profileControl.findOneByCustCode(cbTransactionLoanBean.getT_custcode());
        CbUserBean userBean = userControl.getUser(cbTransactionLoanBean.getT_empcode());

        Map mapParam = new HashMap();
        mapParam.put("branchName", branchBean.getName());
        mapParam.put("loanTypeName", cbLoanConfigBean.getLoanName());
        mapParam.put("loanAccountName", profileBean.getP_custName() + " " + profileBean.getP_custSurname());
        mapParam.put("loanDocDate", sDate.format(new Date()) + " เวลา " + sTime.format(new Date()));
        mapParam.put("loanDocNo", cbTransactionLoanBean.getT_acccode());
        mapParam.put("empName", userBean.getName() + " " + userBean.getLastname());
        mapParam.put("interestRateAmt", NumberFormat.showDouble2(cbTransactionLoanBean.getT_interest()));
        mapParam.put("feeAmt", NumberFormat.showDouble2(cbTransactionLoanBean.getT_fee()));
        mapParam.put("totalNetAmt", NumberFormat.showDouble2(cbTransactionLoanBean.getT_amount()));
        mapParam.put("balanceAmt", NumberFormat.showDouble2(cbTransactionLoanBean.getT_balance()));
        mapParam.put("slipNumber", cbTransactionLoanBean.getT_docno());
        String sourceFileName = AppConstants.JASPER_PRINT_SLIP;

        // print report
        printReport(mapParam, sourceFileName);
    }

    public boolean printMemberFee(String custCode, String feeMember, String docno, String feeProject) {
        BranchBean branchBean = branchControl.getData();

        double feeProjectAmt = NumberFormat.toDouble(feeProject);
        double feeMemberAmt = NumberFormat.toDouble(feeMember);

        // สำหรับค่าธรรมเนียมสมาชิก
        if (feeProjectAmt > 0) {
            CbFeeTransactionBean feeBean = new CbFeeTransactionBean();
            CbFeeBean fBean = cbFeeControl.findOneByExpId("4");
            if (fBean != null) {
                feeBean.setFee_code(fBean.getExp_id());
                feeBean.setFee_desc(fBean.getExp_desc());
                feeBean.setFee_amount(feeProjectAmt);
                feeBean.setFee_branch(branchBean.getCode());
                feeBean.setFee_emp_code(Value.USER_CODE);
                feeBean.setFee_cust_code(custCode);

                feeTransactionControl.saveCbFeeTransaction(feeBean);
            }
        }
        if (feeMemberAmt > 0) {
            CbFeeTransactionBean feeBean = new CbFeeTransactionBean();
            CbFeeBean fBean = cbFeeControl.findOneByExpId("1");
            if (fBean != null) {
                feeBean.setFee_code(fBean.getExp_id());
                feeBean.setFee_desc(fBean.getExp_desc());
                feeBean.setFee_amount(feeMemberAmt);
                feeBean.setFee_branch(branchBean.getCode());
                feeBean.setFee_emp_code(Value.USER_CODE);
                feeBean.setFee_cust_code(custCode);

                feeTransactionControl.saveCbFeeTransaction(feeBean);
            }
        }

        SimpleDateFormat ss = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat tt = new SimpleDateFormat("hh:mm");

        ProfileBean pBean = profileControl.findOneByCustCode(custCode);
        CbFeeBean fBean = cbFeeControl.findOneByExpId("1");
        CbFeeBean fBean2 = cbFeeControl.findOneByExpId("4");

        try {
            p("ใบบันทึกรายการรับชำระค่าธรรมเนียม");
            p("วันที่ " + ss.format(new Date()) + " เวลา " + tt.format(new Date()));
            p("เลขที่ " + docno);
            p("สาขา " + branchBean.getName());
            p("ชื่อ " + pBean.getP_custName() + " " + pBean.getP_custSurname());
            p("รายการ                จำนวนเงิน");
            p("1. " + fBean2.getExp_desc() + "  " + "" + feeProjectAmt + " บาท");
            p("2. " + fBean.getExp_desc() + " " + "" + feeMemberAmt + " บาท");
            p("");
            p("                รวม   " + "" + (feeProjectAmt + feeMemberAmt) + " บาท");
            p("-------------------------------------");
            p("ผู้ทำรายการ " + Value.USER_NAME);
            p("******** ขอบคุณที่ใช้บริการ ********");
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            return false;
        }
    }

    public void printFeeOpen(String custCode, String feeOpenAcc, String empCode) {
        ConfigBean bean = configControl.findOne();
        String docNo;
        if (bean.getBranchPrefix().equals("Y")) {
            BranchBean bBean = branchControl.getData();
            docNo = bBean.getCode() + bean.getSaveDocPrefix() + getRunning(bean.getFeeRunning());
        } else {
            docNo = bean.getSaveDocPrefix() + getRunning(bean.getFeeRunning());
        }

        BranchBean bBean = branchControl.getData();

        double feeOpenAmt = NumberFormat.toDouble(feeOpenAcc);

        // สำหรับค่าธรรมเนียมการเปิดบัญชีเงินฝาก
        CbFeeTransactionBean feeBean = new CbFeeTransactionBean();
        CbFeeBean fBean = cbFeeControl.findOneByExpId("2");
        feeBean.setFee_code(fBean.getExp_id());
        feeBean.setFee_desc(fBean.getExp_desc());
        feeBean.setFee_amount(feeOpenAmt);
        feeBean.setFee_branch(bBean.getCode());
        feeBean.setFee_emp_code(Value.USER_CODE);

        feeTransactionControl.saveCbFeeTransaction(feeBean);

        SimpleDateFormat ss = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat tt = new SimpleDateFormat("hh:mm");

        ProfileBean pBean = profileControl.findOneByCustCode(custCode);
        CbUserBean userBean = userControl.getUser(empCode);
        BranchBean branchBean = branchControl.getData();

        Map mapParam = new HashMap();
        mapParam.put("branchName", branchBean.getName());
        mapParam.put("feeDocNo", docNo);
        mapParam.put("empName", userBean.getName() + " " + userBean.getLastname());
        mapParam.put("customerName", pBean.getP_custName() + " " + pBean.getP_custSurname());
        mapParam.put("feeDate", ss.format(new Date()) + " เวลา " + tt.format(new Date()));
        mapParam.put("expDesc", fBean.getExp_desc());
        mapParam.put("feeOpenAmt", feeOpenAmt);

        String sourceFileName = AppConstants.JASPER_FEE_SLIP;

        // print report
        printReport(mapParam, sourceFileName);
    }

    public void printTestFonts() {
        Map mapParam = new HashMap();
        String sourceFileName = AppConstants.JASPER_PRINT_TEST_FILE;

        // print test report
        printReport(mapParam, sourceFileName);
    }
    
    private void printReport(Map mapParam, String sourceFileName) {
        try {
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource(sourceFileName));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, mapParam, new JREmptyDataSource());
            JasperPrintManager.printReport(jasperPrint, false);
        } catch (JRException e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }
}
