package server.querys;

public class PredefinedQuerys {
    final static String CHECK_USER ="select * from usuarios where usuario=? and clave=?";
    final static String ALL_STUDENTS = "select * from usuarios";
}
