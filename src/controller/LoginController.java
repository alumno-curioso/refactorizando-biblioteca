package controller;


import static server.querys.ValidateUser.validateUser;

import view.MainView;
import view.LoginView;

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
                MainController mainController = new MainController();

            }else{
                System.out.println("usuario invalido");
            }
        });

    }


}
