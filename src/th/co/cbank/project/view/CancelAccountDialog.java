package th.co.cbank.project.view;

import java.awt.Font;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.apache.log4j.Logger;
import th.co.cbank.util.DateFormat;
import th.co.cbank.project.constants.AppConstants;
import th.co.cbank.project.control.CancelAccontControl;
import th.co.cbank.project.control.CbSaveAccountControl;
import th.co.cbank.project.control.CbSaveConfigControl;
import th.co.cbank.project.control.Value;
import th.co.cbank.project.model.CbCancelAccountBean;
import th.co.cbank.util.MessageAlert;
import th.co.cbank.util.NumberFormat;
import th.co.cbank.util.TableUtil;

public class CancelAccountDialog extends BaseDialogSwing {

    private final Logger logger = Logger.getLogger(CancelAccountDialog.class);

    public CancelAccountDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        logger.debug("CancelAccountDialog init");

        initTable();
        findAccount();
        loadCancelData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbMaster = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        btnCancelProcess = new javax.swing.JButton();
        btnFindAccountToCancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbCancelData = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ยกเลิกการเปิดบัญชี");

        tbMaster.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "บัตรประชาชน", "ชื่อบัญชี", "เลขที่บัญชี", "ประเภทบัญชี", "วันที่เปิดบัญชี", "รหัสประเภทบัญชี", "bookno"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbMaster.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tbMaster);
        if (tbMaster.getColumnModel().getColumnCount() > 0) {
            tbMaster.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("ปิดหน้าต่าง (Exit)");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnCancelProcess.setBackground(new java.awt.Color(255, 204, 204));
        btnCancelProcess.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelProcess.setText("ยกเลิกบัญชี");
        btnCancelProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelProcessActionPerformed(evt);
            }
        });

        btnFindAccountToCancel.setBackground(new java.awt.Color(153, 255, 102));
        btnFindAccountToCancel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnFindAccountToCancel.setText("ค้นหาข้อมูลบัญชีที่ต้องการยกเลิก");
        btnFindAccountToCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindAccountToCancelActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 51, 0));
        jLabel2.setText("*เงื่อนไข: ยกเลิกข้ามวันไม่ได้, ถ้ามีการฝากเงินเข้าบัญชีแล้วไม่สามารถยกเลิกได้");

        tbCancelData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "วันที่ยกเลิก", "เวลา", "เลขที่บัญชี", "พนักงานยกเลิก"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbCancelData);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("ประวัติการยกเลิกการเปิดบัญชี");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnFindAccountToCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelProcess)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFindAccountToCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(976, 641));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelProcessActionPerformed
        processToCancel();
    }//GEN-LAST:event_btnCancelProcessActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnFindAccountToCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindAccountToCancelActionPerformed
        findAccount();
    }//GEN-LAST:event_btnFindAccountToCancelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelProcess;
    private javax.swing.JButton btnFindAccountToCancel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbCancelData;
    private javax.swing.JTable tbMaster;
    // End of variables declaration//GEN-END:variables

    private void initTable() {
        tbMaster.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        tbMaster.setRowHeight(30);
        JTableHeader tTran = tbMaster.getTableHeader();
        tTran.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, AppConstants.DEFAULT_FONT_SIZE));

        tbCancelData.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        tbCancelData.setRowHeight(30);
        JTableHeader tTran1 = tbCancelData.getTableHeader();
        tTran1.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, AppConstants.DEFAULT_FONT_SIZE));
    }

    private void loadCancelData() {
        DefaultTableModel model = (DefaultTableModel) tbCancelData.getModel();
        TableUtil.clearModel(model);

        List<CbCancelAccountBean> listBean = getCbCancelAccountControl().listCbCancelAccount();
        for (int i = 0; i < listBean.size(); i++) {
            CbCancelAccountBean bean = (CbCancelAccountBean) listBean.get(i);
            model.addRow(new Object[]{
                DateFormat.getLocale_ddMMyyyy(bean.getDate_cancel()),
                bean.getTime_cancel(),
                bean.getAccount_no(),
                bean.getUser_code()
            });
        }
    }

    private void findAccount() {
        DefaultTableModel model = (DefaultTableModel) tbMaster.getModel();
        TableUtil.clearModel(model);

        CancelAccontControl accontControl = new CancelAccontControl();
        List<Object[]> listModel = accontControl.getAccountToCancel();
        for (Object[] data : listModel) {
            model.addRow(data);
        }
    }

    private void processToCancel() {
        int rowSel = tbMaster.getSelectedRow();
        if (rowSel != -1) {
            String accountNo = tbMaster.getValueAt(rowSel, 2).toString();
            String accountType = tbMaster.getValueAt(rowSel, 5).toString();
            int bookNo = NumberFormat.toInt(tbMaster.getValueAt(rowSel, 6).toString());
            int conf = MessageAlert.showConfirm(this, "ท่านต้องการยกเลิกบัญชีเลขที่ " + accountNo + " ใช่หรือไม่ ?");
            if (conf == MessageAlert.YES_OPTION) {
                CancelPwdDialog c = new CancelPwdDialog(null, true);
                c.setVisible(true);

                if (c.isPwdOk()) {
                    //action
                    /*
                     1. ต้องยกเลิกภายในวันนั้น ข้ามวันไม่ได้ (ผ่าน)
                     2. ยังไม่มีการฝากเงินเข้าไปในบัญชี (ผ่าน)
                     3. ยังไม่มีการเปิดบัญชีต่อจากบัญชีที่เปิดผิดนี้                    
                     */
                    CbSaveConfigControl saveConfigControl = new CbSaveConfigControl();
                    CbSaveAccountControl saveAccountControl = new CbSaveAccountControl();
                    int maxBookNo = saveAccountControl.getMaxBookNo();
                    if (bookNo == maxBookNo) {
                        /*
                         1. ลบรายการออกจาก cb_save_account
                         2. อัพเดต Running ย้อนกลับไป 1 ค่า
                         */
                        if (saveAccountControl.deleteAccountAndBookNo(accountNo, bookNo)) {
                            if (saveConfigControl.updateSaveRunningAndNoRunning(accountType)) {
                                MessageAlert.infoPopup(this, "ยกเลิกบัญชี " + accountNo + " เรียบร้อยแล้ว");

                                findAccount();

                                CbCancelAccountBean bean = new CbCancelAccountBean();
                                bean.setAccount_no(accountNo);
                                bean.setAccount_type(accountType);
                                bean.setUser_code(Value.USER_CODE);

                                getCbCancelAccountControl().saveCbCancelAccount(bean);

                                loadCancelData();
                            }
                        }
                    } else {
                        MessageAlert.warningPopup(this, "มีบัญชีที่เปิดหลังบัญชีนี้ ไม่สามารถลบข้อมูลนี้ได้ \n"
                                + "ท่านสามารถยกเลิกบัญชีล่าสุดได้เท่านั้น !");
                    }
                }
            }
        } else {
            MessageAlert.warningPopup(this, "กรุณาเลือกบัญชีที่ท่านต้องการยกเลิก !!!");
            tbMaster.requestFocus();
        }
    }
}
