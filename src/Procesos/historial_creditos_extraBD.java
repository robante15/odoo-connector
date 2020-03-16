/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import Factory.Factory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Entidades.historial_creditos_extra;
import Entidades.informacion_bancaria;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class historial_creditos_extraBD {

    private static Factory factory;
    Connection conn = null;
    PreparedStatement st = null;
    ResultSet rs = null;

    String url = "34.70.88.224";
    String jdbc = "jdbc:postgresql://" + url + "/odoo-connector";
    String username = "postgres";
    String password = "B5ejuOkD4yCKLvAD";

    /*----------------------------------- Metodos de Guardado -----------------------------------*/
    public boolean guardarCreditosExtra(historial_creditos_extra historial_creditos_extra) {
        boolean flag = false;
        try {
            conn = DriverManager.getConnection(jdbc, username, password);
            String SQLQuery = "INSERT INTO public.historial_creditos_extra (empresa_id, fecha_compra, cantidad_creditos, total, metodo_pago_id) "
                    + "VALUES (?, ?, ?, ?, ?)";
            st = conn.prepareStatement(SQLQuery);

            Date today = Date.valueOf(LocalDate.now());

            //El setString sirve para saber que tipo de valor le va a pasar; el # sirve para saber de que posicion es, y lo otro es el valor que le va a pasar
            st.setInt(1, historial_creditos_extra.getEmpresa_id());
            st.setDate(2, today);
            st.setInt(3, historial_creditos_extra.getCantidad_creditos());
            st.setDouble(4, historial_creditos_extra.getTotal());
            st.setInt(5, historial_creditos_extra.getMetodo_pago_id());
            st.executeUpdate();
            flag = true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                st.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return flag;
    }

}
