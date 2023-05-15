package model.building.CastleBuilding.recruitment;

import model.map.Cell;
import model.resources.primaryMaterials.Stone;
import model.resources.primaryMaterials.Wood;

public class EngineerGuild extends RecruitmentPlace{
    public EngineerGuild(Cell cell) {
        super(cell);
        neededBuildingMaterial= new Wood();
        numberOfGoldCoinNeeded=100;
        numberOfNeededBuildingMaterial=10;
    }
}
