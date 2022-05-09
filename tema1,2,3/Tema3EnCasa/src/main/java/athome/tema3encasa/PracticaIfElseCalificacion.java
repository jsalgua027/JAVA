/*
 * Ejercicio calificación de clase
 */
package athome.tema3encasa;

//import javax.swing.JOptionPane;


/**
 *
 * @author Victoria
 */
public class PracticaIfElseCalificacion {

    public static void main(String[] args) {
     
     //String calificacion = JOptionPane.showInputDialog("Introduce tu nota");
     
     //double texto = Double.parseDouble(calificacion);
       //Comprobación 
   //  System.out.println(calificacion);  
      
     //Defino if else
     int calificacion= 7;
     
     if (calificacion ==10) {
        System.out.println("Matrícula de Honor"); 
     }
     else { //else1
         if (calificacion == 9){System.out.println("Sobresaliente");
         }
       
         else { //else2
         if (calificacion >=7){System.out.println("Notable");
         }
         else { //else3
          if (calificacion == 6){System.out.println("Bien");
          
          }
         
          else { //else4
           if (calificacion ==5){System.out.println("Aprobado");           
          }
           else { //else5
               System.out.println("Suspenso");
              } //else5
           } //else4
              
          } //else3
    
         }//else2
       } //else1   
     }  
    
}
