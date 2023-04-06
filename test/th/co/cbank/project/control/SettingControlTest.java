/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.cbank.project.control;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import th.co.cbank.project.model.GroupBean;

/**
 *
 * @author Acer
 */
public class SettingControlTest {
    
    public SettingControlTest() {
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
     * Test of listCbGroup method, of class SettingControl.
     */
    @Test
    public void testListCbGroup() {
        System.out.println("listCbGroup");
        SettingControl instance = new SettingControl();
        List<GroupBean> expResult = null;
        List<GroupBean> result = instance.listCbGroup();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOneByGroupCode method, of class SettingControl.
     */
    @Test
    public void testFindOneByGroupCode() {
        System.out.println("findOneByGroupCode");
        String groupCode = "";
        SettingControl instance = new SettingControl();
        GroupBean expResult = null;
        GroupBean result = instance.findOneByGroupCode(groupCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveCbGroup method, of class SettingControl.
     */
    @Test
    public void testSaveCbGroup() {
        System.out.println("saveCbGroup");
        GroupBean bean = null;
        SettingControl instance = new SettingControl();
        instance.saveCbGroup(bean);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCbGroup method, of class SettingControl.
     */
    @Test
    public void testUpdateCbGroup() {
        System.out.println("updateCbGroup");
        GroupBean bean = null;
        SettingControl instance = new SettingControl();
        instance.updateCbGroup(bean);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
