
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author nacho
 */
public class Ej09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner edad = new Scanner(System.in);
            int años;
        do {
            System.out.println("¿Cuantos años tenes?");

             años = edad.nextInt();
            if (años > 1 && años < 120) {

                if (años < 18) {
                    System.out.println("No puede votar");

                }
                if (años == 18) {

                    System.out.println("justo eres mayor de edad");
                }
                if (años == 25) {
                    System.out.println("Que buena edad");

                }
                if (años == 35) {
                    System.out.println("ya deberias de tener hijos");

                }
                if (años == 45) {
                    System.out.println("deberias pensar en un plan de jubilación");

                }
                if (años == 55) {
                    System.out.println("viva la madurez");
                }
                if (años == 65) {

                    System.out.println("Enhorabuena jubilado");

                }
                if (años > 65) {
                    System.out.println("Viejo");
                }

            }

        } while (años < 1 || años > 120);

    }

}
