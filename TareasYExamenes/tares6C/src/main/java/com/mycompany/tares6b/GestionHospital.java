/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tares6b;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author nacho
 */
public class GestionHospital {

    private Hospital hospital;

    public GestionHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public static void main(String[] args) {

        Hospital costaDelSol = new Hospital("costa del sol", "c/ciello 3", 100);
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        ArrayList<Paciente> listaPaciente = new ArrayList<>();
        ArrayList<Medico> listaMedicos = new ArrayList<>();

        Empleado p1 = new Medico("oculista", "343543543", 12000, "pepe", "salcedo", new NiF("454545", 'C', LocalDate.EPOCH));
        Empleado p2 = new Medico("dentista", "5464545", 15000, "antonio", "sanchez", new NiF("452233", 'F', LocalDate.EPOCH));
        Empleado p3 = new Administrativo(Grupo.C, "4555323", 52334, "juan", "jimenez", new NiF("456465454", 'G', LocalDate.EPOCH));
        Empleado p4 = new Administrativo(Grupo.D, "475657", 6500, "lucas", "perez", new NiF("48545458", 'F', LocalDate.EPOCH));

        Paciente pa1 = new Paciente("24564", "juan", "hernandez", new NiF("54464", 'F', LocalDate.EPOCH));
        Paciente pa2 = new Paciente("78545", "antonio", "vargas", new NiF("5874", 'J', LocalDate.EPOCH));
        Paciente pa3 = new Paciente("8545", "jesus", "jimenez", new NiF("78974", 'K', LocalDate.EPOCH));
        Paciente pa4 = new Paciente("8674", "luis", "martinez", new NiF("78545", 'P', LocalDate.EPOCH));

        // voy a contratar en el hospital a el nuevo personal usando el método
        costaDelSol.contratarEmpleado(p1);
        costaDelSol.contratarEmpleado(p2);
        costaDelSol.contratarEmpleado(p3);
        costaDelSol.contratarEmpleado(p4);

        listaEmpleados.add(p1);
        listaEmpleados.add(p2);
        listaEmpleados.add(p3);
        listaEmpleados.add(p4);

        // voy a ingresar a los pacientes en el hospial 
        costaDelSol.ingresarPaciente(pa1);
        costaDelSol.ingresarPaciente(pa2);
        costaDelSol.ingresarPaciente(pa3);
        costaDelSol.ingresarPaciente(pa4);

        listaPaciente.add(pa1);
        listaPaciente.add(pa2);
        listaPaciente.add(pa3);
        listaPaciente.add(pa4);
        // de la lista de empleados que traten al paciente pa4 con paracetamol
        for (Empleado c : listaEmpleados) {
            if (c instanceof Medico) {
                ((Medico) c).tratarPaciente(pa4, "paracetamol");

            }
        }
            // calculamos el IRPF de todos los empleados con su metodo abstracto

            for (Empleado empleado : listaEmpleados) {
                if (empleado instanceof Medico) {

                    empleado.calcularIRPF();
                }
                if (empleado instanceof Administrativo) {
                    empleado.calcularIRPF();
                }

            }

                System.out.println(pa1.toString());
                System.out.println("-------------------uso el metodo renovar NIF--------------------");
                pa1.renovarNif(LocalDate.EPOCH);
                System.out.println(pa1.toString());

    }
}
