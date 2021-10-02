package controller;


import static server.querys.ValidateUser.validateUser;

import view.LoginView;

import javax.swing.*;
import java.awt.event.*;

public class LoginController implements ActionListener, MouseListener {

    private LoginView loginView;

    public LoginController(){
        this.loginView = new LoginView();
        this.loginView.getBtValidate().addActionListener(this);
        this.loginView.getJlUser().addMouseListener(this);
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


    @Override
    public void actionPerformed(ActionEvent e) {
        if((JButton) e.getSource() == loginView.getBtValidate()) {
            System.out.println("has pulsado el boton de login");
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if((JLabel) e.getSource() == loginView.getJlUser()){
            System.out.println("chacho no me piques");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("ya estas encima");
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
