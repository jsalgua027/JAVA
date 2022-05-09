/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw.utilidades;

import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author nacho
 */
public class Aleatorios {

    private static int enteroAleatorio() {
        //int enteroAleatorio;
        Random enteroAleatorio = new Random((Integer.MAX_VALUE - Integer.MIN_VALUE) - 1);

        return enteroAleatorio();
    }

    public int enteroRango(int min, int max) {
        if (min > 0 && max > 0) {

        }
        Random enteroRango = new Random();
        return enteroRango(min, max);
    }

    public String letraMayuscula() {
        String letra;
        letra = RandomStringUtils.random(1, new char[]{'A', 'B', 'C', 'D', 'E', 'F',
            'G', 'H', 'I', 'J', 'K', 'L', 'N', 'M', 'Ñ', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'W', 'X', 'Y', 'Z'});
        System.out.println(letra);
        return letra;
    }

    public  String letraMinuscula() {
        String letra;
        letra = RandomStringUtils.random(1, new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'n', 'm',
            'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w', 'x', 'y', 'z'});

        System.out.println(letra);
        return letra;
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
