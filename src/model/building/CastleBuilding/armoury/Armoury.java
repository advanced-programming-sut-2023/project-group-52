package model.building.CastleBuilding.armoury;

import model.map.Cell;
import model.building.generalTypes.AllStorages;
import model.resources.manufacturedResource.troopsItems.Weopens;
import model.resources.primaryMaterials.Stone;
import model.resources.primaryMaterials.Wood;

import java.util.ArrayList;

public class Armoury extends AllStorages {
    protected ArrayList<Weopens> allResources;

    public Armoury(Cell cell) {
        super(cell);
        allResources=new ArrayList<>();
        neededBuildingMaterial= new Wood();
        numberOfGoldCoinNeeded=0;
        numberOfNeededBuildingMaterial=5;
    }
}
