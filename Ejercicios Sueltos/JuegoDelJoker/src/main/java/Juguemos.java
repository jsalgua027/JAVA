
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author nacho
 */
public class Juguemos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random numAleatorio = new Random();
        int[] boletoJugamos = new int[7];
        Scanner datos = new Scanner(System.in);
        // genero variables aleatorias para el boleto premiado

        int[] boletoPremio = new int[7];
        for (int i = 0; i < boletoPremio.length; i++) {
            boletoPremio[i] = numAleatorio.nextInt(9) + 1;
        }
        //saco por consola el boleto premiado
        System.out.println("El boleto premiado es= " + Arrays.toString(boletoPremio));
        System.out.println("------------------------con que boleto jugamos--------------");

        System.out.println("Vamos a introducir siete numeros");

        for (int i = 0; i < 7; i++) {

            System.out.println("Di un numero=");
            boletoJugamos[i] = datos.nextInt();

        }
        System.out.println("------------------------comencemos el juego--------------------------");
        if (Arrays.equals(boletoPremio, boletoJugamos)) {
            System.out.println("felicidades has obtenido el Joker");

        } else {
            Arrays.sort(boletoPremio);
            Arrays.sort(boletoJugamos);

            if (Arrays.equals(boletoPremio, boletoJugamos)) {
                System.out.println("Felicidades has obtenido el Joker malo");

            } else {

                System.out.println("No has ganando el premio");
            }

        }

    }

}
