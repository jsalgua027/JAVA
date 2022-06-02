/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerci3_27mayo;

import ejerci2_27mayo.Municipio;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import static java.nio.charset.StandardCharsets.ISO_8859_1;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class LecturaArchivo {

    public static String[][] leerArchivo(String nombre) {
        //Ruta archivo
        String ruta = nombre;
        // variables a usar
        String[] tokens;
        String linea;
        int i = 0;

        String[][] matriz = new String[5][5];

        //Scanner para leer el archivo y crear objetos empleado para añadirlos a la lista
        try ( Scanner bw = new Scanner(new FileInputStream(ruta), ISO_8859_1)) {
           // bw.nextLine();
            while (bw.hasNextLine()) { //Mientras haya lineas

                linea = bw.nextLine();
                tokens = linea.split(" ");

                matriz[i] = tokens;
                i++;

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return matriz;
    }

}
