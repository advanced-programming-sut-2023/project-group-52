package model.building.CastleBuilding.towers;

import model.map.Cell;
import model.resources.primaryMaterials.Stone;

public class DefensiveTurret extends PerimeterTower{
    public DefensiveTurret(Cell cell) {
        super(cell);
        numberOfNeededBuildingMaterial=15;
    }
}
