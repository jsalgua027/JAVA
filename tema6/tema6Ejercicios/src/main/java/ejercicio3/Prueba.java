/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author JoseIgnacio
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona pe1 = new Persona("nacho", "7588j", 25);
        Persona pe2 = new Persona("pepe", "85965b", 30);

        Empleado e1 = new Empleado(25000);
        Empleado e2 = new Empleado(15000);

        Programador po1 = new Programador(TipoProgramador.ANALISTA);
        Programador po2 = new Programador(TipoProgramador.JUNIOR);

        // pe1. ------->intento usar el metodo de amumentar salario pero no me deja. onjeto super clase intentado usar un metodo de clase hija no deja
        e1.cuantosAnios(pe2); //con el empleado e1 uso el metodo de cuantos anios el objeto clase hija llamando a metodo clase padre

        System.out.println("------------metodo ToString clase padre--------");
        System.out.println(pe1.toString());

        System.out.println("-----------metodo ToString clase hija Empleado-----");
        System.out.println(e1.toString());

        System.out.println("----------------metodo ToString clase hija Programador---------");
        System.out.println(po1.toString());

        System.out.println("-----------castin implicito------- ");
        
        pe1 = new Empleado(111111);
        
        System.out.println(pe1.toString());
        
    }

}
