/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.cbank.project.control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
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
public class MySQLConnectTest {
    
    public MySQLConnectTest() {
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
     * Test of connect method, of class MySQLConnect.
     */
    @Test
    public void testConnect() {
        System.out.println("connect");
        Connection expResult = null;
        Connection result = MySQLConnect.connect();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatement method, of class MySQLConnect.
     */
    @Test
    public void testGetStatement() throws Exception {
        System.out.println("getStatement");
        Statement expResult = null;
        Statement result = MySQLConnect.getStatement();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResultSet method, of class MySQLConnect.
     */
    @Test
    public void testGetResultSet() throws Exception {
        System.out.println("getResultSet");
        String sql = "";
        ResultSet expResult = null;
        ResultSet result = MySQLConnect.getResultSet(sql);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of exeUpdate method, of class MySQLConnect.
     */
    @Test
    public void testExeUpdate() throws Exception {
        System.out.println("exeUpdate");
        String sql = "";
        int expResult = 0;
        int result = MySQLConnect.exeUpdate(sql);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class MySQLConnect.
     */
    @Test
    public void testClose() {
        System.out.println("close");
        MySQLConnect.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
