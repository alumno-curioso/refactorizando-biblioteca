package server.querys.tools;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetColumnsNames {
    private static PreparedStatement statement;
    private static ResultSet resultSet;

    public static String[] getColumnNames(String tableNameFromDB){

        String[] columnsNames;
        int count = 0;

        statement = QueryExecutor.queryExecutor(PredefinedQuerys.GET_COLUMNS);
        try {
            statement.setString(1,tableNameFromDB);
            resultSet = statement.executeQuery();
            columnsNames = new String[GetColumnSize.getColumSize(tableNameFromDB)];

            while (resultSet.next()){
                columnsNames[count] = resultSet.getString(1);
                count++;
            }
            return columnsNames;
        } catch (SQLException e) {
            e.printStackTrace();
        }

    return null;
    }
}
