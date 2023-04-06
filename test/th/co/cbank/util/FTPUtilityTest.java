/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.cbank.util;

import java.io.File;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
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
public class FTPUtilityTest {
    
    public FTPUtilityTest() {
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
     * Test of setPb method, of class FTPUtility.
     */
    @Test
    public void testSetPb() {
        System.out.println("setPb");
        JProgressBar pb = null;
        FTPUtility instance = null;
        instance.setPb(pb);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setApplication method, of class FTPUtility.
     */
    @Test
    public void testSetApplication() {
        System.out.println("setApplication");
        JLabel lb = null;
        JProgressBar pb = null;
        FTPUtility instance = null;
        instance.setApplication(lb, pb);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of upload method, of class FTPUtility.
     */
    @Test
    public void testUpload() {
        System.out.println("upload");
        String localFile = "";
        String remoteFile = "";
        FTPUtility instance = null;
        boolean expResult = false;
        boolean result = instance.upload(localFile, remoteFile);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of download method, of class FTPUtility.
     */
    @Test
    public void testDownload() throws Exception {
        System.out.println("download");
        String fileName = "";
        File destination = null;
        FTPUtility instance = null;
        boolean expResult = false;
        boolean result = instance.download(fileName, destination);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProgress method, of class FTPUtility.
     */
    @Test
    public void testSetProgress() {
        System.out.println("setProgress");
        JLabel lb = null;
        JProgressBar pb = null;
        FTPUtility instance = null;
        instance.setProgress(lb, pb);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of connect method, of class FTPUtility.
     */
    @Test
    public void testConnect() {
        System.out.println("connect");
        FTPUtility instance = null;
        boolean expResult = false;
        boolean result = instance.connect();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of disconnect method, of class FTPUtility.
     */
    @Test
    public void testDisconnect() {
        System.out.println("disconnect");
        FTPUtility instance = null;
        boolean expResult = false;
        boolean result = instance.disconnect();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
