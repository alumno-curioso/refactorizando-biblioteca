package controller;

import view.MainView;
import view.LoginView;

public class MainController {

    MainView mainView;

    public MainController(){
        mainView = new MainView();

        mainView.setVisible(true);

        mainView.getJbStudent().addActionListener(e -> {
            System.out.println("hola estudiante");
        });
        mainView.getJbUsers().addActionListener(e->{
            System.out.println("usuarios");
        });
        mainView.getJbArchive().addActionListener(e->{
            System.out.println("biblioteca");
        });
        mainView.getJbExit().addActionListener(e->{
            System.exit(0);
        });
    }

}
