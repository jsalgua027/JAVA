/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author nacho
 */
public class ListaLibros {

    // atributo encapsulado
    private ArrayList<Libro> lista;

    //construtor por defect, solo instancia la estructura list
    //sin incluir ningun objeto
    public ListaLibros() {

        this.lista = new ArrayList<>();
    }
    //guardar un libro al final de la lista, si no es null

    public void insertarLibro(Libro libro) {

        if (libro != null) {
            lista.add(libro);
        }
    }

    public void imprimirConsola() {
        System.out.println("Imprimiendo lista de libros...");
        lista.forEach(System.out::println); //sacar por pantalla
    }

    public int getCantidadLibros() {

        return lista.size();
    }

    //Eleminiar el libro
    public boolean borrarLibro(Libro libro) {

        if (lista.contains(libro)) {//.contains mira si contiene pero necesita el metodo equals
            lista.remove(libro);
            return true;
        }
        return false;
    }
    //ojo el .remove hace el contais borra y te devuelve el boolean 
    //se podria resumir todo el metodo sin el if con un return lista.remove(libro);

    //buscamos  un libro metodo cuenta la vieja
    //si queremos buscar varios libros que nos devuleva una lista
    public Libro buscarISBNCuentaVieja(String isbn) {
        Libro aux = null;
        for (int i = 0; i < lista.size(); i++) {
            aux = lista.get(i);

            if (aux.getIsbn().equals(isbn)) {
                return aux;
            }
        }
        return aux;
    }

    public Libro buscarISBN(String isbn) {
        Libro aux = new Libro(isbn, isbn, isbn, 0, 0);

        int indice = lista.indexOf(aux);
        if (indice >= 0) {
            return lista.get(indice);
        }
        return aux;
    }

    //buscar lista precio
    public ArrayList<Libro> buscarPorPrecio(double precio) {
        //creamos el objeto a devolver
        ArrayList<Libro> aux = new ArrayList<>();
        //recorro toda la lista para buscarlo
        for (Libro libro : this.lista) {
            if (libro.getPrecio() == precio) {
                aux.add(libro);
            }
        }
        return aux;
 //ordenar
 //Colletions.sort(lista) lista debe de contener objetos que implemtan
    }
    public void ordenarISBN(){
        Collections.sort(this.lista);
        
        
    }
    //busqueda binaria por isbn, requiere que este ordenado
    //Busqueda binaria de un objeto según ordenacion natural
    // se puede meter una ordenaqcion en este metodo para que la haga!!!!!binarySearch!!!!!
    
    public int buscarISBN(Libro l){
       return Collections.binarySearch(lista, l);
        
        
    }
    //Aqui sin orden natural usamos el Collections.sort y ponemos el orden natural.
    public void ordenarComparatoNombre(){
        Collections.sort(lista, (Libro l1, Libro l2)->l1.getNombre().compareTo(l2.getNombre()));
    }
    
    // busqueda binaria por nombre
    public int buscarBinariaNombre(Libro l){
        //debe de estar ordenada segun el criterio que se pasa a este metodo(nombre)
        return Collections.binarySearch(lista,l,(Libro l1, Libro l2)->l1.getNombre().compareTo(l2.getNombre()));
        
        
    }
    
    
    
    
    
    //si son numeros se restan no se comparan ¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡
    public void ordenarComparatorPaginas(){
       // Collections.sort(lista, (Libro l1, Libro l2)->l1.getNumeroPags() - l2.getNumeroPags());
        Collections.sort(lista, (Libro l1, Libro l2)->Integer.compare(l1.getNumeroPags(), l2.getNumeroPags()));
        
    }
    
    public void ordenarNombrePaginas(){
        Comparator<Libro> criterioNombre= (Libro l1, Libro l2)->l1.getNombre().compareTo(l2.getNombre());
        Comparator<Libro> criterioPaginas=(Libro l1, Libro l2)->Integer.compare(l1.getNumeroPags(), l2.getNumeroPags());
        Comparator<Libro> criterioNombrePaginas= criterioNombre.thenComparing(criterioPaginas);
        
        Collections.sort(lista,criterioNombrePaginas);
        
        
    }
    
}
