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
import th.co.cbank.project.model.CbUserBean;

/**
 *
 * @author Acer
 */
public class CbUserControlTest {
    
    public CbUserControlTest() {
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
     * Test of mappingBean method, of class CbUserControl.
     */
    @Test
    public void testMappingBean() throws Exception {
        System.out.println("mappingBean");
        ResultSet rs = null;
        CbUserControl instance = new CbUserControl();
        CbUserBean expResult = null;
        CbUserBean result = instance.mappingBean(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mappingListBean method, of class CbUserControl.
     */
    @Test
    public void testMappingListBean() throws Exception {
        System.out.println("mappingListBean");
        ResultSet rs = null;
        CbUserControl instance = new CbUserControl();
        List<CbUserBean> expResult = null;
        List<CbUserBean> result = instance.mappingListBean(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listUser method, of class CbUserControl.
     */
    @Test
    public void testListUser() {
        System.out.println("listUser");
        CbUserControl instance = new CbUserControl();
        List<CbUserBean> expResult = null;
        List<CbUserBean> result = instance.listUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class CbUserControl.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        String username = "";
        CbUserControl instance = new CbUserControl();
        CbUserBean expResult = null;
        CbUserBean result = instance.getUser(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveUser method, of class CbUserControl.
     */
    @Test
    public void testSaveUser() {
        System.out.println("saveUser");
        CbUserBean bean = null;
        CbUserControl instance = new CbUserControl();
        instance.saveUser(bean);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUser method, of class CbUserControl.
     */
    @Test
    public void testUpdateUser() {
        System.out.println("updateUser");
        CbUserBean bean = null;
        CbUserControl instance = new CbUserControl();
        instance.updateUser(bean);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validUserConfirm method, of class CbUserControl.
     */
    @Test
    public void testValidUserConfirm() {
        System.out.println("validUserConfirm");
        String userCode = "";
        String password = "";
        CbUserControl instance = new CbUserControl();
        boolean expResult = false;
        boolean result = instance.validUserConfirm(userCode, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOneByUserPass method, of class CbUserControl.
     */
    @Test
    public void testFindOneByUserPass() {
        System.out.println("findOneByUserPass");
        String user = "";
        String pass = "";
        CbUserControl instance = new CbUserControl();
        CbUserBean expResult = null;
        CbUserBean result = instance.findOneByUserPass(user, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findGroupPermissionByUser method, of class CbUserControl.
     */
    @Test
    public void testFindGroupPermissionByUser() {
        System.out.println("findGroupPermissionByUser");
        String user = "";
        CbUserControl instance = new CbUserControl();
        CbGroupBean expResult = null;
        CbGroupBean result = instance.findGroupPermissionByUser(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
