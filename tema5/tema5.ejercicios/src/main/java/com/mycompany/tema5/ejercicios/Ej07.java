/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tema5.ejercicios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Ej07 {

    public static void introducirValores(int[] array1, int[] array2) {
        Random valoresRandom = new Random();
        int tamanoArray = array1.length;

        for (int i = 0; i < tamanoArray; i++) {
            array1[i] = valoresRandom.nextInt(100) + 1;
            array2[i] = valoresRandom.nextInt(100) + 1;
        }

    }

    public static int[] MultipiclarArray(int[] array1, int[] array2) {
        int tamanoArray = array1.length;
        int[] resultadoMulti = new int[tamanoArray];

        for (int i = 0; i < tamanoArray; i++) {
            resultadoMulti[i] = array1[i] * array2[i];

        }
        return resultadoMulti;

    }

    public static void main(String[] args) {
        //inicializp los array
        int[] array1;
        int[] array2;
        //creo la entrada de datos  y una variable para guardarlos, como las arrays deben ser
        //del mismo tamaño me sirve para las dos
        Scanner entradaDatos = new Scanner(System.in);
        System.out.println("Introduce el tamaño del para el array = ");
        int tamanoArray = entradaDatos.nextInt();
        //le doy el tamaño a los arrays introducidos por teclado
        array1 = new int[tamanoArray];
        array2 = new int[tamanoArray];
        
        introducirValores(array1, array2);
        
        System.out.println("-------------------------------------");

        System.out.println("---------------Array1------------");

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Posición " + i + " - " + array1[i]);

        }
        System.out.println("---------Array2-----------");
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Posición " + (i + 1) + " - " + array2[i]);

        }
        System.out.println("-------------metodo multiplica------");

        int[] resultado = MultipiclarArray(array1, array2);
        for (int i = 0; i < resultado.length; i++) {

            System.out.println("El resulatdo en posición " + (i + 1) + " es: " + resultado[i]);
        }
    }
}
