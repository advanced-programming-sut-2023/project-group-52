package model.building.CastleBuilding.towers;

import model.map.Cell;
import model.resources.primaryMaterials.Stone;

public class LookoutTower extends Tower{
    public LookoutTower(Cell cell) {
        super(cell);
        neededBuildingMaterial= new Stone();
        numberOfGoldCoinNeeded=0;
        numberOfNeededBuildingMaterial=20;
    }
}
