package controller.events;

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
    }

    //todo hacer los metodos privados para usar en el action performed

}
