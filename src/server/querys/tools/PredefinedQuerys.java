package server.querys.tools;

public class PredefinedQuerys {
    public final static String GET_COLUMNS = "select COLUMN_NAME from information_schema.COLUMNS where TABLE_NAME=?";
    public final static String GET_COLUMNS_SIZE = "select count(*) from information_schema.COLUMNS where TABLE_NAME=?";
    public final static String GET_ROWS_SIZE = "select count(*) from ?";
    public final static String CHECK_USER ="select * from usuarios where usuario=? and clave=?";
    public final static String ALL_STUDENTS = "select * from usuarios";
}
