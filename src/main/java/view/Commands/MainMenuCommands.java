package view.Commands;

public enum MainMenuCommands {
    DISPLAYHIGHSCORE("^profile display highscore$"),
    DISPLAYRANK("^profile display rank$"),
    DISPLAYSLOGAN("^profile display slogan$"),
    REMOVESLOGAN("^Profile remove slogan$"),
    CHANGESLOGAN("^profile change slogan -s (?<slogan>\".*\"|\\S*)$"),
    GHNAGEPASSWORD("^profile change password -o (?<oldPassword>\".*\"|\\S*) -n (?<newPassword>\".*\"|\\S*)$"),
    CHANGENICKNAME("^profile change -n (?<nickname>\".*\"|\\S*)$"),
    CHANGEUSERNAME("^profile change -u (?<username>\".*\"|\\S*)$");

    private final String regex;

    MainMenuCommands(String regex) {
        this.regex = regex;
    }

    public String getRegex() {
        return regex;
    }
}
