/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.diseno.clases.c.ej11;

/**
 *
 * @author nacho
 */
public class Motor {

    private double cilindrada; //1.4 1.6 2.0
    private boolean estado; //true encendido

    public Motor(double cilindrada, boolean estado) {
        this.cilindrada = cilindrada;
        this.estado = estado;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }
    //getter boolean
    public boolean isEstado() {
        return estado;
    }

    public void arrancar() {
        this.estado = true;
    }

    public void parar() {
        this.estado = false;
    }

    @Override
    public String toString() {
        return "Motor{" + "cilindrada=" + cilindrada + ", estado=" + estado + '}';
    }

}
