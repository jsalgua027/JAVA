/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author nacho
 */
public class Programador extends Empleado{
    
    private TipoProgramador categoria;

    public Programador() {
    }

    public Programador(TipoProgramador categoria) {
        this.categoria = categoria;
    }

    

    public TipoProgramador getCategoria() {
        return categoria;
    }

    public void setCategoria(TipoProgramador categoria) {
        this.categoria = categoria;
    }

    
    public String toString() {
        return super.toString()+ "Programador{" + "categoria=" + categoria + '}';
        
    }
    
    
    
    
}
