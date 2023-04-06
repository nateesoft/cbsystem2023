/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.cbank.util;

import javax.swing.table.DefaultTableModel;
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
public class ExcelUtilTest {
    
    public ExcelUtilTest() {
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
     * Test of setOutputFile method, of class ExcelUtil.
     */
    @Test
    public void testSetOutputFile() {
        System.out.println("setOutputFile");
        String inputFile = "";
        ExcelUtil instance = new ExcelUtil();
        instance.setOutputFile(inputFile);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of write method, of class ExcelUtil.
     */
    @Test
    public void testWrite() throws Exception {
        System.out.println("write");
        DefaultTableModel model = null;
        String sheetName = "";
        int[] colsNumber = null;
        ExcelUtil instance = new ExcelUtil();
        instance.write(model, sheetName, colsNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
