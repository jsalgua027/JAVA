/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoria_poliformismo;

import java.util.ArrayList;

/**
 *
 * @author JoseIgnacio
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Camarero c1 = new Camarero("jefe de seccion", "manuel", "fernandez", "kdjfdfls3");

        System.out.println(c1);
        //imprime todos

        Camarero c2 = new Camarero("Sumiller");
        System.out.println(c2);
        /*c2 sale null todos los atributos del trabajador.
        pero crea el espacio de memoria,
        aunque el super no este lo ha llamad
         */

        Cocinero co1 = new Cocinero("Postres", "Sara", "garcia", "343242342-f");

        Trabajador t1 = new Trabajador("Paco", "Garca", "43543534-f");

        System.out.println("__________________________");
        System.out.println(c1);
        System.out.println(co1);
        System.out.println(t1);

        System.out.println("___________VAMOS A COTIZAR A CADA UNO___________________");
        c1.cotizar();
        co1.cotizar();
        t1.cotizar();

        /*SI TENEMOS 200 TRABAJADORES, Y QUIERO QUE COTICEN? COMO LO HAGO??*/
        ArrayList<Trabajador> listaTrabajadores = new ArrayList<>();
        //es de trabajador porque es el padre y es polimorfico el método cotizar

        listaTrabajadores.add(t1);
        listaTrabajadores.add(c1);
        listaTrabajadores.add(co1);/*INTERNAMENTE: conversión implícita
        Convert a un camarero en un trabajador
        IMPLICACIONES:
        
        No tengo que hacer comoantes c1.cotizar para cada uno
        Veamos...*/
        System.out.println("\nCON UN FOR METIÉNDOLO EN UN ARRAYlIST");
        for (Trabajador t : listaTrabajadores) {
            System.out.println(t);
            t.cotizar();
            //coge el del padre. Si alguna de las clases hijas no lo tuviera se imprime el del padre

            /*DESDE T NO PUEDO ACCEDER A LOS MÉTODOS DE COCINERO O CAMARERO
            PARA HACERLO:
            CONVERSIÓN EXPLÍCITA*/
            //si t es una instancia de Camarero
            if (t instanceof Camarero) {
                Camarero aux = (Camarero) t; //Conversión explícita
                aux.servirMesa("4");

            }

            if (t instanceof Cocinero) {
                //tmb puedo hacer CONVERSION IMPLICITA
                ((Cocinero) t).prepararPlato("Brownie");

            }

        }

    }
}
