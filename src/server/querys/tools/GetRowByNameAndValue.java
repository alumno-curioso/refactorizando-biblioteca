package server.querys.tools;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetRowByNameAndValue {
    public static int getRowByNameAndValue(String tableName, String column, String value) throws SQLException {
        String query = "select count(*) from "+tableName+" where "+column+" like ?";
        PreparedStatement statement = QueryExecutor.queryExecutor(query);
        statement.setString(1,value);

        ResultSet resultSet = statement.executeQuery();
        resultSet.next();

        return Integer.parseInt(resultSet.getString(1));
    }
}
