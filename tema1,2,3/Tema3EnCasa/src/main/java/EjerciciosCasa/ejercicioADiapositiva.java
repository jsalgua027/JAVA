/*
 a. saber si un número es POSITIVO, NEGATIVO  O CERO (neutro)
METODO SCANNER 
 */
package EjerciciosCasa;

import java.util.Scanner; 

public class ejercicioADiapositiva {

    public static void main(String[] args) {
    
        Scanner entradaTeclado = new Scanner (System.in);
        
        //envío mensaje a introducir por scanner.
        System.out.println("Escribe un número");
        //leer lo que se introduce
        
        double numero = entradaTeclado.nextDouble();
        
        //Comparar
        if (numero == 0){
            System.out.println("El número es neutro");
        }
        else if (numero > 0){
            System.out.println("El número  es positivo");
        }
        else {
            System.out.println("El número es negativo");
        }
            
        
        
        
        
    }
    
}
