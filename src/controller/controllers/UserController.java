package controller.controllers;

import controller.events.UserEvents;
import view.UserView;

public class UserController {

    private static UserView userView;
    private static UserEvents userEvents;

    private UserController(){}

    public static void runUserView(){
        if(userView==null) {
            userView = new UserView();
            userEvents= new UserEvents(userView);

            userView.getJcCreateUser().addActionListener(userEvents);
            userView.getJbReadUser().addActionListener(userEvents);
            userView.getJbUpdateUser().addActionListener(userEvents);
            userView.getJbDeleteUser().addActionListener(userEvents);
            userView.getJbReturnMainView().addActionListener(userEvents);
        }
        userView.setVisible(true);
    }

}
