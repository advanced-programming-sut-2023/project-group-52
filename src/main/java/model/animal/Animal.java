package model.animal;

import model.Government;
import model.map.Cell;
import model.map.Map;

public class Animal {
    protected Government ownerGovernment;
    protected Cell currentCell;
    protected Map map;

    public Animal(Cell currentCell,Government ownerGovernment) {
        this.currentCell = currentCell;
        map=currentCell.getMap();
        this.ownerGovernment=currentCell.getOwnerGovernment();
    }

    public void setCell(Cell cell) {
        currentCell = cell;
    }

    public Government getOwnerGovernment() {
        return ownerGovernment;
    }

    public Cell getCurrentCell() {
        return currentCell;
    }
}
