package model.building;

import model.animal.Horse;
import model.map.Cell;

import java.util.ArrayList;

public class Stable extends Building{
    private ArrayList<Horse> allHorses;
    public Stable(Cell cell) {
        super(cell);
        allHorses=new ArrayList<>();
        for(int i=0;i<4;i++){
            allHorses.add(new Horse(cell,ownerGovernment,null));
        }
    }
}
