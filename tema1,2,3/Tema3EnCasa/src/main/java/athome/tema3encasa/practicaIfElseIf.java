/*

 */
package athome.tema3encasa;


public class practicaIfElseIf {

    
    public static void main(String[] args) {
       //Editar la variable para al ejecutar visualizar que resultado
      int calificacion = 7;
      
      if (calificacion == 10){
          System.out.println("Matrícula de Honor"); 
      } 
      else if (calificacion ==9){ 
          System.out.println("Sobresaliente");
      }
      else if (calificacion >= 7) {
          System.out.println("Notable");
      }
      else if (calificacion == 6) {
          System.out.println("Bien");
    }
      else if (calificacion == 5) {
          System.out.println("Aprobado");
    }  
      else {
          System.out.println("Suspenso");
      }
        
    }
    
}
