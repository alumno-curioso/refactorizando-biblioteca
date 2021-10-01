package server.connection;

import java.sql.*;

public class Conexion {

    private static final String URL_DB = "jdbc:mysql://localhost:33060/biblioteca";
    private static final String USER_DB = "root";
    private static final String PASSWORD_DB = "root";

    private static Connection conexion;

    private Conexion(){

    }

    public static Connection getCon() {
        if(conexion==null){
            conexion = abrirConexion();
        }
        return conexion;
    }

    public static Connection abrirConexion(){
        try {
            conexion = DriverManager.getConnection(URL_DB,USER_DB,PASSWORD_DB);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conexion;
    }

}
