
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JoseIgnacio
 */
public class ClaseRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaro la clase Random mismo proceso que entrada datos

        Random numAleatorio = new Random();
        //inicializo variable con entrada de datos clase Random
        //int n = numAleatorio.nextInt();
        //inicialido con variable decimal
       // double d= numAleatorio.nextDouble();
        
        boolean b= numAleatorio.nextBoolean();
        // uso modelo de repeticion for 
        for (int i = 0; i < 5; i++) {
            System.out.println(numAleatorio.nextInt());
        }
    }

}
