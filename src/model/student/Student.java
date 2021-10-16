package model.student;

import server.querys.tools.PredefinedQuerys;
import server.querys.tools.QueryExecutor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static server.querys.tools.PredefinedQuerys.GET_STUDENT_CODE;
import static server.querys.tools.QueryExecutor.queryExecutor;

public class Student {

    private static final int NO_CODE_FIND =0;

    private String  name,
                    firstLastName,
                    secondLastName,
                    DNI;

    public Student(String name, String firstLastName, String secondLastName, String DNI) {
        this.name = name;
        this.firstLastName = firstLastName;
        this.secondLastName = secondLastName;
        this.DNI = DNI;
    }

    public String getName() {
        return name;
    }

    public String getFirstLastName() {
        return firstLastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public String getDNI() {
        return DNI;
    }

    public static int getStundentCode(String DNI) throws SQLException {
        PreparedStatement statement = queryExecutor(GET_STUDENT_CODE);
        statement.setString(1,DNI);
        ResultSet resultSet = statement.executeQuery();
        if(resultSet.next()) {
            return resultSet.getInt(1);
        }
        return NO_CODE_FIND;
    }

    public static boolean isValidStudentCode(int studentCode){
        return (studentCode>0)?true:false;
    }
}
