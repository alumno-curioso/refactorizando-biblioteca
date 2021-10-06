package controller.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.controllers.MainController;
import view.LibraryView;


public class LibraryEvents implements ActionListener {
    private LibraryView libraryView;

    public LibraryEvents(LibraryView libraryView){
        this.libraryView = libraryView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String selectedAction = e.getActionCommand();
        System.out.println(selectedAction);

        //todo implementar la logica de cada accion
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
            libraryView.dispose();
            MainController.runMainView();
        }


    }

    //todo hacer los metodos privados para usar en el action performed

}
