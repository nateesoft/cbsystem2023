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
import th.co.cbank.project.model.CbPrefixBean;

/**
 *
 * @author Acer
 */
public class CbPrefixControlTest {
    
    public CbPrefixControlTest() {
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
     * Test of listPrefix method, of class CbPrefixControl.
     */
    @Test
    public void testListPrefix() {
        System.out.println("listPrefix");
        CbPrefixControl instance = new CbPrefixControl();
        List<CbPrefixBean> expResult = null;
        List<CbPrefixBean> result = instance.listPrefix();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOneByCode method, of class CbPrefixControl.
     */
    @Test
    public void testFindOneByCode() {
        System.out.println("findOneByCode");
        String code = "";
        CbPrefixControl instance = new CbPrefixControl();
        CbPrefixBean expResult = null;
        CbPrefixBean result = instance.findOneByCode(code);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of savePrefix method, of class CbPrefixControl.
     */
    @Test
    public void testSavePrefix() {
        System.out.println("savePrefix");
        CbPrefixBean bean = null;
        CbPrefixControl instance = new CbPrefixControl();
        boolean expResult = false;
        boolean result = instance.savePrefix(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePrefix method, of class CbPrefixControl.
     */
    @Test
    public void testUpdatePrefix() {
        System.out.println("updatePrefix");
        CbPrefixBean bean = null;
        CbPrefixControl instance = new CbPrefixControl();
        boolean expResult = false;
        boolean result = instance.updatePrefix(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
