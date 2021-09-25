package controller;

import view.MainView;
import view.LoginView;

public class MainController {
    private Controller controller;

     public MainController(){
         this.controller =new Controller(new LoginView(),new MainView());

     }
}
