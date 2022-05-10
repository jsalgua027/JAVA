/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer13;

import com.fasterxml.jackson.databind.ObjectMapper;
import ejer11.App;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author JoseIgnacio
 */
public class Lectura {
    
      public static ArrayList<App> leerArchivoJSON(String nombre){
        ArrayList<App> apps = new ArrayList<>();
        ObjectMapper mapeador = new ObjectMapper();

        try {
            apps.addAll(mapeador.readValue(new File(nombre),
                    mapeador.getTypeFactory().constructCollectionType(ArrayList.class, App.class)));

        } catch (IOException e) {
            e.printStackTrace();
        }

        return apps;
    }
    
}
