/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipos.futbol;

import java.util.ArrayList;

/**
 *
 * @author nacho
 */
public class Equipo {

    private ArrayList<Jugador> equipo;
    private String nombre;

    public Equipo(String nombre) {
        this.equipo = new ArrayList<>();
        this.nombre= nombre;
        
    }

    //metodo insertar jugadores
    public void insertarJugador(Jugador jugador) {
        if (equipo != null) {
            equipo.add(jugador);
        }
    }

    //metodo imprimir equipo
    public void imprimirEquipo() {

        System.out.println("El equipo está formador por ");
        equipo.forEach(System.out::println);

    }

    //metodo para saber cuantos jugadores hay
    public int getCantidadJugadores() {
        return equipo.size();

    }

    //metodo para borrar un jugador
    public boolean quitarJugador(Jugador jugador) {
        if (equipo.contains(jugador)) {
            equipo.remove(jugador);
            return true;
        }
        return false;
    }

    //metodo 2 para borrar jugador 
    public boolean quitarJugador2(Jugador jugador) {

        return equipo.remove(jugador);
    }

    //metodo para buscar jugador
    public Jugador buscarJugadorNombre(String nombre) {
        Jugador aux = null;
        for (int i = 0; i < equipo.size(); i++) {
            aux = equipo.get(i);
            if (aux.getNombre().equals(nombre)) {
                return aux;
            }
        }

        return aux;
    }
    //metodo 2 buscar jugador

    public Jugador buscarjugador2(String nombre) {

        Jugador aux = new Jugador(15, "delantero", 75.5, 1.74, "pepe");
        int indice = equipo.indexOf(aux);
        if (indice >= 0) {
            return equipo.get(indice);
        }
        return aux;
    }

    //buscar en el arraylist por altura
    public ArrayList<Jugador> buscarPorAltura(double altura) {
        //creo objeto
        ArrayList<Jugador> aux = new ArrayList<>();
        for (Jugador jugador : this.equipo) {
            if (jugador.getEstatura() == altura) {
                aux.add(jugador);
            }
        }
        return aux;
    }
    //metodo get generado para los metodos de la ligas
    public ArrayList<Jugador> getEquipo() {
        return equipo;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + '}';
    }

  
    
    
    
}
