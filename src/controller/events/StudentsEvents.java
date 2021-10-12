package controller.events;

import controller.controllers.LoanController;
import controller.controllers.MainController;
import model.student.CreateStudent;
import model.student.DeleteStudent;
import model.student.ReadStudents;
import model.student.UpdateStudent;
import view.StudentView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import static model.student.ReadStudents.*;
import static model.student.UpdateStudent.updateStudent;

public class StudentsEvents implements ActionListener {

    private StudentView studentView;

    public StudentsEvents(StudentView studentView) {
        this.studentView = studentView;
    }



    @Override
    public void actionPerformed(ActionEvent e) {

        String  name = this.studentView.getJtStudentName(),
                firstLastName = this.studentView.getJtStudentLastName1(),
                secondLastName = this.studentView.getJtStudentLastName2(),
                DNI = this.studentView.getJtDNI();



        String selectedAction = e.getActionCommand();
        System.out.println(selectedAction);

        try {
            //todo implementar la logica de cada accion
            if (selectedAction.equals("CREAR")) {
                createStudent();

            }
            if (selectedAction.equals("CONSULTAR")) {
                readStudents(name,firstLastName,secondLastName,DNI);
            }
            if (selectedAction.equals("MODIFICAR")) {
               modify();
            }
            if (selectedAction.equals("BORRAR")) {
                delete();
                System.out.println("ok");
            }
            if (selectedAction.equals("PRESTAMOS")) {
                System.out.println("ok");
                studentView.dispose();
                LoanController.runLoanView();
            }
            if (selectedAction.equals("VOLVER")) {
                System.out.println("ok");
                studentView.dispose();
                MainController.runMainView();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void createStudent() throws SQLException {

        boolean hasADNI = (!this.studentView.getJtDNI().equals("")),
                hasFirstLastName = (!this.studentView.getJtStudentLastName1().equals("")),
                hasSecondLastName = (!this.studentView.getJtStudentLastName2().equals("")),
                hasName = (!this.studentView.getJtStudentName().equals(""));

        boolean isPossibleToCreate = (hasADNI && hasFirstLastName && hasSecondLastName && hasName);

        if (!isPossibleToCreate) {
            JOptionPane.showMessageDialog(this.studentView, "Por favor antes de crear un registro asegurese de tener los campos de nombre, apellidos y dni");
        } else {
            System.out.println("crear alumno");
            CreateStudent.insertNewStudent(this.studentView.getJtStudentName(), this.studentView.getJtStudentLastName1(), this.studentView.getJtStudentLastName2(), this.studentView.getJtDNI());
        }
    }

    //todo hacer los metodos privados para usar en el action performed

    private void readStudents(String name, String firstLastName, String secondLastName, String DNI) throws SQLException {

        int     numberOfFields = checkFields(name,firstLastName,secondLastName,DNI);

        if(numberOfFields<=0){
            this.studentView.getJtStudents().setModel(ReadStudents.fillTable());
        }

        if(numberOfFields==1){
            oneFieldFind(name,firstLastName,secondLastName,DNI);
        }

        if(numberOfFields>1){
            JOptionPane.showMessageDialog(null,"Por favor para realizar una busqueda debe introducir un dato en uno de los campos\nSi quiere mostrar todos los datos de la tabla deje todos los campos vacios y pique en consultar","Busquedas en estudiantes",JOptionPane.INFORMATION_MESSAGE);
        }

    }


    private int checkFields(String... state) {

        int maxFields=0;

        for(String i: state){
            if(!i.equals("")) maxFields++;
        }

        return maxFields;
    }

    private void oneFieldFind(String name, String firstLastName, String secondLastName, String DNI) throws SQLException {

        if (!name.equals("")) {
            this.studentView.getJtStudents().setModel(showByName(name));
        }

        if (!firstLastName.equals("")) {
            this.studentView.getJtStudents().setModel(showByFirstLastName(firstLastName));
        }

        if (!secondLastName.equals("")) {
            this.studentView.getJtStudents().setModel(showBySecondLastName(secondLastName));
        }

        if (!DNI.equals("")) {
            this.studentView.getJtStudents().setModel(showByDNI(DNI));
        }

    }

    private void delete() throws SQLException {
        boolean dniField = !this.studentView.getJtDNI().equals("");
        int confirm =0;
        if (dniField){
           confirm = JOptionPane.showConfirmDialog(
                    null,
                    "esta seguro de eliminar al alumno con DNI " + this.studentView.getJtDNI(),
                    "Borrar alumno de BD",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            System.out.println("confirm = " + confirm);
        }
        if(confirm==0) DeleteStudent.deleteStudent(this.studentView.getJtDNI());

    }

    private void modify() throws SQLException {

        if (!this.studentView.getJtDNI().equals("")) {
            String[] options = {"Nombre", "primer apellido", "segundo apellido", "dni"};
            int opcion = JOptionPane.showOptionDialog(
                    null,
                    "que desea modificar",
                    "UPDATE",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]);

            if(opcion == 0){

                updateStudent(opcion,this.studentView.getJtDNI(),nuevoValor());
            }
            if(opcion == 1){
                updateStudent(opcion,this.studentView.getJtDNI(),nuevoValor());
            }
            if(opcion == 2){
                updateStudent(opcion,this.studentView.getJtDNI(),nuevoValor());
            }
            if(opcion == 3){
                updateStudent(opcion,this.studentView.getJtDNI(),nuevoValor());
            }
        }else{
            JOptionPane.showMessageDialog(
                    null,
                    "debe introducir un dni valido para realizar una modificacion",
                    "MODIFY",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private String nuevoValor() {
        return JOptionPane.showInputDialog(null,"introduzca el nuevo valor");
    }
}
