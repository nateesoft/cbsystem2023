/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.cbank.project.control;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import th.co.cbank.project.model.PrintSlipBean;
import th.co.cbank.project.model.ReportGreenBean;
import th.co.cbank.project.model.ReportOrangeBean;

/**
 *
 * @author Acer
 */
public class PassBook_PSiPR9Test {
    
    public PassBook_PSiPR9Test() {
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
     * Test of printTransactionOrange method, of class PassBook_PSiPR9.
     */
    @Test
    public void testPrintTransactionOrange() {
        System.out.println("printTransactionOrange");
        String date = "";
        String type = "";
        String total = "";
        String payment = "";
        String pay_int = "";
        String balance = "";
        String line = "";
        boolean print = false;
        PassBook_PSiPR9 instance = new PassBook_PSiPR9();
        String expResult = "";
        String result = instance.printTransactionOrange(date, type, total, payment, pay_int, balance, line, print);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printTransactionGreen method, of class PassBook_PSiPR9.
     */
    @Test
    public void testPrintTransactionGreen() {
        System.out.println("printTransactionGreen");
        String date = "";
        String type = "";
        String wd = "";
        String dp = "";
        String balance = "";
        String in = "";
        String line = "";
        boolean print = false;
        PassBook_PSiPR9 instance = new PassBook_PSiPR9();
        String expResult = "";
        String result = instance.printTransactionGreen(date, type, wd, dp, balance, in, line, print);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printTransactionOrange2 method, of class PassBook_PSiPR9.
     */
    @Test
    public void testPrintTransactionOrange2() {
        System.out.println("printTransactionOrange2");
        List<ReportOrangeBean> listBean = null;
        boolean print = false;
        PassBook_PSiPR9 instance = new PassBook_PSiPR9();
        instance.printTransactionOrange2(listBean, print);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printTransactionGreen2 method, of class PassBook_PSiPR9.
     */
    @Test
    public void testPrintTransactionGreen2() {
        System.out.println("printTransactionGreen2");
        List<ReportGreenBean> listBean = null;
        boolean print = false;
        PassBook_PSiPR9 instance = new PassBook_PSiPR9();
        instance.printTransactionGreen2(listBean, print);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printFrontBook method, of class PassBook_PSiPR9.
     */
    @Test
    public void testPrintFrontBook() {
        System.out.println("printFrontBook");
        String accCode = "";
        String accName = "";
        String bookNo = "";
        String accType = "";
        PassBook_PSiPR9 instance = new PassBook_PSiPR9();
        instance.printFrontBook(accCode, accName, bookNo, accType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printLoanFrontBook method, of class PassBook_PSiPR9.
     */
    @Test
    public void testPrintLoanFrontBook() {
        System.out.println("printLoanFrontBook");
        String accCode = "";
        String accName = "";
        String bookNo = "";
        String barcode = "";
        String accType = "";
        PassBook_PSiPR9 instance = new PassBook_PSiPR9();
        instance.printLoanFrontBook(accCode, accName, bookNo, barcode, accType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printSlipSaveBook method, of class PassBook_PSiPR9.
     */
    @Test
    public void testPrintSlipSaveBook() {
        System.out.println("printSlipSaveBook");
        PrintSlipBean bean = null;
        PassBook_PSiPR9 instance = new PassBook_PSiPR9();
        instance.printSlipSaveBook(bean);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
