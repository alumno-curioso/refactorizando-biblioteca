package app;

import controller.Controller;
import view.VistaPrincipal;

public class App {
    public static void main(String[] args) {
//        new Conexion();
        Controller controller = new Controller(new VistaPrincipal());

    }
}
