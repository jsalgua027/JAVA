/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.refactorizacionendes;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class RefactorizacionEndes {

    public static int pedirDato() {
        int numero;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce un numero entero >= 0: ");
            numero = sc.nextInt();

        } while (numero < 0);

        return numero;
    }

    public static double calculoBinario(int numero) {
        int exp = 0;
        double binario = 0;
        int digito = 0;

        while (numero != 0) {
            digito = numero % 2;
            binario = binario + digito * Math.pow(10, exp);
            exp++;
            numero = numero / 2;

            
        }
        return binario;
    }

    public static void main(String[] args) {
       int resultado= pedirDato();
       double binario= calculoBinario(resultado);
       
        System.out.printf("Binario: %.0f %n", binario);
    }
}
