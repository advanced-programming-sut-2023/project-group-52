package model.building.CastleBuilding.towers;

import model.map.Cell;
import model.resources.primaryMaterials.Stone;

public class CircleTower extends SquareTower{
    public CircleTower(Cell cell) {
        super(cell);
        neededBuildingMaterial= new Stone();
        numberOfGoldCoinNeeded=0;
        numberOfNeededBuildingMaterial=40;
    }
}
