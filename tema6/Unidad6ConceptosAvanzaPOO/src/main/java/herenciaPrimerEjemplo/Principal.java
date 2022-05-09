/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaPrimerEjemplo;

/**
 *
 * @author JoseIgnacio
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Direccion d1 = new Direccion("calle A", 3);
        Direccion d2 = new Direccion("calle B", 7);
        Persona p = new Persona("pepe", 20);
        p.setDirección(d1);
        Empresa e = new Empresa();
        e.setCif("1A");
        e.setDirección(d2);

        System.out.println(p.getDirección().getCalle());
        System.out.println(e.getDirección().getCalle());
    }

}
