/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interface_se_arracanca;

/**
 *
 * @author nacho
 */
public class Turismo extends Vehiculo{
    
    private int numeroPuertas;

    public Turismo(int numeroPuertas, String matricula) {
        super(matricula);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return super.toString()+"\nTurismo{" + "numeroPuertas=" + numeroPuertas + '}';
    }

    @Override
    public void repostar(String tipoCombustible) {
        System.out.println("El Turismo esta reposando"+ tipoCombustible);
    }

    @Override
    public boolean arrancar() {
         System.out.println("EL ordenador esta arracando");
        
        return true;
    }
    
    
    
    
}
