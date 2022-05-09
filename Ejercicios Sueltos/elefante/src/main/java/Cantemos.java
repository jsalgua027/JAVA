
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JoseIgnacio
 */
public class Cantemos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pesoTelaAraña;
        int pesoElefante;
        int numElefante = 0;
        boolean bucle = true;
        int pesoTotalElefantes = 0;

        //uso el scanner para  para que introduzcan los datos;
        Scanner datos = new Scanner(System.in);
        // pregunto por eñ peso de la tela de araña
        System.out.println("-----Cantemos!!!------");
        System.out.println("¿Cuanto peso aguanta la Tela de Araña?= ");
        pesoTelaAraña = datos.nextInt();
        //inicio bucle para los pesos de los elefantes, variable numElefante
        //para controlar a cantidad de elefantes
        do {

            System.out.println("Cuanto pesa el elefante" + numElefante);
            do {
                pesoElefante = datos.nextInt();
                if (!(pesoElefante > 0 && pesoElefante <= 109)) {
                    System.out.println("el peso no es valido, vuelve a introducir el dato");

                }
            } while (!(pesoElefante >= 0 || pesoElefante <= 109));
            // para sumar los elefantes usados numElefante++; es igual que  numElefante= numElefante+1;

            numElefante = numElefante + 1;
            pesoTotalElefantes = pesoTotalElefantes + pesoElefante;
            //condición para salir del bucle que supere peso o algún elefante sea igual a cero.
        } while (pesoTotalElefantes < pesoTelaAraña && pesoElefante != 0);
        //sino le resto uno cuenta un elefante de mas
        numElefante = numElefante - 1;
        System.out.println("se han podido subir= " + numElefante);
    }

}
