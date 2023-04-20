/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.cbank.project.view;

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
public class TransactionAdvanceMethodTest {
    
    public TransactionAdvanceMethodTest() {
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
     * Test of updateSaveAccountAndProfile method, of class TransactionAdvanceMethod.
     */
    @Test
    public void testUpdateSaveAccountAndProfile() {
        System.out.println("updateSaveAccountAndProfile");
        String custCode = "";
        String accCode = "";
        double netBalance = 0.0;
        double textInt = 0.0;
        TransactionAdvanceMethod.updateSaveAccountAndProfile(custCode, accCode, netBalance, textInt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findData method, of class TransactionAdvanceMethod.
     */
    @Test
    public void testFindData() {
        System.out.println("findData");
        String custCode = "";
        String accCode = "";
        boolean addModel = false;
        String accountType = "";
        List expResult = null;
        List result = TransactionAdvanceMethod.findData(custCode, accCode, addModel, accountType, false);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateTransactionSaveRunning method, of class TransactionAdvanceMethod.
     */
    @Test
    public void testUpdateTransactionSaveRunning() {
        System.out.println("updateTransactionSaveRunning");
        String custCode = "";
        String accCode = "";
        TransactionAdvanceMethod.updateTransactionSaveRunning(custCode, accCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
