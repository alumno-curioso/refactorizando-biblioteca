package server.querys;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static server.querys.tools.PredefinedQuerys.CHECK_USER;
import static server.querys.tools.QueryExecutor.*;

public class ValidateUser {

    private static PreparedStatement statement;
    private static ResultSet rs;

    public static boolean isValidUser(String user, String password) throws SQLException {


            statement = queryExecutor(CHECK_USER);
            statement.setString(1,user);
            statement.setString(2,password);

            rs = statement.executeQuery();


            return (rs.next())?true:false;

    }
}
