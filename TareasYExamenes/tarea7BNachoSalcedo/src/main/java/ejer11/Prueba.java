/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer11;

import java.util.ArrayList;
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
        List<App> listaAplicaciones = new ArrayList();

        for (int i = 0; i < 50; i++) {
            listaAplicaciones.add(new App());
        }

        for (App listaAplicacione : listaAplicaciones) {
            System.out.println(listaAplicacione.toString());
        }
        // otra forma de imprimir 
        //listaAplicaciones.forEach(System.out::println);
        
        
        
         //Guarda los datos de todas las App de la lista, en un fichero de texto llamado aplicacionestxt.txt, dentro del directorio “./appstxt”.
        Escritura.escribirFichero("appstxt",listaAplicaciones);

        //Guarda los datos de todas las App de la lista, en un fichero XML llamado aplicacionesxml.xml, dentro del directorio “./appsxml”.
        Escritura.escribirFicheroJSON("appJSON",listaAplicaciones);

        //Guarda los datos de todas las App de la lista, en un fichero JSON llamado aplicacionesxml.json, dentro del directorio “./appsjson”.
        Escritura.escribirFicheroXML("appXML",listaAplicaciones);
        
    }

}
