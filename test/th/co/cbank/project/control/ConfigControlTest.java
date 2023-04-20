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
import th.co.cbank.project.model.ConfigBean;

/**
 *
 * @author Acer
 */
public class ConfigControlTest {
    
    public ConfigControlTest() {
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
     * Test of mappingBean method, of class ConfigControl.
     */
    @Test
    public void testMappingBean() throws Exception {
        System.out.println("mappingBean");
        ResultSet rs = null;
        ConfigControl instance = new ConfigControl();
        List<ConfigBean> expResult = null;
        List<ConfigBean> result = instance.mappingBean(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listConfig method, of class ConfigControl.
     */
    @Test
    public void testListConfig() {
        System.out.println("listConfig");
        ConfigControl instance = new ConfigControl();
        List<ConfigBean> expResult = null;
        List<ConfigBean> result = instance.listConfig();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOne method, of class ConfigControl.
     */
    @Test
    public void testFindOne() {
        System.out.println("findOne");
        ConfigControl instance = new ConfigControl();
        ConfigBean expResult = null;
        ConfigBean result = instance.findOne();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveConfig method, of class ConfigControl.
     */
    @Test
    public void testSaveConfig() {
        System.out.println("saveConfig");
        ConfigBean bean = null;
        ConfigControl instance = new ConfigControl();
        boolean expResult = false;
        boolean result = instance.saveConfig(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateConfig method, of class ConfigControl.
     */
    @Test
    public void testUpdateConfig() {
        System.out.println("updateConfig");
        ConfigBean bean = null;
        ConfigControl instance = new ConfigControl();
        boolean expResult = false;
        boolean result = instance.updateConfig(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateLoanDocRunning method, of class ConfigControl.
     */
    @Test
    public void testUpdateLoanDocRunning() {
        System.out.println("updateLoanDocRunning");
        ConfigControl instance = new ConfigControl();
        boolean expResult = false;
        boolean result = instance.updateLoanDocRunning();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateFeeRunning method, of class ConfigControl.
     */
    @Test
    public void testUpdateFeeRunning() {
        System.out.println("updateFeeRunning");
        ConfigControl instance = new ConfigControl();
        boolean expResult = false;
        boolean result = instance.updateFeeRunning();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetLoanConfig method, of class ConfigControl.
     */
    @Test
    public void testResetLoanConfig() {
        System.out.println("resetLoanConfig");
        String loanCode = "";
        ConfigControl instance = new ConfigControl();
        instance.resetLoanConfig(loanCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetDB method, of class ConfigControl.
     */
    @Test
    public void testResetDB() {
        System.out.println("resetDB");
        ConfigControl instance = new ConfigControl();
        instance.resetDB();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateWithdrawDocRunning method, of class ConfigControl.
     */
    @Test
    public void testUpdateWithdrawDocRunning() {
        System.out.println("updateWithdrawDocRunning");
        ConfigControl instance = new ConfigControl();
        instance.updateWithdrawDocRunning();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
