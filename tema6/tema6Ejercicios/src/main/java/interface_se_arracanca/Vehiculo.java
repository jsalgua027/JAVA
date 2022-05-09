/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interface_se_arracanca;

/**
 *
 * @author nacho
 */
public abstract class Vehiculo implements SeArranca, Separa, Comparable<Vehiculo>{
    
    
    private String matricula;
    
    public abstract void repostar(String tipoCombustible);

    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + '}';
    }
    
    // al implementar la interface esta clase deberia dar codigo a arranca(), pero  al ser
    // abstracta puede dejarlo que lo hagan las clases hijas
    
//    public boolean arrancar (String tipoCombustible){
//        
//        System.out.println("el turismo esta respostando"+tipoCombustible);
//        return true;
//    }
    
    
    @Override
     public boolean parar() {
        System.out.println("se para");
        return true;
    }
    
    @Override
    public int compareTo (Vehiculo v){
        return this.matricula.compareTo(v.matricula);
    }
     
}
