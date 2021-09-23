package server.querys;

import server.connection.Conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static server.querys.PredefinedQuerys.CHECK_USER;

public class ValidateUser {

    private static Conexion con;
    private static PreparedStatement st;
    private static ResultSet rs;

    public static boolean validateUser(String user, String password){

        try {
            con = new Conexion();
            st=con.getCon().prepareStatement(CHECK_USER);
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
        con.close();
        return false;
    }
}
