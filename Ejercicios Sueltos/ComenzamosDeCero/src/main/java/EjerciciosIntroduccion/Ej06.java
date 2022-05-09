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
public class Ej06 {

    /**
     * 6.- Crea una nueva clase llamada Ej06, que contenga una llamada al método
     * public static void main(String[] args). La aplicación Java contendrá
     * comentarios descriptivos del código e intercambiará los valores de dos
     * variables de tipo entero, haciendo uso de una tercera variable auxiliar.
     * Antes de intercambiar los valores, debes declarar e inicializar las
     * variables con los valores que tú quieras. Muestra los valores de las
     * variables antes de intercambiar sus valores y después del intercambio.
     *
     */
    public static void main(String[] args) {
        //Declaro variables tipo entero
        int a;
        int b;
        int aux;
        // Inicializo las variables
        a = 1;
        b = a;
        //Imprimo por pantalla los valores 
        System.out.println("a vale= " + a);
        System.out.println("b vale= " + b);
        //hago el intercambio de valores
        aux = b;
        System.out.println("aux es igual=" + b);
    }

}
