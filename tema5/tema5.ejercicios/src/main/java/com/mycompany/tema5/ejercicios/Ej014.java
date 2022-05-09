/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tema5.ejercicios;

import java.util.Random;

/**
 *
 * @author JoseIgnacio
 */
public class Ej014 {

    /**
     * Escribe un programa que dada una matriz de 3x3 enteros y realice las
     * siguientes funciones:
     *
     * Rellenar aleatoriamente todas las casillas de la matriz con números
     * enteros entre 1 y 100 Calcular la media de todos los valores Calcular el
     * valor mínimo y el máximo de todos los valores
     *
     *
     */
    public static void main(String[] args) {
        int totalValores = 0;
        double mediaValores = 0;

        Random num = new Random();

        int[][] matriz2D = new int[3][3];

        for (int i = 0; i < matriz2D.length; i++) {
            for (int j = 0; j < matriz2D[i].length; j++) {
                matriz2D[i][j] = num.nextInt(100 - 1 + 1) + 1;

                totalValores += matriz2D[i][j];
            }
        }

        int minimo = matriz2D[0][0];
        int maximo = matriz2D[0][0];

        System.out.println("La suma de todos los valores es= " + totalValores);
        for (int i = 0; i < matriz2D.length; i++) {
            System.out.println();
            for (int j = 0; j < matriz2D[i].length; j++) {
                System.out.print(" " + matriz2D[i][j]);
            }

        }
        mediaValores = totalValores / 9;
        System.out.println("\nLa media del total de valores es= " + mediaValores);

        for (int i = 0; i < matriz2D.length; i++) {
            for (int j = 0; j < matriz2D[i].length; j++) {

                if (minimo > matriz2D[i][j]) {
                    minimo = matriz2D[i][j];
                }
                if (maximo < matriz2D[i][j]) {
                    maximo = matriz2D[i][j];
                }
            }
        }
        System.out.println("El valor maximo de la matriz2D es = " + maximo + "\n el valor mínimo de la matriz2D es = " + minimo);
    }

}
