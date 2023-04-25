package model.building.farmBuilding.cropFarm.appleGarden;

import model.building.farmBuilding.cropFarm.CropFarm;
import model.map.Cell;
import model.resources.primaryMaterials.Apple;
import model.resources.primaryMaterials.Crop;
import model.resources.primaryMaterials.Wood;

public class AppleGarden extends CropFarm {
    public AppleGarden(Cell cell) {
        super(cell);
        whatCanBeHarvested=new Apple();
        crop=(Apple) whatCanBeHarvested;
        neededBuildingMaterial=new Wood();
        numberOfNeededBuildingMaterial=5;
        numberOfWorkerNeeded=1;
    }
    public void plantingApples(){

    }
}
