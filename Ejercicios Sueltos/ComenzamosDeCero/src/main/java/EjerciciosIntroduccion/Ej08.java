/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosIntroduccion;

/**
 *
 * @author JoseIgnacio
 */
public class Ej08 {

    /**
     * 8.- Crea una nueva clase llamada Ej08, que contenga una llamada al método
     * public static void main(String[] args). La aplicación Java contendrá
     * comentarios descriptivos del código y realice lo siguiente: a.- Declara e
     * inicializa tres variables int (a=10, b=5, i=0) b.- Declara e inicializa
     * dos variables double (c=71.3 y d=4.8) c.- Realiza las siguiente
     * operaciones aritméticas a+b, a-b, a*b, a/b, c+d, c-d, c*d, c/d. El
     * resultado de cada operación se almacena en una nuevas variables que se
     * crearán para tal efecto. d.- Muestra el resultado de cada operación,
     * usando las variables creadas en el paso c). e.- También muestra en
     * pantalla los resultados de las siguientes operaciones: a*=3, b-=1, a/=b,
     * c+=d. f.- Finalmente, el programa muestra en consola la siguiente
     * información, en distintas instrucciones: valor de i, valor de i++, valor
     * de i y valor de ++i.
     *
     */
    public static void main(String[] args) {
        int a = 10, b = 5, i = 0;
        double c = 71.3, d = 4.8;
        //realizo las operaciones
        int r1 = a + b;
        int r2 = a - b;
        int r3 = a * b;
        int r4 = a / b;
        double r5 = c + d;
        double r6 = c - d;
        double r7 = c * d;
        double r8 = c / d;
        //muestro el resultado
        System.out.println("El resultado prmero es= " + r1);
        System.out.println("El resultado segundo es= " + r2);
        System.out.println("El resultado tercero es= " + r3);
        System.out.println("El resultado cuarto es= " + r4);
        System.out.println("El resulytado quinto es= " + r5);
        System.out.println("El resutlado sexto es= " + r6);
        System.out.println("El resultado septimo es= " + r7);
        System.out.println("El resultado octavo es= " + r8);

        //Nuevas operaciones 
        a *= 3;
        b -= 1;
        a /= b;
        c += d;
        System.out.println("a vale= " + a);
        System.out.println("b vale= " + b);
        System.out.println("c vale= " + d);
        
        //el valor de i
        i=1;
        System.out.println("el valor de i= "+ i);
        System.out.println("el valor de i++= " + i++ );
        System.out.println("el valor de i= "+ i);
        System.out.println("el valor de ++i= "+ ++i);
        
        
        
    }

}
