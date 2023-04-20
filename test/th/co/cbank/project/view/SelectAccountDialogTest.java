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
public class SelectAccountDialogTest {
    
    public SelectAccountDialogTest() {
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
     * Test of setAccountCode method, of class SelectAccountDialog.
     */
    @Test
    public void testSetAccountCode() {
        System.out.println("setAccountCode");
        String accCode = "";
        SelectAccountDialog instance = null;
        instance.setAccountCode(accCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccontCode method, of class SelectAccountDialog.
     */
    @Test
    public void testGetAccontCode() {
        System.out.println("getAccontCode");
        SelectAccountDialog instance = null;
        String expResult = "";
        String result = instance.getAccontCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
