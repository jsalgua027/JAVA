/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24;

import java.util.Objects;

/**
 *
 * @author nacho
 */
public class Cancion implements Comparable<Cancion> {

    private String nombre;
    private String estilo;
    private double duracion;

    public Cancion() {
    }

    public Cancion(String nombre, String estilo, double duracion) {
        this.nombre = nombre;
        this.estilo = estilo;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Cancion{" + "nombre=" + nombre + ", estilo=" + estilo + ", duracion=" + duracion + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + Objects.hashCode(this.estilo);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.duracion) ^ (Double.doubleToLongBits(this.duracion) >>> 32));
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
        final Cancion other = (Cancion) obj;

        return Objects.equals(this.estilo, other.estilo);
    }
///!!!!!!!!!!!!!!!!!!!!!!!!!hay que insertarlo y modificarlo
    @Override
    public int compareTo(Cancion o) {
        return this.estilo.compareTo(o.estilo); //To change body of generated methods, choose Tools | Templates.
    }

    /*
    lo que tenia antes en el equals, solo he dejado estilo para comparar y darle un orden natural.
     if (Double.doubleToLongBits(this.duracion) != Double.doubleToLongBits(other.duracion)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
     */
}
