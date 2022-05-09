
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JoseIgnacio
 */
public class Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //A) si X es >= 150 resultado nos devuelve es mayor sino nos devuelve meno
        //Usando un operador terciario.
        
       Scanner entradaDatos=new Scanner(System.in);
       int x=entradaDatos.nextInt();
       String resultado;
       resultado=(x>=150)? "mayor":"menor";
        System.out.println(resultado);
        
        //B) si X es >=0 se imprimira "el resultado es menor que cero"
        // sino, imprimira "el resultado es mayor que cero"
        
        /*int x = entradaDatos.nextInt();
        String resultado;
        resultado=(x<=0)? "El resultado es menor que cero" : "el resultado es mayor que cero";
        System.out.println(resultado);
        */
        
        /*C)Guardar el valor absoluto de un número entero en una variable entera (sin usar la función Math.abs())

            return numero > 0 ? numero : -numero;
            int a = 10, b = -20, a_abs, b_abs;
            a_abs = abs(a);
            b_abs = abs(b);
           System.out.println("Valores absolutos: |"+a+"| = "+a_abs+" <><><> |"+b+"| = "+b_abs);
      
}
       
       
    
    
}
