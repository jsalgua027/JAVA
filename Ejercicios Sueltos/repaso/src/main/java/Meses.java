
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author nacho
 */
public class Meses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 0;
        int b = -3;

        //si a es mayor cero imprimo hola
        //si es menor que cero "negativo" imprimo adios
        //si es cero imprimo cero y b es negativo imprimo buenos dias 
        // if (a > 0) {
        //     System.out.println("hola");
        // } else if (a == 0 && b < 0) {
        //   System.out.println("buenos dias");
        //} else {
        //   System.out.println("adios");
        //}
        int mes;

        Scanner numMes = new Scanner(System.in);
        boolean solicitarDato = true;
        do {
            System.out.println("introduce en que mes estamos");

            mes = numMes.nextInt();
            if (mes > 0 && mes <= 12) {
                solicitarDato=false;
                System.out.println("sabemos cuantos meses tienen un año");

                if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                    System.out.println("tiene 31 dias");

                } else if (mes == 2) {
                    System.out.println("tiene 28 dias");

                } else {

                    System.out.println("tiene 30");

                }

            } else {
                System.out.println("has introducido un numero erroneo");

                
            }

        } while (solicitarDato);

        switch (mes) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("el mes tiene 31 dias");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("el mes tiene 30 dias");
                break;
            case 2:
                System.out.println("el mes tiene 28 dias");
                break;

        }

    }

}
