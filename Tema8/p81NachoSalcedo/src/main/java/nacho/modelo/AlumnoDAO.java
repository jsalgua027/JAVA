/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nacho.modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nacho
 */
public class AlumnoDAO  implements IPersona{
    
  private Connection con = null;
  
  public AlumnoDAO(){
      con = Conexion.getInstance();
  }
    
  
   @Override
    public List<AlumnoVO> getAll() throws SQLException {
        List<AlumnoVO> lista = new ArrayList<>();

        // Preparamos la consulta de datos mediante un objeto Statement
        // ya que no necesitamos parametrizar la sentencia SQL
        try (Statement st = con.createStatement()) {
            // Ejecutamos la sentencia y obtenemos las filas en el objeto ResultSet
            ResultSet res = st.executeQuery("select * from alumno");
            // Ahora construimos la lista, recorriendo el ResultSet y mapeando los datos
            while (res.next()) {
                AlumnoVO p = new AlumnoVO();
                // Recogemos los datos de la persona, guardamos en un objeto
                p.setNumexped(res.getInt("numexped"));
                p.setNomalum(res.getString("nomalum"));
                p.setApe1alum(res.getString("ape1alum"));
                p.setDireccion(res.getString("direccion"));
                
                

                //Añadimos el objeto a la lista
                lista.add(p);
            }
        }

        return lista;
    }
  
  
  
  
}
