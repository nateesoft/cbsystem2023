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
import th.co.cbank.project.model.CbWithdrawAllowBean;

/**
 *
 * @author Acer
 */
public class CbWithdrawAllowControlTest {
    
    public CbWithdrawAllowControlTest() {
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
     * Test of mappingBean method, of class CbWithdrawAllowControl.
     */
    @Test
    public void testMappingBean() throws Exception {
        System.out.println("mappingBean");
        ResultSet rs = null;
        CbWithdrawAllowControl instance = new CbWithdrawAllowControl();
        List<CbWithdrawAllowBean> expResult = null;
        List<CbWithdrawAllowBean> result = instance.mappingBean(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listCbWithdrawAllow method, of class CbWithdrawAllowControl.
     */
    @Test
    public void testListCbWithdrawAllow_0args() {
        System.out.println("listCbWithdrawAllow");
        CbWithdrawAllowControl instance = new CbWithdrawAllowControl();
        List<CbWithdrawAllowBean> expResult = null;
        List<CbWithdrawAllowBean> result = instance.listCbWithdrawAllow();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listCbWithdrawAllow method, of class CbWithdrawAllowControl.
     */
    @Test
    public void testListCbWithdrawAllow_String() {
        System.out.println("listCbWithdrawAllow");
        String account_no = "";
        CbWithdrawAllowControl instance = new CbWithdrawAllowControl();
        List<CbWithdrawAllowBean> expResult = null;
        List<CbWithdrawAllowBean> result = instance.listCbWithdrawAllow(account_no);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOneyByAccountNo method, of class CbWithdrawAllowControl.
     */
    @Test
    public void testFindOneyByAccountNo() {
        System.out.println("findOneyByAccountNo");
        String account_no = "";
        CbWithdrawAllowControl instance = new CbWithdrawAllowControl();
        CbWithdrawAllowBean expResult = null;
        CbWithdrawAllowBean result = instance.findOneyByAccountNo(account_no);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveCbWithdrawAllow method, of class CbWithdrawAllowControl.
     */
    @Test
    public void testSaveCbWithdrawAllow() {
        System.out.println("saveCbWithdrawAllow");
        CbWithdrawAllowBean bean = null;
        CbWithdrawAllowControl instance = new CbWithdrawAllowControl();
        instance.saveCbWithdrawAllow(bean);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCbWithdrawAllow method, of class CbWithdrawAllowControl.
     */
    @Test
    public void testUpdateCbWithdrawAllow() {
        System.out.println("updateCbWithdrawAllow");
        CbWithdrawAllowBean bean = null;
        CbWithdrawAllowControl instance = new CbWithdrawAllowControl();
        instance.updateCbWithdrawAllow(bean);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaxIndex method, of class CbWithdrawAllowControl.
     */
    @Test
    public void testGetMaxIndex() {
        System.out.println("getMaxIndex");
        String accCode = "";
        CbWithdrawAllowControl instance = new CbWithdrawAllowControl();
        int expResult = 0;
        int result = instance.getMaxIndex(accCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
