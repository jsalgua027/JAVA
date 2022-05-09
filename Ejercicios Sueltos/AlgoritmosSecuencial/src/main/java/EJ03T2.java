
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JoseIgnacio
 */
public class EJ03T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Algoritmo que lea tres notas numéricas de tipo double y calcule la nota media.
        //Creo clase scaner para introducir datos
        Scanner entradaDatos = new Scanner(System.in);
        //declaro variables
        float nota1;
        float nota2;
        float nota3;

        //introduzco los datos al scaner
        System.out.println("Introduce nota1");
        nota1 = entradaDatos.nextFloat();
        System.out.println("Introduce nota2");
        nota2 = entradaDatos.nextFloat();
        System.out.println("Introduce nota3");
        nota3 = entradaDatos.nextFloat();

        //operaciones
        float media = (nota1 + nota2 + nota3) / 3;
        //resultado operaciones
        System.out.println("la media de las notas es=" + media);

    }

}
