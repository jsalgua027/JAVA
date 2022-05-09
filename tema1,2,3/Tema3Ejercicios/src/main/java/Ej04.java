
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
public class Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //llamamos a la clase Scanner para poder introducir datos.
        Scanner entradaDatos = new Scanner(System.in);
        //los datos los guardamos en una variable  entera tipo int.
        int edad = entradaDatos.nextInt();
        //Usamos un string para el resultado.
        String resultado;
        //Usamos el operador terniario para obtener un String del resultado.
        resultado = (edad > 18) ? "es mayor de edad" :  "es menor de edad";
        System.out.println(resultado);
        

    }

}
