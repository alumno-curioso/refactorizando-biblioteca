package controller;


import static server.querys.ValidateUser.validateUser;

import view.VistaPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

    private VistaPrincipal vistaPrincipal;


    public Controller(VistaPrincipal vistaPrincipal){
        this.vistaPrincipal = vistaPrincipal;

        this.vistaPrincipal.getBtValidate().addActionListener(e -> {
            String user = this.vistaPrincipal.getTfUser();
            String password = this.vistaPrincipal.getTfPass();
            System.out.println(user+password);
            //todo crear metodo que compruebe si es un usuario valido
            if(validateUser(user,password)){
                System.out.println("entras a la aplicacion");
            }else{
                System.out.println("usuario invalido");
            }
        });

    }


}
