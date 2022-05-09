/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author nacho
 */
public class Senador extends Legislador {

    private double complemento;

    public Senador() {
    }

    public Senador(double complemento, String provincia, String partidoPolitico, String nombre, String apellidos) {
        super(provincia, partidoPolitico, nombre, apellidos);
        this.complemento = complemento;
    }

    public double getComplemento() {
        return complemento;
    }

    public void setComplemento(double complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return super.toString() + " \n Senador{" + "complemento=" + complemento + '}';
    }

    @Override
    public String getCamaraEnQueTrabaja() {

        return "Es un Senador";
    }

}
