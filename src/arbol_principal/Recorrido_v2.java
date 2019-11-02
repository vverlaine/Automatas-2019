package arbol_principal;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Verlaine
 */
public class Recorrido_v2 extends javax.swing.JFrame {

    public Recorrido_v2() {
        initComponents();
    }

    public void valid() {
        if (txt8.getText() != "" && txt4.getText().isEmpty()) {
            txt8.setText("");
        }
        if (txt9.getText() != "" && txt4.getText().isEmpty()) {
            txt9.setText("");
        }
        if (txt4.getText() != "" && txt2.getText().isEmpty()) {
            txt4.setText("");
            txt8.setText("");
            txt9.setText("");
        }
        if (txt10.getText() != "" && txt5.getText().isEmpty()) {
            txt10.setText("");
        }
        if (txt11.getText() != "" && txt5.getText().isEmpty()) {
            txt11.setText("");
        }
        if (txt5.getText() != "" && txt2.getText().isEmpty()) {
            txt5.setText("");
            txt10.setText("");
            txt11.setText("");
        }
        if (txt12.getText() != "" && txt6.getText().isEmpty()) {
            txt12.setText("");
        }
        if (txt13.getText() != "" && txt6.getText().isEmpty()) {
            txt13.setText("");
        }
        if (txt6.getText() != "" && txt3.getText().isEmpty()) {
            txt6.setText("");
            txt12.setText("");
            txt13.setText("");
        }
        if (txt14.getText() != "" && txt7.getText().isEmpty()) {
            txt14.setText("");
        }
        if (txt15.getText() != "" && txt7.getText().isEmpty()) {
            txt15.setText("");
        }
        if (txt7.getText() != "" && txt3.getText().isEmpty()) {
            txt7.setText("");
            txt14.setText("");
            txt15.setText("");
        }
        if (txt2.getText() != "" && txt1.getText().isEmpty()) {
            txt2.setText("");
            txt4.setText("");
            txt5.setText("");
            txt8.setText("");
            txt9.setText("");
            txt10.setText("");
            txt11.setText("");
        }

        if (txt3.getText() != "" && txt1.getText().isEmpty()) {
            txt3.setText("");
            txt6.setText("");
            txt7.setText("");
            txt12.setText("");
            txt13.setText("");
            txt14.setText("");
            txt15.setText("");
        }

    }

    public static String strResultado;

    public void preOrderArchivo() {
        try {
            FileWriter escribir = new FileWriter("src\\recorridos_archivos\\" + "PRE ORDER" + ".txt");
            PrintWriter texto = new PrintWriter(escribir);
            texto.println(
                    strResultado.replace("-1,", "")
            );
            texto.close();
            System.out.println("Archivo guardado correctamente");
        } catch (IOException ex) {
            System.out.println("Error al guardar el recorrido " + strResultado + " " + ex);
        }
    }

    public void postOrderArchivo() {
        try {
            FileWriter escribir = new FileWriter("src\\recorridos_archivos\\" + "POST ORDER" + ".txt");
            PrintWriter texto = new PrintWriter(escribir);
            texto.println(
                    strResultado.replace("-1,", "")
            );
            texto.close();
            System.out.println("Archivo guardado correctamente");
        } catch (IOException ex) {
            System.out.println("Error al guardar el recorrido " + strResultado + " " + ex);
        }
    }

    public void inOrderArchivo() {
        try {
            FileWriter escribir = new FileWriter("src\\recorridos_archivos\\" + "IN ORDER" + ".txt");
            PrintWriter texto = new PrintWriter(escribir);
            texto.println(
                    strResultado.replace("-1,", "")
            );
            texto.close();
            System.out.println("Archivo guardado correctamente");
        } catch (IOException ex) {
            System.out.println("Error al guardar el recorrido " + strResultado + " " + ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        txt6 = new javax.swing.JTextField();
        txt7 = new javax.swing.JTextField();
        txt8 = new javax.swing.JTextField();
        txt9 = new javax.swing.JTextField();
        txt10 = new javax.swing.JTextField();
        txt11 = new javax.swing.JTextField();
        txt12 = new javax.swing.JTextField();
        txt13 = new javax.swing.JTextField();
        txt14 = new javax.swing.JTextField();
        txt15 = new javax.swing.JTextField();
        arbolimagen = new javax.swing.JLabel();
        btnPreorder = new javax.swing.JButton();
        btnInorder = new javax.swing.JButton();
        btnPostorder = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Resultado = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnPostorder1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recorrido de Árboles");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt1.setCaretColor(new java.awt.Color(255, 0, 51));
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 70, -1));
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 60, -1));
        getContentPane().add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 210, 60, -1));
        getContentPane().add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 60, -1));
        getContentPane().add(txt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 60, -1));
        getContentPane().add(txt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 350, 60, -1));
        getContentPane().add(txt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 350, 60, -1));
        getContentPane().add(txt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 60, -1));
        getContentPane().add(txt9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, 60, -1));
        getContentPane().add(txt10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, 60, -1));
        getContentPane().add(txt11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, 60, -1));
        getContentPane().add(txt12, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 490, 60, -1));
        getContentPane().add(txt13, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 490, 60, -1));
        getContentPane().add(txt14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 490, 60, -1));
        getContentPane().add(txt15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 490, 60, -1));

        arbolimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arbol_modelo/Diagrama en blanco.png"))); // NOI18N
        getContentPane().add(arbolimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 1430, 560));

        btnPreorder.setText("Pre order");
        btnPreorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreorderActionPerformed(evt);
            }
        });
        getContentPane().add(btnPreorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 600, 90, 40));

        btnInorder.setText("In order");
        btnInorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInorderActionPerformed(evt);
            }
        });
        getContentPane().add(btnInorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 600, 90, 40));

        btnPostorder.setText("Post order");
        btnPostorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostorderActionPerformed(evt);
            }
        });
        getContentPane().add(btnPostorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 600, 100, 40));

        Resultado.setColumns(20);
        Resultado.setRows(5);
        jScrollPane1.setViewportView(Resultado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 590, 470, 60));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnPostorder1.setText("Limpiar");
        btnPostorder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostorder1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPostorder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 600, 100, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPreorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreorderActionPerformed

        valid();
        String text1 = txt1.getText();
        String text2 = txt2.getText();
        String text3 = txt3.getText();
        String text4 = txt4.getText();
        String text5 = txt5.getText();
        String text6 = txt6.getText();
        String text7 = txt7.getText();
        String text8 = txt8.getText();
        String text9 = txt9.getText();
        String text10 = txt10.getText();
        String text11 = txt11.getText();
        String text12 = txt12.getText();
        String text13 = txt13.getText();
        String text14 = txt14.getText();
        String text15 = txt15.getText();

        Resultado.setText(text1 + "," + text2 + "," + text4 + "," + text8 + "," + text9 + "," + text5 + "," + text10
                + "," + text11 + "," + text3 + "," + text6 + "," + text12 + "," + text13 + "," + text7 + ","
                + text14 + "," + text15);
        strResultado = null;
        strResultado = Resultado.getText();
        preOrderArchivo();
    }//GEN-LAST:event_btnPreorderActionPerformed

    private void btnInorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInorderActionPerformed

        valid();
        String text1 = txt1.getText();
        String text2 = txt2.getText();
        String text3 = txt3.getText();
        String text4 = txt4.getText();
        String text5 = txt5.getText();
        String text6 = txt6.getText();
        String text7 = txt7.getText();
        String text8 = txt8.getText();
        String text9 = txt9.getText();
        String text10 = txt10.getText();
        String text11 = txt11.getText();
        String text12 = txt12.getText();
        String text13 = txt13.getText();
        String text14 = txt14.getText();
        String text15 = txt15.getText();

        Resultado.setText(text8 + "," + text4 + "," + text9 + "," + text10 + "," + text5 + "," + text11 + "," + text2
                + "," + text1 + "," + text12 + "," + text6 + "," + text13 + "," + text3 + "," + text14 + ","
                + text7 + "," + text15);
        strResultado = null;
        strResultado = Resultado.getText();
        inOrderArchivo();
    }//GEN-LAST:event_btnInorderActionPerformed

    private void btnPostorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostorderActionPerformed

        valid();
        String text1 = txt1.getText();
        String text2 = txt2.getText();
        String text3 = txt3.getText();
        String text4 = txt4.getText();
        String text5 = txt5.getText();
        String text6 = txt6.getText();
        String text7 = txt7.getText();
        String text8 = txt8.getText();
        String text9 = txt9.getText();
        String text10 = txt10.getText();
        String text11 = txt11.getText();
        String text12 = txt12.getText();
        String text13 = txt13.getText();
        String text14 = txt14.getText();
        String text15 = txt15.getText();

        Resultado.setText(text8 + "," + text9 + "," + text4 + "," + text10 + "," + text11 + "," + text5 + "," + text2
                + "," + text12 + "," + text13 + "," + text6 + "," + text14 + "," + text15 + "," + text7 + ","
                + text3 + "," + text1);
        strResultado = null;
        strResultado = Resultado.getText();
        postOrderArchivo();
    }//GEN-LAST:event_btnPostorderActionPerformed

    private void btnPostorder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostorder1ActionPerformed
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
        txt5.setText("");
        txt6.setText("");
        txt7.setText("");
        txt8.setText("");
        txt9.setText("");
        txt10.setText("");
        txt11.setText("");
        txt12.setText("");
        txt13.setText("");
        txt14.setText("");
        txt15.setText("");
        Resultado.setText("");
    }//GEN-LAST:event_btnPostorder1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Recorrido_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recorrido_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recorrido_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recorrido_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recorrido_v2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Resultado;
    private javax.swing.JLabel arbolimagen;
    private javax.swing.JButton btnInorder;
    private javax.swing.JButton btnPostorder;
    private javax.swing.JButton btnPostorder1;
    private javax.swing.JButton btnPreorder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt10;
    private javax.swing.JTextField txt11;
    private javax.swing.JTextField txt12;
    private javax.swing.JTextField txt13;
    private javax.swing.JTextField txt14;
    private javax.swing.JTextField txt15;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt8;
    private javax.swing.JTextField txt9;
    // End of variables declaration//GEN-END:variables
}
