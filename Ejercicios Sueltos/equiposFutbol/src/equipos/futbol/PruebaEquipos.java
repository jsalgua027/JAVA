/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipos.futbol;

/**
 *
 * @author JoseIgnacio
 */
public class PruebaEquipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creo un equipo  
        Equipo esteponaFC = new Equipo("estepona");

        // añado jugadores
        esteponaFC.insertarJugador(new Jugador(19, "defensa", 65, 1.70, "paco"));
        esteponaFC.insertarJugador(new Jugador(20, "defensa", 68, 1.72, "pepe"));
        esteponaFC.insertarJugador(new Jugador(25, "medio", 78, 1.78, "antonio"));
        esteponaFC.insertarJugador(new Jugador(19, "lateral", 85, 1.80, "hugo"));
        esteponaFC.insertarJugador(new Jugador(19, "delantero", 90, 1.95, "nacho"));

        esteponaFC.imprimirEquipo();

        //--------------saco por pantalla cantidad de jugadores-------
        System.out.println("--------------------------------------------------------------------------------------------");

        System.out.println("el numero de jugadores del equipo es= " + esteponaFC.getCantidadJugadores());

        // busco un jugador por nombre
        Jugador equipoAux = esteponaFC.buscarJugadorNombre("pepe");
        System.out.println("el Jugador buscado es = " + equipoAux);

        System.out.println("---------------------------------------------------------------------------------------------");
        //quito jugador
        esteponaFC.quitarJugador2(equipoAux);
        esteponaFC.imprimirEquipo();

        System.out.println("---------------------PRUEBA FUNCIONAMIENTO LIGA-----------------------------------");

        //Creo segundo equipo para la liga
        Equipo marbella = new Equipo("marbella");
        // añado jugadores
        marbella.insertarJugador(new Jugador(19, "defensa", 90, 1.85, "manolo"));
        marbella.insertarJugador(new Jugador(20, "defensa", 70, 1.81, "chuster"));
        marbella.insertarJugador(new Jugador(25, "defensa", 75, 1.75, "solozabal"));
        marbella.insertarJugador(new Jugador(28, "defensa", 65, 1.73, "kiko"));
        marbella.insertarJugador(new Jugador(18, "defensa", 68, 1.82, "futre"));

        //creo la liga1
        Ligas liga1 = new Ligas();
        // meto los dos equipos creados 

        liga1.insertarEquipo(esteponaFC);
        liga1.insertarEquipo(marbella);

        // imprimo la liga !!!!!!!!!!!!!!!!me imprime espacio de memoria
        liga1.imprimirLiga();
        //uso el metodo buscar
        System.out.println("----------------------------------METODODO BUSCAR---------------------");

     //  Equipo aux=  liga1.buscarPorNombreEquipo("marbella");

    }

}
