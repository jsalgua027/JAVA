/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosutiles;

/**
 *
 * @author JoseIgnacio
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        MetodosMatriz matriz1 = new MetodosMatriz();
//
//        matriz1.mostrarMatriz();

        MetodosArrayListLifo arry1 = new MetodosArrayListLifo(10);
        arry1.push('5');
        arry1.push('a');

        arry1.push('6');
        arry1.push('8');
        
        System.out.println(arry1.toString());

    }

}
