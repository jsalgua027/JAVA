/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer11;

import java.util.Random;
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
    

    public App() {
        
        this.codigo = instancias;
        this.nombre = "app"+this.codigo + RandomStringUtils.randomAlphabetic(1).toUpperCase();
        
    }

    public App(int codigo, String nombre, String descripcion, double tamanio, int numeroDescargas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tamanio = tamanio;
        this.numeroDescargas = numeroDescargas;
    }

    
    
    
}
