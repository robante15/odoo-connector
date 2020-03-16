/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;


/**
 *
 * @author Usuario
 */
public class informacion_bancaria {

    public informacion_bancaria(int _id, String propietario, String numero_tarjeta, String tipo_tarjeta, String fecha_vencimiento, String codigo_seguridad, String direccion_tarjeta, int empresa_id) {
        this._id = _id;
        this.propietario = propietario;
        this.numero_tarjeta = numero_tarjeta;
        this.tipo_tarjeta = tipo_tarjeta;
        this.fecha_vencimiento = fecha_vencimiento;
        this.codigo_seguridad = codigo_seguridad;
        this.direccion_tarjeta = direccion_tarjeta;
        this.empresa_id = empresa_id;
    }
    private int _id;
    private String propietario;
    private String numero_tarjeta;
    private String tipo_tarjeta;
    private String fecha_vencimiento;
    private String codigo_seguridad;
    private String direccion_tarjeta;
    private int empresa_id;

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getNumero_tarjeta() {
        return numero_tarjeta;
    }

    public void setNumero_tarjeta(String numero_tarjeta) {
        this.numero_tarjeta = numero_tarjeta;
    }

    public String getTipo_tarjeta() {
        return tipo_tarjeta;
    }

    public void setTipo_tarjeta(String tipo_tarjeta) {
        this.tipo_tarjeta = tipo_tarjeta;
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public String getCodigo_seguridad() {
        return codigo_seguridad;
    }

    public void setCodigo_seguridad(String codigo_seguridad) {
        this.codigo_seguridad = codigo_seguridad;
    }

    public String getDireccion_tarjeta() {
        return direccion_tarjeta;
    }

    public void setDireccion_tarjeta(String direccion_tarjeta) {
        this.direccion_tarjeta = direccion_tarjeta;
    }

    public int getEmpresa_id() {
        return empresa_id;
    }

    public void setEmpresa_id(int empresa_id) {
        this.empresa_id = empresa_id;
    }
}
