
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
public class Ej10T2B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realiza otro programa para calcular el espacio recorrido del cuerpo en función de su velocidad y tiempo de movimiento.
        //activo el escane, inicializo y declaro variables

        Scanner entradaDatos = new Scanner(System.in);
        System.out.println("Introduce la velocidad ");
        float velocidad = entradaDatos.nextFloat();
        System.out.println("Introduce el tiempo ");
        float tiempo = entradaDatos.nextFloat();

        // realizo la operativa para saber la distancia
        double distancia = velocidad * tiempo;

        // Muestro los resulatdos 
        System.out.println("La distancia es= " + distancia);

    }

}
