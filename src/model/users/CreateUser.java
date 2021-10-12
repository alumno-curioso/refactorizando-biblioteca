package model.users;

import server.connection.Conexion;
import server.querys.tools.PredefinedQuerys;
import server.querys.tools.QueryExecutor;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import static server.querys.tools.PredefinedQuerys.CREATE_USER;
import static server.querys.tools.QueryExecutor.queryExecutor;

public class CreateUser {


    public static void inserNewUser(String userName, String password) throws SQLException {

        PreparedStatement statement = queryExecutor(CREATE_USER);
        statement.setString(1,password);
        statement.setString(2,userName);
        statement.executeUpdate();

    }


}
