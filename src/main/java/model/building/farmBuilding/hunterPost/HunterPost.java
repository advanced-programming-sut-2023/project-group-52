package model.building.farmBuilding.hunterPost;

import model.building.Building;
import model.map.Cell;
import model.map.Map;
import model.resources.manufacturedResource.Cheese;
import model.resources.primaryMaterials.Meat;
import model.resources.primaryMaterials.Wood;

import java.util.ArrayList;

public class HunterPost extends Building {
    private static int rate;
    private ArrayList<Meat> allMeats;

    public HunterPost(Cell cell) {
        super(cell);
        neededBuildingMaterial=new Wood();
        numberOfNeededBuildingMaterial=5;
        numberOfWorkerNeeded=1;
    }
    public void removeProcessedMeat(){
        for(int i=allMeats.size()-1;i>=0;i--){
            if(allMeats.get(i).isItprocessed()){
                allMeats.remove(i);
            }
        }
    }
    public void prossetion(){
        int counter=0;
        for(Meat meat:allMeats){
            if(!meat.isItprocessed()){
                meat.setItprocessed();
                counter+=1;
            }
            if(counter==rate){
                return;
            }
        }
    }
}
