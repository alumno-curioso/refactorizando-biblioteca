package server.querys.tools;

public class PredefinedQuerys {

    //querys genericas para preparedSteatement
    public final static String GET_COLUMNS = "select COLUMN_NAME from information_schema.COLUMNS where TABLE_NAME=?";
    public final static String GET_COLUMNS_SIZE = "select count(*) from information_schema.COLUMNS where TABLE_NAME=?";
    //todo metodo rows
    public final static String GET_ROWS_SIZE = "select count(*) from alumnos";
    public final static String CHECK_USER ="select * from usuarios where usuario=? and clave=?";

    //GET_ALL_INFO
    public final static String ALL_INFO_FROM_STUDENT_TABLE = "select * from alumnos";
    public final static String ALL_INFO_FROM_LIBRARY_TABLE = "select * from libros";
    public final static String ALL_INFO_FROM_LOAN_TABLE = "select * from prestamos";
    public final static String ALL_INFO_FROM_USER_TABLE = "select * from usuarios";

    //STUDENTS QUERYS
    //READ
    public final static String FIND_BY_STUDENT_NAME = "select * from alumnos where nombre= ?";
    public final static String FIND_BY_STUDENT_FIRST_LAST_NAME = "select * from alumnos where apellido1= ?";
    public final static String FIND_BY_STUDENT_SECOND_LAST_NAME = "select * from alumnos where apellido2= ?";
    public final static String FIND_BY_STUDENT_DNI = "select * from alumnos where dni= ?";
    //TODO crear el resto del crud para alumnos
    //UPDATE
    public final static String UPDATE_STUDENT_NAME = "update alumnos set nombre=? where dni =?";
    public final static String UPDATE_STUDENT_FIRST_LAST_NAME = "update alumnos set apellido1=? where dni =?";
    public final static String UPDATE_STUDENT_SECOND_LAST_NAME = "update alumnos set apellido2=? where dni =?";
    public final static String UPDATE_STUDENT_DNI = "update alumnos set dni=? where dni =?";
    //CREATE
    public final static String CREATE_STUDENT = "insert into alumnos(apellido2, apellido1, nombre, dni) VALUES (?,?,?,?)";
    //DELETE
    public final static String DELETE_STUDENT = "delete from alumnos where dni=?";

    //LIBRARY QUERYS
    public final static String FIND_BY_BOOK_TITLE = "select * from libros where Titulo =?";
    public final static String FIND_BY_BOOK_PUBLISHING_HOUSE = "select * from libros where Editorial =?";
    public final static String FIND_BY_BOOK_AUTOR = "select * from libros where Autor =?";
    public final static String FIND_BY_BOOK_COURSE = "select * from libros where Asignatura =?";

    //TODO crear el resto dec crud para libros
    //UPDATE
    //CREATE
    public static final String CREATE_BOOK = "insert into libros(estado,Asignatura,Editorial,Autor,Titulo) values(?,?,?,?,?)";
    //DELETE
    public final static String DELETE_BOOK = "delete from libros where codigo=?";

    //LOAN QUERYS
    public final static String FIND_LOAN_BY_STUDENT_CODE= "select * from prestamos where codAlumnos = ?";
    public final static String FIND_LOAN_BY_BOOK_CODE= "select * from prestamos where codLibros = ?";

    //todo definir el tipo de consultas que necesitamos para los prestamos

    //UPDATE
    //CREATE
    public static final String MAKE_A_LOAN= "insert into prestamos(estado,FechaPrestamo,codLibros,codAlumnos) values(?,now(),?,?)";
    //DELETE

    //USER QUERYS
    public final static String FIND_BY_USER_NAME = "select * from usuarios where usuario=?";
    public final static String FIND_USERS = "select usuario from usuarios";

    //TODO crear el resto del crud para los usuarios
    //UPDATE
    public final static String UPDATE_USER_PASSWORD = "update usuarios set clave=? where usuario=?";
    public final static String UPDATE_USER_NAME = "update usuarios set usuario=? where usuario=?";

    //CREATE
    public final static String CREATE_USER = "insert into usuarios(clave,usuario) values(?,?)";
    //DELETE
    public final static String DELETE_USER = "delete from usuarios where usuario =?";
}

