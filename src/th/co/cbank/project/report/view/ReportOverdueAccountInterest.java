package th.co.cbank.project.report.view;

import java.awt.Frame;
import java.awt.Point;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
import th.co.cbank.project.control.CbLoanAccountControl;
import th.co.cbank.project.view.ArListDialog;
import th.co.cbank.project.model.CbLoanAccountBean;
import th.co.cbank.util.ClipboardUtil;
import th.co.cbank.util.DateChooseDialog;
import th.co.cbank.util.DateFormat;
import th.co.cbank.util.MessageAlert;
import th.co.cbank.util.NumberFormat;
import th.co.cbank.util.TableUtil;

public class ReportOverdueAccountInterest extends javax.swing.JDialog {

    private final Logger logger = Logger.getLogger(ReportOverdueAccountInterest.class);
    private DefaultTableModel model;
    private final Frame parent;

    public ReportOverdueAccountInterest(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        logger.debug("ReportOverdueAccountInterest init");

        this.parent = parent;

        initTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        txtCode1 = new javax.swing.JTextField();
        txtCode2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnArCode1 = new javax.swing.JButton();
        btnArCode2 = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();
        btnExcelFile = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnCalendar = new javax.swing.JButton();
        txtDate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbReport = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("รายงานลูกหนี้ค้างชำระ และดอกเบี้ย");
        setPreferredSize(new java.awt.Dimension(1000, 700));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "รหัสลูกหนี้", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        txtCode1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCode1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCode1MouseClicked(evt);
            }
        });

        txtCode2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCode2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCode2MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("ถึง");

        btnArCode1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnArCode1.setText("...");
        btnArCode1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArCode1ActionPerformed(evt);
            }
        });

        btnArCode2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnArCode2.setText("...");
        btnArCode2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArCode2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCode1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnArCode1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCode2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnArCode2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCode1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCode2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnArCode1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnArCode2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnProcess.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnProcess.setText("ประมวลผล");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        btnExcelFile.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnExcelFile.setText("Excel file");
        btnExcelFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelFileActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ณ.วันที่", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        btnCalendar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCalendar.setText("...");
        btnCalendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalendarActionPerformed(evt);
            }
        });

        txtDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalendar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tbReport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัสลูกหนี้", "เลขบัญชี", "ชื่อลูกหนี้/บริษัท", "วันที่เริ่มใช้", "สิ้นสุดสัญญา", "ชำระล่าสุด", "ยอดค้างชำระ", "อัตราดอกเบี้ย(เดือน)", "เกินกำหนด(วัน)", "ยอดดอกเบี้ย"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbReport.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbReportMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbReport);
        if (tbReport.getColumnModel().getColumnCount() > 0) {
            tbReport.getColumnModel().getColumn(0).setPreferredWidth(120);
            tbReport.getColumnModel().getColumn(1).setPreferredWidth(120);
            tbReport.getColumnModel().getColumn(2).setPreferredWidth(170);
            tbReport.getColumnModel().getColumn(3).setPreferredWidth(100);
            tbReport.getColumnModel().getColumn(4).setPreferredWidth(100);
            tbReport.getColumnModel().getColumn(5).setPreferredWidth(100);
            tbReport.getColumnModel().getColumn(6).setPreferredWidth(100);
            tbReport.getColumnModel().getColumn(7).setPreferredWidth(100);
            tbReport.getColumnModel().getColumn(8).setPreferredWidth(100);
            tbReport.getColumnModel().getColumn(9).setPreferredWidth(100);
        }

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("รายงานลูกหนี้ค้างชำระ และดอกเบี้ย");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 269, Short.MAX_VALUE)
                        .addComponent(btnProcess)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcelFile))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnExcelFile, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalendarActionPerformed
        Point point = txtDate.getLocationOnScreen();
        point.setLocation(point.getX() + txtDate.getWidth(), point.getY());
        DateChooseDialog dcd = new DateChooseDialog(parent, true, point);
        dcd.setVisible(true);

        if (dcd.getSelectDate() != null) {
            txtDate.setText(dcd.getDateString());
            txtDate.requestFocus();
        }
    }//GEN-LAST:event_btnCalendarActionPerformed

    private void btnArCode1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArCode1ActionPerformed
        ArListDialog arDialog = new ArListDialog(parent, true, txtCode1);
        arDialog.setVisible(true);
    }//GEN-LAST:event_btnArCode1ActionPerformed

    private void btnArCode2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArCode2ActionPerformed
        ArListDialog arDialog = new ArListDialog(parent, true, txtCode2);
        arDialog.setVisible(true);
    }//GEN-LAST:event_btnArCode2ActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        processReport();
    }//GEN-LAST:event_btnProcessActionPerformed

    private void tbReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbReportMouseClicked
        if (evt.getButton() == 3) {
            if (ClipboardUtil.copyTableContent(tbReport) != null) {
                MessageAlert.infoPopup(ClipboardUtil.class, "Copy data to clipboard");
            }
        }
    }//GEN-LAST:event_tbReportMouseClicked

    private void txtCode1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCode1MouseClicked
        if (evt.getButton() == 3) {
            ClipboardUtil.paste();
        }
    }//GEN-LAST:event_txtCode1MouseClicked

    private void txtCode2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCode2MouseClicked
        if (evt.getButton() == 3) {
            ClipboardUtil.paste();
        }
    }//GEN-LAST:event_txtCode2MouseClicked

    private void btnExcelFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelFileActionPerformed
        TableUtil.exportData("Report-Overdue-Account-Interest", tbReport, this);
    }//GEN-LAST:event_btnExcelFileActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArCode1;
    private javax.swing.JButton btnArCode2;
    private javax.swing.JButton btnCalendar;
    private javax.swing.JButton btnExcelFile;
    private javax.swing.JButton btnProcess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbReport;
    private javax.swing.JTextField txtCode1;
    private javax.swing.JTextField txtCode2;
    private javax.swing.JTextField txtDate;
    // End of variables declaration//GEN-END:variables

    private void processReport() {
        TableUtil.clearModel(model);

        CbLoanAccountControl control = new CbLoanAccountControl();
        Date dateSelected = null;
        if (!txtDate.getText().trim().isEmpty()) {
            dateSelected = DateFormat.getLocal_ddMMyyyy(txtDate.getText());
        }
        List<CbLoanAccountBean> list = control.processSummaryByPerson(txtCode1.getText().trim(), txtCode2.getText());
        for (CbLoanAccountBean bean : list) {
            Date dateCompute = bean.getPay_amount() > 0 ? bean.getPay_date() : bean.getLoan_end_date();
            int diff = th.co.cbank.util.DateUtil.diff(dateCompute, dateSelected == null ? new Date() : dateSelected);
            double totalInt = bean.getLoan_amount() > 0
                    ? diff * bean.getLoan_interest() * bean.getLoan_amount() / (30 * 100)
                    : 0;
            model.addRow(new Object[]{
                bean.getProfile().getP_custCode(),
                bean.getLoan_docno(),
                bean.getProfile().getP_custName() + " " + bean.getProfile().getP_custSurname(),
                th.co.cbank.util.DateFormat.getLocale_ddMMyyyy(bean.getLoan_docdate()),
                th.co.cbank.util.DateFormat.getLocale_ddMMyyyy(bean.getLoan_end_date()),
                bean.getPay_amount() > 0 ? th.co.cbank.util.DateFormat.getLocale_ddMMyyyy(bean.getPay_date()) : "<html><font color=blue>ไม่พบข้อมูล</font></html>",
                NumberFormat.showDouble2(bean.getLoan_amount()),
                (int) bean.getLoan_interest() + "%",
                bean.getLoan_amount() > 0 ? NumberFormat.showCommaOnly(diff) : 0,
                NumberFormat.showDouble2(totalInt),});
        }
    }

    private void initTable() {
        model = (DefaultTableModel) tbReport.getModel();
        TableUtil.defaultTemplate(tbReport);

        TableUtil.alignCenter(tbReport, 3);
        TableUtil.alignCenter(tbReport, 4);
        TableUtil.alignCenter(tbReport, 5);
        TableUtil.alignRight(tbReport, 6);
        TableUtil.alignRight(tbReport, 7);
        TableUtil.alignRight(tbReport, 8);
        TableUtil.alignRight(tbReport, 9);
    }
}
