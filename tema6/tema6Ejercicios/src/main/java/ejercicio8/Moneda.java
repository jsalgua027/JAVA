/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Random;

/**
 *
 * @author JoseIgnacio
 */
public class Moneda extends Azar{
    
    Random aleatorio = new Random();
    
    
    @Override
     public int lanzar() {
        int resultado = aleatorio.nextInt(6 + 1) + 1;
        return resultado;
    }
    
}
