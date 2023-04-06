package th.co.cbank.project.view;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.apache.log4j.Logger;
import th.co.cbank.project.control.CbUserControl;
import th.co.cbank.util.DateFormat;
import th.co.cbank.project.control.Value;
import th.co.cbank.util.ReadText;
import th.co.cbank.util.ScrollText;
import th.co.cbank.project.control.PrintCOM;
import th.co.cbank.project.model.BranchBean;
import th.co.cbank.project.model.CbGroupBean;
import th.co.cbank.project.model.CbUserBean;
import th.co.cbank.util.MessageAlert;

public class LoginDialog extends BaseDialogSwing {

    private final Logger logger = Logger.getLogger(LoginDialog.class);
    private Frame parent;
    private SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);

    public LoginDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        logger.debug("LoginDialog init");

        this.parent = parent;
        String textNews = ReadText.readTextToString("news.txt").trim();
        ScrollText s = new ScrollText(textNews);
        jLabel5.add(s);
        txtUser.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtUser = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update 24/04/2018");
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/company.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setOpaque(false);

        txtUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserFocusGained(evt);
            }
        });
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
        });

        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLogin.setText("เข้าระบบ");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        btnLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLoginKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("รหัสผ่าน :");

        txtPass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassFocusGained(evt);
            }
        });
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("ผู้ใช้งาน :");

        btnExit.setBackground(new java.awt.Color(255, 51, 51));
        btnExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("เริ่มใช้โปรแกรม : 11/06/2015");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LOGO-CB-System(250).jpg"))); // NOI18N
        jLabel4.setToolTipText("แก้ไขค่าคอนฟิกระบบ");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("...");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtUser.getText().trim().equals("")) {
                txtUser.requestFocus();
                return;
            }
            txtPass.requestFocus();
            return;
        }
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            if (txtUser.getText().trim().equals("") && txtPass.getText().trim().equals("")) {
                exit();
            }
        }
    }//GEN-LAST:event_txtUserKeyPressed

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtPass.getText().equals("")) {
                btnLogin.requestFocus();
                return;
            }
            txtPass.requestFocus();
        }
    }//GEN-LAST:event_txtPassKeyPressed

    private void btnLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLoginKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnLoginActionPerformed(null);
        }
    }//GEN-LAST:event_btnLoginKeyPressed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if (txtUser.getText().equals("")) {
            txtUser.requestFocus();
            return;
        }
        if (txtPass.getText().equals("")) {
            txtPass.requestFocus();
            return;
        }
        login();
//        File f = new File("soc.bin");
//        if (f.exists()) {
//            if (GetMD5.getSOC().equals(GetMD5.getMacAddress())) {
//                login();
//            } else {
//                JOptionPane.showMessageDialog(this, "การลงทะเบียนใช้งานเครื่องไม่สมบูรณ์ กรุณาติดต่อผู้ดูและรบบ !!!");                    
//                new File("soc.bin").delete();
//                new File("cbanksystem.running").delete();
//                System.exit(0);
//            }
//        } else {
//            JOptionPane.showMessageDialog(this, "เครื่องยังไม่ได้ลงทะบียนใช้งาน กรุณาติดต่อผู้เดูแลระบบ !!!");
//            new File("cbanksystem.running").delete();
//            System.exit(0);
//        }

    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        exit();
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusGained
        txtUser.selectAll();
    }//GEN-LAST:event_txtUserFocusGained

    private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained
        txtPass.selectAll();
    }//GEN-LAST:event_txtPassFocusGained

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        FileConfigDialog fileConfigDialog = new FileConfigDialog(null, true);
        fileConfigDialog.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    private void login() {
        for (int i = 0; i < Value.ACCESS.length; i++) {
            Value.ACCESS[i] = "Y";
        }
        CbUserControl userControl = new CbUserControl();
        CbUserBean userBean = userControl.findOneByUserPass(txtUser.getText().trim(), txtPass.getText().trim());
        if (userBean == null) {
            MessageAlert.errorPopup(this, "รหัสผู้ใช้งานไม่ถูกต้อง หรือมีผู้ใช้งานอยู่แล้ว กรุณาตรวจสอบ !!!");
            logger.error("รหัสผู้ใช้งานไม่ถูกต้อง หรือมีผู้ใช้งานอยู่แล้ว กรุณาตรวจสอบ !!!");
            txtUser.setText("");
            txtUser.requestFocus();
            txtPass.setText("");

            Value.USER_CODE = "";
            Value.USER_NAME = "";
            return;
        }

        txtUser.setText("");
        txtPass.setText("");
        Value.USER_CODE = userBean.getUsername();
        Value.USER_NAME = userBean.getName();
        Value.USER_TIME = sdf.format(new Date());
        Value.USER_LAST_NAME = userBean.getLastname();

        BranchBean branchBean = getBranchControl().getData();
        Value.BRANCH_CODE = branchBean.getCode();

        getLoginControl().updateLogin(userBean.getUsername(), Value.USER_NAME, "Success", getTitle());

        CbGroupBean groupBean = userControl.findGroupPermissionByUser(userBean.getUsername());
        String[] per = groupBean.getPermission().split(",");
        System.arraycopy(per, 0, Value.ACCESS, 0, per.length);

        PrintCOM printCom = new PrintCOM();
        printCom.printLOG("Login by ... " + Value.USER_CODE + "   Start time: " + DateFormat.getLocale_ddMMyyyy(new Date()));

        // process total balance all account
        final SimpleDateFormat simp = new SimpleDateFormat("ddMMyyyy");
        if (!new File("process/process" + simp.format(new Date()) + ".txt").exists()) {
            btnLogin.setEnabled(false);
            btnExit.setEnabled(false);

            // จะไม่มีการประมวลผลแล้ว เพราะทำให้ยอดเพี้ยน remark: 04/04/2023
//            final CbSaveAccountControl saveAccountControl = new CbSaveAccountControl();
//            final LoadingDialog loading = new LoadingDialog(null, true, "ระบบจะทำการประมวลผล ข้อมูลสมาชิกทั้งหมด กรุณารอสักครู่", "...ข้อมูลจะถูกประมวลผล วันละ 1 ครั้งเท่านั้น");
//
//            SwingWorker<String, Void> worker = new SwingWorker<String, Void>() {
//                @Override
//                protected String doInBackground() throws Exception {
//                    int resultUpdate = saveAccountControl.updateSummaryBalanceFromTransaction();
//                    logger.info("Update " + resultUpdate + " records");
//                    return "done";
//                }
//
//                @Override
//                protected void done() {
//                    loading.dispose();
//                }
//            };
//            worker.execute();
//            loading.setVisible(true);
            try {
                new File("process").mkdir();
                new File("process/process" + simp.format(new Date()) + ".txt").createNewFile();
            } catch (IOException e) {
            }
        }

        dispose();
        parent.setVisible(true);
    }

    private void exit() {
        new File("cbanksystem.running").delete();
        System.exit(0);
    }
}
