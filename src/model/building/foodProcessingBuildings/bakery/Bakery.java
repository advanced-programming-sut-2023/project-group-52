package model.building.foodProcessingBuildings.bakery;

import model.building.generalTypes.Manufacturer;
import model.map.Cell;
import model.resources.manufacturedResource.Bread;
import model.resources.manufacturedResource.troopsItems.Armour;
import model.resources.primaryMaterials.Of;
import model.resources.primaryMaterials.Wood;

public class Bakery extends Manufacturer {

    public Bakery(Cell cell) {
        super(cell);
        ingredient=new Of();
        manufacturedProducts=new Bread();
        neededBuildingMaterial=new Wood();
        numberOfNeededBuildingMaterial=10;
        numberOfWorkerNeeded=1;
    }
}
