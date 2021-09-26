package controller;

import view.UserView;

public class UserController {

    UserView userView;
    public UserController(){
        userView = new UserView();
        userView.setVisible(true);

        userView.getJcCreateUser().addActionListener(e->{
            //todo crear metodo para insertar nuevo Usuario
        });
        userView.getJbReadUser().addActionListener(e->{
            //todo crear metodo para ver la tabla
        });
        userView.getJbUpdateUser().addActionListener(e->{
            //todo modificar un Usuario
        });
        userView.getJbDeleteUser().addActionListener(e->{
            //todo elimnar Usuario
        });
        userView.getJbReturnMainView().addActionListener(e->{
            //todo cerrar ventana y volver a menu principal
        });
    }

}
