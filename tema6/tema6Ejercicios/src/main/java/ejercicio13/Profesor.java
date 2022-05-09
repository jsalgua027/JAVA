/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author nacho
 */
public class Profesor extends Persona {

    private String especialidad;

    public Profesor() {
    }

    public Profesor(String especialidad, String nombre, String apellido, String NIF, Direccion direccion) {
        super(nombre, apellido, NIF, direccion);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString() + "\nProfesor{" + "especialidad=" + especialidad + '}';
    }

    @Override
    public void identificate() {
        System.out.println("Soy un profesor");
    }

}
