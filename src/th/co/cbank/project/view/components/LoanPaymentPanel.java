package th.co.cbank.project.view.components;

import java.awt.Font;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.apache.log4j.Logger;
import th.co.cbank.project.constants.AppConstants;
import th.co.cbank.project.control.BranchControl;
import th.co.cbank.project.control.CbLoanAccountControl;
import th.co.cbank.project.control.CbLoanConfigControl;
import th.co.cbank.project.control.CbLoanTablePaymentControl;
import th.co.cbank.project.control.CbTransactionLoanControl;
import th.co.cbank.project.control.ConfigControl;
import th.co.cbank.project.control.PrintCOM;
import th.co.cbank.project.control.ProfileControl;
import th.co.cbank.project.control.Value;
import th.co.cbank.project.model.BranchBean;
import th.co.cbank.project.model.CbLoanAccountBean;
import th.co.cbank.project.model.CbLoanConfigBean;
import th.co.cbank.project.model.CbLoanTablePaymentBean;
import th.co.cbank.project.model.CbTransactionLoanBean;
import th.co.cbank.project.model.ConfigBean;
import th.co.cbank.project.model.ProfileBean;
import th.co.cbank.project.view.PrintLoanBookDialog;
import th.co.cbank.util.DateChooseDialog;
import th.co.cbank.util.DateFormat;
import th.co.cbank.util.MessageAlert;
import th.co.cbank.util.NumberFormat;
import th.co.cbank.util.TableUtil;

public class LoanPaymentPanel extends javax.swing.JPanel {

    private final Logger logger = Logger.getLogger(LoanPaymentPanel.class);
    private final ProfileBean profileBean;
    private final CbLoanAccountBean loanAccountBean;
    private final CbLoanAccountControl loanAccountControl = new CbLoanAccountControl();
    private final ProfileControl profileControl = new ProfileControl();
    private final CbLoanConfigControl loanConfigControl = new CbLoanConfigControl();
    private final CbLoanTablePaymentControl cbLoanTablePaymentControl = new CbLoanTablePaymentControl();
    private final CbTransactionLoanControl cbTransactionLoanControl = new CbTransactionLoanControl();
    private final ConfigControl configControl = new ConfigControl();
    private final BranchControl branchControl = new BranchControl();

    public LoanPaymentPanel(ProfileBean profileBean, CbLoanAccountBean loanAccountBean) {
        initComponents();
        logger.debug("LoanPaymentPanel init");

        initLoadTable();

        this.profileBean = profileBean;
        this.loanAccountBean = loanAccountBean;
        initLoad();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane7 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        txtPaymentDate = new javax.swing.JTextField();
        btnDatePayment = new javax.swing.JButton();
        jLabel155 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txtPayPerMonth = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtBalanceToClose = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        txtLowerPayment = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        txtIntBadDebt = new javax.swing.JTextField();
        txtIntTurnover = new javax.swing.JTextField();
        txtIntNormal = new javax.swing.JTextField();
        jLabel100 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPaymentAccountNo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEmpCode = new javax.swing.JTextField();
        txtLastDatePayment = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtLoanStartDate = new javax.swing.JTextField();
        jLabel151 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtPrincipleBalance = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        txtPaymentFee = new javax.swing.JTextField();
        txtPaymentAmountCash = new javax.swing.JTextField();
        txtTotalPayment = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        txtIntBalance = new javax.swing.JTextField();
        jLabel102 = new javax.swing.JLabel();
        txtTodayInterest = new javax.swing.JTextField();
        btnConfirmPayment = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtPaymentDocNo = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbHistoryPayment = new javax.swing.JTable();
        jPanel54 = new javax.swing.JPanel();
        lblPaymentLoanTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane7.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTabbedPane7.setRequestFocusEnabled(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));
        jPanel34.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtPaymentDate.setEditable(false);
        txtPaymentDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPaymentDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnDatePayment.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDatePayment.setText("...");
        btnDatePayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatePaymentActionPerformed(evt);
            }
        });

        jLabel155.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel155.setText("วันที่รับชำระ");

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel43.setText("กำหนดชำระต่องวด");

        txtPayPerMonth.setEditable(false);
        txtPayPerMonth.setBackground(new java.awt.Color(255, 255, 204));
        txtPayPerMonth.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPayPerMonth.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPayPerMonth.setText("0.00");

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel39.setText("ยอดหนี้คงเหลือ/ปิดบัญชี");

        txtBalanceToClose.setEditable(false);
        txtBalanceToClose.setBackground(new java.awt.Color(255, 255, 204));
        txtBalanceToClose.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBalanceToClose.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtBalanceToClose.setText("0.00");

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel44.setText("กำหนดรับชำระขั้นต่ำ");

        txtLowerPayment.setEditable(false);
        txtLowerPayment.setBackground(new java.awt.Color(255, 255, 204));
        txtLowerPayment.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLowerPayment.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtLowerPayment.setText("0.00");

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPayPerMonth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBalanceToClose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel155, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel34Layout.createSequentialGroup()
                                .addComponent(txtPaymentDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDatePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtLowerPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel155)
                    .addComponent(txtPaymentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDatePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(txtLowerPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(txtPayPerMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(txtBalanceToClose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ดอกเบี้ยแยกชำระแต่ละประเภท", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        txtIntBadDebt.setEditable(false);
        txtIntBadDebt.setBackground(new java.awt.Color(255, 255, 204));
        txtIntBadDebt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtIntBadDebt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtIntBadDebt.setText("0.00");

        txtIntTurnover.setEditable(false);
        txtIntTurnover.setBackground(new java.awt.Color(255, 255, 204));
        txtIntTurnover.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtIntTurnover.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtIntTurnover.setText("0.00");

        txtIntNormal.setEditable(false);
        txtIntNormal.setBackground(new java.awt.Color(255, 255, 204));
        txtIntNormal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtIntNormal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtIntNormal.setText("0.00");

        jLabel100.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel100.setText("ดอกเบี้ยกู้");

        jLabel92.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel92.setText("ค่าจัดการ");

        jLabel89.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel89.setText("สำรองหนี้สูญ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel100))
                    .addComponent(jLabel92, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel89, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIntBadDebt, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(txtIntTurnover)
                    .addComponent(txtIntNormal))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIntBadDebt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel89))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIntTurnover, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel92))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIntNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel100))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("เลขที่บัญชี");

        txtPaymentAccountNo.setEditable(false);
        txtPaymentAccountNo.setBackground(new java.awt.Color(255, 255, 204));
        txtPaymentAccountNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPaymentAccountNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("พนักงานทำรายการ");

        txtEmpCode.setEditable(false);
        txtEmpCode.setBackground(new java.awt.Color(255, 255, 204));
        txtEmpCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmpCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtLastDatePayment.setEditable(false);
        txtLastDatePayment.setBackground(new java.awt.Color(255, 255, 204));
        txtLastDatePayment.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLastDatePayment.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("รับชำระล่าสุด");

        txtLoanStartDate.setEditable(false);
        txtLoanStartDate.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanStartDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLoanStartDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel151.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel151.setText("วันที่กู้");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel151, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtPaymentAccountNo, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(txtEmpCode)
                    .addComponent(txtLastDatePayment)
                    .addComponent(txtLoanStartDate))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPaymentAccountNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLoanStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel151))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEmpCode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtLastDatePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtPrincipleBalance.setEditable(false);
        txtPrincipleBalance.setBackground(new java.awt.Color(255, 255, 204));
        txtPrincipleBalance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPrincipleBalance.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPrincipleBalance.setText("0.00");
        txtPrincipleBalance.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrincipleBalanceFocusGained(evt);
            }
        });

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel75.setText("ค่าปรับ(1)");

        txtPaymentFee.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPaymentFee.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPaymentFee.setText("0.00");
        txtPaymentFee.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPaymentFeeFocusGained(evt);
            }
        });
        txtPaymentFee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPaymentFeeKeyPressed(evt);
            }
        });

        txtPaymentAmountCash.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtPaymentAmountCash.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPaymentAmountCash.setText("0.00");
        txtPaymentAmountCash.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPaymentAmountCashFocusGained(evt);
            }
        });
        txtPaymentAmountCash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPaymentAmountCashKeyPressed(evt);
            }
        });

        txtTotalPayment.setEditable(false);
        txtTotalPayment.setBackground(new java.awt.Color(255, 255, 204));
        txtTotalPayment.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTotalPayment.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalPayment.setText("0.00");
        txtTotalPayment.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTotalPaymentFocusGained(evt);
            }
        });

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel65.setText("รวมชำระ (1+2+3+4)");

        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel69.setText("รับชำระจริง");

        jLabel70.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel70.setText("เงินต้นคงเหลือ(4)");

        jLabel101.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel101.setText("ดอกเบี้ยค้างชำระ(2)");

        txtIntBalance.setEditable(false);
        txtIntBalance.setBackground(new java.awt.Color(255, 255, 204));
        txtIntBalance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtIntBalance.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtIntBalance.setText("0.00");

        jLabel102.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel102.setText("รวมดอกเบี้ยวันนี้(3)");

        txtTodayInterest.setEditable(false);
        txtTodayInterest.setBackground(new java.awt.Color(255, 255, 204));
        txtTodayInterest.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTodayInterest.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTodayInterest.setText("0.00");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel101, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel102, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel75, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTodayInterest, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIntBalance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPaymentFee, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel70)
                            .addComponent(jLabel65)
                            .addComponent(jLabel69))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTotalPayment, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPrincipleBalance, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPaymentAmountCash, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPaymentFee, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel75))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIntBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel101))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTodayInterest, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel102))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrincipleBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel70))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPaymentAmountCash, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel69))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnConfirmPayment.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConfirmPayment.setText("ยืนยันการรับชำระ");
        btnConfirmPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmPaymentActionPerformed(evt);
            }
        });
        btnConfirmPayment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnConfirmPaymentKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("เลขที่เอกสารรับชำระ");

        txtPaymentDocNo.setEditable(false);
        txtPaymentDocNo.setBackground(new java.awt.Color(255, 255, 204));
        txtPaymentDocNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPaymentDocNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPaymentDocNo.setText("สร้างอัตโนมัติ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnConfirmPayment))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                                .addComponent(txtPaymentDocNo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(435, 435, 435))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtPaymentDocNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfirmPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane7.addTab("รับชำระเงินกู้", jPanel4);

        tbHistoryPayment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "วันที่", "เลขที่บัญชี", "สำรองหนี้สูญ", "ค่าจัดการ", "ดอกเบี้ย", "ค่าปรับ", "รวมรับชำระ", "คงหลือ", "พนักงาน", "สาขา"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbHistoryPayment);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1147, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
        );

        jTabbedPane7.addTab("ประวัติการรับชำระ", jPanel13);

        jPanel54.setBackground(new java.awt.Color(255, 204, 204));

        lblPaymentLoanTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblPaymentLoanTitle.setText("รับชำระเงินกู้");

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPaymentLoanTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPaymentLoanTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane7)
            .addComponent(jPanel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane7)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTotalPaymentFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTotalPaymentFocusGained
        txtTotalPayment.selectAll();
    }//GEN-LAST:event_txtTotalPaymentFocusGained

    private void txtPaymentFeeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPaymentFeeFocusGained
        txtPaymentFee.selectAll();
    }//GEN-LAST:event_txtPaymentFeeFocusGained

    private void txtPaymentFeeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaymentFeeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtPaymentAmountCash.requestFocus();
        }
    }//GEN-LAST:event_txtPaymentFeeKeyPressed

    private void txtPaymentAmountCashKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaymentAmountCashKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnConfirmPayment.requestFocus();
        }
    }//GEN-LAST:event_txtPaymentAmountCashKeyPressed

    private void btnConfirmPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmPaymentActionPerformed
        paymentConfirm();
    }//GEN-LAST:event_btnConfirmPaymentActionPerformed

    private void btnConfirmPaymentKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnConfirmPaymentKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            paymentConfirm();
        }
    }//GEN-LAST:event_btnConfirmPaymentKeyPressed

    private void btnDatePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatePaymentActionPerformed
        Point point = txtPaymentDate.getLocationOnScreen();
        point.setLocation(point.getX(), point.getY());
        DateChooseDialog dcd = new DateChooseDialog(null, true, point);
        dcd.setVisible(true);

        if (dcd.getSelectDate() != null) {
            txtPaymentDate.setText(dcd.getDateString());
            txtPaymentDate.requestFocus();
        }
    }//GEN-LAST:event_btnDatePaymentActionPerformed

    private void txtPrincipleBalanceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrincipleBalanceFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrincipleBalanceFocusGained

    private void txtPaymentAmountCashFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPaymentAmountCashFocusGained
        txtPaymentAmountCash.selectAll();
    }//GEN-LAST:event_txtPaymentAmountCashFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmPayment;
    private javax.swing.JButton btnDatePayment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JLabel lblPaymentLoanTitle;
    private javax.swing.JTable tbHistoryPayment;
    private javax.swing.JTextField txtBalanceToClose;
    private javax.swing.JTextField txtEmpCode;
    private javax.swing.JTextField txtIntBadDebt;
    private javax.swing.JTextField txtIntBalance;
    private javax.swing.JTextField txtIntNormal;
    private javax.swing.JTextField txtIntTurnover;
    private javax.swing.JTextField txtLastDatePayment;
    private javax.swing.JTextField txtLoanStartDate;
    private javax.swing.JTextField txtLowerPayment;
    private javax.swing.JTextField txtPayPerMonth;
    private javax.swing.JTextField txtPaymentAccountNo;
    private javax.swing.JTextField txtPaymentAmountCash;
    private javax.swing.JTextField txtPaymentDate;
    private javax.swing.JTextField txtPaymentDocNo;
    private javax.swing.JTextField txtPaymentFee;
    private javax.swing.JTextField txtPrincipleBalance;
    private javax.swing.JTextField txtTodayInterest;
    private javax.swing.JTextField txtTotalPayment;
    // End of variables declaration//GEN-END:variables

    private boolean isEffitiveRate = false;

    private void initLoad() {
        txtPaymentAccountNo.setText(loanAccountBean.getLoan_docno());
        txtLoanStartDate.setText(DateFormat.getLocale_ddMMyyyy(loanAccountBean.getLoan_docdate()));
        txtEmpCode.setText(Value.USER_CODE);
        txtLastDatePayment.setText(DateFormat.getLocale_ddMMyyyy(loanAccountBean.getLoan_datePay()));
        txtPaymentDate.setText(DateFormat.getLocale_ddMMyyyy(new Date()));
        txtLowerPayment.setText(NumberFormat.showDouble2(loanAccountBean.getLoanPayMin()));
        txtPayPerMonth.setText(NumberFormat.showDouble2(loanAccountBean.getPayPerAmount()));
        txtPrincipleBalance.setText(NumberFormat.showDouble2(loanAccountBean.getLoan_amount()));

        //compute interest
        CbLoanConfigBean loanConfigBean = loanConfigControl.findOneByLoanCode(loanAccountBean.getLoan_type());
        if (loanConfigBean.getIntFixed().equals("E")) {
            isEffitiveRate = true;
            txtPaymentDate.setEditable(false);

            txtPaymentFee.setText("0.00"); //รอคำนวณค่าปรับจากระบบ
            double feeAmt = NumberFormat.toDouble(txtPaymentFee.getText());

            txtIntBalance.setText(NumberFormat.showDouble2(loanAccountBean.getIntBalance())); //ดอกเบี้ยค้างชำระจากงวดที่แล้ว
            Date dateLastPayment = loanAccountBean.getPay_date() == null ? loanAccountBean.getLoan_docdate() : loanAccountBean.getPay_date();
            int diffDay = th.co.cbank.util.DateUtil.diff(dateLastPayment, new Date());

            double interestToday = loanAccountBean.getLoan_amount() * diffDay * loanConfigBean.getLoanINT() / 100 / 365;
            txtTodayInterest.setText(NumberFormat.showDouble2(interestToday)); //ดอกเบี้ยที่คำนวณได้ในวันนี้

            //แจงรายละเอียดแต่ละประเภทดอกเบี้ย
            double intBadDebt = loanAccountBean.getLoan_amount() * diffDay * loanConfigBean.getIntBadDebt() / 100 / 365;
            double intTurnover = loanAccountBean.getLoan_amount() * diffDay * loanConfigBean.getIntTurnover() / 100 / 365;
            double intNormal = loanAccountBean.getLoan_amount() * diffDay * loanConfigBean.getIntNormal() / 100 / 365;
            txtIntBadDebt.setText(NumberFormat.showDouble2(intBadDebt));
            txtIntTurnover.setText(NumberFormat.showDouble2(intTurnover));
            txtIntNormal.setText(NumberFormat.showDouble2(intNormal));

            double totalInterest = feeAmt + loanAccountBean.getIntBalance() + interestToday; //รวมดอกเบี้ยสุทธิ
            txtBalanceToClose.setText(NumberFormat.showDouble2(feeAmt + totalInterest + loanAccountBean.getLoan_amount()));
            txtTotalPayment.setText(NumberFormat.showDouble2(feeAmt + totalInterest + loanAccountBean.getLoan_amount()));
        }

        loadPaymentHistory();
        txtPaymentAmountCash.selectAll();
    }

    private void paymentConfirm() {
        double loanBalanceToPayment = NumberFormat.toDouble(txtBalanceToClose.getText());
        if (loanBalanceToPayment <= 0) {
            MessageAlert.warningPopup(this, "ไม่มียอดค้างชำระในระบบ :)");
            txtPaymentAmountCash.setText("0.00");
            txtPaymentAmountCash.selectAll();
            txtPaymentAmountCash.requestFocus();
            return;
        }
        double PaymentAmountCash = NumberFormat.toDouble(txtPaymentAmountCash.getText());
        if (PaymentAmountCash <= 0) {
            MessageAlert.warningPopup(this, "กรุณาระบุจำนวนเงินรับชำระด้วย !");
            txtPaymentAmountCash.setText("0.00");
            txtPaymentAmountCash.selectAll();
            txtPaymentAmountCash.requestFocus();
            return;
        }
        if (PaymentAmountCash > loanBalanceToPayment) {
            MessageAlert.warningPopup(this, "จำนวนเงินรับชำระไม่ถูกต้อง !");
            txtPaymentAmountCash.setText("0.00");
            txtPaymentAmountCash.selectAll();
            txtPaymentAmountCash.requestFocus();
            return;
        }
        int confirm1 = MessageAlert.showConfirm(this, "กรุณายืนยันการบันทึกข้อมูลรับชำระ ?");
        if (confirm1 == MessageAlert.YES_OPTION) {
            if (PaymentAmountCash == loanBalanceToPayment) {
                int confirm = MessageAlert.showConfirm(this, "ท่านต้องการชำระยอดเต็มจำนวน เพื่อปิดบัญชีใช่หรือไม่ ?");
                if (confirm == MessageAlert.YES_OPTION) {
                    if (isEffitiveRate) {
                        confirmPaymentEff();
                        return;
                    }
                    confirmPayment2();
                }
                txtPaymentAmountCash.setText("0.00");
                txtPaymentAmountCash.selectAll();
                txtPaymentAmountCash.requestFocus();
                return;
            }
            if (isEffitiveRate) {
                confirmPaymentEff();
            } else {
                confirmPayment2();
            }
        }
    }

    private void confirmPaymentEff() {
        double backupPaymentAmountCash = NumberFormat.toDouble(txtPaymentAmountCash.getText());//จำนวนเงินที่ลูกค้าจ่าย
        double paymentAmountCash = NumberFormat.toDouble(txtPaymentAmountCash.getText());//จำนวนเงินที่ลูกค้าจ่าย

        double interestToday = NumberFormat.toDouble(txtTodayInterest.getText());//ดอกเบี้ยที่คำนวณได้ของวันนี้
        double intBalanceAmt = NumberFormat.toDouble(txtIntBalance.getText());//ดอกเบี้ยค้างชำระจากงวดที่แล้ว
        double totalIntAmt = interestToday + intBalanceAmt;//รวมดอกเบี้ยที่ต้องชำระทั้งหมด

        double paymentFee = NumberFormat.toDouble(txtPaymentFee.getText());//ค่าปรับชำระเกินจำนวน
        double principleBalance = NumberFormat.toDouble(txtPrincipleBalance.getText());//เงินต้นคงเหลือ
        if (paymentAmountCash < paymentFee) {
            MessageAlert.warningPopup(this, "จำนวนเงินที่รับชำระต้องมากกว่าค่าปรับ");
            return;
        }

        double minusInterestAmt;//ยอดชำระตัดดอกเบี้ยทั้งหมด
        double minusBalanceAmt;//ยอดที่ตัดเงินต้น หลังจากหักค่าธรรมเนียมและดอกเบี้ยแล้ว

        paymentAmountCash = paymentAmountCash - paymentFee;// ลบค่าธรรมเนียม ต้องชำระเต็มจำนวนเท่านั้น

        // step1
        if (paymentAmountCash >= totalIntAmt) {
            minusInterestAmt = totalIntAmt;// เท่ากับว่าลบดอกเบี้ยทั้งหมด
            paymentAmountCash = paymentAmountCash - totalIntAmt;
        } else {
            minusInterestAmt = paymentAmountCash;
            paymentAmountCash = 0;
        }

        // step2
        if (paymentAmountCash >= principleBalance) {
            minusBalanceAmt = principleBalance;// เท่ากับว่าลบเงินต้นออก
            paymentAmountCash = paymentAmountCash - principleBalance; // อาจมีเงินทอน
        } else {
            minusBalanceAmt = paymentAmountCash;// ลบเงินต้นเท่าที่เหลือยกมา
            paymentAmountCash = 0;
        }

        System.out.println("เงินทอน: " + paymentAmountCash);

        //update profile
        if (minusBalanceAmt > 0) {
            String sql = "update cb_profile set "
                    + "Loan_Credit_Balance=Loan_Credit_Balance+" + minusBalanceAmt + ","
                    + "Loan_Balance=Loan_Balance-" + minusBalanceAmt + " "
                    + "where p_CustCode='" + profileBean.getP_custCode() + "'";
            profileControl.update(sql);
        }
        //update loan account
        String sql = "update cb_loan_account set "
                + "pay_amount='" + backupPaymentAmountCash + "',"
                + "loan_amount=loan_amount-" + minusBalanceAmt + ","
                + "pay_date=curdate(),"
                + "loan_datepay=curdate(),"
                + "pay_time=curtime(),"
                + "pay_user='" + Value.USER_CODE + "',"
                + "int_balance=" + (totalIntAmt - minusInterestAmt) + " "
                + "where loan_docno='" + loanAccountBean.getLoan_docno() + "' "
                + "and cust_code='" + loanAccountBean.getCust_code() + "'";
        loanAccountControl.update(sql);

        //ต้อง Save ลง history ของการรับชำระเงินด้วย
        CbTransactionLoanBean cbTransactionLoanBean = new CbTransactionLoanBean();
        Date d1 = DateFormat.getLocal_ddMMyyyy(txtPaymentDate.getText());
        cbTransactionLoanBean.setT_date(d1);
        cbTransactionLoanBean.setT_acccode(loanAccountBean.getLoan_docno());
        cbTransactionLoanBean.setT_custcode(loanAccountBean.getCust_code());
        cbTransactionLoanBean.setT_description("รับชำระเงินกู้");
        cbTransactionLoanBean.setT_amount(minusBalanceAmt);
        cbTransactionLoanBean.setT_interest(minusInterestAmt);
        cbTransactionLoanBean.setT_loan_int_ar_int(totalIntAmt - minusInterestAmt);
        cbTransactionLoanBean.setT_empcode(Value.USER_CODE);

        String paymentDocNo;
        ConfigBean configBean = configControl.findOne();
        if (configBean.getBranchPrefix().equals("Y")) {
            BranchBean branchBean = branchControl.getData();
            paymentDocNo = branchBean.getCode() + configBean.getPaymentDocPrefix() + getRunning(configBean.getPaymentDocRunning());
        } else {
            paymentDocNo = configBean.getPaymentDocPrefix() + getRunning(configBean.getPaymentDocRunning());
        }
        cbTransactionLoanBean.setT_docno(paymentDocNo);
        cbTransactionLoanBean.setT_booktype(AppConstants.BOOKTYPE_PAYMENT);
        cbTransactionLoanBean.setBranch_code(Value.BRANCH_CODE);
        cbTransactionLoanBean.setT_status(AppConstants.CB_STATUS_PAYMENT);
        cbTransactionLoanBean.setRemark("");
        cbTransactionLoanBean.setT_hoon(0);
        cbTransactionLoanBean.setLineNo(cbTransactionLoanControl.getLineByAccount(loanAccountBean.getLoan_docno()));
        cbTransactionLoanBean.setT_loan_int_ar_lost(0);
        cbTransactionLoanBean.setT_loan_int_ar_mgr(0);
        cbTransactionLoanBean.setT_balance(principleBalance - minusBalanceAmt);
        cbTransactionLoanBean.setT_fee(paymentFee);
        cbTransactionLoanBean.setT_index(cbTransactionLoanControl.getMaxIndex(loanAccountBean.getLoan_docno()));

        if (cbTransactionLoanControl.saveCbTransactionLoan(cbTransactionLoanBean)) {
            //update payment doc running
            loanAccountControl.update("update cb_config set PaymentDocRunning=PaymentDocRunning+1");
            txtPaymentDocNo.setText(paymentDocNo);
            MessageAlert.infoPopup(this, "บันทึกข้อมูลเรียบร้อยแล้ว");

            //printer out to printer
            PrintCOM printCOM = new PrintCOM();
            printCOM.printPaymentLoan(cbTransactionLoanBean);

            txtPaymentDate.setText("");
            txtPaymentFee.setText("0.00");
            txtIntBadDebt.setText("0.00");
            txtIntTurnover.setText("0.00");
            txtIntNormal.setText("0.00");
            txtTotalPayment.setText("0.00");
            txtPaymentAmountCash.setText("0.00");

            jTabbedPane7.setSelectedIndex(1);

            loadPaymentHistory();

            jTabbedPane7.setEnabledAt(0, false);

            PrintLoanBookDialog printLoanBook = new PrintLoanBookDialog(null, true, cbTransactionLoanBean.getT_acccode());
            printLoanBook.setVisible(true);
        }
    }

    private void loadPaymentHistory() {
        List<CbTransactionLoanBean> listLoan = cbTransactionLoanControl.listCbTransactionLoanPayment(loanAccountBean.getLoan_docno(), profileBean.getP_custCode());
        DefaultTableModel model = (DefaultTableModel) tbHistoryPayment.getModel();
        TableUtil.clearModel(model);

        TableUtil.alignRight(tbHistoryPayment, 2);
        TableUtil.alignRight(tbHistoryPayment, 3);
        TableUtil.alignRight(tbHistoryPayment, 4);
        TableUtil.alignRight(tbHistoryPayment, 5);
        TableUtil.alignRight(tbHistoryPayment, 6);
        TableUtil.alignRight(tbHistoryPayment, 7);

        for (int i = 0; i < listLoan.size(); i++) {
            CbTransactionLoanBean bean = (CbTransactionLoanBean) listLoan.get(i);
            model.addRow(new Object[]{
                DateFormat.getLocale_ddMMyyyy(bean.getT_date()),
                bean.getT_acccode(),
                NumberFormat.showDouble2(bean.getT_loan_int_ar_lost()),
                NumberFormat.showDouble2(bean.getT_loan_int_ar_mgr()),
                NumberFormat.showDouble2(bean.getT_loan_int_ar_int()),
                NumberFormat.showDouble2(bean.getT_fee()),
                NumberFormat.showDouble2(bean.getT_amount()),
                NumberFormat.showDouble2(bean.getT_balance()),
                bean.getT_empcode(),
                bean.getBranch_code()
            });
        }
    }

    private void confirmPayment2() {
        //จำนวนเงินที่รับชำระ
        double PaymentAmountCash = NumberFormat.toDouble(txtPaymentAmountCash.getText());

        if (PaymentAmountCash <= 0) {
            return;
        }

        double Temp_PaymentAmountCash = PaymentAmountCash;
        double returnLoanAmt = 0.00;
        double tempOver = 0.00;

        double PaymentFee = NumberFormat.toDouble(txtPaymentFee.getText());
        double Temp_PaymentFee = PaymentFee;

        List<CbLoanTablePaymentBean> listTable = cbLoanTablePaymentControl.listCbLoanTablePayment(loanAccountBean.getLoan_docno());
        boolean isNext = true;
        for (int i = 0; i < listTable.size(); i++) {
            CbLoanTablePaymentBean bean = (CbLoanTablePaymentBean) listTable.get(i);

            //ทำให้ยอดเงินต้นเป็น int
            double a = bean.getBase_total_amount();
            double b = (int) bean.getBase_total_amount();
            bean.setBase_total_amount((int) bean.getBase_total_amount());

            if (bean.getBalance_amount() <= 0) {
                continue;
            }

            if (PaymentAmountCash <= bean.getBalance_amount()) {
                bean.setPayment_balance(PaymentAmountCash);
                bean.setPayment_money(PaymentAmountCash);
            } else {
                //กรณีเงินเกินงวดนั้น
                bean.setPayment_balance(bean.getBalance_amount());
                bean.setPayment_money(bean.getBalance_amount());
            }

            double total;
            if (PaymentAmountCash > PaymentFee) {//ค่าปรับ
                bean.setPayment_fee(0);
                PaymentFee = 0;
                total = PaymentAmountCash - PaymentFee;

                if (total > bean.getLoan_int_ar_lost()) {//หนี้สูญ
                    total = total - bean.getLoan_int_ar_lost();
                    bean.setLoan_int_ar_lost(0);

                    if (total > bean.getLoan_int_ar_mgr()) {//จัดการ
                        total = total - bean.getLoan_int_ar_mgr();
                        bean.setLoan_int_ar_mgr(0);

                        if (total > bean.getLoan_int_ar_int()) {//ดอกเบี้ย
                            total = total - bean.getLoan_int_ar_int();
                            bean.setLoan_int_ar_int(0);

                            if (total >= bean.getBase_total_amount()) {//เงินต้น
                                returnLoanAmt += bean.getBase_total_amount();

                                tempOver += (a - b);

                                total = total - bean.getBase_total_amount();
                                bean.setBalance_amount(0);
                                bean.setBase_total_amount(0);

                                if (total > 0) {
                                    PaymentAmountCash = total;
                                    isNext = false;
                                }

                            } else {//เงินต้น
                                returnLoanAmt += total;
                                total = bean.getBase_total_amount() - total;
                                bean.setBase_total_amount(total);

                                double totalB = bean.getLoan_int_ar_lost() + bean.getLoan_int_ar_mgr() + bean.getLoan_int_ar_int() + total;
                                bean.setBalance_amount(totalB);

                                isNext = true;
                            }
                        } else {//ดอกเบี้ย                                
                            total = bean.getLoan_int_ar_int() - total;
                            bean.setBalance_amount(bean.getBalance_amount() - bean.getLoan_int_ar_int() + total);
                            bean.setLoan_int_ar_int(total);
                        }
                    } else {//จัดการ                            
                        total = bean.getLoan_int_ar_mgr() - total;
                        bean.setBalance_amount(bean.getBalance_amount() - bean.getLoan_int_ar_mgr() + total);
                        bean.setLoan_int_ar_mgr(total);
                    }
                } else {//หนี้สูญ                        
                    total = bean.getLoan_int_ar_lost() - total;
                    bean.setBalance_amount(bean.getBalance_amount() - bean.getLoan_int_ar_lost() + total);
                    bean.setLoan_int_ar_lost(total);
                }
            } else {//ค่าปรับ                    
                total = PaymentFee - PaymentAmountCash;
                bean.setBalance_amount(bean.getBalance_amount() - PaymentFee + total);
                bean.setPayment_fee(total);
                PaymentFee = total;
                txtPaymentFee.setText(NumberFormat.showDouble2(total));//แสดงจำนวนค่าปรับคงเหลือ
            }

            String sql = "update cb_loan_table_payment set "
                    + "loan_int_ar_lost='" + bean.getLoan_int_ar_lost() + "',"
                    + "loan_int_ar_mgr='" + bean.getLoan_int_ar_mgr() + "',"
                    + "loan_int_ar_int='" + bean.getLoan_int_ar_int() + "',"
                    + "base_total_amount='" + bean.getBase_total_amount() + "',"
                    + "balance_amount='" + bean.getBalance_amount() + "', "
                    + "payment_balance=payment_balance+" + bean.getPayment_balance() + ", "
                    + "payment_money=payment_money+" + bean.getPayment_money() + ", "
                    + "payment_fee='" + bean.getPayment_fee() + "' "
                    + "where loan_doc_no='" + bean.getLoan_doc_no() + "' "
                    + "and loan_index='" + bean.getLoan_index() + "' "
                    + "and balance_amount>0";
            cbLoanTablePaymentControl.update(sql);
            if (isNext) {
                break;
            }
        }

        try {
            //update loan account
            String sql = "update cb_loan_account set "
                    + "pay_amount='" + Temp_PaymentAmountCash + "',"
                    + "pay_date=curdate(),"
                    + "loan_datepay=curdate(),"
                    + "pay_time=curtime(),"
                    + "pay_user='" + Value.USER_CODE + "' "
                    + "where loan_docno='" + loanAccountBean.getLoan_docno() + "' "
                    + "and cust_code='" + loanAccountBean.getCust_code() + "'";
            loanAccountControl.update(sql);
        } catch (Exception e) {
            MessageAlert.errorPopup(this, e.getMessage());
            logger.error(e.getMessage());
        }

        String sql = "update cb_profile set "
                + "Loan_Credit_Balance=Loan_Credit_Balance+" + (returnLoanAmt + tempOver) + ","
                + "Loan_Balance=Loan_Balance-" + (returnLoanAmt + tempOver) + " "
                + "where p_CustCode='" + loanAccountBean.getCust_code() + "'";
        profileControl.update(sql);

        //ต้อง Save ลง history ของการรับชำระเงินด้วย
        CbTransactionLoanBean loanBean = new CbTransactionLoanBean();
        Date d1 = DateFormat.getLocal_ddMMyyyy(txtPaymentDate.getText());
        loanBean.setT_date(d1);
        loanBean.setT_acccode(loanAccountBean.getLoan_docno());
        loanBean.setT_custcode(loanAccountBean.getCust_code());
        loanBean.setT_description("รับชำระเงินกู้");
        loanBean.setT_amount(Temp_PaymentAmountCash);
        loanBean.setT_empcode(Value.USER_CODE);
        loanBean.setT_docno(loanAccountBean.getLoan_docno());
        loanBean.setT_booktype(AppConstants.BOOKTYPE_PAYMENT);
        loanBean.setBranch_code(Value.BRANCH_CODE);
        loanBean.setT_status(AppConstants.CB_STATUS_PAYMENT);
        loanBean.setRemark("");
        loanBean.setT_hoon(0);
        loanBean.setLineNo(cbTransactionLoanControl.getLineByAccount(loanAccountBean.getLoan_docno()));
        double ArLoanIntLost = NumberFormat.toDouble(txtIntBadDebt.getText());
        double ArLoanIntMgr = NumberFormat.toDouble(txtIntTurnover.getText());
        double ArLoanIntInt = NumberFormat.toDouble(txtIntNormal.getText());
        loanBean.setT_interest(ArLoanIntLost + ArLoanIntMgr + ArLoanIntInt);
        loanBean.setT_loan_int_ar_lost(ArLoanIntLost);
        loanBean.setT_loan_int_ar_mgr(ArLoanIntMgr);
        loanBean.setT_loan_int_ar_int(ArLoanIntInt);

        double balance = 0.00;
        try {
            sql = "select sum(balance_amount) balance_amount "
                    + "from cb_loan_table_payment "
                    + "where loan_doc_no='" + loanAccountBean.getLoan_docno() + "'";
            ResultSet rs = cbLoanTablePaymentControl.findData(sql);
            if (rs.next()) {
                balance = rs.getDouble("balance_amount");
            }
            rs.close();
        } catch (SQLException e) {
            MessageAlert.errorPopup(this, e.getMessage());
            logger.error(e.getMessage());
        }

        loanBean.setT_balance(balance);
        loanBean.setT_fee(Temp_PaymentFee);

        cbTransactionLoanControl.saveCbTransactionLoan(loanBean);

        //printer out to printer
        try {
            PrintCOM pc = new PrintCOM();
            pc.printPaymentLoan(loanBean);
        } catch (Exception e) {
            System.err.println(e);
        }

        MessageAlert.infoPopup(this, "บันทึกข้อมูลเรียบร้อยแล้ว");
        txtPaymentDate.setText("");
        txtPaymentFee.setText("0.00");
        txtIntBadDebt.setText("0.00");
        txtIntTurnover.setText("0.00");
        txtIntNormal.setText("0.00");
        txtTotalPayment.setText("0.00");
        txtPaymentAmountCash.setText("0.00");

        jTabbedPane7.setSelectedIndex(1);

        loadPaymentHistory();
    }

    private void initLoadTable() {
        JTableHeader tHeader1 = tbHistoryPayment.getTableHeader();
        tHeader1.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, AppConstants.DEFAULT_FONT_SIZE));
        tbHistoryPayment.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        tbHistoryPayment.setRowHeight(25);
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
}
