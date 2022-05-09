/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.diseno.clase.c.ej09;

/**
 *
 * @author JoseIgnacio
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        NIF prueba1= new NIF("12344568");
        System.out.println(prueba1.ToString());
        
        NIF prueba2= new NIF("58645239");
        System.out.println(prueba2.ToString());
        //prueba error
        NIF prueba3= new NIF("456");
        System.out.println(prueba3.ToString());
        
        //metodo contador
        
        System.out.println(prueba1.getContador());
    }
    
}
