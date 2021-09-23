package server.connection;

import java.sql.*;

public class Conexion {

    private final String URL_DB = "jdbc:mysql://localhost:33060/biblioteca";
    private final String USER_DB = "root";
    private final String PASSWORD_DB = "root";

    private Connection con;

    public Conexion(){
        try {
            con = DriverManager.getConnection(URL_DB,USER_DB,PASSWORD_DB);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getCon() {
        return con;
    }

    public void close(){

        try {
            this.con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //    con = DriverManager.getConnection(URL_DB,USER_DB,PASSWORD_DB);
//            System.out.println("conectado");
//            con.close();
//
//            e.printStackTrace();
//            System.out.println("ha ocurrido un error");




}
