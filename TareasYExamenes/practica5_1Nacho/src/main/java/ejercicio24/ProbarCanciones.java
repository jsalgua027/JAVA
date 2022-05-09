/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio24;

/**
 *
 * @author JoseIgnacio
 */
public class ProbarCanciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creo la list de reproduccion 
        ListaReproduccion top100House = new ListaReproduccion();

        // meto canciones 
        top100House.grabarCancion(new Cancion("hello", "house", 3.25));
        top100House.grabarCancion(new Cancion("sanday", "rap", 3.00));
        top100House.grabarCancion(new Cancion("everydays", "breakbeat", 3.15));
        top100House.grabarCancion(new Cancion("bye-bye", "rock", 3.42));
        top100House.grabarCancion(new Cancion("cachitos", "trap", 6.25));
        
        
        System.out.println("----------------------------------METODO ORDENAR-----------------");
        top100House.ordenarEstilo();
        top100House.imprimirLista();
        System.out.println("-----------------DIME EN QUE POSICION DE LA LISTA ESTA----------------");
        int posicion =top100House.buscarEstilo(new Cancion ("bye-bye", "rock", 3.42));
        System.out.println("La canción bye-bye esta en la posicion = " + (posicion+1));
        
        System.out.println("-------------------METODO CompareTo--------------------");
        top100House.comparToEstilo();
        top100House.imprimirLista();
        
        
        

//        // imprimo la lista
//        top100House.imprimirLista();
//
//        // elimino una cancion 
//        top100House.eliminarCancion(new Cancion("cachitos", "house", 6.25));
//
//        System.out.println("-----------------------------LISTA CON UNA CANCION BORRADA-----------------");
//
//        top100House.imprimirLista();
//
//        System.out.println("-----------------------------BORRRO POR POSICION-----------");
//
//        top100House.quitarCancion(1);
//        top100House.imprimirLista();
//        
//        System.out.println("-----------------------CAMBIO DE POSICION--------------");
//        
//        top100House.cambiarCancion(2, new Cancion("live", "house", 4.25));
//        top100House.imprimirLista();

    }

}
