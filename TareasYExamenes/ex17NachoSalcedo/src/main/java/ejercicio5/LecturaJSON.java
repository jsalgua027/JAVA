/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author nacho
 */
public class LecturaJSON {
    
    
     public static  Map<String, String> leerArchivoJSON(String nombre) {
        Map<String, String> datos = new TreeMap<>();
        ArrayList<Precipitaciones> aux = new ArrayList<>();
        ObjectMapper mapeador = new ObjectMapper();

        try {
            aux.addAll(mapeador.readValue(new File(nombre),
                    mapeador.getTypeFactory().constructCollectionType(ArrayList.class, ejercicio4.Precipitaciones.class)));

        } catch (IOException e) {
            e.printStackTrace();
        }
        for(Precipitaciones T : aux){
            
            if(datos.containsKey(T.getEstacionMeteorologica())){
                datos.put(T.getEstacionMeteorologica(),T.getProvincia()+1);
            }else{
                datos.put(T.getEstacionMeteorologica(), T.getProvincia());
            }
                
        }
        
        return datos;
    }
    
}
