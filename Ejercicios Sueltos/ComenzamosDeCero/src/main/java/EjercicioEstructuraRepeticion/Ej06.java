/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioEstructuraRepeticion;

import java.util.Scanner;

/**
 *
 * @author JoseIgnacio
 */
public class Ej06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int sumando = 1;
        

        System.out.println("Diga cuanta veces quiere que se cuente");
        int totalVeces = teclado.nextInt();
        int valorInicial = 0;
        for (int i = 0; i <= totalVeces; i++) {
            System.out.println(valorInicial);
            valorInicial = valorInicial + 1;
        }

    }

}
