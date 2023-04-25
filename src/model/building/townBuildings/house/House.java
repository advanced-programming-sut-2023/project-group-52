package model.building.townBuildings.house;

import model.building.Building;
import model.map.Cell;
import model.resources.primaryMaterials.Iron;
import model.resources.primaryMaterials.Wood;

public class House extends Building {
    public House(Cell cell) {
        super(cell);
        ownerGovernment.changeMaxPopularity(8);
        neededBuildingMaterial= new Wood();
        numberOfNeededBuildingMaterial=6;
    }
}
