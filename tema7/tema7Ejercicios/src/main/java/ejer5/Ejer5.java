/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author nacho
 *
 * 5.- Implementa un programa para leer los datos del fichero del ejercicio 1.
 * El programa, al finalizar de leer la matriz debe mostrar la suma de todos los
 * valores.
 *
 *
 */
public class Ejer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //fichero a leer
        String idFichero = "matriz2.txt";

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;
        int sumaToken = 0;
      

        System.out.println("Leyendo el fichero: " + idFichero);

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try ( Scanner datosFichero = new Scanner(new File(idFichero), "UTF-8")) {
            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador de campos del fichero CSV
                tokens = linea.split("\t");
                for (String string : tokens) {
                    System.out.print(string + "\t");
                    sumaToken += Integer.parseInt(string);
                }
                System.out.println();
                System.out.println("El resultado de la suma por ahora " + sumaToken);
                
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

}
