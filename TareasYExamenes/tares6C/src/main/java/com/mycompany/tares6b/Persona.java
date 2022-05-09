/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tares6b;

import java.time.LocalDate;

/**
 *
 * @author nacho
 */
public abstract class Persona {

    private String nombre;
    private String apellidos;
    private NiF numeroIdentificacion;

    public Persona() {
    }

    public Persona(String nombre, String apellidos, NiF numeroIdentificacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroIdentificacion = numeroIdentificacion;
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

    public NiF getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(NiF numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", numeroIdentificacion=" + numeroIdentificacion + '}';
    }

    public void renovarNif(LocalDate fechaSolicitud) {
        numeroIdentificacion.renovaNif(fechaSolicitud);

    }

    // Al renovar el DNI dan 10 años de validez
    // Añadir 10 años a la fechaSolicitud modificando la fechaCaducidad
    // del dni de la persona
}
