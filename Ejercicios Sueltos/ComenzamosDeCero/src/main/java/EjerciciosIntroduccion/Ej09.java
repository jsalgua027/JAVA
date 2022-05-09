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
public class Ej09 {

    /**
     * @Crea una nueva clase llamada Ej09, que contenga una llamada al método public static void main(String[] args). La aplicación Java contendrá comentarios descriptivos del código y realizará lo siguiente:
    a.- Declara e inicializa dos variables int (a=10,  b=20).
    b.- Declara cuatro variables booleanas.
    c.- Guarda, en las variables booleanas, el resultado de realizar las siguientes operaciones relacionales: a<b, a>b, a==b, a!=b.
    d.- Muestra en pantalla el resultado de las operaciones, usando las variables booleanas.

     */
    public static void main(String[] args) {
        //declaro e inicializo variables enteras int
      int a=10 , b=20;
      // declaro boleanos
      boolean c;
      boolean d;
      boolean f;
      boolean g;
      //guardo en las variables booleanas las siguentes operaciones
      c=a<b;
      d=a>b;
      f=a==b;
      g=a!=b;
      //muestro los resultado de las operaciones booleanas
        System.out.println("c= " +c);
        System.out.println("d= "+d);
        System.out.println("f= "+f);
        System.out.println("g= "+g);
      
    }
    
}
