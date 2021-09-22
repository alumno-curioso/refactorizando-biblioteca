package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class vistaPrincipal extends JFrame {
    private JPanel panel1;
    private JLabel lbSesionInit;
    private JTextField textField1;
    private JLabel jlUserName;
    private JPanel jpTituloInicio;
    private JTextField textField2;
    private JLabel jlPassword;
    private JButton btValidate;


    public vistaPrincipal() {
        setTitle("Login usuario");
        setSize(400,400);
        setLocationRelativeTo(null);

        add(panel1);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


        btValidate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //todo llamar al controlador para conectar con la base y verificar al ususario
                System.out.println("hi world!!!");
            }
        });
    }
}
