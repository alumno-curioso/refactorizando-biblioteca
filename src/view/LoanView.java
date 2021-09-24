package view;

import javax.swing.*;

public class LoanView  extends JFrame{
    private JPanel jpLoanView;
    private JTextField tfDNIStudent;
    private JLabel lbDNIStudentd;
    private JTextField tfIDBook;
    private JLabel lbIDBook;
    private JButton jbLoan;
    private JLabel lbLoanView;
    private JButton jbReturn;
    private JButton jbReturnMainView;
    private JLabel jlDNIStudent;
    private JTextField jtDNIStudent;

    public LoanView(){

        setSize(DefaultParameters.WINDOWS_SIZE);
        setLocationRelativeTo(null);

        add(jpLoanView);


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

