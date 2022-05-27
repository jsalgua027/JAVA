/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author nacho
 */
public class LecturaJSON {
    
    public static ArrayList<Crucero> leerArchivoJSON(String nombre){
        ArrayList<Crucero> aux = new ArrayList<>();
        ObjectMapper mapeador = new ObjectMapper();

        try {
            aux.addAll(mapeador.readValue(new File(nombre),
                    mapeador.getTypeFactory().constructCollectionType(ArrayList.class, Crucero.class)));

        } catch (IOException e) {
            e.printStackTrace();
        }

        return aux;
    }
    
    
}
