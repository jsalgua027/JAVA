/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioEstructuraRepeticion;

/**
 *
 * @author JoseIgnacio
 */
public class Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 1;

        while (numero < 11) {
            System.out.println("Número: " + numero);
            numero++;
        }
        do {
            System.out.println("Número: " + --numero);
        } while (numero > 1);

    }

}
