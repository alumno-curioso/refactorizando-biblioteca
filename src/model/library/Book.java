package model.library;

import server.querys.tools.PredefinedQuerys;
import server.querys.tools.QueryExecutor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static server.querys.tools.PredefinedQuerys.GET_BOOK_ID;
import static server.querys.tools.QueryExecutor.queryExecutor;

public class Book {
    private String  state,
                    signature,
                    publishingHouse,
                    author,
                    tittle;
    private int     code;

    public Book(String state, String signature, String publishingHouse, String author, String tittle, int code) {
        this.state = state;
        this.signature = signature;
        this.publishingHouse = publishingHouse;
        this.author = author;
        this.tittle = tittle;
        this.code = code;
    }

    public String getState() {
        return state;
    }

    public String getSignature() {
        return signature;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public String getAuthor() {
        return author;
    }

    public String getTittle() {
        return tittle;
    }

    public int getCode() {
        return code;
    }

    public boolean isValidBook(){
       return isValidCode() &&
        isValidAuthor() &&
        isvalidPublishingHouse() &&
        isValidSignature() &&
        isValidState()&&
        isValidTitle();
    }

    public int numOfValidBookParameters(){
        int numOfParameters = 0;
        if (isValidTitle()) numOfParameters++;
        if (isValidState()) numOfParameters++;
        if (isValidSignature()) numOfParameters++;
        if (isvalidPublishingHouse()) numOfParameters++;
        if (isValidAuthor()) numOfParameters++;
        if (isValidCode()) numOfParameters++;

        return (numOfParameters==0) ? 0:
                (numOfParameters==1)? 1:2;
    }
    private boolean isValidTitle() {

        return !this.tittle.equals("");
    }

    private boolean isValidState() {
        return !this.state.equals("");
    }

    private boolean isValidSignature() {
        return !this.signature.equals("");
    }

    private boolean isvalidPublishingHouse() {
        return !this.publishingHouse.equals("");
    }

    private boolean isValidAuthor() {
        return !this.author.equals("");
    }

    private boolean isValidCode() {
        return this.code>0;
    }

    public static boolean isValidCode(String code) throws SQLException {
        PreparedStatement statement = queryExecutor(GET_BOOK_ID);
        statement.setInt(1,Integer.parseInt(code));
        ResultSet resultSet= statement.executeQuery();
        if(resultSet.next()) return true;
        return false;
    }


}
