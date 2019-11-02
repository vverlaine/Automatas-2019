package arbol_principal;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jBReccorido = new javax.swing.JButton();
        jBConstruccion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("MENU PRINCIPAL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jBReccorido.setText("RECORRIDOS");
        jBReccorido.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBReccorido.setPreferredSize(new java.awt.Dimension(165, 23));
        jBReccorido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBReccoridoActionPerformed(evt);
            }
        });
        getContentPane().add(jBReccorido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, -1, 42));

        jBConstruccion.setText("CONSTRUCCION DE ARBOL");
        jBConstruccion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBConstruccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConstruccionActionPerformed(evt);
            }
        });
        getContentPane().add(jBConstruccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, -1, 42));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("PROYECTO AUTOMATAS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 46, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("ARBOLES");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 75, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arbol_modelo/logo.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 526, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBReccoridoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBReccoridoActionPerformed
        Recorrido_v2 rec = new Recorrido_v2();
                rec.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBReccoridoActionPerformed

    private void jBConstruccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConstruccionActionPerformed
        
        Creacion_v2 pr= new Creacion_v2();
        pr.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBConstruccionActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConstruccion;
    private javax.swing.JButton jBReccorido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
