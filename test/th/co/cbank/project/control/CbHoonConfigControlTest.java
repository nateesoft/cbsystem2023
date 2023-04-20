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
import th.co.cbank.project.model.CbHoonConfigBean;

/**
 *
 * @author Acer
 */
public class CbHoonConfigControlTest {
    
    public CbHoonConfigControlTest() {
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
     * Test of mappingBean method, of class CbHoonConfigControl.
     */
    @Test
    public void testMappingBean() throws Exception {
        System.out.println("mappingBean");
        ResultSet rs = null;
        CbHoonConfigControl instance = new CbHoonConfigControl();
        List<CbHoonConfigBean> expResult = null;
        List<CbHoonConfigBean> result = instance.mappingBean(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listCbHoonConfig method, of class CbHoonConfigControl.
     */
    @Test
    public void testListCbHoonConfig() {
        System.out.println("listCbHoonConfig");
        CbHoonConfigControl instance = new CbHoonConfigControl();
        List<CbHoonConfigBean> expResult = null;
        List<CbHoonConfigBean> result = instance.listCbHoonConfig();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listCbHoonConfigHistory method, of class CbHoonConfigControl.
     */
    @Test
    public void testListCbHoonConfigHistory() {
        System.out.println("listCbHoonConfigHistory");
        CbHoonConfigControl instance = new CbHoonConfigControl();
        List<CbHoonConfigBean> expResult = null;
        List<CbHoonConfigBean> result = instance.listCbHoonConfigHistory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOneByHoonCode method, of class CbHoonConfigControl.
     */
    @Test
    public void testFindOneByHoonCode() {
        System.out.println("findOneByHoonCode");
        String hoonCode = "";
        CbHoonConfigControl instance = new CbHoonConfigControl();
        CbHoonConfigBean expResult = null;
        CbHoonConfigBean result = instance.findOneByHoonCode(hoonCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveCbHoonConfig method, of class CbHoonConfigControl.
     */
    @Test
    public void testSaveCbHoonConfig() {
        System.out.println("saveCbHoonConfig");
        CbHoonConfigBean bean = null;
        CbHoonConfigControl instance = new CbHoonConfigControl();
        boolean expResult = false;
        boolean result = instance.saveCbHoonConfig(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCbHoonConfig method, of class CbHoonConfigControl.
     */
    @Test
    public void testUpdateCbHoonConfig() {
        System.out.println("updateCbHoonConfig");
        CbHoonConfigBean bean = null;
        CbHoonConfigControl instance = new CbHoonConfigControl();
        boolean expResult = false;
        boolean result = instance.updateCbHoonConfig(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteMaster method, of class CbHoonConfigControl.
     */
    @Test
    public void testDeleteMaster() {
        System.out.println("deleteMaster");
        String hoonCode = "";
        CbHoonConfigControl instance = new CbHoonConfigControl();
        boolean expResult = false;
        boolean result = instance.deleteMaster(hoonCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
