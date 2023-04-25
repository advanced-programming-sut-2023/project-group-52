package model.building.farmBuilding.cropFarm.wheatFarmer;

import model.building.farmBuilding.cropFarm.CropFarm;
import model.map.Cell;
import model.resources.primaryMaterials.Apple;
import model.resources.primaryMaterials.Crop;
import model.resources.primaryMaterials.Wheat;
import model.resources.primaryMaterials.Wood;

public class WheatFarmer extends CropFarm {
    public WheatFarmer(Cell cell) {
        super(cell);
        whatCanBeHarvested = new Wheat();
        crop = (Wheat) whatCanBeHarvested;
        neededBuildingMaterial = new Wood();
        numberOfNeededBuildingMaterial = 15;
        numberOfWorkerNeeded = 1;
    }
}
