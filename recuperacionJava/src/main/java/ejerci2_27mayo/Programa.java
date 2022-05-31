/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerci2_27mayo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Windows10
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    
    public static void mostrarPorConsola (ArrayList<Municipio> aux){
        for (Municipio muni : aux) {
        //    muni mayorPorcentaje =Collections.max(aux,Comparator.comparing(m -> m.getPorcentaje1996()) )
        }
    }
    
    public static void generarficheros(ArrayList<Municipio> aux) {
        String idFichero = "nuevoArchivo.csv";

        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {
            flujo.write("Nombre del municipio;Porcentaje 1996;Porcentaje 2001;Porcentaje 2006;Porcentaje 2010;"
                    + "Porcentaje 2011;Porcentaje 2013;Porcentaje 2014;Porcentaje 2015;Porcentaje 2016");
            
            for (Municipio muni : aux) {
                double suma;
                double promedio;
                suma= muni.getPorcentaje1996()+muni.getPorcentaje2001()+muni.getPorcentaje2006()+muni.getPorcentaje2010()+muni.getPorcentaje2011()
                        +muni.getPorcentaje2012()+muni.getPorcentaje2013()+muni.getPorcentaje2014()+muni.getPorcentaje2015()+muni.getPorcentaje2016();
                
                promedio=suma/9;
                if(promedio<50){
                    flujo.write(muni.getNombre()+ ";" + muni.getPorcentaje1996()+ ";" + muni.getPorcentaje2001()+ ";"+  muni.getPorcentaje2006()+ ";" +muni.getPorcentaje2010()
                            + ";" + muni.getPorcentaje2011()+ ";" +muni.getPorcentaje2012()+ ";" +muni.getPorcentaje2013()+ ";" +muni.getPorcentaje2014()+ ";" +muni.getPorcentaje2015()
                                    + ";" +muni.getPorcentaje2016());
                    
                    flujo.newLine();
                   
                }
                
            }
           
            // Metodo fluh() guarda cambios en disco 
            flujo.flush();
            System.out.println("Fichero " + idFichero + " creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }

    public static void main(String[] args) {
        ArrayList<Municipio> listaMunicipios = new ArrayList<>();

        listaMunicipios = LecturaCSV.leerArchivo("indicator.csv");

        System.out.println(listaMunicipios);
        
        generarficheros(listaMunicipios);
        
        
    }
    
    
}
