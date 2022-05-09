/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.Objects;

/**
 *
 * @author nacho
 */
public class Trabajador implements Comparable<Trabajador> {

    private String nombre;
    private String apellido;

    public Trabajador(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;

    }

    public Trabajador() {
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

    @Override
    public String toString() {
        return "Trabajador{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nombre);
        hash = 79 * hash + Objects.hashCode(this.apellido);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Trabajador other = (Trabajador) obj;

        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public int compareTo(Trabajador t) {
        return this.nombre.compareTo(t.nombre);
    }

}
