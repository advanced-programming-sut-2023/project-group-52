package model.building.foodProcessingBuildings.inn;

import model.map.Cell;
import model.people.Person;
import model.building.Building;
import model.resources.primaryMaterials.Wood;

public class Inn extends Building {
    private int popularityRate;
    private int wineUsageRate;
    public Inn(Cell cell) {
        super(cell);
        neededBuildingMaterial= new Wood();
        numberOfGoldCoinNeeded=100;
        numberOfNeededBuildingMaterial=20;
        numberOfWorkerNeeded=1;

    }
    public void giveWineTo(Person person){

    }
}
