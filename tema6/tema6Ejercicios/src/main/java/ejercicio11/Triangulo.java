/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

/**
 *
 * AREA = BASE *ALTURA / 2
 */
public class Triangulo extends Figura{

    
    
    
    public Triangulo() {
    }

    public Triangulo(int base, int altura) {
        super(base, altura);
    }
    
    
   
    @Override
    public int calcularArea(){
        int resultado;
            resultado=(this.base*this.altura)/2;
        
     return resultado;   
    }
    
    
    
}
