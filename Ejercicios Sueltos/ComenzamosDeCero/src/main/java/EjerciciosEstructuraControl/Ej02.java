/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosEstructuraControl;

import java.util.Scanner;

/**
 *
 * @author JoseIgnacio
 */
public class Ej02 {

    /**
     * 2.- Utilizando el operador ternario ?: de Java, implementa las siguientes
     * sentencias: Si el número “x” es mayor o igual que 135 se devolverá
     * “mayor”, si es menor se devolverá “menor”. Las cadenas que se devuelven
     * se guardarán en una variable llamada resultado. Si el número “x” es menor
     * o igual que cero se imprimirá en pantalla “Menor que cero”, si no se
     * imprimirá “Mayor que cero”. Guardar el valor absoluto de un número entero
     * en una variable entera (sin usar la función Math.abs())
     *
     */
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int x = datos.nextInt();
        int resultado = x;
//A)
        if (resultado >= 135) {

            System.out.println("es mayor");
        } else {
            System.out.println("es menor");
        }
//B)
        if (resultado <= 0) {
            System.out.println("Menor que cero");
        } else {
            System.out.println("Mayor que cero");
        }
//falta apartado c
    }
}
