package view;

import javax.swing.*;

public class LoanView  extends JFrame{
    private JPanel jpLoanView;
    private JLabel jlDNIStudent;
    private JLabel lbLoanView;
    private JLabel lbIDBook;
    private JLabel lbDNIStudentd;
    private JTextField tfDNIStudent;
    private JTextField tfIDBook;
    private JTextField jtDNIStudent;
    private JButton jbLoan;
    private JButton jbReturnMainView;
    private JButton jbReturn;

    public LoanView(){

        setSize(DefaultParameters.WINDOWS_SIZE);
        setLocationRelativeTo(null);

        add(jpLoanView);


        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

    public String getTfDNIStudent() {
        return this.tfDNIStudent.getText();
    }

    public String getTfIDBook() {
        return this.tfIDBook.getText();
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

