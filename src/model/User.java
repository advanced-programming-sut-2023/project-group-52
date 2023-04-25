package model;

import java.util.ArrayList;

public class User {

    private static ArrayList<User> allUsers = new ArrayList<User>();
    private String username;
    private String password;
    private String nickname;
    private String slogan;
    private String securityQuestion;
    private String email;
    private static ArrayList<User> scoreBoard = new ArrayList<>();
    private int highscore;

    private String codePassword(String password){
        return null;
    }

    public User(String username, String password, String nickname, String slogan, String securityQuestion, String email) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.slogan = slogan;
        this.securityQuestion = securityQuestion;
        this.email = email;
    }

    public User getUserByEmail(String email){
        return null;
    }

    public User getUserByUsername(String username){
        return null;
    }

    public String getUsername() {
        return username;
    }

    public String getNickname() {
        return nickname;
    }

    public String getSlogan() {
        return slogan;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public String getEmail() {
        return email;
    }

    public int getHighscore() {
        return highscore;
    }

    public boolean isSecurityQuestionCorrect(String answer){
        return true;
    }

    public boolean isUsernameSameAsBefore(String username){
        return true;
    }

    public boolean isPasswordSameAsBefore(String password){
        return true;
    }

    public boolean isEmailSameAsBefore(String email){
        return true;
    }

    public boolean isSloganSameAsBefore(String Slogan){
        return true;
    }

    public boolean isNicknameSameAsBefore(String nickname){
        return true;
    }

    public int getRank(){
        return 0;
    }

    public void changeHighScoreIfNecessary(int newScore){

    }

    public void sortScoreBoard(){

    }

}

