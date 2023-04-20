package th.co.cbank.project.view.components;

import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JComboBox;
import org.apache.log4j.Logger;
import th.co.cbank.project.control.BranchControl;
import th.co.cbank.project.control.CbFeeControl;
import th.co.cbank.project.control.CbFeeTransactionControl;
import th.co.cbank.project.control.CbSaveAccountControl;
import th.co.cbank.project.control.CbSaveConfigControl;
import th.co.cbank.project.control.ConfigControl;
import th.co.cbank.project.control.PassBook_PSiPR9;
import th.co.cbank.project.control.PrintCOM;
import th.co.cbank.project.control.ProfileControl;
import th.co.cbank.project.control.Value;
import th.co.cbank.project.model.BranchBean;
import th.co.cbank.project.model.CbFeeBean;
import th.co.cbank.project.model.CbFeeTransactionBean;
import th.co.cbank.project.model.CbSaveAccountBean;
import th.co.cbank.project.model.CbSaveConfigBean;
import th.co.cbank.project.model.ConfigBean;
import th.co.cbank.project.model.ProfileBean;
import th.co.cbank.util.MessageAlert;
import th.co.cbank.util.NumberFormat;

public class NewDepositPanel extends javax.swing.JPanel {

    private final Logger logger = Logger.getLogger(NewDepositPanel.class);
    private ProfileBean profileBean;
    private final CbSaveConfigControl saveConfigControl = new CbSaveConfigControl();
    private final ConfigControl configControl = new ConfigControl();
    private final BranchControl branchControl = new BranchControl();
    private final CbSaveAccountControl saveAccountControl = new CbSaveAccountControl();
    private final ProfileControl profileControl = new ProfileControl();
    private final CbFeeControl cbFeeControl = new CbFeeControl();
    private final CbFeeTransactionControl cbFeeTransactionControl = new CbFeeTransactionControl();

    public NewDepositPanel(ProfileBean profileBean) {
        initComponents();
        logger.debug("NewDepositPanel init");

        this.profileBean = profileBean;

        initLoad();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        btnPrintSliplOpenAcc = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        chkSave1 = new javax.swing.JCheckBox();
        lblSaveEvidence = new javax.swing.JLabel();
        lblSaveAccountNo = new javax.swing.JLabel();
        txtAccountCode = new javax.swing.JTextField();
        chkSave2 = new javax.swing.JCheckBox();
        lblSaveBookNo = new javax.swing.JLabel();
        txtBookNo = new javax.swing.JTextField();
        lblSaveFee = new javax.swing.JLabel();
        txtSaveFee = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        lblSelectSaveAccount = new javax.swing.JLabel();
        cbAccType = new javax.swing.JComboBox();
        btnSaveAccOpen = new javax.swing.JButton();
        jPanel38 = new javax.swing.JPanel();
        lblSaveOpenTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        btnPrintSliplOpenAcc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPrintSliplOpenAcc.setText("ออกสลิปใบเสร็จ");
        btnPrintSliplOpenAcc.setEnabled(false);
        btnPrintSliplOpenAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintSliplOpenAccActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setOpaque(false);

        chkSave1.setBackground(new java.awt.Color(255, 255, 255));
        chkSave1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkSave1.setText("สำเนาบัตรประชาชน");

        lblSaveEvidence.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSaveEvidence.setText("หลักฐาน");

        lblSaveAccountNo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSaveAccountNo.setText("เลขที่บัญชี");

        txtAccountCode.setEditable(false);
        txtAccountCode.setBackground(new java.awt.Color(255, 255, 204));
        txtAccountCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAccountCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAccountCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        chkSave2.setBackground(new java.awt.Color(255, 255, 255));
        chkSave2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkSave2.setText("สำเนาทะเบียนบ้าน");

        lblSaveBookNo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSaveBookNo.setText("สมุดเล่มที่");

        txtBookNo.setEditable(false);
        txtBookNo.setBackground(new java.awt.Color(255, 255, 204));
        txtBookNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBookNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBookNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        lblSaveFee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSaveFee.setText("ค่าธรรมเนียม");

        txtSaveFee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSaveFee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSaveFee.setText("0.00");
        txtSaveFee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtSaveFee.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSaveFeeFocusGained(evt);
            }
        });
        txtSaveFee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSaveFeeKeyPressed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel32.setText("บาท");

        lblSelectSaveAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSelectSaveAccount.setText("เลือกบัญชี");

        cbAccType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSelectSaveAccount)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblSaveFee)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblSaveEvidence, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblSaveAccountNo, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblSaveBookNo, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtSaveFee, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel32))
                    .addComponent(chkSave2)
                    .addComponent(txtBookNo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAccountCode, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAccType, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkSave1))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAccType, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSelectSaveAccount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblSaveAccountNo)
                    .addComponent(txtAccountCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBookNo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSaveBookNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblSaveFee)
                    .addComponent(txtSaveFee, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkSave1)
                        .addComponent(lblSaveEvidence))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(chkSave2)))
                .addContainerGap())
        );

        btnSaveAccOpen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSaveAccOpen.setText("บันทึกข้อมูล");
        btnSaveAccOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveAccOpenActionPerformed(evt);
            }
        });
        btnSaveAccOpen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSaveAccOpenKeyPressed(evt);
            }
        });

        jPanel38.setBackground(new java.awt.Color(204, 255, 204));

        lblSaveOpenTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblSaveOpenTitle.setText("เปิดบัญชีเงินฝาก");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSaveOpenTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSaveOpenTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(btnPrintSliplOpenAcc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnSaveAccOpen, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel38, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(39, 39, 39))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(btnSaveAccOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPrintSliplOpenAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrintSliplOpenAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveAccOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(241, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintSliplOpenAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintSliplOpenAccActionPerformed
        if (cbAccType.getItemCount() > 0) {
            PrintCOM pc = new PrintCOM();
            pc.printFeeOpen(profileBean.getP_custCode(), txtSaveFee.getText());
        }
    }//GEN-LAST:event_btnPrintSliplOpenAccActionPerformed

    private void txtSaveFeeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSaveFeeFocusGained
        txtSaveFee.selectAll();
    }//GEN-LAST:event_txtSaveFeeFocusGained

    private void txtSaveFeeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSaveFeeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSaveAccOpen.requestFocus();
        }
    }//GEN-LAST:event_txtSaveFeeKeyPressed

    private void btnSaveAccOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveAccOpenActionPerformed
        int confirm = MessageAlert.showConfirm(this, "ท่านต้องการเปิดบัญชีเงินฝากใช่หรือไม่ ?");
        if (confirm == MessageAlert.YES_OPTION) {
            saveOpenSave();
        }
    }//GEN-LAST:event_btnSaveAccOpenActionPerformed

    private void btnSaveAccOpenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSaveAccOpenKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            saveOpenSave();
        }
    }//GEN-LAST:event_btnSaveAccOpenKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrintSliplOpenAcc;
    private javax.swing.JButton btnSaveAccOpen;
    private javax.swing.JComboBox cbAccType;
    private javax.swing.JCheckBox chkSave1;
    private javax.swing.JCheckBox chkSave2;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblSaveAccountNo;
    private javax.swing.JLabel lblSaveBookNo;
    private javax.swing.JLabel lblSaveEvidence;
    private javax.swing.JLabel lblSaveFee;
    private javax.swing.JLabel lblSaveOpenTitle;
    private javax.swing.JLabel lblSelectSaveAccount;
    private javax.swing.JTextField txtAccountCode;
    private javax.swing.JTextField txtBookNo;
    private javax.swing.JTextField txtSaveFee;
    // End of variables declaration//GEN-END:variables

    private String getIDCombobox(JComboBox cb) {
        if (cb.getItemCount() > 0) {
            String[] items = cb.getSelectedItem().toString().split("-");
            String id = items[0].trim();
            return id;
        } else {
            return "";
        }
    }

    private String getRunning(int run) {
        if (run < 10) {
            return "000000" + run;
        } else if (run < 100) {
            return "00000" + run;
        } else if (run < 1000) {
            return "0000" + run;
        } else if (run < 10000) {
            return "000" + run;
        } else if (run < 100000) {
            return "00" + run;
        } else if (run < 1000000) {
            return "0" + run;
        } else {
            return "" + run;
        }
    }

    private String getBookNo(int run) {
        if (run == 0) {
            run = 1;
        }
        if (run < 10) {
            return "00" + run;
        } else if (run < 100) {
            return "0" + run;
        } else {
            return "" + run;
        }
    }

    String[] generateAutoNo() {
        String newAccountNo = "";
        String newBookNo = "";
        String docType = getIDCombobox(cbAccType);
        CbSaveConfigBean sBean = saveConfigControl.findOneByTypeCode(docType);
        ConfigBean bean = configControl.findOne();
        if (bean.getBranchPrefix().equals("Y")) {
            BranchBean bBean = branchControl.getData();
            newAccountNo = bBean.getCode() + sBean.getTypeCode() + getRunning(sBean.getSaveRunning());
        } else {
            newAccountNo = sBean.getTypeCode() + getRunning(sBean.getSaveRunning());
        }
        newBookNo = getBookNo(saveConfigControl.getMaxInt(docType));

        return new String[]{newAccountNo, newBookNo};
    }

    private void initLoad() {
        chkSave1.setSelected(false);
        chkSave2.setSelected(false);

        txtAccountCode.setText("");
        txtBookNo.setText("");
        txtSaveFee.setText("0.00");

        List<CbSaveConfigBean> listBean = saveConfigControl.listSaveConfig();
        cbAccType.removeAllItems();
        for (int i = 0; i < listBean.size(); i++) {
            CbSaveConfigBean bean = (CbSaveConfigBean) listBean.get(i);
            cbAccType.addItem(bean.getTypeCode() + " - " + bean.getTypeName());
        }
    }

    private void saveOpenSave() {
        if (cbAccType.getItemCount() == 0) {
            return;
        }

        double saveFeeAmt = NumberFormat.toDouble(txtSaveFee.getText());
        if (saveFeeAmt < 0) {
            txtSaveFee.requestFocus();
            return;
        }

        CbSaveAccountBean cbSaveAccountBean = new CbSaveAccountBean();
        String[] gen = generateAutoNo();
        cbSaveAccountBean.setAccount_code(gen[0]); // wait auto generate
        cbSaveAccountBean.setBook_no(gen[1]); // wait auto generate
        cbSaveAccountBean.setB_BALANCE(0);
        cbSaveAccountBean.setRemark("เปิดบัญชี");
        cbSaveAccountBean.setBook_evidence3("");
        cbSaveAccountBean.setBook_evidence4("");
        if (chkSave1.isSelected()) {
            cbSaveAccountBean.setBook_evidence1(chkSave1.getText());
        } else {
            cbSaveAccountBean.setBook_evidence1("");
        }
        if (chkSave2.isSelected()) {
            cbSaveAccountBean.setBook_evidence2(chkSave2.getText());
        } else {
            cbSaveAccountBean.setBook_evidence2("");
        }
        cbSaveAccountBean.setB_CUST_CODE(profileBean.getP_custCode());
        cbSaveAccountBean.setB_CUST_NAME(profileBean.getP_custName());
        cbSaveAccountBean.setB_CUST_LASTNAME(profileBean.getP_custSurname());
        cbSaveAccountBean.setB_INTEREST(0.00);
        cbSaveAccountBean.setHoon_balance(0);
        String accType = getIDCombobox(cbAccType);
        cbSaveAccountBean.setAccount_type(accType);
        cbSaveAccountBean.setB_FEE(NumberFormat.toDouble(txtSaveFee.getText()));
        cbSaveAccountBean.setBranch_Code(Value.BRANCH_CODE);
        cbSaveAccountBean.setEmp_Code(Value.USER_CODE);
        ProfileBean pBean = profileControl.findOneByCustCode(cbSaveAccountBean.getB_CUST_CODE());
        cbSaveAccountBean.setMEMBER_TYPE(pBean.getP_member_type());
        cbSaveAccountBean.setAccount_status("1");

        if (saveAccountControl.saveSaveAccount(cbSaveAccountBean)) {
            // save fee transaction            
            CbFeeBean feeBean = cbFeeControl.findOneByExpId("2");
            if (feeBean != null) {
                if (cbSaveAccountBean.getB_FEE() > 0) {
                    CbFeeTransactionBean feeTBean = new CbFeeTransactionBean();
                    feeTBean.setFee_amount(cbSaveAccountBean.getB_FEE());
                    feeTBean.setFee_branch(Value.BRANCH_CODE);
                    feeTBean.setFee_code(feeBean.getExp_id());
                    feeTBean.setFee_desc(feeBean.getExp_desc());
                    feeTBean.setFee_emp_code(Value.USER_CODE);
                    feeTBean.setFee_cust_code(profileBean.getP_custCode());

                    cbFeeTransactionControl.saveCbFeeTransaction(feeTBean);
                }
            }

            txtAccountCode.setText(cbSaveAccountBean.getAccount_code());
            txtBookNo.setText(cbSaveAccountBean.getBook_no());
            MessageAlert.infoPopup(this, "เปิดบัญชีเรียบร้อยแล้ว");

            btnSaveAccOpen.setEnabled(false);
            cbAccType.setEnabled(false);
            txtSaveFee.setEditable(false);
            btnPrintSliplOpenAcc.setEnabled(false);

            int iConfirm1 = MessageAlert.showConfirm(this, "ท่านต้องการดำเนินการพิมพ์หน้าปกสมุดหรือไม่ ?");
            if (iConfirm1 == MessageAlert.YES_OPTION) {
                //print หน้าปก
                printFrontBook(cbSaveAccountBean.getAccount_type(), cbSaveAccountBean.getBook_no());
            }
        }
    }

    private void printFrontBook(String accType, String bookNo) {
        //print หน้าปกสมุด
        PassBook_PSiPR9 view = new PassBook_PSiPR9();
        view.printFrontBook(txtAccountCode.getText(), profileBean.getP_custName(), bookNo, accType);
    }

}
