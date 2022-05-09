/*
 * EJERCICIO 10. modifica el código para que variable2 de 30
 */
package estructuraSeleccion;

/**
 *
 * 
 */
public class Ej10 {

    public static void main(String[] args) {
        int variable = 3, variable2;

        switch (variable) { //open switch
            case 1:
                variable2 = 5;
                break;
            case 2:
                variable2 = 20;
                break;

            case 3:
                variable2 = 30;
                //le añado break que falta
                break;

            case 4:
                variable2 = 10;
                //añado break faltante
                break;

            default:
                variable2 = 100;
                break;

            /*SOLUCIÓN, me falta añadir break en 3 y 4, si no lo añado el código
                sigue corriendo y no da ningún resultado.
             */
        }//close switch
        System.out.println("El valor de variable 2 es: " + variable2);

    }

}
