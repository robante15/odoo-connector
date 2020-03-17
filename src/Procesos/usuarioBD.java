/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import Entidades.Usuario;
import Factory.Factory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class usuarioBD {

    private static Factory factory;
    Connection conn = null;
    PreparedStatement st = null;
    ResultSet rs = null;

    String url = "34.70.88.224";
    String jdbc = "jdbc:postgresql://" + url + "/odoo-connector";
    String username = "postgres";
    String password = "B5ejuOkD4yCKLvAD";

    /*----------------------------------- Metodos de Guardado -----------------------------------*/
    public boolean registrarUsuarioNuevo(Usuario usuario) {
        boolean flag = false;
        try {
            conn = DriverManager.getConnection(jdbc, username, password);
            String SQLQuery = "INSERT INTO public.usuarios (nombres, apellidos, empresa, usuario, contrasena, correo, telefono, cod_empleado, rol) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            st = conn.prepareStatement(SQLQuery);

            //El setString sirve para saber que tipo de valor le va a pasar; el # sirve para saber de que posicion es, y lo otro es el valor que le va a pasar
            st.setString(1, usuario.getNombres());
            st.setString(2, usuario.getApellidos());
            st.setInt(3, usuario.getEmpresa());
            st.setString(4, usuario.getUsuario());
            st.setString(5, usuario.getContrasena());
            st.setString(6, usuario.getCorreo());
            st.setInt(7, usuario.getTelefono());
            st.setInt(8, usuario.getCodEmpleado());
            st.setString(9, usuario.getRol());
            int retornado = st.executeUpdate();
            System.out.println(retornado);
            if (retornado == 1) {
                flag = true;
            } else {
                flag = false;
            }
        } catch (SQLException ex) {
            flag = false;
            ex.printStackTrace();
        } finally {
            try {
                st.close();
            } catch (SQLException ex) {
                flag = false;
                ex.printStackTrace();
            }
        }
        return flag;
    }

}
