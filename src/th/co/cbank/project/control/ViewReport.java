package th.co.cbank.project.control;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import javax.swing.JDialog;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRPrintPage;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import org.apache.log4j.Logger;
import th.co.cbank.project.constants.AppConstants;
import th.co.cbank.project.model.ProfileBean;
import th.co.cbank.util.MoneyToWord;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.model.BranchBean;
import th.co.cbank.project.model.CbSaveAccountBean;
import th.co.cbank.project.model.CbSaveConfigBean;
import th.co.cbank.project.report.model.CloseAccountReportModel;
import th.co.cbank.project.report.model.HoonReportAllModel;
import th.co.cbank.project.report.model.LoanReportAllModel;
import th.co.cbank.project.report.model.LoanReportPaymentModel;
import th.co.cbank.project.report.model.OpenAccountReportModel;
import th.co.cbank.project.report.model.ReportInvoiceHoonModel;
import th.co.cbank.project.report.model.SaveReportAllModel;
import th.co.cbank.project.report.model.ShowLoanAccountModel;
import th.co.cbank.project.report.model.ShowLoanAccountPrintModel;
import th.co.cbank.project.report.model.ShowSaveAccountModel;
import th.co.cbank.project.report.model.SummaryDepositModel;
import th.co.cbank.project.report.model.SummaryExpTransModel;
import th.co.cbank.project.report.model.SummaryHoonModel;
import th.co.cbank.project.report.model.SummaryLoanModel;
import th.co.cbank.util.DateFormat;
import th.co.cbank.util.MessageAlert;

public class ViewReport extends BaseControl {

    private final Logger logger = Logger.getLogger(ViewReport.class);
    private final DecimalFormat doubleFmt = new DecimalFormat("##,###,##0.00");
    private final SimpleDateFormat sFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    private String sqlQuery = "";

    // USED
    public void printReportBuyHoon(String CustCode, String DocNo) {
        BranchControl bc = new BranchControl();
        try {
            SimpleDateFormat sTime = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
            Map parameters = new HashMap();
            ProfileControl pc = new ProfileControl();
            ProfileBean bean = pc.listCbProfile(CustCode);
            String sql = "select p.p_custCode,p.p_custName,hoon_qty,"
                    + "t_docno,t_hoon,t_hoon_amt,t_hoon_cash,t_hoon_ton,"
                    + "t_hoon_rate,branch_code,t_amount "
                    + "from cb_transaction_save t, cb_profile p "
                    + "where t.t_custcode=p.p_custcode "
                    + "and t_custcode='" + CustCode + "' "
                    + "and t_docno='" + DocNo + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                parameters.put("CUST_NAME", bean.getP_custName() + " " + bean.getP_custSurname());
                parameters.put("DEPOSIT_NO", rs.getString("t_docno"));
                parameters.put("CUST_CODE", CustCode);
                MoneyToWord c = new MoneyToWord(rs.getDouble("t_hoon_amt"));
                parameters.put("TEXT_MONEY", c.toString());
                parameters.put("NUMBER_MONEY", doubleFmt.format(rs.getDouble("t_hoon_amt")));

                BranchBean bbb = bc.getData();
                parameters.put("BRANCH_NAME", ThaiUtil.ASCII2Unicode(bbb.getName()));

                parameters.put("TOTAL_RATE", doubleFmt.format(rs.getDouble("t_hoon_rate")));
                parameters.put("D_DATE", "" + sFormat.format(new Date()));
                parameters.put("D_TIME", sTime.format(new Date()));
                parameters.put("HOON_VOLUMN", doubleFmt.format(rs.getDouble("t_amount")));
                parameters.put("TOTAL_BALANCE", doubleFmt.format(rs.getDouble("Hoon_Qty")));
                parameters.put("TOTAL_MONEY", doubleFmt.format(rs.getDouble("Hoon_Qty") * rs.getDouble("t_hoon_rate")));

                try {
                    String sql2 = "select * from cb_branch";
                    ResultSet rs2 = MySQLConnect.getResultSet(sql2);
                    if (rs2.next()) {
                        parameters.put("COM_NAME", ThaiUtil.ASCII2Unicode(rs2.getString("Name")));
                        parameters.put("COM_ADDR", ThaiUtil.ASCII2Unicode(rs2.getString("AddressNo")) + " "
                                + "ต." + ThaiUtil.ASCII2Unicode(rs2.getString("Locality")) + " "
                                + "อ." + ThaiUtil.ASCII2Unicode(rs2.getString("SubProvince")) + " "
                                + "จ." + ThaiUtil.ASCII2Unicode(rs2.getString("Province")) + " "
                                + "" + rs2.getString("Post"));
                    }
                    rs2.close();
                } catch (Exception e) {
                    MessageAlert.errorPopup(this.getClass(), e.getMessage());
                    logger.error(e.getMessage());
                }

                JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource(AppConstants.JASPER_BUY_HOON_REPORT));
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, MySQLConnect.conn);
                JasperViewer v = new JasperViewer(jasperPrint, false);
                JDialog j = new JDialog(new JFrame(), true);
                j.setTitle("Print");
                j.setSize(1024, 768);
                j.getContentPane().add(v.getContentPane());
                j.setLocationRelativeTo(null);
                j.setVisible(true);
                v.setTitle("Buying Investment Report");
            }

            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    // USED
    public void printReportSellHoon(String CustCode, String DOC_NO) {
        BranchControl bc = new BranchControl();
        try {
            SimpleDateFormat sTime = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
            Map parameters = new HashMap();
            ProfileControl pc = new ProfileControl();
            ProfileBean bean = pc.listCbProfile(CustCode);
            String sql = "select p.p_custCode,p.p_custName,hoon_qty,"
                    + "t_docno,t_hoon,t_hoon_amt,t_hoon_cash,t_hoon_ton,"
                    + "t_hoon_rate,branch_code,t_amount "
                    + "from cb_transaction_save t, cb_profile p "
                    + "where t.t_custcode=p.p_custcode "
                    + "and t_custcode='" + CustCode + "' "
                    + "and t_docno='" + DOC_NO + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                parameters.put("CUST_NAME", bean.getP_custName() + " " + bean.getP_custSurname());
                parameters.put("DEPOSIT_NO", rs.getString("t_docno"));
                parameters.put("CUST_CODE", CustCode);
                parameters.put("TEXT_MONEY", "");
                parameters.put("NUMBER_MONEY", doubleFmt.format(rs.getDouble("t_amount")));

                BranchBean bbb = bc.getData();
                parameters.put("BRANCH_NAME", ThaiUtil.ASCII2Unicode(bbb.getName()));
                parameters.put("TOTAL_RATE", doubleFmt.format(rs.getDouble("t_hoon_rate")));
                parameters.put("TOTAL_QTY", doubleFmt.format(rs.getDouble("t_amount")));

                SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                parameters.put("D_DATE", "" + s.format(new Date()));
                parameters.put("D_TIME", sTime.format(new Date()));
                parameters.put("TOTAL_BALANCE", doubleFmt.format(rs.getDouble("hoon_qty")));
                parameters.put("TOTAL_MONEY", doubleFmt.format(rs.getDouble("hoon_qty") * rs.getDouble("t_hoon_rate")));
                parameters.put("HOON_AMOUNT", doubleFmt.format(rs.getDouble("t_amount") * rs.getDouble("t_hoon_rate")));

                try {
                    String sql2 = "select * from cb_branch";
                    ResultSet rs2 = MySQLConnect.getResultSet(sql2);
                    if (rs2.next()) {
                        parameters.put("COM_NAME", ThaiUtil.ASCII2Unicode(rs2.getString("Name")));
                        parameters.put("COM_ADDR", ThaiUtil.ASCII2Unicode(rs2.getString("AddressNo")) + " "
                                + "ต." + ThaiUtil.ASCII2Unicode(rs2.getString("Locality")) + " "
                                + "อ." + ThaiUtil.ASCII2Unicode(rs2.getString("SubProvince")) + " "
                                + "จ." + ThaiUtil.ASCII2Unicode(rs2.getString("Province")) + " "
                                + "" + rs2.getString("Post"));
                    }
                    rs2.close();
                } catch (Exception e) {
                    logger.error(e.getMessage());
                    MessageAlert.errorPopup(this.getClass(), e.getMessage());
                }

                JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource(AppConstants.JASPER_SELL_HOON_REPORT));
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, MySQLConnect.conn);
                JasperViewer v = new JasperViewer(jasperPrint, false);
                JDialog j = new JDialog(new JFrame(), true);
                j.setTitle("Print");
                j.setSize(1024, 768);
                j.getContentPane().add(v.getContentPane());
                j.setLocationRelativeTo(null);
                j.setVisible(true);
                v.setTitle("Selling Investment Report");
            }

            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    public void printReportTransferHoon(String CustCode, String DOC_NO) {
        BranchControl bc = new BranchControl();
        try {
            SimpleDateFormat sTime = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
            Map parameters = new HashMap();
            ProfileControl pc = new ProfileControl();
            ProfileBean bean = pc.listCbProfile(CustCode);
            String sql = "select p.p_custCode,p.p_custName,hoon_qty,"
                    + "t_docno,t_hoon,t_hoon_amt,t_hoon_cash,t_hoon_ton,"
                    + "t_hoon_rate,branch_code,t_amount "
                    + "from cb_transaction_save t, cb_profile p "
                    + "where t.t_custcode=p.p_custcode "
                    + "and t_custcode='" + CustCode + "' "
                    + "and t_docno='" + DOC_NO + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                parameters.put("CUST_NAME", bean.getP_custName() + " " + bean.getP_custSurname());
                parameters.put("DEPOSIT_NO", rs.getString("t_docno"));
                parameters.put("CUST_CODE", CustCode);
                parameters.put("TEXT_MONEY", "");
                parameters.put("NUMBER_MONEY", doubleFmt.format(rs.getDouble("t_amount")));

                BranchBean bbb = bc.getData();
                parameters.put("BRANCH_NAME", ThaiUtil.ASCII2Unicode(bbb.getName()));
                parameters.put("TOTAL_RATE", doubleFmt.format(rs.getDouble("t_hoon_rate")));
                parameters.put("TOTAL_QTY", doubleFmt.format(rs.getDouble("t_amount")));

                SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                parameters.put("D_DATE", "" + s.format(new Date()));
                parameters.put("D_TIME", sTime.format(new Date()));
                parameters.put("TOTAL_BALANCE", doubleFmt.format(rs.getDouble("hoon_qty")));
                parameters.put("TOTAL_MONEY", doubleFmt.format(rs.getDouble("hoon_qty") * rs.getDouble("t_hoon_rate")));
                parameters.put("HOON_AMOUNT", doubleFmt.format(rs.getDouble("t_amount") * rs.getDouble("t_hoon_rate")));

                try {
                    String sql2 = "select * from cb_branch";
                    ResultSet rs2 = MySQLConnect.getResultSet(sql2);
                    if (rs2.next()) {
                        parameters.put("COM_NAME", ThaiUtil.ASCII2Unicode(rs2.getString("Name")));
                        parameters.put("COM_ADDR", ThaiUtil.ASCII2Unicode(rs2.getString("AddressNo")) + " "
                                + "ต." + ThaiUtil.ASCII2Unicode(rs2.getString("Locality")) + " "
                                + "อ." + ThaiUtil.ASCII2Unicode(rs2.getString("SubProvince")) + " "
                                + "จ." + ThaiUtil.ASCII2Unicode(rs2.getString("Province")) + " "
                                + "" + rs2.getString("Post"));
                    }
                    rs2.close();
                } catch (Exception e) {
                    logger.error(e.getMessage());
                    MessageAlert.errorPopup(this.getClass(), e.getMessage());
                }

                JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource(AppConstants.JASPER_TRANSFER_HOON_REPORT));
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, MySQLConnect.conn);
                JasperViewer v = new JasperViewer(jasperPrint, false);
                JDialog j = new JDialog(new JFrame(), true);
                j.setTitle("Print");
                j.setSize(1024, 768);
                j.getContentPane().add(v.getContentPane());
                j.setLocationRelativeTo(null);
                j.setVisible(true);
                v.setTitle("Transfer Hoon Report");
            }

            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    // USED
    public void printReportLoan(String DOC_NO) {
        try {
            Map parameters = new HashMap();

            try {
                String sql = "select p.p_custname,p.p_custsurname,l.* "
                        + "from cb_loan_balance l, cb_profile p "
                        + "where l.cust_code=p.p_custcode and "
                        + "cb_loan_docno='" + DOC_NO + "';";
                ResultSet rs = MySQLConnect.getResultSet(sql);
                if (rs.next()) {
                    String docNo = rs.getString("cb_loan_docno");
                    String custName = ThaiUtil.ASCII2Unicode(rs.getString("p_custname"));
                    String custSurname = ThaiUtil.ASCII2Unicode(rs.getString("p_custsurname"));

                    MoneyToWord mtw = new MoneyToWord(rs.getDouble("loan_amount"));

                    parameters.put("cb_loan_NO", docNo);
                    parameters.put("CUST_NAME", custName + " " + custSurname);
                    parameters.put("CUST_CODE", rs.getString("cust_code"));
                    parameters.put("TEXT_MONEY", mtw.toString());
                    parameters.put("NUMBER_MONEY", "" + doubleFmt.format(rs.getDouble("loan_amount")));

                    parameters.put("D_DATE", "" + sFormat.format(rs.getDate("cb_loan_docdate")));
                    parameters.put("D_TIME", "");

                    parameters.put("cb_loan_AMOUNT", "" + doubleFmt.format(rs.getDouble("loan_amount")));
                    parameters.put("cb_loan_INTEREST", "" + doubleFmt.format(rs.getDouble("cb_loan_interest")));
                    parameters.put("INTEREST_TYPE", "ลดต้นลดดอก");
                    parameters.put("cb_loan_START", "" + sFormat.format(rs.getDate("cb_loan_docdate")));
                    parameters.put("cb_loan_GURANTEE", "" + ThaiUtil.ASCII2Unicode(rs.getString("cb_loan_person")));

                    try {
                        String sql2 = "select sum(loan_amount) loan_amount from cb_loan_balance "
                                + "where cust_code='" + rs.getString("cust_code") + "';";
                        ResultSet rs2 = MySQLConnect.getResultSet(sql2);
                        if (rs2.next()) {
                            parameters.put("cb_loan_BALANCE", doubleFmt.format(rs2.getDouble("loan_amount")));
                        }

                        rs2.close();
                    } catch (Exception e) {
                        logger.error(e.getMessage());
                        MessageAlert.errorPopup(this.getClass(), e.getMessage());
                    }
                }

                rs.close();
            } catch (Exception e) {
                logger.error(e.getMessage());
                MessageAlert.errorPopup(this.getClass(), e.getMessage());
            }

            try {
                String sql = "select * from cb_branch";
                ResultSet rs = MySQLConnect.getResultSet(sql);
                if (rs.next()) {
                    parameters.put("COM_NAME", ThaiUtil.ASCII2Unicode(rs.getString("Name")));
                    parameters.put("COM_ADDR", ThaiUtil.ASCII2Unicode(rs.getString("AddressNo")) + " "
                            + "ต." + ThaiUtil.ASCII2Unicode(rs.getString("Locality")) + " "
                            + "อ." + ThaiUtil.ASCII2Unicode(rs.getString("SubProvince")) + " "
                            + "จ." + ThaiUtil.ASCII2Unicode(rs.getString("Province")) + " "
                            + "" + rs.getString("POST"));
                    parameters.put("BRANCH_NAME", ThaiUtil.ASCII2Unicode(rs.getString("Name")));
                }
                rs.close();
            } catch (Exception e) {
                logger.error(e.getMessage());
                MessageAlert.errorPopup(this.getClass(), e.getMessage());
            }

            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource(AppConstants.JASPER_LOAN_SLIP_REPORT));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, MySQLConnect.conn);
            JasperViewer v = new JasperViewer(jasperPrint, false);
            JDialog j = new JDialog(new JFrame(), true);
            j.setTitle("Print");
            j.setSize(1024, 768);
            j.getContentPane().add(v.getContentPane());
            j.setLocationRelativeTo(null);
            j.setVisible(true);
            v.setTitle("Loan Report");
        } catch (HeadlessException | JRException e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

    }

    // USED
    public void printReportLoanPayment(String DOC_NO) {
        try {
            Map parameters = new HashMap();

            try {
                String sql = "select p.p_custname,p.p_custsurname,l.* "
                        + "from cb_loan_balance l, cb_profile p "
                        + "where l.cust_code=p.p_custcode and "
                        + "cb_loan_docno='" + DOC_NO + "';";
                ResultSet rs = MySQLConnect.getResultSet(sql);
                if (rs.next()) {
                    String docNo = rs.getString("cb_loan_docno");
                    String custName = ThaiUtil.ASCII2Unicode(rs.getString("p_custname"));
                    String custSurname = ThaiUtil.ASCII2Unicode(rs.getString("p_custsurname"));

                    MoneyToWord mtw = new MoneyToWord(rs.getDouble("loan_amount"));

                    parameters.put("cb_loan_NO", docNo);
                    parameters.put("CUST_NAME", custName + " " + custSurname);
                    parameters.put("CUST_CODE", rs.getString("cust_code"));
                    parameters.put("TEXT_MONEY", mtw.toString());
                    parameters.put("NUMBER_MONEY", "" + doubleFmt.format(rs.getDouble("loan_amount")));

                    parameters.put("D_DATE", "" + sFormat.format(rs.getDate("cb_loan_docdate")));
                    parameters.put("D_TIME", "");

                    parameters.put("cb_loan_AMOUNT", "" + doubleFmt.format(rs.getDouble("loan_amount")));
                    parameters.put("cb_loan_INTEREST", "" + doubleFmt.format(rs.getDouble("cb_loan_interest")));
                    parameters.put("INTEREST_TYPE", "ลดต้นลดดอก");
                    parameters.put("cb_loan_START", "" + sFormat.format(rs.getDate("cb_loan_docdate")));
                    parameters.put("cb_loan_GURANTEE", "" + ThaiUtil.ASCII2Unicode(rs.getString("cb_loan_person")));

                    try {
                        String sql2 = "select sum(loan_amount) loan_amount from cb_loan_balance "
                                + "where cust_code='" + rs.getString("cust_code") + "';";
                        ResultSet rs2 = MySQLConnect.getResultSet(sql2);
                        if (rs2.next()) {
                            parameters.put("cb_loan_BALANCE", doubleFmt.format(rs2.getDouble("loan_amount")));
                        }

                        rs2.close();
                    } catch (Exception e) {
                        logger.error(e.getMessage());
                        MessageAlert.errorPopup(this.getClass(), e.getMessage());
                    }
                }

                rs.close();
            } catch (Exception e) {
                logger.error(e.getMessage());
                MessageAlert.errorPopup(this.getClass(), e.getMessage());
            }

            try {
                String sql = "select * from cb_branch";
                ResultSet rs = MySQLConnect.getResultSet(sql);
                if (rs.next()) {
                    parameters.put("COM_NAME", ThaiUtil.ASCII2Unicode(rs.getString("Name")));
                    parameters.put("COM_ADDR", ThaiUtil.ASCII2Unicode(rs.getString("AddressNo")) + " "
                            + "ต." + ThaiUtil.ASCII2Unicode(rs.getString("Locality")) + " "
                            + "อ." + ThaiUtil.ASCII2Unicode(rs.getString("SubProvince")) + " "
                            + "จ." + ThaiUtil.ASCII2Unicode(rs.getString("Province")) + " "
                            + "" + rs.getString("POST"));
                    parameters.put("BRANCH_NAME", ThaiUtil.ASCII2Unicode(rs.getString("Name")));
                }
                rs.close();
            } catch (Exception e) {
                logger.error(e.getMessage());
                MessageAlert.errorPopup(this.getClass(), e.getMessage());
            }

            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource(AppConstants.JASPER_LOAN_SLIP_REPORT));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, MySQLConnect.conn);
            JasperViewer v = new JasperViewer(jasperPrint, false);
            JDialog j = new JDialog(new JFrame(), true);
            j.setTitle("Print");
            j.setSize(1024, 768);
            j.getContentPane().add(v.getContentPane());
            j.setLocationRelativeTo(null);
            j.setVisible(true);
            v.setTitle("Loan Report");
        } catch (HeadlessException | JRException e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

    }

    public void printSample(Map p, String path) {
        try {
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource(path));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, p, MySQLConnect.conn);
            JasperViewer v = new JasperViewer(jasperPrint, false);
            JDialog j = new JDialog(new JFrame(), true);
            j.setTitle("Print");
            j.setSize(1024, 768);
            j.getContentPane().add(v.getContentPane());
            j.setLocationRelativeTo(null);
            j.setVisible(true);
        } catch (HeadlessException | JRException e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    public void printReport(List<Map> listMap, String path) {
        JasperPrint print = null;
        for (Map p : listMap) {
            try {
                JasperReport report = (JasperReport) JRLoader.loadObject(getClass().getResource(path));
                JasperPrint print1 = JasperFillManager.fillReport(report, p, MySQLConnect.conn);
                if (print == null) {
                    print = print1;
                    continue;
                }

                List pages = print1.getPages();
                for (int j = 0; j < pages.size(); j++) {
                    JRPrintPage object = (JRPrintPage) pages.get(j);
                    print.addPage(object);
                }

            } catch (JRException e) {
                logger.error(e.getMessage());
                MessageAlert.errorPopup(this.getClass(), e.getMessage());
            }
        }

        // show report
        JasperViewer v = new JasperViewer(print, false);
        JDialog j = new JDialog(new JFrame(), true);
        j.setTitle("Print");
        j.setSize(1024, 768);
        j.getContentPane().add(v.getContentPane());
        j.setLocationRelativeTo(null);
        j.setVisible(true);
    }

    // USED
    public void printLoanPrommis() {
        try {
            Map p = new HashMap();
            for (int i = 1; i <= 35; i++) {
                p.put("m" + i, "");
            }
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource(AppConstants.JASPER_CLOSE_DAY_REPORT));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, p, MySQLConnect.conn);
            JasperViewer v = new JasperViewer(jasperPrint, false);
            JDialog j = new JDialog(new JFrame(), true);
            j.setTitle("Print");
            j.setSize(1024, 768);
            j.getContentPane().add(v.getContentPane());
            j.setLocationRelativeTo(null);
            j.setVisible(true);
            v.setTitle("Deposit Report");
        } catch (HeadlessException | JRException e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    public void printReportTran(String AccCode) {
        try {
            Map p = new HashMap();
            p.put("AccCode", AccCode);
            BranchControl bc = new BranchControl();
            BranchBean bBean = bc.getData();
            p.put("parameter1", bBean.getName());
            CbSaveAccountControl sa = new CbSaveAccountControl();
            CbSaveAccountBean sBean = sa.getSaveAccountBean(AccCode);
            CbSaveConfigControl sc = new CbSaveConfigControl();
            CbSaveConfigBean cBean = sc.listSaveConfig(AccCode);
            p.put("parameter2", sBean.getB_CUST_CODE());
            p.put("parameter3", AccCode);
            p.put("parameter4", cBean.getTypeName());
            p.put("parameter5", sBean.getB_CUST_NAME() + " " + sBean.getB_CUST_LASTNAME());

            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource(AppConstants.JASPER_SAVE_TRAN_REPORT));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, p, MySQLConnect.conn);
            JasperViewer v = new JasperViewer(jasperPrint, false);
            JDialog j = new JDialog(new JFrame(), true);
            j.setTitle("Print");
            j.setSize(1024, 768);
            j.getContentPane().add(v.getContentPane());
            j.setLocationRelativeTo(null);
            j.setVisible(true);
            v.setTitle("Report Saving by");
        } catch (HeadlessException | JRException e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    public void printReportAllTran(String sql, String dateBetween) {
        try {
            Map p = new HashMap();
            BranchControl bc = new BranchControl();
            BranchBean bBean = bc.getData();
            p.put("parameter1", bBean.getName());
            p.put("sql", sql);
            p.put("dateBetween", dateBetween);

            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource(AppConstants.JASPER_SAVING_ACCOUNT_ALL_REPORT));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, p, MySQLConnect.conn);
            JasperViewer v = new JasperViewer(jasperPrint, false);
            JDialog j = new JDialog(new JFrame(), true);
            j.setTitle("Print");
            j.setSize(1024, 768);
            j.getContentPane().add(v.getContentPane());
            j.setLocationRelativeTo(null);
            j.setVisible(true);
            v.setTitle("Report Saving All");
        } catch (HeadlessException | JRException e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    public void printReportLoanTran(String sql) {
        try {
            Map p = new HashMap();
            BranchControl bc = new BranchControl();
            BranchBean bBean = bc.getData();
            p.put("parameter1", bBean.getName());
            p.put("sql", sql);

            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource(AppConstants.JASPER_LOAN_ACCOUNT_ALL_REPORT));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, p, MySQLConnect.conn);
            JasperViewer v = new JasperViewer(jasperPrint, false);
            JDialog j = new JDialog(new JFrame(), true);
            j.setTitle("Print");
            j.setSize(1024, 768);
            j.getContentPane().add(v.getContentPane());
            j.setLocationRelativeTo(null);
            j.setVisible(true);
            v.setTitle("Report Saving All");
        } catch (HeadlessException | JRException e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    public void printReportHoonAllTran(String sql, String dateBetween) {
        try {
            Map params = new HashMap();
            BranchControl bc = new BranchControl();
            BranchBean bBean = bc.getData();
            params.put("parameter1", bBean.getName());
            params.put("sql", sql);
            params.put("dateBetween", dateBetween);

            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource(AppConstants.JASPER_HOON_ALL_REPORT));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, MySQLConnect.conn);
            JasperViewer v = new JasperViewer(jasperPrint, false);
            JDialog j = new JDialog(new JFrame(), true);
            j.setTitle("Print");
            j.setSize(1024, 768);
            j.getContentPane().add(v.getContentPane());
            j.setLocationRelativeTo(null);
            j.setVisible(true);
            v.setTitle("Report Saving All");
        } catch (HeadlessException | JRException e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    public void printReportPersonBalance(String sqlAll, String dateBetween) {
        try {
            Map params = new HashMap();
            BranchControl bc = new BranchControl();
            BranchBean bBean = bc.getData();
            params.put("parameter1", bBean.getName());
            params.put("sql", sqlAll);
            params.put("dateBetween", dateBetween);

            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource(AppConstants.JASPER_PERSON_BALANCE_REPORT));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, MySQLConnect.conn);
            JasperViewer v = new JasperViewer(jasperPrint, false);
            JDialog j = new JDialog(new JFrame(), true);
            j.setTitle("Print");
            j.setSize(1024, 768);
            j.getContentPane().add(v.getContentPane());
            j.setLocationRelativeTo(null);
            j.setVisible(true);
            v.setTitle("Report Saving All");
        } catch (HeadlessException | JRException e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    public void printReport(String titleReport, String filePath, Map params) {
        try {
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource(filePath));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, MySQLConnect.conn);
            JasperViewer v = new JasperViewer(jasperPrint, false);
            JDialog j = new JDialog(new JFrame(), true);
            j.setSize(1024, 768);
            j.getContentPane().add(v.getContentPane());
            j.setLocationRelativeTo(null);
            j.setVisible(true);
            v.setTitle(titleReport);
        } catch (HeadlessException | JRException e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

    }

    public List<ReportInvoiceHoonModel> findReportInvoiceHoon(String idCard, String accountCode) {
        String sql = "select p.p_custcode, concat(p_custname, ' ', p_custsurname) name, "
                + "loan_docno, loan_docdate, loan_amount, loan_interest, loan_datepay, "
                + "pay_amount, (select concat(addr_no, ' " + ThaiUtil.Unicode2ASCII("หมู่") + "', "
                + "addr_moo, ' ', addr_road, ' ', addr_soi, "
                + "' " + ThaiUtil.Unicode2ASCII("ตำบล") + "', addr_tambon, ' " + ThaiUtil.Unicode2ASCII("อำเภอ") + "', "
                + "addr_aumphur, ' " + ThaiUtil.Unicode2ASCII("จังหวัด") + "', "
                + "addr_province, ' " + ThaiUtil.Unicode2ASCII("รหัสไปรษณีย์") + " ', addr_post) address "
                + "from cb_profile_address where cust_code=a.cust_code limit 0,1 "
                + ") address, hoon_qty,"
                + "(select hoonrate from cb_hoon_config limit 0,1) hoonrate, "
                + "(select l.LoanINT from cb_loan_config l where l.loanCode=a.loan_type) loanINT, \"0.00\" loanIntAmt "
                + "from cb_loan_account a "
                + "inner join cb_profile p on a.cust_code=p.p_custcode "
                + "where 1=1 ";
        if (!idCard.equals("")) {
            sql += "and a.cust_code='" + idCard + "' ";
        }
        if (!accountCode.equals("")) {
            sql += "and a.loan_docno='" + accountCode + "' ";
        }

        List<ReportInvoiceHoonModel> listModel = new ArrayList<>();
        sql += "order by p_custcode, loan_docno";
        try (ResultSet rs = MySQLConnect.getResultSet(sql)) {
            while (rs.next()) {
                ReportInvoiceHoonModel model = new ReportInvoiceHoonModel();
                model.setName(ThaiUtil.ASCII2Unicode(rs.getString("name")));
                model.setLoan_docno(rs.getString("loan_docno"));
                model.setLoan_docdate(rs.getDate("loan_docdate"));
                model.setLoan_datepay(rs.getDate("loan_datepay"));
                model.setLoan_amount(rs.getDouble("loan_amount"));
                model.setPay_amount(rs.getDouble("pay_amount"));
                model.setLoanINT(rs.getDouble("loanINT"));
                model.setBalanceIntRate(0);
                model.setHoon_qty(rs.getInt("hoon_qty"));
                model.setHoonrate(rs.getInt("hoonrate"));
                model.setP_custcode(rs.getString("p_custcode"));
                model.setAddress(ThaiUtil.ASCII2Unicode(rs.getString("address")));

                listModel.add(model);
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return listModel;
    }

    public List<CloseAccountReportModel> showAllCloseAccountReport(String txtDate1, String txtDate2) {
        List<CloseAccountReportModel> listModel = new ArrayList<>();
        String sql = " select t_date, t_time, t_acccode, t_amount, t_balance,"
                + " concat(s.b_cust_name, ' ', s.b_cust_lastname) cust_name, t.t_empcode, t.branch_code "
                + " from cb_transaction_save t "
                + " inner join cb_save_account s on t.t_acccode = s.account_code "
                + " where 1=1 "
                + " and t_status='" + AppConstants.CB_STATUS_CLOSE_SAVE + "' ";
        if (!txtDate1.equals("") && !txtDate2.equals("")) {
            Date date1 = DateFormat.getLocal_ddMMyyyy(txtDate1);
            Date date2 = DateFormat.getLocal_ddMMyyyy(txtDate2);
            sql += " and t_date between '" + DateFormat.getMySQL_Date(date1) + "' "
                    + "and '" + DateFormat.getMySQL_Date(date2) + "' ";
            this.sqlQuery = sql;
        }
        try (ResultSet rs = MySQLConnect.getResultSet(sql)) {
            while (rs.next()) {
                CloseAccountReportModel bean = new CloseAccountReportModel();
                bean.setT_date(rs.getDate("t_date"));
                bean.setT_time(rs.getString("t_time"));
                bean.setCust_name(ThaiUtil.ASCII2Unicode(rs.getString("cust_name")));
                bean.setT_acccode(rs.getString("t_acccode"));
                bean.setT_amount(rs.getDouble("t_amount"));
                bean.setT_balance(rs.getDouble("t_balance"));
                bean.setT_empcode(rs.getString("t_empcode"));
                bean.setBranch_code(rs.getString("branch_code"));

                listModel.add(bean);
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return listModel;
    }

    public String getSqlQuery() {
        return sqlQuery;
    }

    public List<HoonReportAllModel> findShowAllReport(int selectedIndex, String txtDate1, String txtDate2, String custCode) {
        List<HoonReportAllModel> listBean = new ArrayList<>();
        String sql = "select (select code from cb_branch limit 0,1) code, t.*, p_custName,p_custSurname "
                    + "from cb_transaction_save t left join cb_profile p on t.t_custcode=p.p_custcode "
                    + "where 1=1 ";
        switch (selectedIndex) {
            case 1:
                sql += " and t_status in ('4') ";
                break;
            case 2:
                sql += " and t_status in ('5') ";
                break;
            default:
                sql += " and t_status in ('4','5') ";
                break;
        }
        if (!txtDate1.equals("") && !txtDate2.equals("")) {
            sql += " and t_date between '" + getDateText(txtDate1) + "' "
                    + "and '" + getDateText(txtDate2) + "' ";
        }
        if (!custCode.trim().equals("")) {
            sql += " and t_custcode='" + custCode.trim() + "' ";
        }

        sql += " order by t_custcode";

        this.sqlQuery = sql;

        try {
            ResultSet rs = MySQLConnect.getResultSet(sql);
            while (rs.next()) {
                HoonReportAllModel bean = new HoonReportAllModel();
                bean.setT_docno(rs.getString("t_docno"));
                bean.setT_date(rs.getDate("t_date"));
                bean.setT_time(rs.getString("t_time"));
                bean.setT_description(ThaiUtil.ASCII2Unicode(rs.getString("t_description")));
                bean.setT_amount(rs.getDouble("t_amount"));
                bean.setT_custcode(rs.getString("t_custcode"));
                bean.setP_custName(ThaiUtil.ASCII2Unicode(rs.getString("p_custName")));
                bean.setP_custSurname(ThaiUtil.ASCII2Unicode(rs.getString("p_custSurname")));
                bean.setT_empcode(rs.getString("t_empcode"));
                bean.setCode(rs.getString("code"));

                listBean.add(bean);
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return listBean;
    }

    private String getDateText(String date) {
        SimpleDateFormat sssEng = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        try {
            Calendar c = Calendar.getInstance();
            String[] d = date.split("/");
            int year = Integer.parseInt(d[2]);
            int month = Integer.parseInt(d[1]) - 1;
            int day = Integer.parseInt(d[0]);
            c.set(year, month, day);
            return sssEng.format(c.getTime());
        } catch (NumberFormatException e) {
            return sssEng.format(new Date());
        }
    }

    public List<LoanReportAllModel> getLoanReportAll(String txtDate1, String txtDate2, String txtAccCode, String txtCustCode) {
        List<LoanReportAllModel> listBean = new ArrayList<>();
        String sql = "select a.payPerAmount, a.period_pay, "
                + "(select code from cb_branch limit 0,1) code, t.*, p_custName,p_custSurname "
                + "from cb_loan_account a "
                + "inner join cb_transaction_loan t on a.cust_code=t.t_custcode "
                + "inner join cb_profile p on p.p_custcode=a.cust_code "
                + "where 1=1 "
                + "and t.t_custcode=p.p_custcode "
                + "and t_status in('10') ";
        if (!txtDate1.equals("") && !txtDate2.equals("")) {
            Date date1 = DateFormat.getLocal_ddMMyyyy(txtDate1);
            Date date2 = DateFormat.getLocal_ddMMyyyy(txtDate2);
            sql += " and t_date between '" + DateFormat.getMySQL_Date(date1) + "' "
                    + "and '" + DateFormat.getMySQL_Date(date2) + "' ";
        }
        if (!txtAccCode.equals("")) {
            sql += " and t_acccode='" + txtAccCode + "' ";
        }
        if (!txtCustCode.equals("")) {
            sql += " and t_custcode='" + txtCustCode + "' ";
        }
        sql += " group by t.t_acccode  order by t_date, t_time";
        sqlQuery = sql;

        try (ResultSet rs = MySQLConnect.getResultSet(sql)) {
            while (rs.next()) {
                LoanReportAllModel bean = new LoanReportAllModel();
                bean.setT_custcode(rs.getString("t_custcode"));
                bean.setT_date(rs.getDate("t_date"));
                bean.setT_time(rs.getString("t_time"));
                bean.setP_custName(ThaiUtil.ASCII2Unicode(rs.getString("p_custName")));
                bean.setP_custSurname(ThaiUtil.ASCII2Unicode(rs.getString("P_custSurname")));
                bean.setT_description(ThaiUtil.ASCII2Unicode(rs.getString("t_description")));
                bean.setT_amount(rs.getDouble("t_amount"));
                bean.setPeriod_pay(rs.getInt("period_pay"));
                bean.setPayPerAmount(rs.getDouble("payPerAmount"));
                bean.setT_empcode(rs.getString("t_empcode"));
                bean.setCode(rs.getString("code"));

                listBean.add(bean);
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return listBean;
    }

    public List<LoanReportPaymentModel> getLoanReportPayment(String txtDate1, String txtDate2, String txtAccCode, String txtCustCode) {
        List<LoanReportPaymentModel> listBean = new ArrayList<>();
        String sql = "select (select code from cb_branch limit 0,1) code, "
                + "t.*, p_custName,p_custSurname "
                + "from cb_transaction_loan t inner join cb_profile p "
                + "on t.t_custcode=p.p_custcode "
                + "where 1=1 "
                + "and t_status in('7') ";

        if (!txtDate1.equals("") && !txtDate2.equals("")) {
            Date date1 = DateFormat.getLocal_ddMMyyyy(txtDate1);
            Date date2 = DateFormat.getLocal_ddMMyyyy(txtDate2);
            sql += " and t_date between '" + DateFormat.getMySQL_Date(date1) + "' "
                    + "and '" + DateFormat.getMySQL_Date(date2) + "' ";
        }

        if (!txtAccCode.equals("")) {
            sql += " and t_acccode='" + txtAccCode + "' ";
        }

        if (!txtCustCode.equals("")) {
            sql += " and t_custcode='" + txtCustCode + "' ";
        }

        sql += " order by t_date, t_time";
        sqlQuery = sql;
        try (ResultSet rs = MySQLConnect.getResultSet(sql)) {
            while (rs.next()) {
                LoanReportPaymentModel bean = new LoanReportPaymentModel();
                bean.setT_custcode(rs.getString("t_custcode"));
                bean.setT_date(rs.getDate("t_date"));
                bean.setT_time(rs.getString("t_time"));
                bean.setT_acccode(rs.getString("t_acccode"));
                bean.setP_custName(ThaiUtil.ASCII2Unicode(rs.getString("p_custName")));
                bean.setP_custSurname(ThaiUtil.ASCII2Unicode(rs.getString("P_custSurname")));
                bean.setT_description(ThaiUtil.ASCII2Unicode(rs.getString("t_description")));
                bean.setT_amount(rs.getDouble("t_amount"));
                bean.setT_empcode(rs.getString("t_empcode"));
                bean.setCode(rs.getString("code"));

                listBean.add(bean);
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return listBean;
    }

    public List<OpenAccountReportModel> showAllOpenAccountReport(int selectedIndex, String selectItem, String txtDate1, String txtDate2) {
        List<OpenAccountReportModel> listBean = new ArrayList<>();
        String sql = "select b_start, account_code, type_name,b_fee,typeName,"
                + "concat(b_cust_name,' ', b_cust_lastname) cust_name,emp_code,branch_code "
                + "from cb_save_account a, cb_save_config s,cb_member_type m "
                + "where a.account_type=s.typecode "
                + "and a.member_type=m.type_code ";
        if (selectedIndex > 0) {
            String[] data = selectItem.split("-");
            sql += " and account_type='" + data[0].trim() + "' ";
        }

        if (!txtDate1.equals("") && !txtDate2.equals("")) {
            Date date1 = DateFormat.getLocal_ddMMyyyy(txtDate1);
            Date date2 = DateFormat.getLocal_ddMMyyyy(txtDate2);
            sql += " and b_start between '" + DateFormat.getMySQL_Date(date1) + "' "
                    + "and '" + DateFormat.getMySQL_Date(date2) + "' ";
        }
        sqlQuery = sql;
        try (ResultSet rs = MySQLConnect.getResultSet(sql)) {
            while (rs.next()) {
                OpenAccountReportModel bean = new OpenAccountReportModel();
                bean.setB_start(rs.getDate("b_start"));
                bean.setAccount_code(rs.getString("account_code"));
                bean.setType_name(ThaiUtil.ASCII2Unicode(rs.getString("type_name")));
                bean.setB_fee(rs.getDouble("b_fee"));
                bean.setTypeName(ThaiUtil.ASCII2Unicode(rs.getString("typeName")));
                bean.setCust_name(ThaiUtil.ASCII2Unicode(rs.getString("cust_name")));
                bean.setEmp_code(rs.getString("emp_code"));
                bean.setBranch_code(rs.getString("branch_code"));

                listBean.add(bean);
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return listBean;
    }

    public List<SaveReportAllModel> showAllSaveReport(int selectedIndex, String txtCustCode, String txtDate1, String txtDate2, String txtAccCode, int selectAccountType, String selectAccountTypeName) {
        List<SaveReportAllModel> listBean = new ArrayList<>();
        String sql = "select t.*,"
                + "(select b_cust_name from cb_save_account p where p.account_code=t.t_acccode) b_cust_name, "
                + "(select b_cust_lastname from cb_save_account p where p.account_code=t.t_acccode) b_cust_lastname,"
                + "(select concat(concat(b_cust_name, ' '),b_cust_lastname) from cb_save_account p where p.account_code=t.t_acccode) Name "
                + "from cb_transaction_save t "
                + "where 1=1 ";

        if (selectedIndex > -1) {
            switch (selectedIndex) {
                case 0:
                    sql += " and t_status in('1','2','3','8') ";
                    break;
                case 1:
                    sql += " and t_status in('1') ";
                    break;
                case 2:
                    sql += " and t_status in('2') ";
                    break;
                case 3:
                    sql += " and t_status in('3') ";
                    break;
                case 4:
                    sql += " and t_status in('8') ";
                    break;
                default:
                    break;
            }
        }

        if (!txtCustCode.equals("")) {
            sql += " and t_custcode='" + txtCustCode + "' ";
        }

        if (!txtDate1.equals("") && !txtDate2.equals("")) {
            Date d1 = DateFormat.getLocal_ddMMyyyy(txtDate1);
            Date d2 = DateFormat.getLocal_ddMMyyyy(txtDate2);

            sql += " and t_date between '" + DateFormat.getMySQL_Date(d1) + "' and '" + DateFormat.getMySQL_Date(d2) + "' ";
        }

        if (!txtAccCode.equals("")) {
            sql += " and t_acccode='" + txtAccCode + "' ";
        }

        if (selectAccountType > 0) {
            String[] data = selectAccountTypeName.split("-");
            sql += " and account_type='" + data[0].trim() + "' ";
        }

        sql += " order by t_date, t_time";
        sqlQuery = sql;
        try (ResultSet rs = MySQLConnect.getResultSet(sql)) {
            while (rs.next()) {
                SaveReportAllModel bean = new SaveReportAllModel();
                bean.setT_amount(rs.getDouble("t_amount"));
                bean.setT_date(rs.getDate("t_date"));
                bean.setT_time(rs.getString("t_time"));
                bean.setT_acccode(rs.getString("t_acccode"));
                bean.setT_description(ThaiUtil.ASCII2Unicode(rs.getString("t_description")));
                bean.setT_balance(rs.getDouble("t_balance"));
                bean.setT_custcode(rs.getString("t_custcode"));
                bean.setB_cust_name(ThaiUtil.ASCII2Unicode(rs.getString("b_cust_name")));
                bean.setB_cust_lastname(ThaiUtil.ASCII2Unicode(rs.getString("b_cust_lastname")));
                bean.setT_empcode(rs.getString("t_empcode"));
                bean.setBranch_code(rs.getString("branch_code"));

                listBean.add(bean);
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return listBean;
    }

    public List<ShowSaveAccountModel> showSaveAccount(String custCode) {
        List<ShowSaveAccountModel> listBean = new ArrayList<>();
        String sql = "select s.*,c.typeName "
                + "from cb_save_account s,cb_save_config c "
                + "where s.account_type=c.typeCode "
                + "and B_CUST_CODE = '" + custCode + "' "
                + "and account_status='1'";
        try (ResultSet rs = MySQLConnect.getResultSet(sql)) {
            while (rs.next()) {
                ShowSaveAccountModel bean = new ShowSaveAccountModel();
                bean.setAccount_code(rs.getString("account_code"));
                bean.setTypeName(rs.getString("typeName"));
                bean.setB_balance(rs.getDouble("b_balance"));

                listBean.add(bean);
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return listBean;
    }

    public List<ShowLoanAccountModel> showLoanAccount(String custCode) {
        List<ShowLoanAccountModel> listBean = new ArrayList<>();
        String sql = "select s.*,c.LoanName "
                + "from cb_loan_account s,cb_loan_config c "
                + "where s.loan_type=c.LoanCode "
                + "and CUST_CODE = '" + custCode + "' ";
        try (ResultSet rs = MySQLConnect.getResultSet(sql)) {
            while (rs.next()) {
                ShowLoanAccountModel bean = new ShowLoanAccountModel();
                bean.setLoan_docno(rs.getString("loan_docno"));
                bean.setLoanName(ThaiUtil.ASCII2Unicode(rs.getString("LoanName")));
                bean.setLoan_amount(rs.getDouble("loan_amount"));

                listBean.add(bean);
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return listBean;
    }

    public List<ShowLoanAccountPrintModel> loadListAllAccount() {
        List<ShowLoanAccountPrintModel> listBean = new ArrayList<>();
        String sql = "select * "
                + "from cb_loan_account l,cb_profile p "
                + "where l.cust_code=p.p_custCode ";
        try (ResultSet rs = MySQLConnect.getResultSet(sql)) {
            while (rs.next()) {
                ShowLoanAccountPrintModel bean = new ShowLoanAccountPrintModel();
                bean.setLoan_docno(rs.getString("loan_docno"));
                bean.setP_custName(ThaiUtil.ASCII2Unicode(rs.getString("p_custName")));
                bean.setP_custSurname(ThaiUtil.ASCII2Unicode(rs.getString("p_custSurname")));

                listBean.add(bean);
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return listBean;
    }

    public List<ShowLoanAccountPrintModel> loadListAllAccountByName(String custName) {
        List<ShowLoanAccountPrintModel> listBean = new ArrayList<>();
        String sql = "select * "
                + "from cb_loan_account l,cb_profile p "
                + "where l.cust_code=p.p_custCode "
                + "and p_custName like '%" + ThaiUtil.Unicode2ASCII(custName) + "%'";
        try (ResultSet rs = MySQLConnect.getResultSet(sql)) {
            while (rs.next()) {
                ShowLoanAccountPrintModel bean = new ShowLoanAccountPrintModel();
                bean.setLoan_docno(rs.getString("loan_docno"));
                bean.setP_custName(ThaiUtil.ASCII2Unicode(rs.getString("p_custName")));
                bean.setP_custSurname(ThaiUtil.ASCII2Unicode(rs.getString("p_custSurname")));

                listBean.add(bean);
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return listBean;
    }

    public SummaryDepositModel summaryDeposit(String dateMySQL) {
        SummaryDepositModel bean = new SummaryDepositModel();
        String sql = "select sum(money_in), sum(money_out), sum(money_in-money_out) t_balance, "
                + "sum(t_interest), sum(t_fee) from cb_transaction_save "
                + "where t_date='" + dateMySQL + "' and t_status in('1','2','3','8') ";
        try (ResultSet rs = MySQLConnect.getResultSet(sql)) {
            if (rs.next()) {
                bean.setSumMoneyIn(rs.getDouble(1));
                bean.setSumMoneyOut(rs.getDouble(2));
                bean.setSumMoneyBalance(rs.getDouble(3));
                bean.setSumInterest(rs.getDouble(4));
                bean.setSumFee(rs.getDouble(5));
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
        return bean;
    }

    public SummaryHoonModel summaryHoon(String dateMySQL) {
        SummaryHoonModel bean = new SummaryHoonModel();
        bean.setT_status("");
        String sql = "select t_status, sum(t_amount), sum(t_hoon_amt) "
                + "from cb_transaction_save where t_date='" + dateMySQL + "' "
                + "and t_status in('4','5','9') group by t_status";
        try (ResultSet rs = MySQLConnect.getResultSet(sql)) {
            if (rs.next()) {
                bean.setT_status(rs.getString("t_satus"));
                bean.setSumAmount(rs.getDouble(2));
                bean.setSumHoonAmt(rs.getDouble(3));
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
        return bean;
    }

    public SummaryLoanModel summaryLoan(String dateMySQL) {
        SummaryLoanModel bean = new SummaryLoanModel();
        bean.setT_status("");
        String sql = "select t_status, sum(t_amount) from cb_transaction_save "
                + "where t_date='" + dateMySQL + "' and t_status in('10','7') group by t_status";
        try (ResultSet rs = MySQLConnect.getResultSet(sql)) {
            if (rs.next()) {
                bean.setT_status(rs.getString("t_satus"));
                bean.setSumAmount(rs.getDouble(2));
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
        return bean;
    }

    public SummaryExpTransModel summaryExpTrans() {
        SummaryExpTransModel bean = new SummaryExpTransModel();
        String sql = "select sum(emp_amount) from cb_exp_transaction where exp_date=curdate();";
        try (ResultSet rs = MySQLConnect.getResultSet(sql)) {
            if (rs.next()) {
                bean.setSumAmount(rs.getDouble(1));
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
        return bean;
    }
}
