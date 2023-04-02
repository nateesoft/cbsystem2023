package th.co.cbank.project.view;

import java.util.List;
import th.co.cbank.project.control.CbSaveAccountControl;
import th.co.cbank.project.control.CbTransactionSaveControl;
import th.co.cbank.project.model.CbSaveAccountBean;
import th.co.cbank.util.MessageAlert;

public class UpdateTransactionDialog extends javax.swing.JDialog {

    private final CbSaveAccountControl saveAccountControl = new CbSaveAccountControl();
    private final CbTransactionSaveControl cbTransactionSaveControl = new CbTransactionSaveControl();

    public UpdateTransactionDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pb = new javax.swing.JProgressBar();
        btnStartProcess = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("อัพเดตข้อมูลดอกเบี้ย และความเคลื่อนไหว");
        setResizable(false);

        pb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pb.setStringPainted(true);

        btnStartProcess.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnStartProcess.setText("เริ่มกระบวนการ");
        btnStartProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartProcessActionPerformed(evt);
            }
        });

        btnClose.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClose.setText("ปิดหน้าต่าง");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 136, Short.MAX_VALUE)
                        .addComponent(btnClose)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnStartProcess)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStartProcess)
                    .addComponent(btnClose))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartProcessActionPerformed
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                btnStartProcess.setEnabled(false);
                btnClose.setEnabled(false);
                process();
                dispose();
            }
        });
        t1.start();
    }//GEN-LAST:event_btnStartProcessActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnStartProcess;
    private javax.swing.JProgressBar pb;
    // End of variables declaration//GEN-END:variables

    private void process() {
        List<CbSaveAccountBean> listSaveAccount = saveAccountControl.listSaveAccount(" order by account_code ");
        pb.setMinimum(0);
        pb.setMaximum(listSaveAccount.size());
        int count = 0;
        for (CbSaveAccountBean bean : listSaveAccount) {
            String custCode = bean.getB_CUST_CODE();
            String accCode = bean.getAccount_code();
            cbTransactionSaveControl.deleteData(custCode, accCode);
            TransactionAdvanceMethod.findData(custCode, accCode, false);
            double all_balance = TransactionAdvanceMethod.balanceAmount;
            double all_interest = TransactionAdvanceMethod.interestAmount;
            TransactionAdvanceMethod.updateSaveAccountAndProfile(custCode, accCode, all_balance, all_interest);
            TransactionAdvanceMethod.updateTransactionSaveRunning(custCode, accCode);
            count++;
            pb.setValue(count);
        }

        MessageAlert.infoPopup(this, "กระบวนการอัพเดตความเคลื่อนไหวเสร็จสมบูรณ์");
    }
}
