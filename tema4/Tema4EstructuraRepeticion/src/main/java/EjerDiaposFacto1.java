/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JoseIgnacio
 */
public class EjerDiaposFacto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 5; // para calcular 5!
        int factorial = 1;
        int i = 1; // valor inicial de i es 1
        while (i <= n) {
            factorial = factorial * i;
            i++;
        }
        System.out.println("El factorial de " + n + " es " + factorial);
    }

}
