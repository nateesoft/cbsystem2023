package th.co.cbank.project.view;

public class LoadingDialog extends javax.swing.JDialog {

    public LoadingDialog(java.awt.Frame parent, boolean modal, String topic, String detail) {
        super(parent, modal);
        initComponents();
        
        txtTopic.setText(topic);
        txtDetail.setText(detail);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pbLoading = new javax.swing.JProgressBar();
        txtTopic = new javax.swing.JLabel();
        txtDetail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        pbLoading.setIndeterminate(true);

        txtTopic.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTopic.setText("ระบบจะทำการประมวลผล ข้อมูลสมาชิกทั้งหมด กรุณารอสักครู่");

        txtDetail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtDetail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDetail.setText("...ข้อมูลจะถูกประมวลผล วันละ 1 ครั้งเท่านั้น");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtDetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pbLoading, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTopic))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pbLoading, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTopic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDetail)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar pbLoading;
    private javax.swing.JLabel txtDetail;
    private javax.swing.JLabel txtTopic;
    // End of variables declaration//GEN-END:variables

}
