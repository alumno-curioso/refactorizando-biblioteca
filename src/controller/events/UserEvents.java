package controller.events;

import controller.controllers.MainController;
import view.UserView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserEvents implements ActionListener {

    private UserView userView;

    public UserEvents(UserView userView){
        this.userView=userView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String selectedAction = e.getActionCommand();
        //todo establecer las diferentes condiciones
        if(selectedAction.equals("CREAR")){
            System.out.println("ok");
        }
        if(selectedAction.equals("CONSULTAR")){
            System.out.println("ok");
        }
        if(selectedAction.equals("MODIFICAR")){
            System.out.println("ok");
        }
        if(selectedAction.equals("BORRAR")){
            System.out.println("ok");
        }
        if(selectedAction.equals("VOLVER")){
            System.out.println("ok");
            userView.dispose();
            MainController.runMainView();
        }
    }

    //todo hacer los metodos privados para usar en el action performed

}
