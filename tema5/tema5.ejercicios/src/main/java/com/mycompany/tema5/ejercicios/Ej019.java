/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tema5.ejercicios;

import java.util.Scanner;

/**
 *
 * @author JoseIgnacio
 */
public class Ej019 {

    /**
     * Crear un programa que mediante un menú permita reservar o cancelar
     * asientos de un avión, así como mostrar qué asientos están ocupados y
     * libres actualmente. El avión tendrá 25 filas de 4 asientos cada una.
     *
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean salir = true;
        boolean asiento; //true ocupado; false vacio
        int asientosReservados;
        int filaReservada;
        int columnaReservada;
        int contador = 0;
        boolean[][] avion = new boolean[25][4];
        //genero el avion totalmente vacio
        for (int i = 0; i < avion.length; i++) {
            for (int j = 0; j < avion[i].length; j++) {
                avion[i][j] = false;
            }
        }

        do {
            System.out.println("\nBienvenidos a aerolianas Macfly"
                    + "\nIntroduzca 1, 2, 3, 4"
                    + "\n1.Reservar"
                    + "\n2.Cancelar"
                    + "\n3.Mostrar ocupacion"
                    + "\n4.Salir");
            int opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("has elegido reservar, estos son los asientos libres");
                    for (int i = 0; i < avion.length; i++) {
                        System.out.println();
                        for (int j = 0; j < avion[i].length; j++) {
                            System.out.print(" " + avion[i][j]);
                        }
                    }
                    System.out.println("\n¿Cuantos asientos quieres?");
                    asientosReservados = teclado.nextInt();
                    do {
                        System.out.println("\n Hay 25 filas,¿Que fila quieres?");
                        filaReservada = teclado.nextInt() - 1;
                        if (filaReservada < 0) {
                            System.out.println("fila erronea vuelve a repetir");
                        } else {
                            System.out.println("\nPor cada fila hay cuatro asientos,¿que asiento quieres?");
                            columnaReservada = teclado.nextInt();
                            if (columnaReservada >= 0) {
                                if (avion[filaReservada][columnaReservada] == false) {
                                    avion[filaReservada][columnaReservada] = true;
                                     contador++;
                                } else {
                                    System.out.println("el asiento esta ocupado");

                                }
                            } else {
                                System.out.println("Asiento erroneo vuelve a repetir");
                            }

                           
                        }
                    } while (contador < asientosReservados);
                    break;
                case 2:
                    System.out.println("¿Has elegido cancelar");

                    System.out.println("\n¿Cuantos asientos reservaste?");
                    asientosReservados = teclado.nextInt();
                    do {
                        System.out.println("\n Hay 25 filas,¿Que fila elegiste?");
                        filaReservada = teclado.nextInt() - 1;
                        if (filaReservada < 0) {
                            System.out.println("fila erronea vuelve a repetir");
                        } else {
                            System.out.println("\n¿que asiento elegiste?");
                            columnaReservada = teclado.nextInt();
                            if (columnaReservada >= 0) {
                                if (avion[filaReservada][columnaReservada] == true) {
                                    avion[filaReservada][columnaReservada] = false;
                                } else {
                                    System.out.println("el asiento esta libre");
                                }

                            } else {
                                System.out.println("Asiento erroneo vuelve a repetir");
                            }

                            contador++;
                        }
                    } while (contador < asientosReservados);

                    break;
                case 3:
                    System.out.println("Vamos a ver los asientos libres");

                    for (int i = 0; i < avion.length; i++) {
                        System.out.println();
                        for (int j = 0; j < avion[i].length; j++) {
                            System.out.print(" " + avion[i][j]);
                        }
                    }

                    break;
                case 4:

                    System.out.println("salimos");
                    salir = false;
                    break;
                default:
                    System.out.println("Has introducido una opcion erronea");

            }

        } while (salir != false);

    }

}
