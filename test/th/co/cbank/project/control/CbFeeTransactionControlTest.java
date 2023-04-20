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
import th.co.cbank.project.model.CbFeeTransactionBean;

/**
 *
 * @author Acer
 */
public class CbFeeTransactionControlTest {
    
    public CbFeeTransactionControlTest() {
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
     * Test of mappingBean method, of class CbFeeTransactionControl.
     */
    @Test
    public void testMappingBean() throws Exception {
        System.out.println("mappingBean");
        ResultSet rs = null;
        CbFeeTransactionControl instance = new CbFeeTransactionControl();
        List<CbFeeTransactionBean> expResult = null;
        List<CbFeeTransactionBean> result = instance.mappingBean(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listCbFeeTransaction method, of class CbFeeTransactionControl.
     */
    @Test
    public void testListCbFeeTransaction_0args() {
        System.out.println("listCbFeeTransaction");
        CbFeeTransactionControl instance = new CbFeeTransactionControl();
        List<CbFeeTransactionBean> expResult = null;
        List<CbFeeTransactionBean> result = instance.listCbFeeTransaction();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listCbFeeTransaction method, of class CbFeeTransactionControl.
     */
    @Test
    public void testListCbFeeTransaction_String() {
        System.out.println("listCbFeeTransaction");
        String fee_code = "";
        CbFeeTransactionControl instance = new CbFeeTransactionControl();
        List<CbFeeTransactionBean> expResult = null;
        List<CbFeeTransactionBean> result = instance.listCbFeeTransaction(fee_code);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOneByFeeCode method, of class CbFeeTransactionControl.
     */
    @Test
    public void testFindOneByFeeCode() {
        System.out.println("findOneByFeeCode");
        String fee_code = "";
        CbFeeTransactionControl instance = new CbFeeTransactionControl();
        CbFeeTransactionBean expResult = null;
        CbFeeTransactionBean result = instance.findOneByFeeCode(fee_code);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveCbFeeTransaction method, of class CbFeeTransactionControl.
     */
    @Test
    public void testSaveCbFeeTransaction() {
        System.out.println("saveCbFeeTransaction");
        CbFeeTransactionBean bean = null;
        CbFeeTransactionControl instance = new CbFeeTransactionControl();
        instance.saveCbFeeTransaction(bean);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCbFeeTransaction method, of class CbFeeTransactionControl.
     */
    @Test
    public void testUpdateCbFeeTransaction() {
        System.out.println("updateCbFeeTransaction");
        CbFeeTransactionBean bean = null;
        CbFeeTransactionControl instance = new CbFeeTransactionControl();
        instance.updateCbFeeTransaction(bean);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
