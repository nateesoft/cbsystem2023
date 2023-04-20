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
public class NumberFormatTest {
    
    public NumberFormatTest() {
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
     * Test of showCommaOnly method, of class NumberFormat.
     */
    @Test
    public void testShowCommaOnly_float() {
        System.out.println("showCommaOnly");
        float obj = 0.0F;
        String expResult = "";
        String result = NumberFormat.showCommaOnly(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showCommaOnly method, of class NumberFormat.
     */
    @Test
    public void testShowCommaOnly_int() {
        System.out.println("showCommaOnly");
        int obj = 0;
        String expResult = "";
        String result = NumberFormat.showCommaOnly(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showDouble2 method, of class NumberFormat.
     */
    @Test
    public void testShowDouble2_float() {
        System.out.println("showDouble2");
        float obj = 0.0F;
        String expResult = "";
        String result = NumberFormat.showDouble2(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showDouble2 method, of class NumberFormat.
     */
    @Test
    public void testShowDouble2_double() {
        System.out.println("showDouble2");
        double obj = 0.0;
        String expResult = "";
        String result = NumberFormat.showDouble2(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showDouble2ToCeil method, of class NumberFormat.
     */
    @Test
    public void testShowDouble2ToCeil() {
        System.out.println("showDouble2ToCeil");
        double obj = 0.0;
        String expResult = "";
        String result = NumberFormat.showDouble2ToCeil(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showDouble2 method, of class NumberFormat.
     */
    @Test
    public void testShowDouble2_String() {
        System.out.println("showDouble2");
        String str = "";
        String expResult = "";
        String result = NumberFormat.showDouble2(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showDouble3 method, of class NumberFormat.
     */
    @Test
    public void testShowDouble3_float() {
        System.out.println("showDouble3");
        float obj = 0.0F;
        String expResult = "";
        String result = NumberFormat.showDouble3(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showDouble3 method, of class NumberFormat.
     */
    @Test
    public void testShowDouble3_double() {
        System.out.println("showDouble3");
        double obj = 0.0;
        String expResult = "";
        String result = NumberFormat.showDouble3(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showDouble3 method, of class NumberFormat.
     */
    @Test
    public void testShowDouble3_String() {
        System.out.println("showDouble3");
        String str = "";
        String expResult = "";
        String result = NumberFormat.showDouble3(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showDouble4 method, of class NumberFormat.
     */
    @Test
    public void testShowDouble4_float() {
        System.out.println("showDouble4");
        float obj = 0.0F;
        String expResult = "";
        String result = NumberFormat.showDouble4(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showDouble4 method, of class NumberFormat.
     */
    @Test
    public void testShowDouble4_double() {
        System.out.println("showDouble4");
        double obj = 0.0;
        String expResult = "";
        String result = NumberFormat.showDouble4(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showDouble4 method, of class NumberFormat.
     */
    @Test
    public void testShowDouble4_String() {
        System.out.println("showDouble4");
        String str = "";
        String expResult = "";
        String result = NumberFormat.showDouble4(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showDouble5 method, of class NumberFormat.
     */
    @Test
    public void testShowDouble5_float() {
        System.out.println("showDouble5");
        float obj = 0.0F;
        String expResult = "";
        String result = NumberFormat.showDouble5(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showDouble5 method, of class NumberFormat.
     */
    @Test
    public void testShowDouble5_double() {
        System.out.println("showDouble5");
        double obj = 0.0;
        String expResult = "";
        String result = NumberFormat.showDouble5(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showDouble5 method, of class NumberFormat.
     */
    @Test
    public void testShowDouble5_String() {
        System.out.println("showDouble5");
        String str = "";
        String expResult = "";
        String result = NumberFormat.showDouble5(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toDouble method, of class NumberFormat.
     */
    @Test
    public void testToDouble() {
        System.out.println("toDouble");
        String str = "";
        Double expResult = null;
        Double result = NumberFormat.toDouble(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toInt method, of class NumberFormat.
     */
    @Test
    public void testToInt() {
        System.out.println("toInt");
        String str = "";
        Integer expResult = null;
        Integer result = NumberFormat.toInt(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toNumberFormat method, of class NumberFormat.
     */
    @Test
    public void testToNumberFormat() {
        System.out.println("toNumberFormat");
        Object obj = null;
        String expResult = "";
        String result = NumberFormat.toNumberFormat(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
