
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
public class Rondas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaro la clase random para obtener nuemros aleatorios para el juego 
        Random numAleatorio = new Random();
        //declaro variables para el resultado del numero random
        int numeroJugado1;
        int numeroJugado2;
        // declaro variable para el resultado y declaro e inicializo variable para contar partidas 
        int rondas = 0;

        //declaro variables para contar cada victoiria  por jugador
        int victoriaJugador1 = 0;
        int victoriajugador2 = 0;

        //inici juego con bucle do while para que cuando llegue ha cinco termine
        do {
            //jugador1 y jugador 2 generan nuemros que muestran por pantalla
            numeroJugado1 = numAleatorio.nextInt(5) + 1;
            System.out.println("el numero aleatorio del jugador1 es= " + numeroJugado1);

            numeroJugado2 = numeroJugado2 = numAleatorio.nextInt(5) + 1;
            System.out.println("El número aleatorio del jugador2 es= " + numeroJugado2);
            //uso variable resultado para saber quien gana, <7 gana jugador1 si es >7 gana jugador2, si sale 7 repetimos 
            int resultado = numeroJugado1 + numeroJugado2;
            //si gana jugador 1 se suma 1 a su ronda jugador 
            if (resultado < 7) {
                System.out.println("gana jugador1");
                victoriaJugador1++;
                //en caso de empate se resta 1 a el total de rondas jugadas
            } else if (resultado == 7) {
                System.out.println("el el resultado es empate");
                rondas--;
                //el resultado es mayor que 7 gana jugador 2
            } else {
                System.out.println("gana jugador2");
                victoriajugador2++;

            }
            //Termina la ronda sumo 1 a el general de las rondas.!!tengo que poner aqui el contador para ganar rondas
            System.out.println("termina la ronda");
            rondas++;
            if (victoriaJugador1 == 3) {
                System.out.println("Gana jugador 1");
                break;
            } else if (victoriajugador2 == 3) {
                System.out.println("Gana jugador 2");
            }
            break;

        } while (rondas < 5);

    }
}
