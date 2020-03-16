/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import Entidades.informacion_bancaria;
import Factory.Factory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class informacion_bancariaBD {

    private static Factory factory;
    Connection conn = null;
    PreparedStatement st = null;
    ResultSet rs = null;

    String url = "34.70.88.224";
    String jdbc = "jdbc:postgresql://" + url + "/odoo-connector";
    String username = "postgres";
    String password = "B5ejuOkD4yCKLvAD";

    /*----------------------------------- Metodos de Guardado -----------------------------------*/
    public void insertarInformacionBancaria(informacion_bancaria informacion_bancaria) {
        try {
            conn = DriverManager.getConnection(jdbc, username, password);
            String SQLQuery = "INSERT INTO public.informacion_bancaria (propietario, numero_tarjeta, tipo_tarjeta, fecha_vencimiento, codigo_seguridad, direccion_tarjeta, empresa_id) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?)";
            st = conn.prepareStatement(SQLQuery);
            
            Date date = Date.valueOf(informacion_bancaria.getFecha_vencimiento() + "-01");

            //El setString sirve para saber que tipo de valor le va a pasar; el # sirve para saber de que posicion es, y lo otro es el valor que le va a pasar

            st.setString(1, informacion_bancaria.getPropietario());
            st.setString(2, informacion_bancaria.getNumero_tarjeta());
            st.setString(3, informacion_bancaria.getTipo_tarjeta());
            st.setDate(4, date);
            st.setString(5, informacion_bancaria.getCodigo_seguridad());
            st.setString(6, informacion_bancaria.getDireccion_tarjeta());
            st.setInt(7, informacion_bancaria.getEmpresa_id());
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Nuevo registro agregado correctamente");
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                st.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    /*----------------------------------- Metodos de Obtención -----------------------------------*/
    public informacion_bancaria obtenerInformacionBancariaByID(int id) {
        informacion_bancaria infoBanc = null;
        factory = new Factory();
        try {
            conn = DriverManager.getConnection(jdbc, username, password);
            String SQLQuery = "SELECT * FROM public.informacion_bancaria WHERE _id='" + id + "'";
            st = conn.prepareStatement(SQLQuery);
            rs = st.executeQuery();

            while (rs.next()) {
                int _id = rs.getInt("_id");
                String propietario = rs.getString("propietario");
                String numero_tarjeta = rs.getString("numero_tarjeta");
                String tipo_tarjeta = rs.getString("tipo_tarjeta");
                String fecha_vencimiento = rs.getString("fecha_vencimiento");
                String codigo_seguridad = rs.getString("codigo_seguridad");
                String direccion_tarjeta = rs.getString("direccion_tarjeta");
                int empresa_id = rs.getInt("empresa_id");

                infoBanc = factory.informacion_bancaria(_id, propietario, numero_tarjeta, tipo_tarjeta, fecha_vencimiento, codigo_seguridad, direccion_tarjeta, empresa_id);

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
        return infoBanc;
    }

    public ArrayList<informacion_bancaria> obtenerListadoByEmpresa(int empresa_ID) {
        factory = new Factory();
        ArrayList<informacion_bancaria> listaTarjetas = new ArrayList<informacion_bancaria>();
        try {
            conn = DriverManager.getConnection(jdbc, username, password);
            String SQLQuery = "SELECT * FROM public.informacion_bancaria WHERE empresa_id='" + empresa_ID + "'";
            st = conn.prepareStatement(SQLQuery);
            rs = st.executeQuery();

            while (rs.next()) {
                int _id = rs.getInt("_id");
                String propietario = rs.getString("propietario");
                String numero_tarjeta = rs.getString("numero_tarjeta");
                String tipo_tarjeta = rs.getString("tipo_tarjeta");
                String fecha_vencimiento = rs.getString("fecha_vencimiento");
                String codigo_seguridad = rs.getString("codigo_seguridad");
                String direccion_tarjeta = rs.getString("direccion_tarjeta");
                int empresa_id = rs.getInt("empresa_id");

                informacion_bancaria tarjeta = factory.informacion_bancaria(_id, propietario, numero_tarjeta, tipo_tarjeta, fecha_vencimiento, codigo_seguridad, direccion_tarjeta, empresa_id);
                listaTarjetas.add(tarjeta);
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
        return listaTarjetas;
    }

}
