/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nacho 2.- Implementa un programa que vaya escribiendo líneas de texto
 * en un archivo. El archivo se llamará “teclado.txt” y se creará en la raíz del
 * proyecto. El programa irá solicitando líneas de texto al usuario (cada línea
 * termina con un salto de línea , ‘\n’) y las irá escribiendo en el fichero.
 * Cuando en una nueva línea el usuario introduzca el texto “EOF”, el programa
 * terminará y esa línea no se escribirá en el fichero. Controla las posibles
 * excepciones que pudieran ocurrir.
 *
 *
 *
 *
 */
public class Ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        String idFichero = "teclado.txt";

        String texto = "";
        Scanner teclado = new Scanner(System.in);

        //   ArrayList<String> fichero = new ArrayList<>();
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {

            do {
                System.out.println("introduce los datos");
                texto = teclado.next();
                if (!texto.equalsIgnoreCase("EOF")) {
                    flujo.write(texto);
                    // Metodo newLine() añade salto de línea después de cada fila
                    flujo.newLine();
                }
//                fichero.add(texto);

            } while (!(texto.equalsIgnoreCase("EOF")));

//            for (int i = 0; i < fichero.size(); i++) {
//                if(!fichero.get(i).equalsIgnoreCase("EOF")){
//                    flujo.write(fichero.get(i));
//                    // Metodo newLine() añade salto de línea después de cada fila
//                     flujo.newLine();
//                }
//            }
            // Metodo fluh() guarda cambios en disco 
            flujo.flush();
            System.out.println("Fichero " + idFichero + " creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
