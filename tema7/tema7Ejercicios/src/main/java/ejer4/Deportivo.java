/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer4;

/**
 *
 * @author nacho
 */
public class Deportivo extends Vehiculo {
    
    
       private int cilindrada; // Atributo específico para Deportivo

    public Deportivo(Long bastidor, String matricula, String marca, String modelo, String color,boolean disponible, double tarifa, int cilindrada) {
        super(bastidor, matricula, marca, modelo, color, disponible, tarifa); // Constructor padre
        this.cilindrada = cilindrada;
    }
// métodos ‘get’ de la subclase Deportivo. Se omiten setters 

    public Deportivo() {
    }

    

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    

    public int getCilindrada() {
        return this.cilindrada;
    }
    
    @Override
    public String getAtributos() {
        return super.getAtributos() + "; " + this.cilindrada;
    }

    @Override
    public String toString() {
        return "1:" + super.toString() + ":" + cilindrada;
    }
    
    
    
    
    
    

}
