package todojunto.conexion;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultasSQL {

    private Connection conn=null;
    private ResultSet rs=null;

    /***
     * se puede observar que el metodo necesita una objeto del tipo conection  y ademas recibe por parametro la consulta SQL a llevar a cabo
     * @param sql
     *
     *
     */
    private void ejecutar_consulta(String sql) {

        try {

            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery(sql);

        } catch (SQLException ex) {
        }
    }



    //en este metodo tambien necesita el una instruccion sql para su coorecto funcionamiento
    //ademas de necesitar acceso al un objeto del tipo conection
    public int Ejecutar_Sql_Actualizacion(String sql) {
        int i;
        try {
            Statement stmt = conn.createStatement();
            JOptionPane.showMessageDialog(null, sql);
            i = stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            i = 0;
        }
        return i;
    }

}
