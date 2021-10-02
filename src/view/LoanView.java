package view;

import view.properties.DefaultSizeParameters;

import javax.swing.*;

public class LoanView  extends JFrame{
    private JPanel jpLoanView;

    private JLabel jlDNIStudent;
    private JLabel lbLoanView;
    private JLabel lbIDBook;
    private JLabel lbDNIStudentd;

    private JTextField tfIDBook;
    private JTextField jtDNIStudent;

    private JButton jbLoan;
    private JButton jbReturnMainView;
    private JButton jbLoanReturn;

    public LoanView(){

        setSize(DefaultSizeParameters.WINDOWS_SIZE);
        setLocationRelativeTo(null);

        setTitle("Gestion de prestamos");

        add(jpLoanView);


        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setVisible(true);
    }

    public String getJtDNIStudent() {
        return this.jtDNIStudent.getText();
    }

    public String getTfIDBook() {
        return this.tfIDBook.getText();
    }

    public JButton getJbLoan() {
        return jbLoan;
    }

    public JButton getJbLoanReturn() {
        return jbLoanReturn;
    }

    public JButton getJbReturnMainView() {
        return jbReturnMainView;
    }
}

