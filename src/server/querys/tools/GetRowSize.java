package server.querys.tools;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static server.querys.tools.QueryExecutor.*;
import static server.querys.tools.GetRowSize.*;
import static server.querys.tools.PredefinedQuerys.GET_ROWS_SIZE;

public class GetRowSize {

    private static PreparedStatement statement;
    private static ResultSet resultSet;

    public static int getRowSize(String tableNameFromDB){
        statement = queryExecutor(GET_ROWS_SIZE);

        try {
            statement.setString(1,tableNameFromDB);
            resultSet = statement.executeQuery();

            resultSet.next();


          return  resultSet.getInt(1);
//          return Integer.parseInt(resultSet.getString(1));

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return 1;
    }

}
