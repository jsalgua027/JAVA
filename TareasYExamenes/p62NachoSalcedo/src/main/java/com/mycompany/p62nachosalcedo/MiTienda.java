/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.p62nachosalcedo;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author nacho
 */
public class MiTienda {

    private ArrayList<Producto> tienda = new ArrayList<>();

    private ArrayList<Libro> listaLibros = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<Producto> tienda = new ArrayList<>();
        ArrayList<Libro> listaLibros = new ArrayList<>();

        tienda.add(new Pantalon(45, "levis", "124564", 45, 16, "pantalon vaquero"));
        tienda.add(new Pantalon(38, "Dockers", "13658", 48, 14, "pantalon chino"));
        tienda.add(new Musica("Los rodiguez", "4589", 12, 16, "grupo español"));
        tienda.add(new Musica("ACDC", "4653", 14, 16, "grupo americano"));
        tienda.add(new LibroDigital(25, 545678, "45684", 25, 18, "libro de poesia japonesa"));
        tienda.add(new LibroDigital(12, 645848, "58964", 15, 18, "libro de programacion para torpe"));
        tienda.add(new LibroPapel(45, 58649, "87564", 25, 16, "libro de java"));
        tienda.add(new LibroPapel(56, 68521, "98653", 30, 16, "libro de matematicas"));

        // EL METODO TOSTRING ES UN METODO POLIMORFICO PORQUE VIENE HEREDADO DE OTRA CLASE, EN ESTE CASO DE LA CLASE OBJETC
        //imprimo la lista
        for (Producto producto : tienda) {

            System.out.println(producto.toString());

        }
        System.out.println("-----------------ordeno por precio--------------------");
        //ordenar por precio

        Collections.sort(tienda, (Producto pro1, Producto pro2) -> Double.compare(pro1.getPrecio(), pro2.getPrecio()));
        for (Producto producto : tienda) {
            System.out.println(tienda.toString());

        }

        System.out.println("-----------------por codido-----------------");

        Collections.sort(tienda, (Producto p1, Producto p2) -> p1.getCodigo().compareTo(p2.getCodigo()));

        for (Producto producto : tienda) {
            System.out.println(tienda.toString());
        }

        //busqueda binaria
        int resultadoBusqueda = Collections.binarySearch(tienda, new LibroDigital(25, 545678, "45684", 25, 18, "libro de poesia japonesa"), (Producto p1, Producto p2) -> p1.getCodigo().compareTo(p2.getCodigo()));
        System.out.println("-------------------------imprimo la busqueda------------------");
        System.out.println(resultadoBusqueda);

        // me falta la busqueda de uno nuevo
        //meto los libros
        for (Producto producto : tienda) {

            if (producto instanceof Libro) {
                listaLibros.add((Libro) producto);
            }

        }
        // impirmo lista de libros
        for (Libro listaLibro : listaLibros) {
            System.out.println(listaLibro.toString());
        }
        //ordeno la lista de libros 
        Collections.sort(listaLibros);
        System.out.println("-----------------imprimo la lista ordenada----------");

        for (Libro listaLibro : listaLibros) {
            System.out.println(listaLibro.toString());

        }
        // CONVERSIONES EXPLICITAS
        for (Libro listaLibro : listaLibros) {
            if (listaLibro instanceof LibroPapel) {
                ((LibroPapel) listaLibro).enviar("calle de la cerveza");
            }
            if (listaLibro instanceof LibroDigital) {
                ((LibroDigital) listaLibro).descargar();
            }

            //metodo contains 
        }
        System.out.println("-----------------------------------metodo contains--------------------------------");
        boolean estaContenido = listaLibros.contains(new LibroDigital(45, 456231, "45544", 25, 16, "libro de cerveza"));

        System.out.println(estaContenido);

        ArrayList<SeEnvia> envios = new ArrayList<>();

        // no doy con la tecla de este ejercico
        // enviar 
//        for (Producto producto : tienda) {
//            if (producto instanceof SeEnvia){
//                envios.add(producto);
//            }
//            
//        }
    }

}
