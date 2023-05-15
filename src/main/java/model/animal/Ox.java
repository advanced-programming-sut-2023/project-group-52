package model.animal;

import model.Government;
import model.building.industry.oxTether.OxTether;
import model.map.Cell;
import model.resources.primaryMaterials.Stone;

import java.util.ArrayList;

public class Ox extends Animal{
    private static int maxNumberOfStonesThatCanCarry=12;
    private int numberOfStonesCarrying;
    private ArrayList<Stone> carriedStoneByThisOx;
    private OxTether itsOriginOxTether;


    public Ox(Cell currentCell, Government ownerGovernment, OxTether itsOriginOxTether) {
        super(currentCell, ownerGovernment);
        this.itsOriginOxTether = itsOriginOxTether;
        carriedStoneByThisOx=new ArrayList<>();
        numberOfStonesCarrying=0;
    }
    public void addStone(){
        numberOfStonesCarrying+=1;
    }
    public Boolean canCarryMoreStone(){
        return !(numberOfStonesCarrying==maxNumberOfStonesThatCanCarry);
    }
}
