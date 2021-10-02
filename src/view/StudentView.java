package view;

import javax.swing.*;

import static view.properties.DefaultSizeParameters.*;

public class StudentView extends JFrame {

    private JPanel jpStudentView;

    private JLabel jlDNI;
    private JLabel jlName;
    private JLabel jlStudent;

    private JTextField jtDNI;
    private JTextField jtStudentName;
    private JTextField jtStudentLastName1;
    private JTextField jtStudentLastName2;

    private JButton jbLoan;
    private JButton jcCreateStudent;
    private JButton jbUpdateStudent;
    private JButton jbReadStudent;
    private JButton jbDeleteStudent;
    private JButton jbReturnMainView;
    private JPanel jpTable;
    private JTable jtStudents;

    public StudentView(){
        setSize(STUDENT_VIEW);
        setLocationRelativeTo(null);

        setTitle("Gestios de alumnos");

        add(jpStudentView);

        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
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

    public JButton getJbReturnMainView(){ return jbReturnMainView; }

}
