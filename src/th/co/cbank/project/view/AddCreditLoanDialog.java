package th.co.cbank.project.view;

import java.awt.event.KeyEvent;
import org.apache.log4j.Logger;
import th.co.cbank.project.control.CbProfileControl;
import th.co.cbank.project.model.ProfileBean;
import th.co.cbank.util.MessageAlert;
import th.co.cbank.util.NumberFormat;

public class AddCreditLoanDialog extends BaseDialogSwing {

    private final Logger logger = Logger.getLogger(AddCreditLoanDialog.class);
    private String profileCode = null;
    private String empCode = null;

    public AddCreditLoanDialog(java.awt.Frame parent, boolean modal, String profileCode, String empCode) {
        super(parent, modal);
        initComponents();
        logger.debug("AddCreditLoanDialog init");
        
        this.profileCode = profileCode;
        this.empCode = empCode;
        initLoadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        txtLoanMaxAmt = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtCreditLoanAmt = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        txtLoanBalance = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("เพิ่มวงเงินเครดิตให้กับสมาชิก");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSave.setText("บันทึกข้อมูลเงินกู้");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        btnSave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSaveKeyPressed(evt);
            }
        });

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ข้อมูลเงินกู้", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel8.setOpaque(false);

        txtLoanMaxAmt.setEditable(false);
        txtLoanMaxAmt.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanMaxAmt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanMaxAmt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtLoanMaxAmt.setText("0.00");

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel50.setText("วงเงินเครดิตสินเชื่อเต็มจำนวน");

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel39.setText("บาท");

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel40.setText("บาท");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("เครดิตคงเหลือ");

        txtCreditLoanAmt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCreditLoanAmt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCreditLoanAmt.setText("0.00");
        txtCreditLoanAmt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCreditLoanAmtFocusGained(evt);
            }
        });
        txtCreditLoanAmt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCreditLoanAmtKeyReleased(evt);
            }
        });

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel75.setText("เครดิตใช้ไป");

        txtLoanBalance.setEditable(false);
        txtLoanBalance.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanBalance.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanBalance.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtLoanBalance.setText("0.00");

        jLabel90.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel90.setText("บาท");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel50)
                    .addComponent(jLabel75))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtLoanMaxAmt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCreditLoanAmt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLoanBalance, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40)
                    .addComponent(jLabel39)
                    .addComponent(jLabel90))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(txtCreditLoanAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(txtLoanBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel90))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtLoanMaxAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancel.setText("ยกเลิก (Close)");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCreditLoanAmtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCreditLoanAmtFocusGained
        txtCreditLoanAmt.selectAll();
    }//GEN-LAST:event_txtCreditLoanAmtFocusGained

    private void txtCreditLoanAmtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCreditLoanAmtKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSave.requestFocus();
            return;
        }
        txtLoanMaxAmt.setText("" + NumberFormat.toDouble(txtCreditLoanAmt.getText()));
    }//GEN-LAST:event_txtCreditLoanAmtKeyReleased

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        saveLoanAllow();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSaveKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            saveLoanAllow();
        }
    }//GEN-LAST:event_btnSaveKeyPressed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void saveLoanAllow() {
        double creditLoanAmt = NumberFormat.toDouble(txtCreditLoanAmt.getText());
        CbProfileControl profileControl = new CbProfileControl();
        boolean isUpdate = profileControl.saveLoanAllow(profileCode, creditLoanAmt, empCode);
        if (isUpdate) {
            MessageAlert.infoPopup(this.getClass(), "บันทึกข้อมูลเรียบร้อยแล้ว");
            btnCancel.setVisible(true);
            dispose();
        } else {
            MessageAlert.infoPopup(this.getClass(), "ไม่สามารถบันทึกข้อมูลได้ !!!");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField txtCreditLoanAmt;
    private javax.swing.JTextField txtLoanBalance;
    private javax.swing.JTextField txtLoanMaxAmt;
    // End of variables declaration//GEN-END:variables

    private void initLoadData() {
        ProfileBean profileBean = getProfileControl().findOneByCustCode(profileCode);
        txtCreditLoanAmt.setText(NumberFormat.showDouble2(profileBean.getLoan_Credit_Amt()));
        txtLoanBalance.setText(NumberFormat.showDouble2(profileBean.getLoan_Balance()));
        txtLoanMaxAmt.setText(NumberFormat.showDouble2(profileBean.getLoan_Credit_Balance()));

        txtCreditLoanAmt.requestFocus();
    }
}
