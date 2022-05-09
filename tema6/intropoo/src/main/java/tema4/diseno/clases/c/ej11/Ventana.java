/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.diseno.clases.c.ej11;

/**
 *
 * @author nacho
 */
public class Ventana {

    private boolean tintada; // true está tintanda
    private boolean estado;  // true abierta

    public Ventana(boolean tintada, boolean estado) {
        this.tintada = tintada;
        this.estado = estado;
    }

    public boolean isTintada() {
        return tintada;
    }
    
    public String isTintadaString(){
    String txt= tintada?"tintada":"no tintada";
    return txt;
    
    }
    
    public void setTintada(boolean tintada) {
        this.tintada = tintada;
    }

    public boolean isEstado() {
        return estado;
    }

    public void bajar() {
        this.estado = true;
    }

    public void subir() {
        this.estado = false;
    }

    @Override
    public String toString() {
        return "Ventana{" + "tintada=" + tintada + ", estado=" + estado + '}';
    }

}
