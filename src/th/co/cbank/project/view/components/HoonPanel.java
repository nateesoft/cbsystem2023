package th.co.cbank.project.view.components;

import java.awt.HeadlessException;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;
import th.co.cbank.project.constants.AppConstants;
import th.co.cbank.project.control.BranchControl;
import th.co.cbank.project.control.CbHoonConfigControl;
import th.co.cbank.project.control.CbSaveAccountControl;
import th.co.cbank.project.control.CbTransactionSaveControl;
import th.co.cbank.project.control.ConfigControl;
import th.co.cbank.project.control.ProfileControl;
import th.co.cbank.project.control.SaveSummaryControl;
import th.co.cbank.project.control.Value;
import th.co.cbank.project.control.ViewReport;
import th.co.cbank.project.model.BranchBean;
import th.co.cbank.project.model.CbHoonConfigBean;
import th.co.cbank.project.model.CbSaveAccountBean;
import th.co.cbank.project.model.CbTransactionSaveBean;
import th.co.cbank.project.model.ConfigBean;
import th.co.cbank.project.model.ProfileBean;
import th.co.cbank.project.model.SaveSummaryBean;
import th.co.cbank.project.view.ListCustomerDialog;
import th.co.cbank.util.DateChooseDialog;
import th.co.cbank.util.DateFormat;
import th.co.cbank.util.NumberFormat;
import th.co.cbank.util.NumberUtil;
import th.co.cbank.util.ThaiUtil;

public class HoonPanel extends javax.swing.JPanel {
    private final Logger logger = Logger.getLogger(HoonPanel.class);
    private ProfileBean profileBean;
    private CbSaveAccountBean saveAccountBean;
    private final BranchControl branchControl = new BranchControl();
    private final ProfileControl profileControl = new ProfileControl();
    private final ConfigControl configControl = new ConfigControl();
    private final CbHoonConfigControl hoonConfigControl = new CbHoonConfigControl();
    private final SaveSummaryControl saveSummaryControl = new SaveSummaryControl();
    private final CbTransactionSaveControl cbTransactionSaveControl = new CbTransactionSaveControl();
    private final CbSaveAccountControl saveAccountControl = new CbSaveAccountControl();

    public HoonPanel(ProfileBean profileBean, CbSaveAccountBean saveAccountBean, int selectIndex) {
        initComponents();

        jTabbedPane5.setEnabledAt(0, false);
        jTabbedPane5.setEnabledAt(1, false);
        jTabbedPane5.setEnabledAt(2, false);
        jTabbedPane5.setSelectedIndex(selectIndex);
        jTabbedPane5.setEnabledAt(selectIndex, true);

        this.profileBean = profileBean;
        this.saveAccountBean = saveAccountBean;

        initLoad();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jLayeredPane6 = new javax.swing.JLayeredPane();
        jPanel9 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txtHoonAmt = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtDocNo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtValueBaht = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        txtCashPay = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        btnSaveByHoon = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        cbHoonType = new javax.swing.JComboBox();
        jLabel34 = new javax.swing.JLabel();
        txtHoonTon = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtHoonQTY = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        lblBuyHoonTitle = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jLayeredPane7 = new javax.swing.JLayeredPane();
        jPanel21 = new javax.swing.JPanel();
        jLabel132 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        txtTotalSellHoonAmount = new javax.swing.JTextField();
        jLabel126 = new javax.swing.JLabel();
        txtTotalAmount = new javax.swing.JTextField();
        jLabel131 = new javax.swing.JLabel();
        txtDateSell = new javax.swing.JTextField();
        jLabel130 = new javax.swing.JLabel();
        txtPriceValue = new javax.swing.JTextField();
        jLabel125 = new javax.swing.JLabel();
        btnChooseDateSellHoon = new javax.swing.JButton();
        chkSelectAllSellHoon = new javax.swing.JCheckBox();
        jLabel52 = new javax.swing.JLabel();
        txtDocNoSellHoon = new javax.swing.JTextField();
        jLabel133 = new javax.swing.JLabel();
        txtHoonBalance = new javax.swing.JTextField();
        jLabel134 = new javax.swing.JLabel();
        btnSellHoon = new javax.swing.JButton();
        jPanel48 = new javax.swing.JPanel();
        lblSellHoonTitle = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        txtTotaTransferHoonAmt = new javax.swing.JTextField();
        txtDateTransfer = new javax.swing.JTextField();
        jLabel147 = new javax.swing.JLabel();
        txtTransferPerson = new javax.swing.JTextField();
        jLabel152 = new javax.swing.JLabel();
        btnChooseDateTransfer = new javax.swing.JButton();
        jLabel153 = new javax.swing.JLabel();
        txtDocnoTransfer = new javax.swing.JTextField();
        btnFindPersonToTransfer = new javax.swing.JButton();
        jLabel154 = new javax.swing.JLabel();
        txtTransferAppCode = new javax.swing.JPasswordField();
        jLabel148 = new javax.swing.JLabel();
        txtTotalHoonBalance = new javax.swing.JTextField();
        jLabel140 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        cbAccoutListTransfer = new javax.swing.JComboBox<>();
        btnTransferHoon = new javax.swing.JButton();
        jLabel185 = new javax.swing.JLabel();
        txtProfileCode2 = new javax.swing.JTextField();
        jLabel189 = new javax.swing.JLabel();
        txtAccCode2 = new javax.swing.JTextField();
        jPanel49 = new javax.swing.JPanel();
        lblTransferHoonTitle = new javax.swing.JLabel();
        jPanel59 = new javax.swing.JPanel();
        jPanel63 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jPanel64 = new javax.swing.JPanel();
        jLabel171 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jLabel180 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        jTextField29 = new javax.swing.JTextField();
        jLabel195 = new javax.swing.JLabel();
        jLabel199 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();
        jLabel200 = new javax.swing.JLabel();
        jLabel203 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTabbedPane5.setRequestFocusEnabled(false);
        jTabbedPane5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane5MouseClicked(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel9.setOpaque(false);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("จำนวนเงินรวม");

        txtHoonAmt.setEditable(false);
        txtHoonAmt.setBackground(new java.awt.Color(255, 255, 204));
        txtHoonAmt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtHoonAmt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtHoonAmt.setText("0");
        txtHoonAmt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("บาท");

        txtDocNo.setEditable(false);
        txtDocNo.setBackground(new java.awt.Color(255, 255, 204));
        txtDocNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDocNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDocNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("หุ้นคงเหลือ");

        txtAmount.setEditable(false);
        txtAmount.setBackground(new java.awt.Color(255, 255, 204));
        txtAmount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtAmount.setText("0.00");
        txtAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setText("เลขที่เอกสาร");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("หุ้น");

        txtValueBaht.setEditable(false);
        txtValueBaht.setBackground(new java.awt.Color(255, 255, 204));
        txtValueBaht.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtValueBaht.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtValueBaht.setText("0.00");
        txtValueBaht.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("บาท/หุ้น");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("ราคาหุ้น");

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtCashPay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCashPay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCashPay.setText("0.00");
        txtCashPay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtCashPay.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCashPayFocusGained(evt);
            }
        });
        txtCashPay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCashPayKeyPressed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("บาท");

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("ชำระเงินสด");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCashPay, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(txtCashPay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSaveByHoon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSaveByHoon.setText("บันทึกข้อมูล");
        btnSaveByHoon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveByHoonActionPerformed(evt);
            }
        });
        btnSaveByHoon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSaveByHoonKeyPressed(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel53.setText("ประเภทหุ้น");

        cbHoonType.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbHoonType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbHoonTypeItemStateChanged(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel34.setText("เงินทอน");

        txtHoonTon.setEditable(false);
        txtHoonTon.setBackground(new java.awt.Color(255, 255, 204));
        txtHoonTon.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtHoonTon.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtHoonTon.setText("0.00");
        txtHoonTon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel51.setText("บาท");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("จำนวนหุ้นที่ซื้อ");

        txtHoonQTY.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtHoonQTY.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtHoonQTY.setText("0");
        txtHoonQTY.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtHoonQTY.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHoonQTYFocusGained(evt);
            }
        });
        txtHoonQTY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHoonQTYKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHoonQTYKeyReleased(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("หุ้น");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel34)
                        .addGap(12, 12, 12)
                        .addComponent(txtHoonTon, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel51))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                            .addComponent(txtValueBaht, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                            .addComponent(txtDocNo, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                            .addComponent(txtHoonAmt)
                                            .addComponent(txtHoonQTY))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel21)
                                            .addComponent(jLabel23))
                                        .addGap(84, 84, 84))
                                    .addComponent(cbHoonType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(btnSaveByHoon))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel25)
                    .addComponent(txtDocNo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbHoonType, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoonAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoonQTY, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel18)
                    .addComponent(txtValueBaht, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel20)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoonTon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSaveByHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel47.setBackground(new java.awt.Color(255, 255, 204));
        jPanel47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lblBuyHoonTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblBuyHoonTitle.setText("ซื้อหุ้น");

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBuyHoonTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBuyHoonTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane6.setLayer(jPanel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(jPanel47, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane6Layout = new javax.swing.GroupLayout(jLayeredPane6);
        jLayeredPane6.setLayout(jLayeredPane6Layout);
        jLayeredPane6Layout.setHorizontalGroup(
            jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jLayeredPane6Layout.setVerticalGroup(
            jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane6Layout.createSequentialGroup()
                .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane6)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane6)
        );

        jTabbedPane5.addTab("ซื้อหุ้น", jPanel10);

        jPanel39.setBackground(new java.awt.Color(255, 255, 255));

        jPanel21.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel21.setOpaque(false);

        jLabel132.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel132.setText("บาท");

        jLabel129.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel129.setText("หุ้น");

        jLabel127.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel127.setText("วันที่ขาย");

        txtTotalSellHoonAmount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotalSellHoonAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalSellHoonAmount.setText("0");
        txtTotalSellHoonAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtTotalSellHoonAmount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTotalSellHoonAmountFocusGained(evt);
            }
        });
        txtTotalSellHoonAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTotalSellHoonAmountKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTotalSellHoonAmountKeyReleased(evt);
            }
        });

        jLabel126.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel126.setText("บาท/หุ้น");

        txtTotalAmount.setEditable(false);
        txtTotalAmount.setBackground(new java.awt.Color(255, 255, 204));
        txtTotalAmount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTotalAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalAmount.setText("0.00");
        txtTotalAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel131.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel131.setText("จำนวนเงิน");

        txtDateSell.setEditable(false);
        txtDateSell.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtDateSell.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDateSell.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel130.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel130.setText("จำนวนหุ้นคงเหลือ");

        txtPriceValue.setEditable(false);
        txtPriceValue.setBackground(new java.awt.Color(255, 255, 204));
        txtPriceValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPriceValue.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPriceValue.setText("0.00");
        txtPriceValue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel125.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel125.setText("ราคาขาย");

        btnChooseDateSellHoon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnChooseDateSellHoon.setText("...");
        btnChooseDateSellHoon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseDateSellHoonActionPerformed(evt);
            }
        });

        chkSelectAllSellHoon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkSelectAllSellHoon.setText("ขายหุ้นทั้งหมด");
        chkSelectAllSellHoon.setOpaque(false);
        chkSelectAllSellHoon.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkSelectAllSellHoonItemStateChanged(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel52.setText("เลขที่เอกสาร");

        txtDocNoSellHoon.setEditable(false);
        txtDocNoSellHoon.setBackground(new java.awt.Color(255, 255, 204));
        txtDocNoSellHoon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDocNoSellHoon.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDocNoSellHoon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel133.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel133.setText("จำนวนหุ้นที่ขาย");

        txtHoonBalance.setBackground(new java.awt.Color(255, 255, 204));
        txtHoonBalance.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtHoonBalance.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtHoonBalance.setText("0");
        txtHoonBalance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtHoonBalance.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHoonBalanceFocusGained(evt);
            }
        });
        txtHoonBalance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHoonBalanceKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHoonBalanceKeyReleased(evt);
            }
        });

        jLabel134.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel134.setText("หุ้น");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel127, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel130, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel125, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel131, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel133, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPriceValue, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalSellHoonAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDateSell, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDocNoSellHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoonBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnChooseDateSellHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel126)
                    .addComponent(jLabel132)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel129)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkSelectAllSellHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel134))
                .addGap(12, 12, 12))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel52)
                    .addComponent(txtDocNoSellHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel127)
                    .addComponent(txtDateSell, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChooseDateSellHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel130)
                    .addComponent(txtHoonBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel134))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel133)
                    .addComponent(txtTotalSellHoonAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel129)
                    .addComponent(chkSelectAllSellHoon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel125)
                    .addComponent(txtPriceValue, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel126))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel131)
                    .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel132))
                .addContainerGap())
        );

        btnSellHoon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSellHoon.setText("บันทึกข้อมูล");
        btnSellHoon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSellHoonActionPerformed(evt);
            }
        });
        btnSellHoon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSellHoonKeyPressed(evt);
            }
        });

        jPanel48.setBackground(new java.awt.Color(255, 204, 204));
        jPanel48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lblSellHoonTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblSellHoonTitle.setText("ขายหุ้น");

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSellHoonTitle)
                .addContainerGap(472, Short.MAX_VALUE))
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSellHoonTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane7.setLayer(jPanel21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(btnSellHoon, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(jPanel48, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane7Layout = new javax.swing.GroupLayout(jLayeredPane7);
        jLayeredPane7.setLayout(jLayeredPane7Layout);
        jLayeredPane7Layout.setHorizontalGroup(
            jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSellHoon))
                .addContainerGap())
            .addComponent(jPanel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jLayeredPane7Layout.setVerticalGroup(
            jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSellHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(292, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane7)
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane7)
        );

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane5.addTab("ขายหุ้น", jPanel36);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel138.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel138.setText("หุ้น");

        jLabel139.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel139.setText("วันที่โอนหุ้น");

        txtTotaTransferHoonAmt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotaTransferHoonAmt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotaTransferHoonAmt.setText("0");
        txtTotaTransferHoonAmt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtTotaTransferHoonAmt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTotaTransferHoonAmtFocusGained(evt);
            }
        });
        txtTotaTransferHoonAmt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTotaTransferHoonAmtKeyPressed(evt);
            }
        });

        txtDateTransfer.setEditable(false);
        txtDateTransfer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtDateTransfer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDateTransfer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel147.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel147.setText("จำนวนหุ้นที่โอน");

        txtTransferPerson.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTransferPerson.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTransferPerson.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtTransferPerson.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTransferPersonKeyPressed(evt);
            }
        });

        jLabel152.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel152.setText("โอนให้กับ");

        btnChooseDateTransfer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnChooseDateTransfer.setText("...");
        btnChooseDateTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseDateTransferActionPerformed(evt);
            }
        });

        jLabel153.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel153.setText("เลขที่เอกสาร");

        txtDocnoTransfer.setEditable(false);
        txtDocnoTransfer.setBackground(new java.awt.Color(255, 255, 204));
        txtDocnoTransfer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDocnoTransfer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDocnoTransfer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        btnFindPersonToTransfer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnFindPersonToTransfer.setText("ค้นหา");
        btnFindPersonToTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindPersonToTransferActionPerformed(evt);
            }
        });

        jLabel154.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel154.setText("รหัสอนุมัติ");

        txtTransferAppCode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTransferAppCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTransferAppCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel148.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel148.setText("จำนวนหุ้นคงเหลือ");

        txtTotalHoonBalance.setEditable(false);
        txtTotalHoonBalance.setBackground(new java.awt.Color(255, 255, 204));
        txtTotalHoonBalance.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotalHoonBalance.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalHoonBalance.setText("0");
        txtTotalHoonBalance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtTotalHoonBalance.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTotalHoonBalanceFocusGained(evt);
            }
        });
        txtTotalHoonBalance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTotalHoonBalanceKeyPressed(evt);
            }
        });

        jLabel140.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel140.setText("หุ้น");

        jLabel155.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel155.setText("โอนเข้าบัญชี");

        cbAccoutListTransfer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel147, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel152, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel154, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel155, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel30Layout.createSequentialGroup()
                                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTransferPerson)
                                    .addComponent(txtTotaTransferHoonAmt, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(txtTransferAppCode))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnFindPersonToTransfer)
                                    .addComponent(jLabel140)))
                            .addComponent(cbAccoutListTransfer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel139, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel153, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel148, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTotalHoonBalance, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(txtDocnoTransfer)
                            .addComponent(txtDateTransfer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnChooseDateTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel138))))
                .addGap(133, 133, 133))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel153)
                    .addComponent(txtDocnoTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel139)
                    .addComponent(txtDateTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChooseDateTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel138)
                    .addComponent(txtTotalHoonBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel148))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel140))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTotaTransferHoonAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel147)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnFindPersonToTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTransferPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel152))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel155)
                    .addComponent(cbAccoutListTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel154)
                    .addComponent(txtTransferAppCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        btnTransferHoon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnTransferHoon.setText("บันทึกข้อมูล");
        btnTransferHoon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferHoonActionPerformed(evt);
            }
        });

        jLabel185.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel185.setText("รหัสสมาชิก");

        txtProfileCode2.setEditable(false);
        txtProfileCode2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtProfileCode2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtProfileCode2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel189.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel189.setText("บัญชีเงินฝาก");

        txtAccCode2.setEditable(false);
        txtAccCode2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAccCode2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAccCode2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel185)
                            .addComponent(jLabel189))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtProfileCode2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAccCode2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)))
                    .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTransferHoon))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel185)
                    .addComponent(txtProfileCode2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAccCode2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel189))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTransferHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        jPanel49.setBackground(new java.awt.Color(255, 204, 204));
        jPanel49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lblTransferHoonTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTransferHoonTitle.setText("โอนหุ้น");

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTransferHoonTitle)
                .addContainerGap(475, Short.MAX_VALUE))
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTransferHoonTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane5.addTab("โอนหุ้น", jPanel14);

        jPanel59.setBackground(new java.awt.Color(255, 204, 153));
        jPanel59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel63.setBackground(new java.awt.Color(255, 255, 255));
        jPanel63.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel59.setText("ผู้ถือหุ้นทั้งหมด");

        jLabel84.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel84.setText("จำนวนหุ้นทั้งหมด");

        jLabel145.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel145.setText("====================");

        jTextField14.setEditable(false);
        jTextField14.setBackground(new java.awt.Color(204, 255, 204));
        jTextField14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField14.setText("0");
        jTextField14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jTextField16.setEditable(false);
        jTextField16.setBackground(new java.awt.Color(204, 255, 204));
        jTextField16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField16.setText("0");
        jTextField16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel149.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel149.setText("คน");

        jLabel150.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel150.setText("หุ้น");

        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel145, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel63Layout.createSequentialGroup()
                        .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel63Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel59))
                            .addComponent(jLabel84, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel149)
                    .addComponent(jLabel150))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel63Layout.setVerticalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel149))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel150))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel145)
                .addGap(95, 95, 95))
        );

        jPanel64.setBackground(new java.awt.Color(255, 255, 255));
        jPanel64.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel171.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel171.setText("หุ้นที่ซื้อวันนี้");

        jLabel175.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel175.setText("จำนวนหุ้นคงเหลือ");

        jTextField24.setEditable(false);
        jTextField24.setBackground(new java.awt.Color(204, 255, 204));
        jTextField24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField24.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField24.setText("0");
        jTextField24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jTextField25.setEditable(false);
        jTextField25.setBackground(new java.awt.Color(204, 255, 204));
        jTextField25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField25.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField25.setText("0");
        jTextField25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel180.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel180.setText("หุ้น");

        jLabel182.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel182.setText("หุ้น");

        jLabel188.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel188.setText("หุ้นที่ขายวันนี้");

        jTextField29.setEditable(false);
        jTextField29.setBackground(new java.awt.Color(204, 255, 204));
        jTextField29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField29.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField29.setText("0");
        jTextField29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel195.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel195.setText("หุ้น");

        jLabel199.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel199.setText("หุ้นที่โอนวันนี้");

        jTextField33.setEditable(false);
        jTextField33.setBackground(new java.awt.Color(204, 255, 204));
        jTextField33.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField33.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField33.setText("0");
        jTextField33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel200.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel200.setText("หุ้น");

        jLabel203.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel203.setText("====================");

        javax.swing.GroupLayout jPanel64Layout = new javax.swing.GroupLayout(jPanel64);
        jPanel64.setLayout(jPanel64Layout);
        jPanel64Layout.setHorizontalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel203, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel64Layout.createSequentialGroup()
                        .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel171)
                            .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel199, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel188, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel175))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel180)
                    .addComponent(jLabel182)
                    .addComponent(jLabel195)
                    .addComponent(jLabel200))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel64Layout.setVerticalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel171)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel180))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel188)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel195))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel199)
                    .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel200))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel175)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel182))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel203))
        );

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel59Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel63, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCashPayFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCashPayFocusGained
        txtCashPayFocusGained();
    }//GEN-LAST:event_txtCashPayFocusGained

    private void txtCashPayKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCashPayKeyPressed
        txtCashPayKeyPressedAction(evt);
    }//GEN-LAST:event_txtCashPayKeyPressed

    private void btnSaveByHoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveByHoonActionPerformed
        btnSaveHoon();
    }//GEN-LAST:event_btnSaveByHoonActionPerformed

    private void btnSaveByHoonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSaveByHoonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSaveHoon();
        }
    }//GEN-LAST:event_btnSaveByHoonKeyPressed

    private void cbHoonTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbHoonTypeItemStateChanged
        if (evt.getStateChange() == 1) {
            if (cbHoonType.getItemCount() > 0) {
                initHoon();
            }
        }
    }//GEN-LAST:event_cbHoonTypeItemStateChanged

    private void txtTotalSellHoonAmountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTotalSellHoonAmountFocusGained
        txtTotalSellHoonAmountFocusGained();
    }//GEN-LAST:event_txtTotalSellHoonAmountFocusGained

    private void txtTotalSellHoonAmountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalSellHoonAmountKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSellHoon.requestFocus();
        }
    }//GEN-LAST:event_txtTotalSellHoonAmountKeyPressed

    private void txtTotalSellHoonAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalSellHoonAmountKeyReleased
        txtTotalSellHoonAmountKeyReleased();
    }//GEN-LAST:event_txtTotalSellHoonAmountKeyReleased

    private void btnChooseDateSellHoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseDateSellHoonActionPerformed
        btnChooseDateSellHoonActionPerformed();
    }//GEN-LAST:event_btnChooseDateSellHoonActionPerformed

    private void chkSelectAllSellHoonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkSelectAllSellHoonItemStateChanged
        if (chkSelectAllSellHoon.isSelected()) {
            txtTotalSellHoonAmount.requestFocus();
        } else {
            txtTotalSellHoonAmount.requestFocus();
        }
    }//GEN-LAST:event_chkSelectAllSellHoonItemStateChanged

    private void btnSellHoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSellHoonActionPerformed
        btnSellHoon();
    }//GEN-LAST:event_btnSellHoonActionPerformed

    private void btnSellHoonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSellHoonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSellHoon();
        }
    }//GEN-LAST:event_btnSellHoonKeyPressed

    private void txtTotaTransferHoonAmtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTotaTransferHoonAmtFocusGained
        initHoonTransfer();
        txtTotaTransferHoonAmt.selectAll();
    }//GEN-LAST:event_txtTotaTransferHoonAmtFocusGained

    private void txtTotaTransferHoonAmtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotaTransferHoonAmtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtTransferPerson.requestFocus();
        }
    }//GEN-LAST:event_txtTotaTransferHoonAmtKeyPressed

    private void txtTransferPersonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTransferPersonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (profileBean.getP_custCode().equals(txtTransferPerson.getText())) {
                JOptionPane.showMessageDialog(this, "ไม่สามารถโอนหุ้นให้กับบุคคลเดียวกันได้ !!!");
                txtTransferPerson.setText("");
                txtTransferPerson.requestFocus();
            } else {
                txtTransferAppCode.requestFocus();
            }
        }
    }//GEN-LAST:event_txtTransferPersonKeyPressed

    private void btnChooseDateTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseDateTransferActionPerformed
        Point point = txtDateTransfer.getLocationOnScreen();
        point.setLocation(point.getX(), point.getY());
        DateChooseDialog dcd = new DateChooseDialog(null, true, point);
        dcd.setVisible(true);

        if (dcd.getSelectDate() != null) {
            txtDateTransfer.setText(dcd.getDateString());
            txtDateTransfer.requestFocus();
        }
    }//GEN-LAST:event_btnChooseDateTransferActionPerformed

    private void btnFindPersonToTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindPersonToTransferActionPerformed
        ListCustomerDialog listDialog = new ListCustomerDialog(null, true);
        listDialog.setVisible(true);
        if (listDialog.getCUST_CODE() != null) {
            List<CbSaveAccountBean> listSaveAccount = saveAccountControl.listCbSaveAccount(listDialog.getCUST_CODE());
            cbAccoutListTransfer.removeAllItems();
            for(CbSaveAccountBean bean: listSaveAccount){
                cbAccoutListTransfer.addItem(bean.getAccount_code());
            }
            txtTransferPerson.setText(listDialog.getCUST_CODE());
            txtTransferAppCode.requestFocus();
        } else {
            txtTransferPerson.setText("");
            txtTransferPerson.requestFocus();
        }
    }//GEN-LAST:event_btnFindPersonToTransferActionPerformed

    private void btnTransferHoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferHoonActionPerformed
        btnTransferHoon();
    }//GEN-LAST:event_btnTransferHoonActionPerformed

    private void jTabbedPane5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane5MouseClicked
        int rowSelected = jTabbedPane5.getSelectedIndex();
        if (rowSelected != -1) {
            switch (rowSelected) {
                case 0:
                    txtHoonQTY.requestFocus();
                    break;
                case 1:
                    txtTotalSellHoonAmount.requestFocus();
                    break;
                case 2:
                    txtTotaTransferHoonAmt.requestFocus();
                    break;
                default:
                    break;
            }
        }
    }//GEN-LAST:event_jTabbedPane5MouseClicked

    private void txtHoonQTYFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoonQTYFocusGained
        txtDocNoSellHoon.setText("");
        initHoon();
        txtHoonQTY.selectAll();
    }//GEN-LAST:event_txtHoonQTYFocusGained

    private void txtHoonQTYKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoonQTYKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCashPay.requestFocus();
        }
    }//GEN-LAST:event_txtHoonQTYKeyPressed

    private void txtHoonQTYKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoonQTYKeyReleased
        txtHoonQTYKeyReleased();
    }//GEN-LAST:event_txtHoonQTYKeyReleased

    private void txtHoonBalanceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoonBalanceFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoonBalanceFocusGained

    private void txtHoonBalanceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoonBalanceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoonBalanceKeyPressed

    private void txtHoonBalanceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoonBalanceKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoonBalanceKeyReleased

    private void txtTotalHoonBalanceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTotalHoonBalanceFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalHoonBalanceFocusGained

    private void txtTotalHoonBalanceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalHoonBalanceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalHoonBalanceKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChooseDateSellHoon;
    private javax.swing.JButton btnChooseDateTransfer;
    private javax.swing.JButton btnFindPersonToTransfer;
    private javax.swing.JButton btnSaveByHoon;
    private javax.swing.JButton btnSellHoon;
    private javax.swing.JButton btnTransferHoon;
    private javax.swing.JComboBox<String> cbAccoutListTransfer;
    private javax.swing.JComboBox cbHoonType;
    private javax.swing.JCheckBox chkSelectAllSellHoon;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLayeredPane jLayeredPane6;
    private javax.swing.JLayeredPane jLayeredPane7;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JLabel lblBuyHoonTitle;
    private javax.swing.JLabel lblSellHoonTitle;
    private javax.swing.JLabel lblTransferHoonTitle;
    private javax.swing.JTextField txtAccCode2;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtCashPay;
    private javax.swing.JTextField txtDateSell;
    private javax.swing.JTextField txtDateTransfer;
    private javax.swing.JTextField txtDocNo;
    private javax.swing.JTextField txtDocNoSellHoon;
    private javax.swing.JTextField txtDocnoTransfer;
    private javax.swing.JTextField txtHoonAmt;
    private javax.swing.JTextField txtHoonBalance;
    private javax.swing.JTextField txtHoonQTY;
    private javax.swing.JTextField txtHoonTon;
    private javax.swing.JTextField txtPriceValue;
    private javax.swing.JTextField txtProfileCode2;
    private javax.swing.JTextField txtTotaTransferHoonAmt;
    private javax.swing.JTextField txtTotalAmount;
    private javax.swing.JTextField txtTotalHoonBalance;
    private javax.swing.JTextField txtTotalSellHoonAmount;
    private javax.swing.JPasswordField txtTransferAppCode;
    private javax.swing.JTextField txtTransferPerson;
    private javax.swing.JTextField txtValueBaht;
    // End of variables declaration//GEN-END:variables

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

    private void initHoon() {
        String hType = getIDCombobox(cbHoonType);
        CbHoonConfigBean cbHoonConfigBean = hoonConfigControl.listCbHoonConfig(hType);
        if (cbHoonConfigBean != null) {
            txtValueBaht.setText(NumberFormat.showDouble2(cbHoonConfigBean.getHoonRate()));
            txtPriceValue.setText("" + cbHoonConfigBean.getHoonRate());
        }
        txtHoonQTY.requestFocus();
    }

    private String getIDCombobox(JComboBox cb) {
        if (cb.getItemCount() > 0) {
            String[] items = cb.getSelectedItem().toString().split("-");
            return items[0].trim();
        }
        return "";
    }

    private void txtCashPayFocusGained() {
        txtCashPay.selectAll();
    }

    private void txtCashPayKeyPressedAction(KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSaveByHoon.requestFocus();
        }
    }

    private void btnSaveHoon() {
        double qty = NumberUtil.toDouble(txtHoonQTY.getText());
        double totalAmt = NumberUtil.toDouble(txtAmount.getText());
        double cashPay = NumberUtil.toDouble(txtCashPay.getText());
        double total = cashPay - totalAmt;

        if (qty <= 0) {
            txtHoonQTY.requestFocus();
            return;
        }

        if (cashPay < totalAmt) {
            JOptionPane.showMessageDialog(this, "ท่านระบุจำนวนเงินไม่ครบถ้วน กรุณาเพิ่มอีก " + total + " บาท");
            txtCashPay.requestFocus();
            return;
        }

        txtHoonTon.setText(NumberFormat.showDouble2(total));
        saveBuyHoon();
    }

    private void saveBuyHoon() {
        //บันทึกข้อมูลการซื้อหุ้น
        String hoonDocNo;
        ConfigBean configBean = configControl.getConfigBean();
        if ("Y".equals(configBean.getBranchPrefix())) {
            BranchBean branchBean = branchControl.getData();
            hoonDocNo = branchBean.getCode() + configBean.getHoonDocPrefix() + getRunning(configBean.getHoonDocRunning());
        } else {
            hoonDocNo = configBean.getHoonDocPrefix() + getRunning(configBean.getHoonDocRunning());
        }
        try {
            //update transactoin
            CbTransactionSaveBean cbTransactionSaveBean = new CbTransactionSaveBean();
            cbTransactionSaveBean.setT_date(new Date());
            cbTransactionSaveBean.setT_acccode(saveAccountBean.getAccount_code());
            cbTransactionSaveBean.setT_custcode(profileBean.getP_custCode());
            cbTransactionSaveBean.setT_description(ThaiUtil.Unicode2ASCII("ซื้อหุ้น"));
            cbTransactionSaveBean.setT_status(AppConstants.CB_STATUS_BUY_HOON);
            cbTransactionSaveBean.setT_amount(NumberUtil.toDouble(txtHoonQTY.getText()));
            cbTransactionSaveBean.setT_empcode(Value.USER_CODE);
            cbTransactionSaveBean.setT_docno(hoonDocNo);
            cbTransactionSaveBean.setRemark(ThaiUtil.Unicode2ASCII("ซื้อหุ้น"));
            cbTransactionSaveBean.setT_booktype("");
            cbTransactionSaveBean.setLineNo(0);
            cbTransactionSaveBean.setPrintChk("N");
            cbTransactionSaveBean.setT_index(0);
            cbTransactionSaveBean.setMoney_in(0.00);
            cbTransactionSaveBean.setMoney_out(0.00);
            cbTransactionSaveBean.setT_hoon_rate(NumberUtil.toDouble(txtValueBaht.getText()));
            cbTransactionSaveBean.setBranchCode(Value.BRANCH_CODE);
            cbTransactionSaveBean.setT_hoon_amt(NumberUtil.toDouble(txtAmount.getText()));
            cbTransactionSaveBean.setT_hoon_cash(NumberUtil.toDouble(txtCashPay.getText()));
            cbTransactionSaveBean.setT_hoon_ton(NumberUtil.toDouble(txtHoonTon.getText()));
            cbTransactionSaveBean.setT_balance(saveAccountBean.getHoon_balance());
            cbTransactionSaveBean.setT_hoon(profileBean.getHoon_Qty() + (int) cbTransactionSaveBean.getT_amount());

            if (cbTransactionSaveControl.saveCbTransactionSave(cbTransactionSaveBean)) {
                String sql2 = "update cb_profile set "
                        + "Hoon_Qty=Hoon_Qty+" + cbTransactionSaveBean.getT_amount() + " "
                        + "where p_CustCode='" + profileBean.getP_custCode() + "';";
                profileControl.update(sql2);

                sql2 = "update cb_save_account set "
                        + "hoon_balance=hoon_balance+" + cbTransactionSaveBean.getT_amount() + " "
                        + "where account_code='" + saveAccountBean.getAccount_code() + "';";
                saveAccountControl.update(sql2);
                configControl.update("update cb_config set HoonDocRunning=HoonDocRunning+1");
            }
            txtDocNo.setText(hoonDocNo);
            JOptionPane.showMessageDialog(this, "บันทึกข้อมูลการซื้อหุ้นเรียบร้อยแล้ว");
            btnSaveByHoon.setEnabled(false);
            txtCashPay.setEditable(false);
            txtHoonQTY.setEditable(false);
            cbHoonType.setEnabled(false);

            loadSummary();

            ViewReport viewReport = new ViewReport();
            viewReport.printReportBuyHoon(profileBean.getP_custCode(), hoonDocNo);

            // load default form hoon
            resetSaleHoon();
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void loadSummary() {
        SaveSummaryBean saveSummaryBean = saveSummaryControl.getSaveData();
        jTextField14.setText("" + saveSummaryBean.getHoon_balance_all());
        jTextField16.setText(NumberFormat.showDouble2(saveSummaryBean.getHoon_value_amount_all()));
        jTextField24.setText(NumberFormat.showDouble2(saveSummaryBean.getHoon_buy_today()));
        jTextField29.setText(NumberFormat.showDouble2(saveSummaryBean.getHoon_sale_today()));
        jTextField33.setText(NumberFormat.showDouble2(saveSummaryBean.getHoon_transfer_today()));
        jTextField25.setText(NumberFormat.showDouble2(saveSummaryBean.getHoon_value_amount_today()));
    }

    private void txtTotalSellHoonAmountFocusGained() {
        txtDocNo.setText("");
        initHoonWithdraw();
        txtTotalSellHoonAmount.selectAll();
    }

    private void initHoonWithdraw() {
        txtTotalSellHoonAmount.requestFocus();
        txtDateSell.setText(DateFormat.getLocale_ddMMyyyy(new Date()));
        txtTotalSellHoonAmount.requestFocus();
    }

    private void txtTotalSellHoonAmountKeyReleased() {
        double price = NumberUtil.toDouble(txtPriceValue.getText());
        double total = NumberUtil.toDouble(txtTotalSellHoonAmount.getText());
        total *= price;
        txtTotalAmount.setText(NumberFormat.showDouble2(total));
    }

    private void btnChooseDateSellHoonActionPerformed() {
        Point point = txtDateSell.getLocationOnScreen();
        point.setLocation(point.getX(), point.getY());
        DateChooseDialog dcd = new DateChooseDialog(null, true, point);
        dcd.setVisible(true);

        if (dcd.getSelectDate() != null) {
            txtDateSell.setText(dcd.getDateString());
            txtDateSell.requestFocus();
        }
    }

    private void btnSellHoon() {
        double qty = NumberUtil.toDouble(txtTotalSellHoonAmount.getText());
        double balance = NumberUtil.toDouble(txtHoonBalance.getText());

        if (qty <= 0) {
            JOptionPane.showMessageDialog(this, "จำนวนหุ้นที่ต้องการขายต้องมากกว่า 0!");
            txtTotalSellHoonAmount.requestFocus();
            return;
        }

        if (qty == balance) {
            JOptionPane.showMessageDialog(this, "จำนวนที่ท่านขายหุ้นคือจำนวนหุ้นทั้งหมดที่ท่านถือครอง !");
        }

        if (qty > balance) {
            JOptionPane.showMessageDialog(this, "จำนวนหุ้นที่ท่านถือครองมีไม่เพียงพอต่อการขาย !");
            txtTotalSellHoonAmount.requestFocus();
            return;
        }
        saveSaleHoon();
    }

    private void saveSaleHoon() {
        //บันทึกข้อมูลการขายหุ้น
        String hoonSellDocNo;
        ConfigBean bean = configControl.getConfigBean();
        if ("Y".equals(bean.getBranchPrefix())) {
            BranchBean bBean = branchControl.getData();
            hoonSellDocNo = bBean.getCode() + bean.getHoonSaleDocPrefix() + getRunning(bean.getHoonSaleDocRunning());
        } else {
            hoonSellDocNo = bean.getHoonSaleDocPrefix() + getRunning(bean.getHoonSaleDocRunning());
        }
        try {
            //update transactoin
            CbTransactionSaveBean cbTransactionSaveBean = new CbTransactionSaveBean();
            cbTransactionSaveBean.setT_date(new Date());
            cbTransactionSaveBean.setT_acccode(saveAccountBean.getAccount_code());
            cbTransactionSaveBean.setT_custcode(profileBean.getP_custCode());
            cbTransactionSaveBean.setT_description(ThaiUtil.Unicode2ASCII("ขายหุ้น"));
            cbTransactionSaveBean.setT_amount(NumberUtil.toDouble(txtTotalSellHoonAmount.getText()));
            cbTransactionSaveBean.setT_empcode(Value.USER_CODE);
            cbTransactionSaveBean.setT_docno(hoonSellDocNo);
            cbTransactionSaveBean.setRemark(ThaiUtil.Unicode2ASCII("ขายหุ้น"));
            cbTransactionSaveBean.setT_status(AppConstants.CB_STATUS_SALE_HOON);
            cbTransactionSaveBean.setT_booktype("");
            cbTransactionSaveBean.setLineNo(0);
            cbTransactionSaveBean.setPrintChk("N");
            cbTransactionSaveBean.setT_index(0);
            cbTransactionSaveBean.setMoney_in(0.00);
            cbTransactionSaveBean.setMoney_out(0.00);
            cbTransactionSaveBean.setT_hoon_rate(NumberUtil.toDouble(txtPriceValue.getText()));
            cbTransactionSaveBean.setBranchCode(Value.BRANCH_CODE);

            double totalAmount = NumberUtil.toDouble(txtTotalAmount.getText());
            cbTransactionSaveBean.setT_hoon_amt(totalAmount);
            cbTransactionSaveBean.setT_hoon_cash(totalAmount);
            cbTransactionSaveBean.setT_hoon_ton(0);
            cbTransactionSaveBean.setT_balance(saveAccountBean.getHoon_balance());
            cbTransactionSaveBean.setT_hoon(profileBean.getHoon_Qty() - (int) cbTransactionSaveBean.getT_amount());

            if (cbTransactionSaveControl.saveCbTransactionSave(cbTransactionSaveBean)) {
                String sql2 = "update cb_profile set "
                        + "Hoon_Qty=Hoon_Qty-" + cbTransactionSaveBean.getT_amount() + " "
                        + "where p_CustCode='" + profileBean.getP_custCode() + "';";
                profileControl.update(sql2);

                sql2 = "update cb_save_account set "
                        + "hoon_balance=hoon_balance-" + cbTransactionSaveBean.getT_amount() + " "
                        + "where account_code='" + saveAccountBean.getAccount_code() + "';";
                saveAccountControl.update(sql2);

                String sql = "update cb_config set HoonSaleDocRunning=HoonSaleDocRunning+1";
                configControl.update(sql);
            }

            txtDocNoSellHoon.setText(hoonSellDocNo);
            
            JOptionPane.showMessageDialog(this, "ทำรายการขายหุ้นเสร็จเรียบร้อย");
            btnChooseDateSellHoon.setEnabled(false);
            txtTotalSellHoonAmount.setEditable(false);
            chkSelectAllSellHoon.setEnabled(false);
            btnSellHoon.setEnabled(false);
            
            loadSummary();

            ViewReport viewReport = new ViewReport();
            viewReport.printReportSellHoon(profileBean.getP_custCode(), hoonSellDocNo);
            resetSaleHoon();
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void resetSaleHoon() {
        saveAccountBean = saveAccountControl.getSaveAccountBean(saveAccountBean.getAccount_code());

        txtHoonAmt.setText("" + saveAccountBean.getHoon_balance());
        txtHoonBalance.setText("" + saveAccountBean.getHoon_balance());
        txtTotalHoonBalance.setText("" + saveAccountBean.getHoon_balance());

        txtDocNo.setText("");
        txtDocNoSellHoon.setText("");
        txtDocnoTransfer.setText("");

        txtTotaTransferHoonAmt.setText("0");
        txtTransferAppCode.setText("");
        txtTransferPerson.setText("");
        txtDateTransfer.setText("");

        txtTotalAmount.setText("0.00");
        txtTotalSellHoonAmount.setText("0");
        txtTotalSellHoonAmount.requestFocus();
    }

    private void initHoonTransfer() {
        txtTotaTransferHoonAmt.requestFocus();
        txtDateTransfer.setText(DateFormat.getLocale_ddMMyyyy(new Date()));
    }

    private void btnTransferHoon() {
        if (!txtTransferAppCode.getText().equals("000000")) {
            JOptionPane.showMessageDialog(this, "อนุมัติในการโอนหุ้นไม่ถูกต้อง !");
            txtTransferAppCode.requestFocus();
            return;
        }

        if (profileBean.getP_custCode().equals(txtTransferPerson.getText())) {
            JOptionPane.showMessageDialog(this, "ไม่สามารถโอนหุ้นให้กับบุคคลเดียวกันได้ !!!");
            txtTransferPerson.setText("");
            txtTransferPerson.requestFocus();
            return;
        }

        if (txtTransferPerson.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณาระบุรหัสลูกค้าที่ท่านต้องการโอนหุ้นให้ !");
            txtTransferPerson.requestFocus();
            return;
        }

        double hoonBalance = Double.parseDouble(txtTotalHoonBalance.getText().replace(",", ""));
        double tranferAmt = Double.parseDouble(txtTotaTransferHoonAmt.getText().replace(",", ""));
        if (tranferAmt >= hoonBalance) {
            JOptionPane.showMessageDialog(this, "คุณต้องการโอนหุ้นทั้งหมดจากบัญชีนี้");
            txtTotaTransferHoonAmt.setText("" + hoonBalance);
        }

        transferHoon();
    }

    private void transferHoon() {
        //update transactoin การโอนหุ้น
        String transferHoonDocNo;
        ConfigBean bean = configControl.getConfigBean();
        if ("Y".equals(bean.getBranchPrefix())) {
            BranchBean bBean = branchControl.getData();
            transferHoonDocNo = bBean.getCode() + bean.getHoonTransferDocPrefix() + getRunning(bean.getHoonTransferDocRunning());
        } else {
            transferHoonDocNo = bean.getHoonTransferDocPrefix() + getRunning(bean.getHoonTransferDocRunning());
        }
        try {
            String sHoonMoney = txtTotaTransferHoonAmt.getText();
            CbTransactionSaveBean cbTransactionSaveBean = new CbTransactionSaveBean();
            cbTransactionSaveBean.setT_date(new Date());
            cbTransactionSaveBean.setT_acccode(cbAccoutListTransfer.getSelectedItem().toString());
            cbTransactionSaveBean.setT_custcode(profileBean.getP_custCode());
            cbTransactionSaveBean.setT_description(ThaiUtil.Unicode2ASCII("โอนหุ้น"));
            cbTransactionSaveBean.setT_amount(NumberUtil.toInt(sHoonMoney));
            cbTransactionSaveBean.setT_empcode(Value.USER_CODE);
            cbTransactionSaveBean.setT_docno(transferHoonDocNo);
            cbTransactionSaveBean.setRemark(ThaiUtil.Unicode2ASCII("โอนหุ้น"));
            cbTransactionSaveBean.setT_status(AppConstants.CB_STATUS_TRANS_HOON);
            cbTransactionSaveBean.setT_booktype("");
            cbTransactionSaveBean.setLineNo(0);
            cbTransactionSaveBean.setPrintChk("N");
            cbTransactionSaveBean.setT_index(0);
            cbTransactionSaveBean.setMoney_in(0.00);
            cbTransactionSaveBean.setMoney_out(0.00);
            cbTransactionSaveBean.setT_hoon_rate(0);
            cbTransactionSaveBean.setBranchCode(Value.BRANCH_CODE);
            cbTransactionSaveBean.setT_hoon_amt(0);
            cbTransactionSaveBean.setT_hoon_cash(0);
            cbTransactionSaveBean.setT_hoon_ton(0);
            cbTransactionSaveBean.setT_balance(saveAccountBean.getHoon_balance());
            cbTransactionSaveBean.setT_hoon(NumberUtil.toInt(sHoonMoney));

            if (cbTransactionSaveControl.saveCbTransactionSave(cbTransactionSaveBean)) {
                String sql2 = "update cb_profile set "
                        + "Hoon_Qty=Hoon_Qty-" + sHoonMoney + " "
                        + "where p_CustCode='" + profileBean.getP_custCode() + "';";
                profileControl.update(sql2);

                // update source transfer hoon
                sql2 = "update cb_save_account set "
                        + "hoon_balance=hoon_balance-" + cbTransactionSaveBean.getT_amount() + " "
                        + "where account_code='" + saveAccountBean.getAccount_code() + "';";
                saveAccountControl.update(sql2);
                
                // update target transfer hoon
                sql2 = "update cb_profile set "
                        + "Hoon_Qty=Hoon_Qty+" + sHoonMoney + " "
                        + "where p_CustCode='" + txtTransferPerson + "';";
                profileControl.update(sql2);
                
                sql2 = "update cb_save_account set "
                        + "hoon_balance=hoon_balance+" + cbTransactionSaveBean.getT_amount() + " "
                        + "where account_code='" + cbAccoutListTransfer.getSelectedItem().toString() + "';";
                saveAccountControl.update(sql2);
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

        //update transactoin การรับหุ้นจากการโอน
        try {
            String sHoonMoney = txtTotaTransferHoonAmt.getText();
            //update transactoin การโอนหุ้น
            CbTransactionSaveBean cbTransactionSaveBean = new CbTransactionSaveBean();
            cbTransactionSaveBean.setT_date(new Date());
            cbTransactionSaveBean.setT_acccode(saveAccountBean.getAccount_code());
            cbTransactionSaveBean.setT_custcode(profileBean.getP_custCode());
            cbTransactionSaveBean.setT_description(ThaiUtil.Unicode2ASCII("รับเข้าหุ้น"));
            cbTransactionSaveBean.setT_amount(NumberUtil.toInt(sHoonMoney));
            cbTransactionSaveBean.setT_empcode(Value.USER_CODE);
            cbTransactionSaveBean.setT_docno(transferHoonDocNo);
            cbTransactionSaveBean.setRemark(ThaiUtil.Unicode2ASCII("รับเข้าหุ้น"));
            cbTransactionSaveBean.setT_booktype("");
            cbTransactionSaveBean.setLineNo(0);
            cbTransactionSaveBean.setPrintChk("N");
            cbTransactionSaveBean.setT_index(0);
            cbTransactionSaveBean.setMoney_in(0.00);
            cbTransactionSaveBean.setMoney_out(0.00);
            cbTransactionSaveBean.setT_hoon_rate(0);
            cbTransactionSaveBean.setBranchCode(Value.BRANCH_CODE);
            cbTransactionSaveBean.setT_hoon_amt(0);
            cbTransactionSaveBean.setT_hoon_cash(0);
            cbTransactionSaveBean.setT_hoon_ton(0);
            cbTransactionSaveBean.setT_balance(saveAccountBean.getHoon_balance());
            cbTransactionSaveBean.setT_hoon(NumberUtil.toInt(sHoonMoney));

            if (cbTransactionSaveControl.saveCbTransactionSave(cbTransactionSaveBean)) {
                String sql3 = "update cb_profile set Hoon_Qty=Hoon_Qty+" + sHoonMoney + " where p_CustCode='" + txtTransferPerson.getText() + "';";
                profileControl.update(sql3);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

        // อัพเดต Running
        String sql = "update cb_config set HoonTransferDocRunning=HoonTransferDocRunning+1";
        configControl.update(sql);

        txtDocnoTransfer.setText(transferHoonDocNo);
        JOptionPane.showMessageDialog(this, "ทำรายการโอนหุ้นเสร็จเรียบร้อย");
        btnChooseDateTransfer.setEnabled(false);
        txtTotaTransferHoonAmt.setEditable(false);
        txtTransferPerson.setEditable(false);
        btnFindPersonToTransfer.setEnabled(false);
        cbAccoutListTransfer.setEnabled(false);
        txtTransferAppCode.setEditable(false);
        
        ViewReport v = new ViewReport();
        v.printReportTransferHoon(profileBean.getP_custCode(), transferHoonDocNo);
        
        loadSummary();
        resetSaleHoon();
    }

    private void txtHoonQTYKeyReleased() {
        double total;
        double a = 0.00;
        double b = 0.00;
        if (!"".equals(txtHoonQTY.getText().trim())) {
            a = NumberUtil.toDouble(txtHoonQTY.getText());
        }
        if (!"".equals(txtValueBaht.getText().trim())) {
            b = NumberUtil.toDouble(txtValueBaht.getText());
        }

        total = a * b;
        txtAmount.setText(NumberFormat.showDouble2(total));
    }

    private void initLoad() {
        List<CbHoonConfigBean> listHoon = hoonConfigControl.listCbHoonConfig();
        cbHoonType.removeAllItems();
        for (int i = 0; i < listHoon.size(); i++) {
            CbHoonConfigBean bean = (CbHoonConfigBean) listHoon.get(i);
            cbHoonType.addItem(bean.getHoonCode() + " - " + bean.getHoonName());
        }
        txtProfileCode2.setText(profileBean.getP_custCode());
        txtAccCode2.setText(saveAccountBean.getAccount_code());
        txtHoonAmt.setText("" + saveAccountBean.getHoon_balance());
        txtHoonBalance.setText("" + saveAccountBean.getHoon_balance());
        txtTotalHoonBalance.setText("" + saveAccountBean.getHoon_balance());

        txtHoonQTY.requestFocus();
    }
}
