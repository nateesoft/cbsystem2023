/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.cbank.project.report.view;

import javax.swing.JDialog;
import javax.swing.JTable;
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
public class ReportPersonDetailTest {
    
    public ReportPersonDetailTest() {
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
     * Test of exportData method, of class ReportPersonDetail.
     */
    @Test
    public void testExportData() {
        System.out.println("exportData");
        JTable tableData = null;
        JDialog dialog = null;
        ReportPersonDetail.exportData(tableData, dialog);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTableColumns method, of class ReportPersonDetail.
     */
    @Test
    public void testGetTableColumns() {
        System.out.println("getTableColumns");
        JTable tb = null;
        String[] expResult = null;
        String[] result = ReportPersonDetail.getTableColumns(tb);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTableData method, of class ReportPersonDetail.
     */
    @Test
    public void testGetTableData() {
        System.out.println("getTableData");
        JTable tableData = null;
        Object[][] expResult = null;
        Object[][] result = ReportPersonDetail.getTableData(tableData);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
