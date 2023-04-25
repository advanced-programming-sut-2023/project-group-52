package model.building.CastleBuilding.seigeTent;

import model.building.Building;
import model.map.Cell;
import model.people.Engineer;
import model.resources.manufacturedResource.troopsItems.Arrow;
import model.resources.primaryMaterials.Wood;

public class SeigeTent extends Building {
    private Engineer leadEngineer;
    public SeigeTent(Cell cell, Engineer engineer) {
        super(cell);
        numberOfWorkerNeeded=1;
        leadEngineer=engineer;
    }
}
