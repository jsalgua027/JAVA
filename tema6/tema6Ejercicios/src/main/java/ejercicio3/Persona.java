/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.util.Objects;

/**
 *
 * @author nacho
 */
public class Persona {

    private String nombre;
    private String nif;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, String nif, int edad) {
        this.nombre = nombre;
        this.nif = nif;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", nif=" + nif + ", edad=" + edad + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.nombre);
        hash = 29 * hash + Objects.hashCode(this.nif);
        hash = 29 * hash + this.edad;
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
        final Persona other = (Persona) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.nif, other.nif);
    }

    
    public int  cuantosAnios(Persona nombre){
        
        return edad;
    }
    
    
    
}
