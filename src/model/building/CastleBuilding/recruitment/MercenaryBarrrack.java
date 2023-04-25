package model.building.CastleBuilding.recruitment;

import model.map.Cell;
import model.resources.primaryMaterials.Stone;
import model.resources.primaryMaterials.Wood;

public class MercenaryBarrrack extends RecruitmentPlace{
    public MercenaryBarrrack(Cell cell) {
        super(cell);
        neededBuildingMaterial= new Wood();
        numberOfGoldCoinNeeded=0;
        numberOfNeededBuildingMaterial=10;
    }
}
