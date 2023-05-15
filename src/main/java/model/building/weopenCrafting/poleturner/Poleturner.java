package model.building.weopenCrafting.poleturner;

import model.building.weopenCrafting.WeopenCrafter;
import model.map.Cell;
import model.resources.manufacturedResource.troopsItems.Arrow;
import model.resources.primaryMaterials.PrimaryMaterials;
import model.resources.primaryMaterials.Wood;

public class Poleturner extends WeopenCrafter {
    private static PrimaryMaterials secondIngredient=new Wood();
    public Poleturner(Cell cell) {
        super(cell);
        manufacturedTroopsItem=new Arrow();
        neededBuildingMaterial=new Wood();
        numberOfGoldCoinNeeded=100;
        numberOfNeededBuildingMaterial=10;
        numberOfWorkerNeeded=1;

    }
}
