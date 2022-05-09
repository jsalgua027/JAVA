/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dawNachoSalcedo;

import javax.swing.JOptionPane;

/**
 *
 * @author nacho
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        LibroElectronico libro1;
        LibroElectronico libro2;
        // genero los dos nuevos objetos de la clase LibroElectronico para prueba
        // uso el metodo toString  para mostrarlo por consola 

        libro1 = new LibroElectronico("", "", 500, 20, 250);
        System.out.println(libro1.toString());
        libro2 = new LibroElectronico("", "", 100, 20, 150);
        System.out.println(libro2.toString());

        //uso método setter para modificar valores de libro 2
        libro2.setPaginasTotales(12000);
        //uso método getter para sacar por consola el cambio de valor 
        System.out.println(libro2.getPaginasTotales());
         
        
        
    }

}
