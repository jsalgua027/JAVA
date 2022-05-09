/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio7;

import java.util.ArrayList;

/**
 *
 * @author nacho
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Trabajador> empresa = new ArrayList<>();
        //estamos haciendo conversion imlicita trabajadores new Cocinero
        empresa.add(new Cocinero("postres", "pepe", "perez", "12345jj"));
        empresa.add(new Cocinero("desayunos", "antonio", "sanchez", "5678bb"));
        empresa.add(new Camarero("sala", "juan", "lucas", "85897kk"));
        empresa.add(new Camarero("barra", "nacho", "guarde", "8969oo"));

        for (Trabajador c : empresa) {
            System.out.println(c.toString());

        }

        for (Trabajador c : empresa) {
            c.cotizar();

        }
        //señalo al primer objeto del ArryList

        empresa.get(0);

        //si quiero acceder a cocinero y a un metodo suyo en particular //casting peligroso
        Cocinero c = (Cocinero) empresa.get(0);
        //  c.prepararPlato("paella");// esta es una opcion.

        //!!!! asi se hace el casting sin problemas
        if (empresa.get(0) instanceof Camarero) {
            ((Cocinero) empresa.get(0)).prepararPlato("paella");
        }
    }

}
