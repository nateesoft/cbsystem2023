/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.cbank.util;

import java.util.Calendar;
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
public class DateUtilTest {
    
    public DateUtilTest() {
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
     * Test of diff method, of class DateUtil.
     */
    @Test
    public void testDiff() {
        System.out.println("diff");
        Date date1 = null;
        Date date2 = null;
        int expResult = 0;
        int result = DateUtil.diff(date1, date2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of countDiffDay method, of class DateUtil.
     */
    @Test
    public void testCountDiffDay() {
        System.out.println("countDiffDay");
        Calendar c1 = null;
        Calendar c2 = null;
        int expResult = 0;
        int result = DateUtil.countDiffDay(c1, c2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeDate method, of class DateUtil.
     */
    @Test
    public void testMakeDate() throws Exception {
        System.out.println("makeDate");
        String dateString = "";
        Date expResult = null;
        Date result = DateUtil.makeDate(dateString);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLengthToCurrent method, of class DateUtil.
     */
    @Test
    public void testGetLengthToCurrent_3args() {
        System.out.println("getLengthToCurrent");
        int year = 0;
        int month = 0;
        int day = 0;
        long expResult = 0L;
        long result = DateUtil.getLengthToCurrent(year, month, day);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLengthToCurrent method, of class DateUtil.
     */
    @Test
    public void testGetLengthToCurrent_juDate() {
        System.out.println("getLengthToCurrent");
        Date d = null;
        long expResult = 0L;
        long result = DateUtil.getLengthToCurrent(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDayQty method, of class DateUtil.
     */
    @Test
    public void testGetDayQty_Calendar() {
        System.out.println("getDayQty");
        Calendar cTarget = null;
        int expResult = 0;
        int result = DateUtil.getDayQty(cTarget);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDayQty method, of class DateUtil.
     */
    @Test
    public void testGetDayQty_Calendar_Calendar() {
        System.out.println("getDayQty");
        Calendar cc1 = null;
        Calendar cc2 = null;
        int expResult = 0;
        int result = DateUtil.getDayQty(cc1, cc2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDayQty method, of class DateUtil.
     */
    @Test
    public void testGetDayQty_juDate() {
        System.out.println("getDayQty");
        Date cTarget = null;
        int expResult = 0;
        int result = DateUtil.getDayQty(cTarget);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDayQty method, of class DateUtil.
     */
    @Test
    public void testGetDayQty_3args() {
        System.out.println("getDayQty");
        int year = 0;
        int month = 0;
        int day = 0;
        int expResult = 0;
        int result = DateUtil.getDayQty(year, month, day);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentDateStr method, of class DateUtil.
     */
    @Test
    public void testGetCurrentDateStr() {
        System.out.println("getCurrentDateStr");
        String expResult = "";
        String result = DateUtil.getCurrentDateStr();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toDate method, of class DateUtil.
     */
    @Test
    public void testToDate() {
        System.out.println("toDate");
        java.sql.Date date = null;
        Date expResult = null;
        Date result = DateUtil.toDate(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDayDiff method, of class DateUtil.
     */
    @Test
    public void testGetDayDiff_juDate_juDate() {
        System.out.println("getDayDiff");
        Date d1 = null;
        Date d2 = null;
        int expResult = 0;
        int result = DateUtil.getDayDiff(d1, d2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDayDiff method, of class DateUtil.
     */
    @Test
    public void testGetDayDiff_String_String() {
        System.out.println("getDayDiff");
        String dateStart = "";
        String dateStop = "";
        int expResult = 0;
        int result = DateUtil.getDayDiff(dateStart, dateStop);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
