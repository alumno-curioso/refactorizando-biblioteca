package controller.events;

import view.LibraryView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibraryEvents implements ActionListener {
    private LibraryView libraryView;

    public LibraryEvents(LibraryView libraryView){
        this.libraryView = libraryView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String selectedAction = e.getActionCommand();
        //todo establecer las diferentes condiciones
    }

    //todo hacer los metodos privados para usar en el action performed

}
