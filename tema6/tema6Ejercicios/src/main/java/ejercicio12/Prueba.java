/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

/**
 *
 * @author JoseIgnacio
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Persona p1 = new Persona("Nacho", "Salcedo", "4568JJ");
        Cuenta n1 = new CuentaCorriente(1.5, 1000, p1);

        Persona p2 = new Persona("Antonio", "Perez", "88888PP");
        Cuenta n2 = new CuentaAhorro(2.5, 2.6, p2);

        n1.setSaldo(5000);
        System.out.println("///////////////////////////////////CUENTA CORRIENTE//////////////////////////////////////");
        System.out.println(n1.toString());
        System.out.println("---------------METODO ACTUALIZAR SALDO----------------");

        n1.actualizarSaldo();
        System.out.println(n1.toString());

        System.out.println("---------------METODO RETIRAR SALDO-------------------");
        n1.retirar(2000);
        System.out.println(n1.toString());

        System.out.println("///////////////////////////////////CUENTA AHORRO//////////////////////////////////////");
        n2.setSaldo(10000);
        System.out.println("---------------METODO ACTUALIZAR SALDO----------------");
        n2.actualizarSaldo();
        System.out.println(n2.toString());

        System.out.println("---------------METODO RETIRAR SALDO-------------------");
        n2.retirar(2000);
        System.out.println(n2.toString());
        
        
        
    }
    
    
    
    
    
    
}
