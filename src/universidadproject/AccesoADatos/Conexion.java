
package universidadproject.AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public abstract class Conexion {
    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected PreparedStatement sentencia = null;

    private final String USER = "root";
    private final String PASSWORD = "";
    private final String DATABASE = "construirsa";
    private final String DRIVER = "org.mariadb.jdbc.Driver";

    protected void conectarBase() throws ClassNotFoundException, SQLException {
        if (conexion == null) {
            try {
                Class.forName(DRIVER);
                String urlBaseDeDatos = "jdbc:mariadb://localhost:3306/" + DATABASE;
                conexion = DriverManager.getConnection(urlBaseDeDatos, USER, PASSWORD);
            } catch (ClassNotFoundException | SQLException ex) {
                throw ex;
            }
        }
    }

    protected void desconectarBase() throws Exception {
        try {
            if (resultado != null) {
                resultado.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        } catch (Exception ex) {
            throw ex;
        }
    }

}
