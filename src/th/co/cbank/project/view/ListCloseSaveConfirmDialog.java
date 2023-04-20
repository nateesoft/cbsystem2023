package th.co.cbank.project.view;

import java.awt.Frame;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.log4j.Logger;
import th.co.cbank.project.control.CbTransactionSaveControl;
import th.co.cbank.util.NumberFormat;
import th.co.cbank.project.model.ConfigBean;
import th.co.cbank.project.model.PrintSlipBean;
import th.co.cbank.project.control.PassBook_PSiPR9;
import th.co.cbank.project.model.CbTransactionSaveBean;
import th.co.cbank.project.model.ReportGreenBean;

public class ListCloseSaveConfirmDialog extends BaseDialogSwing {

    private final Logger logger = Logger.getLogger(ListCloseSaveConfirmDialog.class);
    private PrintSlipBean psBean;
    private Frame parent;

    public ListCloseSaveConfirmDialog(java.awt.Frame parent, boolean modal, PrintSlipBean psBean) {
        super(parent, modal);
        initComponents();
        logger.debug("ListCloseSaveConfirmDialog init");

        this.psBean = psBean;
        this.parent = parent;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("เมนูจัดการ");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("พิมพ์สลิป");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("พิมพ์ความเคลื่อนไหวลงสมุด");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("แสดงรายงานการฝากถอนเงิน");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("ออก (Exit)");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PassBook_PSiPR9 v = new PassBook_PSiPR9();
        v.printSlipSaveBook(psBean);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        printTransactionCloseBook(psBean.getAccountCode());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        SaveReportAllDialog s = new SaveReportAllDialog(parent, true);
        s.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    // End of variables declaration//GEN-END:variables

    private void printTransactionCloseBook(String txtAccCode) {
        //print รายการลงในสมุด
        PassBook_PSiPR9 passbookPsi = new PassBook_PSiPR9();
        ConfigBean configBean = getConfigControl().findOne();

        List<ReportGreenBean> listBean = new ArrayList<>();
        SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yy");
        CbTransactionSaveControl transactionSaveControl = new CbTransactionSaveControl();
        List<CbTransactionSaveBean> listTransactionSaveBean = transactionSaveControl.listAllByAccountCode(txtAccCode, configBean.getLoanDocPrefix());
        for (CbTransactionSaveBean bean : listTransactionSaveBean) {
            ReportGreenBean reportGreenBean = new ReportGreenBean();
            reportGreenBean.setDate(sim.format(new Date()));
            reportGreenBean.setType(bean.getT_booktype());
            double money_in = bean.getMoney_in();
            double money_out = bean.getMoney_out();
            if (money_in == 0) {
                reportGreenBean.setDp("");
            } else {
                reportGreenBean.setDp(NumberFormat.showDouble2(money_in));
            }
            if (money_out == 0) {
                reportGreenBean.setWd("");
            } else {
                reportGreenBean.setWd(NumberFormat.showDouble2(money_out));
            }

            reportGreenBean.setBalance(NumberFormat.showDouble2(0));
            reportGreenBean.setIn("" + bean.getT_hoon());
            reportGreenBean.setLine("" + bean.getLineNo());

            listBean.add(reportGreenBean);

            //update book
            transactionSaveControl.updateWhereBookTypeNotIn(txtAccCode, configBean.getLoanDocPrefix(), configBean.getPaymentDocPrefix());
        }

        //print passbook
        passbookPsi.printTransactionGreen2(listBean, true);
    }
}
