/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer10;

import ejer4.Deportivo;
import ejer4.Furgoneta;
import ejer4.Turismo;
import ejer4.Vehiculo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JoseIgnacio
 */
public class Escritura {

    public static void crearCarpeta(String nombreCarpeta) {
        Path carpeta = Paths.get(nombreCarpeta);

        try {
            if (!Files.exists(carpeta)) {
                Files.createDirectory(carpeta);
                System.out.println("Se ha creado la carpeta");
            }
        } catch (AccessDeniedException ade) {
            System.out.println("No tienes permisos");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void copiarFicheros(String rutaOrigen, String rutaDestino) {
        Path origen = Paths.get(rutaOrigen);
        Path destino = Paths.get(rutaDestino);

        try {

            if (!Files.exists(destino)) {
                Files.copy(origen, destino);
                System.out.println("Se han copiado los archivos");

            }
        } catch (IOException e) {

            e.printStackTrace();

        }

    }

    public static void listarFicherosCarpeta(String ruta) {
        Path carpeta = Paths.get(ruta);

        try {
            Files.list(carpeta).forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static ArrayList<String[]> lecturaFichero(String ruta) {
        ArrayList<String[]> datos = new ArrayList<>();
        try (Scanner sc = new Scanner(new File(ruta))) {
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                datos.add(linea.split(":"));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return datos;

    }

    public static void rellenarArrayDatos(ArrayList<Vehiculo> vehiculos) {
        ArrayList<String[]> datosDeportivos = lecturaFichero("copias/deportivos.csv");
        ArrayList<String[]> datosFurgonetas = lecturaFichero("copias/furgonetas.csv");
        ArrayList<String[]> datosTurismos = lecturaFichero("copias/turismos.csv");

        datosDeportivos.forEach(tokens -> {
            Deportivo deportivo = new Deportivo(Long.valueOf(tokens[1]), tokens[2], tokens[3], tokens[4], tokens[5], Boolean.valueOf(tokens[7]), Double.valueOf(tokens[6]), Integer.valueOf(tokens[8].substring(0, tokens[8].length() - 1)));
            vehiculos.add(deportivo);
        });

        datosFurgonetas.forEach(tokens -> {
            Furgoneta fugoneta = new Furgoneta(Long.valueOf(tokens[1]), tokens[2], tokens[3], tokens[4], tokens[5], Boolean.valueOf(tokens[7]), Double.valueOf(tokens[6]), Integer.valueOf(tokens[8]), Integer.valueOf(tokens[9].length() - 1));
            vehiculos.add(fugoneta);
        });

        datosTurismos.forEach(tokens -> {
            Turismo turismo = new Turismo(Long.valueOf(tokens[1]), tokens[2], tokens[3], tokens[4], tokens[5], Boolean.valueOf(tokens[7]), Double.valueOf(tokens[6]), Integer.valueOf(tokens[8]), Boolean.valueOf(tokens[9]));
            vehiculos.add(turismo);
        });
    }

    public static void borrarFicheros(String ruta) {
        Path fichero = Paths.get(ruta);

        if (Files.exists(fichero)) {
            try {
                Files.delete(fichero);
                System.out.println("Se ha borrado" + ruta);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
