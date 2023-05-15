package model.building.townBuildings.cathedral;

import model.building.Building;
import model.map.Cell;

public class Cathedral extends Church {
    public Cathedral(Cell cell) {
        super(cell);
        numberOfGoldCoinNeeded=1000;

    }
}
