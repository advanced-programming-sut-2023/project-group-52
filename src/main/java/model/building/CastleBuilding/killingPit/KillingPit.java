package model.building.CastleBuilding.killingPit;

import model.map.Cell;
import model.people.Troop;
import model.building.Building;
import model.resources.primaryMaterials.Wood;

public class KillingPit extends Building {
    private static int damage=-10000;
    public KillingPit(Cell cell) {
        super(cell);
        neededBuildingMaterial= new Wood();
        numberOfGoldCoinNeeded=0;
        numberOfNeededBuildingMaterial=6;
    }
    public void damageATrooper(Troop troop){
        troop.getHurt(damage);
    }
}
