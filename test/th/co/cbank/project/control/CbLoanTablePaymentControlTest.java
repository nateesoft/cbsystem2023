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
import th.co.cbank.project.model.CbLoanTablePaymentBean;

/**
 *
 * @author Acer
 */
public class CbLoanTablePaymentControlTest {
    
    public CbLoanTablePaymentControlTest() {
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
     * Test of mappingBean method, of class CbLoanTablePaymentControl.
     */
    @Test
    public void testMappingBean() throws Exception {
        System.out.println("mappingBean");
        ResultSet rs = null;
        CbLoanTablePaymentControl instance = new CbLoanTablePaymentControl();
        List<CbLoanTablePaymentBean> expResult = null;
        List<CbLoanTablePaymentBean> result = instance.mappingBean(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listCbLoanTablePayment method, of class CbLoanTablePaymentControl.
     */
    @Test
    public void testListCbLoanTablePayment_0args() {
        System.out.println("listCbLoanTablePayment");
        CbLoanTablePaymentControl instance = new CbLoanTablePaymentControl();
        List<CbLoanTablePaymentBean> expResult = null;
        List<CbLoanTablePaymentBean> result = instance.listCbLoanTablePayment();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listCbLoanTablePayment method, of class CbLoanTablePaymentControl.
     */
    @Test
    public void testListCbLoanTablePayment_String() {
        System.out.println("listCbLoanTablePayment");
        String loan_doc_no = "";
        CbLoanTablePaymentControl instance = new CbLoanTablePaymentControl();
        List<CbLoanTablePaymentBean> expResult = null;
        List<CbLoanTablePaymentBean> result = instance.listCbLoanTablePayment(loan_doc_no);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOneByLoanDocNoBalanceAmountMoreThanZero method, of class CbLoanTablePaymentControl.
     */
    @Test
    public void testFindOneByLoanDocNoBalanceAmountMoreThanZero() {
        System.out.println("findOneByLoanDocNoBalanceAmountMoreThanZero");
        String loan_doc_no = "";
        CbLoanTablePaymentControl instance = new CbLoanTablePaymentControl();
        CbLoanTablePaymentBean expResult = null;
        CbLoanTablePaymentBean result = instance.findOneByLoanDocNoBalanceAmountMoreThanZero(loan_doc_no);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOneByLoanDocNo method, of class CbLoanTablePaymentControl.
     */
    @Test
    public void testFindOneByLoanDocNo() {
        System.out.println("findOneByLoanDocNo");
        String loan_doc_no = "";
        CbLoanTablePaymentControl instance = new CbLoanTablePaymentControl();
        CbLoanTablePaymentBean expResult = null;
        CbLoanTablePaymentBean result = instance.findOneByLoanDocNo(loan_doc_no);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveCbLoanTablePayment method, of class CbLoanTablePaymentControl.
     */
    @Test
    public void testSaveCbLoanTablePayment() {
        System.out.println("saveCbLoanTablePayment");
        CbLoanTablePaymentBean bean = null;
        CbLoanTablePaymentControl instance = new CbLoanTablePaymentControl();
        instance.saveCbLoanTablePayment(bean);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCbLoanTablePayment method, of class CbLoanTablePaymentControl.
     */
    @Test
    public void testUpdateCbLoanTablePayment() {
        System.out.println("updateCbLoanTablePayment");
        CbLoanTablePaymentBean bean = null;
        CbLoanTablePaymentControl instance = new CbLoanTablePaymentControl();
        instance.updateCbLoanTablePayment(bean);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInitialBean method, of class CbLoanTablePaymentControl.
     */
    @Test
    public void testGetInitialBean() {
        System.out.println("getInitialBean");
        CbLoanTablePaymentControl instance = new CbLoanTablePaymentControl();
        CbLoanTablePaymentBean expResult = null;
        CbLoanTablePaymentBean result = instance.getInitialBean();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findData method, of class CbLoanTablePaymentControl.
     */
    @Test
    public void testFindData() {
        System.out.println("findData");
        String sql = "";
        CbLoanTablePaymentControl instance = new CbLoanTablePaymentControl();
        ResultSet expResult = null;
        ResultSet result = instance.findData(sql);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
