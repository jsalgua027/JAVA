/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosIntroduccion;

/**
 *
 * @author JoseIgnacio
 */
public class PerimetroCircunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaración de constantes y variables 
        final double PI = 3.1415;
        double radio, perimetro;

// Operaciones
        radio = 25.0;
        perimetro = 2.0 * PI * radio; //  2.0 * 3.1415 * 25.0

// Resultados
        System.out.print("El perimetro de la circunferencia de radio ");
        System.out.print(radio);
        System.out.print(" es ");
        System.out.print(perimetro);

    }

}
