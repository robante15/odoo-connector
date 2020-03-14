/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import Factory.Factory;
import GUI.InicioSesion;

/**
 *
 * @author Usuario
 */
public class Client {

    private static Factory factory;

    public static void main(String[] args) {
        factory = new Factory();
        InicioSesion form = factory.login();
        form.setVisible(true);

    }

}
