/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio25;

import java.util.ArrayList;

/**
 *
 * @author JoseIgnacio
 */
public class Pila {

    ArrayList<Char> pila = new ArrayList<>();
    private final int TAMANIO = 5;

    public Pila() {

        this.pila = new ArrayList<>();

    }

    //metodo insertar carater auxilir
    public void push(Char aux) {

        if (pila.size() < TAMANIO) {
            pila.add(aux);

        }
    }

    // metodo sacar carater auxiliar
    public void pop() {
        if (!pila.isEmpty()) {
            pila.remove(pila.size() - 1);
        }

    }

    //metodo comprobar  si la pila esta vacia
    public boolean pilaVacia() {
        if (pila.size() == 0) {
            return true;
        }
        return false;
    }
    //metodo comprobar si la pila esta llena

    public boolean pilaLlena() {
        if (pila.size() == TAMANIO) {
            return true;
        }
        return false;
    }

    // saber cuantos elementos
    public int cantidadElementos() {
        return pila.size();
    }

    //metodo impirmir 
    public void imprimirElementos() {
        System.out.println("Los elementos que contiene la listas son ");
        pila.forEach(System.out::println);

    }

    public void rellenar(Char[] aux) {
        if (aux.length <= TAMANIO) {
            for (int i = 0; i < TAMANIO; i++) {
                pila.add(aux[i]);
            }

        }

    }

}
