/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerci3_27mayo;

/**
 *
 * @author nacho
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String [][] matriz = LecturaArchivo.leerArchivo("matriz.txt");
        
        Utilidades.imprimirMatriz(matriz);
        
        
         int contadorFila = Utilidades.contarfilas(matriz);
        System.out.println(contadorFila);
        
        int contadorColum = Utilidades.contarColumnas(matriz);
        System.out.println(contadorColum);
    }
    
}
