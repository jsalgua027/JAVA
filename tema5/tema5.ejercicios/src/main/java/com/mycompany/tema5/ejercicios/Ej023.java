/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tema5.ejercicios;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author nacho
 */
public class Ej023 {

    /**
     * Se desea manejar dos listas (ArrayList) de Integer. La cantidad de
     * elementos de la lista 1 debe ser un número aleatorio entre 5 y 15. La
     * cantidad de elementos de la lista 2 debe ser un número aleatorio entre 10
     * y 20. El rango de los números que serán agregados a la lista DEBE estar
     * entre 50 y 100. Se pide construir una aplicación en Java que permita
     * cumplir con la siguiente funcionalidad: Imprimir las listas que han sido
     * generadas. Usa for-each. Crear una tercera lista que contenga los
     * elementos que están en la lista 1 y NO ESTÁN en la lista 2 Imprimir la
     * tercera lista. Crear una cuarta lista que contenga los elementos de la
     * lista 1 que son pares y los elementos de la lista 2 que son impares I
     * mprimir la cuarta lista. Usa una expresión lambda.
     *
     */
    //recoge elementos y llena la lista 
    public static void rellenarNumerosAleatorios(int elementos, ArrayList<Integer> lista) {
        Random num = new Random();

        for (int i = 0; i < elementos; i++) {
            Integer aux = num.nextInt();
            lista.add(aux);

        }

    }
// si devuelvo en el metodo tengo que crear el objeto dentro del metodo

    public static ArrayList<Integer> rellenarNumerosAle2(int elementos) {
        Random num = new Random();
        ArrayList<Integer> listaAux = new ArrayList<>();
        for (int i = 0; i < elementos; i++) {
            Integer aux = num.nextInt();
            listaAux.add(aux);
        }

        return listaAux;
    }

    public static void main(String[] args) {

        Random num = new Random();
        int tamanio = num.nextInt(15 - 5 + 1) + 5;
        //lista1 con cantidad de elementos entre 5 y 15
        ArrayList<Integer> lista1 = new ArrayList<>(tamanio);
        //meto valores al arraylist
        //uso de metodo rellenar numeros
        rellenarNumerosAleatorios(tamanio, lista1);
        // uso el segundo metodo; 
        ArrayList <Integer>lista5 =rellenarNumerosAle2(tamanio);
        lista5.forEach(e -> System.out.print(e + "-"));
        
        
        for (int i = 0; i < tamanio; i++) {
            Integer aux = num.nextInt(100 - 50 + 1) + 50;
            lista1.add(aux);
        }

        //lista2 con numero aleatorio entre 10 y 20
        int tamanio2 = num.nextInt(20 - 10 + 1) + 10;
        ArrayList<Integer> lista2 = new ArrayList<>(tamanio2);
        //meto valores a lista2
        for (int i = 0; i < tamanio; i++) {
            Integer aux = num.nextInt(100 - 50 + 1) + 50;
            lista2.add(aux);
        }

        // imprimo las dos listas usando for each
        System.out.println("---------------Lista1--------------------");
        for (Integer tem : lista1) {
            System.out.print(tem + "-");
        }
        System.out.println("\n--------------Lista2---------------------");
        lista2.forEach(e -> System.out.print(e + "-"));

        //creo tercera lista que contengan los valores de la lista uno y no estan en las lista2
        ArrayList<Integer> lista3 = new ArrayList<>();

        for (int i = 0; i < lista1.size(); i++) {
            Integer aux = lista1.get(i);
            //contains ------metodo para ver que contiene
            lista2.contains(aux);
            if (!lista2.contains(aux)) {
                lista3.add(aux);
            }

        }

        System.out.println("\n-------------------Lista3-----------");
        lista3.forEach(e -> System.out.print(e + "-"));

        //crea una lista4 que contenga los elementos pares de la lista1 y los impares de la lista2
        ArrayList<Integer> lista4 = new ArrayList<>();
        for (int i = 0; i < lista1.size(); i++) {
            //numeros pares de lista1
            if (lista1.get(i) % 2 == 0) {
                lista4.add(lista1.get(i));
            }
        }
        for (int i = 0; i < lista2.size(); i++) {
            // numeros inpares de lista2
            if (lista2.get(i) % 2 != 0) {
                lista4.add(lista2.get(i));
            }

        }
        System.out.println("\n-----------------------Lista4------------");
        for (Integer tem : lista4) {
            System.out.print(tem + "-");
        }

    }

}
