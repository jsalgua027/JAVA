
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
public class EJ05T2 {

    //Una empresa de autocares cobra 150 euros fijos por servicio,
    //además 15.3 céntimos por Km recorrido.
    //Elabora un programa que lea el número de km a recorrer y proporcione el presupuesto.
    public static void main(String[] args) {
        //Creo escaner para la entrada de datos
        
        Scanner entradaDatos = new Scanner(System.in);
        
        //Declaro variables.
        double km;
        
        //introducimos datos en el escaner
        System.out.println("introduce km totales del servicio");
        km = entradaDatos.nextDouble();
        
        //operaciones
        final double COSTESERVICIO = 150 + km * 15.3;
        
        //resultado
        System.out.println("el coste del servicio=" + COSTESERVICIO);
        
        //150 debe ser declarado como constante.
        //15,3 tambien se puede declarar como constante.
        //la constantes se declaran en mayusculas.
    }

}
