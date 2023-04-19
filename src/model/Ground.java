package model;

import java.util.List;

public enum Ground {
    ;
    private String name;
    List<Ground> allGrounds;

    Ground(String name) {
        this.name = name;
    }
    public Ground getGroundByName(){
        return null;
    }

    public String getName() {
        return name;
    }

}
