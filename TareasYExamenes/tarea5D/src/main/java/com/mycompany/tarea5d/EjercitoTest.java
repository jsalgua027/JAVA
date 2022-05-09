/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea5d;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author JoseIgnacio
 */
public class EjercitoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ejercito ejercitoTierra = new Ejercito();
        
        ejercitoTierra.alistar(new Soldado("125687B", "Pepe", "Sanchez", "Perez", 25));
        ejercitoTierra.alistar(new Soldado("154687h", "Sergio", "Benitez", "Lucas", 30));
        ejercitoTierra.alistar(new Soldado("134887C", "Antonio", "Hernandez", "benitez", 45));
        ejercitoTierra.alistar(new Soldado("123627V", "Nacho", "Salcedo", "Guarde", 28));
        ejercitoTierra.alistar(new Soldado("125987N", "Alvaro", "Santillana", "Andrade", 32));
        ejercitoTierra.alistar(new Soldado("145548K", "Raul", "Reyes", "Nuñez", 27));
        
        System.out.println("-----------esta vacio--------");
        
        System.out.println(ejercitoTierra.estaVacio());
        
        System.out.println("---------------Numero de soldados--------");
        
        System.out.println(ejercitoTierra.numeroSoldados());
        
        System.out.println("-------------Saco los soldados por Arraylist-------");
        
        ejercitoTierra.mostrarElementos(ejercitoTierra.listaSoldados());
        
        System.out.println("----------------esta alistado?-----");
        
        System.out.println(ejercitoTierra.estaAlistado(new Soldado("123627V", "Nacho", "Salcedo", "Guarde", 28)));
        
        
        System.out.println("-----------------esta listado? error-------------------");
          System.out.println(ejercitoTierra.estaAlistado(new Soldado("8855858H", "Miguel", "Reyes", "Perez", 28)));
          
          
          System.out.println("---------------quitar solodado---------");
          ejercitoTierra.quitarSoldado(new Soldado("125687B", "Pepe", "Sanchez", "Perez", 25));
          
          ejercitoTierra.mostrarElementos(ejercitoTierra.listaSoldados());
        
        
    }
    
}
