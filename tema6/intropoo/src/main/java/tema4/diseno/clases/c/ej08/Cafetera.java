/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.diseno.clases.c.ej08;

/**
 *
 * @author JoseIgnacio
 */
//Parte de una clase: 
// 1)Definición-----> "public class Cafetera"
public class Cafetera {

    //2)Atributos, ---->"Encapsulados",campos o propiedades
    private double capacidadMaxima;
    private double cantidadActual;
    //3) los Métdos con sus constructores, Getters y Setters......toString

    //constructor cafetera vacia de 1000 litos de capacidad
    public Cafetera() {
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
        this.capacidadMaxima = capacidadMaxima;
        if (capacidadMaxima < 10) {
            this.capacidadMaxima = 10;
        }
        this.capacidadMaxima = this.cantidadActual;

    }

    public Cafetera(double capacidadMaxima, double cantidadActual) {
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
    
    
    
}

