package view;

import controller.SignUpMenuController;
import model.User;
import view.Commands.SignupMenuCommands;

import java.util.regex.Matcher;

public class MainMenu {
    private static User currentUser;
    private static User loggedInUser;
    public static String run(){
        Matcher matcher;
        String command, result;
        while (true) {
            command = Menu.getScanner().nextLine();
            int ckeck = 1;
            if (command.matches("^Exit$")) {
                return "exit";
            }
            else if ((matcher = Menu.getMatcher(command, SignupMenuCommands.SIGNUP.getRegex())) != null) {
                SignUpMenuController.registerUserName(matcher);
                return null;
            }
        }
    }

    public static void setCurrentUser(User currentUser1) {
        currentUser = currentUser1;
    }

    public static void setLoggedInUser(User loggedInUser1) {
        loggedInUser = loggedInUser1;
    }
}
