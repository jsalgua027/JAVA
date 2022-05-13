/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nacho
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Naipe> barajaPoker = new ArrayList();
        
         for (int i = 0; i < 52; i++) {
            barajaPoker.add(new Naipe());
        }
        
        for (Naipe naipe : barajaPoker) {
            System.out.println(naipe);   
        }
        
        
        
    }
    
}
