package model.map;

import model.map.Cell;

import java.util.ArrayList;

public class Map {
    ArrayList<Cell> allCells;
    private int length;
    private int height;


    public Map(int length, int height) {
        this.length = length;
        this.height = height;
        allCells=new ArrayList<>();
        for(int i=0;i<length;i++){
            for (int j=0;j<height;j++){
                allCells.add(new Cell(i,j,null,this));
            }
        }
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public Cell getCellByCordinat(int x, int y){
        for (Cell cell:allCells){
            if(cell.getXCordinate()==x && cell.getYCordinate()==y) return cell;
        }
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
