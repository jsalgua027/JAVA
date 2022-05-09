/*
 * EJERCICIO 7. Reescribe el programa anterior usando la estructura Switch.
 */
package estructuraSeleccion;

import java.util.Scanner;

public class Ej07 {

    public static void main(String[] args) {
        //método impresion por teclado
        Scanner entrada = new Scanner(System.in);

        int opcion;
        System.out.println("Menú de opciones");
        System.out.println("------------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Círculo");
        System.out.println("4. Finalizar");

        System.out.println("Elija una opción: ");
        //me guardo la variable que introduzco por teclado
        opcion = entrada.nextInt();

        //estructura if else con las opciones a imprimir
        //aplico estructura switch
        switch (opcion) {//open switch

            case 1:
                System.out.println("Ha seleccionado Calcular el área de un Cuadrado");
                break;
            case 2 :
                System.out.println("Ha seleccionado Calcular el área de un Triángulo");
                break;
            case 3:
                System.out.println("Ha seleccionado Calcular el área de un Círculo");
                break;
            case 4:
                System.out.println("Ha seleccionado finalizar");
                break;

            default:
                System.out.println("Opción no válida");
                break;

        }//close switch

    }

}
