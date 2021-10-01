package server.querys.tools;

import server.connection.Conexion;

import java.sql.PreparedStatement;

import java.sql.SQLException;

public class QueryExecutor {


    private static PreparedStatement statement;


    public static PreparedStatement queryExecutor (String queryToRun){

        try {
            statement = Conexion.getCon().prepareStatement(queryToRun);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return statement;
    }

}
