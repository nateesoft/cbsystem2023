/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.cbank.project.control;

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
public class InterestControlTest {
    
    public InterestControlTest() {
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
     * Test of defaultINT method, of class InterestControl.
     */
    @Test
    public void testDefaultINT() {
        System.out.println("defaultINT");
        double money1 = 0.0;
        double intPerYear = 0.0;
        int dayAll = 0;
        double expResult = 0.0;
        double result = InterestControl.defaultINT(money1, intPerYear, dayAll);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLengthToCurrent method, of class InterestControl.
     */
    @Test
    public void testGetLengthToCurrent_3args() {
        System.out.println("getLengthToCurrent");
        int year = 0;
        int month = 0;
        int day = 0;
        long expResult = 0L;
        long result = InterestControl.getLengthToCurrent(year, month, day);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLengthToCurrent method, of class InterestControl.
     */
    @Test
    public void testGetLengthToCurrent_Date() {
        System.out.println("getLengthToCurrent");
        Date d = null;
        long expResult = 0L;
        long result = InterestControl.getLengthToCurrent(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaxDayPerThisYear method, of class InterestControl.
     */
    @Test
    public void testGetMaxDayPerThisYear() {
        System.out.println("getMaxDayPerThisYear");
        int expResult = 0;
        int result = InterestControl.getMaxDayPerThisYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaxDayPerThisMonth method, of class InterestControl.
     */
    @Test
    public void testGetMaxDayPerThisMonth() {
        System.out.println("getMaxDayPerThisMonth");
        int year = 0;
        int month = 0;
        int day = 0;
        int expResult = 0;
        int result = InterestControl.getMaxDayPerThisMonth(year, month, day);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEndOfMonth method, of class InterestControl.
     */
    @Test
    public void testIsEndOfMonth() {
        System.out.println("isEndOfMonth");
        int day = 0;
        boolean expResult = false;
        boolean result = InterestControl.isEndOfMonth(day);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of totalBalanceIntRate method, of class InterestControl.
     */
    @Test
    public void testTotalBalanceIntRate() {
        System.out.println("totalBalanceIntRate");
        String AccCode = "";
        InterestControl instance = new InterestControl();
        double expResult = 0.0;
        double result = instance.totalBalanceIntRate(AccCode);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
