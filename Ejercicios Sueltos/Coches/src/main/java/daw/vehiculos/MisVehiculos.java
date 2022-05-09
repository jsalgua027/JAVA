/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.vehiculos;

import java.util.Arrays;

/**
 *
 * @author JoseIgnacio
 */
public class MisVehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*  //creo el objeto miCacharro le doy valores en el orden de los gets de la clase vehiculos (ojo string entre comilla
        Vehiculo miCacharro = new Vehiculo("1777CWW", "honda", "CB1000R", "BLANCA", 65.00);
        //para imprimir por pantalla uso miCacharro.get.....()
        System.out.println("Datos del vehiculo" + miCacharro.getMatricula() + " , " + miCacharro.getMarca() + " , " + miCacharro.getModelo());
        System.out.println("tarifa del vehiculo: " + miCacharro.getTarifa());
        //Para modifica algun atributo uso miCacharro.set......();
        miCacharro.setTarifa(80.00);
        System.out.println("la nueva tarifa: " + miCacharro.getTarifa());
         */

        Vehiculo[] lista = new Vehiculo[10];
        for (int i = 0; i < 10; i++) {
            Vehiculo vehiculo = new Vehiculo();
            lista[i] = vehiculo;
        }

        System.out.println(Arrays.toString(lista));

    }

}
