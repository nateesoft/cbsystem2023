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
import th.co.cbank.project.model.CbExpenseBean;

/**
 *
 * @author Acer
 */
public class CbExpenseControlTest {
    
    public CbExpenseControlTest() {
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
     * Test of mappingBean method, of class CbExpenseControl.
     */
    @Test
    public void testMappingBean() throws Exception {
        System.out.println("mappingBean");
        ResultSet rs = null;
        CbExpenseControl instance = new CbExpenseControl();
        List<CbExpenseBean> expResult = null;
        List<CbExpenseBean> result = instance.mappingBean(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listExpense method, of class CbExpenseControl.
     */
    @Test
    public void testListExpense() {
        System.out.println("listExpense");
        CbExpenseControl instance = new CbExpenseControl();
        List<CbExpenseBean> expResult = null;
        List<CbExpenseBean> result = instance.listExpense();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOneByExpId method, of class CbExpenseControl.
     */
    @Test
    public void testFindOneByExpId() {
        System.out.println("findOneByExpId");
        String exp_id = "";
        CbExpenseControl instance = new CbExpenseControl();
        CbExpenseBean expResult = null;
        CbExpenseBean result = instance.findOneByExpId(exp_id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveExpense method, of class CbExpenseControl.
     */
    @Test
    public void testSaveExpense() {
        System.out.println("saveExpense");
        CbExpenseBean bean = null;
        CbExpenseControl instance = new CbExpenseControl();
        boolean expResult = false;
        boolean result = instance.saveExpense(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateExpense method, of class CbExpenseControl.
     */
    @Test
    public void testUpdateExpense() {
        System.out.println("updateExpense");
        CbExpenseBean bean = null;
        CbExpenseControl instance = new CbExpenseControl();
        boolean expResult = false;
        boolean result = instance.updateExpense(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
