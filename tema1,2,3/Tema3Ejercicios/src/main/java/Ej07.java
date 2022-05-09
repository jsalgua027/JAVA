
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author nacho
 */
public class Ej07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        int opcion;
 
        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Círculo");
        System.out.println("4. Finalizar");
 
        System.out.print("Elija una opción: ");
        opcion = entrada.nextInt();
        
        switch (opcion){
                
 
                opcion1: 
                    System.out.println("Ha seleccionado calcular el área de un cuadrado...");
                break;
       
                opcion2: 
                    System.out.println("Ha seleccionado calcular el     área de un triángulo...");
                break;
         
                opcion4: 
                    System.out.println("Ha seleccionado calcular el área de un círculo...");
                    break;
                opcion4:
                    System.out.println("Ha seleccionado terminar");
                    break
        }
               }     
           }

    
    

