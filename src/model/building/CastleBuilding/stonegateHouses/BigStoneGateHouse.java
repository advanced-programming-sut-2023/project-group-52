package model.building.CastleBuilding.stonegateHouses;

import model.map.Cell;
import model.resources.primaryMaterials.Stone;

public class BigStoneGateHouse extends StoneGatehouse {
    public BigStoneGateHouse(Cell cell) {
        super(cell);
        neededBuildingMaterial= new Stone();
        numberOfGoldCoinNeeded=0;
        numberOfNeededBuildingMaterial=20;
    }
}
