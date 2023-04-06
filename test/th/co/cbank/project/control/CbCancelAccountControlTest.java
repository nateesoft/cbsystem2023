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
import th.co.cbank.project.model.CbCancelAccountBean;

/**
 *
 * @author Acer
 */
public class CbCancelAccountControlTest {
    
    public CbCancelAccountControlTest() {
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
     * Test of mappingBean method, of class CbCancelAccountControl.
     */
    @Test
    public void testMappingBean() throws Exception {
        System.out.println("mappingBean");
        ResultSet rs = null;
        CbCancelAccountControl instance = new CbCancelAccountControl();
        List<CbCancelAccountBean> expResult = null;
        List<CbCancelAccountBean> result = instance.mappingBean(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listCbCancelAccount method, of class CbCancelAccountControl.
     */
    @Test
    public void testListCbCancelAccount_0args() {
        System.out.println("listCbCancelAccount");
        CbCancelAccountControl instance = new CbCancelAccountControl();
        List<CbCancelAccountBean> expResult = null;
        List<CbCancelAccountBean> result = instance.listCbCancelAccount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listCbCancelAccount method, of class CbCancelAccountControl.
     */
    @Test
    public void testListCbCancelAccount_String() {
        System.out.println("listCbCancelAccount");
        String date_cancel = "";
        CbCancelAccountControl instance = new CbCancelAccountControl();
        List<CbCancelAccountBean> expResult = null;
        List<CbCancelAccountBean> result = instance.listCbCancelAccount(date_cancel);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOneByDateCancel method, of class CbCancelAccountControl.
     */
    @Test
    public void testFindOneByDateCancel() {
        System.out.println("findOneByDateCancel");
        String date_cancel = "";
        CbCancelAccountControl instance = new CbCancelAccountControl();
        CbCancelAccountBean expResult = null;
        CbCancelAccountBean result = instance.findOneByDateCancel(date_cancel);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveCbCancelAccount method, of class CbCancelAccountControl.
     */
    @Test
    public void testSaveCbCancelAccount() {
        System.out.println("saveCbCancelAccount");
        CbCancelAccountBean bean = null;
        CbCancelAccountControl instance = new CbCancelAccountControl();
        instance.saveCbCancelAccount(bean);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCbCancelAccount method, of class CbCancelAccountControl.
     */
    @Test
    public void testUpdateCbCancelAccount() {
        System.out.println("updateCbCancelAccount");
        CbCancelAccountBean bean = null;
        CbCancelAccountControl instance = new CbCancelAccountControl();
        instance.updateCbCancelAccount(bean);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
