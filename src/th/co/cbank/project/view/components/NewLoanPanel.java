package th.co.cbank.project.view.components;

import java.awt.Font;
import java.awt.Point;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.apache.log4j.Logger;
import th.co.cbank.project.constants.AppConstants;
import th.co.cbank.project.control.AddressControl;
import th.co.cbank.project.control.BranchControl;
import th.co.cbank.project.control.CbBondsmanControl;
import th.co.cbank.project.control.CbLoanAccountControl;
import th.co.cbank.project.control.CbLoanConfigControl;
import th.co.cbank.project.control.CbLoanTablePaymentControl;
import th.co.cbank.project.control.CbTransactionLoanControl;
import th.co.cbank.project.control.ConfigControl;
import th.co.cbank.project.control.DocumentGarunteeControl;
import th.co.cbank.project.control.PassBook_PSiPR9;
import th.co.cbank.project.control.ProfileControl;
import th.co.cbank.project.control.Value;
import th.co.cbank.project.model.AddressBean;
import th.co.cbank.project.model.BranchBean;
import th.co.cbank.project.model.CbBondsmanBean;
import th.co.cbank.project.model.CbLoanAccountBean;
import th.co.cbank.project.model.CbLoanConfigBean;
import th.co.cbank.project.model.CbLoanTablePaymentBean;
import th.co.cbank.project.model.CbTransactionLoanBean;
import th.co.cbank.project.model.ConfigBean;
import th.co.cbank.project.model.DocumentGarunteeBean;
import th.co.cbank.project.model.ProfileBean;
import th.co.cbank.project.model.ReportOrangeBean;
import th.co.cbank.project.view.AddCreditLoanDialog;
import th.co.cbank.project.view.ApproveDialog;
import th.co.cbank.project.view.PaperLoanJDialog;
import th.co.cbank.util.DateChooseDialog;
import th.co.cbank.util.DateFormat;
import th.co.cbank.util.ImagePreviewPanel;
import th.co.cbank.util.JTableUtil;
import th.co.cbank.util.MessageAlert;
import th.co.cbank.util.NumberFormat;
import th.co.cbank.util.StringUtil;
import th.co.cbank.util.TableUtil;

public class NewLoanPanel extends javax.swing.JPanel {

    private final Logger logger = Logger.getLogger(NewLoanPanel.class);
    private ProfileBean profileBean;
    private String profileName;
    private String empCode;
    private final CbLoanAccountControl loanAccountControl = new CbLoanAccountControl();
    private final BranchControl branchControl = new BranchControl();
    private final ProfileControl profileControl = new ProfileControl();
    private final CbLoanConfigControl loanConfigControl = new CbLoanConfigControl();
    private final ConfigControl configControl = new ConfigControl();
    private final AddressControl addressControl = new AddressControl();
    private final CbBondsmanControl cbBondsmanControl = new CbBondsmanControl();
    private final CbLoanTablePaymentControl cbLoanTablePaymentControl = new CbLoanTablePaymentControl();
    private final CbTransactionLoanControl cbTransactionLoanControl = new CbTransactionLoanControl();
    private final DocumentGarunteeControl documentGarunteeControl = new DocumentGarunteeControl();

    private DefaultTableModel bonsmanModel;

    public NewLoanPanel(ProfileBean profileBean, String empCode) {
        initComponents();

        initLoadTable();

        txtLoanDateStart.setText(DateFormat.getLocale_ddMMyyyy(new Date()));
        txtLoanDateEnd.setText(DateFormat.getLocale_ddMMyyyy(new Date()));

        this.profileBean = profileBean;
        this.empCode = empCode;

        initLoad();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel52 = new javax.swing.JPanel();
        lblLoanPromiseTitle = new javax.swing.JLabel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel60 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        txtAddrProvince1 = new javax.swing.JTextField();
        txtAddrPost1 = new javax.swing.JTextField();
        txtAddrAmphur1 = new javax.swing.JTextField();
        txtAddrTambon1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txtAddrMobile1 = new javax.swing.JTextField();
        txtAddrTel1 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        txtAddNo1 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        txtAddrRoad1 = new javax.swing.JTextField();
        txtAddrSoi1 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        txtAddrMoo1 = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        txtAddrMooName1 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        txtLoanName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        txtLoanCustID = new javax.swing.JTextField();
        txtLoanAge = new javax.swing.JTextField();
        txtLoanCardExpire = new javax.swing.JTextField();
        txtLoanBirthDate = new javax.swing.JTextField();
        jLabel137 = new javax.swing.JLabel();
        txtLoanSex = new javax.swing.JTextField();
        jLabel144 = new javax.swing.JLabel();
        txtLoanOccu = new javax.swing.JTextField();
        jLabel202 = new javax.swing.JLabel();
        txtLoanRegMember = new javax.swing.JTextField();
        jLabel205 = new javax.swing.JLabel();
        cbAddrType = new javax.swing.JComboBox();
        jPanel26 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        txtLoanAmt = new javax.swing.JTextField();
        jLabel179 = new javax.swing.JLabel();
        cbLoanAcc = new javax.swing.JComboBox();
        cbLoanTypePayment = new javax.swing.JComboBox();
        btnApproveMoreMoney = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        txtLoanFee = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        txtLoanDateStart = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtLoanDateEnd = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtPayPerMonth = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtIntFixedName = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        txtFeeRateName = new javax.swing.JTextField();
        jLabel120 = new javax.swing.JLabel();
        txtLoanPenaltyINT = new javax.swing.JTextField();
        jLabel121 = new javax.swing.JLabel();
        jLabel206 = new javax.swing.JLabel();
        txtLoanIntPercent = new javax.swing.JTextField();
        jLabel207 = new javax.swing.JLabel();
        jLabel208 = new javax.swing.JLabel();
        txtLoanPerMonth = new javax.swing.JTextField();
        jLabel209 = new javax.swing.JLabel();
        jLabel211 = new javax.swing.JLabel();
        txtStartLoanDate = new javax.swing.JTextField();
        jButton18 = new javax.swing.JButton();
        jLabel55 = new javax.swing.JLabel();
        txtLoanDocCode = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        txtIntBadDebt = new javax.swing.JTextField();
        jLabel198 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        txtIntTurnover = new javax.swing.JTextField();
        jLabel201 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        txtIntNormal = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbArGroup1 = new javax.swing.JTable();
        jLabel38 = new javax.swing.JLabel();
        txtB1 = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        txtB4 = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        txtB5 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        lbLoanCreditBalance = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        jPanel50 = new javax.swing.JPanel();
        txtLoanCustCode = new javax.swing.JTextField();
        jLabel194 = new javax.swing.JLabel();
        btnSaveGuarantor = new javax.swing.JButton();
        btnCancelSaveGuarantor = new javax.swing.JButton();
        btnChooseGuarantor = new javax.swing.JButton();
        btnDelSaveGuarantor = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel193 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        txtLoanCustSurname = new javax.swing.JTextField();
        txtLoanCustName = new javax.swing.JTextField();
        lbLimitApprovePerson = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbGuarantor = new javax.swing.JTable();
        jLabel196 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtAssetGaruntee1 = new javax.swing.JTextArea();
        txtImg1 = new javax.swing.JTextField();
        jLabel197 = new javax.swing.JLabel();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        txtImg2 = new javax.swing.JTextField();
        txtImg3 = new javax.swing.JTextField();
        btn6 = new javax.swing.JButton();
        btnSaveLoanAccountRegister = new javax.swing.JButton();
        btnCancelSaveLoanAccountRegister = new javax.swing.JButton();
        btnPrintLoanPaper = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel52.setBackground(new java.awt.Color(255, 204, 204));

        lblLoanPromiseTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblLoanPromiseTitle.setText("ทำสัญญาเงินกู้");

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLoanPromiseTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLoanPromiseTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "ที่อยู่ติดต่อ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("ตำบล/แขวง");

        txtAddrProvince1.setEditable(false);
        txtAddrProvince1.setBackground(new java.awt.Color(255, 255, 204));
        txtAddrProvince1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddrProvince1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddrProvince1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrProvince1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrProvince1KeyPressed(evt);
            }
        });

        txtAddrPost1.setEditable(false);
        txtAddrPost1.setBackground(new java.awt.Color(255, 255, 204));
        txtAddrPost1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddrPost1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddrPost1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrPost1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrPost1KeyPressed(evt);
            }
        });

        txtAddrAmphur1.setEditable(false);
        txtAddrAmphur1.setBackground(new java.awt.Color(255, 255, 204));
        txtAddrAmphur1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddrAmphur1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddrAmphur1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrAmphur1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrAmphur1KeyPressed(evt);
            }
        });

        txtAddrTambon1.setEditable(false);
        txtAddrTambon1.setBackground(new java.awt.Color(255, 255, 204));
        txtAddrTambon1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddrTambon1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddrTambon1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrTambon1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrTambon1KeyPressed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("อำเภอ/เขต");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel27.setText("รหัสไปรษณีย์");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel29.setText("จังหวัด");

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel37.setText("เบอร์โทรศัพท์");

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel45.setText("เบอร์บ้าน");

        txtAddrMobile1.setEditable(false);
        txtAddrMobile1.setBackground(new java.awt.Color(255, 255, 204));
        txtAddrMobile1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddrMobile1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddrMobile1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrMobile1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrMobile1KeyPressed(evt);
            }
        });

        txtAddrTel1.setEditable(false);
        txtAddrTel1.setBackground(new java.awt.Color(255, 255, 204));
        txtAddrTel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddrTel1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddrTel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrTel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrTel1KeyPressed(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel46.setText("บ้านเลขที่");

        txtAddNo1.setEditable(false);
        txtAddNo1.setBackground(new java.awt.Color(255, 255, 204));
        txtAddNo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAddNo1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddNo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddNo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddNo1KeyPressed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel47.setText("ถนน");

        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel56.setText("ซอย");

        txtAddrRoad1.setEditable(false);
        txtAddrRoad1.setBackground(new java.awt.Color(255, 255, 204));
        txtAddrRoad1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAddrRoad1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrRoad1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrRoad1KeyPressed(evt);
            }
        });

        txtAddrSoi1.setEditable(false);
        txtAddrSoi1.setBackground(new java.awt.Color(255, 255, 204));
        txtAddrSoi1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAddrSoi1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddrSoi1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrSoi1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrSoi1KeyPressed(evt);
            }
        });

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel57.setText("หมู่ที่");

        txtAddrMoo1.setEditable(false);
        txtAddrMoo1.setBackground(new java.awt.Color(255, 255, 204));
        txtAddrMoo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAddrMoo1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddrMoo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrMoo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrMoo1KeyPressed(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel61.setText("ชื่อหมู่บ้าน");

        txtAddrMooName1.setEditable(false);
        txtAddrMooName1.setBackground(new java.awt.Color(255, 255, 204));
        txtAddrMooName1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAddrMooName1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddrMooName1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrMooName1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrMooName1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel37))
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAddrRoad1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(txtAddNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAddrMoo1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtAddrTambon1)
                    .addComponent(txtAddrProvince1)
                    .addComponent(txtAddrMobile1))
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel56)))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel27))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel61)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAddrMooName1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtAddrSoi1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                        .addComponent(txtAddrPost1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtAddrTel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtAddrAmphur1, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel46)
                        .addComponent(txtAddNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel57)
                            .addComponent(txtAddrMoo1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAddrMooName1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel61))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(txtAddrRoad1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56)
                    .addComponent(txtAddrSoi1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtAddrTambon1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddrAmphur1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtAddrProvince1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddrPost1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(txtAddrMobile1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45)
                    .addComponent(txtAddrTel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel62.setText("ชื่อ-นามสกุล");

        jLabel83.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel83.setText("ปี");

        txtLoanName.setEditable(false);
        txtLoanName.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("วันหมดอายุบัตร");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("รหัสบัตรประชาชน");

        jLabel93.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel93.setText("วันเกิด");

        jLabel72.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel72.setText("อายุ");

        txtLoanCustID.setEditable(false);
        txtLoanCustID.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanCustID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanCustID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanCustID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtLoanAge.setEditable(false);
        txtLoanAge.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanAge.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanAge.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanAge.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtLoanCardExpire.setEditable(false);
        txtLoanCardExpire.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanCardExpire.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanCardExpire.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanCardExpire.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtLoanBirthDate.setEditable(false);
        txtLoanBirthDate.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanBirthDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanBirthDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanBirthDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel137.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel137.setText("เพศ");

        txtLoanSex.setEditable(false);
        txtLoanSex.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanSex.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtLoanSex.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanSex.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel144.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel144.setText("อาชีพ");

        txtLoanOccu.setEditable(false);
        txtLoanOccu.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanOccu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanOccu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanOccu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel202.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel202.setText("วันที่สมัครสมาชิก");

        txtLoanRegMember.setEditable(false);
        txtLoanRegMember.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanRegMember.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanRegMember.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanRegMember.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel205.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel205.setText("เลือกที่อยู่ในการทำสัญญากู้เงิน");

        cbAddrType.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbAddrType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ที่อยู่ปัจจุบัน", "ที่อยู่ตามบัตรประชาชน", "ที่อยู่ที่ทำงาน" }));
        cbAddrType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAddrTypeItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel62)
                    .addComponent(jLabel72)
                    .addComponent(jLabel93)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel137)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLoanSex, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel202)
                                    .addComponent(jLabel144))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLoanOccu, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLoanRegMember, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtLoanBirthDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                            .addComponent(txtLoanCustID, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtLoanAge, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel83))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(txtLoanCardExpire, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel205)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbAddrType, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtLoanName, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(277, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtLoanCustID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel137)
                    .addComponent(txtLoanSex, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(txtLoanName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72)
                    .addComponent(txtLoanAge, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel83)
                    .addComponent(jLabel144)
                    .addComponent(txtLoanOccu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel93)
                    .addComponent(txtLoanBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel202)
                    .addComponent(txtLoanRegMember, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel205)
                    .addComponent(cbAddrType, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLoanCardExpire, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane3.addTab("รายละเอียดผู้กู้", jPanel60);

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));

        jPanel22.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel22.setOpaque(false);

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel28.setText("เลือกบัญชี");

        jLabel172.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel172.setText("วงเงินที่ขอกู้");

        txtLoanAmt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanAmt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanAmt.setText("0.00");
        txtLoanAmt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtLoanAmt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLoanAmtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLoanAmtFocusLost(evt);
            }
        });
        txtLoanAmt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoanAmtKeyPressed(evt);
            }
        });

        jLabel179.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel179.setText("บาท");

        cbLoanAcc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbLoanAcc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbLoanAccItemStateChanged(evt);
            }
        });

        cbLoanTypePayment.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbLoanTypePayment.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "รายวัน", "รายเดือน", "รายปี" }));
        cbLoanTypePayment.setSelectedIndex(1);
        cbLoanTypePayment.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbLoanTypePaymentItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(cbLoanTypePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel172)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLoanAmt))
                    .addComponent(cbLoanAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel179)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(cbLoanAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel172)
                    .addComponent(txtLoanAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel179)
                    .addComponent(cbLoanTypePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        btnApproveMoreMoney.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnApproveMoreMoney.setText("ให้วงเงินเพิ่ม");
        btnApproveMoreMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveMoreMoneyActionPerformed(evt);
            }
        });

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel58.setText("ค่าธรรมเนียม");

        txtLoanFee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanFee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanFee.setText("0.00");
        txtLoanFee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtLoanFee.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLoanFeeFocusGained(evt);
            }
        });
        txtLoanFee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoanFeeKeyPressed(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel63.setText("กำหนดเริ่มชำระ");

        txtLoanDateStart.setEditable(false);
        txtLoanDateStart.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanDateStart.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanDateStart.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtLoanDateStart.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoanDateStartKeyPressed(evt);
            }
        });

        jButton17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton17.setText("...");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("งวดสุดท้าย");

        txtLoanDateEnd.setEditable(false);
        txtLoanDateEnd.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanDateEnd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanDateEnd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanDateEnd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtLoanDateEnd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLoanDateEndFocusGained(evt);
            }
        });
        txtLoanDateEnd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoanDateEndKeyPressed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setText("ผ่อนชำระงวดล่ะ");

        txtPayPerMonth.setEditable(false);
        txtPayPerMonth.setBackground(new java.awt.Color(255, 255, 204));
        txtPayPerMonth.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPayPerMonth.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPayPerMonth.setText("0.00");
        txtPayPerMonth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtPayPerMonth.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPayPerMonthFocusGained(evt);
            }
        });
        txtPayPerMonth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPayPerMonthKeyPressed(evt);
            }
        });

        jLabel82.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel82.setText("บาท");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("ประเภทดอกเบี้ย");

        txtIntFixedName.setEditable(false);
        txtIntFixedName.setBackground(new java.awt.Color(255, 255, 204));
        txtIntFixedName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtIntFixedName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel97.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel97.setText("การคิดค่าปรับ");

        txtFeeRateName.setEditable(false);
        txtFeeRateName.setBackground(new java.awt.Color(255, 255, 204));
        txtFeeRateName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtFeeRateName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel120.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel120.setText("ดอกเบี้ยค่าปรับ");

        txtLoanPenaltyINT.setEditable(false);
        txtLoanPenaltyINT.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanPenaltyINT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanPenaltyINT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanPenaltyINT.setText("0.00");
        txtLoanPenaltyINT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel121.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel121.setText("%");

        jLabel206.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel206.setText("ดอกเบี้ย");

        txtLoanIntPercent.setEditable(false);
        txtLoanIntPercent.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanIntPercent.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanIntPercent.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanIntPercent.setText("0.00");
        txtLoanIntPercent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel207.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel207.setText("%");

        jLabel208.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel208.setText("จำนวนงวด");

        txtLoanPerMonth.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanPerMonth.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanPerMonth.setText("1");
        txtLoanPerMonth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtLoanPerMonth.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLoanPerMonthFocusGained(evt);
            }
        });
        txtLoanPerMonth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoanPerMonthKeyPressed(evt);
            }
        });

        jLabel209.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel209.setText("งวด");

        jLabel211.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel211.setText("วันที่ออกสัญญา");

        txtStartLoanDate.setEditable(false);
        txtStartLoanDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtStartLoanDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtStartLoanDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtStartLoanDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtStartLoanDateFocusGained(evt);
            }
        });
        txtStartLoanDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtStartLoanDateKeyPressed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton18.setText("...");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel55.setText("เลขที่สัญญา");

        txtLoanDocCode.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanDocCode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanDocCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanDocCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtLoanDocCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoanDocCodeKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel55))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel208, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jLabel63, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel120, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel97, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel211, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLoanFee, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtLoanDocCode, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel25Layout.createSequentialGroup()
                                .addComponent(txtLoanPenaltyINT, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel121)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel206)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLoanIntPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtFeeRateName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIntFixedName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addComponent(txtStartLoanDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel25Layout.createSequentialGroup()
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtPayPerMonth)
                                    .addComponent(txtLoanDateEnd, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel25Layout.createSequentialGroup()
                                        .addComponent(txtLoanPerMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel209))
                                    .addComponent(txtLoanDateStart, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel82))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel207)))
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(txtLoanDocCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel211)
                    .addComponent(txtStartLoanDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtIntFixedName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFeeRateName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel97))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel120)
                    .addComponent(txtLoanPenaltyINT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel121)
                    .addComponent(jLabel206)
                    .addComponent(txtLoanIntPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel207))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(txtLoanFee, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel208)
                    .addComponent(txtLoanPerMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel209))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLoanDateStart, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtLoanDateEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtPayPerMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel82))
                .addContainerGap())
        );

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel50.setText("สำรองหนี้สูญ");

        txtIntBadDebt.setEditable(false);
        txtIntBadDebt.setBackground(new java.awt.Color(255, 255, 204));
        txtIntBadDebt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtIntBadDebt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIntBadDebt.setText("0.00");
        txtIntBadDebt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtIntBadDebt.setEnabled(false);
        txtIntBadDebt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIntBadDebtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIntBadDebtFocusLost(evt);
            }
        });
        txtIntBadDebt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIntBadDebtKeyPressed(evt);
            }
        });

        jLabel198.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel198.setText("%");

        jLabel187.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel187.setText("ค่าจัดการ");

        txtIntTurnover.setEditable(false);
        txtIntTurnover.setBackground(new java.awt.Color(255, 255, 204));
        txtIntTurnover.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtIntTurnover.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIntTurnover.setText("0.00");
        txtIntTurnover.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtIntTurnover.setEnabled(false);
        txtIntTurnover.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIntTurnoverFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIntTurnoverFocusLost(evt);
            }
        });
        txtIntTurnover.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIntTurnoverKeyPressed(evt);
            }
        });

        jLabel201.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel201.setText("%");

        jLabel184.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel184.setText("ดอกเบี้ยเงินกู้");

        txtIntNormal.setEditable(false);
        txtIntNormal.setBackground(new java.awt.Color(255, 255, 204));
        txtIntNormal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtIntNormal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIntNormal.setText("0.00");
        txtIntNormal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtIntNormal.setEnabled(false);
        txtIntNormal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIntNormalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIntNormalFocusLost(evt);
            }
        });
        txtIntNormal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIntNormalKeyPressed(evt);
            }
        });

        jLabel99.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel99.setText("%");

        tbArGroup1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbArGroup1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "งวดที่", "เงินต้น", "สำรองหนี้สูญ", "ค่าจัดการ", "ดอกเบี้ยกู้", "รวมยอดชำระ", "คงเหลือ", "วันที่รับชำระ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbArGroup1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane5.setViewportView(tbArGroup1);
        if (tbArGroup1.getColumnModel().getColumnCount() > 0) {
            tbArGroup1.getColumnModel().getColumn(2).setPreferredWidth(120);
            tbArGroup1.getColumnModel().getColumn(5).setPreferredWidth(120);
            tbArGroup1.getColumnModel().getColumn(7).setPreferredWidth(120);
        }

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel38.setText("เงินต้น");

        txtB1.setEditable(false);
        txtB1.setBackground(new java.awt.Color(255, 255, 255));
        txtB1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtB1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB1.setText("0.00");
        txtB1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel60.setText("รวมดอกเบี้ยกู้");

        txtB4.setEditable(false);
        txtB4.setBackground(new java.awt.Color(255, 255, 255));
        txtB4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtB4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB4.setText("0.00");
        txtB4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel66.setText("ยอดชำระ");

        txtB5.setEditable(false);
        txtB5.setBackground(new java.awt.Color(255, 255, 255));
        txtB5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtB5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB5.setText("0.00");
        txtB5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setText("ตารางรับชำระ โดยประมาณ");

        lbLoanCreditBalance.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbLoanCreditBalance.setForeground(new java.awt.Color(0, 102, 255));
        lbLoanCreditBalance.setText("วงเงินในการกู้คงเหลือ 0 บาท");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtB1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel60)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtB4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel66)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtB5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel42)
                            .addComponent(jScrollPane5))
                        .addGap(9, 9, 9))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addComponent(btnApproveMoreMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbLoanCreditBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addComponent(jLabel50)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIntBadDebt, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel198)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel187)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIntTurnover, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel201)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel184)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIntNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel99)))))
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnApproveMoreMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbLoanCreditBalance))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel50)
                            .addComponent(txtIntBadDebt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel198)
                            .addComponent(jLabel187)
                            .addComponent(txtIntTurnover, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel201)
                            .addComponent(jLabel184)
                            .addComponent(txtIntNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel99))
                        .addGap(21, 21, 21)))
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtB1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel60)
                            .addComponent(txtB4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel66)
                            .addComponent(txtB5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38))
                        .addGap(20, 20, 20))))
        );

        jTabbedPane3.addTab("รายละเอียดสัญญา", jPanel26);

        jPanel44.setBackground(new java.awt.Color(255, 255, 255));

        jPanel50.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel50.setOpaque(false);

        txtLoanCustCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLoanCustCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanCustCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtLoanCustCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoanCustCodeKeyPressed(evt);
            }
        });

        jLabel194.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel194.setText("รหัสผู้ค้ำประกัน");

        btnSaveGuarantor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSaveGuarantor.setText("เพิ่มข้อมูลผู้ค้ำ");
        btnSaveGuarantor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveGuarantorActionPerformed(evt);
            }
        });
        btnSaveGuarantor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSaveGuarantorKeyPressed(evt);
            }
        });

        btnCancelSaveGuarantor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelSaveGuarantor.setText("ยกเลิกรายการ");
        btnCancelSaveGuarantor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelSaveGuarantorActionPerformed(evt);
            }
        });

        btnChooseGuarantor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnChooseGuarantor.setText("...");
        btnChooseGuarantor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseGuarantorActionPerformed(evt);
            }
        });

        btnDelSaveGuarantor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDelSaveGuarantor.setText("ลบรายการ");
        btnDelSaveGuarantor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelSaveGuarantorActionPerformed(evt);
            }
        });

        jLabel193.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel193.setText("ชื่อ");

        jLabel190.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel190.setText("นามสกุล");

        txtLoanCustSurname.setEditable(false);
        txtLoanCustSurname.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanCustSurname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLoanCustSurname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanCustSurname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtLoanCustName.setEditable(false);
        txtLoanCustName.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanCustName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLoanCustName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanCustName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        lbLimitApprovePerson.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbLimitApprovePerson.setForeground(new java.awt.Color(51, 51, 255));
        lbLimitApprovePerson.setText("* จำนวนอนุมัติได้คงเหลือ 0 (คน)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbLimitApprovePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel193)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLoanCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel190)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLoanCustSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel193)
                    .addComponent(txtLoanCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel190)
                    .addComponent(txtLoanCustSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbLimitApprovePerson)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel194)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addComponent(txtLoanCustCode, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnChooseGuarantor)
                        .addGap(1, 1, 1))
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addComponent(btnSaveGuarantor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelSaveGuarantor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelSaveGuarantor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel50Layout.createSequentialGroup()
                        .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel194)
                            .addComponent(txtLoanCustCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnChooseGuarantor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDelSaveGuarantor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnSaveGuarantor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCancelSaveGuarantor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbGuarantor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ลำดับ", "รหัสบัตร", "ชื่อ", "นามสกุล", "ความสัมพันธ์"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbGuarantor.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane6.setViewportView(tbGuarantor);
        if (tbGuarantor.getColumnModel().getColumnCount() > 0) {
            tbGuarantor.getColumnModel().getColumn(1).setPreferredWidth(130);
            tbGuarantor.getColumnModel().getColumn(2).setPreferredWidth(130);
            tbGuarantor.getColumnModel().getColumn(3).setPreferredWidth(150);
            tbGuarantor.getColumnModel().getColumn(4).setPreferredWidth(150);
        }

        jLabel196.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel196.setText("รายละเอียดโฉนดที่ดิน");

        txtAssetGaruntee1.setColumns(20);
        txtAssetGaruntee1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAssetGaruntee1.setRows(5);
        jScrollPane7.setViewportView(txtAssetGaruntee1);

        txtImg1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtImg1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel197.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel197.setText("เอกสารรูปภาพ");

        btn4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn4.setText("เลือกภาพ");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn5.setText("เลือกภาพ");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        txtImg2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtImg2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtImg3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtImg3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        btn6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn6.setText("เลือกภาพ");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel196)
                            .addComponent(jLabel197)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtImg3, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                        .addComponent(txtImg2))
                                    .addComponent(txtImg1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn4)
                                    .addComponent(btn6)
                                    .addComponent(btn5)))))
                    .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(jLabel196)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel197)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtImg1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtImg2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtImg3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("บุคคลค้ำประกัน", jPanel44);

        btnSaveLoanAccountRegister.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSaveLoanAccountRegister.setText("บันทึกข้อมูลสัญญากู้เงิน");
        btnSaveLoanAccountRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveLoanAccountRegisterActionPerformed(evt);
            }
        });
        btnSaveLoanAccountRegister.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSaveLoanAccountRegisterKeyPressed(evt);
            }
        });

        btnCancelSaveLoanAccountRegister.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelSaveLoanAccountRegister.setText("ยกเลิกรายการ");
        btnCancelSaveLoanAccountRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelSaveLoanAccountRegisterActionPerformed(evt);
            }
        });

        btnPrintLoanPaper.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPrintLoanPaper.setText("พิมพ์สัญญาเงินกู้");
        btnPrintLoanPaper.setEnabled(false);
        btnPrintLoanPaper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintLoanPaperActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel52, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnSaveLoanAccountRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelSaveLoanAccountRegister)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrintLoanPaper, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane3, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 472, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveLoanAccountRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelSaveLoanAccountRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrintLoanPaper, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtAddrProvince1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrProvince1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrPost1.requestFocus();
        }
    }//GEN-LAST:event_txtAddrProvince1KeyPressed

    private void txtAddrPost1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrPost1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrMobile1.requestFocus();
        }
    }//GEN-LAST:event_txtAddrPost1KeyPressed

    private void txtAddrAmphur1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrAmphur1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrProvince1.requestFocus();
        }
    }//GEN-LAST:event_txtAddrAmphur1KeyPressed

    private void txtAddrTambon1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrTambon1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrAmphur1.requestFocus();
        }
    }//GEN-LAST:event_txtAddrTambon1KeyPressed

    private void txtAddrMobile1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrMobile1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrTel1.requestFocus();
        }
    }//GEN-LAST:event_txtAddrMobile1KeyPressed

    private void txtAddrTel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrTel1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        }
    }//GEN-LAST:event_txtAddrTel1KeyPressed

    private void txtAddNo1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddNo1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrMoo1.requestFocus();
        }
    }//GEN-LAST:event_txtAddNo1KeyPressed

    private void txtAddrRoad1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrRoad1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrSoi1.requestFocus();
        }
    }//GEN-LAST:event_txtAddrRoad1KeyPressed

    private void txtAddrSoi1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrSoi1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrTambon1.requestFocus();
        }
    }//GEN-LAST:event_txtAddrSoi1KeyPressed

    private void txtAddrMoo1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrMoo1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrMooName1.requestFocus();
        }
    }//GEN-LAST:event_txtAddrMoo1KeyPressed

    private void txtAddrMooName1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrMooName1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrRoad1.requestFocus();
        }
    }//GEN-LAST:event_txtAddrMooName1KeyPressed

    private void cbAddrTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAddrTypeItemStateChanged
        loadAddressLoan();
    }//GEN-LAST:event_cbAddrTypeItemStateChanged

    private void txtLoanAmtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLoanAmtFocusGained
        txtLoanAmt.selectAll();
    }//GEN-LAST:event_txtLoanAmtFocusGained

    private void txtLoanAmtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLoanAmtFocusLost
        double loanAmt = NumberFormat.toDouble(txtLoanAmt.getText());
        txtLoanAmt.setText(NumberFormat.showDouble2(loanAmt));
    }//GEN-LAST:event_txtLoanAmtFocusLost

    private void txtLoanAmtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoanAmtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            enterLoan();
        }
    }//GEN-LAST:event_txtLoanAmtKeyPressed

    private void cbLoanAccItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbLoanAccItemStateChanged
        cbLoanAccItemStateChangedAction(evt);
    }//GEN-LAST:event_cbLoanAccItemStateChanged

    private void cbLoanTypePaymentItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbLoanTypePaymentItemStateChanged
        cbLoanTypePaymentItemStateChanged();
    }//GEN-LAST:event_cbLoanTypePaymentItemStateChanged

    private void btnApproveMoreMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveMoreMoneyActionPerformed
        AddCreditLoanDialog addCreditLoanDialog = new AddCreditLoanDialog(null, true, profileBean.getP_custCode(), empCode);
        addCreditLoanDialog.setVisible(true);

        profileBean = profileControl.listCbProfile(profileBean.getP_custCode());
        lbLoanCreditBalance.setText("วงเงินในการกู้คงเหลือ " + profileBean.getLoan_Credit_Balance() + " บาท");
    }//GEN-LAST:event_btnApproveMoreMoneyActionPerformed

    private void txtLoanDocCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoanDocCodeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!"".equals(txtLoanDocCode.getText())) {
                txtLoanFee.requestFocus();
                return;
            }
            txtLoanDocCode.selectAll();
        }
    }//GEN-LAST:event_txtLoanDocCodeKeyPressed

    private void txtLoanFeeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLoanFeeFocusGained
        txtLoanFee.selectAll();
    }//GEN-LAST:event_txtLoanFeeFocusGained

    private void txtLoanFeeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoanFeeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtLoanPerMonth.requestFocus();
        }
    }//GEN-LAST:event_txtLoanFeeKeyPressed

    private void txtLoanDateStartKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoanDateStartKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            computeFinishPay();
            computeBahtPerMonth();

            txtPayPerMonth.requestFocus();
        }
    }//GEN-LAST:event_txtLoanDateStartKeyPressed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        Point point = txtLoanDateStart.getLocationOnScreen();
        point.setLocation(point.getX(), point.getY());
        DateChooseDialog dcd = new DateChooseDialog(null, true, point);
        dcd.setVisible(true);

        if (dcd.getSelectDate() != null) {
            txtLoanDateStart.setText(dcd.getDateString());
            computeFinishPay();
            computeBahtPerMonth();
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void txtLoanDateEndFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLoanDateEndFocusGained
        txtLoanDateEnd.selectAll();
    }//GEN-LAST:event_txtLoanDateEndFocusGained

    private void txtLoanDateEndKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoanDateEndKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSaveLoanAccountRegister.requestFocus();
        }
    }//GEN-LAST:event_txtLoanDateEndKeyPressed

    private void txtPayPerMonthFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPayPerMonthFocusGained
        txtPayPerMonth.selectAll();
    }//GEN-LAST:event_txtPayPerMonthFocusGained

    private void txtPayPerMonthKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPayPerMonthKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSaveLoanAccountRegister.requestFocus();
        }
    }//GEN-LAST:event_txtPayPerMonthKeyPressed

    private void txtLoanPerMonthFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLoanPerMonthFocusGained
        txtLoanPerMonth.selectAll();
    }//GEN-LAST:event_txtLoanPerMonthFocusGained

    private void txtLoanPerMonthKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoanPerMonthKeyPressed
        txtLoanPerMonthKeyPressedAction(evt);
    }//GEN-LAST:event_txtLoanPerMonthKeyPressed

    private void txtStartLoanDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStartLoanDateFocusGained
        btnPrintLoanPaper.setEnabled(false);
    }//GEN-LAST:event_txtStartLoanDateFocusGained

    private void txtStartLoanDateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStartLoanDateKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtLoanFee.requestFocus();
        }
    }//GEN-LAST:event_txtStartLoanDateKeyPressed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        Point point = txtStartLoanDate.getLocationOnScreen();
        point.setLocation(point.getX(), point.getY());
        DateChooseDialog dcd = new DateChooseDialog(null, true, point);
        dcd.setVisible(true);

        if (dcd.getSelectDate() != null) {
            Calendar c = Calendar.getInstance();
            c.setTime(new Date());
            c.add(Calendar.MONTH, 1);
            txtLoanDateStart.setText(DateFormat.getLocale_ddMMyyyy(c.getTime()));
            computeBahtPerMonth();

            txtStartLoanDate.setText(dcd.getDateString());
            txtLoanPerMonth.requestFocus();
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void txtIntBadDebtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIntBadDebtFocusGained
        txtIntBadDebt.selectAll();
    }//GEN-LAST:event_txtIntBadDebtFocusGained

    private void txtIntBadDebtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIntBadDebtFocusLost
        double intBadDebtAmt = NumberFormat.toDouble(txtIntBadDebt.getText());
        txtIntBadDebt.setText(NumberFormat.showDouble2(intBadDebtAmt));
    }//GEN-LAST:event_txtIntBadDebtFocusLost

    private void txtIntBadDebtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIntBadDebtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtIntTurnover.requestFocus();
        }
    }//GEN-LAST:event_txtIntBadDebtKeyPressed

    private void txtIntTurnoverFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIntTurnoverFocusGained
        txtIntTurnover.selectAll();
    }//GEN-LAST:event_txtIntTurnoverFocusGained

    private void txtIntTurnoverFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIntTurnoverFocusLost
        double intTurnoverAmt = NumberFormat.toDouble(txtIntTurnover.getText());
        txtIntTurnover.setText(NumberFormat.showDouble2(intTurnoverAmt));
    }//GEN-LAST:event_txtIntTurnoverFocusLost

    private void txtIntTurnoverKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIntTurnoverKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtIntNormal.requestFocus();
        }
    }//GEN-LAST:event_txtIntTurnoverKeyPressed

    private void txtIntNormalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIntNormalFocusGained
        txtIntNormal.selectAll();
    }//GEN-LAST:event_txtIntNormalFocusGained

    private void txtIntNormalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIntNormalFocusLost
        double intNormalAmt = NumberFormat.toDouble(txtIntNormal.getText());
        txtIntNormal.setText(NumberFormat.showDouble2(intNormalAmt));
    }//GEN-LAST:event_txtIntNormalFocusLost

    private void txtIntNormalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIntNormalKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        }
    }//GEN-LAST:event_txtIntNormalKeyPressed

    private void txtLoanCustCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoanCustCodeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSaveGuarantor.requestFocus();
        }
    }//GEN-LAST:event_txtLoanCustCodeKeyPressed

    private void btnSaveGuarantorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveGuarantorActionPerformed
        addBoundsman();
    }//GEN-LAST:event_btnSaveGuarantorActionPerformed

    private void btnSaveGuarantorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSaveGuarantorKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addBoundsman();
        }
    }//GEN-LAST:event_btnSaveGuarantorKeyPressed

    private void btnCancelSaveGuarantorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelSaveGuarantorActionPerformed
        clearBondman();
    }//GEN-LAST:event_btnCancelSaveGuarantorActionPerformed

    private void btnChooseGuarantorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseGuarantorActionPerformed
        ApproveDialog approveDialog = new ApproveDialog(null, true);
        approveDialog.setVisible(true);

        if (approveDialog.getCUST_CODE() != null) {
            ProfileBean profileApprove = profileControl.listCbProfile(approveDialog.getCUST_CODE());
            txtLoanCustCode.setText(profileApprove.getP_custCode());
            txtLoanCustName.setText(profileApprove.getP_custName());
            txtLoanCustSurname.setText(profileApprove.getP_custSurname());
            lbLimitApprovePerson.setText("* จำนวนอนุมัติได้คงเหลือ " + profileApprove.getApproveLimit() + " (คน)");
        } else {
            clearBondman();
        }

        btnSaveGuarantor.requestFocus();
    }//GEN-LAST:event_btnChooseGuarantorActionPerformed

    private void btnDelSaveGuarantorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelSaveGuarantorActionPerformed
        btnDelGuarantor();
    }//GEN-LAST:event_btnDelSaveGuarantorActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        JFileChooser chooser = new JFileChooser();
        ImagePreviewPanel preview = new ImagePreviewPanel();
        chooser.setAccessory(preview);
        chooser.addPropertyChangeListener(preview);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPEG Files", "jpg");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            txtImg1.setText(chooser.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        JFileChooser chooser = new JFileChooser();
        ImagePreviewPanel preview = new ImagePreviewPanel();
        chooser.setAccessory(preview);
        chooser.addPropertyChangeListener(preview);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPEG Files", "jpg");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            txtImg2.setText(chooser.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        JFileChooser chooser = new JFileChooser();
        ImagePreviewPanel preview = new ImagePreviewPanel();
        chooser.setAccessory(preview);
        chooser.addPropertyChangeListener(preview);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPEG Files", "jpg");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            txtImg3.setText(chooser.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btnSaveLoanAccountRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveLoanAccountRegisterActionPerformed
        btnSaveLoanAccountRegister();
    }//GEN-LAST:event_btnSaveLoanAccountRegisterActionPerformed

    private void btnSaveLoanAccountRegisterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSaveLoanAccountRegisterKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSaveLoanAccountRegister();
        }
    }//GEN-LAST:event_btnSaveLoanAccountRegisterKeyPressed

    private void btnCancelSaveLoanAccountRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelSaveLoanAccountRegisterActionPerformed
        clearFormLoan();
    }//GEN-LAST:event_btnCancelSaveLoanAccountRegisterActionPerformed

    private void btnPrintLoanPaperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintLoanPaperActionPerformed
        btnPrintLoanPaper(txtLoanDocCode.getText());
    }//GEN-LAST:event_btnPrintLoanPaperActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btnApproveMoreMoney;
    private javax.swing.JButton btnCancelSaveGuarantor;
    private javax.swing.JButton btnCancelSaveLoanAccountRegister;
    private javax.swing.JButton btnChooseGuarantor;
    private javax.swing.JButton btnDelSaveGuarantor;
    private javax.swing.JButton btnPrintLoanPaper;
    private javax.swing.JButton btnSaveGuarantor;
    private javax.swing.JButton btnSaveLoanAccountRegister;
    private javax.swing.JComboBox cbAddrType;
    private javax.swing.JComboBox cbLoanAcc;
    private javax.swing.JComboBox cbLoanTypePayment;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel206;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JLabel lbLimitApprovePerson;
    private javax.swing.JLabel lbLoanCreditBalance;
    private javax.swing.JLabel lblLoanPromiseTitle;
    private javax.swing.JTable tbArGroup1;
    private javax.swing.JTable tbGuarantor;
    private javax.swing.JTextField txtAddNo1;
    private javax.swing.JTextField txtAddrAmphur1;
    private javax.swing.JTextField txtAddrMobile1;
    private javax.swing.JTextField txtAddrMoo1;
    private javax.swing.JTextField txtAddrMooName1;
    private javax.swing.JTextField txtAddrPost1;
    private javax.swing.JTextField txtAddrProvince1;
    private javax.swing.JTextField txtAddrRoad1;
    private javax.swing.JTextField txtAddrSoi1;
    private javax.swing.JTextField txtAddrTambon1;
    private javax.swing.JTextField txtAddrTel1;
    private javax.swing.JTextArea txtAssetGaruntee1;
    private javax.swing.JTextField txtB1;
    private javax.swing.JTextField txtB4;
    private javax.swing.JTextField txtB5;
    private javax.swing.JTextField txtFeeRateName;
    private javax.swing.JTextField txtImg1;
    private javax.swing.JTextField txtImg2;
    private javax.swing.JTextField txtImg3;
    private javax.swing.JTextField txtIntBadDebt;
    private javax.swing.JTextField txtIntFixedName;
    private javax.swing.JTextField txtIntNormal;
    private javax.swing.JTextField txtIntTurnover;
    private javax.swing.JTextField txtLoanAge;
    private javax.swing.JTextField txtLoanAmt;
    private javax.swing.JTextField txtLoanBirthDate;
    private javax.swing.JTextField txtLoanCardExpire;
    private javax.swing.JTextField txtLoanCustCode;
    private javax.swing.JTextField txtLoanCustID;
    private javax.swing.JTextField txtLoanCustName;
    private javax.swing.JTextField txtLoanCustSurname;
    private javax.swing.JTextField txtLoanDateEnd;
    private javax.swing.JTextField txtLoanDateStart;
    private javax.swing.JTextField txtLoanDocCode;
    private javax.swing.JTextField txtLoanFee;
    private javax.swing.JTextField txtLoanIntPercent;
    private javax.swing.JTextField txtLoanName;
    private javax.swing.JTextField txtLoanOccu;
    private javax.swing.JTextField txtLoanPenaltyINT;
    private javax.swing.JTextField txtLoanPerMonth;
    private javax.swing.JTextField txtLoanRegMember;
    private javax.swing.JTextField txtLoanSex;
    private javax.swing.JTextField txtPayPerMonth;
    private javax.swing.JTextField txtStartLoanDate;
    // End of variables declaration//GEN-END:variables

    private void loadAddressLoan() {
        AddressBean addressBean;
        switch (cbAddrType.getSelectedIndex()) {
            case 0:
                //ที่อยู่ปัจจุบัน
                addressBean = addressControl.listProfileAddress(txtLoanCustID.getText(), "1");
                break;
            case 1:
                //ที่อยู่ตามบัตรประชาชน
                addressBean = addressControl.listProfileAddress(txtLoanCustID.getText(), "2");
                break;
            case 2:
                //ที่อยู่ที่ทำงาน
                addressBean = addressControl.listProfileAddress(txtLoanCustID.getText(), "3");
                break;
            default:
                addressBean = new AddressBean();
                break;
        }

        if (addressBean != null) {
            txtAddNo1.setText(addressBean.getAddr_No());
            txtAddrMoo1.setText(addressBean.getAddr_Moo());
            txtAddrMooName1.setText(addressBean.getAddr_MooName());
            txtAddrRoad1.setText(addressBean.getAddr_Road());
            txtAddrSoi1.setText(addressBean.getAddr_Soi());
            txtAddrTambon1.setText(addressBean.getAddr_Tambon());
            txtAddrAmphur1.setText(addressBean.getAddr_Aumphur());
            txtAddrProvince1.setText(addressBean.getAddr_Province());
            txtAddrPost1.setText(addressBean.getAddr_Post());
            txtAddrMobile1.setText(addressBean.getAddr_Mobile());
            txtAddrTel1.setText(addressBean.getAddr_Tel());
        }

    }

    private String getIDCombobox(JComboBox cb) {
        if (cb.getItemCount() > 0) {
            String[] items = cb.getSelectedItem().toString().split("-");
            String id = items[0].trim();
            return id;
        }
        return "";
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

    private void enterLoan() {
        double loanAmt = NumberFormat.toDouble(txtLoanAmt.getText());
        double limitLoanAmt = profileBean.getLoan_Credit_Balance();
        if (loanAmt > limitLoanAmt) {
            MessageAlert.warningPopup(this, "จำนวนเงินกู้เกินกำหนด กรุณาเพิ่มวงเงิน !");
            txtLoanAmt.selectAll();
            txtLoanAmt.requestFocus();
            return;
        }
        jButton18.setEnabled(true);
        jButton17.setEnabled(true);

        String strTxtLoanAmtPerPerson = txtLoanAmt.getText();
        double txtLoanAmtPerPerson = NumberFormat.toDouble(strTxtLoanAmtPerPerson);
        String docType = getIDCombobox(cbLoanAcc);
        CbLoanConfigBean lBean = loanConfigControl.listLoanConfig(docType);
        double txtLoanFeeAmt = lBean.getLoanFee() * txtLoanAmtPerPerson / 100;
        txtLoanFee.setText(NumberFormat.showDouble2(txtLoanFeeAmt));

        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date());
        calendar2.add(Calendar.MONTH, 1);
        txtLoanDateStart.setText(DateFormat.getLocale_ddMMyyyy(calendar2.getTime()));
        computeBahtPerMonth();

        txtStartLoanDate.setText(DateFormat.getLocale_ddMMyyyy(new Date()));
        txtLoanPerMonth.requestFocus();
    }

    private void cbLoanAccItemStateChangedAction(ItemEvent evt) {
        if (evt.getStateChange() == 1) {
            String id = getIDCombobox(cbLoanAcc);
            CbLoanConfigBean loanBean = loanConfigControl.listLoanConfig(id);
            if (loanBean != null) {
                switch (loanBean.getIntFixed()) {
                    case AppConstants.INT_FLAT_RATE:
                        txtIntFixedName.setText("เงินต้นคงที่ (Flat Interest Rate)");
                        break;
                    case AppConstants.INT_EFFITIVE_RATE:
                        txtIntFixedName.setText("ลดต้นลดดอก (Effective Interest Rate)");
                        break;
                    default:
                        txtIntFixedName.setText("");
                        break;
                }

                switch (loanBean.getChkPIntTable()) {
                    case "1":
                        txtFeeRateName.setText("คิดดอกเบี้ยปรับจากดอกเบี้ยค้าง");
                        break;
                    case "2":
                        txtFeeRateName.setText("คิดดอกเบี้ยปรับจากเงินต้นคงเหลือ");
                        break;
                    default:
                        txtFeeRateName.setText("");
                        break;
                }

                txtIntBadDebt.setText(NumberFormat.showDouble2(loanBean.getIntBadDebt()));
                txtIntTurnover.setText(NumberFormat.showDouble2(loanBean.getIntTurnover()));
                txtIntNormal.setText(NumberFormat.showDouble2(loanBean.getIntNormal()));
                txtLoanPenaltyINT.setText(NumberFormat.showDouble2(loanBean.getLoanPenaltyINT()));

                double intPerYear1 = loanBean.getLoanINT();//ต่อปี
                double intPerMonth1 = intPerYear1 / 12;
                double intPerDay1 = intPerMonth1 / 30;

                double intPerYear2 = loanBean.getIntBadDebt();//กันหนี้สูญ
                double intPerMonth2 = intPerYear2 / 12;
                double intPerDay2 = intPerMonth2 / 30;

                double intPerYear3 = loanBean.getIntTurnover();//ค่าจัดการ
                double intPerMonth3 = intPerYear3 / 12;
                double intPerDay3 = intPerMonth3 / 30;

                double intPerYear4 = loanBean.getIntNormal();//ดอกเบี้ยเงินกู้
                double intPerMonth4 = intPerYear4 / 12;
                double intPerDay4 = intPerMonth4 / 30;
                switch (cbLoanTypePayment.getSelectedIndex()) {
                    case 0:
                        txtLoanIntPercent.setText(NumberFormat.showDouble2(intPerDay1));
                        txtIntBadDebt.setText(NumberFormat.showDouble3(intPerDay2));
                        txtIntTurnover.setText(NumberFormat.showDouble3(intPerDay3));
                        txtIntNormal.setText(NumberFormat.showDouble3(intPerDay4));
                        break;
                    case 1:
                        txtLoanIntPercent.setText(NumberFormat.showDouble3(intPerMonth1));
                        txtIntBadDebt.setText(NumberFormat.showDouble3(intPerMonth2));
                        txtIntTurnover.setText(NumberFormat.showDouble3(intPerMonth3));
                        txtIntNormal.setText(NumberFormat.showDouble3(intPerMonth4));
                        break;
                    default:
                        txtLoanIntPercent.setText(NumberFormat.showDouble3(intPerYear1));
                        txtIntBadDebt.setText(NumberFormat.showDouble3(intPerYear2));
                        txtIntTurnover.setText(NumberFormat.showDouble3(intPerYear3));
                        txtIntNormal.setText(NumberFormat.showDouble3(intPerYear4));
                        break;
                }
            }
        }
    }

    private void cbLoanTypePaymentItemStateChanged() {
        String id = getIDCombobox(cbLoanAcc);
        CbLoanConfigBean cbLoanConfigBean = loanConfigControl.listLoanConfig(id);
        if (cbLoanConfigBean != null) {
            double intPerYear = cbLoanConfigBean.getLoanINT();//ต่อปี
            double intPerMonth = intPerYear / 12;
            double intPerDay = intPerMonth / 30;
            switch (cbLoanTypePayment.getSelectedIndex()) {
                case 0:
                    txtLoanIntPercent.setText(NumberFormat.showDouble2(intPerDay));
                    txtIntBadDebt.setText(NumberFormat.showDouble4(cbLoanConfigBean.getIntBadDebt() / 12 / 30));
                    txtIntTurnover.setText(NumberFormat.showDouble4(cbLoanConfigBean.getIntTurnover() / 12 / 30));
                    txtIntNormal.setText(NumberFormat.showDouble4(cbLoanConfigBean.getIntNormal() / 12 / 30));
                    break;
                case 1:
                    txtLoanIntPercent.setText(NumberFormat.showDouble2(intPerMonth));
                    txtIntBadDebt.setText(NumberFormat.showDouble4(cbLoanConfigBean.getIntBadDebt() / 12));
                    txtIntTurnover.setText(NumberFormat.showDouble4(cbLoanConfigBean.getIntTurnover() / 12));
                    txtIntNormal.setText(NumberFormat.showDouble4(cbLoanConfigBean.getIntNormal() / 12));
                    break;
                default:
                    txtLoanIntPercent.setText(NumberFormat.showDouble2(intPerYear));
                    txtIntBadDebt.setText(NumberFormat.showDouble4(cbLoanConfigBean.getIntBadDebt()));
                    txtIntTurnover.setText(NumberFormat.showDouble4(cbLoanConfigBean.getIntTurnover()));
                    txtIntNormal.setText(NumberFormat.showDouble4(cbLoanConfigBean.getIntNormal()));
                    break;
            }

            computeBahtPerMonth();
        }
    }

    private void computeFinishPay() {
        if ("".equals(txtLoanDateStart.getText())) {
            txtLoanDateStart.setText(DateFormat.getLocale_ddMMyyyy(new Date()));
        }
        Date d = DateFormat.getLocal_ddMMyyyy(txtLoanDateStart.getText());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        int perMonth = NumberFormat.toInt(txtLoanPerMonth.getText());
        calendar.add(Calendar.MONTH, perMonth - 1);
        txtLoanDateEnd.setText(DateFormat.getLocale_ddMMyyyy(calendar.getTime()));

        txtLoanDateStart.requestFocus();
    }

    private void computeBahtPerMonth() {
        String loanType = getIDCombobox(cbLoanAcc);
        CbLoanConfigBean loanConfigBean = loanConfigControl.listLoanConfig(loanType);
        double loanAmt, loanInt, netTotal;
        int loanPerAmt;
        int _netTotal;

        //ให้แสดงเป็นบรรทัดเดียว requirement ใหม่
        if (AppConstants.INT_EFFITIVE_RATE.equals(loanConfigBean.getIntFixed())) {
            loanAmt = NumberFormat.toDouble(txtLoanAmt.getText());
            loanPerAmt = NumberFormat.toInt(txtLoanPerMonth.getText());
            loanInt = NumberFormat.toDouble(txtLoanIntPercent.getText());
            netTotal = (loanAmt + ((loanAmt * loanPerAmt * loanInt) / 100)) / loanPerAmt;
            _netTotal = (int) netTotal;
            double divide = loanAmt / loanPerAmt;
            txtPayPerMonth.setText(NumberFormat.showDouble2(_netTotal));

            //load table
            DefaultTableModel model = (DefaultTableModel) tbArGroup1.getModel();
            TableUtil.clearModel(model);

            //สำรองหนี้สูญ
            double intBadDebt = NumberFormat.toDouble(txtIntBadDebt.getText());
            double intTurnover = NumberFormat.toDouble(txtIntTurnover.getText());
            double intNormal = NumberFormat.toDouble(txtIntNormal.getText());
            Calendar c = Calendar.getInstance();
            Date dd = DateFormat.getLocal_ddMMyyyy(txtLoanDateStart.getText());
            c.setTime(dd);

            double b1 = 0, b2 = 0, b3 = 0, b4 = 0, b5 = 0;
            for (int i = 0; i < loanPerAmt; i++) {
                double a2 = loanAmt * intBadDebt / 100;//สำรองหนี้สูญ
                double a3 = loanAmt * intTurnover / 100;//ค่าจัดการ
                double a4 = loanAmt * intNormal / 100;//ดอกเบี้ยกู้
                double a5 = divide + (a2 + a3 + a4);//รวมดอกเบี้ยยอดที่ต้องชำระ
                double a6 = loanAmt - divide;

                model.addRow(new Object[]{
                    i + 1,
                    NumberFormat.showDouble2(divide),
                    NumberFormat.showDouble2(a2),
                    NumberFormat.showDouble2(a3),
                    NumberFormat.showDouble2(a4),
                    NumberFormat.showDouble2(a5),
                    NumberFormat.showDouble2(a6),
                    DateFormat.getLocale_ddMMyyyy(c.getTime())
                });

                b1 += divide;
                b2 += a2;
                b3 += a3;
                b4 += a4;
                b5 += a5;

                loanAmt -= divide;
                switch (cbLoanTypePayment.getSelectedIndex()) {
                    case 2:
                        c.add(Calendar.YEAR, 1);
                        break;
                    case 1:
                        c.add(Calendar.MONTH, 1);
                        break;
                    default:
                        c.add(Calendar.DATE, 1);
                        break;
                }
            }

            txtB1.setText(NumberFormat.showDouble2(b1));
            txtB4.setText(NumberFormat.showDouble2(b2 + b3 + b4));
            txtB5.setText(NumberFormat.showDouble2(b5));
            int _LoanAmt = (int) b5 / loanPerAmt;
            txtPayPerMonth.setText(NumberFormat.showDouble2(_LoanAmt));
        }

        if (AppConstants.INT_FLAT_RATE.equals(loanConfigBean.getIntFixed())) {
            loanAmt = NumberFormat.toDouble(txtLoanAmt.getText());
            loanPerAmt = NumberFormat.toInt(txtLoanPerMonth.getText());

            //load table
            DefaultTableModel model = (DefaultTableModel) tbArGroup1.getModel();
            TableUtil.clearModel(model);

            //สำรองหนี้สูญ
            double intBadDebt = NumberFormat.toDouble(txtIntBadDebt.getText());
            double intTurnover = NumberFormat.toDouble(txtIntTurnover.getText());
            double intNormal = NumberFormat.toDouble(txtIntNormal.getText());
            double totalInt = intBadDebt + intTurnover + intNormal;
            double dbBadDebt = ((loanAmt * loanPerAmt * intBadDebt) / 100) / loanPerAmt;
            double dbTurnover = ((loanAmt * loanPerAmt * intTurnover) / 100) / loanPerAmt;
            double dbNormal = ((loanAmt * loanPerAmt * intNormal) / 100) / loanPerAmt;
            int totalpayPerMonth = (int) ((loanAmt / loanPerAmt) + (dbBadDebt + dbTurnover + dbNormal));
            double paymentAmt = loanAmt + ((loanAmt * totalInt * loanPerAmt) / 100);
            txtPayPerMonth.setText(NumberFormat.showDouble2(totalpayPerMonth));

            Calendar c = Calendar.getInstance();
            Date dd = DateFormat.getLocal_ddMMyyyy(txtLoanDateStart.getText());
            c.setTime(dd);

            double b1 = 0, b2 = 0, b3 = 0, b4 = 0, b5 = 0;
            for (int i = 0; i < loanPerAmt; i++) {
                double a1 = loanAmt / loanPerAmt;
                double a2 = loanAmt * intBadDebt / 100;//สำรองหนี้สูญ
                double a3 = loanAmt * intTurnover / 100;//ค่าจัดการ
                double a4 = loanAmt * intNormal / 100;//ดอกเบี้ยกู้
                double a5 = (int) (a1 + a2 + a3 + a4);//รวมยอดที่ต้องชำระ
                double a6 = paymentAmt - a5;

                if (i == loanPerAmt - 1) {
                    a5 += a6;
                    a6 = 0;
                }
                model.addRow(new Object[]{
                    i + 1,
                    NumberFormat.showDouble2(a1),
                    NumberFormat.showDouble2(a2),
                    NumberFormat.showDouble2(a3),
                    NumberFormat.showDouble2(a4),
                    NumberFormat.showDouble2(a5),
                    NumberFormat.showDouble2(a6),
                    DateFormat.getLocale_ddMMyyyy(c.getTime())
                });

                b1 += a1;
                b2 += a2;
                b3 += a3;
                b4 += a4;
                b5 += a5;

                paymentAmt -= a5;
                switch (cbLoanTypePayment.getSelectedIndex()) {
                    case 2:
                        c.add(Calendar.YEAR, 1);
                        break;
                    case 1:
                        c.add(Calendar.MONTH, 1);
                        break;
                    default:
                        c.add(Calendar.DATE, 1);
                        break;
                }
            }

            txtB1.setText(NumberFormat.showDouble2(b1));
            txtB4.setText(NumberFormat.showDouble2(b2 + b3 + b4));
            txtB5.setText(NumberFormat.showDouble2(b5));

            int iModelSize = model.getRowCount();
            double total = 0;
            for (int i = 0; i < iModelSize; i++) {
                double data5 = NumberFormat.toDouble(model.getValueAt(i, 5).toString());
                total += data5;
                if (i == iModelSize - 1) {
                    double a = NumberFormat.toDouble(txtB5.getText());
                    double b = a - total;
                    data5 += b;
                    model.setValueAt(NumberFormat.showDouble2(data5), i, 5);
                }
            }
        }
    }

    private void txtLoanPerMonthKeyPressedAction(KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if ("".equals(txtLoanPerMonth.getText().trim())) {
                txtLoanPerMonth.setText("1");
                txtLoanPerMonth.requestFocus();
                return;
            }
            int loanPerMonth = NumberFormat.toInt(txtLoanPerMonth.getText());
            if (loanPerMonth <= 0) {
                txtLoanPerMonth.setText("1");
                loanPerMonth = 1;
            }

            String docType = getIDCombobox(cbLoanAcc);
            CbLoanConfigBean cbLoanConfigBean = loanConfigControl.listLoanConfig(docType);
            if (loanPerMonth > cbLoanConfigBean.getLoanPerMonth()) {
                MessageAlert.warningPopup(this, "ท่านกู้เกินจำนวนงวดตามที่สัญญากำหนดไว้ ต้องไม่เกิน " + cbLoanConfigBean.getLoanPerMonth() + " งวด");
                txtLoanPerMonth.selectAll();
                txtLoanPerMonth.requestFocus();
                return;
            }
            computeFinishPay();
            computeBahtPerMonth();
            jButton17.requestFocus();
        }
    }

    private void addBoundsman() {
        ProfileBean profileApprove = profileControl.listCbProfile(txtLoanCustCode.getText());
        if ("".equals(txtLoanCustCode.getText()) || profileApprove == null) {
            MessageAlert.warningPopup(this, "ข้อมูลรหัสผู้ค้ำประกันไม่ถูกต้อง !!!");
            txtLoanCustCode.selectAll();
            txtLoanCustCode.requestFocus();
            return;
        }
        if (profileApprove.getApproveLimit() <= 0) {
            MessageAlert.warningPopup(this, "ผู้ค้ำประกันท่านนี้ไม่มีสิทธิ์ค้ำประกัน !!!");
            clearBondman();
            txtLoanCustCode.requestFocus();
            return;
        }

        CbBondsmanBean cbBondsmanBean = new CbBondsmanBean();
        cbBondsmanBean.setLoan_docno("");
        cbBondsmanBean.setIdcard(txtLoanCustCode.getText());
        cbBondsmanBean.setName(txtLoanCustName.getText());
        cbBondsmanBean.setSurname(txtLoanCustSurname.getText());

        bonsmanModel.addRow(new Object[]{
            bonsmanModel.getRowCount() + 1,
            cbBondsmanBean.getIdcard(),
            cbBondsmanBean.getName(),
            cbBondsmanBean.getSurname()
        });
        clearBondman();
    }

    private void clearBondman() {
        txtLoanCustCode.setText("");
        txtLoanCustCode.requestFocus();
        txtLoanCustName.setText("");
        txtLoanCustSurname.setText("");
        lbLimitApprovePerson.setText("");
    }

    private void btnSaveLoanAccountRegister() {
        if (validateDataLoan()) {
            //ตรวจสอบผู้ค้ำประกัน
            if (tbGuarantor.getRowCount() == 0) {
                int confirm = MessageAlert.showConfirm(this, "ไม่พบข้อมูลผู้ค้ำประกัน ท่านต้องการเปิดบัญชีเงินกู้หรือไม่ ?");
                if (confirm == MessageAlert.YES_OPTION) {
                    saveLoanForm();
                }
                return;
            }
            saveLoanForm();
        }
    }

    private void saveLoanForm() {
        //update front book
        String docType = getIDCombobox(cbLoanAcc);
        CbLoanConfigBean cbLoanConfigBean = loanConfigControl.listLoanConfig(docType);
        ConfigBean configBean = configControl.getConfigBean();
        String loanDocNo;
        if (configBean.getBranchPrefix().equals("Y")) {
            BranchBean bBean = branchControl.getData();
            loanDocNo = bBean.getCode() + cbLoanConfigBean.getLoanCode() + getRunning(cbLoanConfigBean.getLoanRunning());
        } else {
            loanDocNo = cbLoanConfigBean.getLoanCode() + getRunning(cbLoanConfigBean.getLoanRunning());
        }

        String loan_person1 = "";
        String loan_person2 = "";

        txtLoanDocCode.setText(loanDocNo);

        CbLoanAccountBean cbLoanAccountBean = new CbLoanAccountBean();
        cbLoanAccountBean.setCust_code(profileBean.getP_custCode());
        cbLoanAccountBean.setLoan_docno(loanDocNo);
        cbLoanAccountBean.setLoan_start_date(DateFormat.getLocal_ddMMyyyy(txtLoanDateStart.getText()));
        cbLoanAccountBean.setLoan_end_date(DateFormat.getLocal_ddMMyyyy(txtLoanDateEnd.getText()));
        cbLoanAccountBean.setLoan_amount(NumberFormat.toDouble(txtLoanAmt.getText()));
        cbLoanAccountBean.setLoan_interest(NumberFormat.toDouble(txtLoanIntPercent.getText()));
        cbLoanAccountBean.setLoan_person1(loan_person1);
        cbLoanAccountBean.setLoan_person2(loan_person2);
        cbLoanAccountBean.setPayPerAmount(NumberFormat.toDouble(txtPayPerMonth.getText()));
        cbLoanAccountBean.setPeriod_pay(NumberFormat.toInt(txtLoanPerMonth.getText()));
        cbLoanAccountBean.setChkPersonApprove("N");
        cbLoanAccountBean.setLoanCustomerPay(0);
        cbLoanAccountBean.setLoanPayMin(0);
        cbLoanAccountBean.setLoanDayQty(0);

        BranchBean branchBean = branchControl.getData();
        cbLoanAccountBean.setLoan_docdate(DateFormat.getLocal_ddMMyyyy(txtStartLoanDate.getText()));
        cbLoanAccountBean.setBranch_code(branchBean.getCode());
        cbLoanAccountBean.setLoan_datePay(DateFormat.getLocal_ddMMyyyy(txtLoanDateStart.getText()));
        cbLoanAccountBean.setPay_user("");
        cbLoanAccountBean.setBook_evidence1(txtAssetGaruntee1.getText());
        cbLoanAccountBean.setBook_evidence2(txtImg1.getText());
        cbLoanAccountBean.setBook_evidence3(txtImg2.getText());
        cbLoanAccountBean.setBook_evidence4(txtImg3.getText());
        cbLoanAccountBean.setBook_no(generateAutoBookNo());
        cbLoanAccountBean.setLoan_type(getIDCombobox(cbLoanAcc));

        boolean isStep1 = false;
        if (loanAccountControl.createNewLoan(cbLoanAccountBean)) {
            // save boundman
            for (int i = 0; i < bonsmanModel.getRowCount(); i++) {
                CbBondsmanBean cbBondsmanBean = new CbBondsmanBean();
                cbBondsmanBean.setLoan_docno(loanDocNo);
                cbBondsmanBean.setIdcard("" + bonsmanModel.getValueAt(i, 1));
                cbBondsmanBean.setName("" + bonsmanModel.getValueAt(i, 2));
                cbBondsmanBean.setSurname("" + bonsmanModel.getValueAt(i, 3));
                cbBondsmanControl.saveCbBondsman(cbBondsmanBean);
            }
            // save evidence
            DocumentGarunteeBean documentGarunteeBean = new DocumentGarunteeBean();
            documentGarunteeBean.setDOC_NO(loanDocNo);
            documentGarunteeBean.setDOC_DESC(txtAssetGaruntee1.getText());
            documentGarunteeBean.setIMAGE1(txtImg1.getText().replace("\\", "/"));
            documentGarunteeBean.setIMGAE2(txtImg2.getText().replace("\\", "/"));
            documentGarunteeBean.setIMAGE3(txtImg3.getText().replace("\\", "/"));
            documentGarunteeControl.saveDocumentGaruntee(documentGarunteeBean);

            //update running
            loanConfigControl.updateRunningBookNo(cbLoanAccountBean.getLoan_type());
            profileControl.updateLoanBalance(cbLoanAccountBean.getLoan_amount(), cbLoanAccountBean.getLoan_amount(), cbLoanAccountBean.getCust_code());
            configControl.updateLoanDocRunning();
            int confrim = MessageAlert.showConfirm(this, "ท่านต้องการพิมพ์หน้าสมุดเงินกู้ใช่หรือไม่ ?");
            if (confrim == MessageAlert.YES_OPTION) {
                printLoanFrontBook(loanDocNo);
            }
            isStep1 = true;

            //ถ้าข้อมูลถูกอัพเดตเรียบร้อย
            if (isStep1) {
                CbTransactionLoanBean tLoanBean = new CbTransactionLoanBean();
                tLoanBean.setT_date(DateFormat.getLocal_ddMMyyyy(txtStartLoanDate.getText()));
                tLoanBean.setT_acccode(loanDocNo);
                tLoanBean.setT_custcode(profileBean.getP_custCode());
                tLoanBean.setT_description("" + cbLoanAcc.getSelectedItem());
                tLoanBean.setT_amount(cbLoanAccountBean.getLoan_amount());
                tLoanBean.setMoney_in(0.00);
                tLoanBean.setMoney_out(0.00);
                tLoanBean.setT_empcode(Value.USER_CODE);
                tLoanBean.setT_docno(loanDocNo);
                tLoanBean.setRemark("");
                tLoanBean.setT_status(AppConstants.CB_STATUS_LOAN);
                tLoanBean.setT_booktype(configBean.getLoanDocPrefix());
                tLoanBean.setLineNo(cbTransactionLoanControl.getLineByAccount(loanDocNo));
                tLoanBean.setPrintChk("N");
                tLoanBean.setT_index(cbTransactionLoanControl.getMaxIndex(loanDocNo));

                // get account Balance
                tLoanBean.setT_balance(cbLoanAccountBean.getLoan_amount());
                tLoanBean.setT_hoon(0);

                // get branch code
                tLoanBean.setBranch_code(Value.BRANCH_CODE);
                tLoanBean.setT_fee(NumberFormat.toDouble(txtLoanFee.getText()));

                if (cbTransactionLoanControl.saveCbTransactionLoan(tLoanBean)) {
                    int confirm = MessageAlert.showConfirm(this, "ท่านต้องการบันทึกรายงานความเคลื่อนไหวลงสมุดใช่หรือไม่ ?");
                    if (confirm == MessageAlert.YES_OPTION) {
                        printTransactionLoanBook(loanDocNo);
                    }
                }

                //add loan table
                DefaultTableModel modelAdd = (DefaultTableModel) tbArGroup1.getModel();
                int size = modelAdd.getRowCount();

                for (int i = 0; i < size; i++) {
                    CbLoanTablePaymentBean cbLoanTablePaymentBean = new CbLoanTablePaymentBean();
                    cbLoanTablePaymentBean.setLoan_doc_no(loanDocNo);
                    cbLoanTablePaymentBean.setLoan_index(i + 1);

                    double dBaseTotalAmount = NumberFormat.toDouble("" + tbArGroup1.getValueAt(i, 1));
                    double dIntArLost = NumberFormat.toDouble("" + tbArGroup1.getValueAt(i, 2));
                    double dIntArMgr = NumberFormat.toDouble("" + tbArGroup1.getValueAt(i, 3));
                    double dIntArInt = NumberFormat.toDouble("" + tbArGroup1.getValueAt(i, 4));
                    double dNetTotalAmt = NumberFormat.toDouble("" + tbArGroup1.getValueAt(i, 5));
                    double dTableAvgCompute = NumberFormat.toDouble("" + tbArGroup1.getValueAt(i, 6));

                    cbLoanTablePaymentBean.setBase_total_amount(dBaseTotalAmount);
                    cbLoanTablePaymentBean.setLoan_int_ar_lost(dIntArLost);
                    cbLoanTablePaymentBean.setLoan_int_ar_mgr(dIntArMgr);
                    cbLoanTablePaymentBean.setLoan_int_ar_int(dIntArInt);
                    cbLoanTablePaymentBean.setNet_total_pay(dNetTotalAmt);
                    cbLoanTablePaymentBean.setTable_avg_compute(dTableAvgCompute);

                    cbLoanTablePaymentBean.setPayment_money(0);
                    cbLoanTablePaymentBean.setPayment_balance(0);
                    cbLoanTablePaymentBean.setPayment_fee(0);
                    cbLoanTablePaymentBean.setBalance_amount(dNetTotalAmt);

                    cbLoanTablePaymentBean.setEmp_code(Value.USER_CODE);
                    cbLoanTablePaymentBean.setBranch_code(Value.BRANCH_CODE);
                    cbLoanTablePaymentBean.setDue_date(DateFormat.getLocal_ddMMyyyy("" + tbArGroup1.getValueAt(i, 7)));

                    //บันทึกข้อมูล
                    cbLoanTablePaymentControl.saveCbLoanTablePayment(cbLoanTablePaymentBean);

                    btnPrintLoanPaper.setEnabled(true);
                }

                txtLoanDocCode.setText(loanDocNo);

                loadLoanDetail(loanDocNo);

                btnSaveLoanAccountRegister.setEnabled(false);
                btnCancelSaveLoanAccountRegister.setEnabled(false);
                jButton17.setEnabled(false);
                txtPayPerMonth.setEnabled(false);
                txtLoanDateStart.setEnabled(false);
                txtLoanAmt.setEnabled(false);
                txtLoanFee.setEnabled(false);
                txtLoanPerMonth.setEnabled(false);
                jButton18.setEnabled(false);
                btnApproveMoreMoney.setEnabled(false);
                cbLoanAcc.setEnabled(false);
                cbLoanTypePayment.setEnabled(false);
                jTabbedPane3.setEnabledAt(0, false);
                jTabbedPane3.setEnabledAt(2, false);

                MessageAlert.infoPopup(this, "บันทึกข้อมูลการกู้เงินเรียบร้อยแล้ว");
                btnPrintLoanPaper(loanDocNo);
            }
        }
    }

    private void loadLoanDetail(String loanDocNo) {
        List<CbLoanTablePaymentBean> listTable = cbLoanTablePaymentControl.listCbLoanTablePayment(loanDocNo);
        DefaultTableModel md = (DefaultTableModel) tbArGroup1.getModel();
        JTableUtil.alignCenter(tbArGroup1, 0);
        JTableUtil.alignRight(tbArGroup1, 1);
        JTableUtil.alignCenter(tbArGroup1, 2);
        JTableUtil.alignRight(tbArGroup1, 3);
        JTableUtil.alignRight(tbArGroup1, 4);
        JTableUtil.alignRight(tbArGroup1, 5);
        JTableUtil.alignCenter(tbArGroup1, 6);
        TableUtil.clearModel(md);

        for (int i = 0; i < listTable.size(); i++) {
            CbLoanTablePaymentBean cbLoanTablePaymentBean = (CbLoanTablePaymentBean) listTable.get(i);
            md.addRow(new Object[]{
                i + 1,
                NumberFormat.showDouble2(cbLoanTablePaymentBean.getBase_total_amount()),
                NumberFormat.showDouble2(cbLoanTablePaymentBean.getLoan_int_ar_lost()),
                NumberFormat.showDouble2(cbLoanTablePaymentBean.getLoan_int_ar_mgr()),
                NumberFormat.showDouble2(cbLoanTablePaymentBean.getLoan_int_ar_int()),
                NumberFormat.showDouble2(cbLoanTablePaymentBean.getNet_total_pay()),
                NumberFormat.showDouble2(cbLoanTablePaymentBean.getTable_avg_compute()),
                DateFormat.getLocale_ddMMyyyy(cbLoanTablePaymentBean.getSys_date())
            });
        }

        DocumentGarunteeBean documentGarunteeBean = documentGarunteeControl.getDocumentGaruntee(loanDocNo);
        if (documentGarunteeBean != null) {
            txtAssetGaruntee1.setText(documentGarunteeBean.getDOC_DESC());
            txtImg1.setText(documentGarunteeBean.getIMAGE1());
            txtImg2.setText(documentGarunteeBean.getIMGAE2());
            txtImg3.setText(documentGarunteeBean.getIMAGE3());
        }
    }

    private void printTransactionLoanBook(String accountCode) {
        //print รายการลงในสมุด
        PassBook_PSiPR9 passBookPsiPr9 = new PassBook_PSiPR9();

        List<ReportOrangeBean> listBean = new ArrayList<>();
        ConfigBean configBean = configControl.getConfigBean();

        String where = " and t_acccode='" + accountCode + "' "
                + "and printchk='N' and LineNo>0 and t_booktype "
                + "in ('" + configBean.getLoanDocPrefix() + "','" + configBean.getPaymentDocPrefix() + "') "
                + "order by t_index ";
        List<CbTransactionLoanBean> listLoan = cbTransactionLoanControl.listTransactionLoan(where);
        SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yy");

        for (CbTransactionLoanBean loanBean : listLoan) {
            ReportOrangeBean bean1 = new ReportOrangeBean();
            bean1.setDate(sim.format(new Date()));
            bean1.setType(loanBean.getT_booktype());
            bean1.setStart(NumberFormat.showDouble2(loanBean.getT_amount()));//เงินต้น
            bean1.setPayStart("10");//10=ประเภทการกู้เงิน, 7=ประเภทการรับชำระ
            bean1.setPayInt("0.00");//ชำระดอก
            bean1.setBalance(NumberFormat.showDouble2(loanBean.getT_balance()));
            bean1.setLine("" + loanBean.getLineNo());

            listBean.add(bean1);

            //update book
            String sql = "update cb_transaction_loan "
                    + "set PrintChk='Y' "
                    + "where t_acccode='" + accountCode + "' "
                    + "and lineNO='" + bean1.getLine() + "' "
                    + "and printChk='N' and t_booktype in"
                    + "('" + configBean.getLoanDocPrefix() + "','" + configBean.getPaymentDocPrefix() + "')";
            cbTransactionLoanControl.update(sql);
        }

        // print passbook
        passBookPsiPr9.printTransactionOrange2(listBean, true);
    }

    private void clearFormLoan() {
        txtLoanDateStart.setText(DateFormat.getLocale_ddMMyyyy(new Date()));
        txtLoanDateEnd.setText(DateFormat.getLocale_ddMMyyyy(new Date()));
        txtLoanAmt.setText("0.00");
        txtPayPerMonth.setText("0.00");
        txtLoanDocCode.setText("");
        txtPayPerMonth.setText("0.00");
        if (cbLoanAcc.getSelectedIndex() != -1) {
            cbLoanAcc.setSelectedIndex(0);
        }
        cbLoanTypePayment.setSelectedIndex(1);

        DefaultTableModel model = (DefaultTableModel) tbArGroup1.getModel();
        TableUtil.clearModel(model);
        if (cbLoanAcc.getItemCount() > 0) {
            cbLoanAcc.setSelectedIndex(0);
        }
        cbLoanTypePayment.setSelectedIndex(1);
        txtLoanFee.setText("0.00");
        txtLoanPerMonth.setText("1");

        txtB1.setText("0.00");
        txtB4.setText("0.00");
        txtB5.setText("0.00");

        //tab3
        txtLoanCustCode.setText("");
        txtLoanCustName.setText("");
        txtLoanCustSurname.setText("");
        txtAssetGaruntee1.setText("");
        txtImg1.setText("");
        txtImg2.setText("");
        txtImg3.setText("");
        DefaultTableModel model2 = (DefaultTableModel) tbGuarantor.getModel();
        TableUtil.clearModel(model2);

        txtLoanAmt.requestFocus();
    }

    private String getNamCB(JComboBox cb) {
        if (cb.getItemCount() > 0) {
            String[] items = cb.getSelectedItem().toString().split("-");
            if (items.length > 1) {
                String name = items[1].trim();
                return name;
            }
        }
        return "";
    }

    private void printLoanFrontBook(String loanDocNo) {
        //print หน้าปกสมุด
        PassBook_PSiPR9 view = new PassBook_PSiPR9();
        String accCode = loanDocNo;
        String barcode = accCode;
        String accName = profileName + " ";
        String accType = getNamCB(cbLoanAcc);
        CbLoanAccountBean cbLoanAccountBean = loanAccountControl.listLoanAccount(loanDocNo);
        String bookNo = "" + cbLoanAccountBean.getBook_no();
        view.printLoanFrontBook(accCode, accName, bookNo, barcode, accType);
    }

    private void btnPrintLoanPaper(String loanDocNo) {
        double loanPerMonthAmt = NumberFormat.toDouble(txtPayPerMonth.getText());
        if (loanPerMonthAmt > 0) {
            PaperLoanJDialog paperLoanJDialog = new PaperLoanJDialog(null, true, loanDocNo);
            paperLoanJDialog.setVisible(true);
        }
    }

    private boolean validateDataLoan() {
        if (NumberFormat.toDouble(txtLoanAmt.getText()) <= 0) {
            MessageAlert.warningPopup(this, "กรุณาระบุจำนวนเงินที่ต้องการกู้ !");
            txtLoanAmt.selectAll();
            txtLoanAmt.requestFocus();
            return false;
        }
        if (NumberFormat.toDouble(txtPayPerMonth.getText()) < 0) {
            MessageAlert.warningPopup(this, "จำนวนเงินผ่อนชำระต่องวด น้อยกว่า 0 บาท !");
            txtPayPerMonth.selectAll();
            txtPayPerMonth.requestFocus();
            return false;
        }
        if (StringUtil.isEmpty(txtStartLoanDate.getText())) {
            return false;
        }

        double loanAmt = NumberFormat.toDouble(txtLoanAmt.getText());
        double limitAmt = profileBean.getLoan_Credit_Balance();
        int loanPerMonth = NumberFormat.toInt(txtLoanPerMonth.getText());
        if (loanPerMonth <= 0) {
            MessageAlert.warningPopup(this, "จำนวนงวดที่กำหนดไม่ถูกต้อง !");
            txtLoanPerMonth.selectAll();
            txtLoanPerMonth.requestFocus();
            return false;
        }

        String docType = getIDCombobox(cbLoanAcc);
        CbLoanConfigBean cbLoanConfigBean = loanConfigControl.listLoanConfig(docType);
        if (loanPerMonth > cbLoanConfigBean.getLoanPerMonth()) {
            MessageAlert.warningPopup(this, "ท่านกู้เกินจำนวนงวดตามที่สัญญากำหนดไว้ ต้องไม่เกิน " + cbLoanConfigBean.getLoanPerMonth() + " งวด");
            return false;
        }

        Date dCurrent = DateFormat.getLocal_ddMMyyyy(DateFormat.getLocale_ddMMyyyy(new Date()));
        Date dStartLoan = DateFormat.getLocal_ddMMyyyy(txtLoanDateStart.getText());

        int chkDateCompare = dCurrent.compareTo(dStartLoan);
        if (chkDateCompare == 1) {
            MessageAlert.warningPopup(this, "ท่านกำหนดวันที่เริ่มกู้เงินไม่ถูกต้อง !");
            txtLoanDateStart.requestFocus();
            return false;
        }

        if (loanAmt > limitAmt) {
            MessageAlert.warningPopup(this, "ท่านกู้เกินวงเงินที่กำหนด กรุณาตรวจสอบ !");
            txtLoanAmt.requestFocus();
            return false;
        }

        if (loanAmt <= 0) {
            MessageAlert.warningPopup(this, "จำนวนเงินในการกู้ไม่ถูกต้อง กรุณาตรวจสอบ !");
            txtLoanAmt.requestFocus();
            return false;
        }

        return true;
    }

    private void btnDelGuarantor() {
        int rowSel = tbGuarantor.getSelectedRow();
        if (rowSel == -1) {
            MessageAlert.warningPopup(this, "กรุณาเลือกรายการผู้ค้ำประกันที่ท่านต้องการลบ ?");
            return;
        }
        bonsmanModel.removeRow(rowSel);
    }

    private void initLoad() {
        cbLoanAcc.removeAllItems();
        List<CbLoanConfigBean> listLoanBean = loanConfigControl.listLoanConfig();
        for (int i = 0; i < listLoanBean.size(); i++) {
            CbLoanConfigBean loanBean = (CbLoanConfigBean) listLoanBean.get(i);
            cbLoanAcc.addItem(loanBean.getLoanCode() + " - " + loanBean.getLoanName());
        }

        txtLoanCustID.setText(profileBean.getP_custCode());
        txtLoanName.setText(profileBean.getP_custName() + " " + profileBean.getP_custSurname());
        txtLoanAge.setText("" + profileBean.getP_custAge());
        txtLoanCardExpire.setText(DateFormat.getLocale_ddMMyyyy(profileBean.getCard_Expire()));
        txtLoanBirthDate.setText(DateFormat.getLocale_ddMMyyyy(profileBean.getP_custBirthDay()));
        lbLoanCreditBalance.setText("วงเงินในการกู้คงเหลือ " + profileBean.getLoan_Credit_Balance() + " บาท");
        switch (profileBean.getP_custSex()) {
            case "M":
                txtLoanSex.setText("ผู้ชาย");
                break;
            case "F":
                txtLoanSex.setText("ผู้หญิง");
                break;
            default:
                txtLoanSex.setText("อื่นๆ");
                break;
        }
        txtLoanOccu.setText(profileBean.getP_custOccupation());
        txtLoanRegMember.setText(DateFormat.getLocale_ddMMyyyy(profileBean.getP_member_start()));
        lbLimitApprovePerson.setText("");
        loadAddressLoan();
        jTabbedPane3.setSelectedIndex(1);
        txtLoanAmt.requestFocus();
    }

    private void initLoadTable() {
        tbArGroup1.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        tbArGroup1.setRowHeight(30);
        JTableHeader tTran = tbArGroup1.getTableHeader();
        tTran.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, AppConstants.DEFAULT_FONT_SIZE));

        tbGuarantor.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        tbGuarantor.setRowHeight(30);
        JTableHeader tTran2 = tbGuarantor.getTableHeader();
        tTran2.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, AppConstants.DEFAULT_FONT_SIZE));

        bonsmanModel = (DefaultTableModel) tbGuarantor.getModel();
    }

    private String generateAutoBookNo() {
        String docType = getIDCombobox(cbLoanAcc);
        return getBookNo(loanConfigControl.getMaxInt(docType));
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
}
