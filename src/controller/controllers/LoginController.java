package controller.controllers;




import controller.events.LoginEvents;
import view.LoginView;

import javax.swing.*;
import java.awt.event.*;
import java.sql.SQLException;

public class LoginController {

    private LoginView loginView;
    private LoginEvents loginEvents;

    public LoginController() {
        this.loginView = new LoginView();
        this.loginEvents = new LoginEvents(this.loginView);

        this.loginView.getBtValidate().addActionListener(this.loginEvents);
//        this.loginView.getBtValidate().addActionListener(e -> {
//            String user = this.loginView.getTfUser();
//            String password = this.loginView.getTfPass();
//
//
//                if(validateUser(user,password)){
//                    System.out.println("entras a la aplicacion");
//                    this.loginView.dispose();
//                    MainController.runMainView();
//
//                }else{
//                    System.out.println("usuario invalido");
//                    JOptionPane.showMessageDialog(
//                            this.loginView,
//                            "Usuario o contraseña invalida\npor favor introduzca de nuevo o salga del programa",
//                            "LOGIN INCORRECTO",
//                            JOptionPane.ERROR_MESSAGE);
//                }
//
//        });

    }


}
