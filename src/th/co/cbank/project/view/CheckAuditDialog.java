package th.co.cbank.project.view;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.apache.log4j.Logger;
import th.co.cbank.project.constants.AppConstants;
import th.co.cbank.project.control.CbProfileControl;
import th.co.cbank.project.control.CbSaveAccountControl;
import th.co.cbank.project.control.CbTransactionSaveControl;
import th.co.cbank.util.NumberFormat;
import th.co.cbank.util.TableUtil;

public class CheckAuditDialog extends BaseDialogSwing {
    private final Logger logger = Logger.getLogger(CheckAuditDialog.class);

    public CheckAuditDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        clearAllModel();

        tbProfile.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        tbSaveAccount.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        tbTransaction.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        tbTransactionLoan.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));

        tbProfile.setRowHeight(30);
        tbSaveAccount.setRowHeight(30);
        tbTransaction.setRowHeight(30);
        tbTransactionLoan.setRowHeight(30);

        JTableHeader h1 = tbProfile.getTableHeader();
        h1.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, 12));
        
        JTableHeader h2 = tbSaveAccount.getTableHeader();
        h2.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, 12));
        
        JTableHeader h3 = tbTransaction.getTableHeader();
        h3.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, 12));
        
        JTableHeader h4 = tbTransactionLoan.getTableHeader();
        h4.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, 12));
        
        // init table
        TableUtil.alignTable(tbProfile, 3, SwingConstants.RIGHT);
        TableUtil.alignTable(tbProfile, 4, SwingConstants.RIGHT);
        TableUtil.alignTable(tbProfile, 5, SwingConstants.RIGHT);
        
        TableUtil.alignTable(tbTransaction, 3, SwingConstants.RIGHT);
        TableUtil.alignTable(tbTransaction, 4, SwingConstants.RIGHT);
        TableUtil.alignTable(tbTransaction, 5, SwingConstants.RIGHT);
        TableUtil.alignTable(tbTransaction, 6, SwingConstants.RIGHT);
        TableUtil.alignTable(tbTransaction, 7, SwingConstants.RIGHT);
        
        TableUtil.alignTable(tbSaveAccount, 2, SwingConstants.RIGHT);
        TableUtil.alignTable(tbSaveAccount, 3, SwingConstants.RIGHT);
        
        TableUtil.alignTable(tbTransactionLoan, 3, SwingConstants.RIGHT);
        TableUtil.alignTable(tbTransactionLoan, 4, SwingConstants.RIGHT);
        TableUtil.alignTable(tbTransactionLoan, 5, SwingConstants.RIGHT);

        tbProfile.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtWithdraw = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDeposit = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtBalance = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbProfile = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbTransaction = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSaveAccount = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbTransactionLoan = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        btnReProcess = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("รายงานความเคลื่อนไหวรายบุคคล");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("ตารางสมุดบัญชีเงินฝาก");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("ยอดเงินนำฝาก");

        txtWithdraw.setEditable(false);
        txtWithdraw.setBackground(new java.awt.Color(255, 255, 204));
        txtWithdraw.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtWithdraw.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtWithdraw.setText("0.00");
        txtWithdraw.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("บาท");

        txtDeposit.setEditable(false);
        txtDeposit.setBackground(new java.awt.Color(255, 255, 204));
        txtDeposit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtDeposit.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDeposit.setText("0.00");
        txtDeposit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("บาท");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("ยอดเงินถอน");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("คงเหลือ");

        txtBalance.setEditable(false);
        txtBalance.setBackground(new java.awt.Color(255, 255, 204));
        txtBalance.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtBalance.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtBalance.setText("0.00");
        txtBalance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("บาท");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDeposit, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addComponent(txtWithdraw)
                    .addComponent(txtBalance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbProfile.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ลำดับ", "รหัสบัตร", "ชื่อ - สกุล", "เงินฝาก", "หุ้น", "หนี้"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbProfile.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProfileMouseClicked(evt);
            }
        });
        tbProfile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbProfileKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbProfileKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tbProfile);
        if (tbProfile.getColumnModel().getColumnCount() > 0) {
            tbProfile.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbProfile.getColumnModel().getColumn(2).setPreferredWidth(150);
        }

        tbTransaction.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "เลขที่บัญชี", "วันที่ เวลา", "รายการ", "จำนวนหุ้น", "ฝากเงิน", "ถอนเงิน", "ค่าธรรมเนียม", "ยอด balance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbTransaction);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("ตารางข้อมูลลูกค้า");

        tbSaveAccount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัสบัตร", "บัญชีเงินฝาก", "ยอดเงินฝาก", "ค่าธรรมเนียม"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbSaveAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSaveAccountMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbSaveAccount);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 102));
        jLabel3.setText("ตารางความเคลื่อนไหวเงินฝาก-ถอน พร้อมหุ้น");

        btnExit.setBackground(new java.awt.Color(204, 0, 0));
        btnExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExit.setText("ออก (Exit)");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        tbTransactionLoan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "เลขที่บัญชี", "วันที่ เวลา", "รายการ", "ยอดชำระหนี้", "ดอกเบี้ย", "ยอด balance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tbTransactionLoan);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 51, 0));
        jLabel10.setText("ตารางความเคลื่อนไหวเงินกู้");

        btnReProcess.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnReProcess.setText("ตรวจสอบรายการใหม่");
        btnReProcess.setEnabled(false);
        btnReProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReProcessActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnReProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnExit)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE))
                        .addGap(4, 4, 4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel10))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)))
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProfileMouseClicked
        if (tbProfile.getSelectedRow() != -1) {
            loadData();
        }
    }//GEN-LAST:event_tbProfileMouseClicked

    private void tbProfileKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbProfileKeyReleased
        if (tbProfile.getSelectedRow() != -1) {
            loadData();
        }
    }//GEN-LAST:event_tbProfileKeyReleased

    private void tbProfileKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbProfileKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
        }
    }//GEN-LAST:event_tbProfileKeyPressed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnReProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReProcessActionPerformed
        reProcess();
    }//GEN-LAST:event_btnReProcessActionPerformed

    private void tbSaveAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSaveAccountMouseClicked
        if(tbSaveAccount.getSelectedRow() != -1){
            btnReProcess.setEnabled(true);
        }
    }//GEN-LAST:event_tbSaveAccountMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReProcess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tbProfile;
    private javax.swing.JTable tbSaveAccount;
    private javax.swing.JTable tbTransaction;
    private javax.swing.JTable tbTransactionLoan;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtDeposit;
    private javax.swing.JTextField txtWithdraw;
    // End of variables declaration//GEN-END:variables

    private void clearAllModel() {
        DefaultTableModel model1 = (DefaultTableModel) tbProfile.getModel();
        DefaultTableModel model2 = (DefaultTableModel) tbSaveAccount.getModel();
        DefaultTableModel model3 = (DefaultTableModel) tbTransaction.getModel();
        DefaultTableModel model4 = (DefaultTableModel) tbTransactionLoan.getModel();

        TableUtil.clearModel(model1);
        TableUtil.clearModel(model2);
        TableUtil.clearModel(model3);
        TableUtil.clearModel(model4);
        CbProfileControl profileControl = new CbProfileControl();
        List<Object[]> listModel4 = profileControl.getProfileListOrderByCustCode();
        for(Object []data: listModel4){
            model1.addRow(data);
        }
    }

    private void loadData() {
        DefaultTableModel model2 = (DefaultTableModel) tbSaveAccount.getModel();
        DefaultTableModel model3 = (DefaultTableModel) tbTransaction.getModel();
        DefaultTableModel model4 = (DefaultTableModel) tbTransactionLoan.getModel();

        TableUtil.clearModel(model2);
        TableUtil.clearModel(model3);
        TableUtil.clearModel(model4);
        
        String custCode = "" + tbProfile.getValueAt(tbProfile.getSelectedRow(), 1);
        CbSaveAccountControl saveAccountControl = new CbSaveAccountControl();
        
        List<Object[]> listModel2 = saveAccountControl.getAccountWhereCustCode(custCode);
        for(Object[] data: listModel2){
            model2.addRow(data);
        }
        CbTransactionSaveControl transactionSaveControl = new CbTransactionSaveControl();
        List<Object[]> listModel3 = transactionSaveControl.getTransactionListWhereCustCode(custCode);
        double deposit = 0.00;
        double withdraw = 0.00;
        for(Object[] data: listModel3){
            model3.addRow(data);
            deposit += Double.parseDouble((""+data[4]).replace(",", ""));
            withdraw += Double.parseDouble((""+data[5]).replace(",", ""));
        }
        txtDeposit.setText(NumberFormat.showDouble2(deposit));
        txtWithdraw.setText(NumberFormat.showDouble2(withdraw));
        txtBalance.setText(NumberFormat.showDouble2(deposit-withdraw));

        // รายละเอียดเงินกู้
        List<Object[]> listModel4 = transactionSaveControl.getTransactionListWhereCustCode(custCode);
        for(Object []data: listModel4){
            model4.addRow(data);
        }
    }

    private void reProcess() {
        btnReProcess.setEnabled(false);
        
        int colProfile = tbProfile.getSelectedColumn();
        String profileCode = tbProfile.getValueAt(colProfile, 1).toString();
        
        int colAccount = tbSaveAccount.getSelectedColumn();
        String accCode = tbSaveAccount.getValueAt(colAccount, 1).toString();
        
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        TransactionAdvanceMethod.findData(profileCode, accCode, false);
        double all_balance = TransactionAdvanceMethod.balanceAmount;
        double all_interest = TransactionAdvanceMethod.interestAmount;
        TransactionAdvanceMethod.updateSaveAccountAndProfile(profileCode, accCode, all_balance, all_interest);
        TransactionAdvanceMethod.updateTransactionSaveRunning(profileCode,  accCode);
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        
        // reload data
        clearAllModel();
    }
}
