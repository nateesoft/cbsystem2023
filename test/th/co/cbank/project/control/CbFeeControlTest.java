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
import th.co.cbank.project.model.CbFeeBean;

/**
 *
 * @author Acer
 */
public class CbFeeControlTest {
    
    public CbFeeControlTest() {
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
     * Test of mappingBean method, of class CbFeeControl.
     */
    @Test
    public void testMappingBean() throws Exception {
        System.out.println("mappingBean");
        ResultSet rs = null;
        CbFeeControl instance = new CbFeeControl();
        List<CbFeeBean> expResult = null;
        List<CbFeeBean> result = instance.mappingBean(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listCbFee method, of class CbFeeControl.
     */
    @Test
    public void testListCbFee_0args() {
        System.out.println("listCbFee");
        CbFeeControl instance = new CbFeeControl();
        List<CbFeeBean> expResult = null;
        List<CbFeeBean> result = instance.listCbFee();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listCbFee method, of class CbFeeControl.
     */
    @Test
    public void testListCbFee_String() {
        System.out.println("listCbFee");
        String exp_id = "";
        CbFeeControl instance = new CbFeeControl();
        List<CbFeeBean> expResult = null;
        List<CbFeeBean> result = instance.listCbFee(exp_id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOneByExpId method, of class CbFeeControl.
     */
    @Test
    public void testFindOneByExpId() {
        System.out.println("findOneByExpId");
        String exp_id = "";
        CbFeeControl instance = new CbFeeControl();
        CbFeeBean expResult = null;
        CbFeeBean result = instance.findOneByExpId(exp_id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveCbFee method, of class CbFeeControl.
     */
    @Test
    public void testSaveCbFee() {
        System.out.println("saveCbFee");
        CbFeeBean bean = null;
        CbFeeControl instance = new CbFeeControl();
        instance.saveCbFee(bean);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCbFee method, of class CbFeeControl.
     */
    @Test
    public void testUpdateCbFee() {
        System.out.println("updateCbFee");
        CbFeeBean bean = null;
        CbFeeControl instance = new CbFeeControl();
        instance.updateCbFee(bean);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listExpense method, of class CbFeeControl.
     */
    @Test
    public void testListExpense() {
        System.out.println("listExpense");
        CbFeeControl instance = new CbFeeControl();
        List<CbFeeBean> expResult = null;
        List<CbFeeBean> result = instance.listExpense();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveExpense method, of class CbFeeControl.
     */
    @Test
    public void testSaveExpense() {
        System.out.println("saveExpense");
        CbFeeBean bean = null;
        CbFeeControl instance = new CbFeeControl();
        boolean expResult = false;
        boolean result = instance.saveExpense(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateExpense method, of class CbFeeControl.
     */
    @Test
    public void testUpdateExpense() {
        System.out.println("updateExpense");
        CbFeeBean bean = null;
        CbFeeControl instance = new CbFeeControl();
        boolean expResult = false;
        boolean result = instance.updateExpense(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
