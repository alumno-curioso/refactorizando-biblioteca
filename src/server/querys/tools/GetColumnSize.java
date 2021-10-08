package server.querys.tools;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static server.querys.tools.PredefinedQuerys.GET_COLUMNS_SIZE;
import static server.querys.tools.QueryExecutor.*;

public class GetColumnSize {

    private static PreparedStatement statement;
    private static ResultSet resultSet;

    public static int getColumSize(String tableNameFromDB) throws SQLException {

        statement = queryExecutor(GET_COLUMNS_SIZE);

        statement.setString(1, tableNameFromDB);
        resultSet = statement.executeQuery();

        resultSet.next();

        return resultSet.getInt(1);
    }
}
