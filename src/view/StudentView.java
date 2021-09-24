package view;

import javax.swing.*;

public class StudentView extends JFrame {
    private JPanel jpStudentView;
    private JButton jbLoan;
    private JButton jcCreateStudent;
    private JButton jbUpdateStudent;
    private JButton jbReadStudent;
    private JButton jbDeleteStudent;
    private JLabel jlDNI;
    private JLabel jlName;
    private JTextField textField1;

    public StudentView(){
        setSize(DefaultParameters.WINDOWS_SIZE);
        setLocationRelativeTo(null);

        add(jpStudentView);

        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
}
