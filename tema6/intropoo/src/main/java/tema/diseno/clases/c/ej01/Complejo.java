/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema.diseno.clases.c.ej01;

/**
 *
 * @author JoseIgnacio
 */
public class Complejo {

    private double numReal;
    private double numImaginario;
    private static int contador =0;

    //constructor parametrizado
    public Complejo(double numReal, double numImaginario) {
        this.numReal = numReal;
        this.numImaginario = numImaginario;
        contador++;
    }

    public static int getContador() {
        return contador;
    }

    //contructor por defecto
    public Complejo() {
    }
    
    // construcctor copia
    
    public Complejo(Complejo aux){
        this.numReal=aux.numReal;
        this.numImaginario=aux.numImaginario;
        
        contador++;
    
    }

    //gett y sett
    public double getNumReal() {
        return numReal;
    }

    public void setNumReal(double numReal) {
        this.numReal = numReal;
    }

    public double getNumImaginario() {
        return numImaginario;
    }

    public void setNumImaginario(double numImaginario) {
        this.numImaginario = numImaginario;
    }
     
    //metodo String
    public String toString() {
        return "Complejo{" + "numReal=" + numReal + ", numImaginario=" + numImaginario + '}';
    }

    //metodos
    //el metodo nos devulve un resultado.
    public static Complejo suma(Complejo num1, Complejo num2) {
        //objeto para resultado
        Complejo resultado = new Complejo();
        // Numero complejo consta (a,b)real y (a,b) imaginario
        double resultadoReal = num1.getNumReal() + num2.getNumReal();
        double resultadoImaginario = num1.getNumImaginario() + num2.getNumImaginario();
        //cambiar valores
        resultado.setNumReal(resultadoReal);
        resultado.setNumImaginario(resultadoImaginario);
        //devolvemos resultado.
        return resultado;

    }

    public static Complejo resta(Complejo num1, Complejo num2) {

        Complejo resultado = new Complejo();

        double resultadoReal = num1.getNumReal() - num2.getNumReal();
        double resultadoImaginario = num1.getNumImaginario() - num2.getNumImaginario();

        resultado.setNumReal(resultadoReal);
        resultado.setNumImaginario(resultadoImaginario);

        return resultado;

    }

    public static Complejo multiplicacion(Complejo num1, Complejo num2) {

        Complejo resultado = new Complejo();

        double resultadoReal = num1.getNumReal() * num2.getNumReal();
        double resultadoImaginario = num1.getNumImaginario() * num2.getNumImaginario();

        resultado.setNumReal(resultadoReal);
        resultado.setNumImaginario(resultadoImaginario);

        return resultado;

    }

    public static Complejo division(Complejo num1, Complejo num2) {

        Complejo resultado = new Complejo();

        double resultadoReal = num1.getNumReal() / num2.getNumReal();
        double resultadoImaginario = num1.getNumImaginario() / num2.getNumImaginario();

        resultado.setNumReal(resultadoReal);
        resultado.setNumImaginario(resultadoImaginario);

        return resultado;

    }

    public static void igualdad(Complejo num1, Complejo num2) {

        if (num1.getNumReal() == num2.getNumReal() && num2.getNumImaginario() == num2.getNumImaginario()) {
            System.out.println("los numeros son iguales");

        } else {
            System.out.println("Son distintos");
        }

    }

}
