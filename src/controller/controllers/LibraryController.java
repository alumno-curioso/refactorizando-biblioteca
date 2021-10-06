package controller.controllers;

import controller.events.LibraryEvents;
import view.LibraryView;

public class LibraryController {

    private static LibraryView libraryView;
    private static LibraryEvents libraryEvents;

    private LibraryController(){}

    public static void runLibrayView(){
        if(libraryView==null) {
            libraryView = new LibraryView();
            libraryEvents = new LibraryEvents(libraryView);

            libraryView.getJcCreateBook().addActionListener(libraryEvents);
            libraryView.getJbReadBook().addActionListener(libraryEvents);
            libraryView.getJbUpdateBook().addActionListener(libraryEvents);
            libraryView.getJbDeleteBook().addActionListener(libraryEvents);
            libraryView.getJbReturn().addActionListener(libraryEvents);

        }
        libraryView.setVisible(true);
    }
}
