package model.building.farmBuilding.cropFarm.ofFarm;

import model.building.farmBuilding.cropFarm.CropFarm;
import model.map.Cell;
import model.resources.primaryMaterials.Apple;
import model.resources.primaryMaterials.Crop;
import model.resources.primaryMaterials.Of;
import model.resources.primaryMaterials.Wood;

public class ofFarm extends CropFarm {
    public ofFarm(Cell cell) {
        super(cell);
        whatCanBeHarvested=new Of();
        crop=(Of) whatCanBeHarvested;
        whatCanBeHarvested=new Apple();
        neededBuildingMaterial=new Wood();
        numberOfNeededBuildingMaterial=15;
        numberOfWorkerNeeded=1;
    }
}
