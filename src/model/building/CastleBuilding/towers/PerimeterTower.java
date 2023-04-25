package model.building.CastleBuilding.towers;

import model.map.Cell;
import model.resources.primaryMaterials.Stone;

public class PerimeterTower extends Tower{

    public PerimeterTower(Cell cell) {
        super(cell);
        neededBuildingMaterial= new Stone();
        numberOfGoldCoinNeeded=0;
        numberOfNeededBuildingMaterial=10;
    }
}
