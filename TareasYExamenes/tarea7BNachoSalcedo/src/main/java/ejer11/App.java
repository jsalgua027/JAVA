/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer11;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author nacho
 */
public class App {

    private int codigo;
    private String nombre;
    private String descripcion;
    private double tamanio; // kb
    private int numeroDescargas;
    
    private int instancias;
    private Random random = new Random();
    private String[]descripciones = {"App para hacer deporte", "App para busquedas de musica", "App despertador",
                            "App para escuchar musica", "App croonometro","App busqueda de empleo", "App que te indica que partido se juega hoy",
                            "App Gps", "App de visualización de contenido", "App de java"};
    

    public App() {
        
        this.codigo = instancias;
        this.nombre = "app"+this.codigo + RandomStringUtils.randomAlphabetic(1).toUpperCase();
        this.descripcion = descripciones[random.nextInt(descripciones.length)];
        // creo el objeto de la interace------  te genera un numero random (random, entre valores, valores);
        DoubleStream doubles = random.doubles(1, 100.0, 1024.0);
        this.tamanio = doubles.max().getAsDouble();
        // creo el objeto y instancio la variable
        IntStream ints = random.ints(1, 0, 50000);
        this.numeroDescargas= ints.max().getAsInt();
        
        instancias++;
    }

    public App(int codigo, String nombre, String descripcion, double tamanio, int numeroDescargas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tamanio = tamanio;
        this.numeroDescargas = numeroDescargas;
        instancias++;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public int getNumeroDescargas() {
        return numeroDescargas;
    }

    public void setNumeroDescargas(int numeroDescargas) {
        this.numeroDescargas = numeroDescargas;
    }

    @Override
    public String toString() {
        return codigo+ " ; "+ nombre +" ; " + descripcion + " ; " + tamanio + " ; " + numeroDescargas ;
    }

    
    
    
}
