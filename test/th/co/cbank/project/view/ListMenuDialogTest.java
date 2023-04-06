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
public class ListMenuDialogTest {
    
    public ListMenuDialogTest() {
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
     * Test of getSelectChoice method, of class ListMenuDialog.
     */
    @Test
    public void testGetSelectChoice() {
        System.out.println("getSelectChoice");
        ListMenuDialog instance = null;
        int expResult = 0;
        int result = instance.getSelectChoice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSelectChoice method, of class ListMenuDialog.
     */
    @Test
    public void testSetSelectChoice() {
        System.out.println("setSelectChoice");
        int selectChoice = 0;
        ListMenuDialog instance = null;
        instance.setSelectChoice(selectChoice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccountCode method, of class ListMenuDialog.
     */
    @Test
    public void testGetAccountCode() {
        System.out.println("getAccountCode");
        ListMenuDialog instance = null;
        String expResult = "";
        String result = instance.getAccountCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAccountCode method, of class ListMenuDialog.
     */
    @Test
    public void testSetAccountCode() {
        System.out.println("setAccountCode");
        String accountCode = "";
        ListMenuDialog instance = null;
        instance.setAccountCode(accountCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
