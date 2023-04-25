package model.building.generalTypes;

import model.building.Building;
import model.map.Cell;
import model.resources.Resource;
import model.resources.primaryMaterials.PrimaryMaterials;

import java.util.ArrayList;

public class Harvester extends Building {
    protected ArrayList<Resource> storedHarvestedMaterials;
    protected int rate;
    protected PrimaryMaterials whatCanBeHarvested;
    public Harvester(Cell cell) {
        super(cell);
        storedHarvestedMaterials=new ArrayList<>();
    }

    public int getRate() {
        return rate;
    }
    public void harvesting(){
//        for (int i=0;i<rate;i++){
//            storedHarvestedMaterials.add(n)
//        }
    }
}
