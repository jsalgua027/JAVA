/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author nacho
 */
public class Empresa {

    private ArrayList<Trabajador> trabajadores;
    private String nomEmpresa;
    private String Cif;

    public Empresa(String nomEmpresa, String Cif) {
        this.trabajadores = new ArrayList<>();

    }

    public void imprimirTrabajadores() {
        System.out.println("La empresa esta compuesta por los siguientes trabajadores");
        trabajadores.forEach(System.out::println);

    }

    public void contratarTrabajador(Trabajador trabajador) {
        if (trabajadores != null) {
            trabajadores.add(trabajador);
        }

    }

    public Trabajador despedirTrabajador(int posicion) {

        if (posicion > 0 && posicion <= trabajadores.size()) {

        }
        return trabajadores.remove(posicion);

    }

    public void ordenaNombre() {
        Collections.sort(this.trabajadores);

    }

    public int buscarNombre(Trabajador aux) {
        ordenaNombre();
        return Collections.binarySearch(trabajadores, aux);

    }

}
