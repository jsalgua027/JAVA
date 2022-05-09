/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tema5.ejercicios;

/**
 *
 * @author JoseIgnacio
 */
public class Ej012 {

    /**
     *
     * Declara e inicializa una matriz de caracteres de 2x3, con los valores que
     * tú quieras. Implementa un método, en la misma clase que el método main(),
     * que reciba una matriz de caracteres y la imprima por consola.
     *
     */
    public  static void imprimirMatriz(int[][] aux) {
        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux[i].length; j++) {
                System.out.println(aux[i][j]);
            }
        }

    }

    public static void main(String[] args) {

        int[][] primeraMatriz = new int[2][3];
        primeraMatriz[0][0] = 1;
        primeraMatriz[0][1] = 2;
        primeraMatriz[0][2] = 3;
        primeraMatriz[1][0] = 4;
        primeraMatriz[1][1] = 5;
        primeraMatriz[1][2] = 6;

        for (int i = 0; i < primeraMatriz.length; i++) {
            System.out.println();
            for (int j = 0; j < primeraMatriz[i].length; j++) {
                System.out.print(primeraMatriz[i][j]);
            }
        }

    }

}
