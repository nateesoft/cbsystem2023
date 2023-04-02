package th.co.cbank.util;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import th.co.cbank.project.constants.AppConstants;

public class JTableUtil {

    public static void defaultTemplate(JTable table) {
        table.setFont(new Font("Tahoma", Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        JTableHeader tHeader = table.getTableHeader();
        tHeader.setFont(new Font("Tahoma", Font.BOLD, AppConstants.DEFAULT_FONT_SIZE));
    }

    public static void alignRight(JTable table, int column) {
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        table.getColumnModel().getColumn(column).setCellRenderer(rightRenderer);
    }

    public static void alignLeft(JTable table, int column) {
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.LEFT);
        table.getColumnModel().getColumn(column).setCellRenderer(rightRenderer);
    }

    public static void alignCenter(JTable table, int column) {
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.getColumnModel().getColumn(column).setCellRenderer(rightRenderer);
    }

    public static void sortDouble(JTable table, int column) {
        table.getColumnModel().getColumn(column).setCellRenderer(new DoubleFormatSort());
    }

    static Object[][] getTableData(JTable tableData) {
        DefaultTableModel dtm = (DefaultTableModel) tableData.getModel();
        int nRow = dtm.getRowCount(), nCol = dtm.getColumnCount();
        Object[][] tDataObj = new Object[nRow][nCol];
        for (int i = 0; i < nRow; i++) {
            for (int j = 0; j < nCol; j++) {
                String ddd = formatTextHtml(dtm.getValueAt(i, j).toString());
                tDataObj[i][j] = ddd;
            }
        }
        return tDataObj;
    }

    static String[] getTableColumns(JTable tb) {
        String colName = "";
        for (int i = 0; i < tb.getColumnCount(); i++) {
            colName += tb.getColumnName(i) + ",";
        }
        return colName.split(",");
    }

    public static void exportData(String fileName, JTable tableData, JDialog dialog) {
        dialog.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        String FILE_NAME = fileName + ".xlsx";

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Data");
        int rowNum = 0;

        for (int i = 0; i < tableData.getColumnCount(); i++) {
            int colWidth = tableData.getColumnModel().getColumn(i).getPreferredWidth();
            int columnWidth = 0;
            if (colWidth <= 200) {
                columnWidth = 10000;
            }
            if (colWidth <= 180) {
                columnWidth = 5500;
            }
            if (colWidth <= 150) {
                columnWidth = 4000;
            }
            if (colWidth <= 100) {
                columnWidth = 3500;
            }
            if (colWidth <= 80) {
                columnWidth = 2000;
            }
            sheet.setColumnWidth((short) i, (short) columnWidth);
        }

        //font style
        XSSFCellStyle myStyle = workbook.createCellStyle();
        XSSFFont myFont = workbook.createFont();
        myFont.setFontName("Tahoma");
        myFont.setColor(HSSFFont.COLOR_NORMAL);
        myFont.setBold(true);
        myStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        myStyle.setFont(myFont);

        XSSFCellStyle centerStyle = workbook.createCellStyle();
        centerStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);

        XSSFCellStyle rightStyle = workbook.createCellStyle();
        rightStyle.setAlignment(HSSFCellStyle.ALIGN_RIGHT);

        String[] dataColumns = getTableColumns(tableData);
        int colNum1 = 0;
        Row row = sheet.createRow(rowNum);
        for (String col : dataColumns) {
            Cell cell = row.createCell(colNum1++);
            cell.setCellValue((String) col);
            cell.setCellStyle(myStyle);
        }

        rowNum++;

        Object[][] datatypes = getTableData(tableData);
        for (Object[] datatype : datatypes) {
            row = sheet.createRow(rowNum++);
            int colNum = 0;
            for (Object field : datatype) {
                if (field == null) {
                    field = "";
                }
                Cell cell = row.createCell(colNum);
                if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                } else if (field instanceof String) {
                    cell.setCellValue((String) "" + field);
                } else if (field instanceof Double) {
                    cell.setCellValue((Double) field);
                } else if (field instanceof Float) {
                    cell.setCellValue((Float) field);
                }

                colNum++;
            }
        }

        //freeze pane
        sheet.createFreezePane(0, 1);

        try {
            try (FileOutputStream outputStream = new FileOutputStream(FILE_NAME)) {
                workbook.write(outputStream);
            }
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }

        dialog.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

        try {
            Desktop.getDesktop().open(new File(FILE_NAME));
        } catch (IOException e) {
        }
    }

    private static String formatTextHtml(String text) {
        text = text.replace("<html>", "").replace("</html>", "");
        text = text.replace("<b>", "").replace("</b>", "");
        text = text.replace("<font color=green>", "").replace("</font>", "");
        text = text.replace("<font color=red>", "").replace("</font>", "");
        text = text.replace("<font color=blue>", "").replace("</font>", "");

        return text;
    }
}
