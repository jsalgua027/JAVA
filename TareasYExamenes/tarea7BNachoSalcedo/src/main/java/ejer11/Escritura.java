/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer11;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author JoseIgnacio
 */
public class Escritura {
    
    // metodo para genera ficheros  txt
    public static void escribirFichero(String nombreFichero, List<App> datos){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(nombreFichero))) {
            for (App app : datos) {
                bw.write(app.toString());
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // metodo para generar fichero JSOn
      public static void escribirFicheroJSON(String nombre, List<App> datos){
        ObjectMapper mappeador = new ObjectMapper();

        mappeador.configure(SerializationFeature.INDENT_OUTPUT,true);

        try {
            mappeador.writeValue(new File(nombre),datos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void escribirFicheroXML(String nombre, List<App> datos){
        Apps apps = new Apps();
        apps.setAppList(datos);
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Apps.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            //Marshal the employees list in console
            jaxbMarshaller.marshal(apps, new File(nombre));


        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
    
}
