/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosIntroduccion;

/**
 *
 * @author JoseIgnacio
 *
 */
public class Tema2NachoSalcedoEj05 {

    /**
     * 5.- En un nuevo proyecto, llamado Tema2+tunombre, crea una nueva clase
     * llamada Ej05, que contenga una llamada al método public static void
     * main(String[] args). La aplicación Java contendrá comentarios
     * descriptivos del código y realiza lo siguiente: a.- Declara una variable
     * primitiva de cada uno de los tipos estudiados. b.- Declara una constante
     * numérica de tipo double y otra de tipo int. Presta especial atención a la
     * hora de poner el nombre de estas constantes y usa el modificador final.
     * c.- Declara un objeto String. d.- Inicializa las variables, la constante
     * y el objeto con literales de tu elección. e.- Muestra en pantalla cada
     * una de las variables, constantes y objetos anteriores, en distintas
     * líneas y especificando el tamaño que ocupan en memoria, según la tabla
     * que hay en los apuntes (paǵ 7). *
     */
    public static void main(String[] args) {
        //a.-declaro variables de tipo primitivo
        byte a;
        int b;
        short c;
        long d;
        //b.-declaro constantes tipo double y int.
        final int A;
        final double C;
        //c.-declaro objeto String
        String ob;
        //d.-inicializo todo
        a = 12;
        b = 25;
        c = 33;
        d = 44;
        A = 52;
        C = 2.35;
        ob = "Espabila Nacho";
        //e.-
        System.out.println(a + "- Al ser un byte ocupa 8 bits");
        System.out.println(b + "-Al ser un int ocupa 32 bits");
        System.out.println(c + "-Al ser un short ocupa 16 bits");
        System.out.println(d + "-Al ser un long ocupa 64 bits");
        System.out.println("El string declarado como ob contiene el texto= " + ob);

    }

}
