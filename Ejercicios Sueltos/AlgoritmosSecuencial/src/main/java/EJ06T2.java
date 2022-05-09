
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author nacho
 */
public class EJ06T2 {

    /**
     * @param args the command line arguments
     */
    //hago la llamada al metodo main.
    public static void main(String[] args) {
        //Creo la clase escaner 

        Scanner entradaDatos = new Scanner(System.in);
        // declaro variables a y b

        int a;
        int b;

        // uso consola para introducir variables 
        System.out.println("introduce a");
        a = entradaDatos.nextInt();
        System.out.println("introduce b");
        b = entradaDatos.nextInt();

        //Realizo operacion del primer punto. a/b
        double RESULTADO1 = a / b;
        int RESULTADO2 = a % b;
        double c = 100;
        int d = 3;
        double res = c / d;

        System.out.println("El resultado de res=" + res);

        //Muestro en pantalla el resultado.
        System.out.println("El resultado es=" + RESULTADO1);

        //muestro resultado por pantalla
        System.out.println("El resulatdo es=" + RESULTADO2);
//ejercio modificado para explicación en clase.
    }

}
