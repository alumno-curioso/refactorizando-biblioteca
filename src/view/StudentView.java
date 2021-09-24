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
    private JTextField jtDNI;
    private JTextField jtStudentName;
    private JTextField jtStudentLastName1;
    private JTextField jtStudentLastName2;

    public StudentView(){
        setSize(DefaultParameters.WINDOWS_SIZE);
        setLocationRelativeTo(null);

        add(jpStudentView);

        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

    public JButton getJbLoan() {
        return jbLoan;
    }

    public JButton getJcCreateStudent() {
        return jcCreateStudent;
    }

    public JButton getJbUpdateStudent() {
        return jbUpdateStudent;
    }

    public JButton getJbReadStudent() {
        return jbReadStudent;
    }

    public JButton getJbDeleteStudent() {
        return jbDeleteStudent;
    }

    public String getJtDNI() {
        return jtDNI.getText();
    }

    public String getJtStudentName() {
        return jtStudentName.getText();
    }

    public String getJtStudentLastName1() {
        return jtStudentLastName1.getText();
    }

    public String getJtStudentLastName2() {
        return jtStudentLastName2.getText();
    }
}
