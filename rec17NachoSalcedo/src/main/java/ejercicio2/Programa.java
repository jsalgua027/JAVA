/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author nacho
 */
public class Programa {
     
//    public ArrayList<Municipio> generarficheros(ArrayList<Municipio> aux){
//         String idFichero = "nuevoArchivo.csv";
//        String tmp;
//        
//        // Array a escribir
//        ArrayList<Municipio> aux = new ArrayList<>();
//        
//        
//        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {
//            
//                for (int i = 0; i < aux.size(); i++) {
//                    tmp= String.valueOf(aux.size());
//                    
//                
//            }
//            
//                // Metodo newLine() añade salto de línea después de cada fila
//                flujo.newLine();
//            }
//            // Metodo fluh() guarda cambios en disco 
//            flujo.flush();
//            System.out.println("Fichero " + idFichero + " creado correctamente.");
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//       
//        
//        
//        
//        
//    }
    
    
    public static void main(String[] args) {
        
        ArrayList<Municipio> listaMunicipios = new ArrayList<>();
        
        listaMunicipios= LecturaCSV.leerArchivo("indicator.csv");
        
        
        System.out.println(listaMunicipios);
        
    }
    
}
