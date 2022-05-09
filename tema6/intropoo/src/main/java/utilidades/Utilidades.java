/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author JoseIgnacio
 */
public class Utilidades {

    public static int generarAleatorio(int minimo, int maximo) {
        Random aleatorio = new Random();
        int numAleatorio = aleatorio.nextInt(maximo - minimo + 1) + minimo;
        return (numAleatorio);
    }

    public static int entradaDatos() {
        Scanner entradaDatos = new Scanner(System.in);
        int datos = entradaDatos.nextInt();
        return datos;
    }

}
