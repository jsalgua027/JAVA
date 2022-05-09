/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JoseIgnacio
 */
public class Ej03 {

    /**
     * 3.- Realizar un programa que imprima 25 términos de la serie 15 - 30 - 60
     * - 120, etc. No se introducen valores por teclado.
     *
     */
    public static void main(String[] args) {

        final int VALOR_INICIAL = 15;
        final int MULTIPLICADOR = 2;
        final int TOTAL_VALORES = 25;

        int aux = VALOR_INICIAL;

        for (int i = 0; i <TOTAL_VALORES; i++) {
            System.out.println("resultado" +aux);
            aux *= MULTIPLICADOR ;
        }
    }

}
