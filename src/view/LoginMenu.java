package view;

import controller.Controller;
import model.User;

import java.util.Scanner;

public class LoginMenu {
    private Scanner scanner;
    private Controller controller;
    private int wrongAnswerCounter;
    private boolean loggedInStatus;
    private User loggedInUserForNextTime;

    public LoginMenu(Controller controller) {
        this.controller = controller;
    }

    public String run(){
        return null;
    }

    public void resetWrongAnswerCounter(){

    }

    public boolean isLoggedInStatus() {
        return loggedInStatus;
    }

    public User getLoggedInUserForNextTime() {
        return loggedInUserForNextTime;
    }

    public int getWrongAnswerCounter() {
        return wrongAnswerCounter;
    }

    public void setLoggedInUserForNextTime(User loggedInUserForNextTime) {
        this.loggedInUserForNextTime = loggedInUserForNextTime;
    }
}
