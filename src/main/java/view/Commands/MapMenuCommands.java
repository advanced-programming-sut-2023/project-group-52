package view.Commands;

public enum MapMenuCommands {
    MOVE("^map (<?direction>.+)$"),
    SHOWMAPDETAIL("^show details -x (?<x>\\d+) -y (?<y>\\d+)$");
    private final String regex;

    MapMenuCommands(String regex) {
        this.regex = regex;
    }

    public String getRegex() {
        return regex;
    }
}
