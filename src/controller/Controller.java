package controller;

import view.VistaPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

    private VistaPrincipal vistaPrincipal;


    public Controller(VistaPrincipal vistaPrincipal){
        this.vistaPrincipal = vistaPrincipal;

        this.vistaPrincipal.getBtValidate().addActionListener(this);

    }



    @Override
    public void actionPerformed(ActionEvent e) {
        this.vistaPrincipal.setText("hola");
    }
}
