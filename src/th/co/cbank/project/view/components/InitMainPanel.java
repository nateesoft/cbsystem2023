package th.co.cbank.project.view.components;

import org.apache.log4j.Logger;

public class InitMainPanel extends javax.swing.JPanel {

    private final Logger logger = Logger.getLogger(InitMainPanel.class);

    public InitMainPanel() {
        initComponents();
        logger.debug("InitMainPanel init");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbWarning1 = new javax.swing.JLabel();
        lbWarning2 = new javax.swing.JLabel();
        lbMainWarning = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbWarning1.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        lbWarning1.setForeground(new java.awt.Color(204, 204, 204));
        lbWarning1.setText("กรุณาเลือกเมนูเพื่อทำรายการ");
        add(lbWarning1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 748, 109));

        lbWarning2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbWarning2.setForeground(new java.awt.Color(204, 204, 204));
        lbWarning2.setText("บริษัทสยามคอนวีเนียน จำกัด  Copy Right 2014-2015");
        add(lbWarning2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        lbMainWarning.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/p1-(5).jpg"))); // NOI18N
        add(lbMainWarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 570));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbMainWarning;
    private javax.swing.JLabel lbWarning1;
    private javax.swing.JLabel lbWarning2;
    // End of variables declaration//GEN-END:variables
}
