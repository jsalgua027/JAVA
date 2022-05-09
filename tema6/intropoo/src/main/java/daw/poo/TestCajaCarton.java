/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw.poo;

/**
 *
 * @author nacho
 */
public class TestCajaCarton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CajaCarton cajaGrande;
        CajaCarton cajaChica;
        //con el new instanciamos
        cajaGrande = new CajaCarton(250, 400, 500, 200);
        cajaChica = new CajaCarton(25, 30, 15, 17);

        System.out.println("Las dimensiones de la caja grande de alto"
                + cajaGrande.getAlto() + ", de ancho " + cajaGrande.getAncho() + ", de largo "
                + cajaGrande.getLargo() + " y pesa  " + cajaGrande.getPeso());

        System.out.println("Las dimensiones de la caja chica son de alto " + cajaChica.getAlto() + ", de ancho " + cajaChica.getAncho()
                + ", de largo " + cajaChica.getLargo() + " y pesa " + cajaChica.getPeso());

        //Ej10 RelaciónB Cambia el peso del objeto cajaChica usando el método setPeso(), 
        //estableciendo un valor de peso de 1200gr. Muestra por pantalla el valor del peso de cajaChica.
        cajaChica.setPeso(1200);
        System.out.println("El peso de caja chica es= " + cajaChica.getPeso());
        
        //Ej011 Modifica el valor de peso de cajaChica a 1200gr, esta vez directamente a través del atributo, 
        //sin usar el método. Muestra por pantalla el valor del peso de cajaChica.
        cajaChica= new CajaCarton(250, 405, 600, 1200);
        System.out.println("el peso es= "+ cajaChica.getPeso());
        

    }

}
