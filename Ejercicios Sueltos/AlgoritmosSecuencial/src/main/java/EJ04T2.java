
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
public class EJ04T2 {

    /**
     * @param args the command line arguments
     */
    //Realiza un programa que lea una cantidad de gramos y obtenga su equivalencia en libras.
    public static void main(String[] args) {
        //Creo el escaner
        Scanner entradaDatos = new Scanner(System.in);
        //Declaro variables 

        System.out.println("Introduce peso en gramos");
        double gramos = entradaDatos.nextDouble();

        //operaciones
        double libras = gramos * 0.00220462;
        System.out.println("su equivalente en libras es=" + libras);

    }

}
