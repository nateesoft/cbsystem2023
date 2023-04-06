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
import th.co.cbank.project.model.BranchBean;

/**
 *
 * @author Acer
 */
public class BranchControlTest {
    
    public BranchControlTest() {
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
     * Test of mappingBean method, of class BranchControl.
     */
    @Test
    public void testMappingBean() throws Exception {
        System.out.println("mappingBean");
        ResultSet rs = null;
        BranchControl instance = new BranchControl();
        List<BranchBean> expResult = null;
        List<BranchBean> result = instance.mappingBean(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listBranch method, of class BranchControl.
     */
    @Test
    public void testListBranch() {
        System.out.println("listBranch");
        BranchControl instance = new BranchControl();
        List<BranchBean> expResult = null;
        List<BranchBean> result = instance.listBranch();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getData method, of class BranchControl.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        BranchControl instance = new BranchControl();
        BranchBean expResult = null;
        BranchBean result = instance.getData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveBranch method, of class BranchControl.
     */
    @Test
    public void testSaveBranch() {
        System.out.println("saveBranch");
        BranchBean bean = null;
        BranchControl instance = new BranchControl();
        instance.saveBranch(bean);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateBranch method, of class BranchControl.
     */
    @Test
    public void testUpdateBranch() {
        System.out.println("updateBranch");
        BranchBean bean = null;
        BranchControl instance = new BranchControl();
        instance.updateBranch(bean);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePatial method, of class BranchControl.
     */
    @Test
    public void testUpdatePatial() {
        System.out.println("updatePatial");
        BranchBean bean = null;
        BranchControl instance = new BranchControl();
        boolean expResult = false;
        boolean result = instance.updatePatial(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
