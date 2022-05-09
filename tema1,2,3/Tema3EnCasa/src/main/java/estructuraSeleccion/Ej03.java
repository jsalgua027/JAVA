
/*EJERCICIO 3 
 * ¿Qué devuelven estas expresiones?
 */
package estructuraSeleccion;

public class Ej03 {

    public static void main(String[] args) {

        /*A. boolean unaCondicion = true;
      resultado = unaCondicion ? valor1 : valor2; 
         */
        //Solución a. da error porque las variables valor1 y valor 2 no estan 
        //declaradas ni inicializadas
        /*B.int x = 10;
        int y = (x > 9) ? 100 : 200;
         */
        //estructura ternario. 
        //(condición logica) ? valor si T : valor si F ; 
        System.out.println("APARTADO B");
        int x = 10;
        int y = (x > 9) ? 100 : 200;

        System.out.println("En este caso y vale: ");
        System.out.println(y);

        //pruebo otra opción, la condición va a ser F  
        int b = (x > 20) ? 100 : 200;
        System.out.println("En este caso, b vale: ");
        System.out.println(b);

        /*C.int publico = 19500;
    	int vendidas = 19000;
	int aforo = 2000;
  	String status = (publico < aforo) ? "Cabe mas gente": (vendidas < aforo) ? "Aun no hemos vendido todo" : "Esta todo vendido";
         */
        System.out.println("APARTADO C");
        int publico = 19500;
        int vendidas = 19000;
        int aforo = 2000;
        //publico menor que aforo. aforo es menor que 
        String status = (publico > aforo) ? "Cabe mas gente" : (vendidas > aforo)
                ? "Aun no hemos vendido todo" : "Esta todo vendido";
        System.out.println(status);
        //Impresión 1 con enunciado = "esta todo vendido"
        //Impr 2 publico > aforo "cabe más gente
        //impr 3  vendidas > aforo " aun no hemos vendido todo"
        //impr 4 publico >aforo vendidas > aforo "cabe más gente

    }

}
