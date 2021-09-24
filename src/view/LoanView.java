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
    private JButton jbReturnMainView;

    public LoanView(){

        setSize(DefaultParameters.WINDOWS_SIZE);
        setLocationRelativeTo(null);


        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

    public String getTfDNIStudent() {
        return tfDNIStudent.getText();
    }

    public String getTfIDBook() {
        return tfIDBook.getText();
    }

    public JButton getJbLoan() {
        return jbLoan;
    }

    public JButton getJbReturn() {
        return jbReturn;
    }

    public JButton getJbReturnMainView() {
        return jbReturnMainView;
    }
}

