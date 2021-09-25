package controller;


import static server.querys.ValidateUser.validateUser;

import view.MainView;
import view.LoginView;

public class Controller {

    private LoginView loginView;
    private MainView mainView;


    public Controller(LoginView loginView, MainView mainView){
        this.loginView = loginView;
        this.mainView = mainView;
        this.loginView.getBtValidate().addActionListener(e -> {
            String user = this.loginView.getTfUser();
            String password = this.loginView.getTfPass();

            if(validateUser(user,password)){
                System.out.println("entras a la aplicacion");
                this.mainView = new MainView();
                mainView.setVisible(true);
                this.loginView.dispose();
            }else{
                System.out.println("usuario invalido");
            }
        });
        this.mainView.getJbStudent().addActionListener(e -> {

            System.out.println("estudentes");
            /**todo
             * hacer vista usuarios
             * aniadir botones para el CRUD
             * realizar los modelos para los usuarios
             */
        });
        this.mainView.getJbArchive().addActionListener(e->{
            System.out.println("bibliooooo");
            /**todo
             * hecer vista para gestion de la biblioteca
             * hacer CRUD sobre los libros
             */
        });
        this.mainView.getJbUsers().addActionListener(e->{
            System.out.println("userrrssssss");
            /**todo
             * hacer menu para los usuarios
             * CRUD solo usuario administrador
             *
             */
        });
//        this.mainView.getJbExit().add
//                addWindowListener(new Java.awt.event.WindowAdapter() {
//            @Override
//            public void windowClosing(Java.awt.event.WindowEvent windowEvent) {
//                if (JOptionPane.showConfirmDialog(frame,
//                        "Are you sure you want to close this window?", "Close Window?",
//                        JOptionPane.YES_NO_OPTION,
//                        JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
//                    System.exit(0);
//                }
//            }
//        });

    }


}
