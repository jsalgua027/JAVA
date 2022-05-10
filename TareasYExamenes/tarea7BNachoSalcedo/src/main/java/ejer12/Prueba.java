/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer12;

import ejer11.App;
import java.util.List;

/**
 *
 * @author JoseIgnacio
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         List<App> appList = Lectura.leecturaFicheroXML("appXML");

        appList.forEach(System.out::println);
    }
    
}
