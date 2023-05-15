package model.building.CastleBuilding.towers;

import model.map.Cell;
import model.building.Building;

public class Tower extends Building {
    protected int fireRange;
    protected int defendRange;

    public Tower(Cell cell) {
        super(cell);
    }

    public int getFireRange() {
        return fireRange;
    }

    public int getDefendRange() {
        return defendRange;
    }
}
