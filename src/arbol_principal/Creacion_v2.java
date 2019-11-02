package arbol_principal;

import arbol_funciones.funciones_recorrido;
import arbol_modelo.Arbol;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author Verlaine
 */
public class Creacion_v2 extends javax.swing.JFrame {

    public Creacion_v2() {
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

    public static final String SEPARATOR = ",";
    funciones_recorrido funRec;
    Arbol nArbol;
    FileInputStream entrada;
    File archivo;
    JFileChooser seleccionado = new JFileChooser();

    public String AbrirATexto(File archivo) {

        String contenido = "";
        try {
            entrada = new FileInputStream(archivo);
            int ascci;
            while ((ascci = entrada.read()) != -1) {
                char carcater = (char) ascci;
                contenido += carcater;
            }
        } catch (Exception e) {
        }
        return contenido;
    }

    public void RecPreorder() {
        if (seleccionado.showDialog(null, "Seleccione archivo") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionado.getSelectedFile();
            if (archivo.canRead()) {
                if (archivo.getName().endsWith("txt")) {
                    String linea = null;
                    try {

                        BufferedReader leer = new BufferedReader(new FileReader(archivo));
                        while ((linea = leer.readLine()) != null || (linea = leer.readLine()) == null) {

                            StringTokenizer tokens = new StringTokenizer(linea, SEPARATOR);
                            String d1 = tokens.nextToken().trim();
                            String d2 = tokens.nextToken().trim();
                            String d3 = tokens.nextToken().trim();
                            String d4 = tokens.nextToken().trim();
                            String d5 = tokens.nextToken().trim();
                            String d6 = tokens.nextToken().trim();
                            String d7 = tokens.nextToken().trim();
                            String d8 = tokens.nextToken().trim();
                            String d9 = tokens.nextToken().trim();
                            String d10 = tokens.nextToken().trim();
                            String d11 = tokens.nextToken().trim();
                            String d12 = tokens.nextToken().trim();
                            String d13 = tokens.nextToken().trim();
                            String d14 = tokens.nextToken().trim();
                            String d15 = tokens.nextToken().trim();

                            txt1.setText(d1);
                            txt2.setText(d2);
                            txt4.setText(d3);
                            txt8.setText(d4);
                            txt9.setText(d5);
                            txt5.setText(d6);
                            txt10.setText(d7);
                            txt11.setText(d8);
                            txt3.setText(d9);
                            txt6.setText(d10);
                            txt12.setText(d11);
                            txt13.setText(d12);
                            txt7.setText(d13);
                            txt14.setText(d14);
                            txt15.setText(d15);
                        }
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                } else {
                    System.out.println("Por favor seleccione un archivo de texto");
                }
            }
        }
    }

    public void RecInorder() {
        if (seleccionado.showDialog(null, "Seleccione archivo") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionado.getSelectedFile();
            if (archivo.canRead()) {
                if (archivo.getName().endsWith("txt")) {
                    String linea = null;
                    try {

                        BufferedReader leer = new BufferedReader(new FileReader(archivo));
                        while ((linea = leer.readLine()) != null || (linea = leer.readLine()) == null) {

                            StringTokenizer tokens = new StringTokenizer(linea, SEPARATOR);
                            String d1 = tokens.nextToken().trim();
                            String d2 = tokens.nextToken().trim();
                            String d3 = tokens.nextToken().trim();
                            String d4 = tokens.nextToken().trim();
                            String d5 = tokens.nextToken().trim();
                            String d6 = tokens.nextToken().trim();
                            String d7 = tokens.nextToken().trim();
                            String d8 = tokens.nextToken().trim();
                            String d9 = tokens.nextToken().trim();
                            String d10 = tokens.nextToken().trim();
                            String d11 = tokens.nextToken().trim();
                            String d12 = tokens.nextToken().trim();
                            String d13 = tokens.nextToken().trim();
                            String d14 = tokens.nextToken().trim();
                            String d15 = tokens.nextToken().trim();

                            txt8.setText(d1);
                            txt4.setText(d2);
                            txt9.setText(d3);
                            txt10.setText(d4);
                            txt5.setText(d5);
                            txt11.setText(d6);
                            txt2.setText(d7);
                            txt1.setText(d8);
                            txt12.setText(d9);
                            txt6.setText(d10);
                            txt13.setText(d11);
                            txt3.setText(d12);
                            txt14.setText(d13);
                            txt7.setText(d14);
                            txt15.setText(d15);
                        }
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                } else {
                    System.out.println("Por favor seleccione un archivo de texto");
                }
            }
        }
    }

    public void RecPostorder() {
        if (seleccionado.showDialog(null, "Seleccione archivo") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionado.getSelectedFile();
            if (archivo.canRead()) {
                if (archivo.getName().endsWith("txt")) {
                    String linea = null;
                    try {

                        BufferedReader leer = new BufferedReader(new FileReader(archivo));
                        while ((linea = leer.readLine()) != null || (linea = leer.readLine()) == null) {

                            StringTokenizer tokens = new StringTokenizer(linea, SEPARATOR);
                            String d1 = tokens.nextToken().trim();
                            String d2 = tokens.nextToken().trim();
                            String d3 = tokens.nextToken().trim();
                            String d4 = tokens.nextToken().trim();
                            String d5 = tokens.nextToken().trim();
                            String d6 = tokens.nextToken().trim();
                            String d7 = tokens.nextToken().trim();
                            String d8 = tokens.nextToken().trim();
                            String d9 = tokens.nextToken().trim();
                            String d10 = tokens.nextToken().trim();
                            String d11 = tokens.nextToken().trim();
                            String d12 = tokens.nextToken().trim();
                            String d13 = tokens.nextToken().trim();
                            String d14 = tokens.nextToken().trim();
                            String d15 = tokens.nextToken().trim();

                            txt8.setText(d1);
                            txt9.setText(d2);
                            txt4.setText(d3);
                            txt10.setText(d4);
                            txt11.setText(d5);
                            txt5.setText(d6);
                            txt2.setText(d7);
                            txt12.setText(d8);
                            txt13.setText(d9);
                            txt6.setText(d10);
                            txt14.setText(d11);
                            txt15.setText(d12);
                            txt7.setText(d13);
                            txt3.setText(d14);
                            txt1.setText(d15);
                        }
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                } else {
                    System.out.println("Por favor seleccione un archivo de texto");
                }
            }
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
        jLabel1 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();

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
        getContentPane().add(btnPreorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 90, 40));

        btnInorder.setText("In order");
        btnInorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInorderActionPerformed(evt);
            }
        });
        getContentPane().add(btnInorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 620, 90, 40));

        btnPostorder.setText("Post Order");
        btnPostorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostorderActionPerformed(evt);
            }
        });
        getContentPane().add(btnPostorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 620, 100, 40));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 620, 100, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPreorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreorderActionPerformed

        RecPreorder();
        valid();

    }//GEN-LAST:event_btnPreorderActionPerformed

    private void btnInorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInorderActionPerformed

        RecInorder();
        valid();

    }//GEN-LAST:event_btnInorderActionPerformed

    private void btnPostorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostorderActionPerformed

        RecPostorder();
        valid();

    }//GEN-LAST:event_btnPostorderActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

        Principal p = new Principal();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Creacion_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Creacion_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Creacion_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Creacion_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Creacion_v2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arbolimagen;
    private javax.swing.JButton btnInorder;
    private javax.swing.JButton btnPostorder;
    private javax.swing.JButton btnPreorder;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
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
