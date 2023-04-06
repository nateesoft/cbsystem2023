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
public class LoadExcelAccountLoanDialogTest {
    
    public LoadExcelAccountLoanDialogTest() {
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
     * Test of process method, of class LoadExcelAccountLoanDialog.
     */
    @Test
    public void testProcess() {
        System.out.println("process");
        LoadExcelAccountLoanDialog instance = null;
        instance.process();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class LoadExcelAccountLoanDialog.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        String custCode = "";
        LoadExcelAccountLoanDialog instance = null;
        int expResult = 0;
        int result = instance.update(custCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetLoanConfig method, of class LoadExcelAccountLoanDialog.
     */
    @Test
    public void testResetLoanConfig() {
        System.out.println("resetLoanConfig");
        LoadExcelAccountLoanDialog instance = null;
        instance.resetLoanConfig();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
