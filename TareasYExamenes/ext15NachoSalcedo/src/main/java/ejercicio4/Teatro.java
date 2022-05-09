/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author nacho
 */
public class Teatro {
    private boolean[][] teatro;
    private boolean asientos; //true ocupado
    private int fila;
    private int columna;

    public Teatro(boolean[][] teatro, boolean asientos, int fila, int columna) {
        this.teatro = teatro;
        this.asientos = asientos;
        
        this.fila = fila;
        this.columna = columna;
    }

    
    
    
    
    
    
    public boolean[][] getTeatro() {
        return teatro;
    }

    public void setTeatro(boolean[][] teatro) {
        this.teatro = teatro;
    }

    public boolean isAsientos() {
        return asientos;
    }

    public void setAsientos(boolean asientos) {
        this.asientos = asientos;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    @Override
    public String toString() {
        return "Teatro{" + "teatro=" + teatro + ", asientos=" + asientos + ", fila=" + fila + ", columna=" + columna + '}';
    }
    
    
    
    
    
    
}
