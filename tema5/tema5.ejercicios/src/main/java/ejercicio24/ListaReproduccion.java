/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author nacho
 */
public class ListaReproduccion {

    private ArrayList<Cancion> listaReproduccion;

    public ListaReproduccion() {
        this.listaReproduccion = new ArrayList<>();

    }

    //metodo saber cuantas canciones tiene la lista
    public int numeroCanciones() {
        return listaReproduccion.size();

    }

    // metodo comprobar si la lsirta esta vacia
    public boolean listaVacia() {
        if (listaReproduccion.size() == 0) {
            return true;
        }
        return false;
    }

    //Metodo escuchar cancion // devuelve la cancion que se encuentra en la posicion que le das
    public Cancion escucharCancion(int posicion) {
        if ((posicion > 0 && posicion <= listaReproduccion.size())) {

        }
        return listaReproduccion.get(posicion);

    }

    //cambiar de cancion de la posicion indica por la nueva cancion
    public Cancion cambiarCancion(int posicion, Cancion aux) {
        if (posicion > 0 && posicion <= listaReproduccion.size()) {

        }
        return listaReproduccion.set(posicion, aux);
    }

    //metodo para añadir una cancion al final de la lista
    public void grabarCancion(Cancion cancion) {
        if (listaReproduccion != null) {
            listaReproduccion.add(cancion);
        }
    }
    //metodo elimina la cancion de la posicion indicada

    public Cancion quitarCancion(int posicion) {
        if (posicion > 0 && posicion <= listaReproduccion.size()) {

        }
        return listaReproduccion.remove(posicion);
    }

    //metodo elimina el objeto c si se encuentra en la lista de reproducción.
    //Usa el método remove(Cancion)
    public void eliminarCancion(Cancion cancion) {

        listaReproduccion.remove(cancion);

    }
    //metodo de clase que imprima  los nombres de las canciones contenidas (ArrayList tmp)

    public void imprimirLista() {
        System.out.println("La lista esta compuesta de las siguientes canciones");
        listaReproduccion.forEach(System.out::println);
    }
    //metodo buscar cancion con indexof

    public Cancion buscarCancion(Cancion cancion) {
        Cancion aux = new Cancion("locos", "rap", 3.25);
        int indice = listaReproduccion.indexOf(aux);
        if (indice <= 0) {
            return listaReproduccion.get(indice);
        }
        return aux;

    }

    //ordenar usando Collections.sort
    public void ordenarEstilo() {
        Collections.sort(this.listaReproduccion);

    }

    // metodo de busqueda binaria // este metodo es correcto si esta ordenado
    public int buscarEstilo(Cancion aux) {
        ordenarEstilo();
        return Collections.binarySearch(listaReproduccion, aux);

    }

    // metodo comparTo 
    public void ordenarcomparToEstilo() {

        Collections.sort(listaReproduccion, (Cancion aux1, Cancion aux2) -> aux1.getEstilo().compareTo(aux2.getEstilo()));
    }
}
