package model.student;

import server.connection.Conexion;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static server.querys.tools.GetColumnsNames.getColumnNames;
import static server.querys.tools.PredefinedQuerys.*;
import static server.querys.tools.QueryExecutor.queryExecutor;

public class ReadStudents {
    private static PreparedStatement statement;
    private static ResultSet resultSet;

    private static int count;

    private static String[] COLUMNS_NAMES;

    static {
        try {
            COLUMNS_NAMES = getColumnNames("alumnos");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static TableModel fillTable() throws SQLException {

        int     rows    = getRowSize("alumnos");
                count   = 0;

        String[][] info = new String[rows][COLUMNS_NAMES.length];

        statement = Conexion.getCon().prepareStatement(ALL_INFO_FROM_STUDENT_TABLE);
        resultSet = statement.executeQuery();


        while (resultSet.next()){
            for (int i = 0; i < info[0].length; i++) {
                info[count][i] = resultSet.getString(COLUMNS_NAMES[i]);
            }
            count++;
        }
        return new DefaultTableModel(info,COLUMNS_NAMES);
    }

    public static TableModel showByName(String name) throws SQLException {
        count = 0;
        String info[][]= new String[getRowSize(name,"nombre")][COLUMNS_NAMES.length];
        statement = queryExecutor(FIND_BY_STUDENT_NAME);
        statement.setString(1,name);
        resultSet = statement.executeQuery();

        while (resultSet.next()){

            for (int i = 0; i< COLUMNS_NAMES.length ;i++) {
                info[count][i] = resultSet.getString(COLUMNS_NAMES[i]);
            }
            count++;
        }

        return new DefaultTableModel(info,COLUMNS_NAMES);
    }

    public static TableModel showByFirstLastName(String firstLastName) throws SQLException {
        int count = 0;
        String info[][]= new String[getRowSize(firstLastName,"apellido1")][COLUMNS_NAMES.length];
        statement = queryExecutor(FIND_BY_STUDENT_FIRST_LAST_NAME);
        statement.setString(1,firstLastName);
        resultSet = statement.executeQuery();

        while (resultSet.next()){

            for (int i = 0; i< COLUMNS_NAMES.length ;i++) {
                info[count][i] = resultSet.getString(COLUMNS_NAMES[i]);
            }
            count++;
        }

        return new DefaultTableModel(info,COLUMNS_NAMES);
    }

    public static TableModel showBySecondLastName(String SecondLastName) throws SQLException {
        count = 0;
        String info[][]= new String[getRowSize(SecondLastName,"apellido2")][COLUMNS_NAMES.length];
        statement = queryExecutor(FIND_BY_STUDENT_SECOND_LAST_NAME);
        statement.setString(1,SecondLastName);
        resultSet = statement.executeQuery();

        while (resultSet.next()){

            for (int i = 0; i< COLUMNS_NAMES.length ;i++) {
                info[count][i] = resultSet.getString(COLUMNS_NAMES[i]);
            }
            count++;
        }

        return new DefaultTableModel(info,COLUMNS_NAMES);
    }

    public static TableModel showByDNI(String DNI) throws SQLException {
        count = 0;
        String info[][]= new String[getRowSize(DNI,"dni")][COLUMNS_NAMES.length];
        statement = queryExecutor(FIND_BY_STUDENT_DNI);
        statement.setString(1,DNI);
        resultSet = statement.executeQuery();

        while (resultSet.next()){

            for (int i = 0; i< COLUMNS_NAMES.length ;i++) {
                info[count][i] = resultSet.getString(COLUMNS_NAMES[i]);
            }
            count++;
        }

        return new DefaultTableModel(info,COLUMNS_NAMES);
    }

    static int getRowSize(String attribute, String columnName) throws SQLException {
        String query = "select count(*) from alumnos where "+columnName+"=?";
        statement = queryExecutor(query);
        statement.setString(1,attribute);
        resultSet = statement.executeQuery();
        resultSet.next();
        return resultSet.getInt(1);

    }

    static int getRowSize(String name) throws SQLException {
        statement = queryExecutor("select count(*) from alumnos");
//        statement.setString(1,name);
        resultSet = statement.executeQuery();
        resultSet.next();
        return resultSet.getInt(1);

    }
}
