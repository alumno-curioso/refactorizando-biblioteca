package controller.controllers;

import controller.events.LoanEvents;
import view.LoanView;

public class LoanController {
    private static LoanView loanView;
    private static LoanEvents loanEvents;

    private LoanController(){}

    public static void runLoanView(){
        if(loanView == null) {
            loanView = new LoanView();
            loanEvents = new LoanEvents(loanView);
            loanView.getJbLoan().addActionListener(loanEvents);
            loanView.getJbLoanReturn().addActionListener(loanEvents);
            loanView.getJbReturnMainView().addActionListener(loanEvents);
        }
        loanView.setVisible(true);
    }
}
