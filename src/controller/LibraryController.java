package controller;

import view.LibraryView;

public class LibraryController {

    LibraryView libraryView;

    public LibraryController(){
        libraryView = new LibraryView();

        libraryView.getJcCreateBook().addActionListener(e->{
            //todo añadir nuevo libro a la biblioteca
        });
        libraryView.getJbReadBook().addActionListener(e->{
            //todo leer informacion de la base de  datos
        });
        libraryView.getJbUpdateBook().addActionListener(e->{
            //todo metodo update para un librod e la biblioteca
        });
        libraryView.getJbDeleteBook().addActionListener(e->{
            //todo metodo borrar un libro de la biblioteca
        });
        libraryView.getJbReturn().addActionListener(e->{
            //todo volver al menu principal
        });
    }
}
