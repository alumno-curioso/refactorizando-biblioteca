package controller.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import controller.controllers.MainController;
import model.library.*;
import server.querys.tools.PredefinedQuerys;
import view.LibraryView;

import javax.swing.*;

import static model.library.CreateBook.createBook;
import static model.library.DeleteBook.deleteBook;
import static model.library.ReadBook.readAllBooks;


public class LibraryEvents implements ActionListener {
    private LibraryView libraryView;

    public LibraryEvents(LibraryView libraryView){
        this.libraryView = libraryView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String selectedAction = e.getActionCommand();
        System.out.println(selectedAction);

        String  state = this.libraryView.getJtBookState(),
                signature = this.libraryView.getJtBookCourse(),
                publishingHouse = this.libraryView.getJtBookEdit(),
                author= this.libraryView.getJtBookAutor(),
                title =this.libraryView.getTitle();
        int     code = this.libraryView.getJtBookCode();

        Book newBook = new Book(state,signature,publishingHouse,author,title,code);

        try {

            //todo implementar la logica de cada accion
            if (selectedAction.equals("CREAR")) {
                if (newBook.isValidBook()) create(newBook);
            }
            if (selectedAction.equals("CONSULTAR")) {
                read();
            }
            if (selectedAction.equals("MODIFICAR")) {

                if(!state.equals("")) update(state,code, PredefinedQuerys.UPDATE_BOOK_STATE);
                if(!signature.equals("")) update(signature,code, PredefinedQuerys.UPDATE_BOOK_ASIGNATURA);
                if(!publishingHouse.equals("")) update(publishingHouse,code, PredefinedQuerys.UPDATE_BOOK_PUBLISHING_HOUSE);
                if(!author.equals("")) update(author,code, PredefinedQuerys.UPDATE_BOOK_AUTHOR);
                if(!title.equals("")) update(title,code, PredefinedQuerys.UPDATE_BOOK_TITLE);

            }
            if (selectedAction.equals("BORRAR")) {
                if(code>0) {
                    delete(code);
                }else{
                    JOptionPane.showMessageDialog(null,"debe introducir el codigo del libro a borrar","DELETE BOOK",JOptionPane.INFORMATION_MESSAGE);
                }
            }

        }catch (SQLException exception){

        }
        if(selectedAction.equals("VOLVER")){
            System.out.println("ok");
            libraryView.dispose();
            MainController.runMainView();
        }


    }

    //todo hacer los metodos privados para usar en el action performed
    private void create(Book book) throws SQLException {
        createBook(book);
    }
    private void read() throws SQLException {
        this.libraryView.getJtLibrary().setModel(readAllBooks());
    }
    private void update(String value,int code ,String queryToRun) throws SQLException {
        try {
            int numericValue = Integer.parseInt(value);
            UpdateBook.updateBook(code,queryToRun,numericValue);
        }catch (NumberFormatException exception){
            System.out.println("valor no numerico");
            UpdateBook.updateBook(code,queryToRun,value);
        }

    }

    private void delete(int code) throws SQLException {
        deleteBook(code);
    }
}
