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
import th.co.cbank.project.model.CbLoanAccountBean;
import th.co.cbank.project.model.ProfileBean;

/**
 *
 * @author Acer
 */
public class CbLoanAccountControlTest {
    
    public CbLoanAccountControlTest() {
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
     * Test of listLoanAccountCust method, of class CbLoanAccountControl.
     */
    @Test
    public void testListLoanAccountCust() {
        System.out.println("listLoanAccountCust");
        String custCode = "";
        CbLoanAccountControl instance = new CbLoanAccountControl();
        List<CbLoanAccountBean> expResult = null;
        List<CbLoanAccountBean> result = instance.listLoanAccountCust(custCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listLoanAccount method, of class CbLoanAccountControl.
     */
    @Test
    public void testListLoanAccount() {
        System.out.println("listLoanAccount");
        CbLoanAccountControl instance = new CbLoanAccountControl();
        List<CbLoanAccountBean> expResult = null;
        List<CbLoanAccountBean> result = instance.listLoanAccount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchLoanAccount method, of class CbLoanAccountControl.
     */
    @Test
    public void testSearchLoanAccount() {
        System.out.println("searchLoanAccount");
        String custName = "";
        CbLoanAccountControl instance = new CbLoanAccountControl();
        List<CbLoanAccountBean> expResult = null;
        List<CbLoanAccountBean> result = instance.searchLoanAccount(custName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOneByCustCode method, of class CbLoanAccountControl.
     */
    @Test
    public void testFindOneByCustCode() {
        System.out.println("findOneByCustCode");
        String custCode = "";
        CbLoanAccountControl instance = new CbLoanAccountControl();
        CbLoanAccountBean expResult = null;
        CbLoanAccountBean result = instance.findOneByCustCode(custCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOneByLoanDocNo method, of class CbLoanAccountControl.
     */
    @Test
    public void testFindOneByLoanDocNo() {
        System.out.println("findOneByLoanDocNo");
        String Loan_docno = "";
        CbLoanAccountControl instance = new CbLoanAccountControl();
        CbLoanAccountBean expResult = null;
        CbLoanAccountBean result = instance.findOneByLoanDocNo(Loan_docno);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createNewLoan method, of class CbLoanAccountControl.
     */
    @Test
    public void testCreateNewLoan() {
        System.out.println("createNewLoan");
        CbLoanAccountBean bean = null;
        CbLoanAccountControl instance = new CbLoanAccountControl();
        boolean expResult = false;
        boolean result = instance.createNewLoan(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveLoanAccount method, of class CbLoanAccountControl.
     */
    @Test
    public void testSaveLoanAccount() {
        System.out.println("saveLoanAccount");
        CbLoanAccountBean bean = null;
        CbLoanAccountControl instance = new CbLoanAccountControl();
        boolean expResult = false;
        boolean result = instance.saveLoanAccount(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveLoanAccountOpen method, of class CbLoanAccountControl.
     */
    @Test
    public void testSaveLoanAccountOpen() {
        System.out.println("saveLoanAccountOpen");
        CbLoanAccountBean bean = null;
        CbLoanAccountControl instance = new CbLoanAccountControl();
        boolean expResult = false;
        boolean result = instance.saveLoanAccountOpen(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateLoanAccount2 method, of class CbLoanAccountControl.
     */
    @Test
    public void testUpdateLoanAccount2() {
        System.out.println("updateLoanAccount2");
        CbLoanAccountBean bean = null;
        CbLoanAccountControl instance = new CbLoanAccountControl();
        boolean expResult = false;
        boolean result = instance.updateLoanAccount2(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInitBean method, of class CbLoanAccountControl.
     */
    @Test
    public void testGetInitBean() {
        System.out.println("getInitBean");
        CbLoanAccountControl instance = new CbLoanAccountControl();
        CbLoanAccountBean expResult = null;
        CbLoanAccountBean result = instance.getInitBean();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOneByLoanDocNoAndCustCode method, of class CbLoanAccountControl.
     */
    @Test
    public void testFindOneByLoanDocNoAndCustCode() {
        System.out.println("findOneByLoanDocNoAndCustCode");
        String Loan_docno = "";
        String custCode = "";
        CbLoanAccountControl instance = new CbLoanAccountControl();
        CbLoanAccountBean expResult = null;
        CbLoanAccountBean result = instance.findOneByLoanDocNoAndCustCode(Loan_docno, custCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchIdAndName method, of class CbLoanAccountControl.
     */
    @Test
    public void testSearchIdAndName() {
        System.out.println("searchIdAndName");
        String id = "";
        String name = "";
        String surname = "";
        CbLoanAccountControl instance = new CbLoanAccountControl();
        List<ProfileBean> expResult = null;
        List<ProfileBean> result = instance.searchIdAndName(id, name, surname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of processSummary method, of class CbLoanAccountControl.
     */
    @Test
    public void testProcessSummary() {
        System.out.println("processSummary");
        String code1 = "";
        String code2 = "";
        CbLoanAccountControl instance = new CbLoanAccountControl();
        List<CbLoanAccountBean> expResult = null;
        List<CbLoanAccountBean> result = instance.processSummary(code1, code2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of processSummaryByPerson method, of class CbLoanAccountControl.
     */
    @Test
    public void testProcessSummaryByPerson() {
        System.out.println("processSummaryByPerson");
        String code1 = "";
        String code2 = "";
        CbLoanAccountControl instance = new CbLoanAccountControl();
        List<CbLoanAccountBean> expResult = null;
        List<CbLoanAccountBean> result = instance.processSummaryByPerson(code1, code2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
