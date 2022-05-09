/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.diseno.clases.c.ej11;

/**
 *
 * @author nacho
 */
public class Ruedas {
    
    private int diametro; //centimetros
    private boolean estado; //true inflada

    public Ruedas(int diametro, boolean estado) {
        this.diametro = diametro;
        this.estado = estado;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public boolean isEstado() {
        return estado;
    }

    public void inflar() {
        this.estado = true;
    }
    
     public void desinflado() {
        this.estado = false;
    }

    @Override
    public String toString() {
        return "Ruedas{" + "diametro=" + diametro + ", estado=" + estado + '}';
    }
    
    
    
}
