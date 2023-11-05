package th.co.cbank.project.view.popup;

import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
import th.co.cbank.project.constants.AppConstants;
import th.co.cbank.project.control.AddressControl;
import th.co.cbank.project.control.CbBondsmanControl;
import th.co.cbank.project.control.CbLoanAccountControl;
import th.co.cbank.project.control.CbLoanConfigControl;
import th.co.cbank.project.control.DocumentGarunteeControl;
import th.co.cbank.project.control.ProfileControl;
import th.co.cbank.project.model.AddressBean;
import th.co.cbank.project.model.CbBondsmanBean;
import th.co.cbank.project.model.CbLoanAccountBean;
import th.co.cbank.project.model.CbLoanConfigBean;
import th.co.cbank.project.model.DocumentGarunteeBean;
import th.co.cbank.project.model.ProfileBean;
import th.co.cbank.util.DateFormat;
import th.co.cbank.util.NumberFormat;

public class ReviewLoanContact extends javax.swing.JDialog {

    private final Logger logger = Logger.getLogger(ReviewLoanContact.class);
    private ProfileBean profileBean;
    private String loanDocNo;
    private final AddressControl addressControl = new AddressControl();

    public ReviewLoanContact(java.awt.Frame parent, boolean modal, ProfileBean profileBean, String loanDocNo) {
        super(parent, modal);
        initComponents();

        this.profileBean = profileBean;
        this.loanDocNo = loanDocNo;

        initLoad();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        cbLoanTypePayment = new javax.swing.JComboBox();
        txtLoanType = new javax.swing.JTextField();
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
        txtLoanDocDate = new javax.swing.JTextField();
        jButton18 = new javax.swing.JButton();
        jLabel55 = new javax.swing.JLabel();
        txtLoanDocNo = new javax.swing.JTextField();
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
        jPanel44 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbBondsman = new javax.swing.JTable();
        jLabel196 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtAssetGaruntee1 = new javax.swing.JTextArea();
        txtImg1 = new javax.swing.JTextField();
        jLabel197 = new javax.swing.JLabel();
        txtImg2 = new javax.swing.JTextField();
        txtImg3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel52.setBackground(new java.awt.Color(204, 255, 204));

        lblLoanPromiseTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblLoanPromiseTitle.setText("รายละเอียดสัญญาเงินกู้");

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLoanPromiseTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        cbAddrType.setEnabled(false);

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

        txtLoanAmt.setEditable(false);
        txtLoanAmt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanAmt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanAmt.setText("0.00");
        txtLoanAmt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel179.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel179.setText("บาท");

        cbLoanTypePayment.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbLoanTypePayment.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "รายวัน", "รายเดือน", "รายปี" }));
        cbLoanTypePayment.setSelectedIndex(1);
        cbLoanTypePayment.setEnabled(false);

        txtLoanType.setEditable(false);
        txtLoanType.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

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
                        .addComponent(txtLoanAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtLoanType))
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
                    .addComponent(txtLoanType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel172)
                    .addComponent(txtLoanAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel179)
                    .addComponent(cbLoanTypePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel58.setText("ค่าธรรมเนียม");

        txtLoanFee.setEditable(false);
        txtLoanFee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanFee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanFee.setText("0.00");
        txtLoanFee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel63.setText("กำหนดเริ่มชำระ");

        txtLoanDateStart.setEditable(false);
        txtLoanDateStart.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanDateStart.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanDateStart.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jButton17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton17.setText("...");
        jButton17.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("งวดสุดท้าย");

        txtLoanDateEnd.setEditable(false);
        txtLoanDateEnd.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanDateEnd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanDateEnd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanDateEnd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setText("ผ่อนชำระงวดล่ะ");

        txtPayPerMonth.setEditable(false);
        txtPayPerMonth.setBackground(new java.awt.Color(255, 255, 204));
        txtPayPerMonth.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPayPerMonth.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPayPerMonth.setText("0.00");
        txtPayPerMonth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

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

        txtLoanPerMonth.setEditable(false);
        txtLoanPerMonth.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanPerMonth.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanPerMonth.setText("1");
        txtLoanPerMonth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel209.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel209.setText("งวด");

        jLabel211.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel211.setText("วันที่ออกสัญญา");

        txtLoanDocDate.setEditable(false);
        txtLoanDocDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanDocDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanDocDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jButton18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton18.setText("...");
        jButton18.setEnabled(false);

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel55.setText("เลขที่สัญญา");

        txtLoanDocNo.setEditable(false);
        txtLoanDocNo.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanDocNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanDocNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanDocNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

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
                            .addComponent(txtLoanDocNo, javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addComponent(txtLoanDocDate)
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
                    .addComponent(txtLoanDocNo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel211)
                    .addComponent(txtLoanDocDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addComponent(jLabel99)
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
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

        tbBondsman.setModel(new javax.swing.table.DefaultTableModel(
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
        tbBondsman.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane6.setViewportView(tbBondsman);

        jLabel196.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel196.setText("รายละเอียดโฉนดที่ดิน");

        txtAssetGaruntee1.setEditable(false);
        txtAssetGaruntee1.setColumns(20);
        txtAssetGaruntee1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAssetGaruntee1.setRows(5);
        jScrollPane7.setViewportView(txtAssetGaruntee1);

        txtImg1.setEditable(false);
        txtImg1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtImg1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel197.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel197.setText("เอกสารรูปภาพ");

        txtImg2.setEditable(false);
        txtImg2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtImg2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtImg3.setEditable(false);
        txtImg3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtImg3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                    .addComponent(txtImg1)
                    .addComponent(txtImg2)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel196)
                            .addComponent(jLabel197))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtImg3))
                .addGap(179, 179, 179))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel196)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel197)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtImg1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtImg2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtImg3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("บุคคลค้ำประกัน", jPanel44);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel52, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane3, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 972, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbAddrType;
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
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JLabel lblLoanPromiseTitle;
    private javax.swing.JTable tbArGroup1;
    private javax.swing.JTable tbBondsman;
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
    private javax.swing.JTextField txtLoanCustID;
    private javax.swing.JTextField txtLoanDateEnd;
    private javax.swing.JTextField txtLoanDateStart;
    private javax.swing.JTextField txtLoanDocDate;
    private javax.swing.JTextField txtLoanDocNo;
    private javax.swing.JTextField txtLoanFee;
    private javax.swing.JTextField txtLoanIntPercent;
    private javax.swing.JTextField txtLoanName;
    private javax.swing.JTextField txtLoanOccu;
    private javax.swing.JTextField txtLoanPenaltyINT;
    private javax.swing.JTextField txtLoanPerMonth;
    private javax.swing.JTextField txtLoanRegMember;
    private javax.swing.JTextField txtLoanSex;
    private javax.swing.JTextField txtLoanType;
    private javax.swing.JTextField txtPayPerMonth;
    // End of variables declaration//GEN-END:variables

    private void loadAddressLoan() {
        AddressBean addressBean;
        switch (cbAddrType.getSelectedIndex()) {
            case 0:
                //ที่อยู่ปัจจุบัน
                addressBean = addressControl.findOneByCustCodeAddrType(txtLoanCustID.getText(), AppConstants.ADDRESS_CURRENT);
                break;
            case 1:
                //ที่อยู่ตามบัตรประชาชน
                addressBean = addressControl.findOneByCustCodeAddrType(txtLoanCustID.getText(), AppConstants.ADDRESS_ON_CID);
                break;
            case 2:
                //ที่อยู่ที่ทำงาน
                addressBean = addressControl.findOneByCustCodeAddrType(txtLoanCustID.getText(), AppConstants.ADDRESS_OFFICE);
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

    private void initLoad() {
        txtLoanCustID.setText(profileBean.getP_custCode());
        txtLoanName.setText(profileBean.getP_custName() + " " + profileBean.getP_custSurname());
        txtLoanAge.setText("" + profileBean.getP_custAge());
        txtLoanCardExpire.setText(DateFormat.getLocale_ddMMyyyy(profileBean.getCard_Expire()));
        txtLoanBirthDate.setText(DateFormat.getLocale_ddMMyyyy(profileBean.getP_custBirthDay()));
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
        loadLoanAccount(loanDocNo);
        loadAddressLoan();
        loadBondsman(loanDocNo);
    }

    public static void main(String[] args) {
        ProfileBean profileBean = new ProfileControl().findOneByCustCode("3610400297158");
        ReviewLoanContact view = new ReviewLoanContact(null, true, profileBean, "1010001080");
        view.setVisible(true);
    }

    private void loadBondsman(String loanDocNo) {
        CbBondsmanControl bondsmanControl = new CbBondsmanControl();
        List<CbBondsmanBean> listBondsman = bondsmanControl.listCbBondsman(loanDocNo);
        DefaultTableModel model = (DefaultTableModel) tbBondsman.getModel();
        int count = 1;
        for (CbBondsmanBean bean : listBondsman) {
            model.addRow(new Object[]{count++, bean.getIdcard(), bean.getName(), bean.getSurname(), ""});
        }
        
        DocumentGarunteeControl docControl = new DocumentGarunteeControl();
        DocumentGarunteeBean docBean = docControl.findOneByDocNo(loanDocNo);
        txtImg1.setText(docBean.getIMAGE1());
        txtImg2.setText(docBean.getIMGAE2());
        txtImg3.setText(docBean.getIMAGE3());
    }

    private void loadLoanAccount(String loanDocNo) {
        CbLoanAccountControl accountControl = new CbLoanAccountControl();
        CbLoanAccountBean loanAccount = accountControl.findOneByLoanDocNo(loanDocNo);
        txtAssetGaruntee1.setText(loanAccount.getBook_evidence1());
        
        CbLoanConfigControl loanConfig = new CbLoanConfigControl();
        CbLoanConfigBean configBean = loanConfig.findOneByLoanTypeCode(loanAccount.getLoan_type());
        
        txtLoanType.setText(configBean.getLoanName());
        txtLoanAmt.setText(""+loanAccount.getLoan_amount());
        txtLoanDocNo.setText(""+loanAccount.getLoan_docno());
        txtLoanDocDate.setText(""+loanAccount.getLoan_docdate());
        txtIntFixedName.setText("");
        txtFeeRateName.setText("");
        txtLoanPenaltyINT.setText("");
        txtLoanIntPercent.setText("");
        txtLoanFee.setText("");
        txtLoanPerMonth.setText("");
        txtLoanDateStart.setText("");
        txtLoanDateEnd.setText("");
        txtPayPerMonth.setText("");
        txtIntBadDebt.setText("");
        txtIntTurnover.setText("");
        txtIntNormal.setText("");
    }

}
