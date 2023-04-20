/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.cbank.project.control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import th.co.cbank.project.model.SettingBean;

/**
 *
 * @author Acer
 */
public class SettingFingerControlTest {
    
    public SettingFingerControlTest() {
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
     * Test of save method, of class SettingFingerControl.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        SettingBean bean = null;
        SettingFingerControl instance = new SettingFingerControl();
        boolean expResult = false;
        boolean result = instance.save(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existData method, of class SettingFingerControl.
     */
    @Test
    public void testExistData() {
        System.out.println("existData");
        SettingFingerControl instance = new SettingFingerControl();
        boolean expResult = false;
        boolean result = instance.existData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOne method, of class SettingFingerControl.
     */
    @Test
    public void testFindOne() {
        System.out.println("findOne");
        SettingFingerControl instance = new SettingFingerControl();
        SettingBean expResult = null;
        SettingBean result = instance.findOne();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
