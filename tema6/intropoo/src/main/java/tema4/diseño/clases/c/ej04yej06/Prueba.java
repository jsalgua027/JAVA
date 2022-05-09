/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4.diseño.clases.c.ej04yej06;

/**
 *
 * @author nacho
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creo objeto linea 1
        PuntoGeometrico punto1 = new PuntoGeometrico(1, 1);
        //Muestro por consola los valores de los atributos
        System.out.println(punto1.toString());

        //imprimo valor de x de punto1
        System.out.println("el valor de x= " + punto1.getCoordeX());
        //modifico el valor y del punto 1

        punto1.setCoordeY(2);
        //imprimo con toString el valor del punto con su modificación
        System.out.println(punto1.toString());

        // creo nuevo punto para probar la clase linea
        PuntoGeometrico punto2 = new PuntoGeometrico(3, 3);
        // creo una nuevo objeto=linea con los obejtos: puntos de la clase PuntosGeometricos

        Linea linea1 = new Linea(punto1, punto2);

        //Saco por consola la linea con toString
        System.out.println("------------- Probamos Linea-------------");
        System.out.println(linea1.toString());

        // prueba de metodos 
        linea1.mueveDerecha(1);
        // saco por pantalla el movimiento
        System.out.println("-------Movemos a la derecha-------");
        System.out.println(linea1.toString());
        // muevo arriba la linea 
        linea1.mueveArriba(2);
        //compruebo si ha funcionado
        System.out.println("----------Movemos arriba la linea-----");
        System.out.println(linea1.toString());

    }

}
