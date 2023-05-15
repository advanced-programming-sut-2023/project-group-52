package model.animal;

import model.Government;
import model.people.Troop;
import model.map.Cell;

public class WarDog extends Animal {


    private static int damage;
    private Boolean isItFree;

    public WarDog(Cell currentCell, Government ownerGovernment) {
        super(currentCell, ownerGovernment);
        isItFree = false;
    }

    public void getFree() {
        isItFree = true;
    }

    public Cell getCellOfNearestEnemy() {
        Cell resultCell = null;
        int minDistance = 1000000000;
        for (Cell cell : map.getAllCells()) {
            if (!cell.equals(currentCell) &&
                    map.distanceBetweenThisTwoCells(currentCell, cell) < minDistance &&
                    cell.isAnOpponentTrooperHere(ownerGovernment)) resultCell = cell;
        }
        return resultCell;
    }

    public void damageTroop(Troop troop) {
        troop.getHurt(damage);
    }
    public void hunt(){
        this.getFree();

    }
}
