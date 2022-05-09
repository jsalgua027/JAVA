/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author nacho
 */
public class Ejer3 {

    /**
     * @param args the command line arguments
     *
     * 3.- Implementa un programa que guarde exactamente 75 líneas de texto en
     * un fichero, cuyo nombre se deja a tu elección. En cada línea se irán
     * generando letras aleatorias (entre la ‘a’ y la ‘Z’) y se irán separando
     * por punto y coma (;) hasta que la letra que se vaya a escribir sea ‘g’ o
     * ‘G’. En este caso, se escribe y se saltará a la línea siguiente. Posibles
     * ejemplos de líneas generadas:
     *
     * a;C;T;B;D;s;u;i;w;g Q;w;e;r;t;y;S;H;J;K;G ….
     *
     *
     *
     */
    public static void main(String[] args) {
        String idFichero = "ejercicio3.txt";
        Random aleatorio = new Random();
        String texto = "";
        String cadenatexto = "abcdefghijklmnñopqrstxwzABCDEFGHIJKLMNÑOPQRSTXWZ";

        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {

            for (int i = 0; i < 75; i++) {

                int stringAle = aleatorio.nextInt(cadenatexto.length());

                char caratAlet = cadenatexto.charAt(stringAle);
                //hacemos la conversion 
                texto = String.valueOf(caratAlet);

                if (texto.equalsIgnoreCase("g")) {
                    flujo.write(texto + ";");
                    flujo.newLine();
                } else {
                    flujo.write(texto + ";");
                    i--;
                }

            }
            flujo.flush();
            System.out.println("Fichero " + idFichero + " creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }

    }

}
