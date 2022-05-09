/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tema5.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Ej13 {

    /**
     * Escribir un programa que lea números enteros entre 1 y 20 desde teclado.
     * Se debe generar un histograma con las frecuencias de cada entero en la
     * secuencia. Para representar las barras del histograma hay que utilizar
     * secuencias del carácter ‘*’. El programa finaliza al introducir un cero.
     * Por ejemplo, la secuencia: 1, 1, 20, 1, 2, 20, 3, 3, 3, 4, 4, 4, 5, 3
     * generaría la siguiente salida: 1: *** 2: * 3: **** 4: *** 5: 6: 7: …
     * 20:**
     *
     *
     *
     *
     *
     */
    public static void main(String[] args) {
        int numero = -1;
        Scanner sc = new Scanner(System.in);
        int[] array = new int[20];

        do {
            try {
                System.out.println("Introduce un valor entre 1 y 20 , 0 para terminar");
                numero = sc.nextInt();

            } catch (InputMismatchException ime) {
                System.out.println("Introduce solo numeros");
            }
            try {
                array[numero - 1] = array[numero - 1] + 1;

            } catch (ArrayIndexOutOfBoundsException aioobe) {
                System.out.println("El numero debe estar entre 1 y 20");

            }

        } while (numero != 0);
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + ":");
            for (int j = 0; j < array[i]; j++) {
                System.out.println("*");
            }
            System.out.println("\n");
        }

    }

}
