/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author roban
 */
public class Empresa {

    public Empresa(int id, String nombre_empresa, String forma_juridica, String fecha_constitucion, String direccion, String correo, String registro_legal, int telefono, String dueno, String sector_actividad, String resumen_negocio, int creditos_base, int creditos_extra, int informacion_bancaria, String tipo_suscripcion) {
        this.id = id;
        this.nombre_empresa = nombre_empresa;
        this.forma_juridica = forma_juridica;
        this.fecha_constitucion = fecha_constitucion;
        this.direccion = direccion;
        this.correo = correo;
        this.registro_legal = registro_legal;
        this.telefono = telefono;
        this.dueno = dueno;
        this.sector_actividad = sector_actividad;
        this.resumen_negocio = resumen_negocio;
        this.creditos_base = creditos_base;
        this.creditos_extra = creditos_extra;
        this.informacion_bancaria = informacion_bancaria;
        this.tipo_suscripcion = tipo_suscripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getForma_juridica() {
        return forma_juridica;
    }

    public void setForma_juridica(String forma_juridica) {
        this.forma_juridica = forma_juridica;
    }

    public String getFecha_constitucion() {
        return fecha_constitucion;
    }

    public void setFecha_constitucion(String fecha_constitucion) {
        this.fecha_constitucion = fecha_constitucion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRegistro_legal() {
        return registro_legal;
    }

    public void setRegistro_legal(String registro_legal) {
        this.registro_legal = registro_legal;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public String getSector_actividad() {
        return sector_actividad;
    }

    public void setSector_actividad(String sector_actividad) {
        this.sector_actividad = sector_actividad;
    }

    public String getResumen_negocio() {
        return resumen_negocio;
    }

    public void setResumen_negocio(String resumen_negocio) {
        this.resumen_negocio = resumen_negocio;
    }

    public int getCreditos_base() {
        return creditos_base;
    }

    public void setCreditos_base(int creditos_base) {
        this.creditos_base = creditos_base;
    }

    public int getCreditos_extra() {
        return creditos_extra;
    }

    public void setCreditos_extra(int creditos_extra) {
        this.creditos_extra = creditos_extra;
    }

    public int getInformacion_bancaria() {
        return informacion_bancaria;
    }

    public void setInformacion_bancaria(int informacion_bancaria) {
        this.informacion_bancaria = informacion_bancaria;
    }

    public String getTipo_suscripcion() {
        return tipo_suscripcion;
    }

    public void setTipo_suscripcion(String tipo_suscripcion) {
        this.tipo_suscripcion = tipo_suscripcion;
    }
    private int id;
    private String nombre_empresa;
    private String forma_juridica;
    private String fecha_constitucion;
    private String direccion;
    private String correo;
    private String registro_legal;
    private int telefono;
    private String dueno;
    private String sector_actividad;
    private String resumen_negocio;
    private int creditos_base;
    private int creditos_extra;
    private int informacion_bancaria;
    private String tipo_suscripcion;

}
