/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4.diseno.clases.c.ej11;

/**
 *
 * @author nacho
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motor m = new Motor(2.0, false);
        Ventana v1 = new Ventana(true, true);
        //Ventana v2 = new Ventana(true, true);
        //Ventana v3 = v2;
        Puerta pp = new Puerta(false, v1);
        //otra forma de crear la puerta con la ventana
        Puerta pc = new Puerta(false, new Ventana(true, true));

        Ruedas rdi = new Ruedas(50, true);
        Ruedas rdd = new Ruedas(50, true);
        Ruedas rti = new Ruedas(50, true);
        Ruedas rtd = new Ruedas(50, true);
        // creo auto
        Coche auto = new Coche(m, pp, pc, rdi, rdd, rti, rtd);

        System.out.println(auto);

        // desinflo una rueda sin usar nada del coche y es un peligro
        rtd.desinflado();

        System.out.println(auto);

        // mejor crear objeto asi!!!!
        Coche auto2 = new Coche(new Motor(2.0, false), new Puerta(false, v1),
                new Puerta(false, v1), new Ruedas(50, true),
                 new Ruedas(50, true), new Ruedas(50, true), new Ruedas(50, true));

        System.out.println("AUTO2-------------");
        System.out.println(auto2);
        System.out.println("Poner la ventana puerta auto2 sin tintar");

        auto2.getPuertaPiloto().getVentana().setTintada(false);

        System.out.println("obtner diametro de la rueda delantera izquierda");
        System.out.println(auto2.getRuedaDelanteraIzq().getDiametro());

        System.out.println("Arrancar motor");

        auto2.getMotor().arrancar();

    }

}
