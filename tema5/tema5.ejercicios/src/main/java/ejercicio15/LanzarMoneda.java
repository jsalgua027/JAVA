/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

import java.util.Random;

/**
 *
 * @author JoseIgnacio
 *
 *
 *
 * Escribe una clase LanzarMoneda que tenga como único atributo un array de
 * booleanos de tamaño 1000. La clase tendrá los siguientes métodos: un método
 * para rellenar el array, de forma que simule 1000 lanzamientos de una moneda.
 * El método debe almacenar el resultado de cada tirada en el array. un método
 * para saber cuántas “caras” salieron después de los lanzamientos. un método
 * para saber cuántas “cruces” salieron después de los lanzamientos. un método
 * para imprimir el resultado de los 1000 lanzamientos, de forma que aparezca el
 * número de lanzamiento y el resultado (cara o cruz)
 *
 *
 */
public class LanzarMoneda {

    private boolean[] tiradas = new boolean[1000];

    public LanzarMoneda() {
    }

    public boolean[] getTiradas() {
        return tiradas;
    }

    public void setTiradas(boolean[] tiradas) {
        this.tiradas = tiradas;
    }

    public boolean rellenarArray(boolean tipo) {

        Random numAletorio = new Random();
        int resultado = numAletorio.nextInt(2) + 1;
        for (int i = 0; i < tiradas.length; i++) {
            if (resultado == 1) {
                boolean moneda = true;//true es cara 
                tiradas[i] = moneda;
            } else {
                boolean moneda = false; // false es cruz
                tiradas[i] = moneda;
            }

        }
        return tipo;
    }
}
