/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosEstructuraControl;

/**
 *
 * @author JoseIgnacio
 */
public class Ej08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char departamento = 'B';

        switch (departamento) {
            case 'A':
                System.out.println("Desarrollo");
                break;
            case 'B':
                System.out.println("Recursos Humanos");
                break;
            case 'C':
                System.out.println("Finanzas");
                break;
            case 'D':
                System.out.println("Mercadeo");
            default:
                System.out.println("Departamento no válido");
        }
        System.out.println("Código para el departamento es " + departamento);
    }

}  //este programa identifica el chart declarado y lo muetra por pantalla al final saltandose los demas case.
