/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author nacho
 */
public class Furgoneta extends Vehiculo {

    private int carga;
    private int volumen;

    public Furgoneta(int carga, int volumen, Long bastidor, String matricula, String marca, String modelo, String color, double tarifa, boolean disponible) {
        super(bastidor, matricula, marca, modelo, color, tarifa, disponible);
        this.carga = carga;
        this.volumen = volumen;
    }

    public Furgoneta() {
    }
    

    @Override
    public String toString() {
        return "Furgoneta{" + "carga=" + carga + ", volumen=" + volumen + '}';
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    
     public void nacho(){
        
        System.out.println("Soy una Furfoneta");
        
    }
    
    public String getAtributos(){
        return super.getAtributo()+"Furgoneta{" + "carga=" + carga + ", volumen=" + volumen + '}';
        
    }
}
