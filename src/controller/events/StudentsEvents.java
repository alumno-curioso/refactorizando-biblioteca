package controller.events;

import controller.controllers.LoanController;
import controller.controllers.MainController;
import model.student.CreateStudent;
import model.student.ShowAllStudents;
import server.connection.Conexion;
import server.querys.tools.GetColumnSize;
import server.querys.tools.GetColumnsNames;
import server.querys.tools.GetRowSize;
import view.StudentView;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentsEvents implements ActionListener {

    private StudentView studentView;

    public StudentsEvents(StudentView studentView) {
        this.studentView = studentView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String selectedAction = e.getActionCommand();
        System.out.println(selectedAction);

        try {
            //todo implementar la logica de cada accion
            if (selectedAction.equals("CREAR")) {
                createStudent();

            }
            if (selectedAction.equals("CONSULTAR")) {
                System.out.println("ok");

                //TODO refactorizar esta parte del codigo

                ShowAllStudents.fillTable(this.studentView);

//                ShowAllStudents.fillTable(studentView);

            }
            if (selectedAction.equals("MODIFICAR")) {
                System.out.println("ok");
            }
            if (selectedAction.equals("BORRAR")) {
                System.out.println("ok");
            }
            if (selectedAction.equals("PRESTAMOS")) {
                System.out.println("ok");
                studentView.dispose();
                LoanController.runLoanView();
            }
            if (selectedAction.equals("VOLVER")) {
                System.out.println("ok");
                studentView.dispose();
                MainController.runMainView();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void createStudent() throws SQLException{
        boolean hasADNI = (!this.studentView.getJtDNI().equals("")),
                hasFirstLastName = (!this.studentView.getJtStudentLastName1().equals("")),
                hasSecondLastName = (!this.studentView.getJtStudentLastName2().equals("")),
                hasName = (!this.studentView.getJtStudentName().equals(""));

        boolean isPossibleToCreate = (hasADNI&&hasFirstLastName&&hasSecondLastName&&hasName);

        if(!isPossibleToCreate){
            JOptionPane.showMessageDialog(this.studentView,"Por favor antes de crear un registro asegurese de tener los campos de nombre, apellidos y dni");
        }
        else {
            System.out.println("crear alumno");
            CreateStudent.insertNewStudent(this.studentView.getJtStudentName(),this.studentView.getJtStudentLastName1(),this.studentView.getJtStudentLastName2(),this.studentView.getJtDNI());
        }
    }

    //todo hacer los metodos privados para usar en el action performed

    private void readStudents(JTable studentTable) {

    }
}
