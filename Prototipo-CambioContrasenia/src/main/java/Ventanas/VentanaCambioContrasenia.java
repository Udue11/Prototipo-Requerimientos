package Ventanas;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Froylan Lara Oses
 */
public class VentanaCambioContrasenia extends javax.swing.JFrame {

    /**
     * Creates new form VentanaCambioContrasenia
     */
    public VentanaCambioContrasenia() {
        initComponents();
        
        jPasswordCorreo.setText("Correo");
        jPasswordCorreo.setForeground(new java.awt.Color(115, 115, 115));
        jPasswordCorreo.setEchoChar((char)0); 
            
        jPasswordNcontra.setText("Nueva clave");
        jPasswordNcontra.setForeground(new java.awt.Color(115, 115, 115));
        jPasswordNcontra.setEchoChar((char)0); 
            
        jPasswordConfContra.setText("Confirmar clave");
        jPasswordConfContra.setForeground(new java.awt.Color(115, 115, 115));
        jPasswordConfContra.setEchoChar((char)0);        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordNcontra = new javax.swing.JPasswordField();
        jPasswordCorreo = new javax.swing.JPasswordField();
        jPasswordConfContra = new javax.swing.JPasswordField();
        jButtonAceptar = new javax.swing.JButton();
        jLabelErrorcClave = new javax.swing.JLabel();
        jLabelErrornClave = new javax.swing.JLabel();
        jLabelErrorCorreo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(115, 115, 115));
        jLabel1.setText("Cambio de contraseña");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(115, 115, 115));
        jLabel2.setText("Autorizador");

        jPasswordNcontra.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPasswordNcontra.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPasswordNcontra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordNcontraFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordNcontraFocusLost(evt);
            }
        });
        jPasswordNcontra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordNcontraActionPerformed(evt);
            }
        });

        jPasswordCorreo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPasswordCorreo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPasswordCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordCorreoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordCorreoFocusLost(evt);
            }
        });

        jPasswordConfContra.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPasswordConfContra.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPasswordConfContra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordConfContraFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordConfContraFocusLost(evt);
            }
        });

        jButtonAceptar.setBackground(new java.awt.Color(0, 118, 255));
        jButtonAceptar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonAceptar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.setAlignmentX(1.0F);
        jButtonAceptar.setAlignmentY(1.0F);
        jButtonAceptar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 118, 255), 3));
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jLabelErrorcClave.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabelErrorcClave.setForeground(new java.awt.Color(204, 0, 0));

        jLabelErrornClave.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabelErrornClave.setForeground(new java.awt.Color(204, 0, 0));

        jLabelErrorCorreo.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabelErrorCorreo.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelErrorCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPasswordConfContra, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelErrorcClave, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPasswordNcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPasswordCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelErrornClave, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(367, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(jPasswordCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabelErrorCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordNcontra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabelErrornClave, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordConfContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabelErrorcClave, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(339, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(316, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        jLabelErrorCorreo.setText("");
        jLabelErrornClave.setText("");
        jLabelErrorcClave.setText("");
        String jCorreo = jPasswordCorreo.getText().replace(" ","");
        String jnClave = jPasswordNcontra.getText().replace(" ","");
        String jcClave = jPasswordConfContra.getText().replace(" ","");
         
        if (jCorreo.equals("Correo")){
            jCorreo = "";
        }
        if (jnClave.equals("Nuevaclave")){
            jnClave = "";
        }
        if (jcClave.equals("Confirmarclave")){
            jcClave = "";
        }
        
        boolean correoValido = jCorreo.equals("");
        boolean nClaveValido = jnClave.equals("");
        boolean cClaveValido = jcClave.equals("");
        if ((!correoValido)&(!nClaveValido)&(!cClaveValido)){
            jCorreo = jPasswordCorreo.getText();
            jnClave = jPasswordNcontra.getText();
            
            String patron = "^[A-Za-z0-9+_.-]+@[A-Za-z]+\\.[a-z]+$";
            Pattern pattern = Pattern.compile(patron);
            Matcher matcher = pattern.matcher(jCorreo);
            correoValido = !matcher.matches();
            
            patron = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)\\S{8,}$";
            pattern = Pattern.compile(patron);
            matcher = pattern.matcher(jnClave);
            nClaveValido = !matcher.matches();            
            
            if ((correoValido)||(nClaveValido)){
                if(correoValido){
                    jLabelErrorCorreo.setText("El formato de correo no es valido");
                }
                if(nClaveValido){
                    jLabelErrornClave.setText("El formato de la contraseña es incorrecto");
                    JOptionPane.showMessageDialog(null, "La contraseña debe tener 8 caracteres minimo, una mayuscula minimo y un numero minimo.");
                }
                return;
            }
            if(jPasswordCorreo.getText().equals(correo)){
                if (jPasswordNcontra.getText().equals(jPasswordConfContra.getText())){
                    JOptionPane.showMessageDialog(null, "Se realizo el cambio de contraseña exitosamente.");
                }else{
                    jLabelErrorcClave.setText("La confirmacion de clave no es igual");
                }
            }else{
                JOptionPane.showMessageDialog(null, "El correo es incorrecto.");
            }
        }else{
            if(correoValido){
                jLabelErrorCorreo.setText("El correo requerido");
                jPasswordCorreo.setText("Correo");
                jPasswordCorreo.setForeground(new java.awt.Color(115, 115, 115));
                jPasswordCorreo.setEchoChar((char)0);
            }
            if(nClaveValido){
                jLabelErrornClave.setText("La nueva clave es requerida");
                jPasswordNcontra.setText("Nueva clave");
                jPasswordNcontra.setForeground(new java.awt.Color(115, 115, 115));
                jPasswordNcontra.setEchoChar((char)0); 
            } 
            if(cClaveValido){
                jLabelErrorcClave.setText("La confirmación clave es requerida");
                jPasswordConfContra.setText("Confirmar clave");
                jPasswordConfContra.setForeground(new java.awt.Color(115, 115, 115));
                jPasswordConfContra.setEchoChar((char)0);
            }            
        }
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jPasswordNcontraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordNcontraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordNcontraActionPerformed

    private void jPasswordCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordCorreoFocusLost
        if (jPasswordCorreo.getText().equals("")){
            jPasswordCorreo.setText("Correo");
            jPasswordCorreo.setForeground(new java.awt.Color(115, 115, 115));
            jPasswordCorreo.setEchoChar((char)0);
        }
    }//GEN-LAST:event_jPasswordCorreoFocusLost

    private void jPasswordCorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordCorreoFocusGained
        if (enfoque == 0){
            enfoque++;
            jPasswordCorreo.transferFocus();
            jPasswordNcontra.transferFocus();
            jPasswordConfContra.transferFocus();
            return;
        }
        if (jPasswordCorreo.getText().equals("Correo")){
            jPasswordCorreo.setText("");
            jPasswordCorreo.setForeground(new java.awt.Color(0, 0, 0));
        }
    }//GEN-LAST:event_jPasswordCorreoFocusGained

    private void jPasswordNcontraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordNcontraFocusGained
        if (jPasswordNcontra.getText().equals("Nueva clave")){
            jPasswordNcontra.setText("");
            jPasswordNcontra.setForeground(new java.awt.Color(0, 0, 0));
            jPasswordNcontra.setEchoChar('*'); 
        }
    }//GEN-LAST:event_jPasswordNcontraFocusGained

    private void jPasswordNcontraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordNcontraFocusLost
        if (jPasswordNcontra.getText().equals("")){
            jPasswordNcontra.setText("Nueva clave");
            jPasswordNcontra.setForeground(new java.awt.Color(115, 115, 115));
            jPasswordNcontra.setEchoChar((char)0);
        }
    }//GEN-LAST:event_jPasswordNcontraFocusLost

    private void jPasswordConfContraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordConfContraFocusLost
        if (jPasswordConfContra.getText().equals("")){
            jPasswordConfContra.setText("Confirmar clave");
            jPasswordConfContra.setForeground(new java.awt.Color(115, 115, 115));
            jPasswordConfContra.setEchoChar((char)0); 
        }
    }//GEN-LAST:event_jPasswordConfContraFocusLost

    private void jPasswordConfContraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordConfContraFocusGained
        if (jPasswordConfContra.getText().equals("Confirmar clave")){
            jPasswordConfContra.setText("");
            jPasswordConfContra.setForeground(new java.awt.Color(0, 0, 0));
            jPasswordConfContra.setEchoChar('*'); 
        }
    }//GEN-LAST:event_jPasswordConfContraFocusGained

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
            java.util.logging.Logger.getLogger(VentanaCambioContrasenia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCambioContrasenia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCambioContrasenia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCambioContrasenia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCambioContrasenia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelErrorCorreo;
    private javax.swing.JLabel jLabelErrorcClave;
    private javax.swing.JLabel jLabelErrornClave;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordConfContra;
    private javax.swing.JPasswordField jPasswordCorreo;
    private javax.swing.JPasswordField jPasswordNcontra;
    // End of variables declaration//GEN-END:variables
    //Variables 
    private int enfoque = 0;
    private String correo = "reque@gmail.com";
}