/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.cbank.project.control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import th.co.cbank.project.model.CbTransactionLoanBean;
import th.co.cbank.project.model.PrintBean;

/**
 *
 * @author Acer
 */
public class PrintCOMTest {
    
    public PrintCOMTest() {
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
     * Test of listComport method, of class PrintCOM.
     */
    @Test
    public void testListComport() {
        System.out.println("listComport");
        PrintCOM instance = new PrintCOM();
        String[] expResult = null;
        String[] result = instance.listComport();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initPrinter method, of class PrintCOM.
     */
    @Test
    public void testInitPrinter() {
        System.out.println("initPrinter");
        PrintCOM instance = new PrintCOM();
        instance.initPrinter();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchArray method, of class PrintCOM.
     */
    @Test
    public void testSearchArray() {
        System.out.println("searchArray");
        int key = 0;
        int[] list = null;
        PrintCOM instance = new PrintCOM();
        int expResult = 0;
        int result = instance.searchArray(key, list);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_Line method, of class PrintCOM.
     */
    @Test
    public void testGet_Line() {
        System.out.println("get_Line");
        String St = "";
        PrintCOM instance = new PrintCOM();
        instance.get_Line(St);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of p method, of class PrintCOM.
     */
    @Test
    public void testP() {
        System.out.println("p");
        String PrintMsg = "";
        PrintCOM instance = new PrintCOM();
        instance.p(PrintMsg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printTest method, of class PrintCOM.
     */
    @Test
    public void testPrintTest() {
        System.out.println("printTest");
        String Port = "";
        PrintCOM instance = new PrintCOM();
        instance.printTest(Port);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printLOG method, of class PrintCOM.
     */
    @Test
    public void testPrintLOG() {
        System.out.println("printLOG");
        String msg = "";
        PrintCOM instance = new PrintCOM();
        instance.printLOG(msg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cutPaper method, of class PrintCOM.
     */
    @Test
    public void testCutPaper() {
        System.out.println("cutPaper");
        PrintCOM instance = new PrintCOM();
        instance.cutPaper();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectStye method, of class PrintCOM.
     */
    @Test
    public void testSelectStye() {
        System.out.println("selectStye");
        int style = 0;
        PrintCOM instance = new PrintCOM();
        instance.selectStye(style);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dataFullR method, of class PrintCOM.
     */
    @Test
    public void testDataFullR() {
        System.out.println("dataFullR");
        String str = "";
        int Len = 0;
        PrintCOM instance = new PrintCOM();
        String expResult = "";
        String result = instance.dataFullR(str, Len);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printPaymentLoan method, of class PrintCOM.
     */
    @Test
    public void testPrintPaymentLoan_PrintBean() {
        System.out.println("printPaymentLoan");
        PrintBean pBean = null;
        PrintCOM instance = new PrintCOM();
        instance.printPaymentLoan(pBean);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printPaymentLoan method, of class PrintCOM.
     */
    @Test
    public void testPrintPaymentLoan_CbTransactionLoanBean() {
        System.out.println("printPaymentLoan");
        CbTransactionLoanBean cbTransactionLoanBean = null;
        PrintCOM instance = new PrintCOM();
        instance.printPaymentLoan(cbTransactionLoanBean);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printMemberFee method, of class PrintCOM.
     */
    @Test
    public void testPrintMemberFee() {
        System.out.println("printMemberFee");
        String custCode = "";
        String feeMember = "";
        String docno = "";
        String feeProject = "";
        PrintCOM instance = new PrintCOM();
        boolean expResult = false;
        boolean result = instance.printMemberFee(custCode, feeMember, docno, feeProject);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printFeeOpen method, of class PrintCOM.
     */
    @Test
    public void testPrintFeeOpen() {
        System.out.println("printFeeOpen");
        String custCode = "";
        String feeOpenAcc = "";
        PrintCOM instance = new PrintCOM();
        boolean expResult = false;
        boolean result = instance.printFeeOpen(custCode, feeOpenAcc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printFeeLoanOpen method, of class PrintCOM.
     */
    @Test
    public void testPrintFeeLoanOpen() {
        System.out.println("printFeeLoanOpen");
        String custCode = "";
        String feeLoanOpen = "";
        PrintCOM instance = new PrintCOM();
        boolean expResult = false;
        boolean result = instance.printFeeLoanOpen(custCode, feeLoanOpen);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addSpace method, of class PrintCOM.
     */
    @Test
    public void testAddSpace() {
        System.out.println("addSpace");
        String data = "";
        int length = 0;
        PrintCOM instance = new PrintCOM();
        String expResult = "";
        String result = instance.addSpace(data, length);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
