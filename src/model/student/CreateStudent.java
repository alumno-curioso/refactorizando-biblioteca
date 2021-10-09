package model.student;

import static server.querys.tools.PredefinedQuerys.CREATE_STUDENT;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static server.querys.tools.QueryExecutor.updateExecutor;

public class CreateStudent {
    public static void insertNewStudent(String name, String firstLastName, String secondLastName, String DNI) throws SQLException {
        ResultSet resultSet;
        PreparedStatement statement = updateExecutor(CREATE_STUDENT);
        statement.setString(1,DNI);
        statement.setString(2,name);
        statement.setString(3,firstLastName);
        statement.setString(4,secondLastName);
        statement.executeUpdate();

//        resultSet = statement.executeQuery();
    }
}
