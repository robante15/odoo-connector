/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import Factory.Factory;
import GUI.InicioSesion;
import Procesos.BaseDatos;
import org.mindrot.jbcrypt.*;

/**
 *
 * @author Usuario
 */
public class Client {

    public static String hashPassword(String password_plaintext) {
        String salt = BCrypt.gensalt(12);
        String hashed_password = BCrypt.hashpw(password_plaintext, salt);

        return (hashed_password);
    }

    private static Factory factory;

    public static void main(String[] args) {
        factory = new Factory();
        InicioSesion form = factory.login();
        form.setVisible(true);

    }

}
