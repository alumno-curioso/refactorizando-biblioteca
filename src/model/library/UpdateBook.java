package model.library;

import server.querys.tools.QueryExecutor;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateBook {
    public static void updateBook(int code, String queryToRun, String value) throws SQLException {
        PreparedStatement statement = QueryExecutor.queryExecutor(queryToRun);
        statement.setString(1,value);
        statement.setInt(2,code);
        statement.executeUpdate();
    }

    public static void updateBook(int code, String queryToRun, int value) throws SQLException {
        PreparedStatement statement = QueryExecutor.queryExecutor(queryToRun);
        statement.setInt(1,value);
        statement.setInt(2,code);
        statement.executeUpdate();
    }
}
