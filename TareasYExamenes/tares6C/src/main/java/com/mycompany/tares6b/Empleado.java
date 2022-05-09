/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tares6b;

/**
 *
 * @author nacho
 */
public abstract class Empleado extends Persona{
    
    private String numeroSeguridadSocial;
    private double salario;

    public Empleado() {
    }

    public Empleado(String numeroSeguridadSocial, double salario, String nombre, String apellidos, NiF numeroIdentificacion) {
        super(nombre, apellidos, numeroIdentificacion);
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.salario = salario;
    }

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
    @Override
    public String toString() {
        return super.toString()+"Empleado{" + "numeroSeguridadSocial=" + numeroSeguridadSocial + ", salario=" + salario + '}';
    }
    
    public abstract double calcularIRPF();
    
    
}
