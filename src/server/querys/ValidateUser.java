package server.querys;

import server.connection.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static server.querys.PredefinedQuerys.CHECK_USER;

public class ValidateUser {

    private static Connection con;
    private static PreparedStatement st;
    private static ResultSet rs;

    public static boolean validateUser(String user, String password){

        try {
            con = Conexion.getCon();
            st=con.prepareStatement(CHECK_USER);
            st.setString(1,user);
            st.setString(2,password);

            rs = st.executeQuery();
            if(rs.next()){
                con.close();
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
