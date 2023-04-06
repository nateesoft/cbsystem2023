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
import th.co.cbank.project.model.CbStatusBean;

/**
 *
 * @author Acer
 */
public class CbStatusControlTest {
    
    public CbStatusControlTest() {
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
     * Test of listExpense method, of class CbStatusControl.
     */
    @Test
    public void testListExpense() {
        System.out.println("listExpense");
        CbStatusControl instance = new CbStatusControl();
        List<CbStatusBean> expResult = null;
        List<CbStatusBean> result = instance.listExpense();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOneByExpId method, of class CbStatusControl.
     */
    @Test
    public void testFindOneByExpId() {
        System.out.println("findOneByExpId");
        String exp_id = "";
        CbStatusControl instance = new CbStatusControl();
        CbStatusBean expResult = null;
        CbStatusBean result = instance.findOneByExpId(exp_id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveExpense method, of class CbStatusControl.
     */
    @Test
    public void testSaveExpense() {
        System.out.println("saveExpense");
        CbStatusBean bean = null;
        CbStatusControl instance = new CbStatusControl();
        boolean expResult = false;
        boolean result = instance.saveExpense(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateExpense method, of class CbStatusControl.
     */
    @Test
    public void testUpdateExpense() {
        System.out.println("updateExpense");
        CbStatusBean bean = null;
        CbStatusControl instance = new CbStatusControl();
        boolean expResult = false;
        boolean result = instance.updateExpense(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
