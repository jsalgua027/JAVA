/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JoseIgnacio
 */
public class EjPg11Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int calificacion = 9;

        switch (calificacion) {

            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Suspenso");

                break;

            case 5:
                System.out.println("Aprobado");

                break;

            case 6:
                System.out.println("Bien");

                break;

            case 7:

            case 8:
                System.out.println("Notable");

                break;

            case 9:
                System.out.println("Sobresaliente");

                break;

            case 10:
                System.out.println("Matrícula");
                break;

            default:
                System.out.println("No presentado");
                break;
        }
    }
}


    

