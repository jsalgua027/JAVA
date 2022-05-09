/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tares6b;

/**
 *
 * @author nacho
 */
public class Administrativo extends Empleado {

    private Grupo grupo;

    public Administrativo() {
    }

    public Administrativo(Grupo grupo, String numeroSeguridadSocial, double salario, String nombre, String apellidos, NiF numeroIdentificacion) {
        super(numeroSeguridadSocial, salario, nombre, apellidos, numeroIdentificacion);
        this.grupo = grupo;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return super.toString() + "Administrativo{" + "grupo=" + grupo + '}';
    }

    //metodo sobreecirto
    @Override
    public double calcularIRPF() {
//        double resultado = 0;
//        switch (this.grupo) {
//            case C:
//                resultado = getSalario() * 0.175;  estas son dos opciones
//                break;
//            case D:
//                resultado = getSalario() * 0.18;
//                break;
//            case E:
//                resultado = getSalario() * 0.185;
//                break;
//
//        }
//
//        return resultado;
        return this.getSalario()*grupo.getIrpf();

    }
    
    public void regitrarDocumento(String nombreDocumento){
    
        System.out.println(nombreDocumento+getNombre()+getApellidos()+nombreDocumento.hashCode());
    }

}
