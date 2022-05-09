/*
C. Leer un número entero entre 1 y 10 y mostrar el número escrito en 
numeros romanos. Usa Switch
 */
package EjerciciosCasa;

public class ejercicioCDiapositiva {

    public static void main(String[] args) {
        // le doy un valor cualquiera para que me lo lea por consola
        int numEntero = 5;
        char numRomano= 5; 
    /*    //no se si es char o String
        char numRomano;

        if (numEntero = 1) {
            numRomano = 'I';
        } else {
            if (numEntero = 2) {
              numRomano = 'II'; 
            }
        }
        else 
*/
    
    switch (numRomano) { 
        case '1': System.out.println("I");
        break;
        case '2': System.out.println("II");
        break;
        case '3': System.out.println("III");
        break;
        case '4': System.out.println("IV");
        break;
        case '5': System.out.println("V");
        break;
        case '6': System.out.println("VI");
        break;
        case '7': System.out.println("VII");
        break;
        case '8': System.out.println("VIII");
        break;
        case '9': System.out.println("IX");
        break;
        //case '10': System.out.println("X");
       // break;
        
        default: System.out.println("Vuelve a intentarlo");
        break;
        
        
        
        
    }
    }

}
