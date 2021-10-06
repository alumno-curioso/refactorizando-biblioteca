package controller.events;

import view.MainView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainEvents implements ActionListener {

    private MainView mainView;

    public MainEvents (MainView mainView){
        this.mainView = mainView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String selectedAction = e.getActionCommand();
        //todo establecer las diferentes condiciones
    }

    //todo hacer los metodos privados para usar en el action performed
}
