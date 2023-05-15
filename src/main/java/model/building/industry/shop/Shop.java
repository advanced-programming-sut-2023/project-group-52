package model.building.industry.shop;

import model.map.Cell;
import model.building.Building;
import model.resources.primaryMaterials.Wood;

public class Shop extends Building {
    public Shop(Cell cell) {
        super(cell);
        neededBuildingMaterial= new Wood();
        numberOfGoldCoinNeeded=0;
        numberOfNeededBuildingMaterial=5;
        numberOfWorkerNeeded=1;
    }
}
