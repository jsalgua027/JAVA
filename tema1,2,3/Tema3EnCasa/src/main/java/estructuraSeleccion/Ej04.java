/*
 * EJERCICIO 4. Reescribe el ejercicio 1 usando operador TERNARIO
(condicion) ? valor si T : valor si F
 */
package estructuraSeleccion;

import java.util.Scanner; 

public class Ej04 {

  
    public static void main(String[] args) {
    
     Scanner teclado = new Scanner (System.in);
     
    /*
      System.out.println("escanear edad");
        
        int edad = teclado.nextInt ();
        
        if (edad >=18){System.out.println("Es mayor de edad");
        }
        else {   
            System.out.println("No es mayor de edad");
        }
        
        System.out.println("Mostrar la edad:  ");
        System.out.println(edad);
        
     */
         
        System.out.println("Escanear edad");
        //Me guardo variable edad entera que  voy a introducir teclado.
        int edad = teclado.nextInt ();
        
        //planteo operador ternario 
        String texto = (edad >=18) ? "Eres mayor de edad" : "Eres menor  de edad"; 
        
        
        System.out.println("Si tienes " + edad + " años, entonces: ");
        System.out.println(texto);
       
    }
    
}
