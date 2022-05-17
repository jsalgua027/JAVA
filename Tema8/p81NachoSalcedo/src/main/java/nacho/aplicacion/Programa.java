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
        
        listaAlumnos.add(new AlumnoVO(1, "pepe", "perez", "calle arturo"));
        listaAlumnos.add(new AlumnoVO(2, "jose juan", "loco", "calle loco"));
        listaAlumnos.add(new AlumnoVO(3, "antonio", "jull", "calle jull"));
        listaAlumnos.add(new AlumnoVO(4, "pedro", "gutierrez", "calle gutierrez"));
        listaAlumnos.add(new AlumnoVO(5, "enrique", "sanchez", "calle sanchez"));
        
        try {
            System.out.println("Nº personas insertadas " + daoAlumno.insertPersona(listaAlumnos));
            
        } catch (SQLException sqle) {
            System.out.println("No se ha podido realizar la operación:");
            System.out.println(sqle.getMessage());
            
        }
        
    }
    
}
