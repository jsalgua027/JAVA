/*
 *EJERCICIO 6. Reescribe el programa anterior utilizando estructuras
if-else if.
 */
package estructuraSeleccion;

import java.util.Scanner;

public class Ej06 {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
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
        
        //aplico la estructura if-else if 

        if (opcion == 1) {
            System.out.println("Ha seleccionado Calcular el área de un Cuadrado");
        }//fin else-if1
        else if (opcion ==2){
            System.out.println("Ha seleccionado Calcular el área de un Triángulo");
        }//fin else-if2
        
        else if (opcion ==3){
            System.out.println("Ha seleccionado Calcular el área de un Círculo");
        }//fin else-if3
        else if (opcion==4){
            System.out.println("Ha seleccionado terminar");
        }//fin else-if4
    }
    
}
