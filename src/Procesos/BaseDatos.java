/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import java.sql.*;
import java.util.*;
import javax.swing.*;
import Factory.Factory;

//Import de entidades
import Entidades.hr_applicant;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Usuario
 */
public class BaseDatos {

    private static Factory factory;
    private static int workload = 12;
    Connection conn = null;
    PreparedStatement st = null;
    ResultSet rs = null;

    // BD de Odoo
    String urlOdoo = "localhost:5432";
    String usernameOdoo = "openpg";
    String passwordOdoo = "openpgpwd";
    String jdbcOdoo = "jdbc:postgresql://" + urlOdoo + "/gerenciales";

    String url = "34.70.88.224";
    String jdbc = "jdbc:postgresql://" + url + "/odoo-connector";
    String username = "postgres";
    String password = "B5ejuOkD4yCKLvAD";

    public static String hashPassword(String password_plaintext) {
        String salt = BCrypt.gensalt(workload);
        String hashed_password = BCrypt.hashpw(password_plaintext, salt);

        return (hashed_password);
    }

    public static boolean checkPassword(String password_plaintext, String stored_hash) {
        boolean password_verified = false;

        if (null == stored_hash || !stored_hash.startsWith("$2a$")) {
            throw new java.lang.IllegalArgumentException("Invalid hash provided for comparison");
        }

        password_verified = BCrypt.checkpw(password_plaintext, stored_hash);

        return (password_verified);
    }

    public BaseDatos() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(jdbc, username, password);
            System.out.println("Conectado al servidor de PostgreSQL correctamente");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return conn;
    }

    /*-----------------------------------Metodos de Obtencion-----------------------------------*/
    public boolean ValidarLogin(String usuario, String contra) {
        boolean aproved = false;
        try {
            conn = DriverManager.getConnection(jdbc, username, password);
            String SQLQuery = "SELECT usuario, contrasena FROM public.usuarios WHERE usuario='" + usuario + "'";
            st = conn.prepareStatement(SQLQuery);
            rs = st.executeQuery();

            while (rs.next()) {
                String BD_usuario = rs.getString("usuario");
                System.out.print(BD_usuario);
                String BD_contra = rs.getString("contrasena");
                System.out.print(BD_contra);
                if (usuario.equals(BD_usuario) && checkPassword(contra, BD_contra)) {
                    aproved = true;
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                st.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return aproved;
    }

    public ArrayList<hr_applicant> obtenerAspirantes() {
        factory = new Factory();
        ArrayList<hr_applicant> listaAspirantes = new ArrayList<hr_applicant>();
        try {
            conn = DriverManager.getConnection(jdbcOdoo, usernameOdoo, passwordOdoo);
            String SQLQuery = "SELECT * FROM public.hr_applicant";
            st = conn.prepareStatement(SQLQuery);
            rs = st.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("id");
                int campaign_id = rs.getInt("campaign_id");
                int source_id = rs.getInt("source_id");
                int medium_id = rs.getInt("medium_id");
                String email_cc = rs.getString("email_cc");
                int message_main_attachment_id = rs.getInt("message_main_attachment_id");
                String name = rs.getString("name");
                boolean active = rs.getBoolean("active");
                String description = rs.getString("description");
                String email_from = rs.getString("email_from");
                Double probability = rs.getDouble("probability");
                int partner_id = rs.getInt("partner_id");
                String create_date = rs.getString("create_date"); // Cambiar por DATE
                int stage_id = rs.getInt("stage_id");
                int last_stage_id = rs.getInt("last_stage_id");
                int company_id = rs.getInt("company_id");
                int user_id = rs.getInt("user_id");
                String date_closed = rs.getString("date_closed"); // Cambiar por DATE
                String date_open = rs.getString("date_open"); // Cambiar por DATE
                String date_last_stage_update = rs.getString("date_last_stage_update"); // Cambiar por DATE
                String priority = rs.getString("priority");
                int job_id = rs.getInt("job_id");
                String salary_proposed_extra = rs.getString("salary_proposed_extra");
                String salary_expected_extra = rs.getString("salary_expected_extra");
                Double salary_proposed = rs.getDouble("salary_proposed");
                Double salary_expected = rs.getDouble("salary_expected");
                String availability = rs.getString("availability"); // Cambiar por DATE
                String partner_name = rs.getString("partner_name");
                String partner_phone = rs.getString("partner_phone");
                String partner_mobile = rs.getString("partner_mobile");
                int type_id = rs.getInt("type_id");
                int department_id = rs.getInt("department_id");
                Double delay_close = rs.getDouble("delay_close");
                int color = rs.getInt("color");
                int emp_id = rs.getInt("emp_id");
                String kanban_state = rs.getString("kanban_state");
                int create_uid = rs.getInt("create_uid");
                int write_uid = rs.getInt("write_uid");
                String write_date = rs.getString("write_date"); // Cambiar por DATE

                hr_applicant aplicantes = factory.hr_applicant(id, campaign_id, source_id, medium_id, email_cc, message_main_attachment_id, name, active, description, email_from, probability, partner_id, create_date, stage_id, last_stage_id, company_id, user_id, date_closed, date_open, date_last_stage_update, priority, job_id, salary_proposed_extra, salary_expected_extra, salary_proposed, salary_expected, availability, partner_name, partner_phone, partner_mobile, type_id, department_id, delay_close, color, emp_id, kanban_state, create_uid, write_uid, write_date);
                listaAspirantes.add(aplicantes);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                st.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return listaAspirantes;
    }

}