package model.library;

import server.querys.tools.PredefinedQuerys;
import server.querys.tools.QueryExecutor;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteBook {

    public static void deleteBook(int code) throws SQLException {
        PreparedStatement statement = QueryExecutor.queryExecutor(PredefinedQuerys.DELETE_BOOK);
        statement.setInt(1,code);
        statement.executeUpdate();
    }

}
