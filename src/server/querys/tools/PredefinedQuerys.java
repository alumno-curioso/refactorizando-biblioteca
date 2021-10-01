package server.querys.tools;

public class PredefinedQuerys {
    public final static String CHECK_USER ="select * from usuarios where usuario=? and clave=?";
    public final static String ALL_STUDENTS = "select * from usuarios";
}
