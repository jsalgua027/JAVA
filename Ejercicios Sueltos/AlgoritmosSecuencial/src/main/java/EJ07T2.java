
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author nacho
 */
public class EJ07T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creo la classe escanner y hago el llamamiento.
        Scanner entradaDatos = new Scanner(System.in);

        //Declaro constates
        final double GALON_CANTIDAD = 3.78;
        final double GALON_PRECIO = 1.20;

        //Declaro variables
        double galonCantidad;
        double galonPrecio;

        //uso consola para introducir variables;
        System.out.println("Introduce cantidad de galones");
        galonCantidad = entradaDatos.nextDouble();
        //operaciones
        double litros = galonCantidad / GALON_CANTIDAD * GALON_PRECIO;
        //Resultado.
        System.out.println("Su precio es=" + litros);

    }

}
