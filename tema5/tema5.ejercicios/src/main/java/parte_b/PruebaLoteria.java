/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte_b;

/**
 *
 * @author JoseIgnacio
 */
public class PruebaLoteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DecimoLoteria loteria1 = new DecimoLoteria();
        
        for (int i = 0; i < 500; i++) {
            loteria1.generarDecimos();
            
        }
        
        loteria1.imprimirDecimos();
        
        
    }
    
}
