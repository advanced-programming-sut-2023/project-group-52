package model.building.CastleBuilding.recruitment;

import model.building.Building;
import model.map.Cell;
import model.resources.manufacturedResource.troopsItems.Weopens;

import java.util.ArrayList;

public class RecruitmentPlace extends Building {
    protected int numberOfVillagersNeeded;
    protected ArrayList<Weopens> weopensNeeded;

    public RecruitmentPlace(Cell cell) {
        super(cell);
    }
}
