package todojunto.conexion;

import javax.swing.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private void ClaseDatos() {
        try {

            //Class.forName("com.mysql.jdbc.Driver"); esta es la otra opción para crear una conexión.
//            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            String sUrl = "jdbc:mysql://localhost:3306/libros";
            conn = DriverManager.getConnection(sUrl, "root", "1234");
            JOptionPane.showMessageDialog(null, "Conectado!!!!");

        } catch (SQLException ex) {
            conn = null;
            throw new RuntimeException("Error con la conexión!!!");
        }
    }
}
