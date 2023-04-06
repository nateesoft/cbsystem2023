/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.cbank.util;

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
public class ThaiUtilTest {
    
    public ThaiUtilTest() {
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
     * Test of Unicode2ASCII method, of class ThaiUtil.
     */
    @Test
    public void testUnicode2ASCII() {
        System.out.println("Unicode2ASCII");
        String unicode = "";
        String expResult = "";
        String result = ThaiUtil.Unicode2ASCII(unicode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ASCII2Unicode method, of class ThaiUtil.
     */
    @Test
    public void testASCII2Unicode() {
        System.out.println("ASCII2Unicode");
        String ascii = "";
        String expResult = "";
        String result = ThaiUtil.ASCII2Unicode(ascii);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Unicode2ASCII_js method, of class ThaiUtil.
     */
    @Test
    public void testUnicode2ASCII_js() {
        System.out.println("Unicode2ASCII_js");
        String text = "";
        String expResult = "";
        String result = ThaiUtil.Unicode2ASCII_js(text);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
