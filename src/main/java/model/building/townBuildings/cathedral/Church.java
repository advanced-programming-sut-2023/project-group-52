package model.building.townBuildings.cathedral;

import model.building.Building;
import model.building.CastleBuilding.recruitment.Barrack;
import model.map.Cell;
import model.resources.primaryMaterials.Iron;
import model.resources.primaryMaterials.Wood;

public class Church extends Building {
    private int popularityIncrease;

    public Church(Cell cell) {
        super(cell);
        numberOfGoldCoinNeeded=250;
        ownerGovernment.addpopularity(2);
    }
}
