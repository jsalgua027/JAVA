/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.ArrayList;
import jdk.nashorn.api.tree.Tree;

/**
 *
 * @author nacho
 */
public class Baraja {
    private ArrayList <Naipe>  baraja;

    public Baraja() {
        this.baraja =  new ArrayList<Naipe>();
        for (int i = 0; i < 52; i++) {
            baraja.add(new Naipe());
        }
        
    }

    public ArrayList<Naipe> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Naipe> baraja) {
        this.baraja = baraja;
    }

    @Override
    public String toString() {
        return "Baraja{" + "baraja=" + baraja + '}';
    }


    
    
    
    
     
     
     
     
     
     
     
}
