package model.building.industry.Harvesters;

import model.map.Cell;
import model.building.generalTypes.Harvester;
import model.map.Ground;
import model.resources.primaryMaterials.Iron;
import model.resources.primaryMaterials.Stone;
import model.resources.primaryMaterials.Wood;

public class IronMine extends Harvester {
    public IronMine(Cell cell) {
        super(cell);
        onlySuitableGround= Ground.IRONGROUND;
        neededBuildingMaterial= new Wood();
        numberOfGoldCoinNeeded=0;
        numberOfNeededBuildingMaterial=20;
        numberOfWorkerNeeded=2;
        whatCanBeHarvested=new Iron();
    }
}
