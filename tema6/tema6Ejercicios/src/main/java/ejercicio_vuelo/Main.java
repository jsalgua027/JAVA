/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_vuelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author JoseIgnacio
 */
public class Main {
 // la clave es nombre destino y me devuelve la cantidad de pasajeros
 // necesito crear dentro del metodo el HashMap
 // si se repite el destino se suman los pasajeros   
    public static HashMap<String, Integer> nombreCiudad(ArrayList<Vuelo> aux) {
        HashMap<String, Integer> listaDestino = new HashMap<>();
        for (Vuelo vuelo : aux) {
            if (listaDestino.containsKey(vuelo.getDestino())) {
                listaDestino.replace(vuelo.getDestino(), listaDestino.get(vuelo.getDestino()) + vuelo.getLista().size());
            }else {
                 listaDestino.put(vuelo.getDestino(), vuelo.getLista().size());
            }
           
        }

        return listaDestino;
    }
    // recibe lista de vuelos y devuelve lista TreeMap(ordenada po la clave que to le meto) que en este caso la clave es la ciudad

    public static TreeMap<String, Integer> ordenarPorciudad(ArrayList<Vuelo> aux) {
        TreeMap<String, Integer> mapAout = new TreeMap<>();
        for (Vuelo vuelo : aux) {
            mapAout.put(vuelo.getDestino(), vuelo.getLista().size());
        }

        return mapAout;

    }
    //a partir de un codigo de vuelo obtengo la lista pasajeros
    public static HashMap<Integer, ArrayList<Pasajeros>> pasajeros(ArrayList<Vuelo> aux) {
        HashMap<Integer, ArrayList<Pasajeros>> auxi = new HashMap<>();
        for (Vuelo vuelo : aux) {
            auxi.put(vuelo.getCodvuelo(), vuelo.getLista());
        }
        return auxi;

    }

    public static void main(String[] args) {

        ArrayList <Vuelo> listaVuelos = new ArrayList<>();
        
        
        Pasajeros p1 = new Pasajeros("pepe", "sanchez");
        Pasajeros p2 = new Pasajeros("maria", "perez");
        Pasajeros p3 = new Pasajeros("laura", "hernandez");
        Pasajeros p4 = new Pasajeros("nacho", "salcedo");
        Pasajeros p5 = new Pasajeros("antonio", "sanchez");
        Pasajeros p6 = new Pasajeros("juan", "cortes");

        ArrayList<Pasajeros> listaPasejeros = new ArrayList<>();
        ArrayList<Pasajeros> listaPasejeros2 = new ArrayList<>();
        ArrayList<Pasajeros> listaPasejeros3 = new ArrayList<>();
        ArrayList<Pasajeros> listaPasejeros4 = new ArrayList<>();

        //añado pasajeros a una lista de pasajeros 
        listaPasejeros.add(p1);
        listaPasejeros.add(p2);
        listaPasejeros.add(p3);

        listaPasejeros2.add(p4);
        listaPasejeros2.add(p5);
        listaPasejeros2.add(p6);

        listaPasejeros3.add(p2);
        listaPasejeros3.add(p6);
        listaPasejeros3.add(p3);

        listaPasejeros4.add(p1);
        listaPasejeros4.add(p4);
        listaPasejeros4.add(p5);

        //una vez que tengo la lista de pasajeros puedo crear el objeto vuelo que contiene lista de pasajeros
        Vuelo v1 = new Vuelo(124, "malaga", "madrid", 2, listaPasejeros);
        Vuelo v2 = new Vuelo(125, "paris", "barcelona", 1, listaPasejeros2);
        Vuelo v3 = new Vuelo(126, "gibraltar", "londres", 4, listaPasejeros3);
        Vuelo v4 = new Vuelo(127, "malaga", "hawai", 12, listaPasejeros4);
        Vuelo v5 = new Vuelo(128, "malaga", "hawai", 12, listaPasejeros2);
        
        
        listaVuelos.add(v1);
        listaVuelos.add(v2);
        listaVuelos.add(v3);
        listaVuelos.add(v4);
        listaVuelos.add(v5);
        
        System.out.println("-----------------cantidad de pasajeros por destino-------------");
        
        System.out.println(nombreCiudad(listaVuelos)); 
        
        System.out.println("-----------ordeno por destino----------------");
        
        System.out.println(ordenarPorciudad(listaVuelos));
        
        System.out.println("---------------metodo saca lista de pasajeros---------");
        
        System.out.println(pasajeros(listaVuelos)); 

    }

    
    
    
    
}
