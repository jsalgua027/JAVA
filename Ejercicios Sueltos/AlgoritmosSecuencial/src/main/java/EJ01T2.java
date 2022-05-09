
import java.util.Scanner;

/**
 *
 * @author JoseIgnacio
 */
public class EJ01T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Algoritmo que lea una cantidad de euros y los pase a rupias indias.

        Scanner entradaDeDatos = new Scanner(System.in);
        final double euros;
        System.out.println("Introduce cantidad");
        euros = entradaDeDatos.nextDouble();
        double rupia = 86.69 * euros;
        System.out.println("La cantidad en rupias es=" + rupia);

    }

}
