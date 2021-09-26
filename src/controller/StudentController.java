package controller;

import view.StudentView;

public class StudentController {

    StudentView studentView;

    public StudentController(){
        studentView = new StudentView();

        studentView.getJcCreateStudent().addActionListener(e->{
            //todo crear estudiante
        });
        studentView.getJbReadStudent().addActionListener(e->{
            //todo read estudiante
        });
        studentView.getJbUpdateStudent().addActionListener(e->{
            //todo update studiante
        });
        studentView.getJbDeleteStudent().addActionListener(e->{
            //todo delete student
        });
        studentView.getJbReturnMainView().addActionListener(e->{
            //todo volver a pagina  principal
        });
    }

}
