/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.cbank.project.control;

import java.util.List;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
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

/**
 *
 * @author Acer
 */
public class ViewReportTest {
    
    public ViewReportTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of printReportBuyHoon method, of class ViewReport.
     */
    @Test
    public void testPrintReportBuyHoon() {
        System.out.println("printReportBuyHoon");
        String CustCode = "";
        String DocNo = "";
        ViewReport instance = new ViewReport();
        instance.printReportBuyHoon(CustCode, DocNo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printReportSellHoon method, of class ViewReport.
     */
    @Test
    public void testPrintReportSellHoon() {
        System.out.println("printReportSellHoon");
        String CustCode = "";
        String DOC_NO = "";
        ViewReport instance = new ViewReport();
        instance.printReportSellHoon(CustCode, DOC_NO);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printReportTransferHoon method, of class ViewReport.
     */
    @Test
    public void testPrintReportTransferHoon() {
        System.out.println("printReportTransferHoon");
        String CustCode = "";
        String DOC_NO = "";
        ViewReport instance = new ViewReport();
        instance.printReportTransferHoon(CustCode, DOC_NO);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printReportLoan method, of class ViewReport.
     */
    @Test
    public void testPrintReportLoan() {
        System.out.println("printReportLoan");
        String DOC_NO = "";
        ViewReport instance = new ViewReport();
        instance.printReportLoan(DOC_NO);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printReportLoanPayment method, of class ViewReport.
     */
    @Test
    public void testPrintReportLoanPayment() {
        System.out.println("printReportLoanPayment");
        String DOC_NO = "";
        ViewReport instance = new ViewReport();
        instance.printReportLoanPayment(DOC_NO);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printSample method, of class ViewReport.
     */
    @Test
    public void testPrintSample() {
        System.out.println("printSample");
        Map p = null;
        String path = "";
        ViewReport instance = new ViewReport();
        instance.printSample(p, path);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printReport method, of class ViewReport.
     */
    @Test
    public void testPrintReport_List_String() {
        System.out.println("printReport");
        List<Map> listMap = null;
        String path = "";
        ViewReport instance = new ViewReport();
        instance.printReport(listMap, path);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printLoanPrommis method, of class ViewReport.
     */
    @Test
    public void testPrintLoanPrommis() {
        System.out.println("printLoanPrommis");
        ViewReport instance = new ViewReport();
        instance.printLoanPrommis();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printReportTran method, of class ViewReport.
     */
    @Test
    public void testPrintReportTran() {
        System.out.println("printReportTran");
        String AccCode = "";
        ViewReport instance = new ViewReport();
        instance.printReportTran(AccCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printReportAllTran method, of class ViewReport.
     */
    @Test
    public void testPrintReportAllTran() {
        System.out.println("printReportAllTran");
        String sql = "";
        String dateBetween = "";
        ViewReport instance = new ViewReport();
        instance.printReportAllTran(sql, dateBetween);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printReportLoanTran method, of class ViewReport.
     */
    @Test
    public void testPrintReportLoanTran() {
        System.out.println("printReportLoanTran");
        String sql = "";
        ViewReport instance = new ViewReport();
        instance.printReportLoanTran(sql);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printReportHoonAllTran method, of class ViewReport.
     */
    @Test
    public void testPrintReportHoonAllTran() {
        System.out.println("printReportHoonAllTran");
        String sql = "";
        String dateBetween = "";
        ViewReport instance = new ViewReport();
        instance.printReportHoonAllTran(sql, dateBetween);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printReportPersonBalance method, of class ViewReport.
     */
    @Test
    public void testPrintReportPersonBalance() {
        System.out.println("printReportPersonBalance");
        String sqlAll = "";
        String dateBetween = "";
        ViewReport instance = new ViewReport();
        instance.printReportPersonBalance(sqlAll, dateBetween);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printReport method, of class ViewReport.
     */
    @Test
    public void testPrintReport_3args() {
        System.out.println("printReport");
        String titleReport = "";
        String filePath = "";
        Map params = null;
        ViewReport instance = new ViewReport();
        instance.printReport(titleReport, filePath, params);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findReportInvoiceHoon method, of class ViewReport.
     */
    @Test
    public void testFindReportInvoiceHoon() {
        System.out.println("findReportInvoiceHoon");
        String idCard = "";
        String accountCode = "";
        ViewReport instance = new ViewReport();
        List<ReportInvoiceHoonModel> expResult = null;
        List<ReportInvoiceHoonModel> result = instance.findReportInvoiceHoon(idCard, accountCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showAllCloseAccountReport method, of class ViewReport.
     */
    @Test
    public void testShowAllCloseAccountReport() {
        System.out.println("showAllCloseAccountReport");
        String txtDate1 = "";
        String txtDate2 = "";
        ViewReport instance = new ViewReport();
        List<CloseAccountReportModel> expResult = null;
        List<CloseAccountReportModel> result = instance.showAllCloseAccountReport(txtDate1, txtDate2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSqlQuery method, of class ViewReport.
     */
    @Test
    public void testGetSqlQuery() {
        System.out.println("getSqlQuery");
        ViewReport instance = new ViewReport();
        String expResult = "";
        String result = instance.getSqlQuery();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findShowAllReport method, of class ViewReport.
     */
    @Test
    public void testFindShowAllReport() {
        System.out.println("findShowAllReport");
        int selectedIndex = 0;
        String txtDate1 = "";
        String txtDate2 = "";
        String custCode = "";
        ViewReport instance = new ViewReport();
        List<HoonReportAllModel> expResult = null;
        List<HoonReportAllModel> result = instance.findShowAllReport(selectedIndex, txtDate1, txtDate2, custCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLoanReportAll method, of class ViewReport.
     */
    @Test
    public void testGetLoanReportAll() {
        System.out.println("getLoanReportAll");
        String txtDate1 = "";
        String txtDate2 = "";
        String txtAccCode = "";
        String txtCustCode = "";
        ViewReport instance = new ViewReport();
        List<LoanReportAllModel> expResult = null;
        List<LoanReportAllModel> result = instance.getLoanReportAll(txtDate1, txtDate2, txtAccCode, txtCustCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLoanReportPayment method, of class ViewReport.
     */
    @Test
    public void testGetLoanReportPayment() {
        System.out.println("getLoanReportPayment");
        String txtDate1 = "";
        String txtDate2 = "";
        String txtAccCode = "";
        String txtCustCode = "";
        ViewReport instance = new ViewReport();
        List<LoanReportPaymentModel> expResult = null;
        List<LoanReportPaymentModel> result = instance.getLoanReportPayment(txtDate1, txtDate2, txtAccCode, txtCustCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showAllOpenAccountReport method, of class ViewReport.
     */
    @Test
    public void testShowAllOpenAccountReport() {
        System.out.println("showAllOpenAccountReport");
        int selectedIndex = 0;
        String selectItem = "";
        String txtDate1 = "";
        String txtDate2 = "";
        ViewReport instance = new ViewReport();
        List<OpenAccountReportModel> expResult = null;
        List<OpenAccountReportModel> result = instance.showAllOpenAccountReport(selectedIndex, selectItem, txtDate1, txtDate2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showAllSaveReport method, of class ViewReport.
     */
    @Test
    public void testShowAllSaveReport() {
        System.out.println("showAllSaveReport");
        int selectedIndex = 0;
        String txtCustCode = "";
        String txtDate1 = "";
        String txtDate2 = "";
        String txtAccCode = "";
        int selectAccountType = 0;
        String selectAccountTypeName = "";
        ViewReport instance = new ViewReport();
        List<SaveReportAllModel> expResult = null;
        List<SaveReportAllModel> result = instance.showAllSaveReport(selectedIndex, txtCustCode, txtDate1, txtDate2, txtAccCode, selectAccountType, selectAccountTypeName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showSaveAccount method, of class ViewReport.
     */
    @Test
    public void testShowSaveAccount() {
        System.out.println("showSaveAccount");
        String custCode = "";
        ViewReport instance = new ViewReport();
        List<ShowSaveAccountModel> expResult = null;
        List<ShowSaveAccountModel> result = instance.showSaveAccount(custCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showLoanAccount method, of class ViewReport.
     */
    @Test
    public void testShowLoanAccount() {
        System.out.println("showLoanAccount");
        String custCode = "";
        ViewReport instance = new ViewReport();
        List<ShowLoanAccountModel> expResult = null;
        List<ShowLoanAccountModel> result = instance.showLoanAccount(custCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadListAllAccount method, of class ViewReport.
     */
    @Test
    public void testLoadListAllAccount() {
        System.out.println("loadListAllAccount");
        ViewReport instance = new ViewReport();
        List<ShowLoanAccountPrintModel> expResult = null;
        List<ShowLoanAccountPrintModel> result = instance.loadListAllAccount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadListAllAccountByName method, of class ViewReport.
     */
    @Test
    public void testLoadListAllAccountByName() {
        System.out.println("loadListAllAccountByName");
        String custName = "";
        ViewReport instance = new ViewReport();
        List<ShowLoanAccountPrintModel> expResult = null;
        List<ShowLoanAccountPrintModel> result = instance.loadListAllAccountByName(custName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of summaryDeposit method, of class ViewReport.
     */
    @Test
    public void testSummaryDeposit() {
        System.out.println("summaryDeposit");
        String dateMySQL = "";
        ViewReport instance = new ViewReport();
        SummaryDepositModel expResult = null;
        SummaryDepositModel result = instance.summaryDeposit(dateMySQL);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of summaryHoon method, of class ViewReport.
     */
    @Test
    public void testSummaryHoon() {
        System.out.println("summaryHoon");
        String dateMySQL = "";
        ViewReport instance = new ViewReport();
        SummaryHoonModel expResult = null;
        SummaryHoonModel result = instance.summaryHoon(dateMySQL);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of summaryLoan method, of class ViewReport.
     */
    @Test
    public void testSummaryLoan() {
        System.out.println("summaryLoan");
        String dateMySQL = "";
        ViewReport instance = new ViewReport();
        SummaryLoanModel expResult = null;
        SummaryLoanModel result = instance.summaryLoan(dateMySQL);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of summaryExpTrans method, of class ViewReport.
     */
    @Test
    public void testSummaryExpTrans() {
        System.out.println("summaryExpTrans");
        ViewReport instance = new ViewReport();
        SummaryExpTransModel expResult = null;
        SummaryExpTransModel result = instance.summaryExpTrans();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
