
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author nacho
 */
public class NumerosPrimos {

    /**
     * 1)
     *
     */
    public static void main(String[] args) {
        //declaro varibale para el menu do while 
        //declaro boolean para confirmar que primo es true o false y que no repita todas las comprobaciones
        int opcion;
        long datoUsuario;
        long datorandom;
        boolean primos = false;
        Scanner entraDatos = new Scanner(System.in);
        Random numAleatorio = new Random();

        do {
            System.out.println("1 Para introducir un numero");
            System.out.println("2 Para generar un numero aleatorio par");
            System.out.println("3 Para terminar");

            opcion = entraDatos.nextInt();

            switch (opcion) {
                case 1:
                    //solicito que introduzca numero
                    System.out.println("Di un numero");
                    datoUsuario = entraDatos.nextInt();
                    //condiciono que la salida del numero sea positivo
                    if (datoUsuario >= 0) {
                        System.out.println("El numero es positivo");
                        // una vez que tenemos el numero positivo confirmado condicionamos que sea impar
                        if (datoUsuario % 2 != 0) {
                            System.out.println("el numero es impar ");
                            //compruevo divisores impares entre 3 y n/2   
                            for (int i = 3; i < datoUsuario / 2; i++) {
                                primos = datoUsuario % i != 0;

                            }
                            if (primos ==true) {
                                System.out.println("Es primo");
                            } else {
                                System.out.println("No es primo");
                            }
                        } else {
                            System.out.println("el numero es par");
                        }
                    } else {

                        System.out.println("El numero incorrecto volvemos al menu");
                    }
                    break;
                case 2:
                    //genero un numero aleatorio entre 600 millones y 2
                    datorandom = numAleatorio.nextInt(600_000_000 - 2 + 1) + 2;
                    System.out.println("el numero aleatorio es= " + datorandom);
                    if (datorandom % 2 != 0) {
                        System.out.println("el numero es impar ");
                        //compruevo divisores impares entre 3 y n/2   
                        for (int i = 3; i < datorandom / 2; i++) {
                            if (datorandom % i != 0) {
                                primos = true;

                            } else {
                                primos = false;

                            }

                        }
                        if (primos == true) {
                            System.out.println("Es primo");
                        } else {
                            System.out.println("No es primo");
                        }
                    } else {
                        System.out.println("el numero es par");
                    }
                    break;
                //case 3 para salir del programa
                case 3:
                    System.out.println("Hasta luego");
                    break;
                //para que repita el programa si se equivoca al introducir el numero
                default:
                    System.out.println("te has equivocado");

            }
        } while (opcion != 3);

    }
}
