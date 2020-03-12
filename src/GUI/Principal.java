/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Entidades.hr_applicant;
import Factory.Factory;
import Procesos.BaseDatos;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Principal extends javax.swing.JFrame {

    private static Factory factory;

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        factory = new Factory();
        this.setLocationRelativeTo(null);
        cargarColumnasTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_cargarAspirantes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mbtn_salir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_cargarAspirantes.setText("Cargar Aspirantes");
        btn_cargarAspirantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargarAspirantesActionPerformed(evt);
            }
        });

        jTable1.setModel(modeloTabla);
        jScrollPane1.setViewportView(jTable1);

        jMenu1.setText("Archivo");

        mbtn_salir.setText("Salir");
        mbtn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbtn_salirActionPerformed(evt);
            }
        });
        jMenu1.add(mbtn_salir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 985, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_cargarAspirantes)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(btn_cargarAspirantes)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cargarAspirantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargarAspirantesActionPerformed
        BaseDatos BD = factory.baseDatos();
        BD.obtenerAspirantes();
        cargarModeloTabla();
    }//GEN-LAST:event_btn_cargarAspirantesActionPerformed

    private void mbtn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbtn_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mbtn_salirActionPerformed

    DefaultTableModel modeloTabla = new DefaultTableModel();

    private void cargarColumnasTabla() {
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Descripcion");
        modeloTabla.addColumn("Correo");
        modeloTabla.addColumn("Telefono");
        modeloTabla.addColumn("Salario Esperado");
    }

    private void cargarModeloTabla() {
        BaseDatos BD = factory.baseDatos();
        BD.obtenerAspirantes();
        ArrayList<hr_applicant> listaAspirantes = BD.obtenerAspirantes();
        int cantidadAspirantes = listaAspirantes.size();
        modeloTabla.setNumRows(cantidadAspirantes);

        for (int i = 0; i < cantidadAspirantes; i++) {
            hr_applicant solicitante = listaAspirantes.get(i);

            int id = solicitante.getId();
            String partner_name = solicitante.getPartner_name();
            String description = solicitante.getDescription();
            String email_from = solicitante.getEmail_from();
            String partner_phone = solicitante.getPartner_phone();
            Double salary_expected = solicitante.getSalary_expected();

            modeloTabla.setValueAt(id, i, 0);
            modeloTabla.setValueAt(partner_name, i, 1);
            modeloTabla.setValueAt(description, i, 2);
            modeloTabla.setValueAt(email_from, i, 3);
            modeloTabla.setValueAt(partner_phone, i, 4);
            modeloTabla.setValueAt(salary_expected, i, 5);
        }
    }

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
    private javax.swing.JButton btn_cargarAspirantes;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuItem mbtn_salir;
    // End of variables declaration//GEN-END:variables
}