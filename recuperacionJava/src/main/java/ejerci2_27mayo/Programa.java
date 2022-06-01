/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerci2_27mayo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
    
    // Metodo para crear carpetas(directorios)
     public static void crearDirectorio(String ruta) {

        Path directory = Paths.get(ruta);
        try {
            Files.createDirectory(directory);
        } catch (FileAlreadyExistsException faee) {
            System.out.println("No se puede crear " + ruta + " porque ya existe");
        } catch (AccessDeniedException ade) {
            System.out.println("No tiene permisos para crear " + ruta);
        } catch (IOException e) {
            System.out.println("Problema creando el directorio " + ruta);
            System.out.println("Seguramente la ruta está mal escrita o no existe");
        }

    }
    
    
    
    public static void mostrarPorConsola (ArrayList<Municipio> aux){
        //uso dos listas mas para sacar los porcentajes
        // listaMaxMuni para solo tener los porcentajes por municipos 
        // listaMaxUnMuni para tener solo los valores maximos
       String nombreMuniciPorceMax="";
       double porcentajeMax= 0.0;
       int anio=0;
       
       
        for (Municipio muni : aux) {
                ArrayList<Double> listaMaxUnMuni =new ArrayList<>();
                ArrayList<Double> listaMaxUnMuniCopia =new ArrayList<>();
                
                listaMaxUnMuni.add(muni.getPorcentaje1996());
                listaMaxUnMuni.add(muni.getPorcentaje2001());
                listaMaxUnMuni.add(muni.getPorcentaje2006());
                listaMaxUnMuni.add(muni.getPorcentaje2010());
                listaMaxUnMuni.add(muni.getPorcentaje2011());
                
                listaMaxUnMuni.add(muni.getPorcentaje2013());
                listaMaxUnMuni.add(muni.getPorcentaje2014());
                listaMaxUnMuni.add(muni.getPorcentaje2015());
                listaMaxUnMuni.add(muni.getPorcentaje2016());
                listaMaxUnMuniCopia.addAll(listaMaxUnMuni);
                //ordeno de menos a mayor
                listaMaxUnMuniCopia.sort((c1,c2)->Double.compare(c1, c2));
                if (listaMaxUnMuniCopia.get(listaMaxUnMuniCopia.size())> porcentajeMax){
                    porcentajeMax= listaMaxUnMuniCopia.get(listaMaxUnMuniCopia.size());
                    nombreMuniciPorceMax= muni.getNombre();
                    int indice =0;
                    indice = listaMaxUnMuni.indexOf(porcentajeMax);
                    switch (indice) {
                        case 0:
                                anio= 1996;
                            break;
                        case 1:
                                anio= 2001;
                            break;
                        case 2:
                                anio= 2006;
                            break;
                        case 3:
                                anio= 2010;
                            break;
                        case 4:
                                anio= 2011;
                            break;
                        case 5:
                                anio= 2013;
                            break;
                        case 6:
                                anio= 2014;
                            break;
                        case 7:
                                anio= 2015;
                            break;
                        case 8:
                                anio= 2016;
                            break;
                        
                    }
                    
                    
                } 
        }
        
         System.out.println(nombreMuniciPorceMax+porcentajeMax);
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
                        +muni.getPorcentaje2013()+muni.getPorcentaje2014()+muni.getPorcentaje2015()+muni.getPorcentaje2016();
                
                promedio=suma/9;
                if(promedio<50){
                    flujo.write(muni.getNombre()+ ";" + muni.getPorcentaje1996()+ ";" + muni.getPorcentaje2001()+ ";"+  muni.getPorcentaje2006()+ ";" +muni.getPorcentaje2010()
                            + ";" + muni.getPorcentaje2011()+ ";" + ";" +muni.getPorcentaje2013()+ ";" +muni.getPorcentaje2014()+ ";" +muni.getPorcentaje2015()
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
        
        System.out.println("----------------------------------------------------------------");
        
        mostrarPorConsola(listaMunicipios);
        
        
        crearDirectorio("Municipios");
        crearDirectorio("Municipios/Municipios2");
    }
    
    
}
