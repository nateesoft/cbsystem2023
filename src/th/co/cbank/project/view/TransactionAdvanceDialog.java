package th.co.cbank.project.view;

import java.awt.GraphicsEnvironment;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
import th.co.cbank.project.control.CbSaveAccountControl;
import th.co.cbank.project.model.CbSaveAccountBean;
import th.co.cbank.util.MessageAlert;
import th.co.cbank.util.NumberFormat;
import th.co.cbank.util.TableUtil;

public class TransactionAdvanceDialog extends BaseDialogSwing {

    private final Logger logger = Logger.getLogger(TransactionAdvanceDialog.class);

    public TransactionAdvanceDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        logger.debug("TransactionAdvanceDialog init");

        setBounds(GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds());

        initTable();
    }

    public void initFormValues(String custCode, String accCode, double netBalance, double intAmt) {
        txtCustCode.setText(custCode);
        txtAccCode.setText(accCode);
        txtNetBalance.setText("" + netBalance);
        txtInt.setText("" + intAmt);

        searchData();
    }

    private void searchData() {
        if (txtCustCode.getText().trim().equals("")) {
            txtCustCode.requestFocus();
        } else if (txtAccCode.getText().trim().equals("")) {
            txtAccCode.requestFocus();
        } else {
            clearModel();
            String custCode = txtCustCode.getText();
            String accCode = txtAccCode.getText();
            CbSaveAccountControl saveAccountControl = new CbSaveAccountControl();
            CbSaveAccountBean saveAccountBean = saveAccountControl.findOneByAccountCode(accCode);
            List<String[]> modelList = TransactionAdvanceMethod.findData(custCode, accCode, true, saveAccountBean.getAccount_type());
            if (modelList.isEmpty()) {
                btnSave.setEnabled(false);
            }
            DefaultTableModel model = (DefaultTableModel) tbItems.getModel();
            for (String[] obj : modelList) {
                if (checkOnlyDesc.isSelected()) {
                    if (!obj[0].equals("")) {
                        model.addRow(obj);
                    }
                } else {
                    model.addRow(obj);
                }
            }

            txtDeposit.setText(NumberFormat.showDouble2(TransactionAdvanceMethod.depositSummary));
            txtWithdraw.setText(NumberFormat.showDouble2(TransactionAdvanceMethod.withdrawSummary));
            txtInterest.setText(NumberFormat.showDouble2(TransactionAdvanceMethod.profitSummary));
            txtBalanceAmt.setText(NumberFormat.showDouble2(TransactionAdvanceMethod.balanceSummary));
            txtNetBalance.setText(NumberFormat.showDouble2(TransactionAdvanceMethod.netBalanceSummary));
            txtInt.setText(NumberFormat.showDouble2(0));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCustCode = new javax.swing.JTextField();
        txtAccCode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbItems = new javax.swing.JTable();
        btnClose = new javax.swing.JButton();
        btnClearSearch = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtDeposit = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtWithdraw = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtBalanceAmt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtInterest = new javax.swing.JTextField();
        txtNetBalance = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtInt = new javax.swing.JTextField();
        checkOnlyDesc = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("แสดงรายละเอียดความเคลื่อนไหว");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("รหัสสมาชิก");

        txtCustCode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCustCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtCustCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCustCodeKeyPressed(evt);
            }
        });

        txtAccCode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAccCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAccCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAccCodeKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("เลขที่บัญชี");

        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSearch.setText("ค้นหา");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tbItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รายการ", "วันที่", "เวลา", "เลขที่เอกสาร", "จำนวนวัน", "ดอกเบี้ยสะสม", "ดอกเบี้ยยกมา", "ฝาก", "ฝาก(ดอกเบี้ย)", "ถอน", "คงเหลือ(รวมดอก)", "เงินต้น", "กำไร", "ดอกเบี้ยต่อปี", "print", "LineNo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbItems.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(tbItems);
        if (tbItems.getColumnModel().getColumnCount() > 0) {
            tbItems.getColumnModel().getColumn(0).setPreferredWidth(120);
            tbItems.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbItems.getColumnModel().getColumn(2).setPreferredWidth(80);
            tbItems.getColumnModel().getColumn(3).setPreferredWidth(120);
            tbItems.getColumnModel().getColumn(4).setPreferredWidth(80);
            tbItems.getColumnModel().getColumn(5).setPreferredWidth(120);
            tbItems.getColumnModel().getColumn(6).setPreferredWidth(120);
            tbItems.getColumnModel().getColumn(7).setPreferredWidth(100);
            tbItems.getColumnModel().getColumn(8).setPreferredWidth(120);
            tbItems.getColumnModel().getColumn(9).setPreferredWidth(100);
            tbItems.getColumnModel().getColumn(10).setPreferredWidth(120);
            tbItems.getColumnModel().getColumn(11).setPreferredWidth(100);
            tbItems.getColumnModel().getColumn(12).setPreferredWidth(100);
            tbItems.getColumnModel().getColumn(13).setPreferredWidth(120);
        }

        btnClose.setBackground(new java.awt.Color(255, 0, 0));
        btnClose.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnClose.setText("ออก (Close)");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnClearSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnClearSearch.setText("ล้างการค้นหา");
        btnClearSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearSearchActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSave.setText("บันทึกข้อมูล");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("ฝาก");

        txtDeposit.setEditable(false);
        txtDeposit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDeposit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDeposit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("ถอน");

        txtWithdraw.setEditable(false);
        txtWithdraw.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtWithdraw.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtWithdraw.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("เงินต้นคงเหลือ");

        txtBalanceAmt.setEditable(false);
        txtBalanceAmt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtBalanceAmt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBalanceAmt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("กำไร");

        txtInterest.setEditable(false);
        txtInterest.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtInterest.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtInterest.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtNetBalance.setEditable(false);
        txtNetBalance.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNetBalance.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNetBalance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("รวมยอดสูทธิ");

        txtInt.setEditable(false);
        txtInt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtInt.setForeground(new java.awt.Color(153, 153, 153));
        txtInt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtInt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtInt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInterest, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNetBalance, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(txtBalanceAmt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(txtWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBalanceAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtInterest, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNetBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(txtInt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        checkOnlyDesc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkOnlyDesc.setText("แสดงเฉพาะที่มีรายการ");
        checkOnlyDesc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkOnlyDescItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCustCode, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(txtAccCode))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClearSearch))
                    .addComponent(checkOnlyDesc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClose))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCustCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtAccCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClearSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkOnlyDesc))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        searchData();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtCustCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustCodeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAccCode.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
        }
    }//GEN-LAST:event_txtCustCodeKeyPressed

    private void txtAccCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAccCodeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            searchData();
            btnSearch.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            txtCustCode.requestFocus();
        }
    }//GEN-LAST:event_txtAccCodeKeyPressed

    private void btnClearSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearSearchActionPerformed
        clearForm();
    }//GEN-LAST:event_btnClearSearchActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        saveUpdateProfile();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void checkOnlyDescItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkOnlyDescItemStateChanged
        if (checkOnlyDesc.isSelected()) {
            btnSave.setEnabled(false);
        } else {
            btnSave.setEnabled(true);
        }
    }//GEN-LAST:event_checkOnlyDescItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClearSearch;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JCheckBox checkOnlyDesc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbItems;
    private javax.swing.JTextField txtAccCode;
    private javax.swing.JTextField txtBalanceAmt;
    private javax.swing.JTextField txtCustCode;
    private javax.swing.JTextField txtDeposit;
    private javax.swing.JTextField txtInt;
    private javax.swing.JTextField txtInterest;
    private javax.swing.JTextField txtNetBalance;
    private javax.swing.JTextField txtWithdraw;
    // End of variables declaration//GEN-END:variables

    private void initTable() {
        th.co.cbank.util.TableUtil.defaultTemplate(tbItems);
        tbItems.setRowHeight(30);
        TableUtil.alignRight(tbItems, 3);
        TableUtil.alignRight(tbItems, 4);
        TableUtil.alignRight(tbItems, 5);
        TableUtil.alignRight(tbItems, 6);
        TableUtil.alignRight(tbItems, 7);
        TableUtil.alignRight(tbItems, 8);
        TableUtil.alignRight(tbItems, 9);
        TableUtil.alignRight(tbItems, 10);
        TableUtil.alignRight(tbItems, 11);
        TableUtil.alignRight(tbItems, 12);
        TableUtil.alignRight(tbItems, 13);

        clearModel();
    }

    private void clearForm() {
        txtCustCode.setText("");
        txtAccCode.setText("");
        clearModel();
        txtDeposit.setText("0.00");
        txtWithdraw.setText("0.00");
        txtBalanceAmt.setText("0.00");
        txtInterest.setText("0.00");
        txtNetBalance.setText("0.00");
        txtInt.setText("0.00");

        txtCustCode.requestFocus();
    }

    private void clearModel() {
        DefaultTableModel model = (DefaultTableModel) tbItems.getModel();
        TableUtil.clearModel(model);
    }

    private void saveUpdateProfile() {
        double balanceAmt = NumberFormat.toDouble(txtBalanceAmt.getText());
        double intAmt = NumberFormat.toDouble(txtInt.getText());
        TransactionAdvanceMethod.updateSaveAccountAndProfile(txtCustCode.getText(), txtAccCode.getText(), balanceAmt, intAmt);
        MessageAlert.infoPopup(this, "บันทึกข้อมูลเรียบร้อย");
    }

}
