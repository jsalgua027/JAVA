/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author nacho
 */
public class Direccion {
    
    private String nombreCalle;
    private String nombreCiudad;
    private String codigoPostal;
    private String nombrePais;

    public Direccion(String nombreCalle, String nombreCiudad, String codigoPostal, String nombrePais) {
        this.nombreCalle = nombreCalle;
        this.nombreCiudad = nombreCiudad;
        this.codigoPostal = codigoPostal;
        this.nombrePais = nombrePais;
    }

    public String getNombreCalle() {
        return nombreCalle;
    }

    public void setNombreCalle(String nombreCalle) {
        this.nombreCalle = nombreCalle;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    @Override
    public String toString() {
        return "Direccion{" + "nombreCalle=" + nombreCalle + ", nombreCiudad=" + nombreCiudad + ", codigoPostal=" + codigoPostal + ", nombrePais=" + nombrePais + '}';
    }
    
    
    
    
    
}
