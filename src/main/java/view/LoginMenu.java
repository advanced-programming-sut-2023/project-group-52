package view;

import controller.Controller;
import controller.SignUpMenuController;
import model.User;
import view.Commands.SignupMenuCommands;

import java.util.Scanner;
import java.util.regex.Matcher;

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
        Matcher matcher;
        String command, result;
        while (true) {
            command = Menu.getScanner().nextLine();
            int ckeck = 1;
            if (command.matches("^Exit$")) {
                return "exit";
            }
            else if ((matcher = Menu.getMatcher(command, SignupMenuCommands.SIGNUP.getRegex())) != null) {
//                System.out.println(SignUpMenuController.);
                return null;
            }
        }
    }

    public void resetWrongAnswerCounter(){
        wrongAnswerCounter=0;
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
