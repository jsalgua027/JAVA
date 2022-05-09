/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author nacho
 */
public class Robot implements Comparable<Robot> {

    private int numSerie;
    private int porcVida;

    Random alea = new Random();

     ArrayList<Robot> ejercitoRobots = new ArrayList<>();

    public Robot() {
        this.numSerie = alea.nextInt(1000 - 1 + 1) + 1;
        this.porcVida = alea.nextInt(100 - 1 + 1) + 1;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = alea.nextInt(1000 - 1 + 1) + 1;
    }

    public int getPorcVida() {
        return porcVida;
    }

    public void setPorcVida(int porcVida) {
        this.porcVida = alea.nextInt(100 - 1 + 1) + 1;
    }

    @Override
    public String toString() {
        return "Robot{" + "numSerie=" + numSerie + ", porcVida=" + porcVida + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.numSerie;
        hash = 89 * hash + this.porcVida;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Robot other = (Robot) obj;
        if (this.numSerie != other.numSerie) {
            return false;
        }
        return this.porcVida == other.porcVida;
    }

    @Override
    public int compareTo(Robot t) {
        //return this.numSerie.compareTo(numSerie); Si numSerie es Integer
        return Integer.compare(this.porcVida, t.porcVida ); // Si numSerie es int
    }

    
//     public  static int buscarPorNumeroSerie( ArrayList <Robot> lista, int numSerie) {
//          Robot r = new Robot(numSerie,0);
//          return Collections.binarySearch(lista, r (Robot r1, Robot) -> Integer.compare(r1.getNumSerie(), r2.getNumSerie()));
//     }
    
      public  static int buscarVida( ArrayList <Robot> lista, int vida) {
          
          Robot r = new Robot();
          return Collections.binarySearch(lista, r);
     }
}
