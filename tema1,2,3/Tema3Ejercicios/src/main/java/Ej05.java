
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
public class Ej05 {

    /**
     * Area cuadrado= lado*lado
     * Area de un triangulo= (lado*base)/2
     * El área del círculo es igual al valor de su radio elevado al cuadrado multiplicado por pi
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Círculo");
        System.out.println("4. Finalizar");

        System.out.print("Elija una opción: ");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            System.out.println("Ha seleccionado calcular el área de un cuadrado...");
        } else {
            if (opcion == 2) {
                System.out.println("Ha seleccionado calcular el     área de un triángulo...");
            } else {
                if (opcion == 3) {
                    System.out.println("Ha seleccionado calcular el área de un círculo...");
                } else {
                    System.out.println("Ha seleccionado terminar");
                }
            }
        }

    }

}
