package view;

import static view.properties.DefaultSizeParameters.*;

import javax.swing.*;

public class LibraryView extends JFrame {
    private JPanel jpLibrary;

    private JLabel jlLibraryPanel;
    private JLabel jlBookTitle;
    private JLabel jlBookAutor;
    private JLabel jlBookEdit;
    private JLabel jlCourse;
    private JLabel jlState;

    private JTextField jtBookTitle;
    private JTextField jtBookAutor;
    private JTextField jtBookEdit;
    private JTextField jtBookCourse;
    private JTextField jtBookState;

    private JButton jcCreateBook;
    private JButton jbUpdateBook;
    private JButton jbDeleteBook;
    private JButton jbReadBook;
    private JButton jbReturn;
    private JPanel jpCrudMenu;
    private JPanel jpTable;
    private JTable jtLibrary;

    public LibraryView(){
        setTitle("Gestion Biblioteca");
        setSize(LIBRARY_SIZE);
        setLocationRelativeTo(null);

        add(jpLibrary);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public String getJtBookTitle() {
        return jtBookTitle.getText();
    }

    public String getJtBookAutor() {
        return jtBookAutor.getText();
    }

    public String getJtBookEdit() {
        return jtBookEdit.getText();
    }

    public String getJtBookCourse() {
        return jtBookCourse.getText();
    }

    public String getJtBookState() {
        return jtBookState.getText();
    }

    public JButton getJcCreateBook() {
        return jcCreateBook;
    }

    public JButton getJbUpdateBook() {
        return jbUpdateBook;
    }

    public JButton getJbDeleteBook() {
        return jbDeleteBook;
    }

    public JButton getJbReadBook() {
        return jbReadBook;
    }

    public JButton getJbReturn() {
        return jbReturn;
    }
}
