package model.building.farmBuilding.diaryFarmer;

import model.building.generalTypes.Manufacturer;
import model.map.Cell;
import model.resources.manufacturedResource.Cheese;
import model.resources.manufacturedResource.ManufacturedProducts;
import model.resources.manufacturedResource.troopsItems.LeatherArmour;
import model.resources.primaryMaterials.Wood;

public class DiaryFarmer extends Manufacturer {
    private static ManufacturedProducts secondManufacturedProducts=new LeatherArmour();
    public DiaryFarmer(Cell cell) {
        super(cell);
        neededBuildingMaterial=new Wood();
        manufacturedProducts=new Cheese();
        numberOfNeededBuildingMaterial=10;
        numberOfWorkerNeeded=1;
    }
    public void manufacture(String name){
        String cheeseName ="cheese";
        if(name.equals(cheeseName)) {
            //toDO
        }
        else {

        }
    }
}
