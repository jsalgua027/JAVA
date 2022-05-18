/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nacho.aplicacion;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import nacho.modelo.AlumnoDAO;
import nacho.modelo.AlumnoVO;

/**
 *
 * @author Windows10
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlumnoDAO daoAlumno = new AlumnoDAO();
        List<AlumnoVO> listaAlumnos = new ArrayList<>();
        
        listaAlumnos.add(new AlumnoVO(001, "pepe", "perez", "calle arturo"));
        listaAlumnos.add(new AlumnoVO(002, "jose juan", "loco", "calle loco"));
        listaAlumnos.add(new AlumnoVO(003, "antonio", "jull", "calle jull"));
        listaAlumnos.add(new AlumnoVO(004, "pedro", "gutierrez", "calle gutierrez"));
        listaAlumnos.add(new AlumnoVO(005, "enrique", "sanchez", "calle sanchez"));
        
        try {
            System.out.println("Nº personas insertadas " + daoAlumno.insertPersona(listaAlumnos));
             System.out.println("-----------------------------------------");
            System.out.println("Comprobamos en una nueva lista que se recogen los datos desde la tabla.");
            List<AlumnoVO> nuevaLista = daoAlumno.getAll();
            System.out.println("-------- Lista con datos recogidos desde la B.D -------------");
            nuevaLista.forEach(System.out::println);
            System.out.println("-----------------------------------------");
            System.out.println("Persona con primary key 1: ");
            System.out.println(daoAlumno.findByPk(1));
            System.out.println("-----------------------------------------");
            System.out.println("Se va a borrar la persona con pk 3");
            System.out.println("Nº personas borradas " + 
                    daoAlumno.deletePersona(new AlumnoVO(003,"antonio", "jull", "calle jull")));
             System.out.println("-----------------------------------------");
            nuevaLista = daoAlumno.getAll();
            System.out.println("-------- Lista con datos recogidos desde la B.D despues de borrar una persona -------------");
            nuevaLista.forEach(System.out::println);
            System.out.println("-----------------------------------------");
            System.out.println("Modificación de la persona con pk 5");
            System.out.println("Nº Personas modificadas " + 
                    daoAlumno.updatePersona(5, new AlumnoVO(5, "enrique", "sanchez", "calle sanchez")));
            System.out.println("-----------------------------------------");
            nuevaLista = daoAlumno.getAll();
            System.out.println("-------- Lista con datos recogidos desde la B.D despues de modificar una persona -------------");
            nuevaLista.forEach(System.out::println);
            System.out.println("-----------------------------------------");
            // este metodo hace la llamada a un procedimiento de mysql que en esta base no existe
//            System.out.println("Ejecución del procedimiento almacenado");
//            System.out.println("Se cambia pepe por jose juan");
//            System.out.println("Nombres cambiados " + daoAlumno.cambiarNombres("JJ", "jose juan"));
//            System.out.println("-----------------------------------------");
//            nuevaLista = daoAlumno.getAll();
            System.out.println("-------- Lista con datos recogidos desde la B.D despues de ejecutar proced. -------------");
            nuevaLista.forEach(System.out::println);
            System.out.println("-----------------------------------------");
        } catch (SQLException sqle) {
            System.out.println("No se ha podido realizar la operación:");
            System.out.println(sqle.getMessage());
           
            
        }
        
    }
    
}
