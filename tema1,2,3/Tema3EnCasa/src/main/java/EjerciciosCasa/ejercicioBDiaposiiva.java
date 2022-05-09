/*
 *B. saber si un carácter es un dígito, una letra mayúscula o minúscula
UNICODE:
dígito 48-57
letra mayúscula 65-90
letra minúscula 97-122
 */
package EjerciciosCasa;

import javax.swing.JOptionPane;

public class ejercicioBDiaposiiva {

    
    public static void main(String[] args) {
        //Inicializo variable texto
      String texto = JOptionPane.showInputDialog(null,"Introduce un carácter");
        
        //Imprimo por consola el valor que acabo de introducir 
       JOptionPane.showMessageDialog(null, texto);
       
       //Conversión de variable string a int 
       int caracter = Integer.parseInt(texto);
       
       //Pongo condiciones del problema, estructura if else if 
       
       /* if (numero == 0){
            System.out.println("El número es neutro");
        }
        else if (numero > 0){
            System.out.println("El número  es positivo");
        }
        else {
            System.out.println("El número es negativo");
       
       */
       
       if (caracter >=48 && caracter <=57){
           System.out.println("Es un dígito");
       } 
       else if (caracter >=65 && caracter <=90){
           System.out.println("Es una letra mayúscula");
       } 
       else if (caracter >=97 && caracter <=122){
           System.out.println("Es una letra minúscula");
       } 
       else {System.out.println("número de carácter no válido, intentalo "
               + "de nuevo");}
     
    }
    
}
