/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14y18;

/**
 *
 * @author JoseIgnacio
 */
public class Frigorifico extends Electrodomestico implements Silencioso, Comparable<Frigorifico> {
    
    private double capacidad;

    

    public Frigorifico(double capacidad, double consumo, String modelo) {
        super(consumo, modelo);
        this.capacidad = capacidad;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return super.toString()+"Frigorifico{" + "capacidad=" + capacidad + '}';
    }

    @Override
    public void silencio() {
        System.out.println("El Frigorifico"+getCapacidad()+ "emite 50db");
    }

    @Override
    public int compareTo(Frigorifico o) {
        return (int)(this.capacidad-o.getCapacidad());
    }
    
    
    
}
