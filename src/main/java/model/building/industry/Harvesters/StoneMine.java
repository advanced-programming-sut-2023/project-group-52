package model.building.industry.Harvesters;

import model.animal.Animal;
import model.animal.Ox;
import model.building.generalTypes.Harvester;
import model.map.Cell;
import model.map.Ground;
import model.resources.primaryMaterials.Iron;
import model.resources.primaryMaterials.Stone;
import model.resources.primaryMaterials.Wood;

import java.util.ArrayList;

public class StoneMine extends Harvester {
    private int capacity;
    public StoneMine(Cell cell) {
        super(cell);
        neededBuildingMaterial= new Wood();
        numberOfGoldCoinNeeded=0;
        numberOfNeededBuildingMaterial=20;
        numberOfWorkerNeeded=2;
        whatCanBeHarvested=new Iron();
    }
    public int stoneCounter(){
        return 0;
    }
    public boolean isHereFull(){
        return storedHarvestedMaterials.size()==capacity;
    }
    public void giveStoneToHereOxes(){
        for(Animal animal:cell.getAllAnimals()){
            if(animal instanceof Ox &&
            animal.getOwnerGovernment().equals(ownerGovernment)){
                Ox ox=(Ox)animal;
                while (ox.canCarryMoreStone()){
                    ox.addStone();
                    storedHarvestedMaterials.remove(storedHarvestedMaterials.get(storedHarvestedMaterials.size()-1));
                }
            }
        }
    }

}
