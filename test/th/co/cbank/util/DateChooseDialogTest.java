/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.cbank.util;

import java.util.Calendar;
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
public class DateChooseDialogTest {
    
    public DateChooseDialogTest() {
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
     * Test of isOk method, of class DateChooseDialog.
     */
    @Test
    public void testIsOk() {
        System.out.println("isOk");
        DateChooseDialog instance = null;
        boolean expResult = false;
        boolean result = instance.isOk();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelectDate method, of class DateChooseDialog.
     */
    @Test
    public void testGetSelectDate() {
        System.out.println("getSelectDate");
        DateChooseDialog instance = null;
        Calendar expResult = null;
        Calendar result = instance.getSelectDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateString method, of class DateChooseDialog.
     */
    @Test
    public void testGetDateString() {
        System.out.println("getDateString");
        DateChooseDialog instance = null;
        String expResult = "";
        String result = instance.getDateString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
