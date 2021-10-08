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

                System.out.println(GetRowSize.getRowSize("alumnos"));
//                PreparedStatement statement = Conexion.getCon().prepareStatement("select * from ?");
                Statement statement = Conexion.getCon().createStatement();
                ResultSet resultSet = statement.executeQuery("select * from alumnos");
                String[] nombres = new String[GetColumnSize.getColumSize("alumnos")];
                nombres = GetColumnsNames.getColumnNames("alumnos");

                String[][] info = new String[100][GetColumnSize.getColumSize("alumnos")];

                System.out.println(nombres);

                int count = 0;
                while (count<100){
                    resultSet.next();
                    for (int i = 0; i < info[0].length; i++) {
                        info[count][i] = resultSet.getString(i+1);
                    }
                    count++;
                }
                TableModel table = new DefaultTableModel(info,nombres);
                this.studentView.getJtStudents().setModel(table);


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
