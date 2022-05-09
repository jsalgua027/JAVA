/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

/**
 *
 * AREA = BASE * ALTURA
 */
public class Romboide extends Figura{

    public Romboide() {
    }

    public Romboide(int base, int altura) {
        super(base, altura);
    }
    
   
    @Override
     public int calcularArea(){
        int resultado;
            resultado=this.base*this.altura;
        return resultado;
        
    }
    
}
