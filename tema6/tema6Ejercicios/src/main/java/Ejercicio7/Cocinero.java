/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author nacho
 */
public class Cocinero extends Trabajador {

    private String partida;

    public Cocinero(String partida, String nombre, String apellidos, String nif) {
        super(nombre, apellidos, nif);
        this.partida = partida;

        //this.nif = nif;
    }

    public Cocinero(String partida) {
        this.partida = partida;
    }

    public Cocinero() {
    }

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Cocinero{" + "partida=" + partida + '}';
    }

    @Override
    public void cotizar() {
        System.out.println("Cotizando como cocinero");
    }

    //un metodo que SOLO DO EL COCINERO
    public void prepararPlato(String plato) {
        System.out.println("Cocinando el plato " + plato);

    }

}
