package model.library;

import server.querys.tools.PredefinedQuerys;
import server.querys.tools.QueryExecutor;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import static server.querys.tools.PredefinedQuerys.CREATE_BOOK;
import static server.querys.tools.QueryExecutor.queryExecutor;

public class CreateBook {
    public static void createBook(Book newBook) throws SQLException {
        PreparedStatement statement = queryExecutor(CREATE_BOOK);
        statement.setString(1, newBook.getState());
        statement.setString(2, newBook.getSignature());
        statement.setString(3, newBook.getPublishingHouse());
        statement.setString(4, newBook.getAuthor());
        statement.setString(5, newBook.getTittle());
        statement.setInt(6,newBook.getCode());
        statement.executeUpdate();
    }
}
