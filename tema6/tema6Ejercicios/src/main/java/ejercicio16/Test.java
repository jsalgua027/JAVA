/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author nacho
 */
public class Test {

     
    
    
    public static void main(String[] args) {
        ArrayList<Robot> ejercitoRobots = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            ejercitoRobots.add(new Robot());
        }

        for (Robot j : ejercitoRobots) {
            System.out.println(j.toString());
        }
        System.out.println("--------------ordeno----------------------------");
        //uso el metodo comparable
        Collections.sort(ejercitoRobots);

        //imprimo 
        for (Robot j : ejercitoRobots) {
            System.out.println(j.toString());
        }
        System.out.println("-----------imprimo los que  el porcentaje de vida es mayor a 50---------");

        for (Robot j : ejercitoRobots) {
            if (j.getPorcVida() >= 50) {
                System.out.println(j.toString());
            }
        }
       // System.out.println("metodo busqueda" + ejercitoRobots.get(Robot.buscarVida(ejercitoRobots, 5)));
        
       
        

    }

}
