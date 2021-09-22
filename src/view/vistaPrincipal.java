package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class vistaPrincipal extends JFrame {
    private JPanel panel1;
    private JButton button1;


    public vistaPrincipal() {
        setTitle("holamundoGUI");
        setSize(400,400);
        setLocationRelativeTo(null);

        add(panel1);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hi world!!!");
            }
        });
    }
}
