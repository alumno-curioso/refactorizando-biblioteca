package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginView extends JFrame {
    private JPanel panel1;
    private JLabel lbSesionInit;
    private JTextField tfUser;
    private JLabel jlUser;
    private JPanel jpTituloInicio;
    private JTextField tfPass;
    private JLabel jlPass;
    private JButton btValidate;


    public LoginView() {
        setTitle("Login usuario");
        setSize(DefaultParameters.WINDOWS_SIZE);
        setLocationRelativeTo(null);

        add(panel1);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public String getTfUser() {
        return tfUser.getText();
    }

    public String getTfPass() {
        return tfPass.getText();
    }

    public JButton getBtValidate() {
        return btValidate;
    }


}
