package view;

import javax.swing.*;

import static view.properties.DefaultSizeParameters.*;

public class UserView extends JFrame{
    private JPanel jpUserView;

    private JLabel jlUserId;
    private JLabel jlUserPanel;
    private JLabel jlPassword;

    private JTextField jtUserId;
    private JTextField jtUserPassword;

    private JButton jcCreateUser;
    private JButton jbUpdateUser;
    private JButton jbDeleteUser;
    private JButton jbReadUser;
    private JButton jbReturnMainView;
    private JTable jtUser;

    public UserView(){

        setSize(USER_SIZE);
        setLocationRelativeTo(null);

        setTitle("Gestion de usuarios");

        add(jpUserView);


        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

   public String getUserId(){
        return this.jtUserId.getText();
   }

   public String getUserPassword(){
        return this.jtUserPassword.getText();
   }

   public JButton getJcCreateUser(){
        return this.jcCreateUser;
   }

   public JButton getJbUpdateUser(){
        return this.jbUpdateUser;
   }

   public JButton getJbDeleteUser(){
        return this.jbDeleteUser;
   }

   public JButton getJbReadUser(){
        return this.jbReadUser;
   }

   public JButton getJbReturnMainView(){
        return this.jbReturnMainView;
   }

    public JTable getJtUser() {
        return jtUser;
    }
}
