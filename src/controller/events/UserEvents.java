package controller.events;

import controller.controllers.MainController;
import model.users.ReadUser;
import view.UserView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import static model.users.CreateUser.insertNewUser;
import static model.users.DeleteUser.deleteUser;
import static model.users.UpdateUser.updateUSerName;
import static model.users.UpdateUser.updateUserPassword;

public class UserEvents implements ActionListener {

    private UserView userView;

    public UserEvents(UserView userView){
        this.userView=userView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String  selectedAction   = e.getActionCommand(),
                user             = this.userView.getUserId(),
                password         = this.userView.getUserPassword();
        boolean checkUser        = !user.equals(""),
                checkPassword    = !password.equals("");

        try {
            //todo establecer las diferentes condiciones
            if (selectedAction.equals("CREAR")) {
              create(user,password,checkUser,checkPassword);
            }
            if (selectedAction.equals("CONSULTAR")) {
                read();
            }
            if (selectedAction.equals("MODIFICAR")) {
               update(checkUser,user);
            }
            if (selectedAction.equals("BORRAR")) {
                delete(checkUser,user);
            }
            if (selectedAction.equals("VOLVER")) {
                System.out.println("ok");
                userView.dispose();
                MainController.runMainView();
            }
        }catch (SQLException exception){
        exception.printStackTrace();
        }

    }

    private void create(String user, String password, boolean checkUser, boolean checkPassword) throws SQLException {
        if (checkUser && checkPassword) {
            insertNewUser(user,password);
        }else {
            JOptionPane.showMessageDialog(null,"debe introducir ambos parametros para crear un nuevo usuario");
        }
    }

    private void update(boolean checkUser, String user) throws SQLException {
        if(!checkUser) {
            JOptionPane.showMessageDialog(null,"Es necesario poner un usuario valido");
        }else{
            String[] options = {"clave", "Nombre"};
            int option = JOptionPane.showOptionDialog(
                    null,
                    "que desa modificar",
                    "UPDATE USER",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    options,
                    options[0]);
            System.out.println(option);
            if(option == 0){
                updateUserPassword(user,JOptionPane.showInputDialog(null,"introduzca nueva contraseña"));
            }else {
                updateUSerName(user,JOptionPane.showInputDialog(null,"introduzca nuevo nombre"));
            }
        }
    }

    private void read() throws SQLException {
        this.userView.getJtUser().setModel(ReadUser.showAllInfo());
    }

    private void delete(boolean checkUser, String user) throws SQLException {
        if(checkUser){
            int opcion = JOptionPane.showConfirmDialog(
                    null,
                    "esta seguro que desea borrar al usuario "+user,
                    "DELETE USER",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE);
            if(opcion==0){
                deleteUser(user);
            }
        }
    }



}
