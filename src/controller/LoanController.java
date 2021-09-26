package controller;

import view.LoanView;

public class LoanController {
    LoanView loanView;

    public LoanController(){
        loanView = new LoanView();

        loanView.getJbLoan().addActionListener(e->{
            //todo crear metodo de prestamos
        });
        loanView.getJbLoanReturn().addActionListener(e->{
            //todo crear metodo de devoluciones
        });
        loanView.getJbReturnMainView().addActionListener(e->{
            //todo volver al menu pricipal
        });
    }
}
