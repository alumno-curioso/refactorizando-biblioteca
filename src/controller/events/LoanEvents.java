package controller.events;

import controller.controllers.MainController;
import model.loan.Loan;
import model.student.Student;
import view.LoanView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import static model.student.Student.getStundentCode;

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
            try {
                int studentCode = getStundentCode(this.loanView.getJtDNIStudent());

                Loan loan = new Loan(this.loanView.getTfIDBook(),studentCode);

                if(loan.isValidLoan()) {
                    //todo implementar la logica del prestamo
                    System.out.println("palante con el prestamo");
                }
                else{
                    System.out.println("nu, algo esta mal");
                }
            }catch (SQLException exception){

            }

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
