/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.cbank.project.control;

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
public class DatabaseUtilControllerTest {
    
    public DatabaseUtilControllerTest() {
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
     * Test of showTables method, of class DatabaseUtilController.
     */
    @Test
    public void testShowTables() {
        System.out.println("showTables");
        DatabaseUtilController instance = new DatabaseUtilController();
        List<String> expResult = null;
        List<String> result = instance.showTables();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of emptyTable method, of class DatabaseUtilController.
     */
    @Test
    public void testEmptyTable() {
        System.out.println("emptyTable");
        String tableName = "";
        DatabaseUtilController instance = new DatabaseUtilController();
        instance.emptyTable(tableName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
