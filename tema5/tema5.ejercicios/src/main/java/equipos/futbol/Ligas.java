/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipos.futbol;

import java.util.ArrayList;

/**
 *
 * @author JoseIgnacio
 */
public class Ligas {

    private ArrayList<Equipo> ligaRegional;

    public Ligas() {
        this.ligaRegional = new ArrayList<>();

    }

    //añadir equipos a la liga regional
    public void insertarEquipo(Equipo equipo) {
        if (equipo != null) {
            ligaRegional.add(equipo);
        }
    }

    // imprimir liga 
    public void imprimirLiga() {
        System.out.println("La liga esta compuesta por los equipos= ");
        ligaRegional.forEach(System.out::println);
        
    }

    //cuantos equipos forman la liga
    public int getCantidadEquipos() {

        return ligaRegional.size();
    }

    //quitamos equipo de la liga
    public boolean quitarEquipo(Equipo equipo) {

        return ligaRegional.remove(equipo);
    }

    //buscamos equipos por nombre.
    public ArrayList<Equipo> buscarPorNombreEquipo(String nombre) {
        ArrayList<Equipo> aux = new ArrayList<>();
        for (Equipo equipo : this.ligaRegional) {
            if (equipo.getEquipo().equals(aux)) {
                aux.add(equipo);
            }
        }
        return aux;
    }

    @Override
    public String toString() {
        return "Ligas{" + "ligaRegional=" + ligaRegional + '}';
    }

}
