package controller;

import model.Slogan;
import model.User;
import model.people.Person;
import view.MainMenu;
import view.Menu;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignUpMenuController {
    private static int numberOfWrongPasswords=0;
    public static boolean isPasswordStrongEnough(String password) {
        if (password.length() < 6 ||
                !password.matches("^.*[a-z].*$") ||
                !password.matches("^.*[A-Z].*$") ||
                !password.matches("^.*\\d.*$") ||
                !password.matches("^.*[a-zA-Z0-9].*$") ||
                password.matches("^.* .*$")) {
            return false;
        }
        return true;
    }

    private static boolean isEmailValidFormat(String email) {
        return email.matches("^[a-zA-Z\\.\\_0-9]+@[a-zA-Z\\.\\_0-9]+\\.[a-zA-Z\\.\\_0-9]+$");
    }

    public static boolean isUserNameFormatCorrect(String userName) {
        if (userName.matches("^.*[^A-Za-z\\_0-9].*$") ||
                userName.matches("^.* .*$")) {
            return false;
        }
        return true;
    }

    public static boolean isFieldEmpty(String fieldContext) {
        if (fieldContext.equals(null)) return true;
        else if (fieldContext.matches("^ *$")) return true;
        return false;
    }
    public static boolean isSloganFieldEmpty(String fieldContext) {
        if (fieldContext.matches("^ *$")) return true;
        return false;
    }
    private static String creatNewUsernameBecauseOfRepetition(String username) {
        String result = username;
        int counter = 1;
        while (User.getUserByUsername(result) != null) {
            result = username + counter;
            counter += 1;
        }
        return result;
    }
    public static String generateSecurePassword() {
        String password="";
        int min=2;
        int max=4;
        int numberOfBigLetters=(int)Math.floor(Math.random()*(max-min+1)+min);
        for(int i=0;i<numberOfBigLetters;i++){
            int minChar=65;
            int maxChar=90;
            int randomCharNumber=(int)Math.floor(Math.random()*(maxChar-minChar+1)+minChar);
            password+=(char)randomCharNumber;
        }
        int numberOfSmallLetters=(int)Math.floor(Math.random()*(max-min+1)+min);
        for(int i=0;i<numberOfSmallLetters;i++){
            int minChar=97;
            int maxChar=122;
            int randomCharNumber=(int)Math.floor(Math.random()*(maxChar-minChar+1)+minChar);
            password+=(char)randomCharNumber;
        }
        int numberOfSpecialLetters=(int)Math.floor(Math.random()*(max-min+1)+min);
        for(int i=0;i<numberOfSpecialLetters;i++){
            int minChar=33;
            int maxChar=46;
            int randomCharNumber=(int)Math.floor(Math.random()*(maxChar-minChar+1)+minChar);
            password+=(char)randomCharNumber;
        }
        int numberOfNumericLetters=(int)Math.floor(Math.random()*(max-min+1)+min);
        for(int i=0;i<numberOfSpecialLetters;i++){
            int minChar=0;
            int maxChar=9;
            int randomCharNumber=(int)Math.floor(Math.random()*(maxChar-minChar+1)+minChar);
            password+=randomCharNumber;
        }
        List<String> allLetters= Arrays.asList(password.split(""));
        Collections.shuffle(allLetters);
        password="";
        for (String string:allLetters){
            password+=string;
        }
        return password;
    }
    public static boolean register(Matcher matcher){
        return registerNickname(matcher);
    }
    public static boolean registerNickname(Matcher matcher){
        String nickname=matcher.group("nickname");
        if(SignUpMenuController.isFieldEmpty(nickname)) {
            System.out.println("nickname field is empty");
            return false;
        }
        return registerUserName(matcher);
    }

    public static boolean registerUserName(Matcher matcher) {
        String newUserName = "";
        String username = matcher.group("username");
        if (SignUpMenuController.isFieldEmpty(username)) {
            System.out.println("username field is empty");
            return false;
        }
        if (!SignUpMenuController.isUserNameFormatCorrect(username)) {
            System.out.println("username format is invalid");
            return false;
        }
        if (User.getUserByUsername(username) != null) {
            System.out.println("already there is a user with this name");
            String answer = "no";
            while (answer != "yes") {
                System.out.println("do you like this name instead");
                newUserName = SignUpMenuController.creatNewUsernameBecauseOfRepetition(username);
                System.out.println(newUserName);
                answer = Menu.getScanner().nextLine();
            }
            return false;
        }
        return registerPassword(matcher,newUserName);
    }

    public static boolean registerPassword(Matcher matcher,String newUsername) {
        String password = matcher.group("password");
        String randomPassword="";
        int checkRandom=1;
        if (SignUpMenuController.isFieldEmpty(password)) {
            System.out.println("password field is empty");
            return false;
        }
        if (password=="random"){
            checkRandom=0;
            randomPassword=generateSecurePassword();
            System.out.println("your random password is:"+randomPassword+"please enter this password");
            String checkRandoomPassword= Menu.getScanner().nextLine();
            if(!checkRandoomPassword.equals(randomPassword)) {
                System.out.println("password incorrect! registeration failed!");
                return false;
            }
        }
        if (!SignUpMenuController.isPasswordStrongEnough(password) && checkRandom==1) {
            System.out.println("password not strong enough");
            return false;
        }
        String passwordConfirmation=matcher.group("passwordConfirmation");
        if(checkRandom==1 &&
                SignUpMenuController.isFieldEmpty(passwordConfirmation)){
            System.out.println("passwordConfirmation field is empty");
            return false;
        }
        if (checkRandom==1 && !password.equals(passwordConfirmation)){
            System.out.println("password confirmation is wrong");
            return false;
        }
        return registerEmail(matcher,newUsername,randomPassword);
    }
    public static boolean registerEmail(Matcher matcher,String newUsername,String newPassword){
        String email = matcher.group("email");
        if (SignUpMenuController.isFieldEmpty(email)) {
            System.out.println("email field is empty");
            return false;
        }
        if (User.getUserByEmail(email)!=null){
            System.out.println("a user with this email already exists");
            return false;
        }
        if (!SignUpMenuController.isEmailValidFormat(email)){
            System.out.println("email format incorrect");
            return false;
        }
        return registerSlogan(matcher,newUsername,newPassword);
    }
    public static boolean registerSlogan(Matcher matcher,String newUsername,String newPassword){
        String slogan = matcher.group("slogan");
        String newSlogan="";
        if(SignUpMenuController.isSloganFieldEmpty(slogan)){
            System.out.println("slogan field is empty");
            return false;
        }
        if (slogan=="random"){
            int randomSloganNumber=(int)Math.floor(Math.random()*(3-1+1)+1);
            newSlogan=Slogan.getContentById(randomSloganNumber);
        }
        return registerSecurityQuestion(matcher,newUsername,newPassword,newSlogan);

    }
    public static boolean registerSecurityQuestion(Matcher matcher,String newUsername,String newPassword,String newSlogan){
        String command;
        int questionNumber;
        String answer;
        String answerConfirm;

        System.out.println("Pick your security question: 1. What is my father’s name? 2. What\n" +
                "was my first pet’s name? 3. What is my mother’s last name?");
        String regex= "question pick -q (?<questionNumber>\\d+) -a (?<answer>\".*\"|\\S*) -c (?<answerConfirm>\".*\"|\\S*)";
        Matcher matcher1;
        while (true) {
            command = Menu.getScanner().nextLine();
            matcher1=Menu.getMatcher(command,regex);
            if(matcher1!=null) {
                questionNumber = Integer.parseInt(matcher1.group("questionNumber"));
                if (questionNumber < 1 || questionNumber > 3) {
                    System.out.println("invalid number");
                    continue;
                }
                answer = matcher1.group("answer");
                if(SignUpMenuController.isFieldEmpty(answer)){
                    System.out.println("answer field is empty");
                    continue;
                }
                answerConfirm= matcher1.group("answerConfirm");
                if (SignUpMenuController.isFieldEmpty(answerConfirm)){
                    System.out.println("answerConfirm field is empty");
                    continue;
                }
                if (!answerConfirm.equals(answer)){
                    System.out.println("answer does not match answerConfirm");
                    continue;
                }
                else break;

            }
            else System.out.println("invalid command!");
        }
        return registerUser(matcher,newUsername,newPassword,newSlogan,questionNumber,answer);
    }

    public static boolean registerUser(Matcher matcher, String newUsername, String newPassword, String newSlogan
            ,int questionNumber,String answer){
        String username=matcher.group("username");
        if(newUsername!="") username=newUsername;
        String password=matcher.group("password");
        if(newPassword!="") password=newPassword;
        String slogan=matcher.group("slogan");
        if(newSlogan!="") slogan=newSlogan;
        User user=new User(username,password,matcher.group("nickname")
                ,slogan,answer,matcher.group("email"),questionNumber);
        System.out.println("successful");
        return true;
    }
    private static void lagBecauseOfWrongAnswer() throws InterruptedException {
        for(int i=(numberOfWrongPasswords*5);i>0;i--){
            System.out.println("wrong answer please wait"+i+"seconds for you next attempt");
            Thread.sleep(1000);
        }
    }
    public static void login(Matcher matcher) throws InterruptedException {
        String username=matcher.group("username");
        String password=matcher.group("password");

        if(User.getUserByUsername(username)==null){
            System.out.println("user with this username does not exist");
            return;
        }
        if (!User.getUserByUsername(username).isPasswordSameAsBefore(password)){
            numberOfWrongPasswords+=1;
            System.out.println("password is wrong");
            lagBecauseOfWrongAnswer();
            return;
        }
        if (matcher.group("loggeedIn")!=null && matcher.group("loggeedIn")==" --stay-logged-in")
        numberOfWrongPasswords=0;
        System.out.println("successful");
        MainMenu.setCurrentUser(User.getUserByUsername(username));
        MainMenu.setLoggedInUser(User.getUserByUsername(username));
        MainMenu.run();
    }
    public static void forgotPassword(Matcher matcher){
        String username=matcher.group("username");
        if(User.getUserByUsername(username)==null){
            System.out.println("user with this username does not exist");
            return;
        }
        User user=User.getUserByUsername(username);
        int idQuestion=user.getSecurityQuestionNumber();
        System.out.println(Menu.allQuestion[idQuestion-1]);
        String answer=Menu.getScanner().nextLine();
        if(!answer.equals(user.getSecurityQuestionAnswer())){
            System.out.println("wrong Answer");
            return;
        }
        System.out.println("new password?");
        String newPassword=Menu.getScanner().nextLine();
        while(!SignUpMenuController.isPasswordStrongEnough(newPassword)){
            System.out.println("weak password try again!");
            newPassword=Menu.getScanner().nextLine();
        }
        user.setPassword(newPassword);

    }


}
