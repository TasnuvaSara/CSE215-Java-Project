/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project215;

/**
 *
 * @author MD Khairul Hasan
 */
public class End extends javax.swing.JFrame {

    /**
     * Creates new form End
     */
    public End() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFull = new javax.swing.JPanel();
        jPanel1st = new javax.swing.JPanel();
        jlBG = new javax.swing.JLabel();
        jbtnOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanelFull.setBackground(new java.awt.Color(0, 51, 102));

        jPanel1st.setBackground(new java.awt.Color(0, 51, 102));

        jlBG.setFont(new java.awt.Font("Baskerville Old Face", 1, 16)); // NOI18N
        jlBG.setForeground(new java.awt.Color(255, 255, 255));
        jlBG.setText("Your Desired Blood will be reached to soon");

        jbtnOK.setBackground(new java.awt.Color(204, 204, 255));
        jbtnOK.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnOK.setText("OK");
        jbtnOK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnOKMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1stLayout = new javax.swing.GroupLayout(jPanel1st);
        jPanel1st.setLayout(jPanel1stLayout);
        jPanel1stLayout.setHorizontalGroup(
            jPanel1stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1stLayout.createSequentialGroup()
                .addGroup(jPanel1stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1stLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jbtnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1stLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jlBG)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1stLayout.setVerticalGroup(
            jPanel1stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1stLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jlBG, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelFullLayout = new javax.swing.GroupLayout(jPanelFull);
        jPanelFull.setLayout(jPanelFullLayout);
        jPanelFullLayout.setHorizontalGroup(
            jPanelFullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1st, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanelFullLayout.setVerticalGroup(
            jPanelFullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFullLayout.createSequentialGroup()
                .addComponent(jPanel1st, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFull, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFull, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnOKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnOKMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jbtnOKMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(End.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(End.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(End.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(End.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new End().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1st;
    private javax.swing.JPanel jPanelFull;
    private javax.swing.JButton jbtnOK;
    private javax.swing.JLabel jlBG;
    // End of variables declaration//GEN-END:variables
}
