/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerci3_27mayo;

/**
 *
 * @author nacho
 */
public class Utilidades {

    public static void imprimirMatriz(String[][] aux) {

        for (int i = 0; i < aux.length ; i++) {
            for (int j = 0; j< aux[i].length ; j++) {

                System.out.print(aux[i][j]+"\t" );

            }
                  System.out.println("");
        }
        System.out.println("");
    }
    
    
    public static int  contarfilas (String [][] aux){
        int contador=0;
        for (int i = 0; i < aux.length; i++) {
            contador++;
            
        }
        return contador;
        
    }
    
    public static int  contarColumnas (String [][] aux){
        int contador=0;
        for (int i = 0; i < aux[i].length; i++) {
            contador++;
            
        }
        return contador;
        
    }

}
