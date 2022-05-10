/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer12;

import ejer11.App;
import ejer11.Apps;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author JoseIgnacio
 */
public class Lectura {
       public static List<App> leecturaFicheroXML(String nombreFichero){
        List<App> appList = new ArrayList<>();
        try {
            // Crea el contexto JAXB
            JAXBContext contexto = JAXBContext.newInstance(Apps.class);

            // Crea el objeto Unmarshaller
            Unmarshaller um = contexto.createUnmarshaller();

            // Llama al método de unmarshalling

           Apps apps = (Apps) um.unmarshal(new File(nombreFichero));
            appList.addAll(apps.getAppList());
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return appList;
    }
    
}
