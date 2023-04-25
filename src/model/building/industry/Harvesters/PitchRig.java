package model.building.industry.Harvesters;

import model.building.generalTypes.Harvester;
import model.map.Cell;
import model.map.Ground;
import model.resources.primaryMaterials.Iron;
import model.resources.primaryMaterials.Pitch;
import model.resources.primaryMaterials.Wood;

public class PitchRig extends Harvester {
    public PitchRig(Cell cell) {
        super(cell);
        onlySuitableGround= Ground.PLAIN;
        neededBuildingMaterial= new Wood();
        numberOfGoldCoinNeeded=0;
        numberOfNeededBuildingMaterial=20;
        numberOfWorkerNeeded=1;
        whatCanBeHarvested=new Pitch();
    }
}
