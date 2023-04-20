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
import th.co.cbank.project.model.CbGroupBean;

/**
 *
 * @author Acer
 */
public class CbGroupControlTest {
    
    public CbGroupControlTest() {
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
     * Test of mappingBean method, of class CbGroupControl.
     */
    @Test
    public void testMappingBean() throws Exception {
        System.out.println("mappingBean");
        ResultSet rs = null;
        CbGroupControl instance = new CbGroupControl();
        List<CbGroupBean> expResult = null;
        List<CbGroupBean> result = instance.mappingBean(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listCbGroup method, of class CbGroupControl.
     */
    @Test
    public void testListCbGroup_0args() {
        System.out.println("listCbGroup");
        CbGroupControl instance = new CbGroupControl();
        List<CbGroupBean> expResult = null;
        List<CbGroupBean> result = instance.listCbGroup();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listCbGroup method, of class CbGroupControl.
     */
    @Test
    public void testListCbGroup_String() {
        System.out.println("listCbGroup");
        String groupcode = "";
        CbGroupControl instance = new CbGroupControl();
        List<CbGroupBean> expResult = null;
        List<CbGroupBean> result = instance.listCbGroup(groupcode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOneByGroupCode method, of class CbGroupControl.
     */
    @Test
    public void testFindOneByGroupCode() {
        System.out.println("findOneByGroupCode");
        String groupcode = "";
        CbGroupControl instance = new CbGroupControl();
        CbGroupBean expResult = null;
        CbGroupBean result = instance.findOneByGroupCode(groupcode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveCbGroup method, of class CbGroupControl.
     */
    @Test
    public void testSaveCbGroup() {
        System.out.println("saveCbGroup");
        CbGroupBean bean = null;
        CbGroupControl instance = new CbGroupControl();
        instance.saveCbGroup(bean);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCbGroup method, of class CbGroupControl.
     */
    @Test
    public void testUpdateCbGroup() {
        System.out.println("updateCbGroup");
        CbGroupBean bean = null;
        CbGroupControl instance = new CbGroupControl();
        boolean expResult = false;
        boolean result = instance.updateCbGroup(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
