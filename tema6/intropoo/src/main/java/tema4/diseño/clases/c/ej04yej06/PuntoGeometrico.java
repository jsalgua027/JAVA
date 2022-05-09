/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4.diseño.clases.c.ej04yej06;

/**
 *
 * @author nacho
 */
public class PuntoGeometrico {
// genero las coordenadas

    private int x;
    private int y;

    //constructor por defecto
    public PuntoGeometrico(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //constructor parametrizado

    public PuntoGeometrico() {
        this.x = 0;
        this.y = 0;
    }
    //genero getter, setters

    public int getCoordeX() {
        return x;
    }

    public int getCoordeY() {
        return y;
    }

    public void setCoordeX(int x) {
        this.x = x;
    }

    public void setCoordeY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "PuntoGeometrico{" + "x=" + x + ", y=" + y + '}';
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
