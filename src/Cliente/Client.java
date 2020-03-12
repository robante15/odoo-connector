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

    public static int a = 15;

    private static Factory factory;

    public static void main(String[] args) {
        factory = new Factory();
        InicioSesion form = factory.login();
        form.setVisible(true);

    }

}
