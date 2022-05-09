/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosEstructuraControl;

/**
 *
 * @author JoseIgnacio
 */
public class Ej03 {

    /**
     * Qué devuelven estas expresiones?
     */
    public static void main(String[] args) {
        //a)    
        boolean unaCondicion = true;
        //  resultado = unaCondicion ? valor1 : valor2;
        // devolveria true
        //b)
        int x = 10;
        int y = (x > 9) ? 100 : 200;
        // devolveria  true

        //c
        int publico = 19500;
        int vendidas = 19000;
        int aforo = 2000;
        String status = (publico < aforo) ? "Cabe mas gente" : (vendidas < aforo) ? "Aun no hemos vendido todo" : "Esta todo vendido";
        //delvolveria false
    }

}
