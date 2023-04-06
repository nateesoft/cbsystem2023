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
public class CancelPwdDialogTest {
    
    public CancelPwdDialogTest() {
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
     * Test of isPwdOk method, of class CancelPwdDialog.
     */
    @Test
    public void testIsPwdOk() {
        System.out.println("isPwdOk");
        CancelPwdDialog instance = null;
        boolean expResult = false;
        boolean result = instance.isPwdOk();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPwdOk method, of class CancelPwdDialog.
     */
    @Test
    public void testIsPwdOk_boolean() {
        System.out.println("isPwdOk");
        boolean isOk = false;
        CancelPwdDialog instance = null;
        instance.isPwdOk(isOk);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
