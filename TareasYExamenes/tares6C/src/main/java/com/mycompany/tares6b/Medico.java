/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tares6b;

/**
 *
 * @author JoseIgnacio
 */
public class Medico extends Empleado {

    private String especialidad;

    public Medico(String especialidad, String numeroSS, double salario, String nombre, String apellidos, NiF nif) {
        super(numeroSS, salario, nombre, apellidos, nif);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void tratarPaciente(Paciente p, String medicina) {
        System.out.println("El médico " + this.getNombre() + " trata al paciente "
                + p.getNombre() + " con la medicina " + medicina);

        p.tomarMedicina(medicina);

    }

    @Override
    public double calcularIRPF() {
        if (this.especialidad.equalsIgnoreCase("cirujia")) {
            return this.getSalario() * 0.21;
        } else {
            return this.getSalario() * 0.25;
        }

    }
}
