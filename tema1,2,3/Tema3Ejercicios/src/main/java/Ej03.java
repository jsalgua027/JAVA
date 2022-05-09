/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JoseIgnacio
 */
public class Ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //¿Que devulven las expresiones?
//a)
        boolean unaCondicion = true;
        resultado = unaCondicion ? valor1 : valor2;
        //En el apartado a) devolverian un booleano true/false
//b)        
        int x = 10;
        int y = (x > 9) ? 100 : 200;
        //daría error porque estas comparando una condición con un valor (que es decimal)
//c)

        int publico = 19500;
        int vendidas = 19000;
        int aforo = 2000;
        String status = (publico < aforo) ? "Cabe mas gente" : (vendidas < aforo) ? "Aun no hemos vendido todo" : "Esta todo vendido";

    }

}
