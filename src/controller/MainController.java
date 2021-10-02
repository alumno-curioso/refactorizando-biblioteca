package controller;

import com.sun.tools.javac.Main;
import view.MainView;

public class MainController {

    private static MainController mainController;
    MainView mainView;
    private static MainView getMainView;

//    public MainController(){
//        mainView = new MainView();
//
//        mainView.setVisible(true);
//
//        mainView.getJbStudent().addActionListener(e -> {
//            System.out.println("hola estudiante");
//            this.mainView.dispose();
//            StudentController studentController = new StudentController();
//
//        });
//        mainView.getJbUsers().addActionListener(e->{
//            System.out.println("usuarios");
//        });
//        mainView.getJbArchive().addActionListener(e->{
//            System.out.println("biblioteca");
//        });
//        mainView.getJbExit().addActionListener(e->{
//            //todo preguntar si desea salir realmente
//            System.exit(0);
//        });
//    }

    public static MainView runMainView(){
        if(getMainView==null){
            getMainView = new MainView();

            getMainView.setVisible(true);

            getMainView.getJbStudent().addActionListener(e -> {
                System.out.println("hola estudiante");
                getMainView.dispose();
                StudentController studentController = new StudentController();

            });
            getMainView.getJbUsers().addActionListener(e->{
                System.out.println("usuarios");
            });
            getMainView.getJbArchive().addActionListener(e->{
                System.out.println("biblioteca");
            });
            getMainView.getJbExit().addActionListener(e->{
                //todo preguntar si desea salir realmente
                System.exit(0);
            });
            return getMainView;
        }
       return getMainView;
    }

}
