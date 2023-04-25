package model.building.CastleBuilding.stonegateHouses;

import model.map.Cell;

public class SmallStoneGateHouse extends StoneGatehouse {
    public SmallStoneGateHouse(Cell cell) {
        super(cell);
        neededBuildingMaterial=null;
        numberOfGoldCoinNeeded=0;
        numberOfNeededBuildingMaterial=0;
    }
}
