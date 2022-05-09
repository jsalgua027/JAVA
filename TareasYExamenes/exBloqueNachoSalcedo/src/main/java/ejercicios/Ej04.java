/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random dados= new Random();

         Scanner sn = new Scanner(System.in);
       boolean salir = false;
       int opcion; //Guardaremos la opcion del usuario
        
       while(!salir){
            
           System.out.println("1. Cuenta atras");
           System.out.println("2. Juego de dados");
           System.out.println("3. salir ");
           
            
           System.out.println("Escribe una de las opciones");
           opcion = sn.nextInt();
            
           switch(opcion){
               case 1:
                   System.out.println("has elejido cuenta atras");
                   int x;
                   System.out.println("elije cuantas veces quiere que cuente");
                   int numeroConteo=sn.nextInt();
                   x=1;
                   while (x<=numeroConteo){
                       System.out.print(x);
                        System.out.print(" - ");
                         x = x - 1;
                   
                   }
                   
                   break;
               case 2:
                   System.out.println("Has elejido juego de dados");
                   
                   int dados1=dados.nextInt(5)+1;
                   int dados2=dados.nextInt(5)+1;
                   
                   
                   
                   
                   break;
                case 3:
                   System.out.println("Has elejido salir");
                   salir=true;
                   break;
                
                   
                   
                default:
                   System.out.println("Solo números entre 1 y 3");
           }
            
       }
          
            
                       
            }
        
        
        }

        
        
