/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121;

/**
 *
 * @author JP
 */
public class Auditoria extends javax.swing.JFrame {

    /**
     * Creates new form Auditoria
     */
    public Auditoria() {
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

        tittleInfoLabel = new java.awt.Label();
        infoDateInitLabel = new javax.swing.JLabel();
        infoDateEndLabel = new javax.swing.JLabel();
        infoConsLabel = new javax.swing.JLabel();
        infoAreaLabel = new javax.swing.JLabel();
        infoDateInitField = new javax.swing.JTextField();
        infoDateEndField = new javax.swing.JTextField();
        infoConsField = new javax.swing.JTextField();
        infoAreaField = new javax.swing.JTextField();
        infoReviewButt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tittleInfoLabel.setAlignment(java.awt.Label.CENTER);
        tittleInfoLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tittleInfoLabel.setText("INFORME DE REGISTROS");

        infoDateInitLabel.setText("Fecha inicio");

        infoDateEndLabel.setText("Fecha termino");

        infoConsLabel.setText("Consumo");

        infoAreaLabel.setText("Area");

        infoDateInitField.setMaximumSize(new java.awt.Dimension(200, 25));
        infoDateInitField.setMinimumSize(new java.awt.Dimension(200, 25));
        infoDateInitField.setPreferredSize(new java.awt.Dimension(200, 25));
        infoDateInitField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoDateInitFieldActionPerformed(evt);
            }
        });

        infoDateEndField.setMaximumSize(new java.awt.Dimension(200, 25));
        infoDateEndField.setMinimumSize(new java.awt.Dimension(200, 25));
        infoDateEndField.setPreferredSize(new java.awt.Dimension(200, 25));

        infoConsField.setMaximumSize(new java.awt.Dimension(200, 25));
        infoConsField.setMinimumSize(new java.awt.Dimension(200, 25));
        infoConsField.setPreferredSize(new java.awt.Dimension(200, 25));
        infoConsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoConsFieldActionPerformed(evt);
            }
        });

        infoAreaField.setMaximumSize(new java.awt.Dimension(200, 25));
        infoAreaField.setMinimumSize(new java.awt.Dimension(200, 25));
        infoAreaField.setPreferredSize(new java.awt.Dimension(200, 25));

        infoReviewButt.setText("Aceptar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(infoDateInitLabel)
                        .addGap(18, 18, 18)
                        .addComponent(infoDateInitField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(infoReviewButt)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(infoAreaLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(infoAreaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(infoConsLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(infoConsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(infoDateEndLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(infoDateEndField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(61, 61, 61))
            .addComponent(tittleInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tittleInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoDateInitField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infoDateInitLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoDateEndField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infoDateEndLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoConsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infoConsLabel))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoAreaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infoAreaLabel))
                .addGap(28, 28, 28)
                .addComponent(infoReviewButt)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void infoDateInitFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoDateInitFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_infoDateInitFieldActionPerformed

    private void infoConsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoConsFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_infoConsFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Auditoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Auditoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Auditoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Auditoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Auditoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField infoAreaField;
    private javax.swing.JLabel infoAreaLabel;
    private javax.swing.JTextField infoConsField;
    private javax.swing.JLabel infoConsLabel;
    private javax.swing.JTextField infoDateEndField;
    private javax.swing.JLabel infoDateEndLabel;
    private javax.swing.JTextField infoDateInitField;
    private javax.swing.JLabel infoDateInitLabel;
    private javax.swing.JButton infoReviewButt;
    private java.awt.Label tittleInfoLabel;
    // End of variables declaration//GEN-END:variables
}
