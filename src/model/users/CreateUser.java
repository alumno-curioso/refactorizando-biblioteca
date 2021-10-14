package model.users;

import server.connection.Conexion;
import server.querys.tools.PredefinedQuerys;
import server.querys.tools.QueryExecutor;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static server.querys.tools.PredefinedQuerys.CREATE_USER;
import static server.querys.tools.QueryExecutor.queryExecutor;

public class CreateUser {


    public static void insertNewUser(String userName, String password) throws SQLException {

        if (JOptionPane.showInputDialog(null, "vuelva a introducir la contraseña", "CREATE USER", JOptionPane.WARNING_MESSAGE).equals(password)) {
            PreparedStatement statement = queryExecutor(CREATE_USER);
            statement.setString(1,password);
            statement.setString(2,userName);
            statement.executeUpdate();

        }else JOptionPane.showInputDialog(null,"debe introducir exactamente la misma contraseña","PASSWORD ERROR",JOptionPane.INFORMATION_MESSAGE);


    }


}
