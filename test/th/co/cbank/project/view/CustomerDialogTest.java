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
import th.co.cbank.project.model.ProfileBean;

/**
 *
 * @author Acer
 */
public class CustomerDialogTest {
    
    public CustomerDialogTest() {
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
     * Test of getProfileBean method, of class CustomerDialog.
     */
    @Test
    public void testGetProfileBean() {
        System.out.println("getProfileBean");
        CustomerDialog instance = null;
        ProfileBean expResult = null;
        ProfileBean result = instance.getProfileBean();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProfileBean method, of class CustomerDialog.
     */
    @Test
    public void testSetProfileBean() {
        System.out.println("setProfileBean");
        ProfileBean profileBean = null;
        CustomerDialog instance = null;
        instance.setProfileBean(profileBean);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccountCode method, of class CustomerDialog.
     */
    @Test
    public void testGetAccountCode() {
        System.out.println("getAccountCode");
        CustomerDialog instance = null;
        String expResult = "";
        String result = instance.getAccountCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAccountCode method, of class CustomerDialog.
     */
    @Test
    public void testSetAccountCode() {
        System.out.println("setAccountCode");
        String accountCode = "";
        CustomerDialog instance = null;
        instance.setAccountCode(accountCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccountType method, of class CustomerDialog.
     */
    @Test
    public void testGetAccountType() {
        System.out.println("getAccountType");
        CustomerDialog instance = null;
        String expResult = "";
        String result = instance.getAccountType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAccountType method, of class CustomerDialog.
     */
    @Test
    public void testSetAccountType() {
        System.out.println("setAccountType");
        String accountType = "";
        CustomerDialog instance = null;
        instance.setAccountType(accountType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
