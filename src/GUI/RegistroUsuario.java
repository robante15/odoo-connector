/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class RegistroUsuario extends javax.swing.JFrame {

    /**
     * Creates new form RegistroUsuario
     */
    public RegistroUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_top = new javax.swing.JPanel();
        lbl_title1 = new javax.swing.JLabel();
        panel_data = new javax.swing.JPanel();
        txt_rol = new javax.swing.JTextField();
        lbl_rol = new javax.swing.JLabel();
        txt_codEmpleado = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        lbl_codEmpleado = new javax.swing.JLabel();
        lbl_telefono = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        lbl_correo = new javax.swing.JLabel();
        lbl_contrasena = new javax.swing.JLabel();
        txt_contrasena = new javax.swing.JTextField();
        txt_usuario = new javax.swing.JTextField();
        lbl_usuario = new javax.swing.JLabel();
        lbl_empresa = new javax.swing.JLabel();
        txt_empresa = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        lbl_apellidos = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        txt_nombres = new javax.swing.JTextField();
        btn_cancelar = new javax.swing.JButton();
        btn_registrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar Nuevo Usuario");

        panel_top.setBackground(new java.awt.Color(41, 98, 255));

        lbl_title1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_title1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_title1.setText("Registrar Usuario");

        javax.swing.GroupLayout panel_topLayout = new javax.swing.GroupLayout(panel_top);
        panel_top.setLayout(panel_topLayout);
        panel_topLayout.setHorizontalGroup(
            panel_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_topLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_title1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_topLayout.setVerticalGroup(
            panel_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_topLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbl_title1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panel_data.setBackground(new java.awt.Color(255, 255, 255));

        lbl_rol.setText("Rol");

        lbl_codEmpleado.setText("Cod. Empleado");

        lbl_telefono.setText("Telefono");

        lbl_correo.setText("Correo");

        lbl_contrasena.setText("Contraseña");

        lbl_usuario.setText("Usuario");

        lbl_empresa.setText("Empresa");

        lbl_apellidos.setText("Apellidos");

        lbl_nombre.setText("Nombres");

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_registrar.setText("Registrar");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_dataLayout = new javax.swing.GroupLayout(panel_data);
        panel_data.setLayout(panel_dataLayout);
        panel_dataLayout.setHorizontalGroup(
            panel_dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dataLayout.createSequentialGroup()
                .addGroup(panel_dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_dataLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(panel_dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_nombre)
                            .addComponent(lbl_apellidos)
                            .addComponent(lbl_empresa)
                            .addComponent(lbl_usuario)
                            .addComponent(lbl_contrasena)
                            .addComponent(lbl_correo)
                            .addComponent(lbl_telefono)
                            .addComponent(lbl_codEmpleado)
                            .addComponent(lbl_rol))
                        .addGap(18, 18, 18)
                        .addGroup(panel_dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_contrasena)
                                .addComponent(txt_usuario)
                                .addComponent(txt_empresa)
                                .addComponent(txt_nombres)
                                .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_codEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_rol, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_dataLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btn_cancelar)
                        .addGap(56, 56, 56)
                        .addComponent(btn_registrar)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        panel_dataLayout.setVerticalGroup(
            panel_dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_dataLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombre)
                    .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_apellidos))
                .addGap(18, 18, 18)
                .addGroup(panel_dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_empresa))
                .addGap(18, 18, 18)
                .addGroup(panel_dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_usuario))
                .addGap(18, 18, 18)
                .addGroup(panel_dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_contrasena))
                .addGap(18, 18, 18)
                .addGroup(panel_dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_correo)
                    .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_telefono)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codEmpleado)
                    .addComponent(txt_codEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_rol)
                    .addComponent(txt_rol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panel_dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_registrar))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_top, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        // TODO add your handling code here:
        String nombre = this.txt_nombres.getText();
        String apellido = this.txt_apellidos.getText();
        String empresa = this.txt_empresa.getText();
        String user = this.txt_usuario.getText();
        String pass = this.txt_contrasena.getText();
        String correo = this.txt_correo.getText();
        String tel = this.txt_telefono.getText();
        String cod = this.txt_codEmpleado.getText();
        String rol = this.txt_rol.getText();
        
        if(!nombre.equals("") && !apellido.equals("") && !empresa.equals("") && !user.equals("") && !pass.equals("")
                && !correo.equals("") && !tel.equals("") && !cod.equals("") && !rol.equals("")){
            JOptionPane.showMessageDialog(null, "Se agrego el usuario");
        } else {
            JOptionPane.showMessageDialog(null, "No deje los campos vacios");
        }
    }//GEN-LAST:event_btn_registrarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JLabel lbl_apellidos;
    private javax.swing.JLabel lbl_codEmpleado;
    private javax.swing.JLabel lbl_contrasena;
    private javax.swing.JLabel lbl_correo;
    private javax.swing.JLabel lbl_empresa;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_rol;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JLabel lbl_title1;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JPanel panel_data;
    private javax.swing.JPanel panel_top;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_codEmpleado;
    private javax.swing.JTextField txt_contrasena;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_empresa;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_rol;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
