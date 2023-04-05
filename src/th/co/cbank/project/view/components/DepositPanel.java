package th.co.cbank.project.view.components;

import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.apache.log4j.Logger;
import th.co.cbank.project.constants.AppConstants;
import th.co.cbank.project.control.BranchControl;
import th.co.cbank.project.control.CbSaveAccountControl;
import th.co.cbank.project.control.CbSaveConfigControl;
import th.co.cbank.project.control.CbTransactionSaveControl;
import th.co.cbank.project.control.CbWithdrawAllowControl;
import th.co.cbank.project.control.ConfigControl;
import th.co.cbank.project.control.ProfileControl;
import th.co.cbank.project.control.SaveSummaryControl;
import th.co.cbank.project.control.Value;
import th.co.cbank.project.model.BranchBean;
import th.co.cbank.project.model.CbSaveAccountBean;
import th.co.cbank.project.model.CbSaveConfigBean;
import th.co.cbank.project.model.CbTransactionSaveBean;
import th.co.cbank.project.model.CbWithdrawAllowBean;
import th.co.cbank.project.model.ConfigBean;
import th.co.cbank.project.model.PrintSlipBean;
import th.co.cbank.project.model.ProfileBean;
import th.co.cbank.project.model.SaveSummaryBean;
import th.co.cbank.project.view.InputWithdrawDialog;
import th.co.cbank.project.view.ListCloseSaveConfirmDialog;
import th.co.cbank.project.view.ListSaveConfirmDialog;
import th.co.cbank.project.view.ListWithdrawConfirmDialog;
import th.co.cbank.project.view.TransactionAdvanceDialog;
import th.co.cbank.project.view.TransactionAdvanceMethod;
import th.co.cbank.util.DateChooseDialog;
import th.co.cbank.util.DateFormat;
import th.co.cbank.util.JTableUtil;
import th.co.cbank.util.MessageAlert;
import th.co.cbank.util.MoneyToWord;
import th.co.cbank.util.NumberFormat;
import th.co.cbank.util.TableUtil;

public class DepositPanel extends javax.swing.JPanel {

    private final Logger logger = Logger.getLogger(DepositPanel.class);
    private final ProfileBean profileBean;
    private CbSaveAccountBean saveAccountBean;
    private final CbSaveConfigBean cbSaveConfigBean;
    private final ConfigBean configBean;
    private final CbSaveAccountControl saveAccountControl = new CbSaveAccountControl();
    private final ConfigControl configControl = new ConfigControl();
    private final BranchControl branchControl = new BranchControl();
    private final CbTransactionSaveControl cbTransactionSaveControl = new CbTransactionSaveControl();
    private final CbSaveConfigControl saveConfigControl = new CbSaveConfigControl();
    private final ProfileControl profileControl = new ProfileControl();
    private final CbWithdrawAllowControl cbWithdrawAllowControl = new CbWithdrawAllowControl();
    private final SaveSummaryControl saveSummaryControl = new SaveSummaryControl();

    public DepositPanel(ProfileBean profileBean, CbSaveAccountBean saveAccountBean, int selectIndex) {
        initComponents();

        initLoadTable();

        this.profileBean = profileBean;
        this.saveAccountBean = saveAccountBean;
        cbSaveConfigBean = saveConfigControl.getConfigByTypeCode(saveAccountBean.getAccount_type());
        configBean = configControl.getConfigBean();

        jTabbedPane8.setEnabledAt(0, false);
        jTabbedPane8.setEnabledAt(1, false);
        jTabbedPane8.setEnabledAt(2, false);

        jTabbedPane8.setSelectedIndex(selectIndex);
        jTabbedPane8.setEnabledAt(selectIndex, true);
        if (selectIndex == 1) {
            jTabbedPane8.setEnabledAt(2, true);
        }

        initData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane8 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jPanel19 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDepCode = new javax.swing.JTextField();
        lbMoneyText = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtDepositBaht = new javax.swing.JTextField();
        txtRemark1 = new javax.swing.JTextField();
        txtBalance = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        txtBalanceInterest = new javax.swing.JTextField();
        jLabel148 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txtBookPage = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        BookPageAt = new javax.swing.JTextField();
        jLabel168 = new javax.swing.JLabel();
        txtAccCodeLoad = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        txtDepositDate = new javax.swing.JTextField();
        btnSaveMoney = new javax.swing.JButton();
        jPanel41 = new javax.swing.JPanel();
        lblSaveAccountTitle = new javax.swing.JLabel();
        lbAccountNumber = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        btnTransactionSaveDialog = new javax.swing.JButton();
        jPanel40 = new javax.swing.JPanel();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jPanel18 = new javax.swing.JPanel();
        jLabel135 = new javax.swing.JLabel();
        txtBalanceTotal = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        txtWithdrawalCode = new javax.swing.JTextField();
        jLabel143 = new javax.swing.JLabel();
        txtWithdrawalBaht = new javax.swing.JTextField();
        lbMoneyText1 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        txtRemark2 = new javax.swing.JTextField();
        jLabel142 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        txtWithdrawAccTypeName = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        txtWithdrawDate = new javax.swing.JTextField();
        btnWithdrawMoney = new javax.swing.JButton();
        jPanel42 = new javax.swing.JPanel();
        lblWithdrawAccountTitle = new javax.swing.JLabel();
        lbAccountNumber1 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        txtCloseRemark = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        txtStartDateOpenSaveAccount = new javax.swing.JTextField();
        txtSaveCloseBalance = new javax.swing.JTextField();
        txtSaveCloseInterest = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        txTotalMoneyClose = new javax.swing.JTextField();
        jLabel134 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtCloseAccountDocNo = new javax.swing.JTextField();
        btnCloseSaveAccount = new javax.swing.JButton();
        jPanel46 = new javax.swing.JPanel();
        lblCloseAccountTitle = new javax.swing.JLabel();
        lbAccountNumber2 = new javax.swing.JLabel();
        jPanel56 = new javax.swing.JPanel();
        jPanel57 = new javax.swing.JPanel();
        jLabel104 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jPanel58 = new javax.swing.JPanel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel133 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbTransSave = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTabbedPane8.setRequestFocusEnabled(false);
        jTabbedPane8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane8MouseClicked(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jPanel19.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel19.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("เลขที่ใบฝากเงิน");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("ยอดเงินในบัญชี");

        txtDepCode.setEditable(false);
        txtDepCode.setBackground(new java.awt.Color(255, 255, 204));
        txtDepCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDepCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDepCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtDepCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDepCodeKeyPressed(evt);
            }
        });

        lbMoneyText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbMoneyText.setText("(...)");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("บาท");

        txtDepositBaht.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtDepositBaht.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDepositBaht.setText("0.00");
        txtDepositBaht.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtDepositBaht.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDepositBahtFocusGained(evt);
            }
        });
        txtDepositBaht.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDepositBahtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDepositBahtKeyReleased(evt);
            }
        });

        txtRemark1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtRemark1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtRemark1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRemark1KeyPressed(evt);
            }
        });

        txtBalance.setEditable(false);
        txtBalance.setBackground(new java.awt.Color(255, 255, 204));
        txtBalance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBalance.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBalance.setText("0.00");
        txtBalance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("บาท");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("หมายเหตุ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("ฝากเงินเข้า");

        jLabel146.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel146.setText("ดอกเบี้ยสะสม");

        txtBalanceInterest.setEditable(false);
        txtBalanceInterest.setBackground(new java.awt.Color(255, 255, 204));
        txtBalanceInterest.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBalanceInterest.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBalanceInterest.setText("0.00");
        txtBalanceInterest.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel148.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel148.setText("บาท");

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel44.setText("บรรทัดที่พิมพ์");

        txtBookPage.setEditable(false);
        txtBookPage.setBackground(new java.awt.Color(255, 255, 255));
        txtBookPage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBookPage.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBookPage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel48.setText("หน้าความเคลื่อนไหวที่");

        BookPageAt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BookPageAt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BookPageAt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel168.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel168.setText("ประเภทบัญชี");

        txtAccCodeLoad.setEditable(false);
        txtAccCodeLoad.setBackground(new java.awt.Color(255, 255, 204));
        txtAccCodeLoad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAccCodeLoad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAccCodeLoad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel67.setText("วันที่ฝากเงิน");

        txtDepositDate.setEditable(false);
        txtDepositDate.setBackground(new java.awt.Color(255, 255, 204));
        txtDepositDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDepositDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDepositDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtDepositDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDepositDateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10)
                    .addComponent(jLabel4)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDepCode, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBalance, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel19Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel146))
                                    .addComponent(jLabel168))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtBalanceInterest, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                    .addComponent(txtAccCodeLoad))
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel19Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel148)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                                        .addComponent(jLabel67)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDepositDate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(lbMoneyText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(jLabel48)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BookPageAt, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBookPage, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtRemark1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(txtDepositBaht, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)))
                        .addContainerGap())))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDepCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel168)
                    .addComponent(txtAccCodeLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDepositDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel67))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBalanceInterest, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel148)
                        .addComponent(jLabel146))
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDepositBaht, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(lbMoneyText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRemark1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(txtBookPage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48)
                    .addComponent(BookPageAt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btnSaveMoney.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSaveMoney.setText("บันทึกข้อมูล");
        btnSaveMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveMoneyActionPerformed(evt);
            }
        });
        btnSaveMoney.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSaveMoneyKeyPressed(evt);
            }
        });

        jPanel41.setBackground(new java.awt.Color(204, 255, 204));

        lblSaveAccountTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblSaveAccountTitle.setText("ฝากเงินเข้าบัญชี");

        lbAccountNumber.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        lbAccountNumber.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbAccountNumber.setText("jLabel2");

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSaveAccountTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSaveAccountTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAccountNumber))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel170.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel170.setText("รายงานการฝากเงินล่าสุด");

        btnTransactionSaveDialog.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnTransactionSaveDialog.setText("แสดงรายละเอียดความเคลื่อนไหว");
        btnTransactionSaveDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransactionSaveDialogActionPerformed(evt);
            }
        });

        jLayeredPane2.setLayer(jPanel19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(btnSaveMoney, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jPanel41, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel170, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(btnTransactionSaveDialog, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addComponent(btnSaveMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTransactionSaveDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel170))
                            .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTransactionSaveDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel170)
                    .addComponent(btnSaveMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLayeredPane2)
                .addContainerGap())
        );

        jTabbedPane8.addTab("ฝากเงิน", jPanel8);

        jPanel40.setBackground(new java.awt.Color(255, 255, 255));

        jPanel18.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel18.setOpaque(false);

        jLabel135.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel135.setText("จำนวนเงินที่ถอน");

        txtBalanceTotal.setEditable(false);
        txtBalanceTotal.setBackground(new java.awt.Color(255, 255, 204));
        txtBalanceTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBalanceTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBalanceTotal.setText("0.00");
        txtBalanceTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("เลขที่ใบแจ้งถอน");

        jLabel141.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel141.setText("หมายเหตุ");

        txtWithdrawalCode.setEditable(false);
        txtWithdrawalCode.setBackground(new java.awt.Color(255, 255, 204));
        txtWithdrawalCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtWithdrawalCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtWithdrawalCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtWithdrawalCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtWithdrawalCodeKeyPressed(evt);
            }
        });

        jLabel143.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel143.setText("บาท");

        txtWithdrawalBaht.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtWithdrawalBaht.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtWithdrawalBaht.setText("0.00");
        txtWithdrawalBaht.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtWithdrawalBaht.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtWithdrawalBahtFocusGained(evt);
            }
        });
        txtWithdrawalBaht.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtWithdrawalBahtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtWithdrawalBahtKeyReleased(evt);
            }
        });

        lbMoneyText1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbMoneyText1.setText("(...)");

        jLabel140.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel140.setText("ยอดเงินที่ถอนได้");

        txtRemark2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtRemark2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtRemark2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRemark2KeyPressed(evt);
            }
        });

        jLabel142.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel142.setText("บาท");

        jLabel169.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel169.setText("ประเภทบัญชี");

        txtWithdrawAccTypeName.setEditable(false);
        txtWithdrawAccTypeName.setBackground(new java.awt.Color(255, 255, 204));
        txtWithdrawAccTypeName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtWithdrawAccTypeName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtWithdrawAccTypeName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel68.setText("วันที่ถอนเงิน");

        txtWithdrawDate.setEditable(false);
        txtWithdrawDate.setBackground(new java.awt.Color(255, 255, 204));
        txtWithdrawDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtWithdrawDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtWithdrawDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtWithdrawDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtWithdrawDateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel135)
                            .addComponent(jLabel140)
                            .addComponent(jLabel13)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel141)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtWithdrawalCode)
                            .addComponent(txtBalanceTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel143)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel169, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel68, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtWithdrawDate, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtWithdrawAccTypeName)))
                        .addGap(230, 230, 230))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRemark2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(txtWithdrawalBaht, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel142)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbMoneyText1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(179, 179, 179))))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtWithdrawalCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel169)
                    .addComponent(txtWithdrawAccTypeName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel140)
                    .addComponent(txtBalanceTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel143)
                    .addComponent(jLabel68)
                    .addComponent(txtWithdrawDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel135)
                    .addComponent(txtWithdrawalBaht, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel142)
                    .addComponent(lbMoneyText1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRemark2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel141))
                .addContainerGap())
        );

        btnWithdrawMoney.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnWithdrawMoney.setText("บันทึกข้อมูล");
        btnWithdrawMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdrawMoneyActionPerformed(evt);
            }
        });
        btnWithdrawMoney.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnWithdrawMoneyKeyPressed(evt);
            }
        });

        jPanel42.setBackground(new java.awt.Color(255, 204, 204));

        lblWithdrawAccountTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblWithdrawAccountTitle.setText("ถอนเงินออกจากบัญชี");

        lbAccountNumber1.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        lbAccountNumber1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbAccountNumber1.setText("jLabel2");

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWithdrawAccountTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbAccountNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWithdrawAccountTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAccountNumber1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane3.setLayer(jPanel18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(btnWithdrawMoney, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jPanel42, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                                .addComponent(btnWithdrawMoney)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnWithdrawMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane3)
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane8.addTab("ถอนเงิน", jPanel40);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtCloseRemark.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCloseRemark.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCloseRemark.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtCloseRemark.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCloseRemarkKeyPressed(evt);
            }
        });

        jLabel71.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel71.setText("บาท");

        txtStartDateOpenSaveAccount.setEditable(false);
        txtStartDateOpenSaveAccount.setBackground(new java.awt.Color(255, 255, 204));
        txtStartDateOpenSaveAccount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtStartDateOpenSaveAccount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtStartDateOpenSaveAccount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtSaveCloseBalance.setEditable(false);
        txtSaveCloseBalance.setBackground(new java.awt.Color(255, 255, 204));
        txtSaveCloseBalance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSaveCloseBalance.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSaveCloseBalance.setText("0.00");
        txtSaveCloseBalance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtSaveCloseInterest.setEditable(false);
        txtSaveCloseInterest.setBackground(new java.awt.Color(255, 255, 204));
        txtSaveCloseInterest.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSaveCloseInterest.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSaveCloseInterest.setText("0.00");
        txtSaveCloseInterest.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel73.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel73.setText("วันที่เปิดบัญชี");

        jLabel74.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel74.setText("จำนวนดอกเบี้ย");

        jLabel76.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel76.setText("ยอดเงินในบัญชี");

        jLabel77.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel77.setText("สาเหตูการปิดบัญชี");

        jLabel101.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel101.setText("บาท");

        jLabel128.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel128.setText("จำนวนเงินที่รับคืน");

        txTotalMoneyClose.setEditable(false);
        txTotalMoneyClose.setBackground(new java.awt.Color(255, 255, 204));
        txTotalMoneyClose.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txTotalMoneyClose.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txTotalMoneyClose.setText("0.00");
        txTotalMoneyClose.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel134.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel134.setText("บาท");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("เลขที่ใบแจ้งปิดบัญชี");

        txtCloseAccountDocNo.setEditable(false);
        txtCloseAccountDocNo.setBackground(new java.awt.Color(255, 255, 204));
        txtCloseAccountDocNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCloseAccountDocNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCloseAccountDocNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtCloseAccountDocNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCloseAccountDocNoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel128, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel74, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel76, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel77, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel73, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCloseRemark, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStartDateOpenSaveAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txTotalMoneyClose, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSaveCloseInterest, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel71)
                            .addComponent(jLabel134)))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(txtSaveCloseBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel101)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCloseAccountDocNo, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73)
                    .addComponent(txtStartDateOpenSaveAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtCloseAccountDocNo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(txtCloseRemark, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(txtSaveCloseBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel101))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(txtSaveCloseInterest, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel71))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel128)
                    .addComponent(txTotalMoneyClose, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel134))
                .addContainerGap())
        );

        btnCloseSaveAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCloseSaveAccount.setText("ยืนยันปิดบัญชี");
        btnCloseSaveAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseSaveAccountActionPerformed(evt);
            }
        });
        btnCloseSaveAccount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCloseSaveAccountKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCloseSaveAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(258, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCloseSaveAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel46.setBackground(new java.awt.Color(255, 204, 204));

        lblCloseAccountTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCloseAccountTitle.setText("ปิดบัญชีเงินฝาก");

        lbAccountNumber2.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        lbAccountNumber2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbAccountNumber2.setText("jLabel2");

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCloseAccountTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbAccountNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCloseAccountTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAccountNumber2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane8.addTab("ปิดบัญชีเงินฝาก", jPanel15);

        jPanel56.setBackground(new java.awt.Color(255, 204, 153));
        jPanel56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel57.setBackground(new java.awt.Color(255, 255, 255));
        jPanel57.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel104.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel104.setText("รวมทั้งหมด");

        jLabel103.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel103.setText("------------------------------------");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel30.setText("บัญชีทั้งหมด");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel31.setText("เงินฝากทั้งหมด");

        jLabel105.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel105.setText("====================");

        jLabel102.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel102.setText("ดอกเบี้ยสะสม");

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(204, 255, 204));
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField2.setText("0");
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(204, 255, 204));
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField3.setText("0.00");
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(204, 255, 204));
        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField4.setText("0.00");
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(204, 255, 204));
        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField5.setText("0.00");
        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel106.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel106.setText("บัญชี");

        jLabel107.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel107.setText("บาท");

        jLabel108.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel108.setText("บาท");

        jLabel109.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel109.setText("บาท");

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel57Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel104)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31)
                            .addComponent(jLabel102))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel109)
                            .addComponent(jLabel106)
                            .addComponent(jLabel107)
                            .addComponent(jLabel108)))
                    .addGroup(jPanel57Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel57Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel106))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel107))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel102)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel108))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel103)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel104)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel109))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel105))
        );

        jPanel58.setBackground(new java.awt.Color(255, 255, 255));
        jPanel58.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel110.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel110.setText("ยอดรายวัน");

        jLabel111.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel111.setText("-------------------------------------");

        jLabel112.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel112.setText("เปิดบัญชีวันนี้");

        jLabel113.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel113.setText("ฝากเงินวันนี้");

        jLabel114.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel114.setText("====================");

        jLabel115.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel115.setText("ถอนเงินวันนี้");

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(204, 255, 204));
        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField7.setText("0");
        jTextField7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(204, 255, 204));
        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField8.setText("0.00");
        jTextField8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(204, 255, 204));
        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField9.setText("0.00");
        jTextField9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(204, 255, 204));
        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField10.setText("0.00");
        jTextField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel116.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel116.setText("บัญชี");

        jLabel117.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel117.setText("บาท");

        jLabel118.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel118.setText("บาท");

        jLabel119.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel119.setText("บาท");

        jLabel122.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel122.setText("ปิดบัญชีวันนี้");

        jTextField12.setEditable(false);
        jTextField12.setBackground(new java.awt.Color(204, 255, 204));
        jTextField12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField12.setText("0");
        jTextField12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel123.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel123.setText("บัญชี");

        jLabel124.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel124.setText("ค่าธรรมเนียม");

        jTextField13.setEditable(false);
        jTextField13.setBackground(new java.awt.Color(204, 255, 204));
        jTextField13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField13.setText("0.00");
        jTextField13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel133.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel133.setText("บาท");

        jLabel136.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel136.setText("====================");

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel124)
                    .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel122)
                        .addComponent(jLabel112)
                        .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel115)
                            .addComponent(jLabel113)))
                    .addComponent(jLabel110))
                .addGap(18, 18, 18)
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel133)
                    .addComponent(jLabel123)
                    .addComponent(jLabel117)
                    .addComponent(jLabel118)
                    .addComponent(jLabel116)
                    .addComponent(jLabel119))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel114, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel136, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel112)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel116))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel122)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel123))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel113)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel117))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel115)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel118))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel111)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel110)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel119))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel114)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel124)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel133))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel136))
        );

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel58, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel57, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        tbTransSave.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "เลขที่เอกสาร", "วันที่", "เวลา", "ฝากเงิน", "ถอนเงิน", "เงินต้นคงเหลือ", "หมายเหตุ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbTransSave.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane4.setViewportView(tbTransSave);
        if (tbTransSave.getColumnModel().getColumnCount() > 0) {
            tbTransSave.getColumnModel().getColumn(0).setPreferredWidth(100);
            tbTransSave.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbTransSave.getColumnModel().getColumn(2).setPreferredWidth(100);
            tbTransSave.getColumnModel().getColumn(5).setPreferredWidth(120);
            tbTransSave.getColumnModel().getColumn(6).setPreferredWidth(250);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4)
                    .addComponent(jTabbedPane8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDepCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDepCodeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtDepositBaht.requestFocus();
        }
    }//GEN-LAST:event_txtDepCodeKeyPressed

    private void txtDepositBahtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDepositBahtFocusGained
        txtDepositBaht.selectAll();
    }//GEN-LAST:event_txtDepositBahtFocusGained

    private void txtDepositBahtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDepositBahtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtRemark1.requestFocus();
        }
    }//GEN-LAST:event_txtDepositBahtKeyPressed

    private void txtDepositBahtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDepositBahtKeyReleased
        if (txtDepositBaht.getText().trim().length() != 0) {
            double d = NumberFormat.toDouble(txtDepositBaht.getText());
            MoneyToWord c = new MoneyToWord(d);
            lbMoneyText.setText("(" + c.toString() + ")");
            return;
        }
        lbMoneyText.setText("(...)");
    }//GEN-LAST:event_txtDepositBahtKeyReleased

    private void txtRemark1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRemark1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSaveMoney.requestFocus();
        }
    }//GEN-LAST:event_txtRemark1KeyPressed

    private void txtDepositDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDepositDateMouseClicked
        if (evt.getClickCount() == 2) {
            Point point = txtDepositDate.getLocationOnScreen();
            point.setLocation(point.getX(), point.getY());
            DateChooseDialog dcd = new DateChooseDialog(null, true, point);
            dcd.setVisible(true);

            if (dcd.getSelectDate() != null) {
                txtDepositDate.setText(dcd.getDateString());
                txtDepositDate.requestFocus();
            }
        }
    }//GEN-LAST:event_txtDepositDateMouseClicked

    private void btnSaveMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveMoneyActionPerformed
        saveAccountAct();
    }//GEN-LAST:event_btnSaveMoneyActionPerformed

    private void btnSaveMoneyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSaveMoneyKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            saveAccountAct();
        }
    }//GEN-LAST:event_btnSaveMoneyKeyPressed

    private void btnTransactionSaveDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransactionSaveDialogActionPerformed
        if (!"".equals(saveAccountBean.getAccount_code()) && !"".equals(profileBean.getP_custCode())) {
            TransactionAdvanceDialog transactionAdvanceDialog = new TransactionAdvanceDialog(null, true);
            double balanceAmt = NumberFormat.toDouble(txtBalance.getText());
            double intAmt = NumberFormat.toDouble(txtBalanceInterest.getText());
            transactionAdvanceDialog.initFormValues(profileBean.getP_custCode(), saveAccountBean.getAccount_code(), balanceAmt, intAmt);
            transactionAdvanceDialog.setVisible(true);
        }
    }//GEN-LAST:event_btnTransactionSaveDialogActionPerformed

    private void txtWithdrawalCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWithdrawalCodeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtWithdrawalBaht.requestFocus();
        }
    }//GEN-LAST:event_txtWithdrawalCodeKeyPressed

    private void txtWithdrawalBahtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtWithdrawalBahtFocusGained
        showDocAuto3();
        txtWithdrawalBaht.selectAll();
    }//GEN-LAST:event_txtWithdrawalBahtFocusGained

    private void txtWithdrawalBahtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWithdrawalBahtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtRemark2.requestFocus();
        }
    }//GEN-LAST:event_txtWithdrawalBahtKeyPressed

    private void txtWithdrawalBahtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWithdrawalBahtKeyReleased
        if (txtWithdrawalBaht.getText().trim().length() != 0) {
            MoneyToWord c = new MoneyToWord(NumberFormat.toDouble(txtWithdrawalBaht.getText()));
            lbMoneyText1.setText("(" + c.toString() + ")");
        } else {
            lbMoneyText1.setText("(...)");
        }
    }//GEN-LAST:event_txtWithdrawalBahtKeyReleased

    private void txtRemark2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRemark2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnWithdrawMoney.requestFocus();
        }
    }//GEN-LAST:event_txtRemark2KeyPressed

    private void txtWithdrawDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtWithdrawDateMouseClicked
        if (evt.getClickCount() == 2) {
            Point point = txtWithdrawDate.getLocationOnScreen();
            point.setLocation(point.getX(), point.getY());
            DateChooseDialog dcd = new DateChooseDialog(null, true, point);
            dcd.setVisible(true);

            if (dcd.getSelectDate() != null) {
                txtWithdrawDate.setText(dcd.getDateString());
                txtWithdrawDate.requestFocus();
            }
        }
    }//GEN-LAST:event_txtWithdrawDateMouseClicked

    private void btnWithdrawMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawMoneyActionPerformed
        btnWithdrawMoney();
    }//GEN-LAST:event_btnWithdrawMoneyActionPerformed

    private void btnWithdrawMoneyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnWithdrawMoneyKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnWithdrawMoney();
        }
    }//GEN-LAST:event_btnWithdrawMoneyKeyPressed

    private void txtCloseRemarkKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCloseRemarkKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnCloseSaveAccount.requestFocus();
        }
    }//GEN-LAST:event_txtCloseRemarkKeyPressed

    private void btnCloseSaveAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseSaveAccountActionPerformed
        int confirm = MessageAlert.showConfirm(this, "ท่านต้องการยกเลิกบัญชีนี้ใช่หรือไม่ ?");
        if (confirm == MessageAlert.YES_OPTION) {
            closeAccount();
        }
    }//GEN-LAST:event_btnCloseSaveAccountActionPerformed

    private void btnCloseSaveAccountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCloseSaveAccountKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            int confirm = MessageAlert.showConfirm(this, "ท่านต้องการยกเลิกบัญชีนี้ใช่หรือไม่ ?");
            if (confirm == MessageAlert.YES_OPTION) {
                closeAccount();
            }
        }
    }//GEN-LAST:event_btnCloseSaveAccountKeyPressed

    private void jTabbedPane8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane8MouseClicked
        int tabSelected = jTabbedPane8.getSelectedIndex();
        if (tabSelected != -1) {
            switch (tabSelected) {
                case 0:
                    txtDepositBaht.requestFocus();
                    break;
                case 1:
                    txtWithdrawalBaht.requestFocus();
                    break;
                case 2:
                    txtCloseRemark.requestFocus();
                    break;
                default:
                    break;
            }
        }
    }//GEN-LAST:event_jTabbedPane8MouseClicked

    private void txtCloseAccountDocNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCloseAccountDocNoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCloseAccountDocNoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BookPageAt;
    private javax.swing.JButton btnCloseSaveAccount;
    private javax.swing.JButton btnSaveMoney;
    private javax.swing.JButton btnTransactionSaveDialog;
    private javax.swing.JButton btnWithdrawMoney;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane8;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lbAccountNumber;
    private javax.swing.JLabel lbAccountNumber1;
    private javax.swing.JLabel lbAccountNumber2;
    private javax.swing.JLabel lbMoneyText;
    private javax.swing.JLabel lbMoneyText1;
    private javax.swing.JLabel lblCloseAccountTitle;
    private javax.swing.JLabel lblSaveAccountTitle;
    private javax.swing.JLabel lblWithdrawAccountTitle;
    private javax.swing.JTable tbTransSave;
    private javax.swing.JTextField txTotalMoneyClose;
    private javax.swing.JTextField txtAccCodeLoad;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtBalanceInterest;
    private javax.swing.JTextField txtBalanceTotal;
    private javax.swing.JTextField txtBookPage;
    private javax.swing.JTextField txtCloseAccountDocNo;
    private javax.swing.JTextField txtCloseRemark;
    private javax.swing.JTextField txtDepCode;
    private javax.swing.JTextField txtDepositBaht;
    private javax.swing.JTextField txtDepositDate;
    private javax.swing.JTextField txtRemark1;
    private javax.swing.JTextField txtRemark2;
    private javax.swing.JTextField txtSaveCloseBalance;
    private javax.swing.JTextField txtSaveCloseInterest;
    private javax.swing.JTextField txtStartDateOpenSaveAccount;
    private javax.swing.JTextField txtWithdrawAccTypeName;
    private javax.swing.JTextField txtWithdrawDate;
    private javax.swing.JTextField txtWithdrawalBaht;
    private javax.swing.JTextField txtWithdrawalCode;
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

    private int getPage(int pageAt) {
        int page = 0;
        if (pageAt <= 24) {
            page = 1;
        } else if (pageAt <= 48) {
            page = 2;
        } else if (pageAt <= 72) {
            page = 3;
        } else if (pageAt <= 96) {
            page = 4;
        } else if (pageAt <= 120) {
            page = 5;
        } else if (pageAt <= 144) {
            page = 6;
        } else if (pageAt <= 168) {
            page = 7;
        } else if (pageAt <= 192) {
            page = 8;
        } else if (pageAt <= 216) {
            page = 9;
        } else if (pageAt <= 240) {
            page = 10;
        } else if (pageAt <= 264) {
            page = 11;
        } else if (pageAt <= 288) {
            page = 12;
        } else if (pageAt <= 312) {
            page = 13;
        } else if (pageAt <= 336) {
            page = 14;
        } else if (pageAt <= 360) {
            page = 15;
        } else if (pageAt <= 384) {
            page = 16;
        } else if (pageAt <= 408) {
            page = 17;
        } else if (pageAt <= 432) {
            page = 18;
        } else if (pageAt <= 456) {
            page = 19;
        } else if (pageAt <= 480) {
            page = 20;
        }

        return page;
    }

    private void initData() {
        if (saveAccountBean != null) {
            lbAccountNumber.setText("เลขที่บัญชี " + saveAccountBean.getAccount_code());
            lbAccountNumber1.setText("เลขที่บัญชี " + saveAccountBean.getAccount_code());
            lbAccountNumber2.setText("เลขที่บัญชี " + saveAccountBean.getAccount_code());

            txtBalance.setText(NumberFormat.showDouble2(saveAccountBean.getB_BALANCE()));
            txtBalanceTotal.setText(NumberFormat.showDouble2(saveAccountBean.getB_BALANCE()));
            txtBalanceInterest.setText(NumberFormat.showDouble2(saveAccountBean.getB_INTEREST()));
            txtAccCodeLoad.setText(saveAccountBean.getAccount_type());

            txtSaveCloseBalance.setText(NumberFormat.showDouble2(saveAccountBean.getB_BALANCE()));
            txTotalMoneyClose.setText(NumberFormat.showDouble2(saveAccountBean.getB_BALANCE() + saveAccountBean.getB_INTEREST()));
            txtSaveCloseInterest.setText(NumberFormat.showDouble2(saveAccountBean.getB_INTEREST()));

            int page = getPage(cbTransactionSaveControl.getMaxIndex(saveAccountBean.getAccount_code()));

            BookPageAt.setText("" + page);
            txtBookPage.setText("" + cbTransactionSaveControl.getLineByAccount(saveAccountBean.getAccount_code()));

            txtWithdrawalCode.setText("");
            txtDepositDate.setText(DateFormat.getLocale_ddMMyyyy(new Date()));
            txtWithdrawDate.setText(DateFormat.getLocale_ddMMyyyy(new Date()));
            txtStartDateOpenSaveAccount.setText(DateFormat.getLocale_ddMMyyyy(new Date()));

            loadTransactionPerson(saveAccountBean.getAccount_code());
            loadSummary();

            txtDepositBaht.requestFocus();
        }
    }

    private void saveAccountAct() {
        double balance = NumberFormat.toDouble(txtDepositBaht.getText());
        if (balance <= 0) {
            txtDepositBaht.requestFocus();
            return;
        }

        if (balance <= cbSaveConfigBean.getMinDeposit()) {
            MessageAlert.warningPopup(this, "ท่านต้องฝากเงินไม่ต่ำกว่า " + cbSaveConfigBean.getMinDeposit());
            txtDepositBaht.requestFocus();
            return;
        }

        try {
            depositMoney();
        } catch (Exception e) {
            MessageAlert.errorPopup(this, e.getMessage());
            logger.error(e.getMessage());
        }
    }

    private void depositMoney() throws Exception {

        // 02/10/2021
        // update balane all transaction before action
//        CbSaveAccountControl.updateSummaryBalanceFromTransaction(profileCode, saveAccountBean.getAccount_code());
        //update balance account
        String dMoney = txtDepositBaht.getText();
        String newDepositNo;
        if ("Y".equals(configBean.getBranchPrefix())) {
            BranchBean branchBean = branchControl.getData();
            newDepositNo = branchBean.getCode() + configBean.getSaveDocPrefix() + getRunning(configBean.getSaveDocRunning());
        } else {
            newDepositNo = configBean.getSaveDocPrefix() + getRunning(configBean.getSaveDocRunning());
        }

        //update transactoin        
        CbTransactionSaveBean transactionSaveBean = new CbTransactionSaveBean();
        transactionSaveBean.setT_date(DateFormat.getLocal_ddMMyyyy(txtDepositDate.getText()));
        transactionSaveBean.setT_acccode(saveAccountBean.getAccount_code());
        transactionSaveBean.setT_custcode(profileBean.getP_custCode());
        transactionSaveBean.setT_description("ฝากเงิน");
        transactionSaveBean.setT_status(AppConstants.CB_STATUS_SAVE);
        transactionSaveBean.setT_amount(NumberFormat.toDouble(dMoney));
        transactionSaveBean.setMoney_in(NumberFormat.toDouble(dMoney));
        transactionSaveBean.setMoney_out(0.00);
        transactionSaveBean.setT_empcode(Value.USER_CODE);
        transactionSaveBean.setT_docno(newDepositNo);
        transactionSaveBean.setRemark(txtRemark1.getText());
        transactionSaveBean.setT_booktype(configBean.getSaveDocPrefix());
        transactionSaveBean.setLineNo(cbTransactionSaveControl.getLineByAccount(saveAccountBean.getAccount_code()));
        transactionSaveBean.setPrintChk("N");
        transactionSaveBean.setT_index(cbTransactionSaveControl.getMaxIndex(saveAccountBean.getAccount_code()));
        transactionSaveBean.setT_interest(0.00);
        transactionSaveBean.setBranchCode(Value.BRANCH_CODE);
        transactionSaveBean.setT_balance(saveAccountBean.getB_BALANCE() + transactionSaveBean.getMoney_in());

        transactionSaveBean.setT_hoon(profileBean.getHoon_Qty());
        transactionSaveBean.setT_fee(0);

        if (cbTransactionSaveControl.saveCbTransactionSave(transactionSaveBean)) {
            txtDepCode.setText(newDepositNo);

            String sql = "update cb_save_account set B_Balance = B_Balance+" + dMoney + " where account_code='" + saveAccountBean.getAccount_code() + "'";
            saveAccountControl.update(sql);

            String sql2 = "update cb_profile set Save_Balance=Save_Balance+" + dMoney + " where P_CustCode='" + profileBean.getP_custCode() + "'";
            profileControl.update(sql2);

            sql = "update cb_config set SaveDocRunning=SaveDocRunning+1";
            configControl.update(sql);

            MessageAlert.infoPopup(this, "บันทึกข้อมูลการฝากเงินเรียบร้อยแล้ว");
            TransactionAdvanceMethod.updateSaveAccountAndProfile(profileBean.getP_custCode(), saveAccountBean.getAccount_code(), transactionSaveBean.getT_balance(), transactionSaveBean.getT_interest());

            //load transaction
            loadTransactionPerson(saveAccountBean.getAccount_code());

            loadSummary();

            PrintSlipBean printSlipBean = new PrintSlipBean();
            printSlipBean.setAccountName(profileBean.getP_custName() + " " + profileBean.getP_custSurname());
            printSlipBean.setAccountCode(saveAccountBean.getAccount_code());

            SimpleDateFormat simpShort = new SimpleDateFormat("dd/MM/yy");
            SimpleDateFormat simpTime = new SimpleDateFormat("hh:mm:ss");

            printSlipBean.setTranDate(simpShort.format(new Date()));
            printSlipBean.setTranTime(simpTime.format(new Date()));
            printSlipBean.setEmpCode(Value.USER_CODE);
            printSlipBean.setAmount(NumberFormat.showDouble2(transactionSaveBean.getT_amount()));
            printSlipBean.setDocNo(newDepositNo);

            ListSaveConfirmDialog listD = new ListSaveConfirmDialog(null, true, printSlipBean);
            listD.setVisible(true);

            clearDeposit();

            lbMoneyText.setText("(...)");
            txtDepositBaht.requestFocus();
        } else {
            MessageAlert.errorPopup(this, "พบข้อมูลผิดพลาดไม่สามารถบันทึกข้อมูลการฝากเงินได้ !");
            logger.error("พบข้อมูลผิดพลาดไม่สามารถบันทึกข้อมูลการฝากเงินได้ !");
        }
    }

    public void loadTransactionPerson(String accoutCode) {
        String where = " and t_acccode='" + accoutCode + "' "
                + "and t_status in('2','3','8','11') "
                + "order by t_date desc,t_time desc ";
        List<CbTransactionSaveBean> listSave = cbTransactionSaveControl.listTransactionSave(where);
        DefaultTableModel modelTbTransSave = (DefaultTableModel) tbTransSave.getModel();
        JTableUtil.alignRight(tbTransSave, 3);
        JTableUtil.alignRight(tbTransSave, 4);
        JTableUtil.alignRight(tbTransSave, 5);
        TableUtil.clearModel(modelTbTransSave);
        String type = "";
        for (CbTransactionSaveBean sBean : listSave) {
            double deposit = 0;
            double withdraw = 0;
            if (null != sBean.getT_status()) {
                switch (sBean.getT_status()) {
                    case AppConstants.CB_STATUS_SAVE:
                    case "11":
                        type = "ฝากเงิน";
                        deposit = sBean.getT_amount();
                        break;
                    case AppConstants.CB_STATUS_WITHDRAW:
                        type = "ถอนเงิน";
                        withdraw = sBean.getT_amount();
                        break;
                    case AppConstants.CB_STATUS_CLOSE_SAVE:
                        type = "ปิดบัญชี";
                        withdraw = sBean.getT_amount();
                        break;
                    default:
                        break;
                }
            }

            String desc;
            if ("INT".equals(sBean.getT_booktype())) {
                desc = "<html><font color=green>ดอกเบี้ยฝาก</font></html>";
            } else {
                desc = sBean.getT_description();
            }

            modelTbTransSave.addRow(new Object[]{
                sBean.getT_docno(),
                DateFormat.getLocale_ddMMyyyy(sBean.getT_date()),
                sBean.getT_time(),
                NumberFormat.showDouble2(deposit),
                NumberFormat.showDouble2(withdraw),
                NumberFormat.showDouble2(sBean.getT_balance()),
                desc
            });
        }
    }

    private void resetDepositMoney() {
        txtDepositBaht.setText("0.00");
        lbMoneyText.setText("(...)");
        txtAccCodeLoad.setText("");

        txtDepositBaht.requestFocus();
    }

    private void showDocAuto3() {
        initWithdraw();
        txtWithdrawalBaht.requestFocus();
    }

    private void initWithdraw() {
        txtBalanceTotal.setText(NumberFormat.showDouble2(saveAccountBean.getB_BALANCE()));
        txtWithdrawAccTypeName.setText(saveAccountBean.getAccount_type());
        lbMoneyText.setText("(...)");
    }

    private void btnWithdrawMoney() {
        double balanceTotal = NumberFormat.toDouble(txtBalanceTotal.getText());
        double withdrawAmount = NumberFormat.toDouble(txtWithdrawalBaht.getText());
        if (withdrawAmount <= 0) {
            txtWithdrawalBaht.requestFocus();
            return;
        }
        if (withdrawAmount < cbSaveConfigBean.getMinWitdraw()) {
            MessageAlert.warningPopup(this, "ท่านต้องถอนเงินไม่ต่ำกว่า " + cbSaveConfigBean.getMinWitdraw());
            txtWithdrawalBaht.requestFocus();
            return;
        }
        if (withdrawAmount > balanceTotal) {
            MessageAlert.warningPopup(this, "จำนวนเงินที่ต้องการถอนมากกว่า จำนวนเงินที่มีในระบบ");
            txtWithdrawalBaht.requestFocus();
            return;
        }
        if (!checkAllowWithdraw()) {
            MessageAlert.warningPopup(this, "ท่านไม่มีสิทธิ์ถอนเงิน หรือระบุจำนวนสมาชิกที่สามารถถอนได้ไม่ครบถ้วน !");
            txtWithdrawalBaht.requestFocus();
            return;
        }
        withdrawAccountAct();
    }

    private void withdrawAccountAct() {
        double total = NumberFormat.toDouble(txtBalanceTotal.getText());
        double balance = NumberFormat.toDouble(txtWithdrawalBaht.getText());
        if (balance > 0 && balance <= total) {
            withdraw();
            return;
        }
        if (balance > total) {
            MessageAlert.warningPopup(this, "จำนวนเงินที่ท่านต้องการถอนมีมากกว่าจำนวนเงินคงเหลือในบัญชี !");
            txtWithdrawalBaht.requestFocus();
            return;
        }

        txtWithdrawalCode.requestFocus();
    }

    private void withdraw() {
        double withdrawalBahtAmt = NumberFormat.toDouble(txtWithdrawalBaht.getText());
        if (withdrawalBahtAmt < 0) {
            txtWithdrawalBaht.requestFocus();
        }

        // 02/10/2021
        // update balane all transaction before action
//        CbSaveAccountControl.updateSummaryBalanceFromTransaction(profileBean.getP_custCode(), saveAccountBean.getAccount_code());
        //update balance account
        String wMoney = txtWithdrawalBaht.getText();
        try {
            String withdrawDoc;
            if ("Y".equals(configBean.getBranchPrefix())) {
                BranchBean branchBean = branchControl.getData();
                withdrawDoc = branchBean.getCode() + configBean.getWithdrawDocPrefix() + getRunning(configBean.getWithdrawDocRunning());
            } else {
                withdrawDoc = configBean.getWithdrawDocPrefix() + getRunning(configBean.getWithdrawDocRunning());
            }

            CbTransactionSaveBean cbTransactionSaveBean = new CbTransactionSaveBean();
            cbTransactionSaveBean.setT_date(DateFormat.getLocal_ddMMyyyy(txtWithdrawDate.getText()));
            cbTransactionSaveBean.setT_acccode(saveAccountBean.getAccount_code());
            cbTransactionSaveBean.setT_custcode(profileBean.getP_custCode());
            cbTransactionSaveBean.setT_description("ถอนเงิน");
            cbTransactionSaveBean.setT_status(AppConstants.CB_STATUS_WITHDRAW);
            cbTransactionSaveBean.setT_amount(-NumberFormat.toDouble(wMoney));
            cbTransactionSaveBean.setMoney_in(0.00);
            cbTransactionSaveBean.setMoney_out(NumberFormat.toDouble(wMoney));
            cbTransactionSaveBean.setT_empcode(Value.USER_CODE);
            cbTransactionSaveBean.setT_docno(withdrawDoc);
            cbTransactionSaveBean.setRemark(txtRemark2.getText());
            cbTransactionSaveBean.setT_booktype(configBean.getWithdrawDocPrefix());
            cbTransactionSaveBean.setT_interest(0.00);
            cbTransactionSaveBean.setLineNo(cbTransactionSaveControl.getLineByAccount(saveAccountBean.getAccount_code()));
            cbTransactionSaveBean.setPrintChk("N");
            cbTransactionSaveBean.setT_index(cbTransactionSaveControl.getMaxIndex(saveAccountBean.getAccount_code()));
            cbTransactionSaveBean.setT_balance(saveAccountBean.getB_BALANCE() - cbTransactionSaveBean.getMoney_out());
            cbTransactionSaveBean.setT_hoon(profileBean.getHoon_Qty());
            cbTransactionSaveBean.setBranchCode(Value.BRANCH_CODE);
            cbTransactionSaveBean.setT_fee(0);

            if (cbTransactionSaveControl.saveCbTransactionSave(cbTransactionSaveBean)) {
                txtWithdrawalCode.setText(withdrawDoc);

                String sql = "update cb_save_account set "
                        + "B_Balance = B_Balance-" + wMoney + " "
                        + "where account_code='" + saveAccountBean.getAccount_code() + "';";
                saveAccountControl.update(sql);

                String sql2 = "update cb_profile set "
                        + "Save_Balance=Save_Balance-" + wMoney + " "
                        + "where P_CustCode='" + profileBean.getP_custCode() + "';";
                profileControl.update(sql2);

                sql = "update cb_config set WithdrawDocRunning=WithdrawDocRunning+1";
                configControl.update(sql);

                loadTransactionPerson(saveAccountBean.getAccount_code());
                MessageAlert.infoPopup(this, "บันทึกข้อมูลการถอนเงินเรียบร้อยแล้ว");
                TransactionAdvanceMethod.updateSaveAccountAndProfile(profileBean.getP_custCode(), saveAccountBean.getAccount_code(), cbTransactionSaveBean.getT_balance(), cbTransactionSaveBean.getT_interest());

                loadSummary();

                PrintSlipBean printSlipBean = new PrintSlipBean();
                printSlipBean.setAccountName(profileBean.getP_custName() + " " + profileBean.getP_custSurname());
                printSlipBean.setAccountCode(saveAccountBean.getAccount_code());

                SimpleDateFormat simpShort = new SimpleDateFormat("dd/MM/yy");
                SimpleDateFormat simpTime = new SimpleDateFormat("hh:mm:ss");

                printSlipBean.setTranDate(simpShort.format(new Date()));
                printSlipBean.setTranTime(simpTime.format(new Date()));
                printSlipBean.setEmpCode(Value.USER_CODE);
                printSlipBean.setAmount(NumberFormat.showDouble2(cbTransactionSaveBean.getMoney_out()));
                printSlipBean.setDocNo(withdrawDoc);

                ListWithdrawConfirmDialog listWithdrawConfirmDialog = new ListWithdrawConfirmDialog(null, true, printSlipBean);
                listWithdrawConfirmDialog.setVisible(true);

                clearWithdraw();

                lbMoneyText1.setText("(...)");
                jTabbedPane8.setSelectedIndex(1);
                txtWithdrawalBaht.requestFocus();
            }
        } catch (HeadlessException e) {
            MessageAlert.errorPopup(this, e.getMessage());
            logger.error(e.getMessage());
        }
    }

    private boolean checkAllowWithdraw() {
        String accCodeCheck = saveAccountBean.getAccount_code();
        if ("2".equals(profileBean.getP_member_type())) {//ประเภทกลุ่ม
            accCodeCheck = profileBean.getP_custCode();

            List<CbWithdrawAllowBean> listBean = cbWithdrawAllowControl.listCbWithdrawAllow(accCodeCheck);
            InputWithdrawDialog inputDialog = new InputWithdrawDialog(null, true, listBean);
            inputDialog.setVisible(true);

            return inputDialog.allowPerson();
        } else {
            List<CbWithdrawAllowBean> listBean = new ArrayList<>();
            CbWithdrawAllowBean bean = new CbWithdrawAllowBean();
            bean.setAccount_no(accCodeCheck);
            bean.setCust_code(profileBean.getP_custCode());
            bean.setIndex(1);

            listBean.add(bean);

            InputWithdrawDialog inputWithdrawDialog = new InputWithdrawDialog(null, true, listBean);
            inputWithdrawDialog.setVisible(true);

            return inputWithdrawDialog.allowPerson();
        }

    }

    private void clearWithdraw() {
        saveAccountBean = saveAccountControl.getSaveAccountBean(saveAccountBean.getAccount_code());
        txtBalanceTotal.setText(NumberFormat.showDouble2(saveAccountBean.getB_BALANCE()));
        txtWithdrawalBaht.setText("0.00");
        txtRemark2.setText("");
        lbMoneyText1.setText("(...)");
        txtWithdrawDate.setText(DateFormat.getLocale_ddMMyyyy(new Date()));

        txtSaveCloseBalance.setText(NumberFormat.showDouble2(saveAccountBean.getB_BALANCE()));
        txtSaveCloseInterest.setText(NumberFormat.showDouble2(saveAccountBean.getB_INTEREST()));
        txTotalMoneyClose.setText(NumberFormat.showDouble2(saveAccountBean.getB_BALANCE() + saveAccountBean.getB_INTEREST()));

        txtWithdrawalCode.requestFocus();
    }

    private void closeAccount() {
        // 02/10/2021
        // update balane all transaction before action
//        CbSaveAccountControl.updateSummaryBalanceFromTransaction(profileBean.getP_custCode(), saveAccountBean.getAccount_code());

        //update balance account
        String cMoney = txTotalMoneyClose.getText();
        try {
            String closeAccountDocNo;
            if ("Y".equals(configBean.getBranchPrefix())) {
                BranchBean branchBean = branchControl.getData();
                closeAccountDocNo = branchBean.getCode() + configBean.getWithdrawDocPrefix() + getRunning(configBean.getWithdrawDocRunning());
            } else {
                closeAccountDocNo = configBean.getWithdrawDocPrefix() + getRunning(configBean.getWithdrawDocRunning());
            }

            CbTransactionSaveBean cbTransactionSaveBean = new CbTransactionSaveBean();
            cbTransactionSaveBean.setT_date(new Date());
            cbTransactionSaveBean.setT_acccode(saveAccountBean.getAccount_code());
            cbTransactionSaveBean.setT_custcode(profileBean.getP_custCode());
            cbTransactionSaveBean.setT_description("ปิดบัญชี");
            cbTransactionSaveBean.setT_status(AppConstants.CB_STATUS_CLOSE_SAVE);
            cbTransactionSaveBean.setT_amount(-NumberFormat.toDouble(cMoney));
            cbTransactionSaveBean.setMoney_in(0.00);
            cbTransactionSaveBean.setMoney_out(NumberFormat.toDouble(cMoney));
            cbTransactionSaveBean.setT_empcode(Value.USER_CODE);
            cbTransactionSaveBean.setT_docno(closeAccountDocNo);
            cbTransactionSaveBean.setRemark(txtCloseRemark.getText());
            cbTransactionSaveBean.setT_booktype(configBean.getWithdrawDocPrefix());
            cbTransactionSaveBean.setLineNo(cbTransactionSaveControl.getLineByAccount(saveAccountBean.getAccount_code()));
            cbTransactionSaveBean.setPrintChk("N");
            cbTransactionSaveBean.setT_index(cbTransactionSaveControl.getMaxIndex(saveAccountBean.getAccount_code()));
            cbTransactionSaveBean.setT_interest(0.00);
            cbTransactionSaveBean.setT_hoon(profileBean.getHoon_Qty());
            cbTransactionSaveBean.setBranchCode(Value.BRANCH_CODE);
            cbTransactionSaveBean.setT_fee(0);
            cbTransactionSaveBean.setT_balance(0);

            if (cbTransactionSaveControl.saveCbTransactionSave(cbTransactionSaveBean)) {
                saveAccountControl.updateAccountStatusAndRemark(AppConstants.CB_STATUS_CLOSE_SAVE, txtCloseRemark.getText(), saveAccountBean.getAccount_code());
                profileControl.updateSaveBalance(NumberFormat.toDouble(cMoney), profileBean.getP_custCode());
                configControl.updateWithdrawDocRunning();

                MessageAlert.infoPopup(this, "ดำเนินการปิดบัญชีเงินฝากเรียบร้อยแล้ว");
                btnCloseSaveAccount.setEnabled(false);
                loadSummary();

                PrintSlipBean printSlipBean = new PrintSlipBean();
                printSlipBean.setAccountName(profileBean.getP_custName() + " " + profileBean.getP_custSurname());
                printSlipBean.setAccountCode(saveAccountBean.getAccount_code());

                SimpleDateFormat simpShort = new SimpleDateFormat("dd/MM/yy");
                SimpleDateFormat simpTime = new SimpleDateFormat("hh:mm:ss");

                printSlipBean.setTranDate(simpShort.format(new Date()));
                printSlipBean.setTranTime(simpTime.format(new Date()));
                printSlipBean.setEmpCode(Value.USER_CODE);
                printSlipBean.setAmount(NumberFormat.showDouble2(cbTransactionSaveBean.getMoney_out()));

                ListCloseSaveConfirmDialog listCloseSaveConfirmDialog = new ListCloseSaveConfirmDialog(null, true, printSlipBean);
                listCloseSaveConfirmDialog.setVisible(true);
            }

        } catch (HeadlessException e) {
            MessageAlert.errorPopup(this, e.getMessage());
            logger.error(e.getMessage());
        }
    }

    private void loadSummary() {
        SaveSummaryBean saveSummaryBean = saveSummaryControl.getSaveData();

        jTextField2.setText("" + saveSummaryBean.getAccountAll());
        jTextField3.setText(NumberFormat.showDouble2(saveSummaryBean.getSaveAll()));
        jTextField4.setText(NumberFormat.showDouble2(saveSummaryBean.getInterestAll()));
        jTextField5.setText(NumberFormat.showDouble2(saveSummaryBean.getTotalBalanceAll()));

        jTextField7.setText("" + saveSummaryBean.getAccountToday());
        jTextField12.setText("" + saveSummaryBean.getCloseToday());
        jTextField8.setText(NumberFormat.showDouble2(saveSummaryBean.getSaveToday()));
        jTextField9.setText(NumberFormat.showDouble2(saveSummaryBean.getWithdrawToday()));
        jTextField10.setText(NumberFormat.showDouble2(saveSummaryBean.getTotalBalanceToday()));
        jTextField13.setText(NumberFormat.showDouble2(saveSummaryBean.getFeeToday()));
    }

    private void initLoadTable() {
        tbTransSave.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        tbTransSave.setRowHeight(30);
        JTableHeader tableHeader = tbTransSave.getTableHeader();
        tableHeader.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, AppConstants.DEFAULT_FONT_SIZE));
    }

    private void clearDeposit() {
        saveAccountBean = saveAccountControl.getSaveAccountBean(saveAccountBean.getAccount_code());
        txtBalance.setText(NumberFormat.showDouble2(saveAccountBean.getB_BALANCE()));
        txtBalanceInterest.setText(NumberFormat.showDouble2(saveAccountBean.getB_INTEREST()));

        txtSaveCloseBalance.setText(NumberFormat.showDouble2(saveAccountBean.getB_BALANCE()));
        txtSaveCloseInterest.setText(NumberFormat.showDouble2(saveAccountBean.getB_INTEREST()));
        txTotalMoneyClose.setText(NumberFormat.showDouble2(saveAccountBean.getB_BALANCE() + saveAccountBean.getB_INTEREST()));

        txtDepositBaht.setText("0.00");
        txtDepCode.setText("");
        txtDepositBaht.requestFocus();
    }

}
