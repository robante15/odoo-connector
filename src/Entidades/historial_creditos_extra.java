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
public class historial_creditos_extra {

    public historial_creditos_extra(int _id, int empresa_id, String fecha_compra, int cantidad_creditos, double total, int metodo_pago_id) {
        this._id = _id;
        this.empresa_id = empresa_id;
        this.fecha_compra = fecha_compra;
        this.cantidad_creditos = cantidad_creditos;
        this.total = total;
        this.metodo_pago_id = metodo_pago_id;
    }
    private int _id;
    private int empresa_id;
    private String fecha_compra;
    private int cantidad_creditos;
    private double total;
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

    public String getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(String fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public int getCantidad_creditos() {
        return cantidad_creditos;
    }

    public void setCantidad_creditos(int cantidad_creditos) {
        this.cantidad_creditos = cantidad_creditos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getMetodo_pago_id() {
        return metodo_pago_id;
    }

    public void setMetodo_pago_id(int metodo_pago_id) {
        this.metodo_pago_id = metodo_pago_id;
    }
}
