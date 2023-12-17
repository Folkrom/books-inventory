package proyecto.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    // Atributos para conectarse a la DB
    private static final String URL = "jdbc:mysql://localhost:3306/inventario_libros";
    private static final String USER = "root";
    private static final String PASSWORD = "admin";
    // Objeto de tipo connection para manejar la DB
    protected Connection con = null;

    // Metodo getConexion(): intenta conectar a la DB, si lo logra guarda la
    // conexion en la variable 'con', caso contrario imprime la excepcion.
    public Connection getConexion() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }

}
