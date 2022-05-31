/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerci1_exa27mayo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 *
 * @author nacho
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    
    public  static Map<String, ArrayList<String>> ordenarLista(ArrayList<Crucero> cruceros){
        Map<String, ArrayList<String>> aux =  new TreeMap<>();
        
        for (Crucero crucero : LecturaJSO.leerArchivoJSON("cruceros.json")) {
            crucero.getNombre();
            crucero.getDestinos();
            aux.put(crucero.getNombre(), crucero.getDestinos());
            
        }
        
        
        return aux;
        
        
//        public static void ordenarPorNombre(ArrayList<Crucero>aux){
//            
//            Comparator <Crucero> comparador = 
//                    Comparator.comparing()
//
//            aux.stream()
//                    .sorted(c1, c2) -> Double.compare(c1. 0)
//            
//        } 
        
        
        
    }
    
    
    
    public static void main(String[] args) {
        
        
         ArrayList<Crucero> listaP = new ArrayList<>();
        listaP = LecturaJSO.leerArchivoJSON("cruceros.json");
        
        System.out.println(listaP.toString());
        
       
        System.out.println( ordenarLista(listaP));
    }
    
}
