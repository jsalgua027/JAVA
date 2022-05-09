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
public class Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("escanear edad:");

        int edad = scanner.nextInt();

        String texto = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";

        System.out.println(" si tienes " + edad + "años, entonces: ");
        System.out.println(texto);

    }

}
