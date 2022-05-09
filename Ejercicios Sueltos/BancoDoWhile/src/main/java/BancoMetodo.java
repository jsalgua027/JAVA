
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author nacho
 */
public class BancoMetodo {

    /**
     * @param args the command line arguments
     */
    public static boolean edadValida(int edad){
        edadValidad=true;
        return
    }
    
    
    public static void main(String[] args) {
       
        //Uso la clase escaner para introducir la variables
        Scanner teclado = new Scanner(System.in);
        int edad;
        int salida;
        do {
            System.out.println("introduce 0 para salir y 1 para continuar");
            salida = teclado.nextInt();

            do {
                System.out.println("Introduce la edad");
                //Declaro e inicializo la variable por entrada de datos 
                edad = teclado.nextInt();

                //Uso If para comporbar que la edad del cliente es la correcta >=18 && <=65
                // declaro variables double para obtener sueldo anual y el factor multiplicativo
                if (edad >= 18 && edad <= 65) {
                    System.out.println("edad correcta");
                    System.out.println("¿cuanto ganas al mes");
                    double sueldoAnual = teclado.nextDouble() * 12;
                    double factorMultiplicativo = sueldoAnual * 5.85;
                    //Solicito la cantidad a pedir
                    System.out.println("¿Cuanto vas a pedir?, no te pases!!!");
                    double cantidaPedida = teclado.nextDouble();
                    //Uso if para la condición que no cumple
                    if (cantidaPedida > factorMultiplicativo) {
                        System.out.println("No es posible concederle el prestamo");
                        //hago el cambio de flujo con el else, continua pidiendo datos
                    } else {
                        System.out.println("¿En cuantos años quiere devolver el prestamo?");
                        int anosPrestamo = teclado.nextInt();
                        //Ultimo apartado del ejercicio dos condiciones, una para los años del prestamo
                        //Otra para  los años del presatamo más la edad
                        if (anosPrestamo >= 5 && anosPrestamo <= 30) {
                            if (edad + anosPrestamo > 75) {
                                System.out.println("No te vamos a conceder el prestamo ");
                            } else {
                                System.out.println("Enorabuena llevas tres horas para un programa que se hace en 10 minutos");
                            }
                        } else {
                            System.out.println("Demasiados años, no se te concede");
                        }
                    }

                }

            } while (!(edad >= 18 && edad <= 65));

        } while (salida != 0);
       
    }
    
}
