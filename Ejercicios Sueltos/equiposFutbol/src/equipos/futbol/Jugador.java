/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipos.futbol;

import java.util.Objects;

public class Jugador {

    private int edad;
    private String posicion;
    private double peso;
    private double estatura;
    private String nombre;

    public Jugador() {
    }

    public Jugador(int edad, String posicion, double peso, double estatura, String nombre) {
        this.edad = edad;
        this.posicion = posicion;
        this.peso = peso;
        this.estatura = estatura;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Jugador{" + "edad= " + edad + ", posicion= " + posicion + ", peso= " 
                + peso + ", estatura= " + estatura + ", nombre= " + nombre + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.edad;
        hash = 97 * hash + Objects.hashCode(this.posicion);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.peso) ^ (Double.doubleToLongBits(this.peso) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.estatura) ^ (Double.doubleToLongBits(this.estatura) >>> 32));
        hash = 97 * hash + Objects.hashCode(this.nombre);
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
        final Jugador other = (Jugador) obj;
        
        return Objects.equals(this.nombre, other.nombre);
    }

    
    
    
}
