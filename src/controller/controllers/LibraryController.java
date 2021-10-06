package controller.controllers;

import view.LibraryView;

public class LibraryController {

    private static LibraryView libraryView;

    private LibraryController(){}

    public static void runLibrayView(){
        if(libraryView==null) {
            libraryView = new LibraryView();

            libraryView.getJcCreateBook().addActionListener(e -> {
                //todo añadir nuevo libro a la biblioteca
            });
            libraryView.getJbReadBook().addActionListener(e -> {
                //todo leer informacion de la base de  datos
            });
            libraryView.getJbUpdateBook().addActionListener(e -> {
                //todo metodo update para un librod e la biblioteca
            });
            libraryView.getJbDeleteBook().addActionListener(e -> {
                //todo metodo borrar un libro de la biblioteca
            });
            libraryView.getJbReturn().addActionListener(e -> {
                libraryView.dispose();
                MainController.runMainView();
            });
        }
        libraryView.setVisible(true);
    }
}
