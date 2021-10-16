package server.querys.tools;

public class ModifiableQuery {

    public static String readByTableColunmAndValue(String tableName, String column, String value){
        String query = "select * from "+tableName+" where "+column+" like '"+value+"'";
        return query;
    }

    public static String readByTableColunmAndValue(String tableName, String column, int value){
        String query = "select * from "+tableName+" where "+column+" like "+value;
        return query;
    }

}
