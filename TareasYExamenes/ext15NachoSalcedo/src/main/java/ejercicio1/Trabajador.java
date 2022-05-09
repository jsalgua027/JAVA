/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.time.LocalDate;

/**
 *
 * @author nacho
 */
public class Trabajador {

    private String nombre;
    private String apellido;
    private LocalDate fechaNaci;
    private CategoriaEmpleado categoria;

    public Trabajador(String nombre, String apellido, LocalDate fechaNaci, CategoriaEmpleado categoria) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNaci = fechaNaci;
        this.categoria = categoria;
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

    public LocalDate getFechaNaci() {
        return fechaNaci;
    }

    public void setFechaNaci(LocalDate fechaNaci) {
        this.fechaNaci = fechaNaci;
    }

    public CategoriaEmpleado getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaEmpleado categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "nombre=" + nombre + ", apellido=" + apellido + ", fechaNaci=" + fechaNaci + ", categoria=" + categoria + '}';
    }

    public double CalcularSueldo(CategoriaEmpleado categoria) {
        double sueldoBase = 1707;
        double sueldoFinal = 0;
        if (categoria == CategoriaEmpleado.MEDIA) {
            return sueldoFinal = sueldoBase + 70;
        }
        if (categoria == CategoriaEmpleado.INICIAL) {
            return sueldoFinal = sueldoBase + 50;
        }
        if (categoria == CategoriaEmpleado.AVANZADA) {
            return sueldoFinal = sueldoBase + 100;
        }
        return sueldoFinal;
    }

    public  void  copia (Trabajador aux){
        nombre= aux.nombre;
        apellido= aux.apellido;
        fechaNaci= aux.fechaNaci;
        categoria=aux.getCategoria();
    }
    
}
