/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Usuario
 */
public class historial_suscripcion {

    public historial_suscripcion(int _id, int empresa_id, String fecha_inicio, String fecha_final, String tipo_suscripcion, Double total, int metodo_pago_id) {
        this._id = _id;
        this.empresa_id = empresa_id;
        this.fecha_inicio = fecha_inicio;
        this.fecha_final = fecha_final;
        this.tipo_suscripcion = tipo_suscripcion;
        this.total = total;
        this.metodo_pago_id = metodo_pago_id;
    }

    private int _id;
    private int empresa_id;
    private String fecha_inicio;
    private String fecha_final;
    private String tipo_suscripcion;
    private Double total;
    private int metodo_pago_id;

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public int getEmpresa_id() {
        return empresa_id;
    }

    public void setEmpresa_id(int empresa_id) {
        this.empresa_id = empresa_id;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_final() {
        return fecha_final;
    }

    public void setFecha_final(String fecha_final) {
        this.fecha_final = fecha_final;
    }

    public String getTipo_suscripcion() {
        return tipo_suscripcion;
    }

    public void setTipo_suscripcion(String tipo_suscripcion) {
        this.tipo_suscripcion = tipo_suscripcion;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public int getMetodo_pago_id() {
        return metodo_pago_id;
    }

    public void setMetodo_pago_id(int metodo_pago_id) {
        this.metodo_pago_id = metodo_pago_id;
    }
}
