/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.vehiculos;

import java.util.Random;

/**
 *
 * @author JoseIgnacio
 */
public class Vehiculo {

    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa;
    private boolean disponible;
    private Random random;

    private static String[] colorcillo = {"Blanco", "Negro", "Azul", "Rojo", "Amarillo", "Dorado", "Morado", "Naranja"};
    private static String[] marquita = {"Peugeot", "Seat", "Ferrari", "Volkswagen", "Range Rover", "Renault", "Citroen", "Audi"};
    private static String[] modeloito = {"Clio", "Golf", "A3", "Ibiza", "Leon", "C3", "Focus", "Fiesta"};

    // el método constructor de la clase Vehiculo 
    public Vehiculo(String matricula,
            String marca, String modelo, String color, double tarifa) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = false;
    }

    public Vehiculo() {
        random = new Random();
        this.matricula = "0001 ASD";
        int posiMarca = random.nextInt(marquita.length);

        int posiModelo = random.nextInt(modeloito.length);
        int posiColor = random.nextInt(colorcillo.length);
        this.marca = marquita[posiMarca];
        this.modelo = modeloito[posiModelo];
        this.color = colorcillo[posiColor];
        this.tarifa = 40.8;
        this.disponible = false;

    }

    public void aplicarDescuentoTarifa(double descuento) {
        this.tarifa -= descuento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public static String[] getColorcillo() {
        return colorcillo;
    }

    public static void setColorcillo(String[] colorcillo) {
        Vehiculo.colorcillo = colorcillo;
    }

    public static String[] getMarquita() {
        return marquita;
    }

    public static void setMarquita(String[] marquita) {
        Vehiculo.marquita = marquita;
    }

    public static String[] getModeloito() {
        return modeloito;
    }

    public static void setModeloito(String[] modeloito) {
        Vehiculo.modeloito = modeloito;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo 
                + ", color=" + color + ", tarifa=" + tarifa + ", disponible=" + disponible + '}';
    }

}
