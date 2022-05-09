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
public class Pila2 {
    
     ArrayList<Character> lista;
    int tamanio;

    public  void Pila(int tamanio) {

        this.lista = new ArrayList<>(15);
        this.tamanio = tamanio;

    }

    public void push(char a) {
        if (lista.size() < tamanio) {
            lista.add(a);
        }
    }

    public char pop() {
        char elemento = 0;
        if (tamanio > 0) {
            elemento = lista.get(lista.size() - 1);
            lista.remove(lista.size() - 1);
        }
        return elemento;
    }

    public boolean isVacia() {
        return lista.isEmpty();
    }

    public int numElementos() {
        return lista.size();
    }

    public void rellenar(char[] array) {
        tamanio = array.length;
        for (int i = 0; i < tamanio; i++) {
            push(array[i]);
        }

    }

    public char[] sacarElemento() {
        char[] array = new char[lista.size()];
        for (int i = 0; i < tamanio; i++) {
            array[lista.size() - 1] = pop();
        }
        return array;
    }

    public void mostrarLista() {
        for (Character character : lista) {
            System.out.print(character + ",");
        }
    }
    
}
