/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

/**
 *
 * AREA= BASE * ALTURA
 * 
 * Cuando heredas de una  clase abstrata estas obligado a meter todos los metodos 
 * 
 * 
 */
public class Rectangulo extends Figura{

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        super(base, altura);
    }
    
   
    @Override
     public int  calcularArea(){
        int resultado;
            resultado=this.base*this.altura;
        return resultado;
        
    }
    
}
