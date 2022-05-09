/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.util.ArrayList;

/**
 *
 * @author nacho
 *
 * Crea una lista de personas (con la clase ArrayList) y prueba a añadir varios
 * alumnos y varios profesores a la lista. Recorre la lista y llama al método
 * identificate() de cada objeto. Muestra los datos de cada objeto. Usa el
 * operador instanceof en cada iteración para mostrar la clase de cada uno de
 * los objetos y llamar al método getID si es un Estudiante o llamar al método
 * getEspecialidad si es un Profesor. ¿Puedes crear objetos de la clase Persona?
 * Repite el ejercicio pero usando una lista de objetos de tipo Identificable.
 * ¿Por qué es posible?
 *
 *
 *
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Persona> tiposPersonas = new ArrayList<>();
        
        tiposPersonas.add(new Profesor("programacion", "pepe", "sanchez", "4564561f", new Direccion("cielo", "estepona", "29506", "españa")));
        tiposPersonas.add(new Profesor("matematicas", "antonio", "salcedo", "47855j", new Direccion("agua", "algeciras", "11205", "españa")));
        tiposPersonas.add(new Estudiante("4523", "nacho", "salcedo", "585462j", new Direccion("del mar", "cadiz", "25006", "españa")));
        tiposPersonas.add(new Estudiante("5896", "alvaro", "martinez", "60895h", new Direccion("terremoto", "sevilla", "48546", "españa")));
        
        // imprimo el array
        for (Persona j : tiposPersonas) {
            //imprimrir la clase
            System.out.println(j.getClass());
            System.out.println(j);
        }

        for (Persona obj : tiposPersonas) {
            obj.identificate();
            if (obj instanceof Estudiante){
                System.out.println(((Estudiante) obj).getID());
            }if (obj instanceof Profesor){
                System.out.println(((Profesor) obj).getEspecialidad());
            }
        }
      // no puedo instanciar la clase persona porque es abstracta  Persona p1 = new Persona();
        
        ArrayList<Identificable> listaPersonas = new ArrayList<>();
        
        listaPersonas.add(new Profesor("programacion", "pepe", "sanchez", "4564561f", new Direccion("cielo", "estepona", "29506", "españa")));
         listaPersonas.add(new Profesor("matematicas", "antonio", "salcedo", "47855j", new Direccion("agua", "algeciras", "11205", "españa")));
        listaPersonas.add(new Estudiante("4523", "nacho", "salcedo", "585462j", new Direccion("del mar", "cadiz", "25006", "españa")));
        listaPersonas.add(new Estudiante("5896", "alvaro", "martinez", "60895h", new Direccion("terremoto", "sevilla", "48546", "españa")));
        
        for (Identificable obj1 : listaPersonas) {
            obj1.identificate();
            if(obj1 instanceof Estudiante){
                System.out.println(((Estudiante)obj1).getID());
            } if(obj1 instanceof Profesor){
                System.out.println(((Profesor)obj1).getEspecialidad());
            }
            
        }
        //puedo hacerlo con Identificable pq no es una clase abstracta
    }

}
