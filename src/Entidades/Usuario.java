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
public class Usuario {

    private int _id;
    private String nombres;
    private String apellidos;
    private int empresa;
    private String usuario;
    private String contrasena;
    private String correo;
    private int telefono;
    private int codEmpleado;
    private String rol;

    public Usuario(int _id, String nombres, String apellidos, int empresa, String usuario, String contrasena, String correo, int telefono, int codEmpleado, String rol) {
        this._id = _id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.empresa = empresa;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.correo = correo;
        this.telefono = telefono;
        this.codEmpleado = codEmpleado;
        this.rol = rol;
    }

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEmpresa() {
        return this.empresa;
    }

    public void setEmpresa(int empresa) {
        this.empresa = empresa;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(int codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

}
