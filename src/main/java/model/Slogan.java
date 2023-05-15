package model;

import java.util.List;

public enum Slogan {
    SLOGAN1("ruler of galacitc empire",1),
    SLOGAN3("execute order 66",3);

    private String content;
    private int id;
    List<Slogan> allSlogans;
    public static Slogan allSloagns[] = Slogan.values();
    Slogan(String content, int id) {
        this.content = content;
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public int getId() {
        return id;
    }

    public static String getContentById(int id){
        for(Slogan slogan:allSloagns){
            if (slogan.getId()==id) return slogan.getContent();
        }
        return null;
    }
}
