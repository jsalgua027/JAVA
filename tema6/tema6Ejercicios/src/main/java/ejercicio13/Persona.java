/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author nacho
 */
public abstract class Persona implements Identificable{

    
    private String nombre;
    private String apellido;
    private String NIF;
    private Direccion direccion;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String NIF, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.NIF = NIF;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", NIF=" + NIF + ", direccion=" + direccion + '}';
    }
    
    
    
    
}
