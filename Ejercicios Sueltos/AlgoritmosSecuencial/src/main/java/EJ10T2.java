
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
public class EJ10T2 {

    /**
     * @param args the command line arguments
     */
    //Para pasa de km/h a m/s utilizare la constante (3.6)
    //
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        float kilometrosHora = 200;
        final float CONVERSOR = 3.6f;
        // operaciones
        float metroSegundo = kilometrosHora * CONVERSOR;
        System.out.println("200km/h= " + metroSegundo + " metros/segundo");
        //Una vez pasado a m/s hago la operación para saber cuantos metros
        //ha recorrido en 20 segundos.
        // operaciones.
        float metros = metroSegundo * 20;
        //Muestro resulatdo por pantalla
        System.out.println("En 20 segundo recorre= " + metros + " metros");

    }

}
