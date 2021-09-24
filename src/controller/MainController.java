package controller;

import view.MainView;
import view.VistaLogin;

public class MainController {
    private Controller controller;

     public MainController(){
         this.controller =new Controller(new VistaLogin(),new MainView());

     }
}
