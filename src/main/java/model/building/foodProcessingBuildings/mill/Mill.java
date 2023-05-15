package model.building.foodProcessingBuildings.mill;

import model.map.Cell;
import model.building.generalTypes.Manufacturer;
import model.resources.manufacturedResource.Flour;
import model.resources.primaryMaterials.Stone;
import model.resources.primaryMaterials.Wheat;
import model.resources.primaryMaterials.Wood;

public class Mill extends Manufacturer {
    public Mill(Cell cell) {
        super(cell);
        neededBuildingMaterial= new Wood();
        numberOfGoldCoinNeeded=0;
        numberOfNeededBuildingMaterial=20;
        ingredient=new Wheat();
        manufacturedProducts=new Flour();
        numberOfWorkerNeeded=3;

    }
}
