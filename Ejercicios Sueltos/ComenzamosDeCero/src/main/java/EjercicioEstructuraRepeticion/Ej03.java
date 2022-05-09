/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioEstructuraRepeticion;

/**
 *
 * @author JoseIgnacio
 */
public class Ej03 {

    /**
     * Realizar un programa que imprima 25 términos de la serie 15 - 30 - 60 -
     * 120, etc. No se introducen valores por teclado.
     *
     */
    public static void main(String[] args) {
        int totalTerminos = 25;
        int valorInicial = 15;
        int multiplicador = 2;
        int aux = valorInicial;

        for (int i = 0; i <= totalTerminos; i++) {

            System.out.println("el resultado es= " + aux);

            aux *= multiplicador;

        }

    }

}
