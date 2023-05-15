package model;

import java.util.ArrayList;
import java.util.Collections;

public class User {

    private static ArrayList<User> allUsers = new ArrayList<User>();
    private String username;
    private String password;
    private String nickname;
    private String slogan;
    private String securityQuestionAnswer;
    private String email;
    private int securityQuestionNumber;
    private static ArrayList<User> scoreBoard = new ArrayList<>();
    private int highScore;

    private String codePassword(String password){
        return null;
    }

    public String getSecurityQuestionAnswer() {
        return securityQuestionAnswer;
    }

    public int getSecurityQuestionNumber() {
        return securityQuestionNumber;
    }

    public User(String username, String password, String nickname, String slogan, String securityQuestionAnswer, String email, int securityQuestionNumber) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.slogan = slogan;
        this.securityQuestionAnswer = securityQuestionAnswer;
        this.email = email;
        this.securityQuestionNumber=securityQuestionNumber;
    }

    public User() {
    }

    public static User getUserByEmail(String email){
        for(User user:allUsers){
            if(email.toLowerCase().equals(user.getEmail().toLowerCase())) return user;
        }
        return null;
    }

    public static User getUserByUsername(String username){
        for (User user : allUsers){
            if (user.getUsername().equals(username)) return user;
        }
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
        return securityQuestionAnswer;
    }

    public String getEmail() {
        return email;
    }

    public int getHighScore() {
        return highScore;
    }

    public boolean isSecurityQuestionCorrect(String answer){
        return answer.equals(securityQuestionAnswer);
    }

    public boolean isUsernameSameAsBefore(String username){
        return username.equals(this.username);
    }

    public boolean isPasswordSameAsBefore(String password){return password.equals(this.password);}

    public boolean isEmailSameAsBefore(String email){
        return email.equals(this.email);
    }

    public boolean isSloganSameAsBefore(String slogan){
        return slogan.equals(this.slogan);
    }

    public boolean isNicknameSameAsBefore(String nickname){
        return nickname.equals(this.nickname);
    }

    public static int getRank(User user){
        for(int i=0;i<allUsers.size();i++){
            if (user.equals(allUsers.get(i))) return i+1;
        }
        return -1;
    }
    public void changeHighScoreIfNecessary(int newScore){
        if (newScore>highScore) highScore=newScore;
    }
    public void sortScoreBoard(){
        for (int i = 0; i < scoreBoard.size(); i++) {
            for (int j = 0; j < scoreBoard.size(); j++) {
                User userI = scoreBoard.get(i);
                User userJ = scoreBoard.get(j);
                int highScoreUserI = userI.highScore;
                int highScoreUserJ = userJ.highScore;
                String nameUserI = userI.username;
                String nameUserJ = userJ.username;
                if ((highScoreUserI > highScoreUserJ) ||
                        (highScoreUserI == highScoreUserJ && nameUserI.compareTo(nameUserJ) < 0)) {
                    Collections.swap(scoreBoard, i, j);
                }
            }
        }
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public void setSecurityQuestionAnswer(String securityQuestionAnswer) {
        this.securityQuestionAnswer = securityQuestionAnswer;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public int getRank(){
        for(int i=0;i<scoreBoard.size();i++){
            if (this.equals(scoreBoard.get(i))) return i+1;
        }
        return (-1);
    }
}

