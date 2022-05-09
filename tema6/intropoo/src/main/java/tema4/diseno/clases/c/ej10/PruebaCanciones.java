/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4.diseno.clases.c.ej10;

/**
 *
 * @author nacho
 */
public class PruebaCanciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creo el objeto
        Cancion cancion1;
        Cancion cancion2;
        //le añado valores a los atributos
        cancion1 = new Cancion("agua", "pepe");
        //uso el método get para imprimir por pantalla
        System.out.println("la canción se llama=" + cancion1.getTitulo());
        System.out.println("El autor de la canción es= " + cancion1.getAutor());
        //uso el metodo set ".setTitulo" para modificar el valor del atributo
        cancion1.setTitulo("La manzana");
        System.out.println("La cancion se llama= " + cancion1.getTitulo());
        //uso el método toString() para mostrar por pantalla
        System.out.println(cancion1.toString());

    }

}
