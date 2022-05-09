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
public class NiF {

    private String numero;
    private char letra;
    private LocalDate fechaCaducidad;

    public NiF() {
    }

    public NiF(String numero, char letra, LocalDate FechaCaducidad) {
        this.numero = numero;
        this.letra = letra;
        this.fechaCaducidad = FechaCaducidad;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        return "NiF{" + "numero=" + numero + ", letra=" + letra + ", FechaCaducidad=" + fechaCaducidad + '}';
    }

    //metodo renovar nif
    public void renovaNif(LocalDate fechaSolicitud) {
            
        setFechaCaducidad(fechaSolicitud.plusYears(10));
        
    }

    //calcularLetra
    private char calcularLetra(long numero) {
        char letra = ' ';

        return letra;
    }

}
