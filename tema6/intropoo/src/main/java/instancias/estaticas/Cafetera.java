/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package instancias.estaticas;

/**
 *
 * @author nacho
 */
public class Cafetera {

    //2)Atributos, ---->"Encapsulados",campos o propiedades
    private double capacidadMaxima;
    private double cantidadActual;
    //atributo de clase
    
    private static int contador;
    //3) los Métdos con sus constructores, Getters y Setters......toString

    //constructor cafetera vacia de 1000 litos de capacidad
    public Cafetera() {
        contador++;
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    //si la capacidad maxima es negativa pasa a positiva
    // uso el metodo math (coge el valor y lo pone en positivo)
    //public Cafetera(double capacidadMaxima) {
    // this.capacidadMaxima = Math.abs(cantidadActual);
    //}
    //constructor modificado para tener capacidad minimia y lo que pide el ejercicio
    // Métodos constructores sobrecargados---> Igual nombre y distintos parametros
    public Cafetera(double capacidadMaxima) {
        contador++;
        this.capacidadMaxima = capacidadMaxima;
        if (capacidadMaxima < 10) {
            this.capacidadMaxima = 10;
        }
        this.capacidadMaxima = this.cantidadActual;

    }

    public Cafetera(double capacidadMaxima, double cantidadActual) {
        contador++;
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = Math.abs(cantidadActual);

        if (this.capacidadMaxima < 10) {
            this.capacidadMaxima = 10;
        }
        if (this.cantidadActual > this.capacidadMaxima) {
            this.cantidadActual = this.capacidadMaxima;

        }

    }

    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }

    public void llenarCafetera() {

        this.cantidadActual = this.capacidadMaxima;
    }

    //Math.abs numero positivo
    public void servirTaza(double cantidadAServir) {
        double cantidadPositiva = Math.abs(cantidadAServir);
        if (cantidadPositiva > this.cantidadActual) {
            this.cantidadActual = 0;
        } else {
            this.cantidadActual -= cantidadPositiva;
        }
    }

    public void vaciarCafetera() {
        this.cantidadActual = 0;

    }

    public static int getContador() {
        return contador;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
