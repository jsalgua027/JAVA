
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author nacho
 */
public class EJ09T2 {

    /**
     * @param args the command line arguments
     */
    //Necesitan saber el área de tela a emplear según las medidas de las 
    //diagonales que hay entre los puntos A y C, y entre B y D.
    //Area=(base*altura)/2
    //llamo al metodo main
    //llamo al Scanner
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        //diagonal mayor es=AC
        //diagoal menor es=BD
        //declaro variables y las inicializo con la entrada de datos del scanner
        System.out.println("Introduzca la diagonal mayor");
        int diagonalMa = entradaDatos.nextInt();
        System.out.println("Introduzca la diagonal menor");
        int diagonalMe = entradaDatos.nextInt();

        //operacion 
        int area = (diagonalMa * diagonalMe) / 2;
        System.out.println("Según la diagonales introducidas el area es= " + area);

    }

}
