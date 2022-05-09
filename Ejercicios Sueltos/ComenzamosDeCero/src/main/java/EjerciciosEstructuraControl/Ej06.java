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
public class Ej06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // se declara variable opcion para el menu
        int opcion;

        //sacamos por pantalla el menu con las opciones disponibles
        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Círculo");
        System.out.println("4. Finalizar");
        //Imprimimos que elija una opcion y inicializamos la variable opcion con una entrada de datos
        System.out.print("Elija una opción: ");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            //si es es cierto (true) muestra por pantalla 
            System.out.println("Ha seleccionado calcular el área de un cuadrado...");
            System.out.println("Introduzca el primer lado");
            float lado1 = entrada.nextInt();
            System.out.println("Introduce el segundo lado");
            float lado2 = entrada.nextInt();
            float resultadoAreaCuadrado = (lado1 * lado2);
            System.out.println("El resultado es= " + resultadoAreaCuadrado);

        } else if (opcion == 2) {
            //si opcion es igual a 2 muestra por pantalla
            System.out.println("Ha seleccionado calcular el     área de un triángulo...");
            System.out.println("Introduzca el primer lado");
            float lado1 = entrada.nextInt();
            System.out.println("Introduce el segundo altura");
            float altura = entrada.nextFloat();
            float resultadoAreaTriangulo = (lado1 * altura) / 2;
            System.out.println("El resultado es= " + resultadoAreaTriangulo);

        } else if (opcion == 3) {
            //declaro constante PI
            final double PI = 3.14;
            System.out.println("Ha seleccionado calcular el área de un círculo...");
            System.out.println("Introduzca el radio del circulo");
            float radio = entrada.nextFloat();
            double resultadoAreaCirculo = (radio * radio) * PI;

        } else {
            System.out.println("Has elegido finalizar");
        }

    }

}
