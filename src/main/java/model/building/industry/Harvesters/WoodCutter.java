package model.building.industry.Harvesters;

import model.animal.Ox;
import model.building.generalTypes.Harvester;
import model.map.Cell;
import model.resources.primaryMaterials.Iron;
import model.resources.primaryMaterials.Wood;

public class WoodCutter extends Harvester {
    public WoodCutter(Cell cell) {
        super(cell);
        neededBuildingMaterial= new Wood();
        numberOfGoldCoinNeeded=0;
        numberOfNeededBuildingMaterial=3;
        numberOfWorkerNeeded=1;
        whatCanBeHarvested=new Wood();
    }
}
