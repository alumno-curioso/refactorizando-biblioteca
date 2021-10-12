package model.users;

import server.querys.tools.PredefinedQuerys;
import server.querys.tools.QueryExecutor;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateUser {


    public static void updateUserPassword(String userName, String password) throws SQLException {

        PreparedStatement statement = QueryExecutor.queryExecutor(PredefinedQuerys.UPDATE_USER);
        statement.setString(1,password);
        statement.setString(2,userName);
        statement.executeUpdate();

    }
}
