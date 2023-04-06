/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.cbank.util;

import java.awt.Component;
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
public class MessageAlertTest {
    
    public MessageAlertTest() {
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
     * Test of infoPopup method, of class MessageAlert.
     */
    @Test
    public void testInfoPopup_Class_String() {
        System.out.println("infoPopup");
        Class clazz = null;
        String message = "";
        MessageAlert.infoPopup(clazz, message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoPopup method, of class MessageAlert.
     */
    @Test
    public void testInfoPopup_Component_String() {
        System.out.println("infoPopup");
        Component parentComponent = null;
        String message = "";
        MessageAlert.infoPopup(parentComponent, message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of warningPopup method, of class MessageAlert.
     */
    @Test
    public void testWarningPopup_Class_String() {
        System.out.println("warningPopup");
        Class clazz = null;
        String message = "";
        MessageAlert.warningPopup(clazz, message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of warningPopup method, of class MessageAlert.
     */
    @Test
    public void testWarningPopup_Component_String() {
        System.out.println("warningPopup");
        Component parentComponent = null;
        String message = "";
        MessageAlert.warningPopup(parentComponent, message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of errorPopup method, of class MessageAlert.
     */
    @Test
    public void testErrorPopup_Class_String() {
        System.out.println("errorPopup");
        Class clazz = null;
        String message = "";
        MessageAlert.errorPopup(clazz, message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of errorPopup method, of class MessageAlert.
     */
    @Test
    public void testErrorPopup_Component_String() {
        System.out.println("errorPopup");
        Component parentComponent = null;
        String message = "";
        MessageAlert.errorPopup(parentComponent, message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showConfirm method, of class MessageAlert.
     */
    @Test
    public void testShowConfirm() {
        System.out.println("showConfirm");
        Component parentComponent = null;
        String title = "";
        int expResult = 0;
        int result = MessageAlert.showConfirm(parentComponent, title);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
