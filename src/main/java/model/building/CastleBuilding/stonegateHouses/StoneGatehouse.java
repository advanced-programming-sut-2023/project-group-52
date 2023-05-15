package model.building.CastleBuilding.stonegateHouses;

import model.map.Cell;
import model.building.Building;

public class StoneGatehouse extends Building {
    private int maxOfLivingVillagers;

    public StoneGatehouse(Cell cell) {
        super(cell);
    }
    public boolean isHereFull(){
        return allPeople.size()==maxOfLivingVillagers;
    }
}
