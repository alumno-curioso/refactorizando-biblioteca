package controller;

import view.UserView;

public class UserController {

    private static UserView userView;

    private UserController(){}

    public static void runUserView(){
        if(userView==null) {
            userView = new UserView();

            userView.getJcCreateUser().addActionListener(e -> {
                //todo crear metodo para insertar nuevo Usuario
            });
            userView.getJbReadUser().addActionListener(e -> {
                //todo crear metodo para ver la tabla
            });
            userView.getJbUpdateUser().addActionListener(e -> {
                //todo modificar un Usuario
            });
            userView.getJbDeleteUser().addActionListener(e -> {
                //todo elimnar Usuario
            });
            userView.getJbReturnMainView().addActionListener(e -> {
                userView.dispose();
                MainController.runMainView();
            });
        }
        userView.setVisible(true);
    }

}
