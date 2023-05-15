package view;

import controller.Controller;
import controller.SignUpMenuController;
import view.Commands.SignupMenuCommands;

import java.util.regex.Matcher;

public class SignupMenu {

    private Controller controller;

    public SignupMenu(Controller controller) {
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
                SignUpMenuController.registerUserName(matcher);
                return null;
            }
        }

    }



}
