/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.cbank.project.control;

import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import th.co.cbank.project.model.CbSaveConfigBean;

/**
 *
 * @author Acer
 */
public class CbSaveConfigControlTest {
    
    public CbSaveConfigControlTest() {
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
     * Test of listSaveConfig method, of class CbSaveConfigControl.
     */
    @Test
    public void testListSaveConfig() {
        System.out.println("listSaveConfig");
        CbSaveConfigControl instance = new CbSaveConfigControl();
        List<CbSaveConfigBean> expResult = null;
        List<CbSaveConfigBean> result = instance.listSaveConfig();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listSaveConfigHistory method, of class CbSaveConfigControl.
     */
    @Test
    public void testListSaveConfigHistory_0args() {
        System.out.println("listSaveConfigHistory");
        CbSaveConfigControl instance = new CbSaveConfigControl();
        List<CbSaveConfigBean> expResult = null;
        List<CbSaveConfigBean> result = instance.listSaveConfigHistory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listSaveConfigHistory method, of class CbSaveConfigControl.
     */
    @Test
    public void testListSaveConfigHistory_String() {
        System.out.println("listSaveConfigHistory");
        String accountType = "";
        CbSaveConfigControl instance = new CbSaveConfigControl();
        List<CbSaveConfigBean> expResult = null;
        List<CbSaveConfigBean> result = instance.listSaveConfigHistory(accountType);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOneByTypeCode method, of class CbSaveConfigControl.
     */
    @Test
    public void testFindOneByTypeCode() {
        System.out.println("findOneByTypeCode");
        String typeCode = "";
        CbSaveConfigControl instance = new CbSaveConfigControl();
        CbSaveConfigBean expResult = null;
        CbSaveConfigBean result = instance.findOneByTypeCode(typeCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of typeCodeExist method, of class CbSaveConfigControl.
     */
    @Test
    public void testTypeCodeExist() {
        System.out.println("typeCodeExist");
        String TypeCode = "";
        CbSaveConfigControl instance = new CbSaveConfigControl();
        boolean expResult = false;
        boolean result = instance.typeCodeExist(TypeCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveCbSaveConfig method, of class CbSaveConfigControl.
     */
    @Test
    public void testSaveCbSaveConfig() {
        System.out.println("saveCbSaveConfig");
        CbSaveConfigBean bean = null;
        CbSaveConfigControl instance = new CbSaveConfigControl();
        boolean expResult = false;
        boolean result = instance.saveCbSaveConfig(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCbSaveConfig method, of class CbSaveConfigControl.
     */
    @Test
    public void testUpdateCbSaveConfig() {
        System.out.println("updateCbSaveConfig");
        CbSaveConfigBean bean = null;
        CbSaveConfigControl instance = new CbSaveConfigControl();
        boolean expResult = false;
        boolean result = instance.updateCbSaveConfig(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaxInt method, of class CbSaveConfigControl.
     */
    @Test
    public void testGetMaxInt() {
        System.out.println("getMaxInt");
        String saveAccType = "";
        CbSaveConfigControl instance = new CbSaveConfigControl();
        int expResult = 0;
        int result = instance.getMaxInt(saveAccType);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateMaxInt method, of class CbSaveConfigControl.
     */
    @Test
    public void testUpdateMaxInt() {
        System.out.println("updateMaxInt");
        String saveAccType = "";
        CbSaveConfigControl instance = new CbSaveConfigControl();
        instance.updateMaxInt(saveAccType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteConfig method, of class CbSaveConfigControl.
     */
    @Test
    public void testDeleteConfig() {
        System.out.println("deleteConfig");
        String SaveDocType = "";
        CbSaveConfigControl instance = new CbSaveConfigControl();
        boolean expResult = false;
        boolean result = instance.deleteConfig(SaveDocType);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateSaveRunningAndNoRunning method, of class CbSaveConfigControl.
     */
    @Test
    public void testUpdateSaveRunningAndNoRunning() {
        System.out.println("updateSaveRunningAndNoRunning");
        String accountType = "";
        CbSaveConfigControl instance = new CbSaveConfigControl();
        boolean expResult = false;
        boolean result = instance.updateSaveRunningAndNoRunning(accountType);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOneByUpdateDateTypeCode method, of class CbSaveConfigControl.
     */
    @Test
    public void testFindOneByUpdateDateTypeCode() {
        System.out.println("findOneByUpdateDateTypeCode");
        Date dateCheck = null;
        String typeCode = "";
        CbSaveConfigControl instance = new CbSaveConfigControl();
        CbSaveConfigBean expResult = null;
        CbSaveConfigBean result = instance.findOneByUpdateDateTypeCode(dateCheck, typeCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
