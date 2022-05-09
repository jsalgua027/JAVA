/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tema5.ejercicios;

import java.util.Arrays;

/**
 *
 * @author JoseIgnacio
 */
public class Ej06 {

    /**
     * Hacer un programa que determine si dos arrays son iguales. Probarlo con
     * los arrays [1,2,3] y [1,2,3], [1,2,3,4] y [1,2,3] , [1,2,3] y [1,2,2].
     * Este ejercicio hay que hacerlo de dos formas: la primera, usando la clase
     * Arrays; la segunda, creando un método que vaya comparando los valores de
     * los arrays y devuelva true si todos son iguales o false en caso
     * contrario.
     */
    public static boolean compararValores(int[] array1, int array2[]) {

        int[] aux;
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3};
        int[] arrayB = {1, 2, 3};
        int[] arrayC = {1, 2, 3, 4};
        int[] arrayD = {1, 2, 3};
        int[] arrayE = {1, 2, 3};
        int[] arrayG = {1, 2, 2};
        boolean comparacion; //true si son iguales

        if (Arrays.equals(arrayA, arrayB)) {
            comparacion = true;
            System.out.println("los arrays son=" + comparacion);
        } else {
            comparacion = false;
        }

        if (Arrays.equals(arrayC, arrayD)) {
            comparacion = true;
            System.out.println("los arrays son=" + comparacion);
        } else {
            System.out.println("son diferentes");
        }

        if (Arrays.equals(arrayE, arrayG)) {
            comparacion = true;
            System.out.println("los arrays son=" + comparacion);
        } else {
            System.out.println("son diferentes");
        }
        System.out.println("-----------------------comparar usando metodos--------------");
        System.out.println("como son los arrays= "+ compararValores(arrayA, arrayB));
        

    }

}
