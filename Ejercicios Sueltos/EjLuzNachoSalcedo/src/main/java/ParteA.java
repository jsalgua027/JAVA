
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
public class ParteA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Activo la clase escaner para poder introducir los datos
        Scanner teclado = new Scanner(System.in);
        //Declaro variables para iniciar el bucle
        double consumoAparato;
        double horasUso;
        double precioWatio;
        double resultado;
        //Inicio bucle do-while.
        //pedimos consumo.
        do {
            System.out.println("Cuanto consume");
            consumoAparato = teclado.nextDouble();
            //condiciono el consumo  entre la franja de potecia indicada
        } while (consumoAparato < 1 || consumoAparato > 4500);
        //pido horas 
        do {
            System.out.println("Indica cuantas horas lo usas");
            horasUso = teclado.nextDouble();
            //condiciono el tiempo en horas entre la horas que tiene un día
        } while (horasUso < 0.1 || horasUso > 24);
        //Pido precio Watio
        do {
            System.out.println("Dime a que  precio esta el Watio");
            precioWatio = teclado.nextDouble();
            //condicion de rangos de precio.
        } while (precioWatio < 0.1 || precioWatio > 0.45);
        //realizo la operacion para obtener el resultado.
        resultado = (((consumoAparato / 1000) * horasUso) * precioWatio);
        System.out.println("El consumo es=" + resultado);

    }
}
