package view.Commands;

public enum SignupMenuCommands {
    SIGNUP("^user create -u (?<username>\".*\"|\\S*)" +
            " -p (?<password>\"[^\"]*\"|\\S*)" +
            " ((password confirmation (?<passwordConfirmation>\".*\"|\\S*) )*)" +
            " -email (?<email>\".*\"|\\S*) " +
            "-n (?<nickname>\".*\"|\\S*)" +
            "( -s (?<slogan>\".*\"|\\S*))*$");
    private final String regex;

    SignupMenuCommands(String regex) {
        this.regex = regex;
    }

    public String getRegex() {
        return regex;
    }
}
