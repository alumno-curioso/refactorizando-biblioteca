package server.querys;

import static server.querys.tools.PredefinedQuerys.ALL_INFO_FROM_TABLE;
import static server.querys.tools.QueryExecutor.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetAllFromTable {

    public static ResultSet tableInformation(String tableName) throws SQLException {
        PreparedStatement statement = queryExecutor(ALL_INFO_FROM_TABLE);
        statement.setString(1,tableName);
        ResultSet tableInfo = statement.executeQuery();

        return tableInfo;
    }
}
