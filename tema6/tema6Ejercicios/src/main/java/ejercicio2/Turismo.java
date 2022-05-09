/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author nacho
 */
public class Turismo extends Vehiculo {
    private int puertas;
    private boolean marchaAutomatica;
    
    

    public Turismo(int puertas, boolean marchaAutomatica, Long bastidor, String matricula, String marca, String modelo, String color, double tarifa, boolean disponible) {
        //llamada al constructor de la superclase
        super(bastidor, matricula, marca, modelo, color, tarifa, disponible);
        this.puertas = puertas;
        this.marchaAutomatica = marchaAutomatica;
    }

    public Turismo() {
    }

    
    
    
    public int getPuertas() {
        return puertas;
    }

    public boolean isMarchaAutomatica() {
        return marchaAutomatica;
    }

    public void nacho(){
        
        System.out.println("Soy un turismo");
        
    }

    @Override
    public String toString() {
        return "Turismo{" + "puertas=" + puertas + ", marchaAutomatica=" + marchaAutomatica + '}';
    }
    
    public String getAtributos(){
    
    return super.getAtributo()+"Turismo{" + "puertas=" + puertas + ", marchaAutomatica=" + marchaAutomatica + '}';
    }
    
}
