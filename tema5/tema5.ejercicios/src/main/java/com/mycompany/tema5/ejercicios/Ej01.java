/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tema5.ejercicios;

/**
 *
 * @author nacho
 */
public class Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int [] nuevaArr = new int [6];
        nuevaArr[0] =1;
        nuevaArr[1] =2;
        nuevaArr[2] =3;
        nuevaArr[3] =4;
        nuevaArr[4] =5;
        nuevaArr[5] =6;
         
       int suma=0;
       
        for( int i=0;i<nuevaArr.length;i++){
            System.out.println("indice["+ i +"] se le suma el siguiente valor " + nuevaArr[i]);
          //acomulamos en la variable  suma cada valor del array
            suma += nuevaArr[i];
            System.out.println(suma);
        }
        
        
        
    }
    
}
