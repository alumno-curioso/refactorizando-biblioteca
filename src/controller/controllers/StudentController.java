package controller.controllers;

import controller.events.StudentsEvents;
import model.tools.tables.GetTableModel;
import view.StudentView;

public class StudentController {

   private static StudentView studentView;
   private static StudentsEvents studentsEvents;

    private StudentController(){

    }

    public static void runStudentView(){
        if(studentView==null){
            studentView = new StudentView();
            studentsEvents = new StudentsEvents(studentView);

            studentView.setVisible(true);

            studentView.getJcCreateStudent().addActionListener(studentsEvents);
            studentView.getJbReadStudent().addActionListener(studentsEvents);
            studentView.getJbUpdateStudent().addActionListener(studentsEvents);
            studentView.getJbDeleteStudent().addActionListener(studentsEvents);
            studentView.getJbLoan().addActionListener(studentsEvents);
            studentView.getJbReturnMainView().addActionListener(studentsEvents);
        }
        studentView.setVisible(true);
    }

}
