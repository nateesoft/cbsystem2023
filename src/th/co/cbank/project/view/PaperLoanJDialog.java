package th.co.cbank.project.view;

import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import th.co.cbank.project.constants.AppConstants;
import th.co.cbank.project.control.ViewReport;
import th.co.cbank.util.DateFormat;
import th.co.cbank.util.MoneyToWord;
import th.co.cbank.util.NumberFormat;
import th.co.cbank.project.model.AddressBean;
import th.co.cbank.project.model.BranchBean;
import th.co.cbank.project.model.CbBondsmanBean;
import th.co.cbank.project.model.CbLoanAccountBean;
import th.co.cbank.project.model.CbLoanConfigBean;
import th.co.cbank.project.model.ProfileBean;
import th.co.cbank.util.MessageAlert;

public class PaperLoanJDialog extends BaseDialogSwing {

    private final Logger logger = Logger.getLogger(PaperLoanJDialog.class);
    private final String loanAccountCode;
    private CbLoanAccountBean loanAccountBean;
    private final ViewReport viewReport = new ViewReport();

    public PaperLoanJDialog(java.awt.Frame parent, boolean modal, String loanAccountCode) {
        super(parent, modal);
        initComponents();
        logger.debug("PaperLoanJDialog init");

        this.loanAccountCode = loanAccountCode;
        initLoad();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("พิมพ์สัญญา");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("พิมพ์สัญญาผู้ค้ำประกันแผ่นที่ 2");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("พิมพ์สัญญาผู้ค้ำประกันแผ่นที่ 1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("พิมพ์สัญญาการกู้ยืมเงิน");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        print1();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        print2();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        print3();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
        }
    }//GEN-LAST:event_jButton1KeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void print1() {
        Map params = new HashMap();
        BranchBean bBean = getBranchControl().getData();
        for (int i = 1; i <= 38; i++) {
            params.put("p" + i, "");
        }

        params.put("p1", bBean.getName());
        params.put("p2", "สัญญากู้เงิน");
        params.put("p3", bBean.getName());
        SimpleDateFormat simp = new SimpleDateFormat("dd MMMM yyyy");
        if (loanAccountBean == null) {
            MessageAlert.warningPopup(this, "ไม่พบข้อมูลผู้กู้ในระบบ ไม่สามารถออกเอกสารได้ กรุณาตรวจสอบ");
            return;
        }

        params.put("p4", simp.format(loanAccountBean.getLoan_docdate()));
        params.put("p5", loanAccountBean.getLoan_docno());

        ProfileBean profileBean = getProfileControl().findOneByCustCode(loanAccountBean.getCust_code());
        AddressBean addressBean = getAddressControl().getOne(profileBean.getP_custCode(), "1");

        params.put("p6", profileBean.getP_custName() + " " + profileBean.getP_custSurname());
        params.put("p7", "" + profileBean.getP_custAge());
        params.put("p8", addressBean.getAddr_No());
        params.put("p9", addressBean.getAddr_Moo());
        params.put("p10", addressBean.getAddr_Soi());
        params.put("p11", addressBean.getAddr_Road());
        params.put("p12", addressBean.getAddr_Tambon());
        params.put("p13", addressBean.getAddr_Aumphur());
        params.put("p14", addressBean.getAddr_Province());
        params.put("p15", addressBean.getAddr_Post());
        params.put("p16", addressBean.getAddr_Tel());
        params.put("p17", addressBean.getCust_Code());
        params.put("p18", DateFormat.getLocale_ddMMyyyy(profileBean.getP_member_end()));
        params.put("p19", DateFormat.getLocale_ddMMyyyy(profileBean.getCard_Expire()));
        params.put("p20", bBean.getName());
        params.put("p21", "-");

        CbLoanConfigBean cBean = getLoanConfigControl().findOneByLoanCode(loanAccountBean.getLoan_type());
        params.put("p22", cBean.getLoanName());
        params.put("p23", NumberFormat.showDouble2(loanAccountBean.getLoan_amount()));
        BigDecimal bg = new BigDecimal(loanAccountBean.getLoan_amount());
        params.put("p24", "(" + MoneyToWord.getBahtText(bg) + ")");
        params.put("p25", "");
        params.put("p26", NumberFormat.showDouble2(loanAccountBean.getLoan_interest()));
        params.put("p27", "" + loanAccountBean.getPeriod_pay());
        params.put("p28", NumberFormat.showDouble2(loanAccountBean.getPayPerAmount()));
        params.put("p29", "" + loanAccountBean.getPeriod_pay());
        SimpleDateFormat s1 = new SimpleDateFormat("dd/MMMM/yyyy");
        String[] dateStart = s1.format(loanAccountBean.getLoan_start_date()).split("/");
        params.put("p30", dateStart[0]);
        params.put("p31", dateStart[1]);
        params.put("p32", dateStart[2]);
        SimpleDateFormat s2 = new SimpleDateFormat("dd/MMMM/yyyy");
        String[] dateEnd = s2.format(loanAccountBean.getLoan_end_date()).split("/");
        params.put("p33", dateEnd[0]);
        params.put("p34", dateEnd[1]);
        params.put("p35", dateEnd[2]);
        params.put("p36", "" + cBean.getLoanPenaltyDay());
        params.put("p37", NumberFormat.showDouble2(cBean.getLoanPenaltyINT() / 12));
        params.put("p38", profileBean.getP_custName() + " " + profileBean.getP_custSurname());

        String titleReport = "สัญญากู้เงิน";
        viewReport.printReport(titleReport, AppConstants.JASPER_LOAN_PAPER_REPORT, params);
    }

    private void print2() {
        Map params = new HashMap();
        BranchBean branchBean = getBranchControl().getData();
        for (int i = 1; i <= 41; i++) {
            params.put("p" + i, "");
        }

        params.put("p1", branchBean.getName());
        params.put("p2", loanAccountCode);
        params.put("p3", branchBean.getName());

        SimpleDateFormat simp = new SimpleDateFormat("dd MMMM yyyy");
        params.put("p4", simp.format(loanAccountBean.getLoan_docdate()));

        List<CbBondsmanBean> listBondsman = getCbBondsmanControl().listCbBondsman(loanAccountCode);
        ProfileBean profileBean = getProfileControl().findOneByCustCode(loanAccountBean.getCust_code());
        if (listBondsman.size() > 0) {
            CbBondsmanBean bondsmanBean = (CbBondsmanBean) listBondsman.get(0);
            ProfileBean pBean1 = getProfileControl().findOneByCustCode(bondsmanBean.getIdcard());
            params.put("p5", pBean1.getP_custName() + " " + pBean1.getP_custSurname());
            params.put("p6", "" + pBean1.getP_custAge());
            params.put("p7", "" + pBean1.getP_custNation());
            AddressBean bean1 = getAddressControl().getOne(pBean1.getP_custCode(), "1");
            params.put("p8", "" + bean1.getAddr_No());
            params.put("p9", "" + bean1.getAddr_Moo());
            params.put("p10", "" + bean1.getAddr_Soi());
            params.put("p11", "" + bean1.getAddr_Road());
            params.put("p12", "" + bean1.getAddr_Tambon());
            params.put("p13", "" + bean1.getAddr_Aumphur());
            params.put("p14", "" + bean1.getAddr_Province());
            params.put("p15", "" + bean1.getAddr_Post());
            params.put("p16", "" + bean1.getAddr_Tel());
            params.put("p17", "" + pBean1.getP_custCode());
            params.put("p18", "" + DateFormat.getLocale_ddMMyyyy(pBean1.getCard_Expire()));

            if (listBondsman.size() > 1) {
                CbBondsmanBean bondsmanBean2 = (CbBondsmanBean) listBondsman.get(1);
                ProfileBean pBean2 = getProfileControl().findOneByCustCode(bondsmanBean2.getIdcard());
                params.put("p19", pBean2.getP_custName() + " " + pBean2.getP_custSurname());
                params.put("p20", "" + pBean2.getP_custAge());
                params.put("p21", "" + pBean2.getP_custNation());
                AddressBean bean2 = getAddressControl().getOne(pBean2.getP_custCode(), "1");
                params.put("p22", "" + bean2.getAddr_No());
                params.put("p23", "" + bean2.getAddr_Moo());
                params.put("p24", "" + bean2.getAddr_Soi());
                params.put("p25", "" + bean2.getAddr_Road());
                params.put("p26", "" + bean2.getAddr_Tambon());
                params.put("p27", "" + bean2.getAddr_Aumphur());
                params.put("p28", "" + bean2.getAddr_Province());
                params.put("p29", "" + bean2.getAddr_Post());
                params.put("p30", "" + bean2.getAddr_Tel());
                params.put("p31", "" + pBean2.getP_custCode());
                params.put("p32", "" + DateFormat.getLocale_ddMMyyyy(pBean2.getCard_Expire()));
                params.put("p33", profileBean.getP_custName() + " " + profileBean.getP_custSurname());
                params.put("p37", profileBean.getP_custName() + " " + profileBean.getP_custSurname());
                params.put("p34", profileBean.getP_custCode());
                params.put("p38", NumberFormat.showDouble2(loanAccountBean.getLoan_amount()));
                MoneyToWord moneyToWord = new MoneyToWord(loanAccountBean.getLoan_amount());
                params.put("p39", "(" + moneyToWord.toString() + ")");
                params.put("p40", loanAccountBean.getLoan_docno());
                params.put("p41", DateFormat.getLocale_ddMMyyyy(loanAccountBean.getLoan_docdate()));
                params.put("p35", pBean1.getP_custName() + " " + pBean1.getP_custSurname());
                params.put("p36", pBean2.getP_custName() + " " + pBean2.getP_custSurname());
            }
        }

        String title = "สัญญาค้ำประกันการกู้ยืมเงิน ฉบับที่ 1";
        viewReport.printReport(title, AppConstants.JASPER_LOAN_PAPER_GARUNTEE_REPORT, params);
    }

    private void print3() {
        Map params = new HashMap();
        params.put("p42", "");

        String title = "สัญญาค้ำประกันการกู้ยืมเงิน ฉบับที่ 2";
        viewReport.printReport(title, AppConstants.JASPER_LOAN_PAPER_GARUNTEE_REPORT_2, params);
    }

    private void initLoad() {
        loanAccountBean = getLoanAccountControl().findOneByLoanDocNo(loanAccountCode);
    }
}
