package controller.events;

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
        //todo establecer las diferentes condiciones
    }

    //todo hacer los metodos privados para usar en el action performed
}
