/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer10;

import ejer4.Turismo;
import ejer4.Vehiculo;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author JoseIgnacio
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Escritura.crearCarpeta("copias");
        Escritura.copiarFicheros("deportivos.csv", "copias/deportivos.csv");
        Escritura.copiarFicheros("turismos.csv", "copias/turismos.csv");
        Escritura.copiarFicheros("furgonetas.csv", "copias/furgonetas.csv");

        Escritura.listarFicherosCarpeta("copias");

        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
        // relleno array lista vehiculos  con el metodo de Escritura
        Escritura.rellenarArrayDatos(listaVehiculos);

        // imprimo la lista
        listaVehiculos.forEach(System.out::println);

        // ordenar por bastidor
        // genero el criterio con la interface comparator 
        Comparator<Vehiculo> criterioBastidor = (v1, v2) -> v1.getBastidor().compareTo(v2.getBastidor());
        //le indico que lo ordene por ese criterio
        listaVehiculos.sort(criterioBastidor);
        // imprimo la lista ordenada por bastidor

        System.out.println("----------------------------Lista ordenda por número bastidor------------");

        listaVehiculos.forEach(System.out::println);

        // borro los fichero.
        Escritura.borrarFicheros("deportivos.csv");
        Escritura.borrarFicheros("turismos.csv");
        Escritura.borrarFicheros("furgonetas.csv");

        System.out.println("-----------------------Muestro carpeta original-----------------");
        Escritura.listarFicherosCarpeta("./");

        //Imprime por pantalla todos los coches blancos, distintos, ordenador por matrícula.
        listaVehiculos.stream()
                .filter(v -> v instanceof Turismo)
                .filter(v -> ((Turismo) v).getColor().equalsIgnoreCase("blanco"))//filtra
                .sorted((v1, v2) -> v1.getMatricula().compareTo(v2.getMatricula()))// ordena 
                .distinct()
                .forEach(System.out::println);
        System.out.println("---------------impirmo marcas distintas----------------------");
        // Imprime por pantalla todas las marcas de coches distintas de aquellos coches que estén disponibles.
        listaVehiculos.stream()
                .filter(v-> v.isDisponible())//flitro disponibilidad
                .map(v -> v.getMarca())//paso de un String de string
                .distinct()
                .forEach(System.out::println);

        //Saber la cantidad de vehículos Ford
        System.out.println("--------------------------¿cuantos Ford hay?--------------");
        long cantidad = listaVehiculos.stream()
                .filter(v -> v.getMarca().equalsIgnoreCase("Ford"))
                .count();
        System.out.println(cantidad);

        //Comprueba si hay algún Peugeot negro disponible en la lista.
        System.out.println("-------------------------¿hay algun peugot negro?-----------------");

        boolean estaTipoCoche = listaVehiculos.stream()
                .anyMatch(v -> v.getMarca().equalsIgnoreCase("Peugeot") && v.getColor().equalsIgnoreCase("negro"));
        System.out.println(estaTipoCoche);

    }

}
