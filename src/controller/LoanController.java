package controller;

import view.LoanView;

public class LoanController {
    private static LoanView loanView;

    private LoanController(){}

    public static void runLoanView(){
        if(loanView == null) {
            loanView = new LoanView();

            loanView.getJbLoan().addActionListener(e -> {
                //todo crear metodo de prestamos
            });
            loanView.getJbLoanReturn().addActionListener(e -> {
                //todo crear metodo de devoluciones
            });
            loanView.getJbReturnMainView().addActionListener(e -> {
                loanView.dispose();
                MainController.runMainView();
            });
        }
        loanView.setVisible(true);
    }
}
