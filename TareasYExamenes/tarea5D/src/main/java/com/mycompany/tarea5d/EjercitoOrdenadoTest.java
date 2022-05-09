/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea5d;

/**
 *
 * @author JoseIgnacio
 */
public class EjercitoOrdenadoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        EjercitoOrdenado ejercitoAire = new EjercitoOrdenado();

        ejercitoAire.alistar(new Soldado("125687B", "Pepe", "Sanchez", "Perez", 25));
        ejercitoAire.alistar(new Soldado("154687h", "Sergio", "Benitez", "Lucas", 30));
        ejercitoAire.alistar(new Soldado("134887C", "Antonio", "Hernandez", "benitez", 45));
        ejercitoAire.alistar(new Soldado("123627V", "Nacho", "Salcedo", "Guarde", 28));
        ejercitoAire.alistar(new Soldado("125987N", "Alvaro", "Santillana", "Andrade", 32));
        ejercitoAire.alistar(new Soldado("145548K", "Raul", "Reyes", "Nuñez", 27));

        System.out.println("------------------------Numero de soldados---------------");

        System.out.println(ejercitoAire.numeroSoldados());

        System.out.println("-------------------esta vacio----------------------");

        System.out.println(ejercitoAire.estaVacio());

        System.out.println("----------------esta alistado un soldado----------------");

        System.out.println(ejercitoAire.estaAlistado(new Soldado("123627V", "Nacho", "Salcedo", "Guarde", 28)));

        System.out.println("------------------------Lista de soldados--------------");

        ejercitoAire.mostrarElementos(ejercitoAire.listaSoldados());

        System.out.println("---------------------quito soldado-------------------");

        ejercitoAire.quitarSoldado(new Soldado("123627V", "Nacho", "Salcedo", "Guarde", 28));
        ejercitoAire.mostrarElementos(ejercitoAire.listaSoldados());
    }

}
