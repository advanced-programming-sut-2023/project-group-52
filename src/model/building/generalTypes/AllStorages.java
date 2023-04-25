package model.building.generalTypes;

import model.building.Building;
import model.map.Cell;
import model.resources.Resource;

import java.util.ArrayList;

public class AllStorages extends Building {
    protected int capacity;
    protected ArrayList<Resource> allResources;

    public AllStorages(Cell cell) {
        super(cell);
        ownerGovernment.addStorage(capacity);
    }
    public Boolean doesThisStorageHaveCapacity(){
        return !(capacity==allResources.size());
    }

    public boolean doWeHaveEnoughOFThisResource(Resource resource, int count){
        return true;
    }
    public void addResource(Resource resource,int count){

    }
    public void spendResource(Resource resource,int count){

    }

    public int getCapacity() {
        return capacity;
    }
}
