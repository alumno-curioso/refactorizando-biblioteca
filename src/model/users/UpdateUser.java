package model.users;

import server.querys.tools.PredefinedQuerys;
import server.querys.tools.QueryExecutor;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import static server.querys.tools.PredefinedQuerys.UPDATE_USER_NAME;
import static server.querys.tools.PredefinedQuerys.UPDATE_USER_PASSWORD;
import static server.querys.tools.QueryExecutor.queryExecutor;

public class UpdateUser {


    public static void updateUserPassword(String userName, String password) throws SQLException {

        PreparedStatement statement = queryExecutor(UPDATE_USER_PASSWORD);
        statement.setString(1,password);
        statement.setString(2,userName);
        statement.executeUpdate();

    }

    public static void updateUSerName(String user, String newUSerName) throws SQLException {
        PreparedStatement statement = queryExecutor(UPDATE_USER_NAME);
        statement.setString(1, newUSerName);
        statement.setString(2, user);
        statement.executeUpdate();
    }
}
