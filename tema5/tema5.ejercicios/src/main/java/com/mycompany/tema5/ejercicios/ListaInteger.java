/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tema5.ejercicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

/**
 *
 * @author nacho
 */
public class ListaInteger {

    /**
     * Crear una clase que contenga como atributo una lista (ArrayList) de
     * números enteros Integer. Además tendrá los siguientes métodos:
     *
     * Generar lista, que genera una lista de números aleatorios en el intervalo
     * [10 : 100]. Imprimir la lista de números generados. Imprimir la suma de
     * los números pares. Imprimir la cantidad de números impares. Devolver el
     * elemento mayor. Devolver el elemento menor. Obtener el tamaño de la
     * lista. Borrar un elemento de la lista, según su posición. Borrar un
     * elemento de la lista, según su valor. Si hay varios, los borra todos.
     * Modificar un elemento de la lista, según su posición
     *
     *
     *
     *
     *
     *
     */
    private ArrayList<Integer> lista;

    //construcutor
    public ListaInteger() {
        lista = new ArrayList<>();

    }

    // crear una lsita y rellena con tantos elememntos como inidque
    public ListaInteger(int tam) {

        Random r = new Random();
        lista = new ArrayList<>();
        for (int i = 0; i > tam; i++) {
            Integer aux = r.nextInt(91) + 18;
            lista.add(aux);
        }

    }

    public ArrayList<Integer> getLista() {
        return lista;
    }

    public static void main(String[] args) {

        //   ListaInteger miLista= new ListaInteger(10);
        //  ArrayList<Integer>list=miLista.getLista();
        Random r = new Random();
        System.out.println("-------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(7);
        list.add(6);
        list.add(1);
        list.add(8);
        list.add(3);
        list.add(4);
        list.add(9);

        for (int i = 0; i < 2; i++) {
            Integer aux = r.nextInt(91) + 10;
            list.add(aux);
        }

        for (Integer tmp : list) {
            System.out.print(tmp + "-");

        }
        int sumaPares = 0;
        //bucle para recorrer la lista completa
        for (int i = 0; i < list.size(); i++) {
            //metodo get(posicion)para obtener cada elemento de la lista
            int numero = list.get(i);

            if (numero % 2 == 0) {
                sumaPares += numero;

            }

        }

        int contador = 0;
        //bucle para recorrer la lista completa
        for (int i = 0; i < list.size(); i++) {
            //contador inpares
            int numero = list.get(i);

            if (numero % 2 != 0) {
                contador++;

            }

        }

        // buscar mayor
        int mayor = Integer.MIN_VALUE;
        for (Integer num : list) {
            if (num == mayor) {
                mayor = num;
            }

        }

        System.out.println("sumar pares:  " + sumaPares);
        System.out.println("sumar pares:  " + contador);
        System.out.println("el mayor es : " + mayor);
        // metodo borrar de una posicion 

        System.out.println("borrado el elemento de la posicion 3");
        list.remove(3);

        list.forEach(e -> System.out.print(e + "-"));

        //cambia el elemento de la posicion   cero con el nuevo valor
        list.set(0, 200);
        System.out.println("");
        list.forEach(e -> System.out.print(e + "-"));

        list.add(2, 500);
        System.out.println("");
        list.forEach(e -> System.out.print(e + "-"));

        //donde esta lo que le marcas
        int indice = list.indexOf(500);

        System.out.println("\nEl 500 esta en : " + indice);

    }

}
