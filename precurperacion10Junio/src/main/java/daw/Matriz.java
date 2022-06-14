/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlos
 */
public class Matriz {

    public static String[][] leerDesdeFichero(String nombreFichero) {

        String linea;
        int filaActual = 0;

        int filasMatriz = numeroFilasMatriz(nombreFichero);
        int columnasMatriz = numeroColumnasMatriz(nombreFichero);

        String[][] matriz = new String[filasMatriz][columnasMatriz];
        String[] tokens;

        System.out.println("Leyendo el fichero: " + nombreFichero);

        try ( Scanner datosFichero = new Scanner(new File(nombreFichero), "UTF-8")) {

            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine();

                tokens = linea.split(",");

                matriz[filaActual] = tokens;

                filaActual++;

            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return matriz;

    }

    public static void escribirMatrizFichero(String[][] matriz, String nombreFichero) {
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(nombreFichero))) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    // Si es el último de la fila no pone la coma
                    if (j == matriz[0].length - 1) {
                        // Usamos metodo write() para escribir en el buffer
                        flujo.write(matriz[i][j]);
                    }else{
                        flujo.write(matriz[i][j] + ",");
                    }
                }
                flujo.newLine();
            }
            flujo.flush();
        } catch (IOException ex) {
            System.out.println("No se ha podido genear el fichero");;
        }
    }

    public static int numeroFilasMatriz(String nombreFichero) {

        int contadorFilas = 0;

        try ( Scanner datosFichero = new Scanner(new File(nombreFichero), "UTF-8")) {

            while (datosFichero.hasNextLine()) {
                datosFichero.nextLine();
                contadorFilas++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("El fichero no existe.");
        }

        return contadorFilas;

    }

    public static int numeroColumnasMatriz(String nombreFichero) {

        String linea;
        String[] tokens;
        int contadorColumnas = 0;

        try ( Scanner datosFichero = new Scanner(new File(nombreFichero), "UTF-8")) {

            linea = datosFichero.nextLine();

            tokens = linea.split(",");

            contadorColumnas = tokens.length;

        } catch (FileNotFoundException e) {
            System.out.println("El fichero no existe.");
        }

        return contadorColumnas;

    }

    public static void mostrarMatriz(String[][] matriz) {
        for (String[] strings : matriz) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println("");
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int[] ints : matriz) {
            for (int numero : ints) {
                System.out.print(numero + " ");
            }
            System.out.println("");
        }
    }

    private static int[][] convertirMatrizInt(String[][] matriz) {

        int[][] matrizInt = new int[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matrizInt[i][j] = Integer.valueOf(matriz[i][j]);
            }

        }
        return matrizInt;
    }
    
    private static String[][] convertirMatrizString(int[][] matriz) {

        String[][] matrizS = new String[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matrizS[i][j] = String.valueOf(matriz[i][j]);
            }

        }
        return matrizS;
    }

    public static String[][] pasarAEspejo(String[][] matriz) {

        String[][] matrizEspejo = new String[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matrizEspejo[i][matriz[0].length - 1 - j] = matriz[i][j];
            }

        }

        return matrizEspejo;
    }
    
    public static String[][] ordenarMayorAMenor(String[][] matriz){
        
        int[][] matrizNumeros = convertirMatrizInt(matriz);
        
        for (int[] matrizNumero : matrizNumeros) {
            Arrays.sort(matrizNumero);
        }
        
        matriz = convertirMatrizString(matrizNumeros);
        matriz = pasarAEspejo(matriz);
        
        return matriz;
    }

   
}
