/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nacho.modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nacho
 */
public class AlumnoDAO implements IPersona {

    private Connection con = null;

    public AlumnoDAO() {
        con = Conexion.getInstance();
    }

    @Override
    public List<AlumnoVO> getAll() throws SQLException {
        List<AlumnoVO> lista = new ArrayList<>();

        // Preparamos la consulta de datos mediante un objeto Statement
        // ya que no necesitamos parametrizar la sentencia SQL
        try ( Statement st = con.createStatement()) {
            // Ejecutamos la sentencia y obtenemos las filas en el objeto ResultSet
            ResultSet res = st.executeQuery("select * from alumnos");
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

    @Override
    public AlumnoVO findByPk(int pk) throws SQLException {

        ResultSet res = null;
        AlumnoVO alumno = new AlumnoVO();

        String sql = "select * from alumnos where pk= numexped";

        try ( PreparedStatement prest = con.prepareStatement(sql)) {
            // Preparamos la sentencia parametrizada
            prest.setInt(1, pk);

            // Ejecutamos la sentencia y obtenemos las filas en el objeto ResultSet
            res = prest.executeQuery();

            // Nos posicionamos en el primer registro del Resultset. Sólo debe haber una fila
            // si existe esa pk
            if (res.next()) {
                // Recogemos los datos de la persona, guardamos en un objeto

                alumno.setNumexped(res.getInt("numexped"));
                alumno.setNomalum(res.getString("nomalum"));
                alumno.setApe1alum(res.getString("ape1alum"));
                alumno.setDireccion(res.getString("direccion"));
                return alumno;

            }
            return null;
        }

    }

    @Override
    public int insertPersona(AlumnoVO alumno) throws SQLException {

        int numFilas = 0;
        String sql = "insert into alumnos values (?,?,?)";

        if (findByPk(alumno.getNumexped()) != null) {
            // Existe un registro con esa pk
            // No se hace la inserción
            return numFilas;
        } else {
            // Instanciamos el objeto PreparedStatement para inserción
            // de datos. Sentencia parametrizada
            try ( PreparedStatement prest = con.prepareStatement(sql)) {

                // Establecemos los parámetros de la sentencia
                prest.setInt(0, alumno.getNumexped());
                prest.setString(1, alumno.getNomalum());
                prest.setString(2, alumno.getApe1alum());
                prest.setString(3, alumno.getDireccion());

                numFilas = prest.executeUpdate();
            }
            return numFilas;
        }

    }

    @Override
    public int insertPersona(List<AlumnoVO> lista) throws SQLException {
        int numFilas = 0;

        for (AlumnoVO tmp : lista) {
            numFilas += insertPersona(tmp);
        }

        return numFilas;
    }

    @Override
    public int deletePersona() throws SQLException {

        String sql = "delete from alumnos";

        int nfilas = 0;

        // Preparamos el borrado de datos  mediante un Statement
        // No hay parámetros en la sentencia SQL
        try ( Statement st = con.createStatement()) {
            // Ejecución de la sentencia
            nfilas = st.executeUpdate(sql);
        }

        // El borrado se realizó con éxito, devolvemos filas afectadas
        return nfilas;

    }

    @Override
    public int deletePersona(AlumnoVO alumno) throws SQLException {
        int numFilas = 0;

        String sql = "delete from alumnos where pk = numexped";

        // Sentencia parametrizada
        try ( PreparedStatement prest = con.prepareStatement(sql)) {

            // Establecemos los parámetros de la sentencia
            prest.setInt(1, alumno.getNumexped());
            // Ejecutamos la sentencia
            numFilas = prest.executeUpdate();
        }
        return numFilas;
    }

    @Override
    public int updatePersona(int pk, AlumnoVO nuevosDatos) throws SQLException {

        int numFilas = 0;
        String sql = "update alumnos set numexped = ?, nomalum = ?, ape1alum = ?, direccion = ? where pk= numexped";

        if (findByPk(pk) == null) {
            // La persona a actualizar no existe
            return numFilas;
        } else {
            // Instanciamos el objeto PreparedStatement para inserción
            // de datos. Sentencia parametrizada
            try ( PreparedStatement prest = con.prepareStatement(sql)) {

                // Establecemos los parámetros de la sentencia
                prest.setInt(0, nuevosDatos.getNumexped());
                prest.setString(1, nuevosDatos.getNomalum());
                prest.setString(2, nuevosDatos.getApe1alum());
                prest.setString(3, nuevosDatos.getDireccion());

                numFilas = prest.executeUpdate();
            }
            return numFilas;
        }
    }

    public int cambiarNombres(String newName, String oldName) throws SQLException {

        int res = 0;
        // Dos ?, uno para newName y otro para oldName

        String sql = "{call cambiar_nombres (?,?)}";

        // Preparamos la llamada al procedimiento almacenado
        try ( CallableStatement call = con.prepareCall(sql)) {
            // Establecemos parámetros a pasar al procedimiento
            call.setString(1, newName);
            call.setString(2, oldName);
            // Ejecutamos el procedimiento
            res = call.executeUpdate();

        }
        return res;
    }

}
