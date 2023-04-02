package th.co.cbank.project.view;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.apache.log4j.Logger;
import th.co.cbank.util.NumberFormat;
import th.co.cbank.project.constants.AppConstants;
import th.co.cbank.project.control.Value;
import th.co.cbank.project.control.ViewReport;
import th.co.cbank.project.report.model.ShowLoanAccountModel;
import th.co.cbank.project.report.model.ShowSaveAccountModel;
import th.co.cbank.util.TableUtil;

public class ShowAccountDialog extends BaseDialogSwing {

    private final Logger logger = Logger.getLogger(ShowAccountDialog.class);
    private String selectItem = null;

    public ShowAccountDialog(java.awt.Frame parent, boolean modal, String IDCard) {
        super(parent, modal);
        initComponents();

        Value.CUST_ACCOUNT_CODE = null;
        loadListAccount();
        loadLoanListAccount();
    }

    public String getSelectText() {
        return selectItem;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAccountList = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbAccountLoan = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("เลือกบัญชีเพื่อทำรายการ");

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        tbAccountList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ลำดับ", "เลขที่บัญชี", "ประเภทบัญชี", "จำนวนเงินคงเหลือ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbAccountList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAccountListMouseClicked(evt);
            }
        });
        tbAccountList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbAccountListKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbAccountList);
        if (tbAccountList.getColumnModel().getColumnCount() > 0) {
            tbAccountList.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbAccountList.getColumnModel().getColumn(1).setPreferredWidth(150);
            tbAccountList.getColumnModel().getColumn(2).setPreferredWidth(200);
            tbAccountList.getColumnModel().getColumn(3).setPreferredWidth(135);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("บัญชีเงินฝาก", jPanel2);

        tbAccountLoan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ลำดับ", "เลขที่บัญชี", "ประเภทบัญชี", "เงินกู้คงเหลือ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbAccountLoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAccountLoanMouseClicked(evt);
            }
        });
        tbAccountLoan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbAccountLoanKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tbAccountLoan);
        if (tbAccountLoan.getColumnModel().getColumnCount() > 0) {
            tbAccountLoan.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbAccountLoan.getColumnModel().getColumn(1).setPreferredWidth(150);
            tbAccountLoan.getColumnModel().getColumn(2).setPreferredWidth(200);
            tbAccountLoan.getColumnModel().getColumn(3).setPreferredWidth(135);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("บัญชีเงินกู้", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbAccountListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAccountListMouseClicked
        if (evt.getClickCount() == 2) {
            int rows = tbAccountList.getSelectedRow();
            if (rows != -1) {
                Value.CUST_ACCOUNT_CODE = "" + tbAccountList.getValueAt(rows, 1);
                selectItem = "" + tbAccountList.getValueAt(rows, 1);
                dispose();
            } else {
                selectItem = null;
            }
        }
    }//GEN-LAST:event_tbAccountListMouseClicked

    private void tbAccountListKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbAccountListKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
        } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            int rows = tbAccountList.getSelectedRow();
            if (rows != -1) {
                Value.CUST_ACCOUNT_CODE = "" + tbAccountList.getValueAt(rows, 1);
                selectItem = "" + tbAccountList.getValueAt(rows, 1);
                dispose();
            } else {
                selectItem = null;
            }
        }
    }//GEN-LAST:event_tbAccountListKeyPressed

    private void tbAccountLoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAccountLoanMouseClicked
        if (evt.getClickCount() == 2) {
            int rows = tbAccountLoan.getSelectedRow();
            if (rows != -1) {
                Value.CUST_LOAN_CODE = "" + tbAccountLoan.getValueAt(rows, 1);
                selectItem = "" + tbAccountLoan.getValueAt(rows, 1);
                dispose();
            } else {
                selectItem = null;
            }
        }
    }//GEN-LAST:event_tbAccountLoanMouseClicked

    private void tbAccountLoanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbAccountLoanKeyPressed

    }//GEN-LAST:event_tbAccountLoanKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbAccountList;
    private javax.swing.JTable tbAccountLoan;
    // End of variables declaration//GEN-END:variables

    private void loadListAccount() {
        DefaultTableModel model = (DefaultTableModel) tbAccountList.getModel();
        TableUtil.clearModel(model);
        tbAccountList.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        tbAccountList.setRowHeight(30);
        JTableHeader tHeader = tbAccountList.getTableHeader();
        tHeader.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, AppConstants.DEFAULT_FONT_SIZE));

        ViewReport viewReport = new ViewReport();
        List<ShowSaveAccountModel> listReport = viewReport.showSaveAccount(Value.CUST_CODE);
        int count = 0;
        for (ShowSaveAccountModel bean : listReport) {
            count++;
            model.addRow(new Object[]{
                count,
                bean.getAccount_code(),
                bean.getTypeName(),
                NumberFormat.showDouble2(bean.getB_balance())
            });
        }
    }

    private void loadLoanListAccount() {
        DefaultTableModel model = (DefaultTableModel) tbAccountLoan.getModel();
        TableUtil.clearModel(model);
        tbAccountLoan.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        tbAccountLoan.setRowHeight(30);
        JTableHeader tHeader = tbAccountLoan.getTableHeader();
        tHeader.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, AppConstants.DEFAULT_FONT_SIZE));

        ViewReport viewReport = new ViewReport();
        List<ShowLoanAccountModel> listReport = viewReport.showLoanAccount(Value.CUST_CODE);
        int count = 0;
        for (ShowLoanAccountModel bean : listReport) {
            count++;
            model.addRow(new Object[]{
                count,
                bean.getLoan_docno(),
                bean.getLoanName(),
                NumberFormat.showDouble2(bean.getLoan_amount())
            });
        }
    }
}
