/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author nacho
 */
public class Estudiante extends Persona{
    
    private String ID;

    public Estudiante() {
    }

    public Estudiante(String ID, String nombre, String apellido, String NIF, Direccion direccion) {
        super(nombre, apellido, NIF, direccion);
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return super.toString()+"Estudiante{" + "ID=" + ID + '}';
    }
   

    @Override
    public void identificate() {
       System.out.println("soy un estudiante");
    }
    
    
}
