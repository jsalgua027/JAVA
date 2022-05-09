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
public class Ej05 {

    public static void leerValores(int arrayNumEnteros[]) {

        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < arrayNumEnteros.length; i++) {
            try {
                System.out.println("Introduzca el valor que quiera que se encuentre en la posición " + i);
                int numero = teclado.nextInt();
                arrayNumEnteros[i] = numero;
            } catch (InputMismatchException ime) {
                System.out.println("Ha introducido un valor no válido");
                i--;
            }
        }
    }

    public static int numerosPositivos(int[] arrayNumPositivos) {
        Scanner entradaDatos = new Scanner(System.in);
        int totalNumPositivos = 0;
        arrayNumPositivos = new int[10];
        for (int i = 0; i < arrayNumPositivos.length; i++) {
            System.out.println("introduce los 10 numeros enteros" + i);

            arrayNumPositivos[i] = entradaDatos.nextInt();

            if (arrayNumPositivos[i] > 0) {
                totalNumPositivos++;
            } else {
                System.out.println("no hay numeros enteros positivos");
            }
        }
        return totalNumPositivos;
    }

    public static int numerosNegativos(int[] arrayNumPositivos) {
        Scanner entradaDatos = new Scanner(System.in);
        int totalNumNegativos = 0;
        arrayNumPositivos = new int[10];
        for (int i = 0; i < arrayNumPositivos.length; i++) {
            System.out.println("introduce los 10 numeros enteros" + i);

            arrayNumPositivos[i] = entradaDatos.nextInt();

            if (arrayNumPositivos[i] < 0) {
                totalNumNegativos++;
            } else {
                System.out.println("no hay numeros  negativos");
            }

        }
        return totalNumNegativos;
    }

    public static int ceros(int[] arrayNumPositivos) {
        Scanner entradaDatos = new Scanner(System.in);
        int totalNumCeros = 0;
        arrayNumPositivos = new int[10];
        for (int i = 0; i < arrayNumPositivos.length; i++) {
            System.out.println("introduce los 10 numeros enteros" + i);

            arrayNumPositivos[i] = entradaDatos.nextInt();

            if (arrayNumPositivos[i] == 0) {
                totalNumCeros++;
            } else {
                System.out.println("no hay numeros con valor cero dentro del array");
            }

        }
        return totalNumCeros;
    }

    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " - ");
        }
    }

    public static void mediaPositivo(int[] array) {
        double media = 0;
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                contador++;
            }
            media += array[i];
        }
        media = media / contador;
        System.out.println("La media de los números positivos es de: " + media);
    }

    public static void mediaNegativo(int[] array) {
        double media = 0;
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                contador++;
            }
            media += array[i];
        }
        media = media / contador;
        System.out.println("La media de los números negativos es de: " + media);
    }

    public static void main(String[] args) {

    }

}
