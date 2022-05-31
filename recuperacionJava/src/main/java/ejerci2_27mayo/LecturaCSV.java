/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerci2_27mayo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import static java.nio.charset.StandardCharsets.ISO_8859_1;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class LecturaCSV {
     public static  ArrayList<Municipio> leerArchivo( String nombre){
        //Ruta archivo
        String ruta = nombre;
        // variables a usar
        String[] tokens;
        String linea;
        //Lista municipios
        ArrayList<Municipio> municipios  = new ArrayList<>();

        //Scanner para leer el archivo y crear objetos empleado para añadirlos a la lista
        try(Scanner bw = new Scanner(new FileInputStream(ruta), ISO_8859_1)) {
            bw.nextLine();
            while (bw.hasNextLine()){ //Mientras haya lineas
                
                linea= bw.nextLine();
                tokens = linea.split(";");
                
                Municipio m1 = new Municipio();
                
                m1.setCodigoM(tokens[0]);
                m1.setNombre(tokens[1]);
                m1.setPorcentaje2016(Double.parseDouble(tokens[2].replaceAll(",", ".")));
                m1.setPorcentaje2015(Double.parseDouble(tokens[3].replaceAll(",", ".")));
                m1.setPorcentaje2014(Double.parseDouble(tokens[4].replaceAll(",", "."))); 
                m1.setPorcentaje2013(Double.parseDouble(tokens[5].replaceAll(",", ".")));
                m1.setPorcentaje2012(Double.parseDouble(tokens[6].replaceAll(",", ".")));
                m1.setPorcentaje2011(Double.parseDouble(tokens[7].replaceAll(",", ".")));
                m1.setPorcentaje2010(Double.parseDouble(tokens[8].replaceAll(",", ".")));
                m1.setPorcentaje2006(Double.parseDouble(tokens[9].replaceAll(",", ".")));
                m1.setPorcentaje1996(Double.parseDouble(tokens[10].replaceAll(",", ".")));
                
                
              

                municipios.add(m1);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return municipios;
    }
    
}
