package controller;


import static server.querys.ValidateUser.validateUser;

import view.LoginView;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class LoginController {

    private LoginView loginView;

    public LoginController(){
        this.loginView = new LoginView();

        this.loginView.getBtValidate().addActionListener(e -> {
            String user = this.loginView.getTfUser();
            String password = this.loginView.getTfPass();

            if(validateUser(user,password)){
                System.out.println("entras a la aplicacion");
                this.loginView.dispose();
                MainController.runMainView();

            }else{
                System.out.println("usuario invalido");
                JOptionPane.showMessageDialog(
                        this.loginView,
                        "Usuario o contraseña invalida\npor favor introduzca de nuevo o salga del programa",
                        "LOGIN INCORRECTO",
                        JOptionPane.ERROR_MESSAGE);
            }
        });

    }


}
