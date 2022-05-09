/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;

/**
 *
 * @author nacho
 */
public class PruebaPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila pila1 = new Pila();

        pila1.push(new Char('a'));
        pila1.push(new Char('b'));
        pila1.push(new Char('c'));
        pila1.push(new Char('d'));

        pila1.imprimirElementos();

        System.out.println("---------------------------------------quito elementos ultimo en entrar primero en salir-----------------");
        pila1.pop();
        pila1.imprimirElementos();

        System.out.println("-----------------------------cantidad de elementos de la pila----------------------------");
        System.out.println("En la pila hay= "+ pila1.cantidadElementos()); 
        
        System.out.println("¿esta la pila llena?= " +pila1.pilaLlena());
        
        System.out.println("¿La pila esta vacia?= "+pila1.pilaVacia());
        
        // creo una array de carateres  para una pila nueva
        char[] prueba = new char[] {'f','g','h','y','j'};
        Pila pila2=new Pila();
        
        
        //pila2.rellenar(prueba);
        
        
        
        

    }

}
