package model.library;

import server.querys.tools.*;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static server.querys.tools.GetColumnSize.getColumSize;
import static server.querys.tools.GetColumnsNames.getColumnNames;
import static server.querys.tools.GetRowByNameAndValue.getRowByNameAndValue;
import static server.querys.tools.GetRowSize.getRowSize;
import static server.querys.tools.GetRowSize.getRowSizeByName;
import static server.querys.tools.PredefinedQuerys.ALL_INFO_FROM_LIBRARY_TABLE;
import static server.querys.tools.QueryExecutor.queryExecutor;

public class ReadBook {

    private static String[][] info;
    private static String[] columns;

    public static TableModel readAllBooks() throws SQLException {

        info = new String[getRowSize("libros")][getColumSize("libros")];
        columns = getColumnNames("libros");
        int count =0;

        PreparedStatement statement = queryExecutor(ALL_INFO_FROM_LIBRARY_TABLE);
        ResultSet resultSet = statement.executeQuery();

        while(resultSet.next()){
            for (int i = 0; i < columns.length; i++) {
//                if(columns.equals("codigo")){
//                    info[count][i] = String.valueOf(resultSet.getInt(columns[i]));
//                }
                info[count][i]= resultSet.getString(columns[i]);
            }
            count++;
        }

        return new DefaultTableModel(info,columns);
    }

    public static TableModel readByAttribute(String tableName,String column, String value) throws SQLException {
        info = new String[getRowByNameAndValue(tableName, column, value)][getColumSize(tableName)];
        columns = getColumnNames(tableName);

        int count = 0;

        PreparedStatement statement = queryExecutor(ModifiableQuery.readByTableColunmAndValue(tableName, column, value));
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()){
            for (int i = 0; i < columns.length; i++) {
                info[count][i] = resultSet.getString(columns[i]);

            }

            count++;
        }
        return new DefaultTableModel(info,columns);
    }
}
