package model.building.industry.oxTether;

import model.animal.Ox;
import model.building.Building;
import model.map.Cell;

import java.util.ArrayList;

public class OxTether extends Building {
    private int rate;
    private ArrayList<Ox> allOxes;

    public OxTether(Cell cell) {
        super(cell);
        allOxes=new ArrayList<>();
        allOxes.add(new Ox(cell,ownerGovernment,this));

    }
    public void addOx(){
        rate+=1;
        allOxes.add(new Ox(cell,ownerGovernment,this));
    }
}
