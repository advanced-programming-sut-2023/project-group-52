package model.building.foodProcessingBuildings.appleGarden;

import model.building.generalTypes.Harvester;
import model.map.Cell;
import model.resources.primaryMaterials.Apple;
import model.resources.primaryMaterials.Wood;

public class AppleGarden extends Harvester {
    public AppleGarden(Cell cell) {
        super(cell);
        whatCanBeHarvested=new Apple();
        neededBuildingMaterial=new Wood();
        numberOfNeededBuildingMaterial=5;
        numberOfWorkerNeeded=1;
    }
    public void plantingApples(){

    }
}
