package th.co.cbank.project.view;

import th.co.cbank.project.model.BranchBean;
import th.co.cbank.project.model.ProfileBean;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import org.apache.log4j.Logger;
import th.co.cbank.util.DateFormat;
import th.co.cbank.util.NumberFormat;
import th.co.cbank.project.constants.AppConstants;
import th.co.cbank.project.control.MySQLConnect;
import th.co.cbank.project.control.PrintCOM;
import th.co.cbank.project.control.Value;
import th.co.cbank.project.log.Log;
import th.co.cbank.project.model.CbLoanAccountBean;
import th.co.cbank.project.model.CbSaveAccountBean;
import th.co.cbank.project.report.view.DialyReportDialog;
import th.co.cbank.project.report.view.ReportInvoiceHoon;
import th.co.cbank.project.report.view.ReportOverdueAccountAndSummary;
import th.co.cbank.project.report.view.ReportOverdueAccountInterest;
import th.co.cbank.project.report.view.ReportPersonDetail;
import th.co.cbank.project.view.components.DepositPanel;
import th.co.cbank.project.view.components.HoonPanel;
import th.co.cbank.project.view.components.InitMainPanel;
import th.co.cbank.project.view.components.LoanPaymentPanel;
import th.co.cbank.project.view.components.NewDepositPanel;
import th.co.cbank.project.view.components.NewLoanPanel;
import th.co.cbank.util.ComponentUtil;
import th.co.cbank.util.MessageAlert;
import th.co.cbank.util.StringUtil;

public class MainDialog extends BaseSwing {

    private final Logger logger = Logger.getLogger(MainDialog.class);
    private final LoginDialog login;
    private boolean profileIsActive = false;

    private ProfileBean profileBean = null;

    private List<CbSaveAccountBean> listSaveAccounts = null;
    private List<CbLoanAccountBean> listLoanAccounts = null;

    private CbSaveAccountBean saveAccountBean = null;
    private CbLoanAccountBean loanAccountBean = null;
    private String selectAccountType = null;

    public MainDialog(java.awt.Frame parent, boolean modal) {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        System.out.println(this.getTitle());
        try {
            Image im = ImageIO.read(getClass().getResource("/img/deposit.png"));
            setIconImage(im);
        } catch (IOException ex) {
            MessageAlert.infoPopup(this.getClass(), ex.getMessage());
        }
        login = new LoginDialog(this, true);
        login.setVisible(true);

        clearFormAll();
        if (Value.USER_CODE.contains("admin")) {
            jMenuItem38.setVisible(true);
        } else {
            jMenuItem38.setVisible(false);
        }
        checkMenuLoadFile();
        txtProfileCode.requestFocus();
        setTabComponentAt(ApplicationTab.WELCOME);
    }

    private boolean cancelProfileStatus(ProfileBean profileBean) {
        String status = profileBean.getStatus();
        if ("Cancel".equals(status)) {
            JOptionPane.showMessageDialog(this, "รหัสผู้ใช้งานนี้ได้ถูกยกเลิกออกจากระบบแล้ว !", "สถานะสมาชิก [ยกเลิก]", JOptionPane.WARNING_MESSAGE);
            txtProfileCode.setText("");
            txtProfileCode.requestFocus();
            return true;
        }
        return false;
    }

    private enum ApplicationTab {
        WELCOME, NEW_DEPOSIT, DEPOSIT, WITHDRAW, BUY_HOON, SELL_HOON, TRANSFER_HOON, NEW_LOAN, PAYMENT
    };

    private void setTabComponentAt(ApplicationTab tabName) {
        switch (tabName) {
            case WELCOME:
                mainTabbedPane.setTitleAt(0, "Welcome");
                mainTabbedPane.setComponentAt(0, new InitMainPanel());
                break;
            case NEW_DEPOSIT:
                mainTabbedPane.setTitleAt(0, "<html><font color=white bgcolor=green>เปิดบัญชีเงินฝาก</font></html>");
                mainTabbedPane.setComponentAt(0, new NewDepositPanel(profileBean));
                break;
            case DEPOSIT:
                mainTabbedPane.setTitleAt(0, "<html><font color=white bgcolor=green>ฝาก/ถอน/ปิดบัญชี</font></html>");
                mainTabbedPane.setComponentAt(0, new DepositPanel(profileBean, saveAccountBean, 0));
                break;
            case WITHDRAW:
                mainTabbedPane.setTitleAt(0, "<html><font color=white bgcolor=green>ฝาก/ถอน/ปิดบัญชี</font></html>");
                mainTabbedPane.setComponentAt(0, new DepositPanel(profileBean, saveAccountBean, 1));
                break;
            case BUY_HOON:
                mainTabbedPane.setTitleAt(0, "<html><font bgcolor=yellow>ซื้อขายหุ้น</font></html>");
                mainTabbedPane.setComponentAt(0, new HoonPanel(profileBean, saveAccountBean, 0));
                break;
            case SELL_HOON:
                mainTabbedPane.setTitleAt(0, "<html><font bgcolor=yellow>ซื้อขายหุ้น</font></html>");
                mainTabbedPane.setComponentAt(0, new HoonPanel(profileBean, saveAccountBean, 1));
                break;
            case TRANSFER_HOON:
                mainTabbedPane.setTitleAt(0, "<html><font bgcolor=yellow>ซื้อขายหุ้น</font></html>");
                mainTabbedPane.setComponentAt(0, new HoonPanel(profileBean, saveAccountBean, 2));
                break;
            case NEW_LOAN:
                mainTabbedPane.setTitleAt(0, "<html><font bgcolor=red color=white>เปิดบัญชีเงินกู้</font></html>");
                mainTabbedPane.setComponentAt(0, new NewLoanPanel(profileBean, txtShowEmpCode.getText()));
                break;
            case PAYMENT:
                mainTabbedPane.setTitleAt(0, "<html><font bgcolor=red color=white>กู้เงิน/รับชำระ</font></html>");
                mainTabbedPane.setComponentAt(0, new LoanPaymentPanel(profileBean, loanAccountBean));
                break;
            default:
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        mainTabbedPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        leftProfilePanel = new javax.swing.JPanel();
        lbMemberCode = new javax.swing.JLabel();
        lbMemberName = new javax.swing.JLabel();
        txtProfileCode = new javax.swing.JTextField();
        txtProfileName = new javax.swing.JTextField();
        lbAccountLabel = new javax.swing.JLabel();
        txtAccCode = new javax.swing.JTextField();
        lbPic = new javax.swing.JLabel();
        summaryProfilePanel = new javax.swing.JPanel();
        txtLimitLoanAmt = new javax.swing.JTextField();
        lbHoonQtyLabel = new javax.swing.JLabel();
        lbBaht = new javax.swing.JLabel();
        lbDeposit = new javax.swing.JLabel();
        lbRegisterDate = new javax.swing.JLabel();
        lbDepositBaht = new javax.swing.JLabel();
        txtTotalHoon = new javax.swing.JTextField();
        lbLoanBalance = new javax.swing.JLabel();
        lbHoon = new javax.swing.JLabel();
        lbLoanBaht = new javax.swing.JLabel();
        txtTotalSave = new javax.swing.JTextField();
        txtLoanBalanceAmt = new javax.swing.JTextField();
        txtStartAcc = new javax.swing.JTextField();
        lbLoanLimit = new javax.swing.JLabel();
        lbCountAccount = new javax.swing.JLabel();
        txtTotalAccount = new javax.swing.JTextField();
        lbAccountCount = new javax.swing.JLabel();
        lbCountAccount1 = new javax.swing.JLabel();
        txtTotalLoanAccount = new javax.swing.JTextField();
        lbAccountCount1 = new javax.swing.JLabel();
        lbIndexNo = new javax.swing.JLabel();
        txtIndexNo = new javax.swing.JTextField();
        topMenuAction = new javax.swing.JPanel();
        btnRegister = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        txtBranchName = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        txtShowEmpName = new javax.swing.JTextField();
        txtShowEmpCode = new javax.swing.JTextField();
        txtMemQty = new javax.swing.JTextField();
        jPanel43 = new javax.swing.JPanel();
        btnTimeShow = new javax.swing.JButton();
        menuMain = new javax.swing.JMenuBar();
        mnSettings = new javax.swing.JMenu();
        mnConfigSystem = new javax.swing.JMenuItem();
        mnSetupConfig = new javax.swing.JMenuItem();
        mnMaster = new javax.swing.JMenu();
        mnMember = new javax.swing.JMenuItem();
        mnMemberType = new javax.swing.JMenuItem();
        mnExpense = new javax.swing.JMenuItem();
        mnProject = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnPrefix = new javax.swing.JMenuItem();
        mnStatus = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        mnFee = new javax.swing.JMenuItem();
        mnAccount = new javax.swing.JMenu();
        mnSaveAccount = new javax.swing.JMenuItem();
        mnLoanAccount = new javax.swing.JMenuItem();
        mnLoadExcel = new javax.swing.JMenuItem();
        mnProcess = new javax.swing.JMenu();
        mnSaveExpense = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        mnCloseDialoyDay = new javax.swing.JMenuItem();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        mnPrintHistorySave = new javax.swing.JMenuItem();
        mnSaveHistoryLoan = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        mnCancelOpenAccount = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        mnReport = new javax.swing.JMenu();
        mnRptMember = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        mnRptOpenAccount = new javax.swing.JMenuItem();
        mnRptCloseAccount = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        mnMainRptHoon = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        mnMainRptLoan = new javax.swing.JMenu();
        jMenuItem43 = new javax.swing.JMenuItem();
        jMenuItem44 = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        jMenuItem46 = new javax.swing.JMenuItem();
        jMenuItem45 = new javax.swing.JMenuItem();
        mnRptFee = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnRptProfitCompany = new javax.swing.JMenuItem();
        mnRptCheckAudit = new javax.swing.JMenuItem();
        jSeparator14 = new javax.swing.JPopupMenu.Separator();
        mnRptTransaction = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        mnHelp = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem38 = new javax.swing.JMenuItem();
        jMenuItem47 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItem37 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("ระบบบริหารธนาคารชุมชน V 1.1-2023.03.29");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        mainTabbedPane.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mainTabbedPane.setRequestFocusEnabled(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 744, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        mainTabbedPane.addTab("Welcome Home Page", jPanel1);

        leftProfilePanel.setBackground(new java.awt.Color(255, 255, 255));
        leftProfilePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbMemberCode.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbMemberCode.setText("รหัสสมาชิก");

        lbMemberName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbMemberName.setText("ชื่อ-สกุล");

        txtProfileCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtProfileCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtProfileCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtProfileCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProfileCodeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProfileCodeKeyReleased(evt);
            }
        });

        txtProfileName.setEditable(false);
        txtProfileName.setBackground(new java.awt.Color(255, 255, 204));
        txtProfileName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtProfileName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtProfileName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        lbAccountLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbAccountLabel.setText("สมุดบัญชี");

        txtAccCode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAccCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAccCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAccCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAccCodeKeyPressed(evt);
            }
        });

        lbPic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/no.png"))); // NOI18N
        lbPic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        summaryProfilePanel.setBackground(new java.awt.Color(255, 255, 255));
        summaryProfilePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtLimitLoanAmt.setEditable(false);
        txtLimitLoanAmt.setBackground(new java.awt.Color(255, 255, 204));
        txtLimitLoanAmt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLimitLoanAmt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtLimitLoanAmt.setText("0.00");
        txtLimitLoanAmt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        lbHoonQtyLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbHoonQtyLabel.setText("หุ้น");

        lbBaht.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbBaht.setText("บาท");

        lbDeposit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbDeposit.setText("เงินฝาก");

        lbRegisterDate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbRegisterDate.setText("วันที่ลงทะเบียน");

        lbDepositBaht.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbDepositBaht.setText("บาท");

        txtTotalHoon.setEditable(false);
        txtTotalHoon.setBackground(new java.awt.Color(255, 255, 204));
        txtTotalHoon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTotalHoon.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalHoon.setText("0");
        txtTotalHoon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        lbLoanBalance.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbLoanBalance.setText("หนี้ค้างชำระ");

        lbHoon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbHoon.setText("จำนวนหุ้น");

        lbLoanBaht.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbLoanBaht.setText("บาท");

        txtTotalSave.setEditable(false);
        txtTotalSave.setBackground(new java.awt.Color(255, 255, 204));
        txtTotalSave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTotalSave.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalSave.setText("0.00");
        txtTotalSave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtLoanBalanceAmt.setEditable(false);
        txtLoanBalanceAmt.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanBalanceAmt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLoanBalanceAmt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtLoanBalanceAmt.setText("0.00");
        txtLoanBalanceAmt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtStartAcc.setEditable(false);
        txtStartAcc.setBackground(new java.awt.Color(255, 255, 204));
        txtStartAcc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtStartAcc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtStartAcc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        lbLoanLimit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbLoanLimit.setText("วงเงินกู้");

        lbCountAccount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbCountAccount.setText("จำนวนบัญชีเงินฝาก");

        txtTotalAccount.setEditable(false);
        txtTotalAccount.setBackground(new java.awt.Color(255, 255, 204));
        txtTotalAccount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTotalAccount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalAccount.setText("0");
        txtTotalAccount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        lbAccountCount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbAccountCount.setText("บัญชี");

        lbCountAccount1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbCountAccount1.setText("จำนวนบัญชีเงินกู้");

        txtTotalLoanAccount.setEditable(false);
        txtTotalLoanAccount.setBackground(new java.awt.Color(255, 255, 204));
        txtTotalLoanAccount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTotalLoanAccount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalLoanAccount.setText("0");
        txtTotalLoanAccount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        lbAccountCount1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbAccountCount1.setText("บัญชี");

        javax.swing.GroupLayout summaryProfilePanelLayout = new javax.swing.GroupLayout(summaryProfilePanel);
        summaryProfilePanel.setLayout(summaryProfilePanelLayout);
        summaryProfilePanelLayout.setHorizontalGroup(
            summaryProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(summaryProfilePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(summaryProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbLoanLimit)
                    .addComponent(lbLoanBalance)
                    .addComponent(lbHoon)
                    .addComponent(lbRegisterDate)
                    .addComponent(lbDeposit)
                    .addComponent(lbCountAccount)
                    .addComponent(lbCountAccount1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(summaryProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(summaryProfilePanelLayout.createSequentialGroup()
                        .addComponent(txtLoanBalanceAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbLoanBaht))
                    .addGroup(summaryProfilePanelLayout.createSequentialGroup()
                        .addComponent(txtLimitLoanAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbBaht))
                    .addGroup(summaryProfilePanelLayout.createSequentialGroup()
                        .addGroup(summaryProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtTotalSave)
                            .addComponent(txtTotalHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalAccount)
                            .addComponent(txtTotalLoanAccount))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(summaryProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDepositBaht)
                            .addComponent(lbHoonQtyLabel)
                            .addComponent(lbAccountCount)
                            .addComponent(lbAccountCount1)))
                    .addComponent(txtStartAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        summaryProfilePanelLayout.setVerticalGroup(
            summaryProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(summaryProfilePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(summaryProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStartAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRegisterDate))
                .addGap(7, 7, 7)
                .addGroup(summaryProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalSave, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDeposit)
                    .addComponent(lbDepositBaht))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(summaryProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCountAccount)
                    .addComponent(lbAccountCount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(summaryProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalLoanAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCountAccount1)
                    .addComponent(lbAccountCount1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(summaryProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHoon)
                    .addComponent(txtTotalHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHoonQtyLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(summaryProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLoanBalanceAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbLoanBaht)
                    .addComponent(lbLoanBalance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(summaryProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbLoanLimit)
                    .addComponent(txtLimitLoanAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbBaht))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbIndexNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbIndexNo.setText("ลำดับที่");

        txtIndexNo.setEditable(false);
        txtIndexNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtIndexNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIndexNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtIndexNo.setEnabled(false);

        javax.swing.GroupLayout leftProfilePanelLayout = new javax.swing.GroupLayout(leftProfilePanel);
        leftProfilePanel.setLayout(leftProfilePanelLayout);
        leftProfilePanelLayout.setHorizontalGroup(
            leftProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbPic, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(leftProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(summaryProfilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(leftProfilePanelLayout.createSequentialGroup()
                    .addGroup(leftProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbMemberCode)
                        .addComponent(lbMemberName)
                        .addComponent(lbAccountLabel)
                        .addComponent(lbIndexNo))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(leftProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtAccCode, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtProfileCode, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtProfileName, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtIndexNo, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        leftProfilePanelLayout.setVerticalGroup(
            leftProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftProfilePanelLayout.createSequentialGroup()
                .addComponent(lbPic, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbIndexNo)
                    .addComponent(txtIndexNo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAccCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAccountLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbMemberCode)
                    .addComponent(txtProfileCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMemberName)
                    .addComponent(txtProfileName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(summaryProfilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        topMenuAction.setLayout(new java.awt.GridLayout(1, 0));

        btnRegister.setBackground(new java.awt.Color(0, 102, 0));
        btnRegister.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("ลงทะเบียน");
        btnRegister.setRequestFocusEnabled(false);
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        topMenuAction.add(btnRegister);

        btnEdit.setBackground(new java.awt.Color(0, 102, 0));
        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("แก้ไขข้อมูล");
        btnEdit.setRequestFocusEnabled(false);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        topMenuAction.add(btnEdit);

        btnFind.setBackground(new java.awt.Color(0, 102, 0));
        btnFind.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFind.setForeground(new java.awt.Color(255, 255, 255));
        btnFind.setText("ค้นหาข้อมูล");
        btnFind.setRequestFocusEnabled(false);
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        topMenuAction.add(btnFind);

        jPanel2.setBackground(new java.awt.Color(255, 51, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("บริษัทสยามคอนวีเนียน จำกัด เลขที่ 9/39 หมู่3 ซอยวัดศรีประวัติ ถ.จงกลถนอม");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ต.ศาลากลาง อ.บางกรวย จ.นนทบุรี 11130 โทร. 0-2497-8608, 096-989-4159 แฟกซ์. 0-2497-8608");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel37.setBackground(new java.awt.Color(255, 255, 255));
        jPanel37.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel41.setText("รหัสพนักงาน");

        jLabel85.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel85.setText("ชื่อพนักงาน");

        jLabel87.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel87.setText("จำนวนสมาชิก");

        txtBranchName.setEditable(false);
        txtBranchName.setBackground(new java.awt.Color(255, 255, 204));
        txtBranchName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBranchName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBranchName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel86.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel86.setText("สถาบัน");

        txtShowEmpName.setEditable(false);
        txtShowEmpName.setBackground(new java.awt.Color(255, 255, 204));
        txtShowEmpName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtShowEmpName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtShowEmpName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtShowEmpCode.setEditable(false);
        txtShowEmpCode.setBackground(new java.awt.Color(255, 255, 204));
        txtShowEmpCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtShowEmpCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtShowEmpCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtMemQty.setEditable(false);
        txtMemQty.setBackground(new java.awt.Color(255, 255, 204));
        txtMemQty.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtMemQty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMemQty.setText("0");
        txtMemQty.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jPanel43.setOpaque(false);
        jPanel43.setLayout(new java.awt.GridLayout(1, 0));

        btnTimeShow.setBackground(new java.awt.Color(255, 255, 255));
        btnTimeShow.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnTimeShow.setForeground(new java.awt.Color(0, 0, 255));
        btnTimeShow.setText("00:00:00");
        jPanel43.add(btnTimeShow);

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel41)
                    .addComponent(jLabel86))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addComponent(txtShowEmpCode, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel85)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtShowEmpName))
                    .addComponent(txtBranchName, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel87)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMemQty, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel41)
                            .addComponent(txtShowEmpCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel85)
                            .addComponent(txtShowEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel87))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel86)
                            .addComponent(txtBranchName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtMemQty, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        mnSettings.setText("ตั้งค่าการใช้งาน");
        mnSettings.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mnSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSettingsActionPerformed(evt);
            }
        });

        mnConfigSystem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnConfigSystem.setText("ตั้งค่าระบบ");
        mnConfigSystem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnConfigSystemActionPerformed(evt);
            }
        });
        mnSettings.add(mnConfigSystem);

        mnSetupConfig.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnSetupConfig.setText("ตั้งค่าข้อมูลบัญชี/ลูกหนี้/หุ้น");
        mnSetupConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSetupConfigActionPerformed(evt);
            }
        });
        mnSettings.add(mnSetupConfig);

        menuMain.add(mnSettings);

        mnMaster.setText("แฟ้มข้อมูล");
        mnMaster.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        mnMember.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnMember.setText("ข้อมูลสมาชิก");
        mnMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnMemberActionPerformed(evt);
            }
        });
        mnMaster.add(mnMember);

        mnMemberType.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnMemberType.setText("ข้อมูลประเภทสมาชิก");
        mnMemberType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnMemberTypeActionPerformed(evt);
            }
        });
        mnMaster.add(mnMemberType);

        mnExpense.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnExpense.setText("ข้อมูลค่าใช้จ่าย");
        mnExpense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnExpenseActionPerformed(evt);
            }
        });
        mnMaster.add(mnExpense);

        mnProject.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnProject.setText("ข้อมูลโครงการ");
        mnProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnProjectActionPerformed(evt);
            }
        });
        mnMaster.add(mnProject);
        mnMaster.add(jSeparator1);

        mnPrefix.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnPrefix.setText("ข้อมูลคำนำหน้า");
        mnPrefix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPrefixActionPerformed(evt);
            }
        });
        mnMaster.add(mnPrefix);

        mnStatus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnStatus.setText("ข้อมูลสถานะ");
        mnStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnStatusActionPerformed(evt);
            }
        });
        mnMaster.add(mnStatus);
        mnMaster.add(jSeparator8);

        mnFee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnFee.setText("ข้อมูลค่าธรรมเนียม");
        mnFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnFeeActionPerformed(evt);
            }
        });
        mnMaster.add(mnFee);

        menuMain.add(mnMaster);

        mnAccount.setText("บัญชีใช้งาน");
        mnAccount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        mnSaveAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnSaveAccount.setText("บัญชีเงินฝาก");
        mnSaveAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSaveAccountActionPerformed(evt);
            }
        });
        mnAccount.add(mnSaveAccount);

        mnLoanAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnLoanAccount.setText("บัญชีเงินกู้");
        mnLoanAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLoanAccountActionPerformed(evt);
            }
        });
        mnAccount.add(mnLoanAccount);

        mnLoadExcel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnLoadExcel.setText("บันทึกข้อมูลเงินกู้จาก Excel");
        mnLoadExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLoadExcelActionPerformed(evt);
            }
        });
        mnAccount.add(mnLoadExcel);

        menuMain.add(mnAccount);

        mnProcess.setText("การดำเนินการ");
        mnProcess.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        mnSaveExpense.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnSaveExpense.setText("บันทึกค่าใช้จ่าย");
        mnSaveExpense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSaveExpenseActionPerformed(evt);
            }
        });
        mnProcess.add(mnSaveExpense);
        mnProcess.add(jSeparator9);

        mnCloseDialoyDay.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnCloseDialoyDay.setText("รายการปิดสิ้นวัน");
        mnCloseDialoyDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCloseDialoyDayActionPerformed(evt);
            }
        });
        mnProcess.add(mnCloseDialoyDay);
        mnProcess.add(jSeparator13);

        mnPrintHistorySave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnPrintHistorySave.setText("พิมพ์รายการฝากถอนย้อนหลัง");
        mnPrintHistorySave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPrintHistorySaveActionPerformed(evt);
            }
        });
        mnProcess.add(mnPrintHistorySave);

        mnSaveHistoryLoan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnSaveHistoryLoan.setText("พิมพ์รายการเงินกู้ย้อนหลัง");
        mnSaveHistoryLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSaveHistoryLoanActionPerformed(evt);
            }
        });
        mnProcess.add(mnSaveHistoryLoan);
        mnProcess.add(jSeparator12);

        mnCancelOpenAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnCancelOpenAccount.setText("ยกเลิกการเปิดบัญชี");
        mnCancelOpenAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCancelOpenAccountActionPerformed(evt);
            }
        });
        mnProcess.add(mnCancelOpenAccount);
        mnProcess.add(jSeparator4);

        jMenuItem4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem4.setText("สรุปรายวันเงินสด");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        mnProcess.add(jMenuItem4);

        jMenuItem6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem6.setText("สรุปรายวันทั่วไป");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        mnProcess.add(jMenuItem6);

        menuMain.add(mnProcess);

        mnReport.setText("รายงาน");
        mnReport.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        mnRptMember.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnRptMember.setText("รายงานทะเบียนสมาชิก");
        mnRptMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRptMemberActionPerformed(evt);
            }
        });
        mnReport.add(mnRptMember);

        jMenuItem1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem1.setText("รายงานสรุปการดำเนินงาน");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnReport.add(jMenuItem1);
        mnReport.add(jSeparator10);

        mnRptOpenAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnRptOpenAccount.setText("รายงานการเปิดบัญชี");
        mnRptOpenAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRptOpenAccountActionPerformed(evt);
            }
        });
        mnReport.add(mnRptOpenAccount);

        mnRptCloseAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnRptCloseAccount.setText("รายงานการปิดบัญชี");
        mnRptCloseAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRptCloseAccountActionPerformed(evt);
            }
        });
        mnReport.add(mnRptCloseAccount);

        jMenu5.setText("รายงานเงินฝาก/ถอน");
        jMenu5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem2.setText("รายงานความเคลื่อนไหวเงินฝาก/ถอน");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem3.setText("แสดงรายละเอียด การจ่ายดอกเบี้ยเงินฝาก");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem3);

        mnReport.add(jMenu5);

        mnMainRptHoon.setText("รายงานหุ้น");
        mnMainRptHoon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jMenuItem7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem7.setText("รายงานความเคลื่อนไหวหุ้น");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        mnMainRptHoon.add(jMenuItem7);

        jMenuItem5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem5.setText("การปันผลหุ้น");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        mnMainRptHoon.add(jMenuItem5);

        mnReport.add(mnMainRptHoon);

        mnMainRptLoan.setText("รายงานเงินกู้");
        mnMainRptLoan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jMenuItem43.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem43.setText("รายงานการกู้เงิน");
        jMenuItem43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem43ActionPerformed(evt);
            }
        });
        mnMainRptLoan.add(jMenuItem43);

        jMenuItem44.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem44.setText("รายงานการรับชำระ");
        jMenuItem44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem44ActionPerformed(evt);
            }
        });
        mnMainRptLoan.add(jMenuItem44);
        mnMainRptLoan.add(jSeparator11);

        jMenuItem46.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem46.setText("รายงานลูกหนี้ค้างชำระ และดอกเบี้ย");
        jMenuItem46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem46ActionPerformed(evt);
            }
        });
        mnMainRptLoan.add(jMenuItem46);

        jMenuItem45.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem45.setText("รายงานลูกหนี้ค้างชำระ และดอกเบี้ยสรุป");
        jMenuItem45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem45ActionPerformed(evt);
            }
        });
        mnMainRptLoan.add(jMenuItem45);

        mnReport.add(mnMainRptLoan);

        mnRptFee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnRptFee.setText("รายงานค่าธรรมเนียมต่าง ๆ");
        mnRptFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRptFeeActionPerformed(evt);
            }
        });
        mnReport.add(mnRptFee);
        mnReport.add(jSeparator2);

        mnRptProfitCompany.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnRptProfitCompany.setText("รายงานผลประกอบการ");
        mnRptProfitCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRptProfitCompanyActionPerformed(evt);
            }
        });
        mnReport.add(mnRptProfitCompany);

        mnRptCheckAudit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mnRptCheckAudit.setForeground(new java.awt.Color(0, 153, 153));
        mnRptCheckAudit.setText("รายงานความเคลื่อนไหวรายบุคคล");
        mnRptCheckAudit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRptCheckAuditActionPerformed(evt);
            }
        });
        mnReport.add(mnRptCheckAudit);
        mnReport.add(jSeparator14);

        mnRptTransaction.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnRptTransaction.setText("รายงานสรุปความเคลื่อนไหว");
        mnRptTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRptTransactionActionPerformed(evt);
            }
        });
        mnReport.add(mnRptTransaction);

        jMenuItem8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem8.setText("หนังสือแจ้งเงินกู้และค่าหุ้น");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        mnReport.add(jMenuItem8);

        jMenuItem9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem9.setText("รายละเอียดสมาชิกทุกรายการ");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        mnReport.add(jMenuItem9);

        menuMain.add(mnReport);

        mnHelp.setText("ช่วยเหลือ (Help)");
        mnHelp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMenuItem11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem11.setText("สำรองข้อมูล");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        mnHelp.add(jMenuItem11);

        jMenuItem38.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem38.setText("Reset Data");
        jMenuItem38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem38ActionPerformed(evt);
            }
        });
        mnHelp.add(jMenuItem38);

        jMenuItem47.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem47.setText("อัพเดตความเคลื่อนไหว");
        jMenuItem47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem47ActionPerformed(evt);
            }
        });
        mnHelp.add(jMenuItem47);
        mnHelp.add(jSeparator7);

        jMenuItem37.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem37.setText("อัพเดตโปรแกรม");
        jMenuItem37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem37ActionPerformed(evt);
            }
        });
        mnHelp.add(jMenuItem37);

        menuMain.add(mnHelp);

        setJMenuBar(menuMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(leftProfilePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(topMenuAction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainTabbedPane)
                    .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(topMenuAction, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(leftProfilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mainTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        btnRegisterActionPerformed();
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        btnFindActionPerformed();
    }//GEN-LAST:event_btnFindActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        formWindowClosing();
    }//GEN-LAST:event_formWindowClosing

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        btnEditActionPerformed();
    }//GEN-LAST:event_btnEditActionPerformed

    private void mnSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSettingsActionPerformed
        HoonProfitDialog hoonProfitDialog = new HoonProfitDialog(this, true);
        hoonProfitDialog.setVisible(true);
    }//GEN-LAST:event_mnSettingsActionPerformed

    private void mnConfigSystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnConfigSystemActionPerformed
        ConfigDialog configDialog = new ConfigDialog(this, true);
        configDialog.setVisible(true);
    }//GEN-LAST:event_mnConfigSystemActionPerformed

    private void mnRptProfitCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRptProfitCompanyActionPerformed
        SummaryReportDialog summaryReportDialog = new SummaryReportDialog(this, true);
        summaryReportDialog.setVisible(true);
    }//GEN-LAST:event_mnRptProfitCompanyActionPerformed

    private void mnSetupConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSetupConfigActionPerformed
        AppSettingDialog configDialog2 = new AppSettingDialog(this, true);
        configDialog2.setVisible(true);

        clearProfileForm();
    }//GEN-LAST:event_mnSetupConfigActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        HoonReportAllDialog hoonReportAllDialog = new HoonReportAllDialog(this, true);
        hoonReportAllDialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void mnExpenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnExpenseActionPerformed
        ExpendDialog expendDialog = new ExpendDialog(this, true);
        expendDialog.setVisible(true);
    }//GEN-LAST:event_mnExpenseActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        dumpDB();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        HoonInvestDialog hoonInvestDialog = new HoonInvestDialog(this, true);
        hoonInvestDialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void mnCloseDialoyDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCloseDialoyDayActionPerformed
        SummaryReportCloseDay summaryReportCloseDay = new SummaryReportCloseDay(this, true);
        summaryReportCloseDay.setVisible(true);
    }//GEN-LAST:event_mnCloseDialoyDayActionPerformed

    private void mnSaveExpenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSaveExpenseActionPerformed
        ExpendFormDialog expendFormDialog = new ExpendFormDialog(this, true);
        expendFormDialog.setVisible(true);
    }//GEN-LAST:event_mnSaveExpenseActionPerformed

    private void mnProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnProjectActionPerformed
        ProjectDialog projectDialog = new ProjectDialog(this, true);
        projectDialog.setVisible(true);
    }//GEN-LAST:event_mnProjectActionPerformed

    private void mnMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnMemberActionPerformed
        CustomerMasterDialog customerMasterDialog = new CustomerMasterDialog(this, true);
        customerMasterDialog.setVisible(true);
    }//GEN-LAST:event_mnMemberActionPerformed

    private void mnMemberTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnMemberTypeActionPerformed
        MemberTypeDialog memberTypeDialog = new MemberTypeDialog(this, true);
        memberTypeDialog.setVisible(true);
    }//GEN-LAST:event_mnMemberTypeActionPerformed

    private void mnPrefixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPrefixActionPerformed
        PrefixDialog prefixDialog = new PrefixDialog(this, true);
        prefixDialog.setVisible(true);
    }//GEN-LAST:event_mnPrefixActionPerformed

    private void mnRptOpenAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRptOpenAccountActionPerformed
        OpenAccountReport openAccountReport = new OpenAccountReport(this, true);
        openAccountReport.setVisible(true);
    }//GEN-LAST:event_mnRptOpenAccountActionPerformed

    private void mnRptFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRptFeeActionPerformed
        FeeReportDialog feeReportDialog = new FeeReportDialog(this, true);
        feeReportDialog.setVisible(true);
    }//GEN-LAST:event_mnRptFeeActionPerformed

    private void mnRptCloseAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRptCloseAccountActionPerformed
        CloseAccountReportDialog closeAccountReportDialog = new CloseAccountReportDialog(this, true);
        closeAccountReportDialog.setVisible(true);
    }//GEN-LAST:event_mnRptCloseAccountActionPerformed

    private void jMenuItem37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem37ActionPerformed
        UpdateVersionDialog updateVersionDialog = new UpdateVersionDialog(this, true);
        updateVersionDialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem37ActionPerformed

    private void jMenuItem38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem38ActionPerformed
        ResetDataToNewProgramDialog resetDataToNewProgramDialog = new ResetDataToNewProgramDialog(null, true);
        resetDataToNewProgramDialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem38ActionPerformed

    private void mnStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnStatusActionPerformed
        StatusMsgDialog statusMsgDialog = new StatusMsgDialog(this, true);
        statusMsgDialog.setVisible(true);
    }//GEN-LAST:event_mnStatusActionPerformed

    private void mnFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnFeeActionPerformed
        FeeDialog feeDialog = new FeeDialog(this, true);
        feeDialog.setVisible(true);
    }//GEN-LAST:event_mnFeeActionPerformed

    private void mnRptMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRptMemberActionPerformed
        ProfileListDialog profileListDialog = new ProfileListDialog(this, true);
        profileListDialog.setVisible(true);
    }//GEN-LAST:event_mnRptMemberActionPerformed

    private void mnRptCheckAuditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRptCheckAuditActionPerformed
        CheckAuditDialog checkAuditDialog = new CheckAuditDialog(this, true);
        checkAuditDialog.setVisible(true);
    }//GEN-LAST:event_mnRptCheckAuditActionPerformed

    private void jMenuItem43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem43ActionPerformed
        LoanReportAllDialog loanReportAllDialog = new LoanReportAllDialog(this, true);
        loanReportAllDialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem43ActionPerformed

    private void jMenuItem44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem44ActionPerformed
        LoanReportPaymentDialog loanReportPaymentDialog = new LoanReportPaymentDialog(this, true);
        loanReportPaymentDialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem44ActionPerformed

    private void mnPrintHistorySaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPrintHistorySaveActionPerformed
        PrintSavingBookDialog printSavingBookDialog = new PrintSavingBookDialog(this, true);
        printSavingBookDialog.setVisible(true);
    }//GEN-LAST:event_mnPrintHistorySaveActionPerformed

    private void mnSaveHistoryLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSaveHistoryLoanActionPerformed
        PrintLoanBookDialog printLoanBookDialog = new PrintLoanBookDialog(this, true, null);
        printLoanBookDialog.setVisible(true);
    }//GEN-LAST:event_mnSaveHistoryLoanActionPerformed

    private void jMenuItem47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem47ActionPerformed
        int conf = JOptionPane.showConfirmDialog(this, "กรุณายืนยันการอัพเดตโปรแกรม จาก Transaction ?");
        if (conf == JOptionPane.YES_OPTION) {
            UpdateTransactionDialog updateTransactionDialog = new UpdateTransactionDialog(this, true);
            updateTransactionDialog.setVisible(true);
            btnRegister.setText("เริ่มใหม่");
            //reset form
            btnRegisterActionPerformed();
        }
    }//GEN-LAST:event_jMenuItem47ActionPerformed

    private void mnCancelOpenAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCancelOpenAccountActionPerformed
        clearProfileForm();
        btnRegister.setText("ลงทะเบียน");
        txtAccCode.setText("");

        CancelAccountDialog cancelAccountDialog = new CancelAccountDialog(this, true);
        cancelAccountDialog.setVisible(true);
    }//GEN-LAST:event_mnCancelOpenAccountActionPerformed

    private void mnRptTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRptTransactionActionPerformed
        DialyReportDialog dialyReportDialog = new DialyReportDialog(this, true);
        dialyReportDialog.setVisible(true);
    }//GEN-LAST:event_mnRptTransactionActionPerformed

    private void mnSaveAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSaveAccountActionPerformed
        SaveAccountDialog saveAccountDialog = new SaveAccountDialog(this, true);
        saveAccountDialog.setVisible(true);
    }//GEN-LAST:event_mnSaveAccountActionPerformed

    private void mnLoanAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnLoanAccountActionPerformed
        SaveLoanDialog saveLoanDlg = new SaveLoanDialog(this, true);
        saveLoanDlg.setVisible(true);
    }//GEN-LAST:event_mnLoanAccountActionPerformed

    private void mnLoadExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnLoadExcelActionPerformed
    }//GEN-LAST:event_mnLoadExcelActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ProfileList2Dialog profileList2Dialog = new ProfileList2Dialog(this, true);
        profileList2Dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        SaveReportAllDialog saveReportAllDialog = new SaveReportAllDialog(this, true);
        saveReportAllDialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        PayInterestAmtDialog payInterestAmtDialog = new PayInterestAmtDialog(this, true);
        payInterestAmtDialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        FormCashDialyDialog formCashDialyDialog = new FormCashDialyDialog(this, true);
        formCashDialyDialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        SummaryDialyDialog summaryDialyDialog = new SummaryDialyDialog(this, true);
        summaryDialyDialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem45ActionPerformed
        ReportOverdueAccountAndSummary reportOverdueAccountAndSummary = new ReportOverdueAccountAndSummary(this, true);
        reportOverdueAccountAndSummary.setVisible(true);
    }//GEN-LAST:event_jMenuItem45ActionPerformed

    private void jMenuItem46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem46ActionPerformed
        ReportOverdueAccountInterest reportOverdueAccountInterest = new ReportOverdueAccountInterest(this, true);
        reportOverdueAccountInterest.setVisible(true);
    }//GEN-LAST:event_jMenuItem46ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        ReportPersonDetail reportPersonDetail = new ReportPersonDetail(this, true);
        reportPersonDetail.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        ReportInvoiceHoon reportInvoiceHoon = new ReportInvoiceHoon(this, true);
        reportInvoiceHoon.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void txtAccCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAccCodeKeyPressed
        txtAccCodeKeyPressedAction(evt);
    }//GEN-LAST:event_txtAccCodeKeyPressed

    private void txtProfileCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProfileCodeKeyReleased
        txtProfileCodeKeyReleasedAction(evt);
    }//GEN-LAST:event_txtProfileCodeKeyReleased

    private void txtProfileCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProfileCodeKeyPressed
        txtProfileCodeKeyPressedAction(evt);
    }//GEN-LAST:event_txtProfileCodeKeyPressed

    public static void main(String args[]) {
        Log.write.info("Start Program");
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }

            Font a = new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE);
            UIManager.put("OptionPane.buttonFont", a);
            // use uiResource for others
            FontUIResource ax = new FontUIResource(a);
            UIManager.put("OptionPane.messageFont", ax);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        File fExit = new File("cbanksystem.running");
        if (fExit.exists()) {
            JOptionPane.showMessageDialog(null, "โปรแกรมกำลังถูกเปิดใช้งานอยู่ หรือมีการออกจากระบบไม่สมบูรณ์ กรุณาเปิดใหม่อีกครั้ง !",
                    "แจ้งเตือน", JOptionPane.WARNING_MESSAGE);
            fExit.delete();
            System.exit(0);
        } else {
            try {
                fExit.createNewFile();
            } catch (IOException ex) {

            }
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainDialog dialog = new MainDialog(new javax.swing.JFrame(), true);
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnTimeShow;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem jMenuItem38;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem43;
    private javax.swing.JMenuItem jMenuItem44;
    private javax.swing.JMenuItem jMenuItem45;
    private javax.swing.JMenuItem jMenuItem46;
    private javax.swing.JMenuItem jMenuItem47;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator14;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JLabel lbAccountCount;
    private javax.swing.JLabel lbAccountCount1;
    private javax.swing.JLabel lbAccountLabel;
    private javax.swing.JLabel lbBaht;
    private javax.swing.JLabel lbCountAccount;
    private javax.swing.JLabel lbCountAccount1;
    private javax.swing.JLabel lbDeposit;
    private javax.swing.JLabel lbDepositBaht;
    private javax.swing.JLabel lbHoon;
    private javax.swing.JLabel lbHoonQtyLabel;
    private javax.swing.JLabel lbIndexNo;
    private javax.swing.JLabel lbLoanBaht;
    private javax.swing.JLabel lbLoanBalance;
    private javax.swing.JLabel lbLoanLimit;
    private javax.swing.JLabel lbMemberCode;
    private javax.swing.JLabel lbMemberName;
    private javax.swing.JLabel lbPic;
    private javax.swing.JLabel lbRegisterDate;
    private javax.swing.JPanel leftProfilePanel;
    private javax.swing.JTabbedPane mainTabbedPane;
    private javax.swing.JMenuBar menuMain;
    private javax.swing.JMenu mnAccount;
    private javax.swing.JMenuItem mnCancelOpenAccount;
    private javax.swing.JMenuItem mnCloseDialoyDay;
    private javax.swing.JMenuItem mnConfigSystem;
    private javax.swing.JMenuItem mnExpense;
    private javax.swing.JMenuItem mnFee;
    private javax.swing.JMenu mnHelp;
    private javax.swing.JMenuItem mnLoadExcel;
    private javax.swing.JMenuItem mnLoanAccount;
    private javax.swing.JMenu mnMainRptHoon;
    private javax.swing.JMenu mnMainRptLoan;
    private javax.swing.JMenu mnMaster;
    private javax.swing.JMenuItem mnMember;
    private javax.swing.JMenuItem mnMemberType;
    private javax.swing.JMenuItem mnPrefix;
    private javax.swing.JMenuItem mnPrintHistorySave;
    private javax.swing.JMenu mnProcess;
    private javax.swing.JMenuItem mnProject;
    private javax.swing.JMenu mnReport;
    private javax.swing.JMenuItem mnRptCheckAudit;
    private javax.swing.JMenuItem mnRptCloseAccount;
    private javax.swing.JMenuItem mnRptFee;
    private javax.swing.JMenuItem mnRptMember;
    private javax.swing.JMenuItem mnRptOpenAccount;
    private javax.swing.JMenuItem mnRptProfitCompany;
    private javax.swing.JMenuItem mnRptTransaction;
    private javax.swing.JMenuItem mnSaveAccount;
    private javax.swing.JMenuItem mnSaveExpense;
    private javax.swing.JMenuItem mnSaveHistoryLoan;
    private javax.swing.JMenu mnSettings;
    private javax.swing.JMenuItem mnSetupConfig;
    private javax.swing.JMenuItem mnStatus;
    private javax.swing.JPanel summaryProfilePanel;
    private javax.swing.JPanel topMenuAction;
    private javax.swing.JTextField txtAccCode;
    private javax.swing.JTextField txtBranchName;
    private javax.swing.JTextField txtIndexNo;
    private javax.swing.JTextField txtLimitLoanAmt;
    private javax.swing.JTextField txtLoanBalanceAmt;
    private javax.swing.JTextField txtMemQty;
    private javax.swing.JTextField txtProfileCode;
    private javax.swing.JTextField txtProfileName;
    private javax.swing.JTextField txtShowEmpCode;
    private javax.swing.JTextField txtShowEmpName;
    private javax.swing.JTextField txtStartAcc;
    private javax.swing.JTextField txtTotalAccount;
    private javax.swing.JTextField txtTotalHoon;
    private javax.swing.JTextField txtTotalLoanAccount;
    private javax.swing.JTextField txtTotalSave;
    // End of variables declaration//GEN-END:variables

    private void loadProfileCustomer() {
        listSaveAccounts = getSaveAccountControl().listCbSaveAccount(profileBean.getP_custCode());// load all save account
        listLoanAccounts = getLoanAccountControl().listLoanAccountCust(profileBean.getP_custCode());// load all loan account

        txtIndexNo.setText("" + profileBean.getP_index());
        if (saveAccountBean != null) {
            txtAccCode.setText(saveAccountBean.getAccount_code());
        } else if (loanAccountBean != null) {
            txtAccCode.setText(loanAccountBean.getLoan_docno());
        } else {
            txtAccCode.setText("");
        }
        txtProfileCode.setText(profileBean.getP_custCode());
        txtProfileCode.setEditable(false);
        txtProfileName.setText(profileBean.getP_custName() + " " + profileBean.getP_custSurname());
        txtStartAcc.setText(DateFormat.getLocale_ddMMyyyy(profileBean.getP_member_start()));
        txtTotalSave.setText(NumberFormat.showDouble2(profileBean.getSave_Balance()));
        txtTotalAccount.setText("" + listSaveAccounts.size());
        txtTotalLoanAccount.setText("" + listLoanAccounts.size());
        txtTotalHoon.setText("" + profileBean.getHoon_Qty());
        txtLoanBalanceAmt.setText(NumberFormat.showDouble2(profileBean.getLoan_Balance()));
        txtLimitLoanAmt.setText(NumberFormat.showDouble2(profileBean.getLoan_Credit_Balance()));

        //set Image
        if (!"".equals(profileBean.getP_cust_pic_url())) {
            lbPic.setIcon(new javax.swing.ImageIcon(profileBean.getP_cust_pic_url()));
        } else {
            lbPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/no.png")));
        }

        profileIsActive = true;
        enablePanelTrue();
        btnRegister.setText("เริ่มใหม่");
    }

    private void clearProfileForm() {
        profileIsActive = false;
        txtIndexNo.setText("");
        txtAccCode.setText("");
        txtAccCode.setEditable(true);
        txtProfileCode.setText("");
        txtProfileCode.setEditable(true);
        txtProfileName.setText("");
        txtStartAcc.setText("");
        txtTotalSave.setText("0.00");
        txtTotalAccount.setText("0");
        txtTotalHoon.setText("0");
        txtLoanBalanceAmt.setText("0.00");
        txtLimitLoanAmt.setText("0.00");

        listSaveAccounts = null;
        listLoanAccounts = null;
        saveAccountBean = null;
        loanAccountBean = null;

        lbPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/no.png")));
        setTabComponentAt(ApplicationTab.WELCOME);
        txtAccCode.requestFocus();
    }

    private void enablePanelTrue() {
        ComponentUtil.enableComponents(mainTabbedPane, true);
    }

    private void formWindowClosing() {
        int ic = JOptionPane.showConfirmDialog(this, "ท่านต้องการออกจากระบบใช่หรือไม่ ?");
        if (ic == JOptionPane.YES_OPTION) {
            Value.clear();
            new File("cbanksystem.running").delete();
            PrintCOM printCom = new PrintCOM();
            printCom.printLOG("Logout by ... " + Value.CUST_CODE + "   End time: " + DateFormat.getLocale_ddMMyyyy(new Date()));
            MySQLConnect.close();
            System.exit(0);
        }
    }

    private void clearFormAll() {
        txtAccCode.setEditable(true);
        txtAccCode.setFocusable(true);
        menuHide();
        clearProfileForm();
        showTime();

        BranchBean bean = getBranchControl().getData();
        txtShowEmpCode.setText(Value.USER_CODE);
        txtShowEmpName.setText(Value.USER_NAME + " " + Value.USER_LAST_NAME);
        txtBranchName.setText(bean.getCode() + " - " + bean.getName());

        txtMemQty.setText(getProfileControl().getPMax());
    }

    private void showTime() {
        final SimpleDateFormat sTime = new SimpleDateFormat("HH:mm:ss");
        new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i == 10) {
                        i = 0;
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                    }
                    btnTimeShow.setText(sTime.format(new Date()));
                }
            }
        }).start();
    }

    private void dumpDB() {
        DatabaseDumpDialog databaseDumpDialog = new DatabaseDumpDialog(this, true);
        databaseDumpDialog.setVisible(true);
    }

    private void menuHide() {
        mnRptProfitCompany.setVisible(false);
    }

    private void showListSelect() {
        ListMenuDialog listMenuDialog = new ListMenuDialog(this, true, saveAccountBean, loanAccountBean, listSaveAccounts, listLoanAccounts, selectAccountType);
        listMenuDialog.setVisible(true);

        switch (listMenuDialog.getSelectChoice()) {
            case 1:
                txtAccCode.setEditable(false);
                setTabComponentAt(ApplicationTab.NEW_DEPOSIT);
                break;
            case 2:
                saveAccountBean = getSaveAccountControl().getSaveAccountBean(listMenuDialog.getAccountCode());
                loanAccountBean = null;
                txtAccCode.setText(saveAccountBean.getAccount_code());
                txtAccCode.setEditable(false);
                setTabComponentAt(ApplicationTab.DEPOSIT);
                break;
            case 3:
                saveAccountBean = getSaveAccountControl().getSaveAccountBean(listMenuDialog.getAccountCode());
                loanAccountBean = null;
                txtAccCode.setText(saveAccountBean.getAccount_code());
                txtAccCode.setEditable(false);
                setTabComponentAt(ApplicationTab.WITHDRAW);
                break;
            case 5:
                saveAccountBean = getSaveAccountControl().getSaveAccountBean(listMenuDialog.getAccountCode());
                loanAccountBean = null;
                setTabComponentAt(ApplicationTab.BUY_HOON);
                break;
            case 6:
                saveAccountBean = getSaveAccountControl().getSaveAccountBean(listMenuDialog.getAccountCode());
                loanAccountBean = null;
                setTabComponentAt(ApplicationTab.SELL_HOON);
                break;
            case 7:
                saveAccountBean = getSaveAccountControl().getSaveAccountBean(listMenuDialog.getAccountCode());
                loanAccountBean = null;
                setTabComponentAt(ApplicationTab.TRANSFER_HOON);
                break;
            case 8:
                txtAccCode.setEditable(false);
                setTabComponentAt(ApplicationTab.NEW_LOAN);
                break;
            case 9:
                loanAccountBean = getLoanAccountControl().getLoanAccount(listMenuDialog.getAccountCode(), profileBean.getP_custCode());
                saveAccountBean = null;
                txtAccCode.setText(loanAccountBean.getLoan_docno());
                txtAccCode.setEditable(false);
                setTabComponentAt(ApplicationTab.PAYMENT);
                break;
            default:
                setTabComponentAt(ApplicationTab.WELCOME);
                break;
        }
    }

    private void checkMenuLoadFile() {
        mnLoadExcel.setVisible(new File("D:/idCard.txt").exists());
    }

    private void btnRegisterActionPerformed() {
        if ("N".equals(Value.ACCESS[0])) {
            JOptionPane.showMessageDialog(this, "ท่านไม่มีสิทธิ์เข้าใช้งานฟังก์ชั่นการทำงานนี้");
            return;
        }

        if (btnRegister.getText().equals("เริ่มใหม่")) {
            clearFormAll();
            btnRegister.setText("ลงทะเบียน");
            return;
        }

        SavingDialog savingDialog = new SavingDialog(this, true, true, txtProfileCode.getText());
        savingDialog.setVisible(true);
        txtAccCode.setEditable(true);
        txtAccCode.requestFocus();
    }

    private void btnEditActionPerformed() {
        if (Value.ACCESS[1].equals("N")) {
            JOptionPane.showMessageDialog(this, "ท่านไม่มีสิทธิ์เข้าใช้งานฟังก์ชั่นการทำงานนี้");
            return;
        }
        if (profileIsActive) {
            SavingDialog savingDialog = new SavingDialog(this, true, false, txtProfileCode.getText());
            savingDialog.setVisible(true);
            if (savingDialog.getProfileCode() != null) {
                txtProfileCode.setText(savingDialog.getProfileCode());
            } else {
                txtAccCode.requestFocus();
            }
            return;
        }

        EditProfileDialog editProfileDialog = new EditProfileDialog(this, true);
        editProfileDialog.setVisible(true);
        if (editProfileDialog.getProfileCode() != null) {
            profileIsActive = true;
            btnEditActionPerformed();
        }
    }

    private void btnFindActionPerformed() {
        if (Value.ACCESS[2].equals("N")) {
            JOptionPane.showMessageDialog(this, "ท่านไม่มีสิทธิ์เข้าใช้งานฟังก์ชั่นการทำงานนี้");
            return;
        }
        clearProfileForm();
        btnRegister.setText("ลงทะเบียน");
        txtAccCode.setText("");

        CustomerDialog customerDialog = new CustomerDialog(this, true);
        customerDialog.setVisible(true);

        profileBean = customerDialog.getProfileBean();
        if (profileBean == null) {
            return;
        }
        if (cancelProfileStatus(profileBean)) {
            return;
        }

        loadProfileCustomer();
        selectAccountType = "";
        if ("deposit".equals(customerDialog.getAccountType())) {
            selectAccountType = "deposit";
            saveAccountBean = getSaveAccountControl().getSaveAccountBean(customerDialog.getAccountCode());
            loanAccountBean = null;
            txtAccCode.setText(saveAccountBean.getAccount_code());
            txtAccCode.setEditable(false);
        }
        if ("loan".equals(customerDialog.getAccountType())) {
            selectAccountType = "loan";
            loanAccountBean = getLoanAccountControl().getLoanAccount(customerDialog.getAccountCode(), profileBean.getP_custCode());
            saveAccountBean = null;
            txtAccCode.setText(loanAccountBean.getLoan_docno());
            txtAccCode.setEditable(false);
        }
        showListSelect();
    }

    public void updateInterest() {
        WaitDialog waitDialog = new WaitDialog(this, true);
        waitDialog.setVisible(true);
    }

    private void txtProfileCodeKeyPressedAction(java.awt.event.KeyEvent evt) {
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_ESCAPE:
                if (StringUtil.isEmpty(txtProfileCode.getText())) {
                    formWindowClosing();
                } else {
                    clearProfileForm();
                }
                break;
            case KeyEvent.VK_ENTER:
                if (StringUtil.isNotNullString(txtProfileCode.getText())) {
                    profileBean = getProfileControl().listCbProfile(txtProfileCode.getText());
                    if (profileBean == null) {
                        JOptionPane.showMessageDialog(this, "ไม่พบข้อมูลลูกค้าในระบบ กรุณาตรวจสอบ");
                        txtProfileCode.selectAll();
                        txtProfileCode.requestFocus();
                    }
                    if (!cancelProfileStatus(profileBean)) {
                        selectAccountType = "";
                        loadProfileCustomer();
                        showListSelect();
                    }
                }
                break;
            case KeyEvent.VK_F1:
                btnFindActionPerformed();
                break;
            default:
                break;
        }
    }

    private void txtProfileCodeKeyReleasedAction(KeyEvent evt) {
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_F1:
                SavingDialog savingDialog = new SavingDialog(null, true, true, txtProfileCode.getText());
                savingDialog.setVisible(true);
                break;
            case KeyEvent.VK_F2:
                btnFindActionPerformed();
                break;
            case KeyEvent.VK_F3:
                btnEditActionPerformed();
                break;
            default:
                break;
        }
    }

    private void txtAccCodeKeyPressedAction(KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if ("".equals(txtAccCode.getText())) {
                txtAccCode.requestFocus();
                return;
            }
            saveAccountBean = getSaveAccountControl().getSaveAccountBean(txtAccCode.getText());
            loanAccountBean = null;
            if (saveAccountBean != null) {
                profileBean = getProfileControl().listCbProfile(saveAccountBean.getB_CUST_CODE());
                selectAccountType = "deposit";
                loadProfileCustomer();
                showListSelect();
                return;
            }
            loanAccountBean = getLoanAccountControl().listLoanAccount(txtAccCode.getText());
            saveAccountBean = null;
            if (loanAccountBean != null) {
                profileBean = getProfileControl().listCbProfile(loanAccountBean.getCust_code());
                selectAccountType = "loan";
                loadProfileCustomer();
                showListSelect();
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            if ("".equals(txtAccCode.getText())) {
                formWindowClosing();
            }
        }
    }

}
