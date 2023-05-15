package model.building.foodProcessingBuildings.brewer;

import model.building.generalTypes.Manufacturer;
import model.map.Cell;
import model.resources.manufacturedResource.Bread;
import model.resources.manufacturedResource.Wine;
import model.resources.primaryMaterials.Of;
import model.resources.primaryMaterials.Wheat;
import model.resources.primaryMaterials.Wood;

public class Brewer extends Manufacturer{
    public Brewer(Cell cell) {
        super(cell);
        ingredient=new Wheat();
        manufacturedProducts=new Wine();
        neededBuildingMaterial=new Wood();
        numberOfNeededBuildingMaterial=10;
        numberOfWorkerNeeded=1;
    }
}
