/*
 * EJERCICO 9.¿Cuánto vale variable2 al finalizar la ejecución del switch?
 */
package estructuraSeleccion;

public class Ej09 {

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
                System.out.println("El valor de variable 2 es: " + variable2);
                //break;
                
            case 4:
                variable2 = 10;
                //añado break faltante
                System.out.println("El valor de variable 2 es: " + variable2);
                //break;
                
            default:
                variable2 = 100;
                break;

         /*SOLUCIÓN 
             Como no le añado el break se ejecuta hasta el final que  si que tiene.
          */      
                
                
        }//close switch
        System.out.println("El valor de variable 2 es: " + variable2);
    }

}
