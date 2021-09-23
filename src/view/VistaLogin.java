package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaLogin extends JFrame {
    private JPanel panel1;
    private JLabel lbSesionInit;
    private JTextField tfUser;
    private JLabel jlUser;
    private JPanel jpTituloInicio;
    private JTextField tfPass;
    private JLabel jlPass;
    private JButton btValidate;


    public VistaLogin() {
        setTitle("Login usuario");
        setSize(400,400);
        setLocationRelativeTo(null);

        add(panel1);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


//        btValidate.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                //todo llamar al controlador para conectar con la base y verificar al ususario
//                System.out.println("hi world!!!");
//            }
//        });


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

    public void setText(String mensaje){
        this.tfUser.setText(mensaje);
    }
}
