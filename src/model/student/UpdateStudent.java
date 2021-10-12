package model.student;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import server.connection.Conexion;

import static server.querys.tools.PredefinedQuerys.*;

public class UpdateStudent {
    public static void updateStudent(int opcion, String DNI, String value) throws SQLException {
        PreparedStatement statement=null;

        if(opcion == 0){
            statement= Conexion.getCon().prepareStatement(UPDATE_STUDENT_NAME);
            statement.setString(1,value);
            statement.setString(2,DNI);
        }
        if(opcion == 1){
            statement= Conexion.getCon().prepareStatement(UPDATE_STUDENT_FIRST_LAST_NAME);
            statement.setString(1,value);
            statement.setString(2,DNI);

        }
        if(opcion == 2){
            statement= Conexion.getCon().prepareStatement(UPDATE_STUDENT_SECOND_LAST_NAME);
            statement.setString(1,value);
            statement.setString(2,DNI);

        }
        if(opcion == 3){
            statement= Conexion.getCon().prepareStatement(UPDATE_STUDENT_DNI);
            statement.setString(1,value);
            statement.setString(2,DNI);

        }
        statement.executeUpdate();
    }
}
