/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

/**
 *
 * @author JoseIgnacio
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Utilidades prueba1 = new Utilidades();

        System.out.println("introduce el maximo");
        int datoMaximo = prueba1.entradaDatos();

        System.out.println("introduce el minimo");
        int datoMinimo = prueba1.entradaDatos();
        int numeroAleatorio = prueba1.generarAleatorio(datoMinimo, datoMaximo);

        System.out.println("el numero aleatorio es =" + numeroAleatorio);

    }

}
