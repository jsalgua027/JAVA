/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema.diseno.clases.c.ej01;

/**
 *
 * @author JoseIgnacio
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //genero y imprimo numero 1
        Complejo numero1 = new Complejo(2, 1);
        System.out.println(numero1.toString());
        // genero y imprimo numero 2
        Complejo numero2 = new Complejo(5, 5);
        System.out.println(numero2.toString());
        //suma
        System.out.println(Complejo.suma(numero1, numero2).toString());
        //resta
        System.out.println(Complejo.division(numero1, numero2).toString());
        //Multiplicacion
        System.out.println(Complejo.multiplicacion(numero1, numero2).toString());
        //Division
        System.out.println(Complejo.division(numero1, numero2).toString());
        //Son iguales????
        Complejo.igualdad(numero1, numero2);

        //dos numeros iguales para comrpobar igualdad
        Complejo num3 = new Complejo(1, 1);
        Complejo num4 = new Complejo(1, 1);

        Complejo.igualdad(num3, num4);
        
        //contador
        System.out.println("El numero de objetos creados "+Complejo.getContador());

    }

}
