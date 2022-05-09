/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosEstructuraControl;

/**
 *
 * @author JoseIgnacio
 */
public class Ej09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int variable = 3, variable2;
        switch (variable) {

            case 1:
                variable2 = 5;
                break;
            case 2:
                variable2 = 20;
                break;
            case 3:
                variable2 = 30;
            case 4:
                variable2 = 10;
            default:
                variable2 = 100;
                break;

        }
            System.out.println(variable2);
    }
  //la varibale vale 100 porque inicia en el case 3 y no termina de cambiar hasta el break
}
