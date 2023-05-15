package model.map;

import model.resources.primaryMaterials.PrimaryMaterials;

import java.util.List;

public enum Ground {
    IRONGROUND(),
    PLAIN();
    private String name;
    private PrimaryMaterials whatCanBeHarvestedFromThis;
    List<Ground> allGrounds;

    Ground() {
    }

    public Ground getGroundByName(){
        return null;
    }

    public String getName() {
        return name;
    }

}
