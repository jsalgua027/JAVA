/*
 * EJERCICIO 5  
 */
package estructuraSeleccion;

import java.util.Scanner;

public class Ej05 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //Defino variable
        int opcion;
        System.out.println("Menú de opciones");
        System.out.println("------------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Círculo");
        System.out.println("4. Finalizar");

        System.out.println("Elija una opción: ");
        //me guardo la variable que introduzco por teclado
        opcion = teclado.nextInt();

        //introduzco las variables if y else 
        if (opcion == 1) {
            System.out.println("Ha seleccionado Calcular el área de un Cuadrado ");
        }//close if 1
        //todo lo que no  sea opción 1 lo meto en else 1
        else {
            //si no es 1 paso al siguiente

            if (opcion == 2) {
                System.out.println("Ha seleccionado Calcular el área de un "
                        + "Triángulo ");

            }//close if 1 
            //todo lo que no sea condición 2,, abro  else2
            else {
                //todo lo que no sea ni 1 ni 2
                if (opcion == 3) {
                    System.out.println("Ha seleccionado Calcular el área de un "
                            + "Círculo ");
                }//close if3
                //si no es ni 1 ni 2 ni 3, la cuarta que es de fin, else4
                else {
                    System.out.println("Ha seleccionado terminar");
                }//close else4

            }//close else2

        }//close else1

    }

}
