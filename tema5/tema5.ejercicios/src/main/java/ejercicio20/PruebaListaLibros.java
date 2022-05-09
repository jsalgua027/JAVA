/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;

import javax.xml.catalog.Catalog;

/**
 *
 * @author nacho
 */
public class PruebaListaLibros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ListaLibros catalogo = new ListaLibros();

        ListaLibros catalogo2 = new ListaLibros();

        catalogo.insertarLibro(new Libro("123a", "La muerte a pellizcos", "Planeta", 10, 0.9));
        catalogo.insertarLibro(new Libro("zjsdf", "hola", "Planeta", 10, 0.19));
        catalogo.insertarLibro(new Libro("Adsf", "abncede", "Planeta", 10, 0.29));
        catalogo.insertarLibro(new Libro("aaaa", "el aire", "Planeta", 10, 0.9));
        catalogo.imprimirConsola();
        //metodo ordenar 
        System.out.println("---------------------------------------------------------------------");
        catalogo.ordenarISBN();
        catalogo.imprimirConsola();
        //catalogo.ordenarISBN();
        int posicion = catalogo.buscarISBN(new Libro("aaaa", "el aire", "Planeta", 10, 0.9));
        System.out.println("esta en la posicion" + posicion);
        catalogo.ordenarComparatoNombre();
        catalogo.imprimirConsola();
        
        catalogo.ordenarComparatoNombre();
       
        catalogo.imprimirConsola();
        System.out.println("-----------------------------------------------");
        catalogo.ordenarComparatorPaginas();
        catalogo.imprimirConsola();
        System.out.println("--------------------------------------------------busqueda binaria por nombre");
        catalogo.ordenarComparatoNombre();
        int posicion2 = catalogo.buscarBinariaNombre(new Libro("", "el aire", "Planeta", 10, 0.9));
        System.out.println("esta en la posicion" + posicion2);
        
        
     

//      //  catalogo2.insertarLibro(new Libro("125", "La muerte a bocados", "Planeta", 10, 0.9));
//        //imprimir 
//        catalogo.imprimirConsola();
//        //imprimir numero de libros
//        System.out.println("Tamaño del catalogo " + catalogo.getCantidadLibros());
//        System.out.println("----------------------------------------------------------------");
//        // buscamos
//       Libro libro= catalogo.buscarISBN("1234");
//       //imprimos
//        System.out.println("Libro buscado "+ libro);
//        
//        //borrar libro
//        catalogo.borrarLibro(new Libro("12345", "", "", 0, 0));
//        
//        catalogo.imprimirConsola();
//        
//        
//        System.out.println("Libros de precio 0.9");
//        catalogo.buscarPorPrecio(0.9).forEach(System.out::println);
    }

}
