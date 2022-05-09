/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa;

import herencia.EnPista;
import herencia.JuegosOlimpicosVerano;
import herencia.Maraton;
import herencia.Natacion;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author nacho
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<JuegosOlimpicosVerano> juegos = new ArrayList<>();

        // aqui no solo añado objetos a la lista sino que tambien estoy haciendo una conversion implicita
        juegos.add(new EnPista(10, true, 1500, "Madrid", "1995", "Madrid"));
        juegos.add(new EnPista(15, true, 5000, "Madrid", "1995", "Madrid"));
        juegos.add(new Natacion(10, 100, true, "Atlanta", "1992", "Arlanta"));
        juegos.add(new Natacion(18, 500, true, "Miami", "2005", "Miami"));

        //imprimo el Array List
        for (JuegosOlimpicosVerano juego : juegos) {
            System.out.println(juegos.toString());
        }
        // aqui realizo una conversion explicita y tambien llamo a el metodo poliformico de la clase principal
        for (JuegosOlimpicosVerano juego : juegos) {
            if (juego instanceof EnPista) {

                System.out.println(((EnPista) juego).getParticipantes());

            }
            System.out.println(juego.tipoDeDeporte());

           // Collections.sort(juegos, JuegosOlimpicosVerano);
            
        }
        System.out.println("------------------metodo propio en pista--------------------");
        EnPista carrera1 = new EnPista(15, true, 25000, "estepona", "2008", "estepona");
        System.out.println(carrera1.Carrera());

        System.out.println("------------------metodo propio Natacion --------------------");
        Natacion carrera2 = new Natacion(5, 1500, true, "cadiz", "1981", "algeciras");

        System.out.println(carrera2.cuantosParticipantes());

        System.out.println("------------------ metodo propio maraton--------------------");
        Maraton carrera3 = new Maraton("pepe", 3, 10, true, 1500, "estepona", "2008", "estepona");
        System.out.println(carrera3.getVictorias());

    }
    
        
    
    

    // falta el Collections.sort
    //falta iterador
//    Iterator<JuegosOlimpicos>iterator = lista.iterator();
//    while(iterator.hasNext()){
//    
//    JuegosOlimpicos... next = iterator.next();
//    sout(next)
    
    }
    

