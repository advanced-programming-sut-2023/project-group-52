package view.Commands;

public enum LoginMenuCommands {
    LOGIN("^user login -u (?<username>\".*\"|\\S*) -p (?<password>\".*\"|\\S*)(?<loggedIn> --stay-logged-in)*$");
    private final String regex;

    private LoginMenuCommands(String regex) {
        this.regex = regex;
    }
}
