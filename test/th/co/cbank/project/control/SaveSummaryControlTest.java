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
import th.co.cbank.project.model.SaveSummaryBean;

/**
 *
 * @author Acer
 */
public class SaveSummaryControlTest {
    
    public SaveSummaryControlTest() {
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
     * Test of findOneSummary method, of class SaveSummaryControl.
     */
    @Test
    public void testFindOneSummary() {
        System.out.println("findOneSummary");
        SaveSummaryControl instance = new SaveSummaryControl();
        SaveSummaryBean expResult = null;
        SaveSummaryBean result = instance.findOneSummary();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
