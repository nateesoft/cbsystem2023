package th.co.cbank.project.view;

import java.util.List;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
import th.co.cbank.project.control.CbLoanAccountControl;
import th.co.cbank.project.model.ProfileBean;
import th.co.cbank.util.TableUtil;

public class ArListDialog extends javax.swing.JDialog {

    private final Logger logger = Logger.getLogger(ArListDialog.class);
    private final DefaultTableModel model;
    private final JTextField textField;

    public ArListDialog(java.awt.Frame parent, boolean modal, JTextField textField) {
        super(parent, modal);
        initComponents();
        logger.debug("ArListDialog init");

        this.textField = textField;
        model = (DefaultTableModel) tbArList.getModel();
        TableUtil.defaultTemplate(tbArList);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbArList = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        lbSearch = new javax.swing.JLabel();
        txtSearchId = new javax.swing.JTextField();
        txtSearchSurname = new javax.swing.JTextField();
        lbSearch1 = new javax.swing.JLabel();
        txtSearchName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("แสดงข้อมูลสมาชิกเงินกู้");
        setResizable(false);

        tbArList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ลำดับ", "รหัสบัตร", "ชื่อ", "นามสกุล"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbArList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbArListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbArList);
        if (tbArList.getColumnModel().getColumnCount() > 0) {
            tbArList.getColumnModel().getColumn(2).setPreferredWidth(150);
            tbArList.getColumnModel().getColumn(3).setPreferredWidth(200);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ค้นหาข้อมูล", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSearch.setText("ค้นหา");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lbSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbSearch.setText("รหัสบัตรประชาชน");

        txtSearchId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtSearchSurname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbSearch1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbSearch1.setText("ชื่อ-สกุล");

        txtSearchName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearchId, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbSearch1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearchName, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSearchSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(btnSearch)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSearch)
                    .addComponent(txtSearchId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(txtSearchSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSearch1)
                    .addComponent(txtSearchName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        loadData();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void tbArListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbArListMouseClicked
        if (evt.getClickCount() == 2) {
            existWithData();
        }
    }//GEN-LAST:event_tbArListMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbSearch;
    private javax.swing.JLabel lbSearch1;
    private javax.swing.JTable tbArList;
    private javax.swing.JTextField txtSearchId;
    private javax.swing.JTextField txtSearchName;
    private javax.swing.JTextField txtSearchSurname;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        TableUtil.clearModel(model);

        CbLoanAccountControl loanControl = new CbLoanAccountControl();
        List<ProfileBean> list = loanControl.searchIdAndName(txtSearchId.getText().trim(), txtSearchName.getText().trim(), txtSearchSurname.getText().trim());
        for (int i = 0; i < list.size(); i++) {
            ProfileBean bean = (ProfileBean) list.get(i);
            model.addRow(new Object[]{
                (i + 1),
                bean.getP_custCode(),
                bean.getP_custName(),
                bean.getP_custSurname()
            });
        }
    }

    private void existWithData() {
        int rowSel = tbArList.getSelectedRow();
        if (rowSel != -1) {
            this.setData(tbArList.getValueAt(rowSel, 1).toString());
            this.dispose();
        }
    }

    public void setData(String data) {
        this.textField.setText(data);
    }

}
