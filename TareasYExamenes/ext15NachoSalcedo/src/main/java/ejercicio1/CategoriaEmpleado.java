/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author nacho
 */
public enum CategoriaEmpleado {
    
    
    INICIAL("categoria basica",50),
    MEDIA("categoria media",70),
    AVANZADA("categoria profesional",100);

    private CategoriaEmpleado(String nombre, int valores) {
        this.nombre = nombre;
        this.valores = valores;
    }
    
    
    
    
    
    private final String nombre;
    private final int valores;
    
    
    
}
