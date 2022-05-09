/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tema5.ejercicios;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author JoseIgnacio
 */
public class Ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] array1 = new double[6];
        // 1) metodo para asignar un valor double a todo el array.

        Arrays.fill(array1, 7.5);

        // 2)Realiza una copia del array anterior en un nuevo array.
        double[] array2;

        array2 = Arrays.copyOf(array1, array1.length);

        //imprime los dos arrays
        System.out.println("Array1------> " + Arrays.toString(array1));
        System.out.println("Array2------>" + Arrays.toString(array2));

        //Compara ambos arrays, mostrando si son iguales.
        System.out.println("-----------------------------Comparando------------------");
        boolean iguales = false;
        if (Arrays.equals(array1, array2)) {
            iguales = Arrays.equals(array1, array2);
            System.out.println("-----" + iguales);
        } else {
            System.out.println("son diferentes");
            System.out.println("---------------------cambiar valores----------------");
        }
            //Introduce el valor 6.3 en una posición aleatoria válida de uno de los arrays.
            int max = 6;
            int min = 0;
            Random numRandom = new Random();
            int indice = numRandom.nextInt(min + max) + min;
            array1[indice] = 6.3;
            System.out.println("Array1---------> " + Arrays.toString(array1));
            System.out.println("Array2---------> " + Arrays.toString(array2));
            
            System.out.println("---------------------------------------------------");

            //compara si son iguales las dos arrays
            //con operador ternario.
            System.out.println(Arrays.equals(array1, array2) ? "iguales" : "no iguales");

        }
    }
