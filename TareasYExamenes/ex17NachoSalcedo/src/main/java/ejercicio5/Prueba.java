/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author nacho
 */
public class Prueba {

    public static ArrayList<Precipitaciones> leerArchivoJSON2(String nombre){
        ArrayList<Precipitaciones> aux2 = new ArrayList<>();
        ObjectMapper mapeador = new ObjectMapper();

        try {
            aux2.addAll(mapeador.readValue(new File(nombre),
                    mapeador.getTypeFactory().constructCollectionType(ArrayList.class, ejercicio4.Precipitaciones.class)));

        } catch (IOException e) {
            e.printStackTrace();
        }

        return aux2;
    }
    public static void main(String[] args) {
        
        Map<String, String> precipitaciones = new TreeMap<>();
        
        precipitaciones= LecturaJSON.leerArchivoJSON("precipitacionesBadajoz.json");
        
        
        System.out.println(Collections.singletonList(precipitaciones));
      
        System.out.println("---------------------------USO DEL API STREAM-----------");
        
         ArrayList<ejercicio4.Precipitaciones> listaP = new ArrayList<>();
        listaP = ejercicio4.LecturaJSON.leerArchivoJSON("precipitacionesBadajoz.json");
        
     //   long contar =listaP.stream()
    //            .filter(f-> f.getFecha().contains(f.l))
        
        
    }
    
}
