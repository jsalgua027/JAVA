/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tarea5d;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author nacho
 */
public class Ejercito {

    private Set<Soldado> ejercito;

    public Ejercito() {
        this.ejercito = new HashSet<>();
    }

    //1. Saber el número de soldados que hay.
    public int numeroSoldados() {

        return ejercito.size();
    }

    //2. Alistar a un solado.
    public void alistar(Soldado s) {

        ejercito.add(s);
    }

    //3. Saber si el ejército no tiene soldados.
    public boolean estaVacio() {

        return ejercito.isEmpty();
    }

    //4. Saber si un soldado está en el ejército.
    public boolean estaAlistado(Soldado s) {

        return ejercito.contains(s);
    }

    //4. Sacar todos los soldados, en forma de ArrayList.
    public ArrayList<Soldado> listaSoldados() {

       
        ArrayList<Soldado> listaSoldados = new ArrayList<>(ejercito);

       
        // el objeto iterartor sirve para recorrer todos los elementos de una estrucutra de datos
        // es equivalen a usar el for echa
        
        
        Iterator<Soldado> itera1 = ejercito.iterator();
        while(itera1.hasNext()){
            Soldado au=itera1.next();
            
            
        }
        
        
        return listaSoldados;

        
        
    }

    
    
    
    
    
    
    public void mostrarElementos(ArrayList<Soldado> ejercito) {

        ejercito.forEach(System.out::println);
    }

    //5. quitar a un soldado del ejército.
    public boolean quitarSoldado(Soldado s) {

        return ejercito.remove(s);
    }

    @Override
    public String toString() {
        return "Ejercito: " + ejercito;
    }

}
