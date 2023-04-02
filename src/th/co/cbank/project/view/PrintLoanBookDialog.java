package th.co.cbank.project.view;

import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
import th.co.cbank.util.NumberFormat;
import th.co.cbank.project.constants.AppConstants;
import th.co.cbank.project.control.CbTransactionLoanControl;
import th.co.cbank.project.model.CbTransactionLoanBean;
import th.co.cbank.project.model.CbLoanAccountBean;
import th.co.cbank.project.model.CbLoanConfigBean;
import th.co.cbank.project.model.ProfileBean;
import th.co.cbank.project.control.PassBook_PSiPR9;
import th.co.cbank.project.model.ReportOrangeBean;
import th.co.cbank.util.MessageAlert;
import th.co.cbank.util.StringUtil;
import th.co.cbank.util.TableUtil;

public class PrintLoanBookDialog extends BaseDialogSwing {

    private final Logger logger = Logger.getLogger(PrintLoanBookDialog.class);
    private final CbTransactionLoanControl transactionLoanControl = new CbTransactionLoanControl();

    public PrintLoanBookDialog(java.awt.Frame parent, boolean modal, String accCode) {
        super(parent, modal);
        initComponents();

        if (StringUtil.isNotNullString(accCode)) {
            txtLoanCode.setText(accCode);
            btnPrintActionPerformed(null);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtLoanCode = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        rd3 = new javax.swing.JRadioButton();
        rd1 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTransaction = new javax.swing.JTable();
        btnPrint = new javax.swing.JButton();
        btnPrint1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("พิมพ์รายการเงินกู้ย้อนหลัง");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("ค้นหาเลขที่บัญชี");

        txtLoanCode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtLoanCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtLoanCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoanCodeKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("เลือกข้อมูลที่จะพิมพ์");

        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSearch.setText("...");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("ปิด (Close)");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup1.add(rd3);
        rd3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rd3.setSelected(true);
        rd3.setText("พิมพ์รายงานความเคลื่อนไหวลงสมุด");
        rd3.setOpaque(false);

        buttonGroup1.add(rd1);
        rd1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rd1.setText("พิมพ์หน้าปกสมุด");
        rd1.setOpaque(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rd3)
                    .addComponent(rd1))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rd1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rd3)
                .addContainerGap())
        );

        tbTransaction.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbTransaction.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "วันที่", "รายการ", "เงินต้น", "ชำระเงินต้น", "ชำระดอกเบี้ย", "เงินต้นคงเหลือ", "ชำระค่าปรับ", "หมายเหตุ", "ผู้รับชำระ", "พิมพ์", "LineNo", "เอกสารเลขที่"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbTransaction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTransactionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbTransaction);
        if (tbTransaction.getColumnModel().getColumnCount() > 0) {
            tbTransaction.getColumnModel().getColumn(9).setPreferredWidth(40);
            tbTransaction.getColumnModel().getColumn(10).setPreferredWidth(50);
        }

        btnPrint.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPrint.setText("แสดงตัวอย่าง");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        btnPrint1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPrint1.setText("พิมพ์ออกสมุด");
        btnPrint1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrint1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1108, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel1))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLoanCode)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPrint1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtLoanCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPrint1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        ShowLoanAccountPrintDialog sa = new ShowLoanAccountPrintDialog(null, true);
        sa.setVisible(true);
        if (sa.getSelectText() != null) {
            txtLoanCode.setText(sa.getSelectText());
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        if (rd1.isSelected()) {
            printLoanFrontBook();
        } else if (rd3.isSelected()) {
            if (txtLoanCode.getText().trim().equals("")) {
                return;
            }
            try {
                SimpleDateFormat simp = new SimpleDateFormat("dd/MM/yy");
                tbTransaction.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
                tbTransaction.setRowHeight(30);
                DefaultTableModel model = (DefaultTableModel) tbTransaction.getModel();
                TableUtil.clearModel(model);
                List<CbTransactionLoanBean> listTran = getCbTransactionLoanControl().listCbTransactionLoanAll(txtLoanCode.getText(), false);
                for (int i = 0; i < listTran.size(); i++) {
                    CbTransactionLoanBean transactionLoanBean = (CbTransactionLoanBean) listTran.get(i);
                    Object[] dataRow = new Object[12];
                    dataRow[0] = simp.format(transactionLoanBean.getT_date());//01/05/58
                    dataRow[1] = transactionLoanBean.getT_booktype();//DM
                    if (transactionLoanBean.getT_status().equals(AppConstants.CB_STATUS_LOAN)) { // กู้เงิน
                        dataRow[2] = NumberFormat.showDouble2(transactionLoanBean.getT_amount());//99,999,999.99
                        dataRow[3] = "";
                    } else {// ชำระเงิน
                        dataRow[2] = NumberFormat.showDouble2(listTran.get(i - 1).getT_balance());// เงินต้นคงเหลือ
                        dataRow[3] = NumberFormat.showDouble2(transactionLoanBean.getT_amount());//99,999,999.99
                    }
                    dataRow[4] = NumberFormat.showDouble2(transactionLoanBean.getT_interest());//99,999,999.99
                    dataRow[5] = NumberFormat.showDouble2(transactionLoanBean.getT_balance());//99,999,999.99
                    dataRow[6] = NumberFormat.showDouble2(transactionLoanBean.getT_fee());//9,999.99;
                    dataRow[7] = "";//99;
                    dataRow[8] = transactionLoanBean.getT_empcode();//พนักงานรับชำระ
                    dataRow[9] = transactionLoanBean.getPrintChk().equals("N");//สถานะการพิมพ์
                    dataRow[10] = transactionLoanBean.getLineNo();//บรรทัดในการพิมพ์
                    dataRow[11] = transactionLoanBean.getT_docno();//เลขที่ชำระรายการ

                    model.addRow(dataRow);
                }
            } catch (Exception e) {
                MessageAlert.infoPopup(this.getClass(), e.getMessage());
            }
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnPrint1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrint1ActionPerformed
        printTransactionLoanAgain(false);
    }//GEN-LAST:event_btnPrint1ActionPerformed

    private void txtLoanCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoanCodeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
        } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnPrintActionPerformed(null);
        }
    }//GEN-LAST:event_txtLoanCodeKeyPressed

    private void tbTransactionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTransactionMouseClicked
        saveStateTable();
    }//GEN-LAST:event_tbTransactionMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnPrint1;
    private javax.swing.JButton btnSearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rd1;
    private javax.swing.JRadioButton rd3;
    private javax.swing.JTable tbTransaction;
    private javax.swing.JTextField txtLoanCode;
    // End of variables declaration//GEN-END:variables

    private void printLoanFrontBook() {
        //print หน้าปกสมุด
        PassBook_PSiPR9 view = new PassBook_PSiPR9();
        CbLoanAccountBean loanBean = getLoanAccountControl().listLoanAccount(txtLoanCode.getText());
        ProfileBean pBean = getProfileControl().listCbProfile(loanBean.getCust_code());

        CbLoanConfigBean lBean = getLoanConfigControl().listLoanConfig(loanBean.getLoan_type());

        String accCode = txtLoanCode.getText();
        String accName = pBean.getP_custName() + "  " + pBean.getP_custSurname();
        String barcode = txtLoanCode.getText();
        String accType = lBean.getLoanCode() + " - " + lBean.getLoanName();
        String bookNo = "" + loanBean.getBook_no();

        view.printLoanFrontBook(accCode, accName, bookNo, barcode, accType);
    }

    private void printTransactionLoanAgain(boolean preview) {
        try {
            List<CbTransactionLoanBean> listTran = getCbTransactionLoanControl().listCbTransactionLoanAll(txtLoanCode.getText(), true);

            if (listTran.isEmpty()) {
                MessageAlert.warningPopup(this, "ไม่พบรายงานความเคลื่อนไหว !");
            } else {
                List<ReportOrangeBean> listBean = new ArrayList<>();
                ReportOrangeBean reportOrangeBean;
                SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yy");
                for (int i = 0; i < listTran.size(); i++) {
                    CbTransactionLoanBean transactionLoanBean = (CbTransactionLoanBean) listTran.get(i);
                    reportOrangeBean = new ReportOrangeBean();
                    reportOrangeBean.setDate(sim.format(transactionLoanBean.getT_date()));
                    reportOrangeBean.setType(transactionLoanBean.getT_booktype());
                    reportOrangeBean.setStart(NumberFormat.showDouble2(transactionLoanBean.getT_amount()));
                    reportOrangeBean.setPayStart(transactionLoanBean.getT_status());
                    reportOrangeBean.setPayInt(NumberFormat.showDouble2(transactionLoanBean.getT_interest()));
                    reportOrangeBean.setFee(transactionLoanBean.getT_fee());
                    reportOrangeBean.setLine("" + transactionLoanBean.getLineNo());
                    reportOrangeBean.setCashier(transactionLoanBean.getT_empcode());
                    reportOrangeBean.setBalance(NumberFormat.showDouble2(transactionLoanBean.getT_balance()));

                    listBean.add(reportOrangeBean);

                    // update line print chk
                    getCbTransactionSaveControl().updateLoanLinePrint(transactionLoanBean.getT_acccode(), transactionLoanBean.getLineNo(), "" + transactionLoanBean.getT_date());
                }

                if (!preview) {
                    PassBook_PSiPR9 passBook = new PassBook_PSiPR9();
                    passBook.printTransactionOrange2(listBean, true);
                }
            }
        } catch (HeadlessException e) {
            MessageAlert.errorPopup(this, e.getMessage());
            logger.error(e.getMessage());
        }
    }

    private void saveStateTable() {
        int selectRow = tbTransaction.getSelectedRow();
        if (selectRow == -1) {
            return;
        }
        int lineNo = Integer.parseInt("" + tbTransaction.getValueAt(selectRow, 10));
        String t_booktype = "" + tbTransaction.getValueAt(selectRow, 1);
        String t_docno = "" + tbTransaction.getValueAt(selectRow, 11);

        CbTransactionLoanBean bean = new CbTransactionLoanBean();
        bean.setT_acccode(txtLoanCode.getText());
        bean.setLineNo(lineNo);
        bean.setT_docno(t_docno);
        bean.setT_booktype(t_booktype);

        transactionLoanControl.updateLoanState(bean);
    }
}
