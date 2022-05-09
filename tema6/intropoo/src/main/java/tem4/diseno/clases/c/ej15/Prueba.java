/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tem4.diseno.clases.c.ej15;

/**
 *
 * @author JoseIgnacio
 */
public class Prueba {

    public static void main(String[] args) {
        Fecha hoy = new Fecha(01, 12, 2022);
        System.out.println("El mes tiene: " + hoy.diaMes() + " días");
        //fecha corta
        hoy.mostrarFechaCorta();
        // fecha larga
        hoy.mostraFechaLarga();
        
        // comparar fechas creo, nueva fecha
        
        Fecha hoy2 = new Fecha(02,12,2023);
        
        hoy.diaEntreFechas(hoy, hoy2);
        hoy2.siguiente();
        System.out.println("el resultado del metodo siguente es= "+ hoy2.mostrarFechaCorta());
        
    }

}
