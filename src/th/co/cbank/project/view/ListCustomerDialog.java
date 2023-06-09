package th.co.cbank.project.view;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.apache.log4j.Logger;
import th.co.cbank.project.constants.AppConstants;
import th.co.cbank.project.control.ProfileControl;
import th.co.cbank.project.model.ProfileBean;
import th.co.cbank.util.TableUtil;

public class ListCustomerDialog extends BaseDialogSwing {

    private final Logger logger = Logger.getLogger(ListCustomerDialog.class);
    private String CUST_CODE = null;
    private final ProfileControl profileControl = new ProfileControl();

    public ListCustomerDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        logger.debug("ListCustomerDialog init");

        initTable();
        txtSearch.requestFocus();
    }

    public String getCUST_CODE() {
        return CUST_CODE;
    }

    public void setCUST_CODE(String CUST_CODE) {
        this.CUST_CODE = CUST_CODE;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbApprove = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("รายชื่อสมาชิกที่มีสิทธิ์อนุมัติเงินกู้");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        tbApprove.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัสบัตรประชาชน", "ชื่อ", "นามสกุล"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbApprove.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbApprove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbApproveMouseClicked(evt);
            }
        });
        tbApprove.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbApproveKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbApprove);

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("ค้นหาชื่อลูกค้า");

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setCUST_CODE(null);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbApproveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbApproveMouseClicked
        if (evt.getClickCount() == 2) {
            int rowSelected = tbApprove.getSelectedRow();
            if (rowSelected != -1) {
                setCUST_CODE(tbApprove.getValueAt(rowSelected, 0).toString());
                dispose();
            }
        }
    }//GEN-LAST:event_tbApproveMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        setCUST_CODE(null);
    }//GEN-LAST:event_formWindowClosing

    private void tbApproveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbApproveKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            int rowSelected = tbApprove.getSelectedRow();
            if (rowSelected != -1) {
                setCUST_CODE(tbApprove.getValueAt(rowSelected, 0).toString());
                dispose();
            }
        }
    }//GEN-LAST:event_tbApproveKeyPressed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        searchCustomer();
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
        }
    }//GEN-LAST:event_txtSearchKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbApprove;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void initTable() {
        tbApprove.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        tbApprove.setRowHeight(30);

        JTableHeader tHeader = tbApprove.getTableHeader();
        tHeader.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, AppConstants.DEFAULT_FONT_SIZE));

        DefaultTableModel model = (DefaultTableModel) tbApprove.getModel();
        TableUtil.clearModel(model);

        List<ProfileBean> listProfile = profileControl.getProfileByApproveLimitMoreThanZero(CUST_CODE);
        for (ProfileBean bean : listProfile) {
            model.addRow(new Object[]{
                bean.getP_custCode(),
                bean.getP_custName(),
                bean.getP_custSurname()
            });
        }
    }

    private void searchCustomer() {
        DefaultTableModel model = (DefaultTableModel) tbApprove.getModel();
        TableUtil.clearModel(model);
        List<ProfileBean> listProfile = profileControl.getProfileByApproveAndCustName(CUST_CODE, txtSearch.getText());
        for (ProfileBean bean : listProfile) {
            model.addRow(new Object[]{
                bean.getP_custCode(),
                bean.getP_custName(),
                bean.getP_custSurname()
            });
        }
    }
}
