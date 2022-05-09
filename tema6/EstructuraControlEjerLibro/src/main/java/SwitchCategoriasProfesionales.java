/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JoseIgnacio
 */
public class SwitchCategoriasProfesionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int cotizacion = 150; // Un valor cualquiera
        char categoriaProfesional;

        if (cotizacion < 80) {
            categoriaProfesional = 'C';
        } else {
            if (cotizacion < 120) {
                categoriaProfesional = 'B';
            } else {
                categoriaProfesional = 'A';
            }
        }

        System.out.print("Cotización " + cotizacion + " euros, ");
        System.out.print("Categoría " + categoriaProfesional + " de ");

        switch (categoriaProfesional) {
            case 'A':
                System.out.print("Socio ");
            case 'B':
                System.out.print("Senior ");
            case 'C':
                System.out.print("Junior ");
            default:
                System.out.print("¡Indefinida! ");
        }
    }
}


    

