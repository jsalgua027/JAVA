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
public class Ej05 {

    /**
     * Implementa y completa el siguiente programa. Ten en cuenta que cuando se
     * entre en cada una de las opciones (1,2 o 3) el programa realice su
     * función. Esto es, si se selecciona la opción 1, el programa debe entrar
     * en la parte de calcular el área de un cuadrado y debe solicitar los dos
     * lados y mostrar el resultado. Así con el resto de opciones.
     *
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
        //Comenzamos estructura de selección, si opcion es igual a 1
        if (opcion == 1) {
            //si es es cierto (true) muestra por pantalla 
            System.out.println("Ha seleccionado calcular el área de un cuadrado...");
            System.out.println("Introduzca el primer lado");
            float lado1 = entrada.nextInt();
            System.out.println("Introduce el segundo lado");
            float lado2 = entrada.nextInt();
            float resultadoAreaCuadrado = (lado1 * lado2);
            System.out.println("El resultado es= " + resultadoAreaCuadrado);
            //sino se se comple se else
        } else {
            //si entra en else ponemos ponemos otro if para que se cumpla la siguente condición.
            if (opcion == 2) {
                //si opcion es igual a 2 muestra por pantalla
                System.out.println("Ha seleccionado calcular el     área de un triángulo...");
                System.out.println("Introduzca el primer lado");
                float lado1 = entrada.nextInt();
                System.out.println("Introduce el segundo altura");
                float altura = entrada.nextFloat();
                float resultadoAreaTriangulo = (lado1 * altura) / 2;
                System.out.println("El resultado es= " + resultadoAreaTriangulo);
                //sino se cumple su else correspondiente
            } else {
                if (opcion == 3) {
                    //declaro constante PI
                    final double PI = 3.14;
                    System.out.println("Ha seleccionado calcular el área de un círculo...");
                    System.out.println("Introduzca el radio del circulo");
                    float radio = entrada.nextFloat();
                    double resultadoAreaCirculo = (radio * radio) * PI;

                } else {
                    System.out.println("Ha seleccionado terminar");
                }
                //se repite la dinamica hasta terminar todo el menu de opciones
            }

        }
    }
}
