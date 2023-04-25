package model.building.weopenCrafting.armoury;

import model.building.generalTypes.Manufacturer;
import model.building.weopenCrafting.WeopenCrafter;
import model.map.Cell;
import model.resources.manufacturedResource.troopsItems.Armour;
import model.resources.primaryMaterials.Wood;

public class Armoury extends WeopenCrafter {

    public Armoury(Cell cell) {
        super(cell);
        manufacturedTroopsItem=new Armour();
        neededBuildingMaterial=new Wood();
        numberOfGoldCoinNeeded=100;
        numberOfNeededBuildingMaterial=20;
        numberOfWorkerNeeded=1;
    }
}
