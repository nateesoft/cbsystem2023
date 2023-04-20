/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.cbank.project.control;

import java.util.List;
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
public class CbProfileControlTest {
    
    public CbProfileControlTest() {
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
     * Test of saveLoanAllow method, of class CbProfileControl.
     */
    @Test
    public void testSaveLoanAllow() {
        System.out.println("saveLoanAllow");
        String custCode = "";
        double tCreditAmt = 0.0;
        String empCode = "";
        CbProfileControl instance = new CbProfileControl();
        boolean expResult = false;
        boolean result = instance.saveLoanAllow(custCode, tCreditAmt, empCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApproveLimitMoreZero method, of class CbProfileControl.
     */
    @Test
    public void testGetApproveLimitMoreZero() {
        System.out.println("getApproveLimitMoreZero");
        String custCode = "";
        CbProfileControl instance = new CbProfileControl();
        List expResult = null;
        List result = instance.getApproveLimitMoreZero(custCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchCustomerApproveLimitMoreZero method, of class CbProfileControl.
     */
    @Test
    public void testSearchCustomerApproveLimitMoreZero() {
        System.out.println("searchCustomerApproveLimitMoreZero");
        String custCode = "";
        String searchText = "";
        CbProfileControl instance = new CbProfileControl();
        List expResult = null;
        List result = instance.searchCustomerApproveLimitMoreZero(custCode, searchText);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProfileListOrderByCustCode method, of class CbProfileControl.
     */
    @Test
    public void testGetProfileListOrderByCustCode() {
        System.out.println("getProfileListOrderByCustCode");
        CbProfileControl instance = new CbProfileControl();
        List expResult = null;
        List result = instance.getProfileListOrderByCustCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCancelStatus method, of class CbProfileControl.
     */
    @Test
    public void testUpdateCancelStatus() {
        System.out.println("updateCancelStatus");
        String custCode = "";
        CbProfileControl instance = new CbProfileControl();
        boolean expResult = false;
        boolean result = instance.updateCancelStatus(custCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
