package controller;

import view.StudentView;

public class StudentController {

   private static StudentView studentView;

    private StudentController(){

    }

    public static void runStudentView(){
        if(studentView==null){
            studentView = new StudentView();

            studentView.setVisible(true);

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
                studentView.dispose();
                MainController.runMainView();
            });
        }
        studentView.setVisible(true);
    }

}
