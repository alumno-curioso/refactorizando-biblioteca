package view;

import javax.swing.*;

public class LoanView  extends JFrame{
    private JTextField tfDNIStudent;
    private JLabel lbDNIStudentd;
    private JTextField tfIDBook;
    private JLabel lbIDBook;
    private JButton jbLoan;
    private JPanel jpLoanView;
    private JLabel lbLoanView;
    private JButton jbReturn;

    public LoanView(){

        setSize(DefaultParameters.WINDOWS_SIZE);


        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
}

