package controller.events;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import controller.controllers.MainController;
import view.LoginView;



import static server.querys.ValidateUser.isValidUser;

public class LoginEvents implements ActionListener {
    private LoginView loginView;


    public LoginEvents(LoginView loginView){
        this.loginView = loginView;

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        String selectedAction = e.getActionCommand();

        System.out.println(selectedAction);

        if(selectedAction.equals("LOGIN")){

            //todo ver com elevar la excepcion en este metodo
            try {
                if (validate()) {
                    System.out.println("conectar");
                    this.loginView.dispose();
                    MainController.runMainView();
                }else{
                    JOptionPane.showMessageDialog(
                            this.loginView,
                            "Usuario o contraseña invalida\npor favor introduzca de nuevo o salga del programa",
                            "LOGIN INCORRECTO",
                            JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }

    }

    private boolean validate() throws SQLException {

        String  user        = this.loginView.getTfUser(),
                password    = this.loginView.getTfPass();

        return (isValidUser(user,password));
    }




}
