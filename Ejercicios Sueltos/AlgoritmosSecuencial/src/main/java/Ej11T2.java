
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
public class Ej11T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);

        /*Mediante entrada por teclado asigno coordenadas a los puntos
        A y B en una variable  constante.
         */
        System.out.println("Coordena X del punto A: ");
        int xA = entradaDatos.nextInt();
        System.out.println("Coordenada Y del punto A: ");
        int yA = entradaDatos.nextInt();
        System.out.println("Coordenada X del punto B: ");
        int xB = entradaDatos.nextInt();
        System.out.println("Coordenadas Y del punto B: ");
        int yB = entradaDatos.nextInt();
        
        //Declaro e inializo la variable asignada a la distancia recorrida.
        double distancia = Math.sqrt((Math.pow(xB-xA,2))+ Math.pow((yB-yA,2));
        System.out.println("La distancia entre el punto A y el punto B es:" + distancia);
        
        
    }

}
