package server.connection;

import java.sql.*;

public class Conexion {

    private final String URL_DB = "jdbc:mysql://localhost:33060/biblioteca";
    private final String USER_DB = "root";
    private final String PASSWORD_DB = "root";

    private static Connection conexion;

    private Conexion(){
        try {
            conexion = DriverManager.getConnection(URL_DB,USER_DB,PASSWORD_DB);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getCon() {
        if(conexion==null){
            new Conexion();
        }
        return conexion;
    }

}
