/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4.diseno.clases.c.ej08;

/**
 *
 * @author nacho
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cafetera c1 = new Cafetera(8);
        Cafetera c2 = new Cafetera();
        Cafetera c3 = new Cafetera(100,200);
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        
        
        c2.llenarCafetera();
        System.out.println(c2);
        c2.servirTaza(500);
        System.out.println(c2);
        c2.servirTaza(502);
        System.out.println(c2);
        
    }

}
