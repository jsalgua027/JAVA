/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parte_a;

/**
 *
 * @author nacho
 */
public class TraductorTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Traductor traductor1 = new Traductor();

        traductor1.introducirValores("one", "uno");
        traductor1.introducirValores("two", "dos");
        traductor1.introducirValores("window", "ventana");
        traductor1.introducirValores("fire", "fuego");
        traductor1.introducirValores("car", "coche");
        traductor1.introducirValores("red", "rojo");
        traductor1.introducirValores("blue", "azul");
        System.out.println("------------------Imprimo lista de palabras en ingles-------------");
        for (String listaPalabrasIngle : traductor1.listaPalabrasIngles()) {
            System.out.println(listaPalabrasIngle);

        }
        System.out.println("--------------------elimino una palabra y imprimo la lista de palabras restantes");
        traductor1.eliminarValores("one");
        
        for (String listaPalabrasIngles : traductor1.listaPalabrasIngles()) {
            System.out.println(listaPalabrasIngles);
        }

        
        System.out.println("----------------------traduzco una palabra de ingles a espaniol------------");
        
        System.out.println(traductor1.traducir("red"));
        
        
        
        
        
    }

}
