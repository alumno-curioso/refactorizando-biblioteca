package model.users;

import server.querys.tools.*;

import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static server.querys.tools.GetColumnSize.getColumSize;
import static server.querys.tools.GetColumnsNames.getColumnNames;
import static server.querys.tools.GetRowSize.getRowSize;
import static server.querys.tools.PredefinedQuerys.FIND_USERS;
import static server.querys.tools.QueryExecutor.queryExecutor;

public class ReadUser {

    public static DefaultTableModel showAllInfo() throws SQLException {

        String[][] info = new String[getRowSize("usuarios")][getColumSize("usuarios")];
//        String[] columnsName = new String[getColumSize("usuarios")];
//        columnsName = getColumnNames("usuarios");
        String[] columnsName = {"usuarios"};

        int count = 0;

        PreparedStatement statement = queryExecutor(FIND_USERS);
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {

            info[count][0]= resultSet.getString("usuario");
//            info[count][1]= resultSet.getString(1);


            count++;
        }
        DefaultTableModel defaultTableModel = new DefaultTableModel(info,columnsName);


        return new DefaultTableModel(info,columnsName);
    }
}
