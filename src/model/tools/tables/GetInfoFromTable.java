package model.tools.tables;

import server.querys.GetAllFromTable;

import static server.querys.tools.GetColumnSize.*;
import static server.querys.tools.GetRowSize.*;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GetInfoFromTable {


    public static String[][] getInfoFromTable(String tableName) throws SQLException {
        String[][] tableInfo = new String[getColumSize(tableName)][getRowSize(tableName)];

        ResultSet rs = GetAllFromTable.tableInformation(tableName);

        while(rs.next()){
            int count =0;
            for (int i = 0; i < getColumSize(tableName); i++) {
                tableInfo[count][i] = rs.getString(i);
            }
            count++;
        }


        return tableInfo;
    }

}
