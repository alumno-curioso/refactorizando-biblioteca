package server.querys;

import server.connection.Conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ValidateUser {

//    private final static String CHECK_USER ="select * from usuarios where usuario=? and clave=?";
static String query = "select * from usuarios where usuario='jj' and clave='1234'";
    private static Conexion con;
//    private static PreparedStatement st;
    private  static Statement st;
    private static ResultSet rs;
    public static boolean validateUser(String user, String password){

        try {
            con = new Conexion();
//            st=con.getCon().prepareStatement(CHECK_USER);
//            st.setString(1,user);
//            st.setString(2,password);
            st = con.getCon().createStatement();
            rs = st.executeQuery(query);
//            rs = st.executeQuery();
            if(rs.next()){
                System.out.println("ok! puedes pasar");
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
