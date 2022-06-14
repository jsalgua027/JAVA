package daw;


import java.util.InputMismatchException;
import java.util.Scanner;


public class Aplicacion {

    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner(System.in);
        int opcion = 0;
        String matriz[][];
        boolean continuar = true;
        String fichero = "matrizP.txt";

        do {

            System.out.println("\n-------------------------");
            System.out.println("1. Leer Matriz");
            System.out.println("2. Transformar a Matriz Espejo");
            System.out.println("3. Escribir Matriz Espejo en fichero de texto");
            System.out.println("4. Leer Matriz de Mayor a Menor");
            System.out.println("5. Salir de la Aplicación");
            System.out.println("-------------------------");

            do {
                try {
                    System.out.println("Elija una opción: ");
                    opcion = entradaTeclado.nextInt();
                    continuar = false;
                } catch (InputMismatchException ime) {
                    System.out.println("Introduce un número entero.");
                    entradaTeclado.nextLine();
                }
            } while (continuar);

            switch (opcion) {
                case 1:
                    matriz = Matriz.leerDesdeFichero(fichero);
                    Matriz.mostrarMatriz(matriz);
                    break;
                case 2:
                    matriz = Matriz.leerDesdeFichero(fichero);
                    matriz = Matriz.pasarAEspejo(matriz);
                    Matriz.mostrarMatriz(matriz);
                    break;
                case 3:
                    entradaTeclado.nextLine();
                    System.out.println("Escriba el nombre del archivo: ");
                    String nombreArchivo = entradaTeclado.nextLine();
                    System.out.println(nombreArchivo);
                    matriz = Matriz.leerDesdeFichero(fichero);
                    matriz = Matriz.pasarAEspejo(matriz);
                    Matriz.escribirMatrizFichero(matriz, nombreArchivo);
                    break;
                case 4:
                    matriz = Matriz.leerDesdeFichero(fichero);
                    matriz = Matriz.ordenarMayorAMenor(matriz);
                    Matriz.mostrarMatriz(matriz);
                    break;
                case 5:
                    System.out.println("Finalizando aplicación.");
                    break;
                default:
                    System.out.println("Opción inválida, vuelva a seleccionar una adecuada, por favor.");
                    break;
            }
        } while (opcion != 5);

    }

}
