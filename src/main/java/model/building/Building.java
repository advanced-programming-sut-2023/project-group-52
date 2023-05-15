package model.building;

import model.Government;
import model.map.Cell;
import model.map.Ground;
import model.people.Person;
import model.people.Troop;
import model.map.Map;
import model.resources.primaryMaterials.PrimaryMaterials;


import java.util.ArrayList;

public class Building {
    protected static Map map;
    protected Government ownerGovernment;
    protected Cell cell;
    protected Person typeOfNeededPerson;
    protected Ground onlySuitableGround;
    protected int hp;
    protected int maxHp;
    protected int numberOfWorkerNeeded;
    protected ArrayList<Person> allPeopleInOneBuilding;
    protected PrimaryMaterials neededBuildingMaterial;
    protected int numberOfNeededBuildingMaterial;
    protected int numberOfGoldCoinNeeded;
    protected boolean canTroopJustPassIt;
    protected boolean isVisibleForOpponentTroop;

    public Building(Cell cell) {
        this.cell = cell;
        ownerGovernment=cell.getOwnerGovernment();
        onlySuitableGround=null;
        allPeopleInOneBuilding=new ArrayList<>();
        canTroopJustPassIt=false;
        isVisibleForOpponentTroop=true;
        numberOfWorkerNeeded=0;
        typeOfNeededPerson=null;
    }

    public void getRepaired(){

    }
    public void getDamagedByTroop(Troop troop){

    }

    public Ground getOnlySuitableGround() {
        return onlySuitableGround;
    }

    public int getHp() {
        return hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public Cell getCell() {
        return cell;
    }

    public int getNumberOfWorkerNeeded() {
        return numberOfWorkerNeeded;
    }

    public ArrayList<Person> getAllPeople() {
        return allPeopleInOneBuilding;
    }

    public PrimaryMaterials getNeededBuildingMaterial() {
        return neededBuildingMaterial;
    }

    public int getNumberOfNeededBuildingMaterial() {
        return numberOfNeededBuildingMaterial;
    }

    public int getNumberOfGoldCoinNeeded() {
        return numberOfGoldCoinNeeded;
    }

    public boolean isCanTroopJustPassIt() {
        return canTroopJustPassIt;
    }

    public boolean isVisibleForOpponentTroop() {
        return isVisibleForOpponentTroop;
    }
}
