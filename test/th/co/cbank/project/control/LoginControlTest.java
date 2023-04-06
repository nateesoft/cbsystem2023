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
public class LoginControlTest {
    
    public LoginControlTest() {
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
     * Test of updateLogin method, of class LoginControl.
     */
    @Test
    public void testUpdateLogin() {
        System.out.println("updateLogin");
        String code = "";
        String name = "";
        String remark = "";
        String program = "";
        LoginControl instance = new LoginControl();
        instance.updateLogin(code, name, remark, program);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateLogout method, of class LoginControl.
     */
    @Test
    public void testUpdateLogout() {
        System.out.println("updateLogout");
        LoginControl instance = new LoginControl();
        instance.updateLogout();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
