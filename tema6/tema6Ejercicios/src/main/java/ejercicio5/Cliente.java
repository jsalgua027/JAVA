/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Objects;

/**
 *
 * @author JoseIgnacio
 */
public class Cliente {

   private String nombre;
    private String dni;
    private int edad;

    public Cliente(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    public Cliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.nombre);
        hash = 23 * hash + Objects.hashCode(this.dni);
        hash = 23 * hash + this.edad;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {  //propiedad reflexiva
            return true;
        }
        if (obj == null) {//propiedad de la nulidad
            return false;
        }
        if (getClass() != obj.getClass()) {// si los objetos son clases distintas
            return false;
        }
        final Cliente other = (Cliente) obj; // castin explicito para acceder a los elementos del objeto
        if (this.edad != other.edad) {// comparacion de atributos 
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {//comparacion de atributos 
            return false;
        }
        if (!Objects.equals(this.dni, other.dni)) {//comparacion de atributos 
            return false;
        }
        return true;
    }

    
    
    
    
    
    
    
}
