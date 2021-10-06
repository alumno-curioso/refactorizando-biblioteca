package controller.controllers;

import view.MainView;

public class MainController {

    private static MainController mainController;
    private static MainView getMainView;

    private MainController(){}

    public static void runMainView() {
        if (getMainView == null) {
            getMainView = new MainView();
            getMainView.getJbStudent().addActionListener(e -> {
                getMainView.dispose();
                StudentController.runStudentView();
            });
            getMainView.getJbUsers().addActionListener(e -> {
                getMainView.dispose();
                UserController.runUserView();
            });
            getMainView.getJbArchive().addActionListener(e -> {
                getMainView.dispose();
                LibraryController.runLibrayView();
            });
            getMainView.getJbExit().addActionListener(e -> {
                //todo preguntar si desea salir realmente
                System.exit(0);
            });
//            return getMainView;
        }
        getMainView.setVisible(true);
//        return getMainView;
    }

}
