package model.building.CastleBuilding.oilSmelter;

import model.people.Engineer;
import model.building.weopenCrafting.WeopenCrafter;
import model.map.Cell;
import model.resources.manufacturedResource.OilSmelt;
import model.resources.manufacturedResource.troopsItems.Arrow;
import model.resources.primaryMaterials.Wood;

public class OilSmelter extends WeopenCrafter {
    private Engineer leadEngineer;
    public OilSmelter(Cell cell,Engineer leadEngineer) {
        super(cell);
        manufacturedTroopsItem=new OilSmelt();
        neededBuildingMaterial=new Wood();
        numberOfGoldCoinNeeded=100;
        numberOfNeededBuildingMaterial=10;
        typeOfNeededPerson=new Engineer(ownerGovernment);
        this.leadEngineer=leadEngineer;
    }

}
