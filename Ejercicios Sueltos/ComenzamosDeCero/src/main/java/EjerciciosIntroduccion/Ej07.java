/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosIntroduccion;

/**
 *
 * @author JoseIgnacio
 */
public class Ej07 {

    /**
     * 7.- Crea una nueva clase llamada Ej07, que contenga una llamada al método
     * public static void main(String[] args). La aplicación Java contendrá
     * comentarios descriptivos del código y realiza lo siguiente: a.- Declara e
     * inicializa tres variables int en la misma instrucción (a=1, b=2, c=3).
     * b.- Declara e inicializa tres variables double en la misma instrucción
     * (d=4.5, e=5.7, f=6.9). c.- Muestra las variables en dos líneas, la
     * primera línea mostrará las variables tipo entero y la segunda línea
     * mostrará las variables tipo double. d.- Realiza los siguiente
     * intercambios de valores: en b guarda c, en c guarda a, en a guarda b.
     * Muestra por pantalla el resultado. e.- Realiza los siguiente intercambios
     * de valores: en e guarda f, en f guarda d, en d guarda e. Muestra por
     * pantalla el resultado.
     *
     *
     *
     */
    public static void main(String[] args) {
        //Declaro e inicializo en la misma instrucción
        int a = 1, b = 2, c = 3;
        double d = 4.5, e = 5.7, f = 6.9;
        //Muestro las variable por pantalla
        System.out.println("a= " + a + "\t b= " + b + "\t c= " + c);
        System.out.println("d= " + d + "\t e= " + e + "\t f= " + f);

        //Realiza los siguiente intercambios de valores: en b guarda c, en c guarda a, en a guarda b
        b = c;
        c = a;
        a = b;

        //Muestro el resultado
        System.out.println("el valor de b= " + c);
        System.out.println("el valor de c= " + a);
        System.out.println("el valor de a= " + b);

        // e guarda f, en f guarda d, en d guarda e. Muestra por pantalla el resultado.
        e = f;
        f = d;
        d = e;
        //Muestro por pantalla 
        System.out.println("el valor de e= " + e);
        System.out.println("el valor de f= " + f);
        System.out.println("el valor de d= " + d);
    }

}
