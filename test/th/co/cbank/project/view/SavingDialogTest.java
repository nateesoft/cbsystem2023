/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.cbank.project.view;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Acer
 */
public class SavingDialogTest {
    
    public SavingDialogTest() {
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
     * Test of getProfileCode method, of class SavingDialog.
     */
    @Test
    public void testGetProfileCode() {
        System.out.println("getProfileCode");
        SavingDialog instance = null;
        String expResult = "";
        String result = instance.getProfileCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProfileCode method, of class SavingDialog.
     */
    @Test
    public void testSetProfileCode() {
        System.out.println("setProfileCode");
        String profileCode = "";
        SavingDialog instance = null;
        instance.setProfileCode(profileCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
