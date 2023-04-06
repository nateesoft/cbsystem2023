package th.co.cbank.project.view;

import java.util.List;
import org.apache.log4j.Logger;
import th.co.cbank.project.model.CbLoanAccountBean;
import th.co.cbank.project.model.CbSaveAccountBean;

public class ListMenuDialog extends BaseDialogSwing {

    private final Logger logger = Logger.getLogger(ListMenuDialog.class);
    private String accountCode = null;
    private int selectChoice = 0;

    private CbSaveAccountBean saveAccountBean;
    private CbLoanAccountBean loanAccountBean;
    private List<CbSaveAccountBean> listSaveAccounts;
    private List<CbLoanAccountBean> listLoanAccounts;
    private String selectAccountType;

    public ListMenuDialog(java.awt.Frame parent, boolean modal,
            CbSaveAccountBean saveAccountBean, CbLoanAccountBean loanAccountBean, List<CbSaveAccountBean> listSaveAccounts, List<CbLoanAccountBean> listLoanAccounts, String selectAccountType) {
        super(parent, modal);
        initComponents();
        logger.debug("ListMenuDialog init");

        this.saveAccountBean = saveAccountBean;
        this.loanAccountBean = loanAccountBean;
        this.listSaveAccounts = listSaveAccounts;
        this.listLoanAccounts = listLoanAccounts;
        this.selectAccountType = selectAccountType;

        if (saveAccountBean != null) {
            accountCode = saveAccountBean.getAccount_code();
        }
        if (loanAccountBean != null) {
            accountCode = loanAccountBean.getLoan_docno();
        }
        if (selectAccountType.equals("deposit")) {//เงินฝาก
            btnOpenAcc.setEnabled(false);
            btnOpenLoan.setEnabled(false);
            btnPaymentLoan.setEnabled(false);
        }
        if (selectAccountType.equals("loan")) {//เงินกู้
            btnOpenAcc.setEnabled(false);
            btnDeposit.setEnabled(false);
            btnWithdraw.setEnabled(false);
            btnBuyHoon.setEnabled(false);
            btnSaleHoon.setEnabled(false);
            btnTransferHoon.setEnabled(false);
            btnOpenLoan.setEnabled(false);
        }

        if (saveAccountBean == null) {
            btnBuyHoon.setEnabled(false);
            btnSaleHoon.setEnabled(false);
            btnTransferHoon.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnOpenAcc = new javax.swing.JButton();
        btnDeposit = new javax.swing.JButton();
        btnTransferHoon = new javax.swing.JButton();
        btnBuyHoon = new javax.swing.JButton();
        btnSaleHoon = new javax.swing.JButton();
        btnPaymentLoan1 = new javax.swing.JButton();
        btnPaymentLoan = new javax.swing.JButton();
        btnOpenLoan = new javax.swing.JButton();
        btnWithdraw = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("แสดงรายการเมนูทั้งหมด");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        btnOpenAcc.setBackground(new java.awt.Color(204, 255, 204));
        btnOpenAcc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnOpenAcc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/open_book.png"))); // NOI18N
        btnOpenAcc.setText("1. เปิดบัญชีเงินฝาก");
        btnOpenAcc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOpenAcc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOpenAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenAccActionPerformed(evt);
            }
        });

        btnDeposit.setBackground(new java.awt.Color(204, 255, 204));
        btnDeposit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDeposit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/deposit.png"))); // NOI18N
        btnDeposit.setText("2. ฝากเงิน");
        btnDeposit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDeposit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositActionPerformed(evt);
            }
        });

        btnTransferHoon.setBackground(new java.awt.Color(204, 255, 204));
        btnTransferHoon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTransferHoon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transfer_hoon.png"))); // NOI18N
        btnTransferHoon.setText("7. โอนหุ้น");
        btnTransferHoon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTransferHoon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTransferHoon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferHoonActionPerformed(evt);
            }
        });

        btnBuyHoon.setBackground(new java.awt.Color(204, 255, 204));
        btnBuyHoon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuyHoon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buy_hoon.png"))); // NOI18N
        btnBuyHoon.setText("5. ซื้อหุ้น");
        btnBuyHoon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuyHoon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuyHoon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyHoonActionPerformed(evt);
            }
        });

        btnSaleHoon.setBackground(new java.awt.Color(204, 255, 204));
        btnSaleHoon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSaleHoon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sale_hoon.png"))); // NOI18N
        btnSaleHoon.setText("6. ขายหุ้น");
        btnSaleHoon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSaleHoon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSaleHoon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaleHoonActionPerformed(evt);
            }
        });

        btnPaymentLoan1.setBackground(new java.awt.Color(255, 51, 0));
        btnPaymentLoan1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPaymentLoan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Close_Box_Red.png"))); // NOI18N
        btnPaymentLoan1.setText("ปิดหน้าต่าง");
        btnPaymentLoan1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPaymentLoan1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPaymentLoan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentLoan1ActionPerformed(evt);
            }
        });

        btnPaymentLoan.setBackground(new java.awt.Color(204, 255, 204));
        btnPaymentLoan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPaymentLoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/payment.png"))); // NOI18N
        btnPaymentLoan.setText("9. รับชำระเงินกู้");
        btnPaymentLoan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPaymentLoan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPaymentLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentLoanActionPerformed(evt);
            }
        });

        btnOpenLoan.setBackground(new java.awt.Color(204, 255, 204));
        btnOpenLoan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnOpenLoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/open_loan.png"))); // NOI18N
        btnOpenLoan.setText("8. เปิดบัญชีเงินกู้");
        btnOpenLoan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOpenLoan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOpenLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenLoanActionPerformed(evt);
            }
        });

        btnWithdraw.setBackground(new java.awt.Color(204, 255, 204));
        btnWithdraw.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnWithdraw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/withdraw.png"))); // NOI18N
        btnWithdraw.setText("3. ถอนเงิน");
        btnWithdraw.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnWithdraw.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdrawActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnBuyHoon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOpenAcc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSaleHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnOpenLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPaymentLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTransferHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPaymentLoan1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOpenAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btnBuyHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSaleHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTransferHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOpenLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPaymentLoan1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPaymentLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTransferHoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferHoonActionPerformed
        setSelectChoice(7);
        dispose();
    }//GEN-LAST:event_btnTransferHoonActionPerformed

    private void btnSaleHoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaleHoonActionPerformed
        setSelectChoice(6);
        dispose();
    }//GEN-LAST:event_btnSaleHoonActionPerformed

    private void btnBuyHoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyHoonActionPerformed
        setSelectChoice(5);
        dispose();
    }//GEN-LAST:event_btnBuyHoonActionPerformed

    private void btnWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawActionPerformed
        if (accountCode == null) {
            SelectAccountDialog selectAccountDialog = new SelectAccountDialog(null, true, "deposit", listSaveAccounts, listLoanAccounts);
            selectAccountDialog.setVisible(true);
            if (!selectAccountDialog.getAccontCode().equals("")) {
                accountCode = selectAccountDialog.getAccontCode();
                setSelectChoice(3);
            } else {
                accountCode = null;
            }
        } else {
            setSelectChoice(3);
        }
        dispose();
    }//GEN-LAST:event_btnWithdrawActionPerformed

    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositActionPerformed
        if (accountCode == null) {
            SelectAccountDialog selectAccountDialog = new SelectAccountDialog(null, true, "deposit", listSaveAccounts, listLoanAccounts);
            selectAccountDialog.setVisible(true);
            if (!selectAccountDialog.getAccontCode().equals("")) {
                accountCode = selectAccountDialog.getAccontCode();
                setSelectChoice(2);
            } else {
                accountCode = null;
            }
        } else {
            setSelectChoice(2);
        }

        dispose();
    }//GEN-LAST:event_btnDepositActionPerformed

    private void btnOpenAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenAccActionPerformed
        setSelectChoice(1);
        dispose();
    }//GEN-LAST:event_btnOpenAccActionPerformed

    private void btnPaymentLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentLoanActionPerformed
        if (accountCode == null) {
            SelectAccountDialog selectAccountDialog = new SelectAccountDialog(null, true, "loan", listSaveAccounts, listLoanAccounts);
            selectAccountDialog.setVisible(true);
            if (!selectAccountDialog.getAccontCode().equals("")) {
                accountCode = selectAccountDialog.getAccontCode();
                setSelectChoice(9);
            } else {
                accountCode = null;
            }
        } else {
            setSelectChoice(9);
        }

        dispose();
    }//GEN-LAST:event_btnPaymentLoanActionPerformed

    private void btnOpenLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenLoanActionPerformed
        setSelectChoice(8);
        dispose();
    }//GEN-LAST:event_btnOpenLoanActionPerformed

    private void btnPaymentLoan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentLoan1ActionPerformed
        accountCode = null;
        dispose();
    }//GEN-LAST:event_btnPaymentLoan1ActionPerformed

    public int getSelectChoice() {
        return selectChoice;
    }

    public void setSelectChoice(int selectChoice) {
        this.selectChoice = selectChoice;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuyHoon;
    private javax.swing.JButton btnDeposit;
    private javax.swing.JButton btnOpenAcc;
    private javax.swing.JButton btnOpenLoan;
    private javax.swing.JButton btnPaymentLoan;
    private javax.swing.JButton btnPaymentLoan1;
    private javax.swing.JButton btnSaleHoon;
    private javax.swing.JButton btnTransferHoon;
    private javax.swing.JButton btnWithdraw;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
