/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.cbank.util;

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
public class SendEmailTest {
    
    public SendEmailTest() {
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
     * Test of sendEmailBug method, of class SendEmail.
     */
    @Test
    public void testSendEmailBug() {
        System.out.println("sendEmailBug");
        String email = "";
        String pass = "";
        String subject = "";
        String msg = "";
        SendEmail instance = new SendEmail();
        boolean expResult = false;
        boolean result = instance.sendEmailBug(email, pass, subject, msg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendEmailSecret method, of class SendEmail.
     */
    @Test
    public void testSendEmailSecret() throws Exception {
        System.out.println("sendEmailSecret");
        SendEmail instance = new SendEmail();
        boolean expResult = false;
        boolean result = instance.sendEmailSecret();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
