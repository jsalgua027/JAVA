/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoria_poliformismo;

/**
 *
 * @author JoseIgnacio
 */
public class Trabajador {
    
    
     private String nombre;
   private String apellidos;
   //lo cambiamos al add cocinero, y se puede ver desde alli
   protected String nif;

    public Trabajador(String nombre, String apellidos, String nif) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
    }

    public Trabajador() {
    }
    
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif + '}';
    }
   
   
   
    
    public void cotizar(){
    
        System.out.println("Cotizando como un trabajador");
    
    }
    
    
    
}
