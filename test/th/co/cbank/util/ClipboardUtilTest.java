package th.co.cbank.util;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ClipboardUtilTest {

    public ClipboardUtilTest() {
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
     * Test of copyTableContent method, of class ClipboardUtil.
     */
    @Test
    public void testCopyTableContent() {
        System.out.println("copyTableContent");
        DefaultTableModel tableModel = new DefaultTableModel();
        JTable table = new JTable(tableModel);
        tableModel.addColumn("Topic");
        tableModel.insertRow(0, new Object[]{"test"});
        table.setRowSelectionInterval(0, 0);
        table.setColumnSelectionInterval(0, 0);
        String result = ClipboardUtil.copyTableContent(table);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals("test", result);
    }

}
