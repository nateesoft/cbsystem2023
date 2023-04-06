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
public class ApproveDialogTest {
    
    public ApproveDialogTest() {
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
     * Test of getCUST_CODE method, of class ApproveDialog.
     */
    @Test
    public void testGetCUST_CODE() {
        System.out.println("getCUST_CODE");
        ApproveDialog instance = null;
        String expResult = "";
        String result = instance.getCUST_CODE();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCUST_CODE method, of class ApproveDialog.
     */
    @Test
    public void testSetCUST_CODE() {
        System.out.println("setCUST_CODE");
        String CUST_CODE = "";
        ApproveDialog instance = null;
        instance.setCUST_CODE(CUST_CODE);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
