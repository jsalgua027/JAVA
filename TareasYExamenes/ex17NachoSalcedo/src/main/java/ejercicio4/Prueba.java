/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.ArrayList;

/**
 *
 * @author nacho
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ArrayList<Precipitaciones> listaP = new ArrayList<>();
        listaP = LecturaJSON.leerArchivoJSON("precipitacionesBadajoz.json");
        
        System.out.println(listaP.toString());
    }
    
}
