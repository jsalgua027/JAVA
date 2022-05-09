/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodoRecursivo;

import java.util.Random;

/**
 *
 * @author JoseIgnacio
 */
public class Prueba {

   
    public static int[] listaNumero ={0,1,2,3,4,5,6,7,8,9,10};

    public static int busquedaSecuencial(int numero,int tamaño){// buscamos desde el final 
        int index=-1;
        if(tamaño<= listaNumero.length || tamaño>0){ 
            if(listaNumero[tamaño-1]==numero){
                index=tamaño-1;
                return index;//caso base
            }

            return busquedaSecuencial(numero,tamaño-1); //ciclo activo
        }
        return index;
    }

    

    public static void main(String[] args) {
        System.out.println(busquedaSecuencial(9, listaNumero.length));
    }
}
