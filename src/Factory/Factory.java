/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import GUI.*;
import Procesos.BaseDatos;
import Procesos.EmpresaBD;
import Entidades.*;
import Procesos.historial_creditos_extraBD;
import Procesos.informacion_bancariaBD;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Factory {

    public BaseDatos baseDatos() {
        return new BaseDatos();
    }

    public EmpresaBD empresaBD() {
        return new EmpresaBD();
    }

    public informacion_bancariaBD informacion_bancariaBD() {
        return new informacion_bancariaBD();
    }

    public historial_creditos_extraBD historial_creditos_extraBD() {
        return new historial_creditos_extraBD();
    }

    /*----------------------------ENTIDADES------------------------------*/
    public hr_applicant hr_applicant(int id, int campaign_id, int source_id, int medium_id, String email_cc, int message_main_attachment_id, String name, boolean active, String description, String email_from, Double probability, int partner_id, String create_date, int stage_id, int last_stage_id, int company_id, int user_id, String date_closed, String date_open, String date_last_stage_update, String priority, int job_id, String salary_proposed_extra, String salary_expected_extra, Double salary_proposed, Double salary_expected, String availability, String partner_name, String partner_phone, String partner_mobile, int type_id, int department_id, Double delay_close, int color, int emp_id, String kanban_state, int create_uid, int write_uid, String write_date) {
        return new hr_applicant(id, campaign_id, source_id, medium_id, email_cc, message_main_attachment_id, name, active, description, email_from, probability, partner_id, create_date, stage_id, last_stage_id, company_id, user_id, date_closed, date_open, date_last_stage_update, priority, job_id, salary_proposed_extra, salary_expected_extra, salary_proposed, salary_expected, availability, partner_name, partner_phone, partner_mobile, type_id, department_id, delay_close, color, emp_id, kanban_state, create_uid, write_uid, write_date);
    }

    public hr_job hr_job(int id, int message_main_attachment_id, String name, int expected_employees, int no_if_employee, int no_of_recruitment, int no_of_hired_employee, String description, String requirements, int department_id, String state, int create_uid, String create_date, int write_uid, String write_date, int address_id, int manager_id, int user_id, int hr_responsible_id, int alias_id, int color) {
        return new hr_job(id, message_main_attachment_id, name, expected_employees, no_if_employee, no_of_recruitment, no_of_hired_employee, description, requirements, department_id, state, create_uid, create_date, write_uid, write_date, address_id, manager_id, user_id, hr_responsible_id, alias_id, color);
    }

    public Usuario usuario(int _id, String nombres, String apellidos, int empresa, String usuario, String contrasena, String correo, int telefono, int codEmpleado, String rol) {
        return new Usuario(_id, nombres, apellidos, empresa, usuario, contrasena, correo, telefono, codEmpleado, rol);
    }

    public Empresa empresa(int id, String nombre_empresa, String forma_juridica, String fecha_constitucion, String direccion, String correo, String registro_legal, int telefono, String dueno, String sector_actividad, String resumen_negocio, int creditos_base, int creditos_extra, int informacion_bancaria, String tipo_suscripcion) {
        return new Empresa(id, nombre_empresa, forma_juridica, fecha_constitucion, direccion, correo, registro_legal, telefono, dueno, sector_actividad, resumen_negocio, creditos_base, creditos_extra, informacion_bancaria, tipo_suscripcion);
    }

    public informacion_bancaria informacion_bancaria(int _id, String propietario, String numero_tarjeta, String tipo_tarjeta, String fecha_vencimiento, String codigo_seguridad, String direccion_tarjeta, int empresa_id) {
        return new informacion_bancaria(_id, propietario, numero_tarjeta, tipo_tarjeta, fecha_vencimiento, codigo_seguridad, direccion_tarjeta, empresa_id);
    }

    public historial_creditos_extra historial_creditos_extra(int _id, int empresa_id, String fecha_compra, int cantidad_creditos, double total, int metodo_pago_id) {
        return new historial_creditos_extra(_id, empresa_id, fecha_compra, cantidad_creditos, total, metodo_pago_id);
    }

    /*----------------------CARGA DE LAS GUI-----------------------------*/
    public InicioSesion login() {
        return new InicioSesion();
    }

    public Principal principal(Usuario usuario) {
        return new Principal(usuario);
    }

    public RegistroUsuario reg_user() {
        return new RegistroUsuario();
    }

    public RegistroEmpresa reg_empre() {
        return new RegistroEmpresa();
    }

    public PerfilSolicitud perfilSolicitud() {
        return new PerfilSolicitud();
    }

    public CompraCreditos compraCreditos(Empresa empresaObj) {
        return new CompraCreditos(empresaObj);
    }

}
