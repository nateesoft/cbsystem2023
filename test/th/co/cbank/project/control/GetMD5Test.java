/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.cbank.project.control;

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
public class GetMD5Test {
    
    public GetMD5Test() {
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
     * Test of getMD5 method, of class GetMD5.
     */
    @Test
    public void testGetMD5() {
        System.out.println("getMD5");
        String serialNo = "";
        GetMD5 instance = new GetMD5();
        boolean expResult = false;
        boolean result = instance.getMD5(serialNo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMacAddress method, of class GetMD5.
     */
    @Test
    public void testGetMacAddress() {
        System.out.println("getMacAddress");
        GetMD5 instance = new GetMD5();
        String expResult = "";
        String result = instance.getMacAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSOC method, of class GetMD5.
     */
    @Test
    public void testGetSOC() {
        System.out.println("getSOC");
        GetMD5 instance = new GetMD5();
        String expResult = "";
        String result = instance.getSOC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
