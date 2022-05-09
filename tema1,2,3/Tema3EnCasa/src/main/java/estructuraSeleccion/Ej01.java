/*
 * Implementa el siguiente programa y realiza ejecuciones para los siguientes 
datos de edad: 10,18 y 67. ¿Cuáles son los resultados?
 */
package estructuraSeleccion;

//Declaro método scanner

import java.util.Scanner;

public class Ej01 {

    
    public static void main(String[] args) {
    
        //Declaro impresión por teclado
        Scanner teclado = new Scanner (System.in);
        System.out.println("escanear edad: ");
        
        //declaro y me guardo el valor de la variable que voy a introducir
        int edad = teclado.nextInt ();
        
        //lanzo sentencias if y else 
        
        if (edad >=18){System.out.println("Es mayor de edad");
        }// fin if
        else {   
            System.out.println("No es mayor de edad");
        }//fin else 
        
        //muestro resultados
        System.out.println("Mostrar la edad:  ");
        System.out.println(edad);
        
        
    
        
        
        
        
        
        
        
    }
    
}
