/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

/**
 *
 * @author nacho
 */
public class CuentaAtras {
    
    public static void main(String[] args) {
        
        cuentaAtras(3);
        
    }
    
    public static void cuentaAtras(int n) {
        System.out.println(n);
        if (n > 0) {
            cuentaAtras(n - 1);
        }
        System.out.println("hola " + n);
        
    }
}
