package model.building.weopenCrafting.blacksmith;

import model.building.generalTypes.Manufacturer;
import model.building.weopenCrafting.WeopenCrafter;
import model.map.Cell;
import model.resources.primaryMaterials.PrimaryMaterials;
import model.resources.primaryMaterials.Wood;

public class Blacksmith extends WeopenCrafter {
    public Blacksmith(Cell cell) {
        super(cell);
        neededBuildingMaterial=new Wood();
        numberOfGoldCoinNeeded=100;
        numberOfNeededBuildingMaterial=20;
        numberOfWorkerNeeded=1;
    }
    public void manufacture(String name){
        String nameSword="sword";
        String nameClub="club";
        if(name.equals(nameSword)){
            //toDo

        }
        else {
            //toDo
        }
    }
}
