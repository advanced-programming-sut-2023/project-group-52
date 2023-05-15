package model.building.CastleBuilding.recruitment;

import model.map.Cell;
import model.resources.primaryMaterials.Stone;

public class Barrack extends RecruitmentPlace{
    public Barrack(Cell cell) {
        super(cell);
        neededBuildingMaterial= new Stone();
        numberOfGoldCoinNeeded=0;
        numberOfNeededBuildingMaterial=15;
    }
}
