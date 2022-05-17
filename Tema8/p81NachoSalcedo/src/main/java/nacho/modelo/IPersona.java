/*
 * Interface que usa el patrón DAO sobre la tabla Persona
 */

package nacho.modelo;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * 
 */

public interface IPersona {
    
    // Método para obtener todos los registros de la tabla
    List<AlumnoVO> getAll() throws SQLException;
    
    // Méodo para obtener un registro a partir de la PK
    AlumnoVO findByPk(int pk) throws SQLException;
    
    // Método para insertar un registro
    int insertPersona (AlumnoVO persona) throws SQLException;
    
    // Método para insertar varios registros
    int insertPersona (List<AlumnoVO> lista) throws SQLException;
    
    // Método para borrar una persona
    int deletePersona (AlumnoVO p) throws SQLException;
    
    // Método para borrar toda la tabla
    int deletePersona() throws SQLException;
    
    // Método para modificar una persona. Se modifica a la persona que tenga esa 'pk'
    // con los nuevos datos que traiga la persona 'nuevosDatos'
    int updatePersona (int pk, AlumnoVO nuevosDatos) throws SQLException;
    
}
