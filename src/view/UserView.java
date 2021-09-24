package view;

import javax.swing.*;

public class UserView extends JFrame{
    private JPanel jpUserView;
    private JLabel jlUserId;
    private JTextField jtUserId;
    private JButton jcCreateUser;
    private JButton jbUpdateUser;
    private JButton jbDeleteUser;
    private JButton jbReadUser;
    private JButton jbReturn;
    private JLabel jlPassword;
    private JTextField jtUserPassword;

    public UserView(){

        setSize(DefaultParameters.WINDOWS_SIZE);
        setLocationRelativeTo(null);

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

   public JButton getJbReturn(){
        return this.jbReturn;
   }
}
