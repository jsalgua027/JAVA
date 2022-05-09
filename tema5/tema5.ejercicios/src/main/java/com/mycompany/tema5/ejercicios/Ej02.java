/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tema5.ejercicios;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Ej02 {

    /**
     * Escribe un programa para leer la altura de un número determinado de
     * personas y calcular la altura media. El número de personas se pide por
     * teclado y debe ser entero un entero mayor que cero. Posteriormente el
     * programa irá pidiendo la altura, en cm, de cada una de las personas y las
     * guardará en una estructura de almacenamiento. Si la altura leída no es
     * positiva, el programa la pasará a número positivo. También es necesario
     * saber cuántas personas tienen una altura superior a la media e inferior a
     * la media. *
     */
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        double sumaAlturas = 0;
        double media = 0;
        int personasPorEncima = 0;
        int personasPorDebajo = 0;
        System.out.println("Introduce un numero de personas a participar ");
        int numPerso = entradaDatos.nextInt();
        //primero el error----numeros negativos incluidos en el cero
        if (numPerso < 0) {
            System.out.println("el numero de personas es erroneo");

        } else {
            // genero el array con la entrada de datos para el indice
            double altPersonas[] = new double[numPerso];

            System.out.println("Introduce la altura de cada persona");

            for (int i = 0; i < altPersonas.length; i++) {
                System.out.println("introduce la altura de la persona " + i);// si pongo (i+1) por pantalla aparece la persona 1 no la 0 
                altPersonas[i] = Math.abs(entradaDatos.nextDouble());//La clase Match.abs tranforma el resultado en valor absoluto.
                //con esto optenemos la suma de todos los valores del array
                sumaAlturas += altPersonas[i];

            }
            // obtenemos la media de las alturas; total de alturas / total de personas
            media = sumaAlturas / numPerso;

            for (int i = 0; i < altPersonas.length; i++) {
                //si media esta por debajo 
                if (media < altPersonas[i]) {
                    //contador
                    personasPorDebajo++;
                    //sino (media por encima)
                } else {
                    // contador
                    personasPorEncima++;

                }

            }
            //imprimo resultados
            System.out.println("Por encima de la media=" + personasPorEncima);
            System.out.println("Por debajo de la media=" + personasPorDebajo);
        }

    }
}
