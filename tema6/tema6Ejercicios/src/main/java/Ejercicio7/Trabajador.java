/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 * 7.- Transforma la clase Trabajador de los apuntes de clase en una clase
 * abstracta que incluya el método abstracto cotizar(). Crea la jerarquía de
 * herencia que cuelgue de la clase Trabajador, implementado el método abstracto
 * en las respectivas clases (además de la clase Camarero, inventa tú otra).
 * Incluye una clase de prueba con el método main(), donde se cree una lista de
 * cuatro Trabajadores. Añade en la lista dos objetos Camarero y dos objetos del
 * tipo inventado por ti. Finalmente recorre la lista y llama al método
 * cotizar() de cada uno de los trabajadores, comprobando el comportamiento
 * polimórfico de dicho método.
 *
 *
 */
public  abstract class Trabajador {

    private String nombre;
    private String apellidos;
    //lo cambiamos al add cocinero, y se puede ver desde alli
    private String nif;

    public Trabajador(String nombre, String apellidos, String nif) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
    }

    public Trabajador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif + '}';
    }

    public  abstract void cotizar() ;

       

    

}
