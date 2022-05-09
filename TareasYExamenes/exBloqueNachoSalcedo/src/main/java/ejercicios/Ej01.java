package ejercicios;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author nacho
 */
public class Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaro varibles oara trabajar la ecuacion

        double a;
        double b;
        double c;
        
        double resultadoCondicion;
        double resultadoFinal1;
        double resultadoFinal2;
        //llamo a la clase Scanner
        Scanner numSolicitado = new Scanner(System.in);
        System.out.println("introduce a=");
        a = numSolicitado.nextDouble();
        System.out.println("introduce b=");
        b = numSolicitado.nextDouble();
        System.out.println("introduce c=");
        c = numSolicitado.nextDouble();
        //introdcuco condiciones según ejercicio apartado 1 y 2
        if (a == 0 || b == 0) {
            System.out.println("Este ejercicio no tiene solucion");

        } else;
        if (a == 0 || b != 0) {
            resultadoCondicion= -c / b;
            System.out.println("el resultado es=" + resultadoCondicion);

        } else;
        //cumpliendo las dos condiciones obtengo resultados apartado 3 del ejercicio.
        
        resultadoFinal1=(-b + Math.sqrt((b*b-4a*c)));
        
    }

}
