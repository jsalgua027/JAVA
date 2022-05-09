/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tema5.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 * En el programa del ejercicio 4, incluir un método llamado ordenarBubble(int[]
 * arrayOrdenar) para ordenar el array que se le pase, usando el método bubble
 * sort que hay en los apuntes.
 *
 * @author nacho
 */
public class Ej04Y09 {

    public static void ordenarBubble(int[] array) {
        int tmp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j > array.length; j++) {
                if (array[i] > array[j]) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        //usando busqueda secuencial
        Scanner datos = new Scanner(System.in);
        int[] array1 = {4, 6, 7, 8, 10};
        System.out.println("Introduce un numero y vamos a ver si esta en el array= ");
        int numAComparar = datos.nextInt();
        int valor = -1;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == numAComparar) {
                valor = i;
                System.out.println("el numero esta en la posicion= " + valor);
                break;
            }

        }

        //usando el método de la clase Arrays
        int resultado = 0;
        resultado = Arrays.binarySearch(array1, numAComparar);
        if (resultado >= 0 && resultado <= 4) {
            System.out.println("el valor introducido se encuentra en la posición= " + resultado);
        } else {
            System.out.println("El valor introducido no esta en el array");
        }
        // usando el metodo burbuja
        int[] array2 = {9, 5, 8, 3, 1};
        ordenarBubble(array2);

        System.out.println("los valores son= " + Arrays.toString(array2));
    }

}
