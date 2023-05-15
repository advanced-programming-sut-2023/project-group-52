package model.building.CastleBuilding.cagedWarDogs;

import model.animal.WarDog;
import model.building.Building;
import model.map.Cell;

import java.util.ArrayList;

public class CagedWarDogs extends Building {
    private ArrayList<WarDog> allWarDogs;
    public CagedWarDogs(Cell cell) {
        super(cell);
        allWarDogs=new ArrayList<>();
        for(int i=0;i<6;i++){
            allWarDogs.add(new WarDog(cell,ownerGovernment));
        }
    }
    public void openingTheCage(){
        for(WarDog warDog:allWarDogs){
            warDog.getFree();
        }
    }
}
