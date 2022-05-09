
import java.util.InputMismatchException;
import java.util.Random;
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
public class Metodos {

    /**
     * @param args the command line arguments
     */
    //METODO QUE PIDE UN NUMERO HASTA QUE SEA CORRECTO, CUANDO ES CORRECTO DEVUELVE EL NUMERO
    private static int pedirNumero() {
        Scanner sc = new Scanner(System.in);
        boolean esCorrecto = true;
        int numero = 0;
        do {
            try {
                numero = sc.nextInt();
            } catch (InputMismatchException ime) {
                esCorrecto = false;
            }
        } while (!esCorrecto);

        return numero;
    }

    //METODO QUE GENERA UN NUMERO ALEATORIO ENTRE DOS RANGOS QUE SON PASADOS POR PARAMENTROS, DEVUELVE EL NUMERO GENERADO
    private static int generarAleatorio(int inicioRango, int finalRango) {
        Random random = new Random();
        int cambioDeOrden;

        //Controlo si el numero inicial es mayor al final, en caso de que lo sean se cambian los valores de las variables entre ellas
        if (inicioRango > finalRango) {
            cambioDeOrden = inicioRango;
            inicioRango = finalRango;
            finalRango = cambioDeOrden;
        }

        return (random.nextInt(finalRango - inicioRango + 1) + inicioRango);
    }

    //METODO QUE COMPRUEBA SI ES MAYOR O MENOR, DEVUELVE TRUE SI ES MAYOR, FALSE SI ES MENOR
    private static boolean numeroEsMayor(int primerNumero, int segundoNumero) {
        return (primerNumero > segundoNumero);
    }

    //METODO QUE PIDE UN NUMERO HASTA QUE SEA CORRECTO, CUANDO ES CORRECTO DEVUELVE EL NUMERO
    private static int pedirNumero2() {
        Scanner sc = new Scanner(System.in);
        boolean esCorrecto = true;
        int numero = 0;
        do {
            try {
                numero = sc.nextInt();
            } catch (InputMismatchException ime) {
                esCorrecto = false;
            }
        } while (!esCorrecto);

        return numero;
    }

    //METODO QUE GENERA UN NUMERO ALEATORIO ENTRE DOS RANGOS QUE SON PASADOS POR PARAMENTROS, DEVUELVE EL NUMERO GENERADO
    private static int generarAleatorio2(int inicioRango, int finalRango) {
        Random random = new Random();
        int cambioDeOrden;

        //Controlo si el numero inicial es mayor al final, en caso de que lo sean se cambian los valores de las variables entre ellas
        if (inicioRango > finalRango) {
            cambioDeOrden = inicioRango;
            inicioRango = finalRango;
            finalRango = cambioDeOrden;
        }

        return (random.nextInt(finalRango - inicioRango + 1) + inicioRango);
    }

    //METODO QUE COMPRUEBA SI ES MAYOR O MENOR, DEVUELVE TRUE SI ES MAYOR, FALSE SI ES MENOR
    private static boolean numeroEsMayor2(int primerNumero, int segundoNumero) {
        return (primerNumero > segundoNumero);
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
