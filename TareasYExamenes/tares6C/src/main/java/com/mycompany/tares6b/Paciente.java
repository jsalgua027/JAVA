/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tares6b;

import java.util.Random;

/**
 *
 * @author nacho
 */
public class Paciente extends Persona {

    private String numeroHistoria;

    public Paciente() {
    }

    public Paciente(String numeroHistoria, String nombre, String apellidos, NiF numeroIdentificacion) {
        super(nombre, apellidos, numeroIdentificacion);
        this.numeroHistoria = numeroHistoria;
    }

    public String getNumeroHistoria() {
        return numeroHistoria;
    }

    public void setNumeroHistoria(String numeroHistoria) {
        this.numeroHistoria = numeroHistoria;
    }

    @Override
    public String toString() {
        return super.toString() + "Paciente{" + "numeroHistoria=" + numeroHistoria + '}';
    }

    //metodo tomar medicina
    public void tomarMedicina(String medicamento) {
        Random aleatorio = new Random();
        if (aleatorio.nextBoolean()){
            System.out.println("Soy " + this.getNombre() + " y estoy tomando " + medicamento+ "se ha curado");
        }else{
             System.out.println("Soy " + this.getNombre() + " y estoy tomando " + medicamento+ "no se ha curado");
        }
        
    }

}
