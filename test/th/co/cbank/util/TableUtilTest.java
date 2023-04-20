/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.cbank.util;

import javax.swing.JDialog;
import javax.swing.JTable;
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
public class TableUtilTest {
    
    public TableUtilTest() {
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
     * Test of initTable method, of class TableUtil.
     */
    @Test
    public void testInitTable() {
        System.out.println("initTable");
        JTable table = null;
        TableUtil.initTable(table);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alignTable method, of class TableUtil.
     */
    @Test
    public void testAlignTable() {
        System.out.println("alignTable");
        JTable table = null;
        int colsAt = 0;
        int swingConstants = 0;
        TableUtil.alignTable(table, colsAt, swingConstants);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clearModel method, of class TableUtil.
     */
    @Test
    public void testClearModel() {
        System.out.println("clearModel");
        DefaultTableModel model = null;
        TableUtil.clearModel(model);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of defaultTemplate method, of class TableUtil.
     */
    @Test
    public void testDefaultTemplate() {
        System.out.println("defaultTemplate");
        JTable table = null;
        TableUtil.defaultTemplate(table);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alignRight method, of class TableUtil.
     */
    @Test
    public void testAlignRight() {
        System.out.println("alignRight");
        JTable table = null;
        int column = 0;
        TableUtil.alignRight(table, column);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alignLeft method, of class TableUtil.
     */
    @Test
    public void testAlignLeft() {
        System.out.println("alignLeft");
        JTable table = null;
        int column = 0;
        TableUtil.alignLeft(table, column);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alignCenter method, of class TableUtil.
     */
    @Test
    public void testAlignCenter() {
        System.out.println("alignCenter");
        JTable table = null;
        int column = 0;
        TableUtil.alignCenter(table, column);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sortDouble method, of class TableUtil.
     */
    @Test
    public void testSortDouble() {
        System.out.println("sortDouble");
        JTable table = null;
        int column = 0;
        TableUtil.sortDouble(table, column);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTableData method, of class TableUtil.
     */
    @Test
    public void testGetTableData() {
        System.out.println("getTableData");
        JTable tableData = null;
        Object[][] expResult = null;
        Object[][] result = TableUtil.getTableData(tableData);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTableColumns method, of class TableUtil.
     */
    @Test
    public void testGetTableColumns() {
        System.out.println("getTableColumns");
        JTable tb = null;
        String[] expResult = null;
        String[] result = TableUtil.getTableColumns(tb);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of exportData method, of class TableUtil.
     */
    @Test
    public void testExportData() {
        System.out.println("exportData");
        String fileName = "";
        JTable tableData = null;
        JDialog dialog = null;
        TableUtil.exportData(fileName, tableData, dialog);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
