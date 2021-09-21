package server;

import java.sql.*;

public class Conexion {

    private final String URL_DB = "jdbc:mysql://localhost:33060";
    private final String USER_DB = "root";
    private final String PASSWORD_DB = "root";

    Connection con;

    {
        try {
            con = DriverManager.getConnection(URL_DB,USER_DB,PASSWORD_DB);
            System.out.println("conectado");
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("ha ocurrido un error");
        }
    }


}
