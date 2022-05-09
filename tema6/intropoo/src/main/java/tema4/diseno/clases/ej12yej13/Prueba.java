/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.diseno.clases.ej12yej13;

/**
 *
 * @author JoseIgnacio
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creo el objeto trabajador de la clase Empleado
        Empleado trabajador1;
        //le doy valores a los atributos 
        trabajador1 = new Empleado("nacho", "salcedo", "7857548f", 950, 15, 20, 3, false, 0);
        //uso el metodo get para mostrar nombre y si estoy casado

        System.out.println("El trabajador se llama: " + trabajador1.getNombre());
        System.out.println("Su estado sentimental es: " + trabajador1.isCasado());

        //uso metodo setter para cambiar esos atributos 
        trabajador1.setNombre("pedro");
        trabajador1.setCasado(true);

        // imprimo los cambios usando el metodo toString()
        System.out.println(trabajador1.toString());

        // intento comprobar si la condición del IRPF funciona para ello creo un nuevo objeto "trabajador2"//introduco un IRPF del 35%
        Empleado trabajador2;
        trabajador2 = new Empleado("Juan", "Perez", "254854j", 1000, 25, 75, 35, true, 5);
        System.out.println(trabajador2.toString());
        trabajador2.setIRPF(11);
        System.out.println("el irpf= " + trabajador2.getIRPF());
        //comprovacion del metodo calculo de horas extra este en un mes 

        System.out.println("Pedro este mes en horas extra ha ganado=" + trabajador1.valorHorasExtra());
        // comprobración del metodo sueldo bruto para trabajador1

        System.out.println("El trabajador, " + trabajador1.getNombre() + " este mes en bruto ha ganado: " + trabajador1.sueldoBruto());

        //Uso el método escribir básico para imprimir por pantalla
        trabajador2.escribirBasico();
        // Uso el método calculo de IRPF con el trabajador 2
        double x = trabajador2.calculoIRPF();
        System.out.println("el cálculo del IRPF es= " + x);
    }

}
