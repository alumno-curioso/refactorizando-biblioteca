package controller.events;

import controller.controllers.LoanController;
import controller.controllers.MainController;
import view.StudentView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
}
