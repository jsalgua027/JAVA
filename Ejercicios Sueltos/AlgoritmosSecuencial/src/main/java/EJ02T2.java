
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JoseIgnacio
 */
public class EJ02T2 {

    /**
     * @param args the command line arguments
     */
    //Algoritmo que lea el valor del radio y calcule el área del círculo
    //Area de un círculo es igual a PI*radio*radio
    public static void main(String[] args) {
        //creo clase escaner
        Scanner entradaDatos = new Scanner(System.in);

        //declaro variables
        double radio;

        //introduzca radio
        System.out.println("Introduce el radio");
        radio = entradaDatos.nextDouble();
        //operaciones
        final double area = 3.1415 * radio * radio;

        //consola muestra resultado
        System.out.println("el area de ese circulo es=" + area);

    }

}
// double radio=match.pow(a,b)-------sirve parar elevar a al exponente b.
    //PI lo correcto es hacer un final double y hacerlo una constante.
