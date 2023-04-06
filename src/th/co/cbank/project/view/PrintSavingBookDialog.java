package th.co.cbank.project.view;

import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
import th.co.cbank.util.NumberFormat;
import th.co.cbank.project.constants.AppConstants;
import th.co.cbank.project.control.CbSaveAccountControl;
import th.co.cbank.project.control.CbTransactionSaveControl;
import th.co.cbank.project.model.CbSaveAccountBean;
import th.co.cbank.project.model.CbSaveConfigBean;
import th.co.cbank.project.model.CbTransactionSaveBean;
import th.co.cbank.project.control.PassBook_PSiPR9;
import th.co.cbank.project.model.ReportGreenBean;
import th.co.cbank.util.MessageAlert;
import th.co.cbank.util.TableUtil;

public class PrintSavingBookDialog extends BaseDialogSwing {

    private final Logger logger = Logger.getLogger(PrintSavingBookDialog.class);
    private final CbTransactionSaveControl transactionSaveControl = new CbTransactionSaveControl();

    public PrintSavingBookDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        logger.debug("PrintSavingBookDialog init");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        rd3 = new javax.swing.JRadioButton();
        rd1 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        btnPrint = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        txtAccCode = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTransaction = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnPrint1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("พิมพ์รายการฝากถอนย้อนหลัง");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("ค้นหาเลขที่บัญชี");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("เลือกข้อมูลที่จะพิมพ์");

        btnPrint.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPrint.setText("แสดงตัวอย่าง");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        btnClose.setBackground(new java.awt.Color(204, 0, 0));
        btnClose.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnClose.setText("ปิด (Close)");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        txtAccCode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAccCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAccCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAccCodeKeyPressed(evt);
            }
        });

        btnFind.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnFind.setText("...");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        tbTransaction.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "วันที่", "ประเภท", "ถอน", "ฝาก", "คงเหลือ", "หุ้น", "บรรทัด/แก้ไข", "สั่งพิมพ์", "เลขที่", "วันที่", "บรรทัดเดิม", "ลำดับ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbTransaction);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("ตัวอย่างก่อนออกเครื่องพิมพ์");

        btnPrint1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPrint1.setText("พิมพ์ออกสมุด");
        btnPrint1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrint1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("*** คำแนะนำ ***");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("1. ช่อง บรรทัด/แก้ไข => สามารถปรับแก้ได้ตั้งแต่ 1-24 เป็นลำดับต่อหน้าสมุด");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("2. ช่อง ลำดับ => สามารถปรับแก้ได้ เป็นเลขเรียงไปเรื่อยๆ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("    ถ้าเกิน 24 ให้นับ 1 ใหม่ (เพราะเริ่มต้นหน้าใหม่)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAccCode)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnPrint)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPrint1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnFind)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnClose)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtAccCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPrint1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
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

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        ShowAccountPrintDialog sa = new ShowAccountPrintDialog(null, true);
        sa.setVisible(true);
        if (sa.getSelectText() != null) {
            txtAccCode.setText(sa.getSelectText());
            DefaultTableModel model = (DefaultTableModel) tbTransaction.getModel();
            clearModel(model);
        }
    }//GEN-LAST:event_btnFindActionPerformed

    private void clearModel(DefaultTableModel model) {
        TableUtil.clearModel(model);
    }

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        if (rd1.isSelected()) {
            printFrontBook();
        } else if (rd3.isSelected()) {
            if (txtAccCode.getText().trim().equals("")) {
                return;
            }
            try {
                tbTransaction.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
                tbTransaction.setRowHeight(30);

                TableUtil.alignRight(tbTransaction, 2);
                TableUtil.alignRight(tbTransaction, 3);
                TableUtil.alignRight(tbTransaction, 4);

                DefaultTableModel model = (DefaultTableModel) tbTransaction.getModel();
                clearModel(model);
                SimpleDateFormat simp = new SimpleDateFormat("dd/MM/yy", Locale.ENGLISH);
                CbSaveAccountControl saveAccountControl = new CbSaveAccountControl();
                CbSaveAccountBean accountBean = saveAccountControl.getSaveAccountBean(txtAccCode.getText());
                List<CbTransactionSaveBean> transactionSave = transactionSaveControl.listSavingBookTransactionByAcccode(txtAccCode.getText(), accountBean.getB_CUST_CODE());
                int backupLineNo = 0;
                int backupIndex = 0;
                if (transactionSave.size() > 0) {
                    btnPrint1.setEnabled(true);
                }
                for (CbTransactionSaveBean bean : transactionSave) {
                    Object[] p = new Object[12];
                    p[0] = simp.format(bean.getT_date());//01/05/58
                    p[1] = bean.getT_booktype();//DM
                    if (bean.getMoney_out() > 0) {
                        p[2] = "<html><font color=red>" + NumberFormat.showDouble2(bean.getMoney_out()) + "</font></html>";
                    } else {
                        p[2] = NumberFormat.showDouble2(bean.getMoney_out());
                    }
                    p[3] = NumberFormat.showDouble2(bean.getMoney_in());//99,999,999.99
                    p[4] = NumberFormat.showDouble2(bean.getT_balance());//99,999,999.99
                    p[5] = bean.getT_hoon();//9,999.99;
                    int lineNo = bean.getLineNo();
                    boolean isCheck = bean.getPrintChk().equals("N");
                    if (lineNo == 0) {
                        lineNo = (backupLineNo + 1) > 24 ? 1 : (backupLineNo + 1);
                        isCheck = true;
                    }
                    if (lineNo == backupLineNo) {
                        lineNo = (backupLineNo + 1) > 24 ? 1 : (backupLineNo + 1);
                    }
                    p[6] = lineNo; //24;
                    p[7] = isCheck;
                    p[8] = bean.getT_docno();//เลขที่เอกสาร
                    p[9] = bean.getT_date();//เลขที่เอกสาร
                    p[10] = bean.getLineNo();//เลขที่เอกสาร
                    int index = bean.getT_index();
                    if (index == 0 || index == backupIndex) {
                        index = backupIndex + 1;
                    }
                    p[11] = index;//ลำดับทั้งหมด

                    model.addRow(p);
                    backupLineNo = lineNo;
                    backupIndex = index;
                }
            } catch (Exception e) {
                MessageAlert.infoPopup(this.getClass(), e.getMessage());
            }
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnPrint1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrint1ActionPerformed
        if (rd1.isSelected()) {
            printFrontBook();
        } else {
            btnPrint1.setEnabled(false);
            saveStateTable();
            printTransactionSaveAgain(false);
        }
    }//GEN-LAST:event_btnPrint1ActionPerformed

    private void txtAccCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAccCodeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
        } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnPrintActionPerformed(null);
        }
    }//GEN-LAST:event_txtAccCodeKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnPrint1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rd1;
    private javax.swing.JRadioButton rd3;
    private javax.swing.JTable tbTransaction;
    private javax.swing.JTextField txtAccCode;
    // End of variables declaration//GEN-END:variables

    private void printFrontBook() {
        //print หน้าปกสมุด
        PassBook_PSiPR9 view = new PassBook_PSiPR9();
        CbSaveAccountBean saveBean = getSaveAccountControl().getSaveAccountBean(txtAccCode.getText());

        String accCode = saveBean.getAccount_code();
        String accName = saveBean.getB_CUST_NAME() + "  " + saveBean.getB_CUST_LASTNAME();
        String bookNo = saveBean.getBook_no();
        String accType = saveBean.getAccount_type();
        CbSaveConfigBean bean = getSaveConfigControl().listSaveConfig1(accType);

        view.printFrontBook(accCode, accName, bookNo, accType + " - " + bean.getTypeName());
    }

    private void printTransactionSaveAgain(boolean preview) {
        try {
            List<CbTransactionSaveBean> listTran = getCbTransactionSaveControl().listCbTransactionSaveAllAddStatus11(txtAccCode.getText());
            if (listTran.isEmpty()) {
                MessageAlert.warningPopup(this, "ไม่พบรายงานความเคลื่อนไหว หรือไม่มีการเลือกบรรทัดที่ต้องพิมพ์ !");
            } else {
                List<ReportGreenBean> listBean = new ArrayList<>();
                ReportGreenBean bean1;
                for (int i = 0; i < listTran.size(); i++) {
                    CbTransactionSaveBean tBean = (CbTransactionSaveBean) listTran.get(i);
                    bean1 = new ReportGreenBean();
                    SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yy");

                    bean1.setDate(sim.format(tBean.getT_date()));
                    bean1.setType(tBean.getT_booktype());
                    if (tBean.getMoney_out() > 0) {
                        bean1.setWd(NumberFormat.showDouble2(tBean.getMoney_out()));
                        bean1.setDp("");
                    }
                    if (tBean.getMoney_in() > 0) {
                        bean1.setWd("");
                        bean1.setDp(NumberFormat.showDouble2(tBean.getMoney_in()));
                    }

                    bean1.setBalance(NumberFormat.showDouble2(tBean.getT_balance()));
                    if (tBean.getT_hoon() > 0) {
                        bean1.setIn("" + tBean.getT_hoon());
                    } else {
                        bean1.setIn("");
                    }

                    int lineNo = tBean.getLineNo();
                    if (lineNo == 0) {
                        lineNo = tBean.getT_index() > 24 ? 1 : tBean.getT_index();
                    }
                    bean1.setLine("" + lineNo);
                    bean1.setDoc_no(tBean.getT_docno());
                    bean1.setIn(NumberFormat.showDouble2(tBean.getT_interest()));

                    listBean.add(bean1);

                    // update line print chk
                    getCbTransactionSaveControl().updateLinePrint(tBean.getT_acccode(), tBean.getLineNo(), "" + tBean.getT_date(), tBean.getT_index());
                }

                if (!preview) {
                    PassBook_PSiPR9 v = new PassBook_PSiPR9();
                    v.printTransactionGreen2(listBean, true);
                }
            }

        } catch (HeadlessException e) {
            MessageAlert.errorPopup(this, e.getMessage());
            logger.error(e.getMessage());
        }
    }

    private void saveStateTable() {
        DefaultTableModel model = (DefaultTableModel) tbTransaction.getModel();
        int size = model.getRowCount();
        for (int i = 0; i < size; i++) {
            boolean isCheck = Boolean.parseBoolean("" + tbTransaction.getValueAt(i, 7));
            int lineNo = NumberFormat.toInt("" + tbTransaction.getValueAt(i, 6));
            String t_booktype = "" + tbTransaction.getValueAt(i, 1);
            String t_docno = "" + tbTransaction.getValueAt(i, 8);
            String t_date = "" + tbTransaction.getValueAt(i, 9);
            int lineNoOld = NumberFormat.toInt("" + tbTransaction.getValueAt(i, 10));
            int t_index = NumberFormat.toInt("" + tbTransaction.getValueAt(i, 11));

            CbTransactionSaveBean bean = new CbTransactionSaveBean();
            bean.setT_index(t_index);
            bean.setT_acccode(txtAccCode.getText());
            bean.setLineNo(lineNoOld);
            bean.setT_docno(t_docno);
            bean.setT_booktype(t_booktype);

            if (isCheck) {
                if (lineNoOld == 0) {
                    bean.setLineNo(lineNo);
                }
                transactionSaveControl.updateStateTable(bean, lineNoOld, t_date);
            } else {
                transactionSaveControl.updateStateTable2(bean, lineNoOld, t_date);
            }
        }
    }
}
