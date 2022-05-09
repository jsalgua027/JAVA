/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nacho.examen1evalucion;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author JoseIgnacio
 */
public class Ej04 {

    /**
     * Muestra un menu por consola que muestre las siguientes opciones 1)Cuenta
     * atras 2)Juego de dados 3)Salir Se solicitara al usuario que introduzca,
     * usando sacaner una opcion entre las tres posibles Controla las posibles
     * excepciones si el ususario se equivoca y en lugar de introducir un número
     * introduce caracteres no númericos. Si la opción no es valida se volvera a
     * preguntar al usuario que opción quiere introducir. Si elige la opción
     * 3.Para salir escriba SI. el programa terminara si el usuario escribe
     * "SI","si","Si" o "sI". En caso de que el programa devuelva otra cosa
     * volverá a mostrar el menu. Es obligatorio usar la estructura Swicth.
     *
     */
    //*******PARA LEER DATOS POR TECLADO*******
    //Metodo privado el cual lee los datos por scanner 
    //y controla excepciones(que no se introduzca números en los nextInt())
    private static int leerDato(Scanner teclado) {

        boolean solicitarDatos = true;
        int numero = 0;
        do {
            try {
                //Bloque candidato a lanzar la excepcion
                System.out.println("Elige la opción: ");
                numero = teclado.nextInt();

                //Para controlar que los datos están correctamente introducidos.
                solicitarDatos = false;
            } catch (InputMismatchException ime) {

                //Código para tratar el error
                System.out.println("Se ha introducido texto en lugar de números"
                        + "\nVuelva a introducir los datos");
                teclado.nextLine();
            }
        } while (solicitarDatos); // Bucle que controla la excepción

        return numero;

    }

    public static void main(String[] args) {
        //Creamos un objeto de tipo Scanner
        Scanner teclado = new Scanner(System.in);
        //Creamos un objeto random para ver si es cara o cruz 
        //y para los números aleatorio del dado
        Random random = new Random();
        //Esta variable nos ayuda en el do/while
        String salir = "";
        //Creamos el bucle del menú
        do {
            System.out.println("\nBienvenido al juego"
                    + "\nIntroduzca 1, 2 o 3"
                    + "\n1.Cuenta atrás"
                    + "\n2.Juego de dados"
                    + "\n3.Salir");
            int opcion = leerDato(teclado);
            //El switch que utilizaremos para el programa principal
            switch (opcion) {
                //Opción para la cuenta atrás
                case 1:
                    System.out.println("Ha elegido la cuenta atrás\n");
                    for (int i = 1000; i >= 100; i -= 5) {
                        System.out.print(i + " - ");
                    }
                    System.out.println("");
                    break;

                //Opción para el juego de los dados
                case 2:
                    for (int i = 0; i < 20; i++) {

                        System.out.println("\n-----------------------------------------------\n");
                        //Aparece el número de los jugadores para que sea más intuitivo
                        //el resultado que aparece por consola
                        System.out.println("Ha elegido el juego de los dados jugador " + (i + 1));

                        System.out.println("Primero, miraremos si saca cara o cruz"
                                + "\nCon cara tira dado, con cruz no");
                        //Random que saca 1 o 2 (1 = cara, 2 = cruz)
                        int caraCruz = random.nextInt(2) + 1;

                        if (caraCruz == 1) {

                            System.out.println("Tiene oportunidad de tirar dado porque ha salido cara");
                            int resultadoDado = random.nextInt(6) + 1;

                            //Muestro el resultado del dado para saber qué premio toca.
                            System.out.println("El resultado ha sido: " + resultadoDado);
                            switch (resultadoDado) {
                                case 1:
                                case 3:
                                    System.out.println("¡Ha ganado un viaje a la charca de la Nutria!");
                                    break;
                                case 2:
                                case 6:
                                    System.out.println("¡Ha ganado un viaje al parque de los Pedregales!");
                                    break;
                                case 4:
                                case 5:
                                    System.out.println("¡Ha ganado un viaje a los dólmenes de Corominas!");
                            }
                        } else {
                            System.out.println("No tiene oportunidad de tirar dado porque ha salido cruz");
                        }
                    }

                    break;

                //Opcion para salir
                case 3:
                    System.out.println("¿Desea salir?"
                            + "\nEscriba si en caso de que sea afirmativo");
                    salir = teclado.next();
                    break;
                default:
                    System.out.println("Ha introducido un valor no válido");
            }
        } while (!salir.equalsIgnoreCase("si"));
    }
}
