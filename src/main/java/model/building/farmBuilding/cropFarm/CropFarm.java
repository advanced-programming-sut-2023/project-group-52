package model.building.farmBuilding.cropFarm;

import model.building.Building;
import model.building.generalTypes.Harvester;
import model.map.Cell;
import model.resources.primaryMaterials.Crop;

import java.util.ArrayList;

public class CropFarm extends Harvester {
    protected Crop crop;
    protected ArrayList<Crop> notGrownPlants;
    protected Building theNextThatWillThisResourceGo;
    public CropFarm(Cell cell) {
        super(cell);
        notGrownPlants=new ArrayList<>();
        crop=(Crop) whatCanBeHarvested;
    }

    public void plantingApples(){
        notGrownPlants.add(crop);
    }
    public int numberOfGrownCrops(){
        int result=0;
        for(Crop crop:notGrownPlants){
            if(crop.getItGrownUp()) result+=1;
        }
        return result;
    }
    public void removeGrownCrop(){
        for(int i=notGrownPlants.size()-1;i>=0;i--){
            if(notGrownPlants.get(i).getItGrownUp()){
                notGrownPlants.remove(i);
            }
        }
    }
}
