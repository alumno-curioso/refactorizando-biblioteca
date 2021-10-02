package view;

import javax.swing.*;

import static view.properties.DefaultSizeParameters.*;

public class MainView extends JFrame {
    private JPanel jpMainView;
    private JLabel lbMainView;
    private JButton jbStudent;
    private JButton jbArchive;
    private JButton jbUsers;
    private JButton jbExit;


    public MainView(){

        setTitle("Menu biblioteca");
        setSize(MAIN_SIZE);
        setLocationRelativeTo(null);

        add(jpMainView);

        setVisible(true);

//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JButton getJbStudent() {
        return jbStudent;
    }

    public JButton getJbArchive() {
        return jbArchive;
    }

    public JButton getJbUsers() {
        return jbUsers;
    }

    public JButton getJbExit() {
        return jbExit;
    }
}


