package model.map;

import model.Government;
import model.animal.Animal;
import model.people.Person;
import model.building.Building;
import model.people.Troop;

import java.util.ArrayList;

public class Cell {
    private Map map;
    private int xCordinate;
    private int yCordinate;
    private Building building;
    private ArrayList<Person> allPeopleInOneCell;
    private ArrayList<Animal> allAnimals;
    private Ground ground;
    private Government ownerGovernment;

    public Cell(int xCordinate, int yCordinate, Ground ground, Map map) {
        this.map = map;
        this.xCordinate = xCordinate;
        this.yCordinate = yCordinate;
        this.ground = ground;
        allPeopleInOneCell=new ArrayList<>();
    }

    public ArrayList<Animal> getAllAnimals() {
        return allAnimals;
    }

    public void addTroop(Troop newperson) {
        allPeopleInOneCell.add(newperson);
    }

    public int getXCordinate() {
        return xCordinate;
    }

    public int getYCordinate() {
        return yCordinate;
    }

    public Ground getGround() {
        return ground;
    }

    public void setGround(Ground ground) {
        this.ground = ground;
    }

    public Boolean isThereABuildingHere() {
        return building != null;
    }

    public Map getMap() {
        return map;
    }
    public Government getOwnerGovernment() {
        return ownerGovernment;
    }
    public boolean isAnOpponentTrooperHere(Government myGovernment){
        for(Person person:allPeopleInOneCell){
            if(!person.getGovernment().equals(myGovernment)) return true;
        }
        return false;
    }

    public int getxCordinate() {
        return xCordinate;
    }

    public int getyCordinate() {
        return yCordinate;
    }

    public Building getBuilding() {
        return building;
    }

    public ArrayList<Person> getAllPeopleInOneCell() {
        return allPeopleInOneCell;
    }
    public void show(){

    }
}
