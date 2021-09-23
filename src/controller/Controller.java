package controller;


import static server.querys.ValidateUser.validateUser;

import view.VistaLogin;

public class Controller {

    private VistaLogin vistaLogin;


    public Controller(VistaLogin vistaLogin){
        this.vistaLogin = vistaLogin;

        this.vistaLogin.getBtValidate().addActionListener(e -> {
            String user = this.vistaLogin.getTfUser();
            String password = this.vistaLogin.getTfPass();

            if(validateUser(user,password)){
                System.out.println("entras a la aplicacion");
            }else{
                System.out.println("usuario invalido");
            }
        });

    }


}
