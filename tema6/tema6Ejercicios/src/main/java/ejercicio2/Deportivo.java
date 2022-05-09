/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author nacho
 */
public class Deportivo extends Vehiculo {
    
    private int cilindrada;

    public Deportivo(int cilindrada, Long bastidor, String matricula, String marca, String modelo, String color, double tarifa, boolean disponible) {
        super(bastidor, matricula, marca, modelo, color, tarifa, disponible);
        this.cilindrada = cilindrada;
    }

    public Deportivo() {
    }

    
    @Override
    public String toString() {
        return "Deportivo{" + "cilindrada=" + cilindrada + '}';
    }
    
    public void nacho(){
        
        System.out.println("Soy un Deportivo");
        
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    public String getAtributos(){
    
    return super.getAtributo()+"Deportivo{" + "cilindrada=" + cilindrada + '}';
    }
    
}
