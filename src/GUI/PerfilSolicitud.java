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

/**
 *
 * @author malte
 */
public class PerfilSolicitud extends javax.swing.JFrame {

    private static Factory factory;
    public int index;

    /**
     * Creates new form InformacionEmpleado
     */
    public PerfilSolicitud() {
        initComponents();
        factory = new Factory();
        this.setLocationRelativeTo(null);
    }
    
    private void CargarInformacion(){
        BaseDatos BD = factory.baseDatos();
        BD.obtenerAspirantes();
        ArrayList<hr_applicant> listaAspirantes = BD.obtenerAspirantes();
        
        hr_applicant solicitante = listaAspirantes.get(index);
        
        int id = solicitante.getId();
        int campaign_id = solicitante.getCampaign_id();
        int source_id = solicitante.getSource_id();
        int medium_id = solicitante.getMedium_id();
        String email_cc = solicitante.getEmail_cc();
        boolean activade = solicitante.isActive();
        String description = solicitante.getDescription();
        String email_from = solicitante.getEmail_from();
        String name = solicitante.getName();
        Double probability = solicitante.getProbability();
        int partner_id = solicitante.getPartner_id();
        String create_date = solicitante.getCreate_date();
        int stage_id = solicitante.getStage_id();
        int last_stage_id = solicitante.getLast_stage_id();
        int company_id = solicitante.getCompany_id();
        int user_id = solicitante.getUser_id();
        String date_closed = solicitante.getDate_closed();
        String date_open = solicitante.getDate_open();
        String date_last_stage_update = solicitante.getDate_last_stage_update();
        String priority = solicitante.getPriority();
        int job_id = solicitante.getJob_id();
        String salary_proposed_extra = solicitante.getSalary_proposed_extra();
        String salary_expected_extra = solicitante.getSalary_expected_extra();
        Double salary_proposed = solicitante.getSalary_proposed();
        Double salary_expected = solicitante.getSalary_expected();
        String availability = solicitante.getAvailability();
        String partner_name = solicitante.getPartner_name();
        String partner_phone = solicitante.getPartner_phone();
        String partner_mobile = solicitante.getPartner_mobile();
        int department_id = solicitante.getPartner_id();
        double delay_close = solicitante.getDelay_close();
        int color = solicitante.getColor();
        int emp_id = solicitante.getEmp_id();
        String kanban_state = solicitante.getKanban_state();
        int create_uid = solicitante.getCreate_uid();
        int write_uid = solicitante.getWrite_uid();
        String write_date = solicitante.getWrite_date();
        
        
        this.jLabel1.setText(name);
        this.jLabel2.setText(partner_name);
        this.jLabel20.setText(email_from);
        this.jLabel21.setText(create_date);
        this.jLabel22.setText(partner_phone);
        this.jLabel23.setText(partner_mobile);
        this.jLabel25.setText(String.valueOf(job_id));
        this.jLabel26.setText(String.valueOf(department_id));
        this.jLabel27.setText(priority);
        this.jLabel28.setText(String.valueOf(probability));
        this.jLabel30.setText(salary_expected + " + " + salary_expected_extra);
        this.jLabel31.setText(salary_proposed + " + " + salary_proposed_extra);
        this.jLabel34.setText(availability);
        
        
        this.jLabel33.setText(description);
        
        
        /*System.out.print("\nid: " + id + "\n campaign_id: " + campaign_id + "\n source_id:" + source_id+ "\nmedium_id " + medium_id
        + "\nemail_cc" + email_cc + "\nactivade: " + activade + "\nname" + name + "\ndescription: " + description + "\nemail_from" + email_from
        + "\nprobability" + probability + "\npartner_id"+partner_id+ "\ncreate_date"+create_date+"\nstage_id"+stage_id+"\nlast_stage_id"+last_stage_id
        + "\ncompany_id"+company_id+"\nuser_id"+user_id+"\ndate_closed"+date_closed+"\ndate_open"+date_open+"\ndate_last_stage_update"+date_last_stage_update
        + "\npriority"+priority+"\njob_id"+job_id+"\nsalary_proposed_extra"+salary_proposed_extra+"\nsalary_expected_extra"+salary_expected_extra
        + "\nsalary_proposed"+salary_proposed+"\nsalary_expected"+salary_expected+"\navailability"+availability+"\npartner_name"+partner_name+ "\npartner_phone"+partner_phone
        + "\npartner_mobile"+ partner_mobile +"\ndepartment_id"+department_id+"\ndelay_close"+delay_close+"\ncolor"+ color+ "\nemp_id"+emp_id
        + "\nkanban_state"+kanban_state + "\ncreate_uid"+create_uid+"\nwrite_uid"+write_uid+"\nwrite_date"+write_date);*/
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
        panel_perfil = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panel_info_personal = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        panel_puesto = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        panel_contrato = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        btn_aceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        panel_top.setBackground(new java.awt.Color(41, 98, 255));

        lbl_title1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_title1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_title1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_title1.setText("Perfil de Solicitante");

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
                .addGap(24, 24, 24)
                .addComponent(lbl_title1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_perfil.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Roberto Maltez");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Roberto Herberth Maltez Guardado");

        panel_info_personal.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Correo electrónico");

        jLabel4.setText("Correo electrónico cc");

        jLabel5.setText("Teléfono");

        jLabel6.setText("Móvil");

        jLabel7.setText("Titulo");

        jLabel20.setText("rhmaltez@gmail.com");

        jLabel21.setText("rhguardado@gmail.com");

        jLabel22.setText("2257-7777");

        jLabel23.setText("7412-2469");

        jLabel24.setText("Ingeniero de SIstemas Informáticos");

        javax.swing.GroupLayout panel_info_personalLayout = new javax.swing.GroupLayout(panel_info_personal);
        panel_info_personal.setLayout(panel_info_personalLayout);
        panel_info_personalLayout.setHorizontalGroup(
            panel_info_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_info_personalLayout.createSequentialGroup()
                .addGroup(panel_info_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(panel_info_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel23)
                    .addComponent(jLabel22)
                    .addComponent(jLabel21)
                    .addComponent(jLabel20))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_info_personalLayout.setVerticalGroup(
            panel_info_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_info_personalLayout.createSequentialGroup()
                .addGroup(panel_info_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(panel_info_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(panel_info_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(panel_info_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addGroup(panel_info_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel24))
                .addGap(0, 0, 0))
        );

        panel_puesto.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Puesto");

        jLabel9.setText("Trabajo solicitado");

        jLabel10.setText("Departamento");

        jLabel25.setText("Tecnico en Reparación");

        jLabel26.setText("Taller y reparación");

        javax.swing.GroupLayout panel_puestoLayout = new javax.swing.GroupLayout(panel_puesto);
        panel_puesto.setLayout(panel_puestoLayout);
        panel_puestoLayout.setHorizontalGroup(
            panel_puestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_puestoLayout.createSequentialGroup()
                .addGroup(panel_puestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(panel_puestoLayout.createSequentialGroup()
                        .addGroup(panel_puestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(36, 36, 36)
                        .addGroup(panel_puestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel25))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_puestoLayout.setVerticalGroup(
            panel_puestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_puestoLayout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_puestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel25))
                .addGap(18, 18, 18)
                .addGroup(panel_puestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel26))
                .addGap(0, 0, 0))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setText("Categorías");

        jLabel12.setText("Responsable");

        jLabel13.setText("Apreciación");

        jLabel14.setText("Media");

        jLabel15.setText("Fuente");

        jLabel27.setText("Taller, Reparador, Tecnico, Mantenimiento");

        jLabel28.setText("2/3");

        jLabel29.setText("LinkedIn");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12)
            .addComponent(jLabel14)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel28)
                    .addComponent(jLabel27)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel27))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel28))
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel29)))
        );

        panel_contrato.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Contrato");

        jLabel17.setText("Salario esperado");

        jLabel18.setText("Salario propuesto");

        jLabel19.setText("Disponibilidad");

        jLabel30.setText("750,00 + Almuerzo");

        jLabel31.setText("600,00 + Almuerzo");

        jLabel34.setText("jLabel34");

        javax.swing.GroupLayout panel_contratoLayout = new javax.swing.GroupLayout(panel_contrato);
        panel_contrato.setLayout(panel_contratoLayout);
        panel_contratoLayout.setHorizontalGroup(
            panel_contratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contratoLayout.createSequentialGroup()
                .addGroup(panel_contratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(panel_contratoLayout.createSequentialGroup()
                        .addGroup(panel_contratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(41, 41, 41)
                        .addGroup(panel_contratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(jLabel31)
                            .addComponent(jLabel30))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_contratoLayout.setVerticalGroup(
            panel_contratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contratoLayout.createSequentialGroup()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_contratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel30))
                .addGap(18, 18, 18)
                .addGroup(panel_contratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel31))
                .addGap(18, 18, 18)
                .addGroup(panel_contratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel34))
                .addGap(0, 0, 0))
        );

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel32.setText("Resumen de la solicitud");

        jLabel33.setText("Serio y responsable");

        btn_aceptar.setText("Aceptar");

        javax.swing.GroupLayout panel_perfilLayout = new javax.swing.GroupLayout(panel_perfil);
        panel_perfil.setLayout(panel_perfilLayout);
        panel_perfilLayout.setHorizontalGroup(
            panel_perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_perfilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_perfilLayout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_aceptar))
                    .addGroup(panel_perfilLayout.createSequentialGroup()
                        .addGroup(panel_perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(panel_perfilLayout.createSequentialGroup()
                                .addGroup(panel_perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(panel_info_personal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panel_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panel_perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(panel_contrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel32))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_perfilLayout.setVerticalGroup(
            panel_perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_perfilLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_perfilLayout.createSequentialGroup()
                        .addComponent(panel_info_personal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(panel_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel33)
                        .addGap(26, 26, 26))
                    .addGroup(panel_perfilLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addComponent(panel_contrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(btn_aceptar)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_top, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_perfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_top, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_perfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        this.CargarInformacion();
    }//GEN-LAST:event_formWindowActivated

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
        this.setVisible(false);
    }//GEN-LAST:event_formFocusLost

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_formMouseExited

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
            java.util.logging.Logger.getLogger(PerfilSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerfilSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerfilSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerfilSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerfilSolicitud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_title1;
    private javax.swing.JPanel panel_contrato;
    private javax.swing.JPanel panel_info_personal;
    private javax.swing.JPanel panel_perfil;
    private javax.swing.JPanel panel_puesto;
    private javax.swing.JPanel panel_top;
    // End of variables declaration//GEN-END:variables
}
