package controller;

import model.User;
import view.Commands.SignupMenuCommands;
import view.Menu;

import java.util.regex.Matcher;

public class MainMenuController {

    public static void changeUsername(Matcher matcher) {
        User currentUser=Controller.getCurrentUser();
        String username = matcher.group("username");
        if (SignUpMenuController.isFieldEmpty(username)) {
            System.out.println("username field is empty");
            return;
        }
        if (!SignUpMenuController.isFieldEmpty(username)) {
            System.out.println("username format is invalid");
            return;
        }
        System.out.println("success");
        currentUser.setUsername(username);
    }
    public static void changeNickname(Matcher matcher) {
        User currentUser=Controller.getCurrentUser();
        String nickname = matcher.group("username");
        if (SignUpMenuController.isFieldEmpty(nickname)) {
            System.out.println("nickname field is empty");
            return;
        }
        if (!SignUpMenuController.isUserNameFormatCorrect(nickname)) {
            System.out.println("nickname format is invalid");
            return;
        }
        System.out.println("success");
        currentUser.setNickname(nickname);
    }
    public static void changePassword(Matcher matcher) {
        User currentUser=Controller.getCurrentUser();
        String oldPassword = matcher.group("oldPassword");
        if (SignUpMenuController.isFieldEmpty(oldPassword)) {
            System.out.println("oldPassword field is empty");
            return;
        }
        String newPassword = matcher.group("newPassword");
        if (SignUpMenuController.isFieldEmpty(newPassword)) {
            System.out.println("newPassword field is empty");
            return;
        }
        if(!currentUser.isPasswordSameAsBefore(oldPassword)){
            System.out.println("password is wrong");
            return;
        }
        if (currentUser.isPasswordSameAsBefore(newPassword)){
            System.out.println("new password is same as the old one");
            return;
        }
        System.out.println("success");
        currentUser.setPassword(newPassword);

    }
    public static void changeSlogan(Matcher matcher) {
        User currentUser=Controller.getCurrentUser();
        String newSlogan=matcher.group("");
        if (SignUpMenuController.isFieldEmpty(newSlogan)) {
            System.out.println("slogan field is empty");
            return;
        }
        currentUser.setSlogan(newSlogan);
    }
    public static void removeSlogan(){
        User currentUser=Controller.getCurrentUser();
        currentUser.setSlogan("");
    }
    public static void displayHighscore(){
        User currentUser=Controller.getCurrentUser();
        System.out.println(currentUser.getHighScore());
    }
    public static void displayRank(){
        User currentUser=Controller.getCurrentUser();
        System.out.println(currentUser.getRank());
    }
    public static void displaySlogan(){
        User currentUser=Controller.getCurrentUser();
        if(currentUser.getSlogan()==""){
            System.out.println("Slogan is empty!");
            return;
        }
        System.out.println(currentUser.getSlogan());
    }

}
