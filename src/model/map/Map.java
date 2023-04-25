package model.map;

import model.map.Cell;

import java.util.ArrayList;

public class Map {
    ArrayList<Cell> allCells;

    public Map() {

    }
    public Cell getCellByCordinat(int x,int y){
        return null;
    }
    public int distanceBetweenThisTwoCells(Cell cell1,Cell cell2){
        int xDistance=Math.abs(cell1.getXCordinate()-cell2.getXCordinate());
        int yDistance=Math.abs(cell1.getYCordinate()-cell2.getYCordinate());
        return xDistance+yDistance;
    }

    public ArrayList<Cell> getAllCells() {
        return allCells;
    }
}
