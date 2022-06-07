/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerci1_exa27mayo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
    public static Map<String, ArrayList<String>> ordenarLista(ArrayList<Crucero> cruceros) {
        Map<String, ArrayList<String>> aux = new TreeMap<>();

        for (Crucero crucero :cruceros) {
            
            aux.put(crucero.getNombre(), crucero.getDestinos());

        }

        return aux;

    }

    //MÉTODO QUE ORDENA POR PRECIO Y POR NOMBRE
    public static void ordenarPrecioNombre(ArrayList<Crucero> lista) {

        Comparator<Crucero> comparador = Comparator.comparing(Crucero::getPrecio).thenComparing(Comparator.comparing(Crucero::getNombre));
        Collections.sort(lista, comparador);

    }

    public static void main(String[] args) {

        ArrayList<Crucero> listaP = new ArrayList<>();
        Map<String,ArrayList<String>> auxmap = new TreeMap<>();
        listaP = LecturaJSO.leerArchivoJSON("cruceros.json");
        //imprimo la lista
        for (Crucero crucero : listaP) {
            System.out.println(crucero.toString()+"\n");
        }
        
       // imprimo la lista ordenada
         ordenarPrecioNombre(listaP);
         
        for (Crucero crucero : listaP) {
            System.out.println(crucero);
        }
       
        System.out.println("-----------------------LISTA MAP--------------------");
        
       auxmap= ordenarLista(listaP);
            
       auxmap.forEach((k,v) -> System.out.println(k +"->" + v));
       
        for (Map.Entry<String, ArrayList<String>> entry : auxmap.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            
        }
        
        
    }

}
