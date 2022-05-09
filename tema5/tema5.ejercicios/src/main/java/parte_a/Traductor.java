/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte_a;

import java.util.ArrayList;
;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author nacho
 */
public class Traductor {
//declaro

    private Map<String, String> traductor;
//inicializo
//treeMap lo hace ordenado las keys
    public Traductor() {
        this.traductor = new TreeMap<>();

    }

    //introducir palabras
    public void introducirValores(String ingles, String espaniol) {
        traductor.put(ingles, espaniol);
        
    }

    //borrar las entradas   
    public void eliminarValores(String ingles) {
        traductor.remove(ingles);

    }

    // realizar la traduccion
    public String traducir(String ingles) {
        return traductor.get(ingles);

    }
    //crear lista de palabras en ingles

    public ArrayList<String> listaPalabrasIngles() {

        ArrayList<String> listaPalabrasIngles = new ArrayList<String>(traductor.keySet());

        return listaPalabrasIngles;

    }

    //crear lista de palabras en español
    public ArrayList<String> listaPalabrasEspaniol() {

        ArrayList<String> listaPalabrasEspaniol = new ArrayList<String>(traductor.values());
        return listaPalabrasEspaniol;
       
    }
        
    
    // modifiar palabras usando renplace
    
    public void modificarPalabra(String ingles, String espaniol){
        traductor.replace(ingles, espaniol);
        
    }
    // metodo para imprimir con el forech.
    public void imprimir(){
        for (String ingles : traductor.keySet()) {
            System.out.printf("clave %s -- Objeto %s %n ", ingles , traductor.get(ingles));
        }
    
    
    }
    
    //otra forma de imprimir para poder acceder al key o al value
    public void imprimir2(){
        for(Entry<String, String> aux: traductor.entrySet()){
            System.out.println(aux.getKey()+"    "+ aux.getValue());
        }
        
        
    }
    
    
}
