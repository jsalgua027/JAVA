/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author nacho
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo t = new Vehiculo(Long.MAX_VALUE, "1545df", "seat", "arona", "azul", 10000, true);
        
        t.nacho();
        t = new Furgoneta(25, 10, Long.MAX_VALUE, "1545df", "seat", "arona", "azul", 10000, true);
        t.nacho();
        
        

    }

}
