/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15;

import java.util.ArrayList;

/**
 *
 * @author nacho
 */
public class PruebaLegislador {
    
    
    public static void main(String[] args) {
        
         ArrayList<Legislador> gobierno = new ArrayList<>();
        
         gobierno.add(new Diputado(4, "cadiz", "popo", "pepe", "Sanchez"));
         gobierno.add(new Diputado(1, "malaga", "psoe", "lucas", "hernandez"));
         gobierno.add(new Diputado(2, "cordoba", "podem", "Antonio", "perez"));
         gobierno.add(new Senador(3, "sevilla", "pp", "ivan", "garcia"));
         gobierno.add(new Senador(4, "cadiz", "pp", "lucas", "Sanchez"));
         
         
         for (Legislador legislador : gobierno) {
             if(legislador instanceof Diputado){
                 System.out.println(((Diputado) legislador).getNumeroAsiento());
             
             }
             System.out.println(legislador.getCamaraEnQueTrabaja());
            
        }
         
         for (Legislador legislador : gobierno) {
             
             System.out.println(legislador.toString());
            
        }
        
        
    }
    
    
    
    
    
   
    
   
    
    
    
    
}
