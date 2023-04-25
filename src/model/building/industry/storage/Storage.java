package model.building.industry.storage;

import model.map.Cell;
import model.building.generalTypes.AllStorages;
import model.resources.Resource;
import model.resources.primaryMaterials.Iron;
import model.resources.primaryMaterials.Wood;

import java.util.ArrayList;

public class Storage extends AllStorages {

    private static int maxGeneralStoringCapacity;
    private int capacity;
    public Storage(Cell cell) {
        super(cell);
    }


}
