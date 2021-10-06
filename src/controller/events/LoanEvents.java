package controller.events;

import controller.controllers.MainController;
import view.LoanView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoanEvents implements ActionListener {
    private LoanView loanView;

    public LoanEvents(LoanView loanView){
        this.loanView =loanView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String selectedAction = e.getActionCommand();
        System.out.println(selectedAction);
        if(selectedAction.equals("PRESTAR")){
            System.out.println("ok");
        }
        if(selectedAction.equals("DEVOLVER")){
            System.out.println("ok");
        }
        if(selectedAction.equals("VOLVER")){
            System.out.println("ok");
            loanView.dispose();
            MainController.runMainView();
        }
        //todo establecer las diferentes condiciones
    }

    //todo hacer los metodos privados para usar en el action performed
}
