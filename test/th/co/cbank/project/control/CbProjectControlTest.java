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
import th.co.cbank.project.model.CbProjectBean;

/**
 *
 * @author Acer
 */
public class CbProjectControlTest {
    
    public CbProjectControlTest() {
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
     * Test of listProject method, of class CbProjectControl.
     */
    @Test
    public void testListProject() {
        System.out.println("listProject");
        CbProjectControl instance = new CbProjectControl();
        List<CbProjectBean> expResult = null;
        List<CbProjectBean> result = instance.listProject();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOneByPjId method, of class CbProjectControl.
     */
    @Test
    public void testFindOneByPjId() {
        System.out.println("findOneByPjId");
        String pj_id = "";
        CbProjectControl instance = new CbProjectControl();
        CbProjectBean expResult = null;
        CbProjectBean result = instance.findOneByPjId(pj_id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveProject method, of class CbProjectControl.
     */
    @Test
    public void testSaveProject() {
        System.out.println("saveProject");
        CbProjectBean bean = null;
        CbProjectControl instance = new CbProjectControl();
        boolean expResult = false;
        boolean result = instance.saveProject(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateProject method, of class CbProjectControl.
     */
    @Test
    public void testUpdateProject() {
        System.out.println("updateProject");
        CbProjectBean bean = null;
        CbProjectControl instance = new CbProjectControl();
        boolean expResult = false;
        boolean result = instance.updateProject(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
