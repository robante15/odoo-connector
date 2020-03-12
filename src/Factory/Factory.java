/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import GUI.*;
import Procesos.BaseDatos;
import Entidades.*;

/**
 *
 * @author Usuario
 */
public class Factory {

    public BaseDatos baseDatos() {
        return new BaseDatos();
    }

    /*----------------------------ENTIDADES------------------------------*/
    public hr_applicant hr_applicant(int id, int campaign_id, int source_id, int medium_id, String email_cc, int message_main_attachment_id, String name, boolean active, String description, String email_from, Double probability, int partner_id, String create_date, int stage_id, int last_stage_id, int company_id, int user_id, String date_closed, String date_open, String date_last_stage_update, String priority, int job_id, String salary_proposed_extra, String salary_expected_extra, Double salary_proposed, Double salary_expected, String availability, String partner_name, String partner_phone, String partner_mobile, int type_id, int department_id, Double delay_close, int color, int emp_id, String kanban_state, int create_uid, int write_uid, String write_date) {
        return new hr_applicant(id, campaign_id, source_id, medium_id, email_cc, message_main_attachment_id, name, active, description, email_from, probability, partner_id, create_date, stage_id, last_stage_id, company_id, user_id, date_closed, date_open, date_last_stage_update, priority, job_id, salary_proposed_extra, salary_expected_extra, salary_proposed, salary_expected, availability, partner_name, partner_phone, partner_mobile, type_id, department_id, delay_close, color, emp_id, kanban_state, create_uid, write_uid, write_date);
    }

    /*----------------------CARGA DE LAS GUI-----------------------------*/
    public InicioSesion login() {
        return new InicioSesion();
    }

    public Principal principal() {
        return new Principal();
    }
}
