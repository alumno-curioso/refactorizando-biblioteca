package controller.events;

import controller.controllers.LoanController;
import controller.controllers.MainController;
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

    public StudentsEvents(StudentView studentView){
        this.studentView = studentView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String selectedAction = e.getActionCommand();
        System.out.println(selectedAction);

        //todo implementar la logica de cada accion
        if(selectedAction.equals("CREAR")){
            System.out.println("ok");
        }
        if(selectedAction.equals("CONSULTAR")){
            System.out.println("ok");
            try {
                //TODO refactorizar esta parte del codigo

            ShowAllStudents.fillTable(this.studentView);

//                ShowAllStudents.fillTable(studentView);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        if(selectedAction.equals("MODIFICAR")){
            System.out.println("ok");
        }
        if(selectedAction.equals("BORRAR")){
            System.out.println("ok");
        }
        if(selectedAction.equals("PRESTAMOS")){
            System.out.println("ok");
            studentView.dispose();
            LoanController.runLoanView();
        }
        if(selectedAction.equals("VOLVER")){
            System.out.println("ok");
            studentView.dispose();
            MainController.runMainView();
        }
    }

    //todo hacer los metodos privados para usar en el action performed

    private void readStudents(JTable studentTable){

    }
}
