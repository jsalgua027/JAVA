
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author nacho
 */
public class REPASO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int var1, var2;
        //cuidado con los nombres
        double estaturaPersona;

        //inicializo variabels
        var1 = 12;
        var2 = 14;

        //declaro + inicializo
        float pesoPersona = 67.6F;
        long millonesQueMeVaisAPagar = 23_000_000_000l;
        //constantes
        final boolean SIEMPRE_SI = true;
        //Al ser constante no puede camiar su valor
        //SIEMPRE_SI = false;

        //los valores concretos en un tipo de datos  son literales
        long numero1 = 23;// int--<long (conversion implícita)
        long numero2 = (long) 23l;//conversion explicita

        double expresion = var1 / (double) var2;
        System.out.println(expresion);

        //Math cell, floor, round
        expresion = Math.ceil(3.4);// ceil redondea hacia arriba
        System.out.println(expresion);
        expresion = Math.floor(4.9);
        System.out.println(expresion);//floor redondea hacia abajo
        expresion = Math.round(expresion);//round  rendondea al mas cercano
        System.out.println(expresion);
        expresion = Math.round(pesoPersona);
        System.out.println(expresion);
        expresion = Math.round(4.5);
        System.out.println(expresion);

        Scanner teclado = new .Scanner(System.in);
        System.out.println("introduce el peso persona");
        pesoPersona = teclado.nextFloat();
        System.out.println("introduce estatura persona");
        estaturaPersona = teclado.nextDouble();

        System.out.println("introduce tu nombre");
        String nombre = teclado.nextLine();

        System.out.println("peso:" + pesoPersona + "estatura: " + estaturaPersona);
        double indiceMasaCorporal = pesoPersona / Math.pow(estaturaPersona, 2);
        //IMC=peso [kg]/ estatura [m2]
        System.out.println(nombre + "tu IMC es: " + indiceMasaCorporal);
        System.out.printf("%s tu IMC es: " % 2f, nombre, indiceMasaCorporal);

        //lectura de datos con JOPtion
      /*  final double SUPLEMENTO = 200;

        String apellido = JOptionPane.showInputDialog("introduce tu apellido: ");
        System.out.println(apellido);
        String dineroTexto = JOptionPane.showInputDialog("introduce eldinero para sobornar");
        double dineros = Double.parseDouble(dineroTexto);
        System.out.println("El profe va a recibir" + (SUPLEMENTO + dineros) + "al año");

        JOptionPane.showMessageDialog(null, " el profe va a recibir" + (SUPLEMENTO + dineros) + " al año");
*/
        // TODO code application logic here
    }

}
