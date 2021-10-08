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
    }


}
