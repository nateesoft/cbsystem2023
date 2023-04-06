/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.cbank.project.control;

import java.sql.ResultSet;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import th.co.cbank.project.model.CbTransactionLoanBean;

/**
 *
 * @author Acer
 */
public class CbTransactionLoanControlTest {
    
    public CbTransactionLoanControlTest() {
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
     * Test of mappingBean method, of class CbTransactionLoanControl.
     */
    @Test
    public void testMappingBean() throws Exception {
        System.out.println("mappingBean");
        ResultSet rs = null;
        CbTransactionLoanControl instance = new CbTransactionLoanControl();
        List<CbTransactionLoanBean> expResult = null;
        List<CbTransactionLoanBean> result = instance.mappingBean(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listCbTransactionLoan method, of class CbTransactionLoanControl.
     */
    @Test
    public void testListCbTransactionLoan() {
        System.out.println("listCbTransactionLoan");
        CbTransactionLoanControl instance = new CbTransactionLoanControl();
        List<CbTransactionLoanBean> expResult = null;
        List<CbTransactionLoanBean> result = instance.listCbTransactionLoan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listTransactionLoan method, of class CbTransactionLoanControl.
     */
    @Test
    public void testListTransactionLoan() {
        System.out.println("listTransactionLoan");
        String accountCode = "";
        String loanDocPrefix = "";
        String paymentDocPrefix = "";
        CbTransactionLoanControl instance = new CbTransactionLoanControl();
        List<CbTransactionLoanBean> expResult = null;
        List<CbTransactionLoanBean> result = instance.listTransactionLoan(accountCode, loanDocPrefix, paymentDocPrefix);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listByAccountCode method, of class CbTransactionLoanControl.
     */
    @Test
    public void testListByAccountCode() {
        System.out.println("listByAccountCode");
        String t_acccode = "";
        CbTransactionLoanControl instance = new CbTransactionLoanControl();
        List<CbTransactionLoanBean> expResult = null;
        List<CbTransactionLoanBean> result = instance.listByAccountCode(t_acccode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listCbTransactionLoanPayment method, of class CbTransactionLoanControl.
     */
    @Test
    public void testListCbTransactionLoanPayment() {
        System.out.println("listCbTransactionLoanPayment");
        String t_acccode = "";
        String custCode = "";
        CbTransactionLoanControl instance = new CbTransactionLoanControl();
        List<CbTransactionLoanBean> expResult = null;
        List<CbTransactionLoanBean> result = instance.listCbTransactionLoanPayment(t_acccode, custCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listCbTransactionLoanAll method, of class CbTransactionLoanControl.
     */
    @Test
    public void testListCbTransactionLoanAll() {
        System.out.println("listCbTransactionLoanAll");
        String accCode = "";
        boolean filterPrintCheck = false;
        CbTransactionLoanControl instance = new CbTransactionLoanControl();
        List<CbTransactionLoanBean> expResult = null;
        List<CbTransactionLoanBean> result = instance.listCbTransactionLoanAll(accCode, filterPrintCheck);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOneByTDate method, of class CbTransactionLoanControl.
     */
    @Test
    public void testFindOneByTDate() {
        System.out.println("findOneByTDate");
        String t_date = "";
        CbTransactionLoanControl instance = new CbTransactionLoanControl();
        CbTransactionLoanBean expResult = null;
        CbTransactionLoanBean result = instance.findOneByTDate(t_date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveCbTransactionLoan method, of class CbTransactionLoanControl.
     */
    @Test
    public void testSaveCbTransactionLoan() {
        System.out.println("saveCbTransactionLoan");
        CbTransactionLoanBean bean = null;
        CbTransactionLoanControl instance = new CbTransactionLoanControl();
        boolean expResult = false;
        boolean result = instance.saveCbTransactionLoan(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLineByAccount method, of class CbTransactionLoanControl.
     */
    @Test
    public void testGetLineByAccount() {
        System.out.println("getLineByAccount");
        String AccCode = "";
        CbTransactionLoanControl instance = new CbTransactionLoanControl();
        int expResult = 0;
        int result = instance.getLineByAccount(AccCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaxIndex method, of class CbTransactionLoanControl.
     */
    @Test
    public void testGetMaxIndex() {
        System.out.println("getMaxIndex");
        String AccCode = "";
        CbTransactionLoanControl instance = new CbTransactionLoanControl();
        int expResult = 0;
        int result = instance.getMaxIndex(AccCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateLinePrint method, of class CbTransactionLoanControl.
     */
    @Test
    public void testUpdateLinePrint() {
        System.out.println("updateLinePrint");
        String t_acccode = "";
        int lineNo = 0;
        CbTransactionLoanControl instance = new CbTransactionLoanControl();
        instance.updateLinePrint(t_acccode, lineNo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTransactionListWhereCustCode method, of class CbTransactionLoanControl.
     */
    @Test
    public void testGetTransactionListWhereCustCode() {
        System.out.println("getTransactionListWhereCustCode");
        String custCode = "";
        CbTransactionLoanControl instance = new CbTransactionLoanControl();
        List expResult = null;
        List result = instance.getTransactionListWhereCustCode(custCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateLoanState method, of class CbTransactionLoanControl.
     */
    @Test
    public void testUpdateLoanState() {
        System.out.println("updateLoanState");
        CbTransactionLoanBean bean = null;
        CbTransactionLoanControl instance = new CbTransactionLoanControl();
        boolean expResult = false;
        boolean result = instance.updateLoanState(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
