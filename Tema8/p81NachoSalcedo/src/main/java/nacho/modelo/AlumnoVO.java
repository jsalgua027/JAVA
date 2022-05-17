/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nacho.modelo;

/**
 *
 * @author nacho
 */
public class AlumnoVO {
    
    private int numexped;
    private String nomalum;
    private String ape1alum;
    private String direccion;

    public AlumnoVO(int numexped, String nomalum, String ape1alum, String direccion) {
        this.numexped = numexped;
        this.nomalum = nomalum;
        this.ape1alum = ape1alum;
        this.direccion = direccion;
    }

    public AlumnoVO() {
    }

    public int getNumexped() {
        return numexped;
    }

    public void setNumexped(int numexped) {
        this.numexped = numexped;
    }

    public String getNomalum() {
        return nomalum;
    }

    public void setNomalum(String nomalum) {
        this.nomalum = nomalum;
    }

    public String getApe1alum() {
        return ape1alum;
    }

    public void setApe1alum(String ape1alum) {
        this.ape1alum = ape1alum;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "alumnoVO{" + "numexped=" + numexped + ", nomalum=" + nomalum + ", ape1alum=" + ape1alum + ", direccion=" + direccion + '}';
    }
    
    
    
    
    
}
