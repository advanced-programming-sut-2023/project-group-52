package model.animal;

import model.Government;
import model.people.Troop;
import model.map.Cell;

public class Horse extends Animal{
    public Troop owner;

    public Horse(Cell currentCell, Government ownerGovernment, Troop owner) {
        super(currentCell, ownerGovernment);
        this.owner = owner;
    }
}
