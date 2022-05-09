/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interface_se_arracanca;

/**
 *
 * @author nacho
 */
public class Ordenador  implements SeArranca,Separa{
    
    private double precio;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Ordenador{" + "precio=" + precio + '}';
    }

    @Override
    public boolean arrancar() {
        System.out.println("EL ordenador esta arracando");
        return true;
    }

    @Override
    public boolean parar() {
        System.out.println("se para");
        return true;
    }
    
    
    
}
