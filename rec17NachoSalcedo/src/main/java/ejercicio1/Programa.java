/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author nacho
 */
public class Programa {

//   public static  Map<String, String> leerArchivoJSON1( TreeMap<String, String> clase) {
//        Map<String,String> datos = new TreeMap<>();
//        ObjectMapper mapeador = new ObjectMapper();
//        mapeador.registerModule(new JavaTimeModule()); //para poder manejar fechas
//
//        try {
//            datos.addAll(mapeador.readValue(new File(nombre),
//                    mapeador.getTypeFactory().constructCollectionType(TreeMap.class, clase)));
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return datos;
//    }
     
    
    
    
    
    
    
    public static void main(String[] args) {
         ArrayList<Crucero> listaP = new ArrayList<>();
        listaP = LecturaJSON.leerArchivoJSON("cruceros.json");
        
        System.out.println(listaP.toString());
    }
    
}
