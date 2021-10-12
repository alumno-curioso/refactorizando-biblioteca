package model.users;

import server.querys.tools.PredefinedQuerys;
import server.querys.tools.QueryExecutor;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import static server.querys.tools.PredefinedQuerys.DELETE_USER;
import static server.querys.tools.QueryExecutor.queryExecutor;

public class DeleteUser {
    public static void deleteUser(String userName) throws SQLException {
        PreparedStatement statement = queryExecutor(DELETE_USER);
        statement.setString(1,userName);
        statement.executeUpdate();
    }
}
