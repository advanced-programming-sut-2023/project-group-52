package model;

import model.building.Building;
import model.troops.Troop;

import java.util.ArrayList;

public class Cell {
    private int xCordinate;
    private int yCordinate;
    private ArrayList<Building> allBuildings;
    private ArrayList<Troop> allTroops;
    private Ground ground;

    public Cell(int xCordinate, int yCordinate, Ground ground) {
        this.xCordinate = xCordinate;
        this.yCordinate = yCordinate;
        this.ground = ground;
    }
    public void addTroop(Troop newtroop){
        allTroops.add(newtroop);
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
}
