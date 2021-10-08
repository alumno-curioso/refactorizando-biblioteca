package model.student;

import model.tools.tables.MakeTable;
import view.StudentView;

import java.sql.SQLException;

public class ShowAllStudents {

    public static void fillTable(StudentView studentView) throws SQLException {
        String alumnos = "alumnos";
        studentView.getJtStudents().setModel(MakeTable.makeTable(alumnos));
    }
}
