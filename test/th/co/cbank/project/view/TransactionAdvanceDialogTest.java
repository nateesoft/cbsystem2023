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
public class TransactionAdvanceDialogTest {
    
    public TransactionAdvanceDialogTest() {
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
     * Test of initFormValues method, of class TransactionAdvanceDialog.
     */
    @Test
    public void testInitFormValues() {
        System.out.println("initFormValues");
        String custCode = "";
        String accCode = "";
        double netBalance = 0.0;
        double intAmt = 0.0;
        TransactionAdvanceDialog instance = null;
        instance.initFormValues(custCode, accCode, netBalance, intAmt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
