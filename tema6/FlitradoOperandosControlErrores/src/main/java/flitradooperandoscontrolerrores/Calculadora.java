/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flitradooperandoscontrolerrores;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author JoseIgnacio
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void mostrarMenu() {
        System.out.println("Opciones del programa");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Salir");
    }

    private static int sumar(int n1, int n2) {
        int suma = n1 + n2;
        return suma;
    }

    private static int restar(int n1, int n2) {
        int resta = n1 - n2;
        return resta;

    }

    private static double multiplica(double n1, double n2) {
        double multiplica = n1 * n2;
        return multiplica;

    }

    private static double dividir(double n1, double n2) {
        double resta = n1 / n2;
        return resta;

    }

    private static int pedirDatoInt() {
        Scanner datos = new Scanner(System.in);
        int comprobarOperador=0;
        boolean pDatos;
        
        do{
             pDatos=true;
        try {
            //Bloque de código candidato a lanzar la excepción
            System.out.println("Introduce el dato entero: ");
            comprobarOperador = datos.nextInt();
             pDatos=false;

        } catch (InputMismatchException ime) {
            //código para tratar el error 
            System.out.println("Se ha introducido texto en lugar de numeros. " + "vuelve a intoducir los datos");
            datos.nextLine();
            
        }
        }while (pDatos);
        
         return comprobarOperador;
    }
    public static void main(String[] args) {

        Scanner datos = new Scanner(System.in);
        int operador1 = 0, operador2 = 0;
        boolean solicitarDatos = true;
        System.out.println("bienvenido a la calculadora");

        do {
            System.out.println("Introduce dos  operadores (entre -100 y 100)");
            
                

                
                    
                    System.out.println("Introduce operador 1: ");
                    operador1 = pedirDatoInt();
                    System.out.println("Introduce operador 2: ");
                    operador2 = pedirDatoInt();
                    
               
                   

            } while (!((operador1 > -100 && operador1 < 100) && (operador2 > -100 && operador2 < 100)));

         

        datos.nextLine();
        String opcion = "";
        double resultado = 0;
        do {
            mostrarMenu();
            opcion = datos.nextLine();

            switch (opcion) {
                case "1":
                    resultado = sumar(operador1, operador2);

                    break;
                case "2":
                    resultado = restar(operador1, operador2);

                    break;

                case "3":
                    resultado = multiplica(operador1, operador2);
                    break;

                case "4":
                    resultado = dividir(operador1, operador2);

                    break;

                case "5":
                    break;

                default:
                    System.out.println("Opción no válida");
            }
            System.out.println("El resultado es " + resultado);
        } while (!opcion.equals("5"));

    }}




            /*  do {
            System.out.println("Introduce dos  operadores (entre -100 y 100)");
            do {
                solicitarDatos = true;

                try {
                    //Bloque de código candidato a lanzar la excepción
                    System.out.println("Introduce operador 1: ");
                    operador1 = datos.nextInt();
                    System.out.println("Introduce operador 2: ");
                    operador2 = datos.nextInt();
                    solicitarDatos = false;
                } catch (InputMismatchException ime) {
                    //código para tratar el error 
                    System.out.println("Se ha introducido texto en lugar de numeros. " + "vuelve a intoducir los datos");
                    datos.nextLine();
                }
            } while (solicitarDatos);//bucle que controla la excepción 

        } while (!((operador1 > -100 && operador1 < 100) && (operador2 > -100 && operador2 < 100)));
        */
