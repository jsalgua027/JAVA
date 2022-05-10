/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer13;

import ejer11.App;
import java.util.ArrayList;

/**
 *
 * @author JoseIgnacio
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<App> appList = Lectura.leerArchivoJSON("appJSON");
        appList.forEach(System.out::println);
    }
    
}
