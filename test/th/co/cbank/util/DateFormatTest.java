/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.cbank.util;

import java.text.SimpleDateFormat;
import java.util.Date;
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
public class DateFormatTest {
    
    public DateFormatTest() {
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
     * Test of dateFromJSON method, of class DateFormat.
     */
    @Test
    public void testDateFromJSON() {
        System.out.println("dateFromJSON");
        String d = "";
        Date expResult = null;
        Date result = DateFormat.dateFromJSON(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dateFromJSONThai method, of class DateFormat.
     */
    @Test
    public void testDateFromJSONThai() {
        System.out.println("dateFromJSONThai");
        String d = "";
        Date expResult = null;
        Date result = DateFormat.dateFromJSONThai(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocale_ddMMyyyy method, of class DateFormat.
     */
    @Test
    public void testGetLocale_ddMMyyyy() {
        System.out.println("getLocale_ddMMyyyy");
        Date d = null;
        String expResult = "";
        String result = DateFormat.getLocale_ddMMyyyy(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnglish_ddMMyyyy method, of class DateFormat.
     */
    @Test
    public void testGetEnglish_ddMMyyyy_Date() {
        System.out.println("getEnglish_ddMMyyyy");
        Date d = null;
        String expResult = "";
        String result = DateFormat.getEnglish_ddMMyyyy(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMySQL_Date method, of class DateFormat.
     */
    @Test
    public void testGetMySQL_Date() {
        System.out.println("getMySQL_Date");
        Date d = null;
        String expResult = "";
        String result = DateFormat.getMySQL_Date(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMySQL_DateTime method, of class DateFormat.
     */
    @Test
    public void testGetMySQL_DateTime_Date() {
        System.out.println("getMySQL_DateTime");
        Date d = null;
        String expResult = "";
        String result = DateFormat.getMySQL_DateTime(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMySQL_DateTime method, of class DateFormat.
     */
    @Test
    public void testGetMySQL_DateTime_String() {
        System.out.println("getMySQL_DateTime");
        String date = "";
        Date expResult = null;
        Date result = DateFormat.getMySQL_DateTime(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMyFormat method, of class DateFormat.
     */
    @Test
    public void testGetMyFormat() {
        System.out.println("getMyFormat");
        SimpleDateFormat simp = null;
        Date d = null;
        String expResult = "";
        String result = DateFormat.getMyFormat(simp, d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocal_ddMMyyyy method, of class DateFormat.
     */
    @Test
    public void testGetLocal_ddMMyyyy() {
        System.out.println("getLocal_ddMMyyyy");
        String s = "";
        Date expResult = null;
        Date result = DateFormat.getLocal_ddMMyyyy(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocal_yyyyMMdd method, of class DateFormat.
     */
    @Test
    public void testGetLocal_yyyyMMdd() {
        System.out.println("getLocal_yyyyMMdd");
        String s = "";
        Date expResult = null;
        Date result = DateFormat.getLocal_yyyyMMdd(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnglish_ddMMyyyy method, of class DateFormat.
     */
    @Test
    public void testGetEnglish_ddMMyyyy_String() {
        System.out.println("getEnglish_ddMMyyyy");
        String s = "";
        Date expResult = null;
        Date result = DateFormat.getEnglish_ddMMyyyy(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnglish_yyyyMMdd method, of class DateFormat.
     */
    @Test
    public void testGetEnglish_yyyyMMdd() {
        System.out.println("getEnglish_yyyyMMdd");
        String s = "";
        Date expResult = null;
        Date result = DateFormat.getEnglish_yyyyMMdd(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sample method, of class DateFormat.
     */
    @Test
    public void testSample() {
        System.out.println("sample");
        String expResult = "";
        String result = DateFormat.sample();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
