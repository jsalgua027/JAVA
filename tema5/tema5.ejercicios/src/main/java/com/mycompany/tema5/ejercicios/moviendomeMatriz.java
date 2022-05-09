/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tema5.ejercicios;

import java.util.Random;

/**
 *
 * @author nacho
 */
public class moviendomeMatriz {

    public static void recorrerFila(int fila, int[][] aux) {

        if (fila < aux.length && fila >= 0) {
            for (int j = 0; j < aux[fila].length; j++) {
                System.out.print("-" + aux[fila][j]);
            }

        }

    }

    public static void imprimirMatriz(int[][] aux) {
        for (int i = 0; i < aux.length; i++) {
            System.out.println();
            for (int j = 0; j < aux[i].length; j++) {
                System.out.print(" -  " + aux[i][j]);
            }
        }

    }

    public static void recorrercolumna(int columna, int[][] aux) {

        if (columna <= aux[0].length && columna >= 0) {
            for (int i = 0; i < aux.length; i++) {
                System.out.print(" - " + aux[i][columna]);
            }
        }
    }

    public static void posicionesVecinas(int fila, int columna, int[][] aux) {

        if (fila < aux.length && fila >= 0) {

            if (columna < aux[0].length && columna >= 0) {

                for (int i = fila - 1; i <= fila + 1; i++) {
                    if (i < aux.length && i >= 0) {

                        for (int j = columna - 1; j <= columna + 1; j++) {
                            if (j < aux[i].length && j >= 0) {
                                System.out.println("la vecina es " + aux[i][j]);
                            }
                        }

                    }
                }

            }

        }

    }

    public static void main(String[] args) {
        Random teclado = new Random();
        int[][] primeraMatriz = new int[3][3];

        for (int i = 0; i < primeraMatriz.length; i++) {
            for (int j = 0; j < primeraMatriz[i].length; j++) {
                primeraMatriz[i][j] = teclado.nextInt(50 - 1 + 1) + 1;

            }

        }
        imprimirMatriz(primeraMatriz);

        System.out.println("\n-----------------------metodo recorrer fila------------");

        recorrerFila(1, primeraMatriz);
        System.out.println("\n---------------------------metodo recorrer columna------------");

        recorrercolumna(1, primeraMatriz);

        System.out.println("\n-------------------metodo de posiciones vecinas----------------");
         posicionesVecinas(0, 0, primeraMatriz);

    }

}
