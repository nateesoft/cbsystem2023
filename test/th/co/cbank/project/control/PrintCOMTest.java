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
     * Test of p method, of class PrintCOM.
     */
    @Test
    public void testP() {
        System.out.println("p");
        String PrintMsg = "";
        PrintDriver instance = new PrintDriver();
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
        PrintDriver instance = new PrintDriver();
//        instance.printTest(Port);
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
        PrintDriver instance = new PrintDriver();
//        instance.printLOG(msg);
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
        PrintDriver instance = new PrintDriver();
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
        PrintDriver instance = new PrintDriver();
        boolean expResult = false;
        boolean result = instance.printMemberFee(custCode, feeMember, docno, feeProject);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
