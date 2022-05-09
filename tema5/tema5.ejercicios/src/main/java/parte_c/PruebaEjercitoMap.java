/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte_c;

/**
 *
 * @author JoseIgnacio
 */
public class PruebaEjercitoMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MapEjercito batallon = new MapEjercito();

        Ejercito ejercitoTierra = new Ejercito();

        ejercitoTierra.alistar(new Soldado("125687B", "Pepe", "Sanchez", "Perez", 25));
        ejercitoTierra.alistar(new Soldado("154687h", "Sergio", "Benitez", "Lucas", 30));
        ejercitoTierra.alistar(new Soldado("134887C", "Antonio", "Hernandez", "benitez", 45));
        ejercitoTierra.alistar(new Soldado("123627V", "Nacho", "Salcedo", "Guarde", 28));
        ejercitoTierra.alistar(new Soldado("125987N", "Alvaro", "Santillana", "Andrade", 32));
        ejercitoTierra.alistar(new Soldado("145548K", "Raul", "Reyes", "Nuñez", 27));

        batallon.introducir("aire", ejercitoTierra);
        batallon.introducir("tierra", ejercitoTierra);
        batallon.introducir("mar", ejercitoTierra);

        
        batallon.imprimir();
        
        
        
        
    }

}
