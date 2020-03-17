/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import Entidades.Empresa;
import Factory.Factory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class EmpresaBD {

    private static Factory factory;
    Connection conn = null;
    PreparedStatement st = null;
    ResultSet rs = null;

    String url = "34.70.88.224";
    String jdbc = "jdbc:postgresql://" + url + "/odoo-connector";
    String username = "postgres";
    String password = "B5ejuOkD4yCKLvAD";

    /*-----------------------------------Metodos de Obtencion-----------------------------------*/
    public Empresa obtenerEmpresaByID(int _id) {
        Empresa empresa = null;
        factory = new Factory();
        try {
            conn = DriverManager.getConnection(jdbc, username, password);
            String SQLQuery = "SELECT * FROM public.empresa WHERE _id='" + _id + "'";
            st = conn.prepareStatement(SQLQuery);
            rs = st.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("_id");
                String nombre_empresa = rs.getString("nombre_empresa");
                String forma_juridica = rs.getString("forma_juridica");
                String fecha_constitucion = rs.getString("fecha_constitucion");
                String direccion = rs.getString("direccion");
                String correo = rs.getString("correo");
                String registro_legal = rs.getString("registro_legal");
                int telefono = rs.getInt("telefono");
                String dueno = rs.getString("dueno");
                String sector_actividad = rs.getString("sector_actividad");
                String resumen_negocio = rs.getString("resumen_negocio");
                int creditos_base = rs.getInt("creditos_base");
                int creditos_extra = rs.getInt("creditos_extra");
                int informacion_bancaria = rs.getInt("informacion_bancaria");
                String tipo_suscripcion = rs.getString("tipo_suscripcion");

                empresa = factory.empresa(id, nombre_empresa, forma_juridica, fecha_constitucion, direccion, correo, registro_legal, telefono, dueno, sector_actividad, resumen_negocio, creditos_base, creditos_extra, informacion_bancaria, tipo_suscripcion);

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
        return empresa;
    }

    public boolean agregarCreditosExtra(int _id, int cant_creditos) {
        boolean flag = false;
        try {
            conn = DriverManager.getConnection(jdbc, username, password);
            String SQLQuery = "UPDATE public.empresa SET creditos_extra = creditos_extra + " + cant_creditos + " WHERE _id = " + _id;

            // create the java mysql update preparedstatement
            st = conn.prepareStatement(SQLQuery);
            // execute the java preparedstatement
            st.executeUpdate();
            conn.close();
            flag = true;
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

        return flag;
    }

    public ArrayList<Empresa> obtenerListadoByEmpresa() {
        factory = new Factory();
        ArrayList<Empresa> listadoEmpresas = new ArrayList<Empresa>();
        try {
            conn = DriverManager.getConnection(jdbc, username, password);
            String SQLQuery = "SELECT * FROM public.empresa";
            st = conn.prepareStatement(SQLQuery);
            rs = st.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("_id");
                String nombre_empresa = rs.getString("nombre_empresa");
                String forma_juridica = rs.getString("forma_juridica");
                String fecha_constitucion = rs.getString("fecha_constitucion");
                String direccion = rs.getString("direccion");
                String correo = rs.getString("correo");
                String registro_legal = rs.getString("registro_legal");
                int telefono = rs.getInt("telefono");
                String dueno = rs.getString("dueno");
                String sector_actividad = rs.getString("sector_actividad");
                String resumen_negocio = rs.getString("resumen_negocio");
                int creditos_base = rs.getInt("creditos_base");
                int creditos_extra = rs.getInt("creditos_extra");
                int informacion_bancaria = rs.getInt("informacion_bancaria");
                String tipo_suscripcion = rs.getString("tipo_suscripcion");

                Empresa empresaObj = factory.empresa(id, nombre_empresa, forma_juridica, fecha_constitucion, direccion, correo, registro_legal, telefono, dueno, sector_actividad, resumen_negocio, creditos_base, creditos_extra, informacion_bancaria, tipo_suscripcion);
                listadoEmpresas.add(empresaObj);
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
        return listadoEmpresas;
    }

}
