package controller.events;

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
        //todo establecer las diferentes condiciones
    }

    //todo hacer los metodos privados para usar en el action performed
}
