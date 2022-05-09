
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author nacho
 */
public class EJ08T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        
        double precio;
        double iva;
        double resultado;
        
        System.out.println("Introduce el precio del articulo?");
        precio=entradaDatos.nextDouble();
        iva=entradaDatos.nextDouble();
        
        System.out.println("Cuanto es el IVA =");
        iva=entradaDatos.nextDouble();
        
        //operaciones
        
        resultado=(precio*(iva+100))/100;
        
        
       
        
       
        
        
    }
    
}
