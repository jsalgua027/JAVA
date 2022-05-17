/*
 * Esta clase aplica el patrón SINGLETON
 */
package nacho.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * 192.168.56.101:3306--->> direccion IP en clase; ojo con el usuario que es
 * nacho
 */
public class Conexion {

    private static final String SERVIDOR = "jdbc:mysql://localhost/";
    private static final String NOMBRE_BASE_DATOS = "baseDatosP81";
    private static final String USER = "root";
    private static final String PASS = "71206692";

    private static Connection instancia = null;

    // Constructor privado no accesible desde otras clases
    private Conexion() {

    }

    // Método de clase para acceder a la instancia del objeto Connection
    public static Connection getInstance() {
        // Si el objeto Connection no está creado, se crea
        if (instancia == null) {
            try {

                // Se crea el objeto Connection	
                instancia = DriverManager.getConnection(SERVIDOR + NOMBRE_BASE_DATOS + "?serverTimezone=UTC", USER, PASS);

                System.out.println("Conexión realizada con éxito.");

            } catch (SQLException e) {

                // Error en la conexión
                System.out.println("Conexión fallida: " + e.getMessage());
            }
        }
        return instancia;
    }

}
