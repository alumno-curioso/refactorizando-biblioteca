package controller;

import view.VistaPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

    private VistaPrincipal vistaPrincipal;


    public Controller(VistaPrincipal vistaPrincipal){
        this.vistaPrincipal = vistaPrincipal;

        this.vistaPrincipal.getBtValidate().addActionListener(e -> {
            this.vistaPrincipal.setText("ahora con una expresion lambda");
        });

    }



//    @Override
//    public void actionPerformed(ActionEvent e) {
//        this.vistaPrincipal.setText("hola");
//    }
}
