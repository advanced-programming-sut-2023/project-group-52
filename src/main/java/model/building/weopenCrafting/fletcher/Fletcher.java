package model.building.weopenCrafting.fletcher;

import model.building.weopenCrafting.WeopenCrafter;
import model.map.Cell;
import model.resources.manufacturedResource.troopsItems.Armour;
import model.resources.manufacturedResource.troopsItems.Arrow;
import model.resources.primaryMaterials.Wood;

public class Fletcher extends WeopenCrafter {
    public Fletcher(Cell cell) {
        super(cell);
        ingredient=new Wood();
        manufacturedTroopsItem=new Arrow();
        neededBuildingMaterial=new Wood();
        numberOfGoldCoinNeeded=100;
        numberOfNeededBuildingMaterial=10;
        numberOfWorkerNeeded=1;
    }
}
