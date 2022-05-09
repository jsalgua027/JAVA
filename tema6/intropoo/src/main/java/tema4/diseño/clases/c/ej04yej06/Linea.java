/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4.diseño.clases.c.ej04yej06;

/**
 *
 * @author nacho
 */
public class Linea {
//genero variables de la clase punto geometrico

    private PuntoGeometrico puntoA;
    private PuntoGeometrico puntoB;
//genero constructor por defecto

    public Linea() {
        this.puntoA.setCoordeX(0);
        this.puntoA.setCoordeY(0);
        this.puntoB.setCoordeX(0);
        this.puntoB.setCoordeY(0);
    }
    //genero costructor parametrizado

    public Linea(PuntoGeometrico puntoA, PuntoGeometrico puntoB) {
        this.puntoA = puntoA;
        this.puntoB = puntoB;
    }

    //genero setters y getters
    public PuntoGeometrico getPuntoA() {
        return puntoA;
    }

    public PuntoGeometrico getPuntoB() {
        return puntoB;
    }

    public void setPuntoA(PuntoGeometrico puntoA) {
        this.puntoA = puntoA;
    }

    public void setPuntoB(PuntoGeometrico puntoB) {
        this.puntoB = puntoB;
    }
    //genero tostring

    @Override
    public String toString() {
        return "Linea{" + "puntoA=" + puntoA + ", puntoB=" + puntoB + '}';
    }

   

    //metodo mover la linea a la derecha
    public void mueveDerecha(double x) {
        this.puntoA.setCoordeX((int) (puntoA.getCoordeX() + x));
        this.puntoB.setCoordeX((int) (puntoB.getCoordeX() + x));

    }

    //metodo desplaza la linea a la izquierda
    public void mueveIzquierda(double x) {
        this.puntoA.setCoordeX((int) (puntoA.getCoordeX() - x));
        this.puntoB.setCoordeX((int) (puntoA.getCoordeX() - x));

    }

    //metdo desplaza hacia arriba
    public void mueveArriba(double y) {
        this.puntoA.setCoordeY((int) (puntoA.getCoordeY() + y));
        this.puntoB.setCoordeY((int) (puntoB.getCoordeY() + y));

    }

    //metodo desplazar hacia abajo
    public void moverAbajo(double y) {
        this.puntoA.setCoordeY((int) (puntoA.getCoordeY() - y));
        this.puntoB.setCoordeY((int) (puntoB.getCoordeY() - y));

    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
