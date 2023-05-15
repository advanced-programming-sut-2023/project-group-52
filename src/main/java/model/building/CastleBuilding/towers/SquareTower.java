package model.building.CastleBuilding.towers;

import model.map.Cell;
import model.resources.manufacturedResource.troopsItems.Weopens;
import model.resources.primaryMaterials.Stone;

import java.util.ArrayList;

public class SquareTower extends PerimeterTower{
    protected ArrayList<Weopens> allMountedSiegeEquipment;
    public SquareTower(Cell cell) {
        super(cell);
        neededBuildingMaterial= new Stone();
        numberOfGoldCoinNeeded=0;
        numberOfNeededBuildingMaterial=35;
        allMountedSiegeEquipment=new ArrayList<>();
    }
}
