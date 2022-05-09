/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interface_se_arracanca;

import java.util.ArrayList;

/**
 *
 * @author nacho
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // no puedo instanciar objetos de interface ni de clases abstractas new tal
        Vehiculo v1 = new Turismo(4, "464654");
        Ordenador o1 = new Ordenador();

        SeArranca i1 = new Ordenador();
        SeArranca i2 = v1;

        System.out.println(i1.arrancar());

        ArrayList<SeArranca> listaArrancables = new ArrayList<>();

        listaArrancables.add(v1);
        listaArrancables.add(o1);
        listaArrancables.add(new Turismo(4, "4654654"));
        listaArrancables.add(new Ordenador());

        for (SeArranca obj : listaArrancables) {

            obj.arrancar();
            if(obj instanceof Ordenador){
                System.out.println(((Ordenador)obj).getPrecio());
            }

        }

    }

}
