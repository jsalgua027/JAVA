/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

/**
 *
 * @author nacho
 */
public class Factorial {

    public static int factorial(int num){
        
        //asegura que el numero debe de ser positivo
        num= Math.abs(num);
        if(num == 0 || num ==1){//caso base
            return 1;
        }else {
            return num*factorial(--num);//ciclo activo
        }
        
        
        
    }
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
    
}
