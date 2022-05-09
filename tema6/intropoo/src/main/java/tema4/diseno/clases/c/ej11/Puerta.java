/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.diseno.clases.c.ej11;

/**
 *
 * @author nacho
 */
public class Puerta {
    
    private boolean estado; // abierta true
    private Ventana ventana;

    public Puerta(boolean estado, Ventana ventana) {
        this.estado = estado;
        this.ventana = ventana;
    }

    public boolean isEstado() {
        return estado;
    }

    public void abrir() {
        this.estado = true ;
    }
    
    public void cerrar() {
        this.estado = false;
    }

    public Ventana getVentana() {
        return ventana;
    }

    public void setVentana(Ventana ventana) {
        this.ventana = ventana;
    }
        // hay que implementar tostring en ventana
    @Override
    public String toString() {
        return "Puerta{" + "estado=" + estado + ", ventana=" + ventana + '}';
    }
    
    
    
    
    
}
