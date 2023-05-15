package controller;

import model.User;

import javax.xml.soap.Node;

public class Controller {
    private static User currentUser;
    private static User loggedInUser;
    public static String[]allQuestion=new String[3];
    public static String giveTrueString(String username){
        if(username.charAt(0)=='"' && username.charAt(username.length()-1)=='"') username=username.substring(1,username.length()-2);
        return username;
    }
    private static String login(String username,String password){
        return null;
    }
    ////

    private static String changeUsername(String newUsername){
        return null;
    }
    private static String changePassword(String newPassword){
        return null;
    }
    private static String changeEmail(String newEmail){
        return null;
    }
    private static String changeSlogan(String newSlogan){
        return null;
    }
    private static String resetSlogan(){
        return null;
    }
    private static String displayHighScore(){
        return null;
    }
    private static String displaySlogan(){
        return null;
    }
    //////
    private static String displayEveryThing(){
        return null;
    }
    private static String showMapDetails(){
        return null;
    }
    private static String aroundTheMap(String direction,String numberOfSteps ){
        return null;
    }

    public static User getCurrentUser() {
        return currentUser;
    }
}
