package model.student;

import server.connection.Conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static server.querys.tools.PredefinedQuerys.DELETE_STUDENT;
import static server.querys.tools.PredefinedQuerys.DELETE_USER;
import static server.querys.tools.QueryExecutor.updateExecutor;

public class DeleteStudent {

    public static void deleteStudent(String DNI) throws SQLException {
        PreparedStatement statement = Conexion.getCon().prepareStatement(DELETE_STUDENT);
        statement.setString(1,DNI);
        statement.executeUpdate();
    }

}
