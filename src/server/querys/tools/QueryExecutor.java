package server.querys.tools;

import server.connection.Conexion;

import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.sql.Statement;

public class QueryExecutor {





    public static PreparedStatement queryExecutor (String queryToRun) throws SQLException {
        PreparedStatement statement;

        statement = Conexion.getCon().prepareStatement(queryToRun);

        return statement;
    }

    public static Statement simpleExecutor(String queryToRun) throws SQLException{
        Statement statement;

        statement = Conexion.getCon().prepareStatement(queryToRun);

        return statement;
    }

}

