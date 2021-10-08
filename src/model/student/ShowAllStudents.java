package model.student;

import model.tools.tables.MakeTable;
import server.connection.Conexion;
import server.querys.tools.GetColumnSize;
import server.querys.tools.GetColumnsNames;
import server.querys.tools.GetRowSize;
import server.querys.tools.PredefinedQuerys;
import view.StudentView;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static server.querys.tools.GetColumnSize.getColumSize;
import static server.querys.tools.GetColumnsNames.getColumnNames;
import static server.querys.tools.GetRowSize.getRowSize;
import static server.querys.tools.PredefinedQuerys.ALL_INFO_FROM_STUDENT_TABLE;

public class ShowAllStudents {

    private static PreparedStatement statement;
    private static ResultSet resultSet;

    public static void fillTable(StudentView studentView) throws SQLException {

        int rows    = getRowSize("alumnos"),
            columns = getColumSize("alumnos"),
            count   = 0;

        String[] nombres = new String[columns];
        nombres = getColumnNames("alumnos");

        String[][] info = new String[rows][columns];

        statement = Conexion.getCon().prepareStatement(ALL_INFO_FROM_STUDENT_TABLE);
        resultSet = statement.executeQuery();

        while (count<rows){
            resultSet.next();
            for (int i = 0; i < info[0].length; i++) {
                info[count][i] = resultSet.getString(i+1);
            }
            count++;
        }
        TableModel table = new DefaultTableModel(info,nombres);

        studentView.getJtStudents().setModel(table);

    }
}
