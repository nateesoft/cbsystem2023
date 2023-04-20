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
import th.co.cbank.project.model.CustfileBean;

/**
 *
 * @author Acer
 */
public class CustFileControlTest {
    
    public CustFileControlTest() {
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
     * Test of deleteCustFile method, of class CustFileControl.
     */
    @Test
    public void testDeleteCustFile() {
        System.out.println("deleteCustFile");
        String SP_Code = "";
        CustFileControl instance = new CustFileControl();
        boolean expResult = false;
        boolean result = instance.deleteCustFile(SP_Code);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveCustFile method, of class CustFileControl.
     */
    @Test
    public void testSaveCustFile() {
        System.out.println("saveCustFile");
        CustfileBean bean = null;
        CustFileControl instance = new CustFileControl();
        boolean expResult = false;
        boolean result = instance.saveCustFile(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mappingBean method, of class CustFileControl.
     */
    @Test
    public void testMappingBean() throws Exception {
        System.out.println("mappingBean");
        ResultSet rs = null;
        CustFileControl instance = new CustFileControl();
        List<CustfileBean> expResult = null;
        List<CustfileBean> result = instance.mappingBean(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListBean method, of class CustFileControl.
     */
    @Test
    public void testGetListBean() {
        System.out.println("getListBean");
        CustFileControl instance = new CustFileControl();
        List<CustfileBean> expResult = null;
        List<CustfileBean> result = instance.getListBean();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListCustFile method, of class CustFileControl.
     */
    @Test
    public void testGetListCustFile() {
        System.out.println("getListCustFile");
        String orderBy = "";
        String tel = "";
        CustFileControl instance = new CustFileControl();
        List<CustfileBean> expResult = null;
        List<CustfileBean> result = instance.getListCustFile(orderBy, tel);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOneBySpCode method, of class CustFileControl.
     */
    @Test
    public void testFindOneBySpCode() {
        System.out.println("findOneBySpCode");
        String spCode = "";
        CustFileControl instance = new CustFileControl();
        CustfileBean expResult = null;
        CustfileBean result = instance.findOneBySpCode(spCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
